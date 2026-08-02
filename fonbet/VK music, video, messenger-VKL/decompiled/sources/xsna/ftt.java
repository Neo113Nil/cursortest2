package xsna;

import com.vk.api.generated.channels.dto.ChannelsGetOwnersForCreateResponseDto;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: GetOwnersForCreateCmd.kt */
/* loaded from: classes16.dex */
public final class ftt extends le6<b> {
    public final Source b;

    /* compiled from: GetOwnersForCreateCmd.kt */
    public static final class a extends nx2<ChannelsGetOwnersForCreateResponseDto> {
        @Override // xsna.nx2
        public final ChannelsGetOwnersForCreateResponseDto f(l7r0 l7r0Var) {
            return (ChannelsGetOwnersForCreateResponseDto) bz2.d(new tfx("channels.getOwnersForCreate", new up(6), new iq(4)));
        }
    }

    /* compiled from: GetOwnersForCreateCmd.kt */
    public static final class b {
        public final User a;
        public final List<Group> b;
        public final ArrayList c;

        public b(User user, List list, ArrayList arrayList) {
            this.a = user;
            this.b = list;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c.equals(bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Response(user=");
            sb.append(this.a);
            sb.append(", groups=");
            sb.append(this.b);
            sb.append(", canSelectIds=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    public ftt(Source source) {
        this.b = source;
    }

    @Override // xsna.le6
    public final b e(w2w w2wVar) {
        ChannelsGetOwnersForCreateResponseDto channelsGetOwnersForCreateResponseDto = (ChannelsGetOwnersForCreateResponseDto) bz2.c(new a(), null);
        List<UserId> e = channelsGetOwnersForCreateResponseDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        Iterator<T> it = e.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((UserId) it.next()).b));
        }
        List<UserId> d = channelsGetOwnersForCreateResponseDto.d();
        ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
        Iterator<T> it2 = d.iterator();
        while (it2.hasNext()) {
            arrayList2.add(com.vk.dto.common.a.a((UserId) it2.next()));
        }
        ProfilesInfo profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new e1e0(arrayList2, Source.ACTUAL, true)));
        return new b((User) j5g.X(profilesInfo.b.c.values()), j5g.D0(new com.vk.channels.impl.channelselection.a(arrayList), j5g.O0(profilesInfo.e.c.values())), arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftt) && this.b == ((ftt) obj).b;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "GetOwnersForCreateCmd(source=" + this.b + ')';
    }
}
