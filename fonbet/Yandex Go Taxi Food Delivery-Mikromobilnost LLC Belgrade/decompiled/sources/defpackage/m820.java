package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.cprocsp.ACSP.tools.common.CSPDirectoryConstants;

/* loaded from: classes.dex */
public final class m820 {
    public static final Charset b = Charset.forName("UTF-8");
    public final q1r a;

    public m820(q1r q1rVar) {
        this.a = q1rVar;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    public static ArrayList b(String str) {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(cwk0.a(jSONArray.getString(i)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(cwk0.a.k(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", b64.l("Deleted corrupt file: ", file.getAbsolutePath(), "\nReason: ", str), null);
        }
    }

    public final Map c(String str, boolean z) {
        FileInputStream fileInputStream;
        q1r q1rVar = this.a;
        File c = z ? q1rVar.c(str, "internal-keys") : q1rVar.c(str, CSPDirectoryConstants.SUBDIRECTORY_KEYS);
        if (!c.exists() || c.length() == 0) {
            g(c, "The file has a length of zero for session: " + str);
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(c);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            HashMap a = a(CommonUtils.j(fileInputStream));
            CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
            return a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            f(c);
            CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
            return Collections.EMPTY_MAP;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    public final String d(String str) {
        FileInputStream fileInputStream;
        File c = this.a.c(str, "user-data");
        Closeable closeable = null;
        if (c.exists()) {
            ?? r9 = (c.length() > 0L ? 1 : (c.length() == 0L ? 0 : -1));
            try {
                if (r9 != 0) {
                    try {
                        fileInputStream = new FileInputStream(c);
                        try {
                            JSONObject jSONObject = new JSONObject(CommonUtils.j(fileInputStream));
                            String optString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception unused) {
                            f(c);
                            CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        CommonUtils.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r9;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        f(c);
        return null;
    }

    public final void h(String str, Map map, boolean z) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        q1r q1rVar = this.a;
        File c = z ? q1rVar.c(str, "internal-keys") : q1rVar.c(str, CSPDirectoryConstants.SUBDIRECTORY_KEYS);
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            f(c);
            CommonUtils.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File c = this.a.c(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            l820 l820Var = new l820();
            l820Var.put("userId", str2);
            obj = l820Var.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            CommonUtils.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            CommonUtils.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
