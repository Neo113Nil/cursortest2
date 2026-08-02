package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogMember;
import com.vk.im.engine.models.mentions.MassMentionType;
import com.vk.im.engine.models.users.UserNameCase;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.g1e0;
import xsna.qhm;

/* compiled from: DialogGetMentionSuggestionCmd.kt */
/* loaded from: classes2.dex */
public final class fem extends le6<m420> {
    public final Peer b;
    public final String c;
    public final Source d;
    public final boolean e;
    public final String f = "DialogMentionComponent";
    public final List<xi10> g;

    /* compiled from: DialogGetMentionSuggestionCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fem(Peer peer, String str, Source source, boolean z) {
        this.b = peer;
        this.c = str;
        this.d = source;
        this.e = z;
        MassMentionType massMentionType = MassMentionType.ALL;
        xi10 xi10Var = new xi10(massMentionType, "@".concat((String) j5g.Y(massMentionType.h())));
        MassMentionType massMentionType2 = MassMentionType.ONLINE;
        this.g = e43.l(xi10Var, new xi10(massMentionType2, "@".concat((String) j5g.Y(massMentionType2.h()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.List<xsna.xi10>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // xsna.le6
    public final m420 e(w2w w2wVar) {
        List j;
        Iterable iterable;
        Iterable iterable2;
        ?? r1;
        qtd0 Bb;
        int[] iArr;
        String str;
        String sb;
        qtd0 Bb2;
        String P5;
        ChatSettings Hb;
        Object obj;
        Peer peer = this.b;
        boolean z = false;
        if (!peer.zb()) {
            return new m420((AbstractCollection) null, (ProfilesInfo) null, false, 15);
        }
        int[] iArr2 = a.$EnumSwitchMapping$0;
        Source source = this.d;
        int i = iArr2[source.ordinal()];
        String str2 = this.c;
        int i2 = 1;
        if (i == 1) {
            if (str2.length() > 0) {
                j = str2.length() == 0 ? EmptyList.b : j5g.O0(((qhm.a) w2wVar.L0(this, new qhm(peer, str2, Source.CACHE, z))).a.b);
            } else {
                List O0 = j5g.O0(lnm.a(sn.c(w2wVar), peer.b, w2wVar.I0().o().x0(peer, Direction.BEFORE, 50), null, 4).b);
                int size = 50 - O0.size();
                j = size > 0 ? izi0.j(j5g.S0(O0), j5g.O0(lnm.a(sn.c(w2wVar), peer.b, null, Integer.valueOf(size), 2).b)) : O0;
            }
            iterable = j;
        } else if (i == 2) {
            iterable = f(w2wVar);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iterable = f(w2wVar);
        }
        final List x0 = w2wVar.I0().o().x0(peer, Direction.BEFORE, 50);
        hfr j2 = rli0.j(new i5g(iterable), new nfj(w2wVar.H0(), 7));
        Comparator comparator = new Comparator() { // from class: xsna.eem
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                Peer peer2 = ((DialogMember) obj2).b;
                List list = x0;
                int indexOf = list.indexOf(peer2);
                int indexOf2 = list.indexOf(((DialogMember) obj3).b);
                if (indexOf < 0) {
                    indexOf = Integer.MAX_VALUE;
                }
                if (indexOf2 < 0) {
                    indexOf2 = Integer.MAX_VALUE;
                }
                return epx.g(indexOf, indexOf2);
            }
        };
        List B = rli0.B(j2);
        g5g.L(B, comparator);
        Iterator it = ((ArrayList) B).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                ArrayList b = y57.b(next);
                while (it.hasNext()) {
                    b.add(it.next());
                }
                iterable2 = b;
            } else {
                iterable2 = Collections.singletonList(next);
            }
        } else {
            iterable2 = EmptyList.b;
        }
        Source source2 = iArr2[source.ordinal()] == 1 ? Source.CACHE : Source.ACTUAL;
        Iterable<DialogMember> iterable3 = iterable2;
        ArrayList arrayList = new ArrayList(c5g.u(iterable3, 10));
        Iterator it2 = iterable3.iterator();
        while (it2.hasNext()) {
            arrayList.add(((DialogMember) it2.next()).b);
        }
        g1e0.a aVar = new g1e0.a();
        aVar.h(arrayList);
        aVar.b = source2;
        aVar.c = this.e;
        aVar.d = this.f;
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        Dialog dialog = (Dialog) ((wpp) w2wVar.J0(this, new tqm(peer, source)).await()).c.get(Long.valueOf(peer.b));
        if (dialog == null || (Hb = dialog.Hb()) == null) {
            r1 = EmptyList.b;
        } else if (Hb.f < 2 || !Hb.w) {
            r1 = EmptyList.b;
        } else if (str2.length() == 0) {
            r1 = this.g;
        } else {
            r1 = new ArrayList();
            for (MassMentionType massMentionType : MassMentionType.values()) {
                Iterator it3 = massMentionType.h().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (brm0.B((String) obj, str2, true)) {
                        break;
                    }
                }
                String str3 = (String) obj;
                if (str3 != null) {
                    String concat = "@".concat(str3);
                    r1.add(new xi10(massMentionType, concat, concat));
                }
            }
        }
        Collection collection = (Collection) r1;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable3, 10));
        for (DialogMember dialogMember : iterable3) {
            Peer peer2 = dialogMember.b;
            Peer.Type type = peer2.c;
            int[] iArr3 = s320.$EnumSwitchMapping$0;
            if (iArr3[type.ordinal()] == i2 || (Bb = profilesInfo.Bb(peer2)) == null) {
                iArr = iArr3;
                sb = "";
                str = sb;
            } else {
                if (!drm0.N(Bb.Ra()) && Bb.ja()) {
                    sb = "@" + Bb.Ra();
                    iArr = iArr3;
                } else if (Bb.Va()) {
                    StringBuilder sb2 = new StringBuilder("@club");
                    iArr = iArr3;
                    sb2.append(Bb.id());
                    sb2.append(" (");
                    sb2.append(Bb.P5(UserNameCase.NOM));
                    sb2.append(')');
                    sb = sb2.toString();
                } else {
                    iArr = iArr3;
                    StringBuilder sb3 = new StringBuilder("@id");
                    str = "";
                    sb3.append(Bb.id());
                    sb3.append(" (");
                    sb3.append(Bb.P5(UserNameCase.NOM));
                    sb3.append(')');
                    sb = sb3.toString();
                }
                str = "";
            }
            i2 = 1;
            if (iArr[peer2.c.ordinal()] == 1 || (Bb2 = profilesInfo.Bb(peer2)) == null) {
                P5 = str;
            } else if (drm0.N(Bb2.Ra()) || !Bb2.ja()) {
                P5 = Bb2.P5(UserNameCase.NOM);
            } else {
                P5 = "@" + Bb2.Ra();
            }
            arrayList2.add(new x120(peer2, sb, P5, dialogMember.j));
        }
        return new m420((AbstractCollection) j5g.u0(arrayList2, collection), profilesInfo, false, 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fem)) {
            return false;
        }
        fem femVar = (fem) obj;
        return epx.f(this.b, femVar.b) && epx.f(this.c, femVar.c) && this.d == femVar.d && this.e == femVar.e && epx.f(this.f, femVar.f);
    }

    public final ohm f(w2w w2wVar) {
        String str = this.c;
        if (str.length() == 0) {
            str = " ";
        }
        Source source = Source.NETWORK;
        return ((qhm.a) w2wVar.L0(this, new qhm(this.b, str, 50, source, this.e, false))).a;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetMentionSuggestionCmd(peer=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", source=");
        sb.append(this.d);
        sb.append(", isAwaitNetwork=");
        sb.append(this.e);
        sb.append(", changerTag=");
        return tq.f(sb, this.f, ')');
    }
}
