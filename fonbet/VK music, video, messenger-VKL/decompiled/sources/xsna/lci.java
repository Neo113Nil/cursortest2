package xsna;

import android.net.Uri;
import android.util.SparseArray;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPhotoSizesDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.podcast.dto.PodcastCoverObjectDto;
import com.vk.api.generated.podcast.dto.PodcastEpisodeListDto;
import com.vk.api.generated.podcasts.dto.PodcastsGetGroupInfoResponseDto;
import com.vk.api.generated.podcasts.dto.PodcastsLegalNoticeDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.compose.component.skeleton.SkeletonType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.LegalNotice;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class lci implements yzs {
    public final /* synthetic */ int b;

    public /* synthetic */ lci(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c1, code lost:
    
        if (r7 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0217  */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatPermissions chatPermissions;
        ArrayList arrayList;
        Thumb thumb;
        int i;
        boolean z;
        PodcastsLegalNoticeDto j;
        LegalNotice legalNotice;
        UserSex userSex;
        SocialButtonType socialButtonType;
        String i2;
        switch (this.b) {
            case 0:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1425199732, intValue, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.ComposableSingletons$CheckoutContentKt.lambda$1425199732.<anonymous> (CheckoutContent.kt:99)");
                }
                x3c.a(txj0.d(ahn.E(q630.a.a, "checkout_blocking_progress"), 1.0f), aVar, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1482471895, intValue2, -1, "com.vk.community.design.compose.primaryblock.ComposableSingletons$PrimaryBlockServicesListContentImplKt.lambda$-1482471895.<anonymous> (PrimaryBlockServicesListContentImpl.kt:175)");
                    }
                    float f = Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE;
                    q630.a aVar3 = q630.a.a;
                    q630 F = s200.F(kqu0.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.v(aVar3, f));
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, F);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    xpy xpyVar = new xpy(1.0f, true);
                    float f2 = kqu0.v;
                    q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, xpyVar);
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.n, aVar2, 6);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, F2);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    SkeletonType skeletonType = SkeletonType.Block;
                    float f3 = 4;
                    akv0.a(skeletonType, txj0.s(rte0.d(aVar3, vog0.b(f3)), 195, 16), aVar2, 6);
                    f9t.e(txj0.h(aVar3, 5), aVar2, 6);
                    akv0.a(skeletonType, txj0.s(rte0.d(aVar3, vog0.b(f3)), 83, 14), aVar2, 6);
                    aVar2.G();
                    f9t.e(txj0.v(aVar3, f2), aVar2, 0);
                    akv0.a(skeletonType, txj0.q(rte0.d(aVar3, vog0.b(10)), 30), aVar2, 6);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                SQLiteStatement sQLiteStatement = (SQLiteStatement) obj;
                int intValue3 = ((Integer) obj3).intValue();
                ChatSettings chatSettings = ((com.vk.im.engine.models.dialogs.b) obj2).z;
                rdi.m(sQLiteStatement, intValue3, (chatSettings == null || (chatPermissions = chatSettings.B) == null) ? null : chatPermissions.c);
                return s3q0.a;
            case 3:
                rdi.i((SQLiteStatement) obj, ((Integer) obj3).intValue(), ((com.vk.im.engine.models.dialogs.b) obj2).z != null);
                return s3q0.a;
            default:
                PodcastsGetGroupInfoResponseDto podcastsGetGroupInfoResponseDto = (PodcastsGetGroupInfoResponseDto) obj;
                PodcastEpisodeListDto podcastEpisodeListDto = (PodcastEpisodeListDto) obj2;
                PodcastEpisodeListDto podcastEpisodeListDto2 = (PodcastEpisodeListDto) obj3;
                String k = podcastsGetGroupInfoResponseDto.k();
                String str = k == null ? "" : k;
                String f4 = podcastsGetGroupInfoResponseDto.f();
                AudioAudioDto p = podcastsGetGroupInfoResponseDto.p();
                MusicTrack d = p != null ? oc4.d(p) : null;
                List<UsersUserFullDto> g = podcastsGetGroupInfoResponseDto.g();
                int i3 = 1;
                if (g != null) {
                    List<UsersUserFullDto> list = g;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                    for (UsersUserFullDto usersUserFullDto : list) {
                        UserId s1 = usersUserFullDto.s1();
                        String obj4 = drm0.p0(usersUserFullDto.D0() + ' ' + usersUserFullDto.x1()).toString();
                        String r2 = usersUserFullDto.r2();
                        String r22 = usersUserFullDto.r2();
                        String a3 = (r22 == null || r22.length() <= 0) ? null : js5.a(glw.a().a(), r22);
                        String N0 = usersUserFullDto.N0();
                        String D1 = usersUserFullDto.D1();
                        String H0 = usersUserFullDto.H0();
                        BaseSexDto L2 = usersUserFullDto.L2();
                        if (L2 != null) {
                            UserSex.a aVar5 = UserSex.Companion;
                            Integer valueOf2 = Integer.valueOf(L2.i());
                            aVar5.getClass();
                            userSex = UserSex.a.a(valueOf2);
                            break;
                        }
                        userSex = UserSex.UNKNOWN;
                        UserSex userSex2 = userSex;
                        String D0 = usersUserFullDto.D0();
                        String x1 = usersUserFullDto.x1();
                        BaseBoolIntDto D3 = usersUserFullDto.D();
                        boolean z2 = (D3 == null || D3.i() != i3) ? 0 : i3;
                        BaseBoolIntDto j2 = usersUserFullDto.j();
                        boolean z3 = (j2 == null || j2.i() != i3) ? 0 : i3;
                        Boolean n1 = usersUserFullDto.n1();
                        Boolean bool = Boolean.TRUE;
                        boolean f5 = epx.f(n1, bool);
                        Integer o1 = usersUserFullDto.o1();
                        boolean z4 = (o1 != null && o1.intValue() == i3) ? i3 : 0;
                        UsersUserFullDto.SocialButtonTypeDto M2 = usersUserFullDto.M2();
                        if (M2 == null || (i2 = M2.i()) == null) {
                            socialButtonType = null;
                        } else {
                            SocialButtonType.Companion.getClass();
                            socialButtonType = SocialButtonType.a.a(i2);
                        }
                        Integer U0 = usersUserFullDto.U0();
                        Owner owner = new Owner(s1, obj4, r2, a3, null, null, N0, D1, H0, null, userSex2, D0, x1, z2, z3, f5, z4, socialButtonType, U0 != null ? U0.intValue() : 0, null, usersUserFullDto.J2(), false, 524848, null);
                        owner.g(4096, epx.f(usersUserFullDto.l0(), "banned"));
                        owner.B(epx.f(usersUserFullDto.h3(), bool));
                        arrayList2.add(owner);
                        i3 = 1;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                String i4 = podcastsGetGroupInfoResponseDto.i();
                String n = podcastsGetGroupInfoResponseDto.n();
                PodcastCoverObjectDto l = podcastsGetGroupInfoResponseDto.l();
                if (l != null) {
                    SparseArray sparseArray = new SparseArray();
                    List<AudioPhotoSizesDto> d2 = l.d();
                    if (d2 != null) {
                        for (AudioPhotoSizesDto audioPhotoSizesDto : d2) {
                            sparseArray.append(audioPhotoSizesDto.getWidth(), Uri.parse(audioPhotoSizesDto.d()));
                        }
                    }
                    thumb = new Thumb((SparseArray<Uri>) sparseArray);
                } else {
                    thumb = null;
                }
                Integer d3 = podcastsGetGroupInfoResponseDto.d();
                if (d3 == null) {
                    i = 1;
                } else {
                    i = 1;
                    if (d3.intValue() == 1) {
                        z = true;
                        Integer e = podcastsGetGroupInfoResponseDto.e();
                        boolean z5 = (e != null && e.intValue() == i) ? i : 0;
                        Integer B = podcastsGetGroupInfoResponseDto.B();
                        boolean z6 = (B != null && B.intValue() == i) ? i : 0;
                        Integer u = podcastsGetGroupInfoResponseDto.u();
                        boolean z7 = (u != null && u.intValue() == i) ? i : 0;
                        Integer o = podcastsGetGroupInfoResponseDto.o();
                        int intValue4 = o != null ? o.intValue() : 0;
                        j = podcastsGetGroupInfoResponseDto.j();
                        if (j != null) {
                            String title = j.getTitle();
                            if (title == null) {
                                title = "";
                            }
                            String d4 = j.d();
                            legalNotice = new LegalNotice(title, d4 != null ? d4 : "");
                        } else {
                            legalNotice = null;
                        }
                        return new ykb0.a(new PodcastInfo(str, f4, d, arrayList, i4, n, thumb, false, z, z5, z6, z7, intValue4, legalNotice), ykb0.F0(podcastEpisodeListDto), ykb0.F0(podcastEpisodeListDto2));
                    }
                }
                z = false;
                Integer e2 = podcastsGetGroupInfoResponseDto.e();
                if (e2 != null) {
                    Integer B2 = podcastsGetGroupInfoResponseDto.B();
                    if (B2 != null) {
                        Integer u2 = podcastsGetGroupInfoResponseDto.u();
                        if (u2 != null) {
                            Integer o2 = podcastsGetGroupInfoResponseDto.o();
                            if (o2 != null) {
                            }
                            j = podcastsGetGroupInfoResponseDto.j();
                            if (j != null) {
                            }
                            return new ykb0.a(new PodcastInfo(str, f4, d, arrayList, i4, n, thumb, false, z, z5, z6, z7, intValue4, legalNotice), ykb0.F0(podcastEpisodeListDto), ykb0.F0(podcastEpisodeListDto2));
                        }
                        Integer o22 = podcastsGetGroupInfoResponseDto.o();
                        if (o22 != null) {
                        }
                        j = podcastsGetGroupInfoResponseDto.j();
                        if (j != null) {
                        }
                        return new ykb0.a(new PodcastInfo(str, f4, d, arrayList, i4, n, thumb, false, z, z5, z6, z7, intValue4, legalNotice), ykb0.F0(podcastEpisodeListDto), ykb0.F0(podcastEpisodeListDto2));
                    }
                    Integer u22 = podcastsGetGroupInfoResponseDto.u();
                    if (u22 != null) {
                    }
                    Integer o222 = podcastsGetGroupInfoResponseDto.o();
                    if (o222 != null) {
                    }
                    j = podcastsGetGroupInfoResponseDto.j();
                    if (j != null) {
                    }
                    return new ykb0.a(new PodcastInfo(str, f4, d, arrayList, i4, n, thumb, false, z, z5, z6, z7, intValue4, legalNotice), ykb0.F0(podcastEpisodeListDto), ykb0.F0(podcastEpisodeListDto2));
                }
                Integer B22 = podcastsGetGroupInfoResponseDto.B();
                if (B22 != null) {
                }
                Integer u222 = podcastsGetGroupInfoResponseDto.u();
                if (u222 != null) {
                }
                Integer o2222 = podcastsGetGroupInfoResponseDto.o();
                if (o2222 != null) {
                }
                j = podcastsGetGroupInfoResponseDto.j();
                if (j != null) {
                }
                return new ykb0.a(new PodcastInfo(str, f4, d, arrayList, i4, n, thumb, false, z, z5, z6, z7, intValue4, legalNotice), ykb0.F0(podcastEpisodeListDto), ykb0.F0(podcastEpisodeListDto2));
        }
    }
}
