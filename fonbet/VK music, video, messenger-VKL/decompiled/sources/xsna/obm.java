package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: DialogCheckMembersInCmd.kt */
/* loaded from: classes2.dex */
public final class obm extends xl6<pbm> {
    public final Peer b;
    public final Source c;
    public final List<Peer> d;
    public final boolean e = true;
    public final long f;

    /* compiled from: DialogCheckMembersInCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public obm(Peer peer, Source source, List list) {
        this.b = peer;
        this.c = source;
        this.d = list;
        this.f = peer.b;
    }

    @Override // xsna.m2w
    public final String a() {
        return "im-dialog-member-check";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        List<Peer> list = this.d;
        if (list.isEmpty()) {
            return new pbm(EmptyList.b, true);
        }
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            Pair g = g(Source.CACHE, list, w2wVar);
            return new pbm((List) g.d(), ((Boolean) g.g()).booleanValue());
        }
        if (i == 2) {
            return f(w2wVar);
        }
        if (i == 3) {
            return f(w2wVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obm)) {
            return false;
        }
        obm obmVar = (obm) obj;
        return epx.f(this.b, obmVar.b) && this.c == obmVar.c && epx.f(this.d, obmVar.d) && this.e == obmVar.e;
    }

    public final pbm f(w2w w2wVar) {
        List list;
        ChatSettings Hb;
        HashMap hashMap = ((wpp) w2wVar.J0(this, new tqm(new sqm(this.b, Source.CACHE, false, (Object) this, 16))).await()).c;
        long j = this.f;
        Dialog dialog = (Dialog) hashMap.get(Long.valueOf(j));
        int i = (dialog == null || (Hb = dialog.Hb()) == null) ? Integer.MAX_VALUE : Hb.f;
        hpm e = w2wVar.I0().b().e();
        e.getClass();
        Integer J = fl3.J(e.b.b().d(defpackage.k0.a(j, "SELECT COUNT(1) FROM dialog_members WHERE dialog_id = "), null));
        int intValue = i - (J != null ? J.intValue() : 0);
        List<Peer> list2 = this.d;
        if (intValue < list2.size() * 3) {
            do {
                vua0.c("DialogCheckMembersInCmd");
                try {
                } catch (Throwable unused) {
                }
            } while (!((phm) w2wVar.L0(this, new hem(this.b, Source.ACTUAL, this.e, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : Boolean.TRUE))).c);
            list = (List) g(Source.CACHE, list2, w2wVar).i();
        } else {
            list = (List) g(Source.NETWORK, list2, w2wVar).i();
        }
        return new pbm(list, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.ArrayList] */
    public final Pair g(Source source, List list, w2w w2wVar) {
        ?? r6;
        List O0;
        xpp<ohm> xppVar = ((dem) w2wVar.L0(this, new cem(this.b, source, this.e, list))).a;
        ohm ohmVar = xppVar.b;
        if (ohmVar == null || (O0 = j5g.O0(ohmVar.b)) == null) {
            r6 = 0;
        } else {
            List list2 = O0;
            r6 = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r6.add(((DialogMember) it.next()).b);
            }
        }
        if (r6 == 0) {
            r6 = EmptyList.b;
        }
        return new Pair(r6, Boolean.valueOf(xppVar.b()));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + fw3.a(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogCheckMembersInCmd(peer=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", memberIds=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
