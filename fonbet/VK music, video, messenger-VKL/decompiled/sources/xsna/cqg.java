package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.video.playlist.playlistscreen.ui.entity.NotificationsState;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import xsna.gfp0;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cqg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cqg(int i, int i2, Object obj, Object obj2, xzs xzsVar) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = xzsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((com.vk.profile.community.details.impl.contacts.h) this.d).k((eqg) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((s7h) this.d).h((t7h) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 2:
                ((Integer) obj2).getClass();
                u6t.a((tet) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 3:
                krx krxVar = (krx) this.d;
                izs izsVar = (izs) this.c;
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1545326873, intValue, -1, "com.vk.friends.groupinvite.impl.ui.InviteFriendsMviView.InviteFriendsContent.<anonymous> (InviteFriendsMviView.kt:111)");
                    }
                    nrx.b(krxVar, (u7p0) mtk0Var.getValue(), null, izsVar, aVar, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                siy.a((gfp0.b.a) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 5:
                gmq gmqVar = (gmq) this.d;
                VideoFile videoFile = (VideoFile) this.e;
                p960 p960Var = (p960) this.c;
                Throwable th = (Throwable) obj2;
                ((VideoAttachment) gmqVar).Ob((VideoFile) obj);
                if (th != null) {
                    videoFile.Xa(false);
                }
                ((NewsFeedComponent) p960Var.a.getValue()).w().e(120, gmqVar);
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((ne60) this.d).j((oe60) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(513));
                break;
            case 7:
                zdb0 zdb0Var = (zdb0) this.d;
                dlv0 dlv0Var = (dlv0) this.e;
                final izs izsVar2 = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1659852667, intValue2, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenView.<anonymous>.<anonymous> (PlaylistScreenView.kt:75)");
                    }
                    final NotificationsState notificationsState = zdb0Var.d;
                    if (notificationsState == null) {
                        aVar2.K(712377101);
                    } else {
                        aVar2.K(712377102);
                        zkv0.d(dlv0Var, null, kai.c(-1899808221, new yzs() { // from class: xsna.vdb0
                            @Override // xsna.yzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                if (aVar3.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-1899808221, intValue3, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PlaylistScreenView.kt:77)");
                                    }
                                    fk70.a(NotificationsState.this, null, izsVar2, aVar3, 0);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), aVar2, 390, 2);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                bld0.a((eld0) this.d, (izs) this.c, (q630) this.e, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
            case 9:
                ((Integer) obj2).getClass();
                n8i0.a((h8i0) this.d, (q630) this.e, (gzs) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                AboutVideoItem.a0 a0Var = (AboutVideoItem.a0) this.d;
                gzs gzsVar = (gzs) this.e;
                gzs gzsVar2 = (gzs) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1010552899, intValue3, -1, "com.vk.video.ui.discovery.minimizable.banner_trap.TrapBannerContent.<anonymous> (TrapBannerDelegate.kt:91)");
                    }
                    q630 h = txj0.h(rte0.d(s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 1, q630.a.a), vog0.b(12)), 100);
                    com.vk.core.compose.component.cell.content.j0 a = Cell$Left.Main.a.C0731a.a(wli.a, aVar3);
                    com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(a0Var.b, null, null, 0, null, null, aVar3, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, aVar3, 196608, 30);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                    }
                    lg90 b = or.b(aVar3, 1833859693, R.drawable.vk_icon_cancel_24, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    wiu0.b(h, false, a, a2, o.c.a(null, com.vk.core.compose.component.cell.content.p.a(b, ylu0Var.getIcon().l, 0L, null, gzsVar, null, aVar3, 1572872, 44), null, null, null, aVar3, 61), gzsVar2, null, aVar3, 0, 66);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cqg(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.d = obj;
        this.c = izsVar;
        this.e = q630Var;
    }

    public /* synthetic */ cqg(AboutVideoItem.a0 a0Var, gzs gzsVar, gzs gzsVar2) {
        this.b = 10;
        this.d = a0Var;
        this.e = gzsVar;
        this.c = gzsVar2;
    }

    public /* synthetic */ cqg(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
    }

    public /* synthetic */ cqg(krx krxVar, izs izsVar, wh50 wh50Var) {
        this.b = 3;
        this.d = krxVar;
        this.c = izsVar;
        this.e = wh50Var;
    }
}
