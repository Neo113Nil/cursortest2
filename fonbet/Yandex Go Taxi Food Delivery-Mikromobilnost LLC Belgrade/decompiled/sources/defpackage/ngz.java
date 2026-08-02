package defpackage;

import android.util.Log;
import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class ngz {
    public final /* synthetic */ int a = 3;
    public int b;
    public String c;
    public String d;

    public ngz(String str, String[] strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.d = sb;
        this.c = str;
        cvw.f(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.c, i)) {
            i++;
        }
        this.b = i;
    }

    public String a(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.d.concat(str);
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("VKError (");
                int i = this.b;
                if (i == -102) {
                    sb.append("Canceled");
                } else if (i != -101) {
                    sb.append(String.format(Locale.getDefault(), "code: %d; ", Integer.valueOf(i)));
                } else {
                    sb.append("API error");
                }
                sb.append(Extension.C_BRAKE);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ngz() {
    }

    public ngz(String str, String str2, int i) {
        this.c = str;
        this.d = str2;
        this.b = i;
    }

    public ngz(int i, String str, String str2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }
}
