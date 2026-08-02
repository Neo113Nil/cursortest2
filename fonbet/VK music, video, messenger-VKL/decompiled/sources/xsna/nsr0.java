package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class nsr0 implements com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, e7i0 {
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f b;
    public final ir30 c;

    /* compiled from: ChatListModels.kt */
    public static abstract class a {

        /* compiled from: ChatListModels.kt */
        /* renamed from: xsna.nsr0$a$a, reason: collision with other inner class name */
        public static final class C3411a extends a {
            public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f a;

            public C3411a(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar) {
                this.a = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3411a) && epx.f(this.a, ((C3411a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ContentPayload(contentData=" + this.a + ')';
            }
        }

        /* compiled from: ChatListModels.kt */
        public static final class b extends a {
            public final ir30 a;

            public b(ir30 ir30Var) {
                this.a = ir30Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                ir30 ir30Var = this.a;
                if (ir30Var == null) {
                    return 0;
                }
                return ir30Var.hashCode();
            }

            public final String toString() {
                return "PartContentPayload(msgPartBindArgs=" + this.a + ')';
            }
        }
    }

    public nsr0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar, ir30 ir30Var) {
        this.b = fVar;
        this.c = ir30Var;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g B0(com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2, uk30 uk30Var) {
        utr0 b = gVar != null ? com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.b(gVar) : null;
        utr0 b2 = gVar2 != null ? com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.b.b(gVar2) : null;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        if (!epx.f(fVar.p, b2) || !epx.f(fVar.o, b)) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f B0 = fVar.B0(gVar, gVar2, uk30Var);
            ir30 ir30Var = this.c;
            ir30 d = ir30Var != null ? ir30Var.d(uk30Var, this, gVar, gVar2) : null;
            if (!B0.equals(fVar) || !epx.f(d, ir30Var)) {
                return new nsr0(B0, d);
            }
        }
        return this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return this.b.S;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0() {
        return this.b.k;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g H(Boolean bool, Boolean bool2, Integer num) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f i = fVar.i(bool, num);
        ir30 ir30Var = this.c;
        ir30 d0 = ir30Var != null ? ir30Var.d0(bool, bool2) : null;
        return (i.equals(fVar) && epx.f(d0, ir30Var)) ? this : new nsr0(i, d0);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return this.b.c;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return this.b.h;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.b.f;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.b.R;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g X(uk30 uk30Var) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f X = fVar.X(uk30Var);
        ir30 ir30Var = this.c;
        ir30 b = ir30Var != null ? ir30Var.b(uk30Var, this, fVar.o, fVar.p) : null;
        return (X.equals(fVar) && epx.f(b, ir30Var)) ? this : new nsr0(X, b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsr0)) {
            return false;
        }
        nsr0 nsr0Var = (nsr0) obj;
        return epx.f(this.b, nsr0Var.b) && epx.f(this.c, nsr0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        ir30 ir30Var = this.c;
        return hashCode + (ir30Var == null ? 0 : ir30Var.hashCode());
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.b.b;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g n(oh30 oh30Var) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        if (!epx.f(fVar.f, oh30Var)) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f n = fVar.n(oh30Var);
            ir30 ir30Var = this.c;
            ir30 n2 = ir30Var != null ? ir30Var.n(oh30Var) : null;
            if (!n.equals(fVar) || !epx.f(n2, ir30Var)) {
                return new nsr0(n, n2);
            }
        }
        return this;
    }

    @Override // xsna.e7i0
    public final boolean p() {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        abi0 abi0Var = fVar.Q;
        if (abi0Var == null) {
            return false;
        }
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c cVar = fVar.k;
        return abi0Var.d(cVar != null ? Integer.valueOf(cVar.b) : null);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return this.b.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return this.b.e;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f s = fVar.s(profilesInfo, uk30Var);
        ir30 ir30Var = this.c;
        ir30 s2 = ir30Var != null ? ir30Var.s(profilesInfo, uk30Var) : null;
        return (s.equals(fVar) && epx.f(s2, ir30Var)) ? this : new nsr0(s, s2);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
        return this.b.l;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return this.b.d;
    }

    public final String toString() {
        return "VhMsgArgsItem(contentData=" + this.b + ", msgPartBindArgs=" + this.c + ')';
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g u(boolean z) {
        ir30 ir30Var = this.c;
        ir30 u = ir30Var != null ? ir30Var.u(z) : null;
        return !epx.f(u, ir30Var) ? new nsr0(this.b, u) : this;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.b.i;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return this.b.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        ir30 ir30Var = this.c;
        if (ir30Var != null) {
            return ir30Var.a();
        }
        return null;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g y(boolean z) {
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f fVar = this.b;
        if (fVar.j != z) {
            com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f y = fVar.y(z);
            if (!y.equals(fVar)) {
                return new nsr0(y, this.c);
            }
        }
        return this;
    }

    public nsr0() {
        this(new com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.f(null, null, 0, null, false, false, 0L, null, null, null, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, -1, 2047), null);
    }
}
