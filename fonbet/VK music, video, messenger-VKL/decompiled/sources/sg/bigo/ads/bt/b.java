package sg.bigo.ads.bt;

import androidx.annotation.Nullable;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes9.dex */
public final class b {
    public long a;
    public long b = -1;
    private long c;

    private b() {
    }

    @Nullable
    public static b a(String str) {
        b bVar = null;
        if (r.a((CharSequence) str)) {
            return null;
        }
        int indexOf = str.indexOf(" ");
        int indexOf2 = str.indexOf("-");
        int indexOf3 = str.indexOf(DomExceptionUtils.SEPARATOR);
        if (indexOf >= 0 && indexOf3 >= 0 && indexOf < indexOf3) {
            bVar = new b();
            if (indexOf2 > indexOf && indexOf2 < indexOf3) {
                try {
                    bVar.a = Long.parseLong(str.substring(indexOf + 1, indexOf2));
                    bVar.c = Long.parseLong(str.substring(indexOf2 + 1, indexOf3));
                } catch (Exception unused) {
                }
            }
            String substring = str.substring(indexOf3 + 1);
            if (!"*".equals(substring)) {
                bVar.b = Long.parseLong(substring);
            }
        }
        return bVar;
    }
}
