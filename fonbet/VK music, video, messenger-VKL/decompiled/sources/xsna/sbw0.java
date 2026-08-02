package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.im.mvicomponent.MultiComponentFragment;
import java.util.HashSet;
import xsna.k840;

/* compiled from: VoiceMessageComponent.kt */
/* loaded from: classes18.dex */
public final class sbw0 extends yj50<tbw0, zbw0, wbw0, xbw0, Object, ubw0, vbw0> {
    public final MultiComponentFragment n;
    public final a1w o;
    public final gzs<ir4> p;
    public final izs<Integer, s3q0> q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sbw0(MultiComponentFragment multiComponentFragment, a1w a1wVar, gzs gzsVar, u4e u4eVar, int i) {
        super(multiComponentFragment, r0, wbw0.class, true);
        srm0 srm0Var = new srm0();
        u4eVar = (i & 16) != 0 ? null : u4eVar;
        this.n = multiComponentFragment;
        this.o = a1wVar;
        this.p = gzsVar;
        this.q = u4eVar;
    }

    @Override // xsna.yj50
    public final tbw0 a(Bundle bundle) {
        ir4 invoke = this.p.invoke();
        u2b0 b = k840.a.g().b();
        g2v.c().getClass();
        Context requireContext = this.n.requireContext();
        HashSet hashSet = iah0.a;
        return new tbw0(invoke, b, fnj.d(requireContext));
    }

    @Override // xsna.yj50
    public final vbw0 b() {
        return new vbw0(this.n, g2v.c());
    }

    @Override // xsna.yj50
    public final xbw0 d() {
        return new xbw0(this.o, this.p, this.q);
    }
}
