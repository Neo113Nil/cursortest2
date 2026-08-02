package xsna;

import com.vk.movika.sdk.base.e;
import kotlin.NoWhenBranchMatchedException;
import xsna.ocx;

/* compiled from: Utils.kt */
/* loaded from: classes3.dex */
public final class y3r0 {
    public static final ocx.e a(com.vk.movika.sdk.base.e eVar) {
        if (eVar.equals(e.a.a)) {
            return ocx.e.a.a;
        }
        if (eVar.equals(e.C1292e.a) || eVar.equals(e.b.a)) {
            return ocx.e.b.a;
        }
        if (eVar.equals(e.c.a)) {
            return ocx.e.c.a;
        }
        if (eVar.equals(e.f.a) || eVar.equals(e.d.a)) {
            return ocx.e.d.a;
        }
        throw new NoWhenBranchMatchedException();
    }
}
