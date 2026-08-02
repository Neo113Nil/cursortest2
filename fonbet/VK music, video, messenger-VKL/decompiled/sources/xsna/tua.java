package xsna;

import android.net.Uri;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.channels.ChannelBanInfo;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.AgeLimits;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.engine.models.groups.MemberStatus;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.UserStorageModel;
import xsna.q2o;

/* compiled from: ChannelBuilder.kt */
/* loaded from: classes2.dex */
public final class tua {
    public static Channel a(bdb bdbVar, Group group) {
        boolean z;
        ChannelType channelType;
        long j;
        AdminLevel adminLevel = group.q;
        int i = bdbVar.e;
        int i2 = bdbVar.d;
        boolean z2 = i > i2;
        int i3 = z2 ? i : i2;
        int i4 = z2 ? bdbVar.g : bdbVar.f;
        long j2 = bdbVar.b;
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        ImageList a = ImageList.a.a(bdbVar.C);
        String str = bdbVar.B;
        String str2 = group.d;
        boolean z3 = group.q9().b;
        String str3 = group.n;
        int i5 = bdbVar.c;
        int i6 = bdbVar.e;
        int i7 = bdbVar.g;
        int i8 = bdbVar.h;
        boolean z4 = bdbVar.l;
        boolean z5 = bdbVar.m;
        boolean z6 = bdbVar.o;
        ChannelNotificationsSettings channelNotificationsSettings = bdbVar.p;
        ChannelNotificationsSettings channelNotificationsSettings2 = bdbVar.q;
        aeb aebVar = bdbVar.k;
        ChannelActionInProgress channelActionInProgress = bdbVar.t;
        AdminLevel adminLevel2 = bdbVar.E;
        AdminLevel adminLevel3 = adminLevel2 == null ? adminLevel : adminLevel2;
        String str4 = group.r;
        boolean z7 = group.s;
        Boolean bool = bdbVar.D;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = adminLevel == AdminLevel.ADMIN || adminLevel == AdminLevel.EDITOR;
        }
        Long l = bdbVar.u;
        ChannelType channelType2 = bdbVar.v;
        Long l2 = bdbVar.w;
        if (l2 != null) {
            long longValue = l2.longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            channelType = channelType2;
            j = -Peer.a.d(longValue);
        } else {
            channelType = channelType2;
            j = bdbVar.b;
        }
        Serializer.c<Peer> cVar3 = Peer.CREATOR;
        Peer b = Peer.a.b(j);
        GroupPrivacy groupPrivacy = group.t;
        ChannelBanInfo channelBanInfo = bdbVar.x;
        MemberStatus.a aVar = MemberStatus.Companion;
        Integer valueOf = Integer.valueOf(group.p);
        aVar.getClass();
        MemberStatus a2 = MemberStatus.a.a(valueOf);
        boolean z8 = bdbVar.H;
        String str5 = group.u;
        return new Channel(j2, a, str, str2, z3, str3, i5, i3, i6, i4, i7, i8, z4, z5, z6, channelNotificationsSettings, channelNotificationsSettings2, aebVar, channelActionInProgress, adminLevel3, str4, z7, z, l, channelType, b, groupPrivacy, channelBanInfo, a2, z8, brm0.B(str5, "https://", false) ? Uri.parse(str5).getHost() : null, bdbVar.y, bdbVar.z, bdbVar.A, group.A, bdbVar.G, group.C, group.D, bdbVar.I, bdbVar.J);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r1 == null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Channel b(bdb bdbVar, UserStorageModel userStorageModel) {
        Peer peer;
        int i = bdbVar.e;
        int i2 = bdbVar.d;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        int i4 = z ? bdbVar.g : bdbVar.f;
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        ImageList a = ImageList.a.a(bdbVar.C);
        String str = bdbVar.B;
        long j = bdbVar.b;
        String str2 = userStorageModel.d;
        boolean z2 = userStorageModel.j;
        int i5 = bdbVar.c;
        int i6 = bdbVar.e;
        int i7 = bdbVar.g;
        int i8 = bdbVar.h;
        boolean z3 = bdbVar.l;
        boolean z4 = bdbVar.m;
        boolean z5 = bdbVar.o;
        ChannelNotificationsSettings channelNotificationsSettings = bdbVar.p;
        ChannelNotificationsSettings channelNotificationsSettings2 = bdbVar.q;
        aeb aebVar = bdbVar.k;
        ChannelActionInProgress channelActionInProgress = bdbVar.t;
        AdminLevel adminLevel = bdbVar.E;
        if (adminLevel == null) {
            adminLevel = AdminLevel.NONE;
        }
        AdminLevel adminLevel2 = adminLevel;
        boolean z6 = !z5 && userStorageModel.P;
        Boolean bool = bdbVar.D;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Long l = bdbVar.u;
        ChannelType channelType = bdbVar.v;
        Long l2 = bdbVar.w;
        if (l2 != null) {
            long longValue = l2.longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            peer = Peer.a.b(longValue);
        }
        peer = Peer.Unknown.e;
        return new Channel(j, a, str, str2, z2, "", i5, i3, i6, i4, i7, i8, z3, z4, z5, channelNotificationsSettings, channelNotificationsSettings2, aebVar, channelActionInProgress, adminLevel2, "", z6, booleanValue, l, channelType, peer, GroupPrivacy.OPEN, bdbVar.x, MemberStatus.UNKNOWN, bdbVar.H, null, bdbVar.y, bdbVar.z, bdbVar.A, bdbVar.F ? AgeLimits.OVER_18 : AgeLimits.NO_AGE_RESTRICTION, bdbVar.G, false, false, bdbVar.I, bdbVar.J);
    }

    public static Channel c(eeb eebVar, Group group) {
        q2o.a aVar;
        yta ytaVar = eebVar.a;
        Msg msg = eebVar.b;
        long j = ytaVar.a;
        mzq0 mzq0Var = ytaVar.e;
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        ImageList a = ImageList.a.a(ytaVar.b);
        String str = ytaVar.c;
        String str2 = group.d;
        boolean z = group.q9().b;
        String str3 = group.n;
        int i = msg != null ? msg.d : 0;
        m7f0 m7f0Var = mzq0Var.b;
        int i2 = m7f0Var.a;
        int i3 = m7f0Var.b;
        int i4 = ytaVar.i;
        boolean z2 = mzq0Var.c;
        boolean z3 = mzq0Var.d;
        int i5 = i;
        boolean z4 = mzq0Var.e;
        ChannelNotificationsSettings channelNotificationsSettings = mzq0Var.a;
        aeb aebVar = aeb.d;
        ChannelActionInProgress channelActionInProgress = ChannelActionInProgress.NONE;
        AdminLevel adminLevel = mzq0Var.h;
        String str4 = group.r;
        boolean z5 = group.s;
        boolean booleanValue = mzq0Var.g.booleanValue();
        ChannelType.a aVar2 = ChannelType.Companion;
        String str5 = ytaVar.f;
        aVar2.getClass();
        ChannelType a2 = ChannelType.a.a(str5);
        long j2 = -group.b;
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        Peer b = Peer.a.b(j2);
        GroupPrivacy groupPrivacy = group.t;
        ChannelBanInfo channelBanInfo = mzq0Var.f;
        MemberStatus.a aVar3 = MemberStatus.Companion;
        Integer valueOf = Integer.valueOf(group.p);
        aVar3.getClass();
        MemberStatus a3 = MemberStatus.a.a(valueOf);
        boolean z6 = mzq0Var.j;
        String str6 = group.u;
        String host = brm0.B(str6, "https://", false) ? Uri.parse(str6).getHost() : null;
        Integer num = ytaVar.j;
        Boolean bool = ytaVar.k;
        String str7 = ytaVar.l;
        AgeLimits ageLimits = group.A;
        boolean z7 = mzq0Var.i;
        boolean z8 = group.C;
        boolean z9 = group.D;
        q2o q2oVar = ytaVar.n;
        return new Channel(j, a, str, str2, z, str3, i5, i2, 0, i3, 0, i4, z2, z3, z4, channelNotificationsSettings, null, aebVar, channelActionInProgress, adminLevel, str4, z5, booleanValue, null, a2, b, groupPrivacy, channelBanInfo, a3, z6, host, num, bool, str7, ageLimits, z7, z8, z9, q2oVar != null ? q2oVar.b : false, (q2oVar == null || (aVar = q2oVar.c) == null) ? 0 : aVar.a);
    }
}
