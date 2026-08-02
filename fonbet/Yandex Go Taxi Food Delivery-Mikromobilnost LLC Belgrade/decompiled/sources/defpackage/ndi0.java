package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.g;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class ndi0 {
    public long a;
    public final Object b;
    public Object c;

    public ndi0(b bVar, String str, long j) {
        this.c = bVar;
        cvw.i(str);
        this.b = str;
        this.a = bVar.rh(-1L, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)});
    }

    public static ndi0 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new ndi0(str, (String) null, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ndi0(jSONObject.getString(AuthSdkActivity.RESPONSE_TYPE_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(ClidProvider.TIMESTAMP));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    public static void h(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        ny61.v(oyr.p("Failed to delete '", file.getAbsolutePath(), "'"));
    }

    public static File i(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        ny61.g("split ID cannot be placed in target directory");
        return null;
    }

    public static void j(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            ny61.g("File input must be directory when it exists.");
        } else {
            file.mkdirs();
            if (file.isDirectory()) {
                return;
            }
            ny61.v("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
        }
    }

    public long a() {
        return this.a;
    }

    public void c(ii10 ii10Var, q7v q7vVar, Map map, long j) {
        mdi0 mdi0Var = (mdi0) this.c;
        long j2 = mdi0Var.a;
        LinkedHashMap linkedHashMap = (LinkedHashMap) mdi0Var.c;
        if (j > j2) {
            Object remove = linkedHashMap.remove(ii10Var);
            if (remove != null) {
                mdi0Var.b = mdi0Var.b() - mdi0Var.c(ii10Var, remove);
                mdi0Var.a(ii10Var, remove, null);
            }
            ((tdi0) this.b).b(ii10Var, q7vVar, map, j);
            return;
        }
        kdi0 kdi0Var = new kdi0(q7vVar, map, j);
        Object put = linkedHashMap.put(ii10Var, kdi0Var);
        mdi0Var.b = mdi0Var.c(ii10Var, kdi0Var) + mdi0Var.b();
        if (put != null) {
            mdi0Var.b = mdi0Var.b() - mdi0Var.c(ii10Var, put);
            mdi0Var.a(ii10Var, put, kdi0Var);
        }
        mdi0Var.d(mdi0Var.a);
    }

    public void d(long j) {
        mdi0 mdi0Var = (mdi0) this.c;
        mdi0Var.a = j;
        mdi0Var.d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public List e() {
        ArrayList arrayList;
        b bVar = (b) this.c;
        ArrayList arrayList2 = new ArrayList();
        String str = (String) this.b;
        Cursor cursor = null;
        try {
            try {
                cursor = bVar.vh().query("raw_events", new String[]{"rowid", "name", ClidProvider.TIMESTAMP, "metadata_fingerprint", Constants.KEY_DATA, "realtime"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.a)}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        long j = cursor.getLong(0);
                        long j2 = cursor.getLong(3);
                        boolean z = cursor.getLong(5) == 1;
                        byte[] blob = cursor.getBlob(4);
                        if (j > this.a) {
                            this.a = j;
                        }
                        try {
                            y7a1 y7a1Var = (y7a1) f3a1.th(e0.B(), blob);
                            String string = cursor.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            y7a1Var.d();
                            ((e0) y7a1Var.b).H(string);
                            long j3 = cursor.getLong(2);
                            y7a1Var.d();
                            ((e0) y7a1Var.b).I(j3);
                            arrayList2.add(new e791(j, j2, z, (e0) y7a1Var.f()));
                        } catch (IOException e) {
                            y1a1 y1a1Var = ((g) bVar.b).y;
                            g.g(y1a1Var);
                            y1a1Var.z.c("Data loss. Failed to merge raw event. appId", y1a1.Og(str), e);
                        }
                    } while (cursor.moveToNext());
                } else {
                    arrayList = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                y1a1 y1a1Var2 = ((g) bVar.b).y;
                g.g(y1a1Var2);
                y1a1Var2.z.c("Data loss. Error querying raw events batch. appId", y1a1.Og(str), e2);
                arrayList = arrayList2;
            }
            return arrayList;
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public HashSet f() {
        File file = new File(l(), "verified-splits");
        j(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && !file2.canWrite()) {
                    hashSet.add(new a891(file2, file2.getName().substring(0, r4.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public void g() {
        File k = k();
        String[] list = k.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.a))) {
                    File file = new File(k, str);
                    file.toString();
                    h(file);
                }
            }
        }
    }

    public File k() {
        if (((File) this.c) == null) {
            Context context = (Context) this.b;
            if (context == null) {
                ny61.r("context must be non-null to populate null filesDir");
                return null;
            }
            this.c = context.getFilesDir();
        }
        File file = new File((File) this.c, "splitcompat");
        j(file);
        return file;
    }

    public File l() {
        File file = new File(k(), Long.toString(this.a));
        j(file);
        return file;
    }

    public ndi0(b bVar, String str) {
        this.c = bVar;
        cvw.i(str);
        this.b = str;
        this.a = -1L;
    }

    public ndi0(Context context) {
        this.b = context;
        this.a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public ndi0(long j, tdi0 tdi0Var) {
        this.a = j;
        this.b = tdi0Var;
        this.c = new mdi0(this, j);
    }

    public ndi0(String str, String str2, long j) {
        this.b = str;
        this.c = str2;
        this.a = j;
    }
}
