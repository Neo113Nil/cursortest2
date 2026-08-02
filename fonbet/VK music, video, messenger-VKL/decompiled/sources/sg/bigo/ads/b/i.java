package sg.bigo.ads.b;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class i implements g<JSONObject> {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        if (r2 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static JSONObject b() {
        BufferedReader bufferedReader;
        String readLine;
        String str;
        JSONObject jSONObject = new JSONObject();
        String[] strArr = {sg.bigo.ads.a.a.L, sg.bigo.ads.a.a.K};
        for (int i = 0; i < 2; i++) {
            String str2 = strArr[i];
            String a = sg.bigo.ads.c.c.a(str2);
            if (!TextUtils.isEmpty(a)) {
                jSONObject.put(str2, a);
            }
        }
        File file = new File(sg.bigo.ads.a.a.ad);
        BufferedReader bufferedReader2 = null;
        if (file.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
            } catch (Exception unused) {
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                do {
                    try {
                        readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            str = sg.bigo.ads.a.a.K;
                        }
                    } catch (Exception unused2) {
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    break;
                } while (!readLine.contains(str));
                break;
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            jSONObject.put(str, readLine);
        }
        String a2 = sg.bigo.ads.c.c.a(new File(sg.bigo.ads.a.a.ae));
        if (!TextUtils.isEmpty(a2) && a2.contains(sg.bigo.ads.a.a.an)) {
            jSONObject.put(sg.bigo.ads.a.a.K, a2);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        return b();
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.E;
    }
}
