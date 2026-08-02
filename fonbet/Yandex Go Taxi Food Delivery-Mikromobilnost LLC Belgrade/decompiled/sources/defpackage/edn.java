package defpackage;

import android.net.Uri;

/* loaded from: classes14.dex */
public final class edn {
    public final h3y a;

    public edn(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final boolean a(Uri uri, h1p h1pVar) {
        f0p e;
        mfi mfiVar = mfi.l;
        f0p e2 = mfiVar.e(uri);
        String str = null;
        if (e2 != null) {
            String str2 = e2.a;
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                str = str2;
                return jl40.l(str, h1pVar.getValue());
            }
        }
        Uri a = ((zzo) this.a.get()).a(uri);
        if (a != null && (e = mfiVar.e(a)) != null) {
            String str3 = e.a;
            if (str3.length() > 0) {
                str = str3;
            }
        }
        return jl40.l(str, h1pVar.getValue());
    }
}
