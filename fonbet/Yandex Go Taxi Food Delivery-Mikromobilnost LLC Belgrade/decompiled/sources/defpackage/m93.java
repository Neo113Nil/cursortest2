package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m93 {
    public final Context a;

    public m93(Context context) {
        this.a = context;
    }

    public final JSONObject a(String str) {
        InputStream open = this.a.getAssets().open(str);
        char[] cArr = new char[2048];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
        StringBuilder sb = new StringBuilder(open.available());
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append(cArr, 0, read);
        }
    }
}
