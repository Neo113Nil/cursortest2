package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* compiled from: MetaDataStore.java */
/* loaded from: classes.dex */
public final class zh20 {
    public static final Charset b = Charset.forName(C.UTF8_NAME);
    public final sar a;

    public zh20(sar sarVar) {
        this.a = sarVar;
    }

    public static HashMap a(String str) throws JSONException {
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

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(rlg0.a(jSONArray.getString(i)));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String e(List<rlg0> list) {
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(rlg0.a.a(list.get(i))));
            } catch (JSONException unused) {
            }
        }
        hashMap.put("rolloutsState", jSONArray);
        return new JSONObject(hashMap).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    public final Map<String, String> c(String str, boolean z) {
        FileInputStream fileInputStream;
        Throwable th;
        sar sarVar = this.a;
        File c = z ? sarVar.c(str, "internal-keys") : sarVar.c(str, ApiProtocol.PARAM_KEYS);
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
        } catch (Throwable th2) {
            fileInputStream = fileInputStream2;
            th = th2;
        }
        try {
            HashMap a = a(fng.j(fileInputStream));
            fng.b(fileInputStream, "Failed to close user metadata file.");
            return a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            f(c);
            fng.b(fileInputStream2, "Failed to close user metadata file.");
            return Collections.EMPTY_MAP;
        } catch (Throwable th3) {
            th = th3;
            fng.b(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    @Nullable
    public final String d(String str) {
        FileInputStream fileInputStream;
        File c = this.a.c(str, "user-data");
        Closeable closeable = null;
        if (c.exists()) {
            ?? r1 = (c.length() > 0L ? 1 : (c.length() == 0L ? 0 : -1));
            try {
                if (r1 != 0) {
                    try {
                        fileInputStream = new FileInputStream(c);
                        try {
                            JSONObject jSONObject = new JSONObject(fng.j(fileInputStream));
                            String optString = jSONObject.isNull("userId") ? null : jSONObject.optString("userId", null);
                            fng.b(fileInputStream, "Failed to close user metadata file.");
                            return optString;
                        } catch (Exception unused) {
                            f(c);
                            fng.b(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        fng.b(closeable, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r1;
            }
        }
        f(c);
        return null;
    }

    public final void h(String str, Map<String, String> map, boolean z) {
        String jSONObject;
        BufferedWriter bufferedWriter;
        sar sarVar = this.a;
        File c = z ? sarVar.c(str, "internal-keys") : sarVar.c(str, ApiProtocol.PARAM_KEYS);
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
            fng.b(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            f(c);
            fng.b(bufferedWriter2, "Failed to close key/value metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            fng.b(bufferedWriter2, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    public final void i(String str, String str2) {
        String obj;
        BufferedWriter bufferedWriter;
        File c = this.a.c(str, "user-data");
        BufferedWriter bufferedWriter2 = null;
        try {
            yh20 yh20Var = new yh20();
            yh20Var.put("userId", str2);
            obj = yh20Var.toString();
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), b));
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(obj);
            bufferedWriter.flush();
            fng.b(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            fng.b(bufferedWriter2, "Failed to close user metadata file.");
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            fng.b(bufferedWriter2, "Failed to close user metadata file.");
            throw th;
        }
    }
}
