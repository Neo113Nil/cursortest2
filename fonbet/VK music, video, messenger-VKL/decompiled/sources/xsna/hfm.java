package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.pdg0;

/* compiled from: DialogHistoryBound.kt */
/* loaded from: classes13.dex */
public final class hfm implements g8v {
    public final a1w a;
    public final long b;
    public Long c;

    /* compiled from: DialogHistoryBound.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public hfm(long j, a1w a1wVar) {
        this.a = a1wVar;
        this.b = j;
    }

    @Override // xsna.g8v
    public final boolean a(gj30 gj30Var, de deVar) {
        Object obj;
        if (gj30Var.k().isEmpty()) {
            return gj30Var.o();
        }
        if (deVar instanceof uj30) {
            return !gj30Var.e;
        }
        if (!(deVar instanceof sj30)) {
            if (!(deVar instanceof rj30)) {
                return true;
            }
            rj30 rj30Var = (rj30) deVar;
            if (rj30Var.b == MsgIdType.CNV_ID) {
                return gj30Var.s(rj30Var.c);
            }
            return true;
        }
        Long l = this.c;
        pdg0 n = this.a.n(this, new gem(l != null ? l.longValue() : this.b));
        if (n instanceof pdg0.a) {
            obj = null;
        } else {
            if (!(n instanceof pdg0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            obj = ((pdg0.b) n).a;
        }
        Dialog dialog = (Dialog) obj;
        if (dialog == null) {
            return false;
        }
        boolean Qb = dialog.Qb();
        int fc = dialog.fc();
        boolean s = gj30Var.s(dialog.fc());
        if (!Qb || fc == 0 || s) {
            return true;
        }
        return dialog.fc() <= ((Msg) j5g.X(gj30Var)).d && gj30Var.r(MsgIdType.CNV_ID, dialog.Ub()) && gj30Var.size() == dialog.Jb();
    }

    @Override // xsna.g8v
    public final gkx0 b(gj30 gj30Var, Direction direction) {
        int i = a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return zq70.q(gj30Var);
        }
        if (i == 2) {
            return zq70.r(gj30Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c() {
        Object obj;
        Long l = this.c;
        if (l != null) {
            return l.longValue();
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        long j = this.b;
        Peer b = Peer.a.b(j);
        b.getClass();
        if (b.Ab(Peer.Type.CONTACT)) {
            long j2 = b.d;
            abj abjVar = new abj(Collections.singletonList(Long.valueOf(j2)), Source.CACHE, false, this);
            a1w a1wVar = this.a;
            pdg0 n = a1wVar.n(this, abjVar);
            if (n instanceof pdg0.a) {
                obj = new wpp();
            } else {
                if (!(n instanceof pdg0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = ((pdg0.b) n).a;
            }
            Contact contact = (Contact) ((wpp) obj).e(Long.valueOf(j2)).b;
            Long l2 = contact != null ? contact.j : null;
            if (l2 != null) {
                this.c = l2;
                a1wVar.x(new g480(null, this.b, l2.longValue()));
                return l2.longValue();
            }
        }
        this.c = Long.valueOf(j);
        return j;
    }
}
