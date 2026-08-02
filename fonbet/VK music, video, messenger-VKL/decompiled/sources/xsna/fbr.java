package xsna;

import android.text.TextUtils;
import com.vk.clipseditor.utility.exceptions.FileFormatException;

/* compiled from: FileVideoUtils.kt */
/* loaded from: classes17.dex */
public final class fbr {

    /* compiled from: FileVideoUtils.kt */
    public static final class a {
        public int a;
        public int b;
        public String c;
        public long d;
        public int e;
        public int f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyzeResult{width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", mimeType='");
            sb.append(this.c);
            sb.append("', fileSize=");
            sb.append(this.d);
            sb.append(", duration=");
            return vu5.b(sb, this.e, '}');
        }
    }

    public static void a(String str, a aVar) {
        if (str == null || str.length() == 0) {
            aVar.e = 0;
            return;
        }
        try {
            int parseInt = Integer.parseInt(str);
            aVar.e = parseInt;
            if (parseInt >= 0) {
                return;
            }
            throw new FileFormatException("Unable to decode waveForm: " + aVar.e);
        } catch (Exception unused) {
            throw new FileFormatException("Unable to decode waveForm: ".concat(str));
        }
    }

    public static void b(String str, a aVar) {
        if (TextUtils.isEmpty(str)) {
            aVar.f = 0;
        } else {
            try {
                aVar.f = Integer.parseInt(str);
            } catch (Exception unused) {
                aVar.f = 0;
            }
        }
        int i = aVar.f;
        if (i == 90 || i == 270) {
            int i2 = aVar.a;
            aVar.a = aVar.b;
            aVar.b = i2;
        }
    }

    public static void c(String str, a aVar) {
        if (str == null || str.length() == 0) {
            throw new FileFormatException(go9.b("Unable to decode height: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str);
            aVar.a = parseInt;
            if (parseInt >= 0) {
                return;
            }
            throw new FileFormatException("Unable to decode height: " + aVar.a);
        } catch (Exception unused) {
            throw new FileFormatException("Unable to decode height: ".concat(str));
        }
    }

    public static void d(String str, a aVar) {
        if (str == null || str.length() == 0) {
            throw new FileFormatException(go9.b("Unable to decode width: ", str));
        }
        try {
            int parseInt = Integer.parseInt(str);
            aVar.a = parseInt;
            if (parseInt >= 0) {
                return;
            }
            throw new FileFormatException("Unable to decode width: " + aVar.a);
        } catch (Exception unused) {
            throw new FileFormatException("Unable to decode width: ".concat(str));
        }
    }
}
