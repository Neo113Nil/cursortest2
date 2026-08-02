package xsna;

import com.vk.api.generated.messages.dto.MessagesGetRankedSharingPeersResponseDto;
import com.vk.common.api.generated.GsonHolder;
import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: RemoteRangedDialogsGetCmd.kt */
/* loaded from: classes2.dex */
public final class vvf0 extends le6<a> {
    public final Integer b;

    /* compiled from: RemoteRangedDialogsGetCmd.kt */
    public static final class a {
        public final Collection<Dialog> a;
        public final ProfilesInfo b;

        public a(Collection<Dialog> collection, ProfilesInfo profilesInfo) {
            this.a = collection;
            this.b = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(dialogs=");
            sb.append(this.a);
            sb.append(", profiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
        }
    }

    public vvf0(Integer num) {
        this.b = num;
    }

    public static MessagesGetRankedSharingPeersResponseDto f() {
        Object failure;
        MessagesGetRankedSharingPeersResponseDto messagesGetRankedSharingPeersResponseDto = (MessagesGetRankedSharingPeersResponseDto) bz2.c(bz2.n(new tfx("messages.getRankedSharingPeers", new ao(23), new bo(25)), bz2.a), "RemoteRangedDialogsGetCmd");
        try {
            Preference.H("remote_ranged_dialogs_prefs", "response", GsonHolder.a().toJson(messagesGetRankedSharingPeersResponseDto));
            Preference.F(System.currentTimeMillis(), "remote_ranged_dialogs_prefs", "last_ts");
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            L.i(a2);
        }
        return messagesGetRankedSharingPeersResponseDto;
    }

    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        Object failure;
        MessagesGetRankedSharingPeersResponseDto messagesGetRankedSharingPeersResponseDto;
        String s;
        List<UserId> d;
        List<UserId> list = null;
        if (System.currentTimeMillis() - Preference.m(0L, "remote_ranged_dialogs_prefs", "last_ts") < 3600000) {
            try {
                s = Preference.s("remote_ranged_dialogs_prefs", "response", new String());
                failure = s.length() > 0 ? (MessagesGetRankedSharingPeersResponseDto) GsonHolder.a().fromJson(s, MessagesGetRankedSharingPeersResponseDto.class) : null;
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Throwable a2 = Result.a(failure);
            if (a2 != null) {
                L.i(a2);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            messagesGetRankedSharingPeersResponseDto = (MessagesGetRankedSharingPeersResponseDto) failure;
            if (messagesGetRankedSharingPeersResponseDto == null) {
                messagesGetRankedSharingPeersResponseDto = f();
            }
        } else {
            messagesGetRankedSharingPeersResponseDto = f();
        }
        if (messagesGetRankedSharingPeersResponseDto == null) {
            d = EmptyList.b;
        } else {
            Integer num = this.b;
            if (num != null && num.intValue() == 7) {
                list = messagesGetRankedSharingPeersResponseDto.f();
            } else if (num != null && num.intValue() == 31) {
                list = messagesGetRankedSharingPeersResponseDto.g();
            } else if (num != null && num.intValue() == 49) {
                list = messagesGetRankedSharingPeersResponseDto.e();
            }
            List<UserId> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                d = messagesGetRankedSharingPeersResponseDto.d();
                if (d == null) {
                    d = EmptyList.b;
                }
            } else {
                d = list;
            }
        }
        if (d.isEmpty()) {
            return new a(EmptyList.b, new ProfilesInfo());
        }
        Source source = Source.ACTUAL;
        List<UserId> list3 = d;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        for (UserId userId : list3) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(userId.b));
        }
        ipm ipmVar = (ipm) w2wVar.J0(this, new uqm(new sqm(arrayList, source, false, null, 0, 28))).await();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            Dialog dialog = (Dialog) ipmVar.a.c.get(Long.valueOf(((UserId) it.next()).b));
            if (dialog != null) {
                arrayList2.add(dialog);
            }
        }
        return new a(arrayList2, ipmVar.b);
    }

    public final boolean equals(Object obj) {
        return true;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return 0;
    }

    @Override // xsna.e1w
    public final String toString() {
        return "RemoteRangedDialogsGetCmd";
    }
}
