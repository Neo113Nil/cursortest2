package xsna;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.X3;

/* compiled from: LocusIdCompat.java */
/* loaded from: classes11.dex */
public final class c000 {
    public final String a;
    public final LocusId b;

    /* compiled from: LocusIdCompat.java */
    public static class a {
        public static LocusId a(String str) {
            return new LocusId(str);
        }

        public static String b(LocusId locusId) {
            return locusId.getId();
        }
    }

    public c000(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("id cannot be empty");
        }
        this.a = str;
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = a.a(str);
        } else {
            this.b = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c000.class != obj.getClass()) {
            return false;
        }
        String str = ((c000) obj).a;
        String str2 = this.a;
        return str2 == null ? str == null : str2.equals(str);
    }

    public final int hashCode() {
        String str = this.a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.a.length() + "_chars");
        sb.append(X3.j.e);
        return sb.toString();
    }
}
