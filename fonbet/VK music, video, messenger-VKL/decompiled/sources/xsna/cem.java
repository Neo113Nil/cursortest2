package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DialogGetMembersCmd.kt */
/* loaded from: classes2.dex */
public final class cem extends le6<dem> {
    public final Peer b;
    public final Source c;
    public final boolean d;
    public final Object e;
    public final List<Peer> f;
    public final Boolean g;

    /* compiled from: DialogGetMembersCmd.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public cem(Peer peer, Source source, boolean z, Object obj, List<? extends Peer> list, Boolean bool) {
        this.b = peer;
        this.c = source;
        this.d = z;
        this.e = obj;
        this.f = list;
        this.g = bool;
    }

    @Override // xsna.le6
    public final dem e(w2w w2wVar) {
        if (!this.b.zb()) {
            return new dem(new xpp(new ohm(new DialogMember(w2wVar.H0(), null, 0L, false, null, null, false, false, false, 510, null), new DialogMember(this.b, null, 0L, false, null, null, false, false, false, 510, null)), false), false);
        }
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return (dem) w2wVar.I0().c(new t9e(this, 15));
        }
        if (i == 2) {
            dem demVar = (dem) w2wVar.I0().c(new b7(9, this, w2wVar));
            return demVar == null ? f(w2wVar) : demVar;
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
        if (!(obj instanceof cem)) {
            return false;
        }
        cem cemVar = (cem) obj;
        return epx.f(this.b, cemVar.b) && this.c == cemVar.c && this.d == cemVar.d && epx.f(this.e, cemVar.e) && epx.f(this.f, cemVar.f) && epx.f(this.g, cemVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, xsna.ohm] */
    /* JADX WARN: Type inference failed for: r7v4, types: [xsna.ohm] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final dem f(w2w w2wVar) {
        DialogMember dialogMember;
        Peer peer = this.b;
        long j = peer.b;
        long j2 = peer.b;
        if (!sn.c(w2wVar).K(Collections.singletonList(Long.valueOf(j))).isEmpty()) {
            throw new ApiAccessDeniedException((VKApiExecutionException) null);
        }
        List<Peer> list = this.f;
        if (list != null) {
            if (list.isEmpty()) {
                return new dem(new xpp(), false);
            }
            urb urbVar = (urb) bz2.c(new oe20(this.b, w2wVar.Q0(), list, this.d, false, null, 48), null);
            w2wVar.I0().b().e().l(j2, urbVar.a);
            return new dem(new xpp(urbVar.a, false), false);
        }
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = this.g;
        String R = epx.f(bool2, bool) ? w2wVar.I0().b().e().R(j2) : null;
        oe20 oe20Var = new oe20(this.b, w2wVar.Q0(), null, this.d, bool2 != null, R, 4);
        final Long q = w2wVar.I0().system().q();
        final urb urbVar2 = (urb) bz2.c(oe20Var, null);
        ?? r7 = urbVar2.a;
        ArrayList arrayList = r7.b;
        if (!(r7 instanceof Collection) || !((Collection) r7).isEmpty()) {
            ListIterator listIterator = r7.b.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    break;
                }
                if (((DialogMember) listIterator.next()).zb()) {
                    ArrayList arrayList2 = new ArrayList();
                    ListIterator listIterator2 = arrayList.listIterator();
                    while (listIterator2.hasNext()) {
                        Object next = listIterator2.next();
                        if (((DialogMember) next).zb()) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Integer num = ((DialogMember) it.next()).f;
                        if (num != null) {
                            arrayList3.add(num);
                        }
                    }
                    Map map = (Map) bz2.c(new bf20(j2, arrayList3, this.d), "DialogGetMembersCmd.MessagesGetIncognitoMembersByIdsApiCmd");
                    ArrayList arrayList4 = new ArrayList(c5g.u(r7, 10));
                    ListIterator listIterator3 = arrayList.listIterator();
                    while (listIterator3.hasNext()) {
                        DialogMember dialogMember2 = (DialogMember) listIterator3.next();
                        if (dialogMember2.zb() && (dialogMember = (DialogMember) map.get(dialogMember2.f)) != null) {
                            dialogMember2 = dialogMember;
                        }
                        arrayList4.add(dialogMember2);
                    }
                    r7 = new ohm(arrayList4);
                }
            }
        }
        final boolean z = R == null;
        final ohm ohmVar = r7;
        return (dem) w2wVar.I0().u(new izs() { // from class: xsna.bem
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                String str;
                cem cemVar = this;
                Peer peer2 = cemVar.b;
                String str2 = urbVar2.c;
                xgl0 xgl0Var = (xgl0) obj;
                int d = xgl0Var.system().d();
                boolean z2 = z;
                final ohm ohmVar2 = ohmVar;
                if (z2) {
                    final hpm e = xgl0Var.b().e();
                    final long j3 = peer2.b;
                    e.b.b().h(new izs() { // from class: xsna.eom
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            hpm hpmVar = e;
                            long j4 = j3;
                            hpmVar.e0(j4);
                            hpmVar.l(j4, ohmVar2);
                            return s3q0.a;
                        }
                    });
                } else {
                    xgl0Var.b().e().l(peer2.b, ohmVar2);
                }
                if (!(cemVar.g != null)) {
                    xgl0Var.b().e().b0(d, peer2.b);
                } else if (str2 == null) {
                    Integer P = xgl0Var.b().e().P(peer2.b);
                    if ((P != null ? P.intValue() : -1) >= 0 || z2) {
                        xgl0Var.b().e().b0(d, peer2.b);
                    }
                } else if (z2) {
                    xgl0Var.b().e().b0(d - 1, peer2.b);
                }
                hpm e2 = xgl0Var.b().e();
                long j4 = peer2.b;
                if (e2.O(j4) == null) {
                    xgl0Var.b().e().a0(j4, q);
                }
                hpm e3 = xgl0Var.b().e();
                e3.getClass();
                if (str2 == null || (str = air.b('\'', "'", str2)) == null) {
                    str = "NULL";
                }
                StringBuilder d2 = rqi.d(j4, "\n            UPDATE dialog_members_meta\n            SET pagination_anchor = ", str, "\n            WHERE dialog_id = ");
                d2.append("\n            ");
                e3.b.b().execSQL(d2.toString());
                return new dem(new xpp(ohmVar2, false), str2 != null);
            }
        });
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        int hashCode = (b + (obj == null ? 0 : obj.hashCode())) * 31;
        List<Peer> list = this.f;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.g;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetMembersCmd(peer=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        sb.append(this.e);
        sb.append(", memberIds=");
        sb.append(this.f);
        sb.append(", loadNextPage=");
        return tn.a(sb, this.g, ')');
    }

    public cem(Peer peer, Source source, boolean z, List list) {
        this(peer, source, z, null, list, Boolean.TRUE);
    }

    public cem(Peer peer, Source source) {
        this(peer, source, true, null, null, false);
    }
}
