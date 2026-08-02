package xsna;

import xsna.lkv;

/* compiled from: KnetExt.kt */
/* loaded from: classes2.dex */
public final class zjy {
    public static final ckv a(ckv ckvVar) {
        return (ckv) ckvVar.h(lkv.d.a);
    }

    public static final boolean b(ckv ckvVar) {
        return ckvVar.h(lkv.a.a) != null;
    }

    public static final boolean c(ckv ckvVar) {
        Boolean bool = (Boolean) ckvVar.h(lkv.b.a);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean d(ckv ckvVar) {
        String str = ckvVar.b;
        return drm0.D(str, "act=a_check", false) && drm0.D(str, "wait=", false);
    }

    public static final boolean e(ckv ckvVar) {
        return ckvVar.h(lkv.f.a) != null;
    }
}
