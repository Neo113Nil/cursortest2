package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.utils.StringMatchStrategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.g1e0;

/* compiled from: DialogMembersSearchCmd.kt */
/* loaded from: classes2.dex */
public final class qhm extends le6<a> {
    public final Peer b;
    public final String c;
    public final Integer d;
    public final Source e;
    public final boolean f;
    public final boolean g;

    /* compiled from: DialogMembersSearchCmd.kt */
    public static final class a {
        public final ohm a;
        public final ProfilesInfo b;

        public a(ohm ohmVar, ProfilesInfo profilesInfo) {
            this.a = ohmVar;
            this.b = profilesInfo;
        }
    }

    /* compiled from: DialogMembersSearchCmd.kt */
    public static final /* synthetic */ class b {
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

    public /* synthetic */ qhm(Peer peer, String str, Source source, boolean z) {
        this(peer, str, 50, source, false, z);
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Peer peer;
        int i = b.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return g(w2wVar);
            }
            if (i == 3) {
                return g(w2wVar);
            }
            throw new NoWhenBranchMatchedException();
        }
        Collection values = ((ContactsSearchCmd.c) w2wVar.L0(this, new ContactsSearchCmd(this.c, new ContactsSearchCmd.a.b(), ContactsSearchCmd.MatchType.BY_NAME))).a.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof Contact) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l = ((Contact) it.next()).j;
            if (l != null) {
                long longValue = l.longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                peer = Peer.a.b(longValue);
            } else {
                peer = null;
            }
            if (peer != null) {
                arrayList2.add(peer);
            }
        }
        czh0 v = w2wVar.I0().v();
        Peer peer2 = this.b;
        ArrayList u0 = j5g.u0(v.r(peer2.b, this.c, StringMatchStrategy.ANY, this.d), arrayList2);
        if (u0.isEmpty()) {
            return new a(new ohm(), new ProfilesInfo());
        }
        ohm d = sn.c(w2wVar).d(peer2.b, u0, this.d);
        g5g.L(d.b, new lhm(0));
        return new a(d, f(w2wVar, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhm)) {
            return false;
        }
        qhm qhmVar = (qhm) obj;
        return epx.f(this.b, qhmVar.b) && epx.f(this.c, qhmVar.c) && epx.f(this.d, qhmVar.d) && this.e == qhmVar.e && this.f == qhmVar.f && this.g == qhmVar.g;
    }

    public final ProfilesInfo f(w2w w2wVar, ohm ohmVar) {
        if (!this.g) {
            return new ProfilesInfo();
        }
        g1e0.a aVar = new g1e0.a();
        aVar.i(ohmVar);
        aVar.b = Source.ACTUAL;
        aVar.c = this.f;
        return (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
    }

    public final a g(w2w w2wVar) {
        ohm ohmVar = ((urb) bz2.c(new rg20(this.b, this.c, this.d, w2wVar.Q0(), this.f), null)).a;
        ProfilesInfo f = f(w2wVar, ohmVar);
        sn.c(w2wVar).l(this.b.b, ohmVar);
        return new a(ohmVar, f);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c);
        Integer num = this.d;
        return Boolean.hashCode(this.g) + qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c((a2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.e), 31, this.f);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogMembersSearchCmd(peer=");
        sb.append(this.b);
        sb.append(", query=");
        sb.append(this.c);
        sb.append(", limit=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", withProfilesInfo=");
        return defpackage.q0.a(sb, this.g, ')');
    }

    public qhm(Peer peer, String str, Integer num, Source source, boolean z, boolean z2) {
        this.b = peer;
        this.c = str;
        this.d = num;
        this.e = source;
        this.f = z;
        this.g = z2;
    }
}
