package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.toggle.b;
import com.vk.video.profile.presentation.a;
import com.vk.video.profile.presentation.f;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoverySideEffect;
import com.vk.video.ui.discovery.minimizable.n;
import com.vk.video.ui.discovery.recommendations.b;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONArray;
import xsna.b9a0;
import xsna.gm50;
import xsna.ikv0;
import xsna.rtb0;
import xsna.tlo0;
import xsna.tsb0;
import xsna.w9i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7a0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q7a0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v63, types: [T, com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem$SharingChannel, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = false;
        int i2 = 2;
        int i3 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.photos.root.photoflow.presentation.b bVar = (com.vk.photos.root.photoflow.presentation.b) obj3;
                bVar.h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_error_on_move), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new ig1(25, bVar, (a.f) obj2), null, 32)));
                break;
            case 1:
                ((m8b0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                break;
            case 2:
                PollAttachment pollAttachment = (PollAttachment) obj3;
                rtb0.a aVar = (rtb0.a) obj;
                ysg0.b.a(new zrb0(aVar.a));
                pollAttachment.f = aVar.a;
                ((lsb0) obj2).U(new tsb0.a(pollAttachment));
                break;
            case 3:
                ((exd0) obj3).j7((ox6) obj2, (List) obj);
                break;
            case 4:
                ((l9f0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                break;
            case 5:
                r9i0 r9i0Var = (r9i0) obj3;
                ixi0 ixi0Var = (ixi0) obj2;
                w9i0.d dVar = (w9i0.d) obj;
                int i4 = r9i0.j1;
                gm50.a.a(r9i0Var, dVar.a, new hb40(ixi0Var, 17));
                gm50.a.a(r9i0Var, dVar.b, new nl30(ixi0Var, 23));
                gm50.a.a(r9i0Var, dVar.c, new ie90(ixi0Var, 12));
                gm50.a.a(r9i0Var, dVar.d, new lxz(ixi0Var, 26));
                break;
            case 6:
                ((r6n0) obj3).b.g((hyg0) obj, (ArrayList) obj2);
                break;
            case 7:
                UserProfileHeaderView userProfileHeaderView = (UserProfileHeaderView) obj3;
                slq0 slq0Var = (slq0) obj2;
                if (userProfileHeaderView.A.getTransformFraction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    nlf0 nlf0Var = new nlf0(userProfileHeaderView, 8);
                    RectF o = zjq.o(userProfileHeaderView.A.getTitleRect());
                    Rect rect = new Rect();
                    o.roundOut(rect);
                    slq0Var.a(new UserProfileAction.m.a(nlf0Var, rect));
                    z = true;
                }
                break;
            case 8:
                d0r0 d0r0Var = (d0r0) obj3;
                UserId userId = (UserId) obj2;
                b.c cVar = (b.c) obj;
                break;
            case 9:
                ((ikv0) obj).a();
                ((VideoCatalogAlbumBottomSheetRedesign) obj3).d((FragmentActivity) obj2, true);
                break;
            case 10:
                ((com.vk.video.ui.discovery.recommendations.b) obj3).b((b.a) obj, false, (com.vk.lists.c) obj2, true);
                break;
            case 11:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj3;
                gVar.T(new n.a(com.vk.video.ui.discovery.minimizable.g.c1(gVar, (com.vk.video.ui.discovery.minimizable.q) obj2, null, Boolean.FALSE, 2)));
                gVar.J.b(VideoMinimizableDiscoverySideEffect.b.a);
                break;
            case 12:
                ud8 ud8Var = ((e8t0) obj3).e;
                ((a.c) obj2).getClass();
                ud8Var.invoke(new f.a.b());
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
            case 13:
                fxc0.B().Y().D(((ikv0.a) obj3).a, true);
                ikv0 ikv0Var = ((nht0) obj2).f;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                break;
            case 14:
                Map map = (Map) obj2;
                w9y w9yVar = (w9y) obj;
                Long l = ((StartPlayVkMixSource) obj3).l;
                if (l != null) {
                    w9yVar.e(String.valueOf(l), "id");
                }
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        w9yVar.e(new JSONArray((Collection) entry.getValue()), (String) entry.getKey());
                    }
                }
                break;
            case 15:
                oyw0 oyw0Var = (oyw0) obj2;
                ?? r1 = MobileOfficialAppsCallsStat$TypeVoipCallItem.SharingChannel.OTHER;
                ((Ref$ObjectRef) obj3).element = r1;
                oyw0Var.f.invoke(oyw0Var.b, r1);
                Context context = oyw0Var.a;
                Intent createChooser = Intent.createChooser(oyw0.a(context, oyw0Var.c), null);
                if (createChooser != null) {
                    context.startActivity(createChooser);
                    s3q0 s3q0Var = s3q0.a;
                }
                break;
            default:
                WebApiApplication webApiApplication = (WebApiApplication) obj3;
                String str = (String) obj2;
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                FragmentActivity activity = fragmentImpl.getActivity();
                if (activity != null) {
                    int i5 = VkFriendsPickerActivity.p;
                    fragmentImpl.startActivityForResult(VkFriendsPickerActivity.a.a(activity, webApiApplication.b, str), Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE);
                }
                break;
        }
        return s3q0.a;
    }
}
