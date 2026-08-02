package xsna;

import android.util.LruCache;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesDto;
import com.vk.api.generated.base.dto.BaseRepostsInfoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoGetCommentsResponseDto;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoLiveHeartbeatResponseDto;
import com.vk.api.generated.video.dto.VideoLiveSpectatorsDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.community.design.view.components.compose.a;
import com.vk.voip.dto.broadcast.VoipBroadcastStatus;
import com.vk.voip.dto.profiles.VoipSex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.sew0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class qe8 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v30, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.util.ArrayList] */
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        VoipBroadcastStatus voipBroadcastStatus;
        ?? r11;
        ?? r8;
        Integer d;
        Integer P0;
        int i = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                se8 se8Var = (se8) obj4;
                bv6 bv6Var = (bv6) obj2;
                bv6 bv6Var2 = (bv6) obj3;
                Object obj5 = ((bv6) obj).a;
                if (obj5 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                VideoLiveHeartbeatResponseDto videoLiveHeartbeatResponseDto = (VideoLiveHeartbeatResponseDto) obj5;
                Object obj6 = bv6Var.a;
                if (obj6 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                VideoGetCommentsResponseDto videoGetCommentsResponseDto = (VideoGetCommentsResponseDto) obj6;
                Object obj7 = bv6Var2.a;
                if (obj7 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                boolean booleanValue = ((Boolean) se8Var.b.invoke()).booleanValue();
                VideoVideoFullDto videoVideoFullDto = (VideoVideoFullDto) j5g.a0(((VideoGetResponseDto) obj7).e());
                if (videoVideoFullDto == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String valueOf = String.valueOf(videoVideoFullDto.s1());
                String valueOf2 = String.valueOf(videoVideoFullDto.q());
                String X1 = videoVideoFullDto.X1();
                String str2 = X1 == null ? "" : X1;
                VideoLiveStatusDto L1 = videoVideoFullDto.L1();
                if (L1 == null || (str = L1.i()) == null) {
                    str = "";
                }
                switch (str.hashCode()) {
                    case -1897185151:
                        if (str.equals(X3.i.d0)) {
                            voipBroadcastStatus = VoipBroadcastStatus.STARTED;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    case -1281977283:
                        if (str.equals("failed")) {
                            voipBroadcastStatus = VoipBroadcastStatus.FAILED;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    case -673660814:
                        if (str.equals("finished")) {
                            voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    case 3322092:
                        if (str.equals("live")) {
                            voipBroadcastStatus = VoipBroadcastStatus.LIVE;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    case 1116313165:
                        if (str.equals("waiting")) {
                            voipBroadcastStatus = VoipBroadcastStatus.WAITING;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    case 1306691868:
                        if (str.equals("upcoming")) {
                            voipBroadcastStatus = VoipBroadcastStatus.UPCOMING;
                            break;
                        }
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                    default:
                        voipBroadcastStatus = VoipBroadcastStatus.FINISHED;
                        break;
                }
                VoipBroadcastStatus voipBroadcastStatus2 = voipBroadcastStatus;
                List<VideoVideoImageDto> t1 = videoVideoFullDto.t1();
                if (t1 != null) {
                    List<VideoVideoImageDto> list = t1;
                    r11 = new ArrayList(c5g.u(list, 10));
                    for (VideoVideoImageDto videoVideoImageDto : list) {
                        r11.add(new eqw0(videoVideoImageDto.getWidth(), videoVideoImageDto.getHeight(), videoVideoImageDto.getUrl()));
                    }
                } else {
                    r11 = EmptyList.b;
                }
                Collection collection = r11;
                String title = videoVideoFullDto.getTitle();
                String str3 = title == null ? "" : title;
                Integer E1 = videoVideoFullDto.E1();
                long j = 1000;
                long intValue = ((E1 == null && (E1 = videoVideoFullDto.F0()) == null) ? 0L : E1.intValue()) * j;
                long intValue2 = ((videoVideoFullDto.L1() != VideoLiveStatusDto.FINISHED || (P0 = videoVideoFullDto.P0()) == null) ? 0L : P0.intValue()) * j;
                Integer V2 = videoVideoFullDto.V2();
                int intValue3 = V2 != null ? V2.intValue() : 0;
                BaseLikesDto y1 = videoVideoFullDto.y1();
                int intValue4 = (y1 == null || (d = y1.d()) == null) ? 0 : d.intValue();
                int count = videoGetCommentsResponseDto.getCount();
                BaseRepostsInfoDto E2 = videoVideoFullDto.E2();
                int count2 = E2 != null ? E2.getCount() : 0;
                List<UsersUserFullDto> d2 = videoLiveHeartbeatResponseDto.d();
                if (d2 != null) {
                    List<UsersUserFullDto> list2 = d2;
                    r8 = new ArrayList(c5g.u(list2, 10));
                    for (UsersUserFullDto usersUserFullDto : list2) {
                        String valueOf3 = String.valueOf(usersUserFullDto.s1().b);
                        LruCache<String, fxj0> lruCache = sew0.a;
                        sew0 d3 = sew0.a.d(m4s.G(usersUserFullDto.D0() + ' ' + usersUserFullDto.x1() + ':' + usersUserFullDto.s1()), r4, usersUserFullDto.r2(), r4, rq.a(usersUserFullDto, new StringBuilder(), ' '));
                        BaseSexDto L2 = usersUserFullDto.L2();
                        int i2 = L2 == null ? -1 : s860.$EnumSwitchMapping$0[L2.ordinal()];
                        VoipSex voipSex = i2 != 1 ? i2 != 2 ? VoipSex.UNKNOWN : VoipSex.MALE : VoipSex.FEMALE;
                        Boolean o3 = usersUserFullDto.o3();
                        Boolean bool = Boolean.TRUE;
                        boolean f = epx.f(o3, bool);
                        boolean z = usersUserFullDto.g3() == BaseBoolIntDto.YES;
                        boolean z2 = usersUserFullDto.l0() != null;
                        boolean f2 = epx.f(usersUserFullDto.T2(), bool);
                        boolean f3 = epx.f(usersUserFullDto.o(), bool);
                        String D0 = usersUserFullDto.D0();
                        String str4 = D0 == null ? "" : D0;
                        String x1 = usersUserFullDto.x1();
                        String str5 = x1 == null ? "" : x1;
                        String M = usersUserFullDto.M();
                        r8.add(new svw0(valueOf3, d3, voipSex, f, z, z2, f2, f3, str4, str5, M == null ? "" : M, booleanValue));
                        r4 = false;
                    }
                } else {
                    r8 = EmptyList.b;
                }
                Collection collection2 = r8;
                VideoLiveSpectatorsDto e = videoLiveHeartbeatResponseDto.e();
                int count3 = e != null ? e.getCount() : 0;
                Integer a0 = videoVideoFullDto.a0();
                return new dfw0(valueOf, valueOf2, str2, voipBroadcastStatus2, collection, str3, intValue, intValue2, intValue3, null, null, intValue4, count, count2, collection2, count3, a0 != null && a0.intValue() == 1, videoVideoFullDto.C() == BaseBoolIntDto.YES);
            case 1:
                a.C0722a c0722a = (a.C0722a) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if (aVar.t(intValue5 & 1, (intValue5 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1787146860, intValue5, -1, "com.vk.community.design.view.components.compose.CommunityCardActionButton.Default.Content.<anonymous> (CommunityCard.kt:290)");
                    }
                    String str6 = c0722a.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str6, null, 0L, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.h0, aVar, 0, 0, 8190);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                String str7 = (String) obj4;
                spg0 spg0Var = (spg0) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= aVar2.J(spg0Var) ? 4 : 2;
                }
                if (aVar2.t(intValue6 & 1, (intValue6 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(462076287, intValue6, -1, "com.vk.core.compose.component.VkPanelHeader.<anonymous> (VkTopBar.kt:389)");
                    }
                    muv0.d(spg0Var, str7, null, aVar2, intValue6 & 14);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }
}
