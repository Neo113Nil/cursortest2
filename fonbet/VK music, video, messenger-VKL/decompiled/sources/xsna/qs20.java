package xsna;

import com.vk.dto.common.Peer;
import kotlin.NoWhenBranchMatchedException;
import xsna.f400;

/* compiled from: MissedPeerHelper.kt */
/* loaded from: classes2.dex */
public final class qs20 {
    public final w2w a;

    /* compiled from: MissedPeerHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qs20(w2w w2wVar) {
        this.a = w2wVar;
    }

    public final void a(Peer peer, c400 c400Var, f400 f400Var) {
        Peer.Type type = peer.c;
        long j = peer.d;
        w2w w2wVar = this.a;
        if (epx.f(w2wVar.H0(), peer)) {
            return;
        }
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[type.ordinal()];
        if (i != 1 ? i != 2 ? i != 3 ? i != 4 ? true : c400Var.e.containsKey(Long.valueOf(j)) : c400Var.c.containsKey(Long.valueOf(j)) : c400Var.b.containsKey(Long.valueOf(j)) : c400Var.a.containsKey(Long.valueOf(j))) {
            return;
        }
        xgl0 I0 = w2wVar.I0();
        int i2 = iArr[type.ordinal()];
        if ((i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? new Object() : I0.w().c(j) : I0.n().b(j) : I0.f().b(j) : I0.d().b(j)) == null) {
            switch (f400.a.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    f400Var.a.add(Long.valueOf(peer.b));
                    return;
                case 2:
                    f400Var.e(j);
                    return;
                case 3:
                    f400Var.c(j);
                    return;
                case 4:
                    f400Var.h.add(Long.valueOf(j));
                    return;
                case 5:
                    f400Var.g.add(Long.valueOf(j));
                    return;
                case 6:
                    f400Var.i.add(Long.valueOf(j));
                    return;
                case 7:
                    return;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }
}
