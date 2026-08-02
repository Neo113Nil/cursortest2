package xsna;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.dialogsfab.impl.Mode;
import com.vk.dto.common.Peer;
import com.vk.im.mvicomponent.MultiComponentFragment;
import xsna.o1a0;

/* compiled from: DialogsFabComponent.kt */
/* loaded from: classes18.dex */
public final class jpm extends yj50<kpm, ppm, npm, opm, Object, lpm, mpm> {
    public final MultiComponentFragment n;
    public final o0w o;
    public final Peer p;
    public final Mode q;
    public final o1a0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [xsna.o1a0] */
    public jpm(MultiComponentFragment multiComponentFragment, o0w o0wVar, Peer peer, Mode mode, p1a0 p1a0Var, int i) {
        super(multiComponentFragment, multiComponentFragment, npm.class, true);
        if ((i & 4) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        mode = (i & 8) != 0 ? Mode.EXTENDED : mode;
        p1a0 stub = (i & 16) != 0 ? o1a0.a.a.getSTUB() : p1a0Var;
        this.n = multiComponentFragment;
        this.o = o0wVar;
        this.p = peer;
        this.q = mode;
        this.r = stub;
    }

    @Override // xsna.yj50
    public final kpm a(Bundle bundle) {
        return new kpm(new ppm());
    }

    @Override // xsna.yj50
    public final mpm b() {
        return new mpm(this.n, this.o, this.p, this.q);
    }

    @Override // xsna.yj50
    public final opm d() {
        return new opm(this.r);
    }
}
