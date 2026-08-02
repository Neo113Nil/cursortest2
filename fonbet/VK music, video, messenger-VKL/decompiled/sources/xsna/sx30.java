package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.i9f0;
import xsna.kx30;
import xsna.p4g;
import xsna.t6v;

/* compiled from: MsgSearchLoadCmd.kt */
/* loaded from: classes2.dex */
public final class sx30 extends le6<hy30> {
    public final String b;
    public final SearchMode c;
    public final Source d;
    public final int e;
    public final Long f;
    public final Long g;
    public final boolean h;
    public final kx30 i;

    /* compiled from: MsgSearchLoadCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchMode.values().length];
            try {
                iArr[SearchMode.PEERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchMode.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchMode.CHANNELS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
    
        if (r1 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sx30(String str, SearchMode searchMode, Source source, int i, Long l, Long l2, boolean z, int i2) {
        Peer peer;
        Long l3 = (i2 & 32) != 0 ? null : l;
        this.b = str;
        this.c = searchMode;
        this.d = source;
        this.e = i;
        this.f = l3;
        this.g = l2;
        this.h = z;
        if (l2 != null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.a.b(l2.longValue());
        }
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        peer = Peer.Unknown.e;
        this.i = new kx30(str, source, searchMode, 20, i, l3, peer, z, false, null, null, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.le6
    public final hy30 e(w2w w2wVar) {
        Pair pair;
        kx30.a aVar = (kx30.a) w2wVar.L0(this, this.i);
        boolean z = aVar.e;
        ProfilesSimpleInfo profilesSimpleInfo = aVar.d;
        Map<Long, Dialog> map = aVar.c;
        List<Msg> list = aVar.b;
        hy30 hy30Var = new hy30(this.b, this.g, null, z, aVar.f, this.c, this.d, null, null, 15399);
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        String str = this.b;
        if (i == 1) {
            if (drm0.N(str)) {
                ProfilesSimpleInfo profilesSimpleInfo2 = new ProfilesSimpleInfo();
                long j = w2wVar.getConfig().n;
                Source source = this.d;
                boolean z2 = this.h;
                t6v.a aVar2 = (t6v.a) w2wVar.L0(this, new t6v(j, source, z2));
                profilesSimpleInfo2.Jb(aVar2.b.Ob());
                hy30Var.p = aVar2.a;
                i9f0.a aVar3 = (i9f0.a) w2wVar.L0(this, new i9f0(source, z2));
                profilesSimpleInfo2.Jb(aVar3.b.Ob());
                hy30Var.q = aVar3.a;
                hy30Var.c.Hb(profilesSimpleInfo2);
                hy30Var.b.putAll(jgp.b);
                return hy30Var;
            }
            List<zpp<Dialog>> list2 = aVar.a;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((Dialog) ((zpp) it.next()).a);
            }
            p4g.a aVar4 = p4g.a;
            HashMap hashMap = new HashMap(arrayList.size());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                hashMap.put(((Dialog) next).Sb(), next);
            }
            hashMap.putAll(map);
            DialogExt a2 = drm0.D(w2wVar.getContext().getString(R.string.vkim_dialog_with_self_title), str, true) ? ((ipm) w2wVar.J0(this, new uqm(w2wVar.H0(), Source.CACHE)).await()).a(w2wVar.H0().b) : null;
            ProfilesInfo profilesInfo = a2 != null ? a2.b : null;
            ProfilesSimpleInfo profilesSimpleInfo3 = new ProfilesSimpleInfo(profilesSimpleInfo);
            profilesSimpleInfo3.Hb(profilesInfo != null ? profilesInfo.Ob() : new ProfilesSimpleInfo());
            hy30Var.c.Hb(profilesSimpleInfo3);
            hy30Var.b.putAll(hashMap);
            return hy30Var;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalArgumentException("SearchMode.CHANNELS mode is not supported");
        }
        ArrayList arrayList2 = emi.y(str).c;
        lx30 lx30Var = lx30.a;
        List<Msg> list3 = list;
        Peer a3 = mq9.a(w2wVar);
        boolean z3 = this.g == null;
        lx30Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Msg msg : list3) {
            if (msg instanceof MsgFromUser) {
                try {
                    pair = lx30.a((MsgFromUser) msg, a3, z3, profilesSimpleInfo, arrayList2);
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Formatting failed", e));
                    pair = new Pair(msg, ((MsgFromUser) msg).F);
                }
                CnvMsgId n = k9q0.n(msg);
                com.vk.im.engine.models.messages.a aVar5 = (com.vk.im.engine.models.messages.a) pair.i();
                if (aVar5 == null) {
                    aVar5 = (com.vk.im.engine.models.messages.a) msg;
                }
                linkedHashMap2.put(n, aVar5);
                linkedHashMap.put(k9q0.n(msg), pair.j());
            } else {
                CnvMsgId n2 = k9q0.n(msg);
                com.vk.im.engine.models.messages.a aVar6 = msg instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) msg : null;
                if (aVar6 == null) {
                    aVar6 = new MsgFromUser();
                }
                linkedHashMap2.put(n2, aVar6);
                linkedHashMap.put(k9q0.n(msg), "...");
            }
        }
        Pair pair2 = new Pair(linkedHashMap2, linkedHashMap);
        hy30Var.b = new LinkedHashMap(map);
        hy30Var.c = profilesSimpleInfo;
        Map map2 = (Map) pair2.j();
        Map map3 = (Map) pair2.i();
        hy30Var.a.addAll(list3);
        hy30Var.n.putAll(map2);
        hy30Var.o.putAll(map3);
        return hy30Var;
    }

    public final boolean equals(Object obj) {
        sx30 sx30Var = obj instanceof sx30 ? (sx30) obj : null;
        return epx.f(this.i, sx30Var != null ? sx30Var.i : null);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.i.hashCode() + 31;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgSearchLoadCmd[" + this.i + ']';
    }
}
