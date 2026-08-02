package xsna;

import com.ironsource.B5;
import java.util.Arrays;

/* compiled from: MoreObjects.java */
/* loaded from: classes13.dex */
public final class m930 {
    public final String a;
    public final b b;
    public b c;

    /* compiled from: MoreObjects.java */
    public static final class a extends b {
    }

    /* compiled from: MoreObjects.java */
    public static class b {
        public String a;
        public Object b;
        public b c;
    }

    public m930(String str) {
        b bVar = new b();
        this.b = bVar;
        this.c = bVar;
        this.a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        b bVar = this.b.c;
        String str = "";
        while (bVar != null) {
            Object obj = bVar.b;
            sb.append(str);
            String str2 = bVar.a;
            if (str2 != null) {
                sb.append(str2);
                sb.append(B5.U);
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            bVar = bVar.c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
