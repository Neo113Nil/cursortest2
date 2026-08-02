package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.clips.sdk.shared.api.analytics.ClipsBottomSheetSideEffectOptions;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.tools.VkViewStub;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.im.engine.models.upload.ResumableAttachUploadInfo;
import com.vk.music.screens.about.entity.CommunityProfileLinksState;
import com.vk.profile.community.details.links.feature.CommunityProfileLinksArgs;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.voip.ui.assessment.VoipAssessmentActivity;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.bex0;
import xsna.cco;
import xsna.dai;
import xsna.kow0;
import xsna.m5u;
import xsna.me5;
import xsna.qtt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class oe5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oe5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.core.q U;
        List list;
        WebApiApplication v;
        fvk initialize$lambda$220$lambda$27;
        int i = this.b;
        int i2 = 7;
        int i3 = 2;
        boolean z = false;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((izs) obj2).invoke(new me5.a(((ne5) obj).b));
                break;
            case 1:
                zo6 zo6Var = (zo6) obj2;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                String str = webApiApplication.D;
                int i4 = 3;
                if (!webApiApplication.g() || str == null || str.length() == 0) {
                    vdx0 vdx0Var = e370.e;
                    U = (vdx0Var != null ? vdx0Var : null).d().X(String.valueOf(webApiApplication.b)).U(new j7(new qt0(i4), i4));
                } else {
                    U = io.reactivex.rxjava3.core.q.T(str);
                }
                zo6Var.e.b(U.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f50(new rh4(i3, zo6Var, webApiApplication), i2), new lf1(new kf1(zo6Var, i3), i4)));
                break;
            case 2:
                ResumableAttachUploadInfo resumableAttachUploadInfo = (ResumableAttachUploadInfo) obj;
                break;
            case 3:
                ((d3h) obj2).f((View) obj, CommunityActionTags.JOIN);
                break;
            case 4:
                cih cihVar = (cih) obj2;
                break;
            case 5:
                CommunityProfileLinksArgs communityProfileLinksArgs = (CommunityProfileLinksArgs) obj;
                CommunityProfileLinksState communityProfileLinksState = (CommunityProfileLinksState) ((gzs) obj2).invoke();
                if (communityProfileLinksState == null) {
                    if (communityProfileLinksArgs == null || (list = communityProfileLinksArgs.b) == null) {
                        list = EmptyList.b;
                    }
                    communityProfileLinksState = new CommunityProfileLinksState(list);
                    break;
                }
                break;
            case 6:
                ((izs) obj2).invoke(new bjj((String) obj));
                break;
            case 7:
                hgm hgmVar = (hgm) obj2;
                VkImageSimple vkImageSimple = new VkImageSimple(hgmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_verified_icon);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setScaleType(ImageView.ScaleType.CENTER);
                int i5 = hgmVar.h0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i5, i5, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                ((ViewGroup) obj).addView(vkImageSimple);
                break;
            case 8:
                ((dai.d) ((cco.b) obj2).b.getValue()).c.invoke((DonutVideoAction) obj);
                break;
            case 9:
                ic30 ic30Var = (ic30) obj;
                ((androidx.compose.runtime.c) obj2).s0(ic30Var.a, ic30Var.g, ic30Var.b, true);
                break;
            case 10:
                sop sopVar = ((z5u) obj2).l;
                k7u k7uVar = ((q5u) obj).b;
                sopVar.invoke(new m5u.r(k7uVar, k7uVar.a.J, false, -1));
                break;
            case 11:
                break;
            case 12:
                hx40 hx40Var = (hx40) obj2;
                break;
            case 13:
                String str2 = (String) obj;
                x6y x6yVar = ((nr90) obj2).a;
                fvv0 M = x6yVar.M();
                if (M != null && (v = M.v()) != null) {
                    z = v.P;
                }
                if (z) {
                    x6yVar.A(JsApiMethodType.OPEN_PAY_FORM, VkAppsErrors.Client.i(VkAppsErrors.Client.ACCESS_DENIED, null, null, 7));
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        if (jSONObject.has("app_id") && jSONObject.has("action") && jSONObject.has("params")) {
                            fvv0 M2 = x6yVar.M();
                            if (M2 != null) {
                                String optString = jSONObject.optString("app_id");
                                String optString2 = jSONObject.optString("action");
                                String x = M2.x(jSONObject);
                                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                                (superappUiRouterBridge != null ? superappUiRouterBridge : null).w(optString, optString2, x);
                            }
                        }
                        bex0.a.a(x6yVar, JsApiMethodType.OPEN_PAY_FORM, VkAppsErrors.Client.MISSING_PARAMS, null, null, null, 60);
                    } catch (JSONException unused) {
                        bex0.a.a(x6yVar, JsApiMethodType.OPEN_PAY_FORM, VkAppsErrors.Client.INVALID_PARAMS, null, null, null, 60);
                    }
                }
                break;
            case 14:
                Tag tag = (Tag) obj;
                wlw wlwVar = ((fea0) obj2).i;
                if (wlwVar != null) {
                    wlwVar.invoke(tag);
                }
                break;
            case 15:
                break;
            case 16:
                rhb0 rhb0Var = (rhb0) obj2;
                rhb0Var.n.H5((MusicTrack) obj, rhb0Var.w);
                break;
            case 17:
                hpb0 hpb0Var = (hpb0) obj2;
                sqb0 sqb0Var = (sqb0) obj;
                if (hpb0Var.k().getChildCount() - 2 > 1) {
                    ViewGroup k = hpb0Var.k();
                    if (hpb0Var.R) {
                        Object tag2 = sqb0Var.getTag();
                        if ((tag2 instanceof Long) && ((Number) tag2).longValue() > 0) {
                            hpb0Var.q.add(tag2);
                        }
                    }
                    k.removeView(sqb0Var);
                }
                break;
            case 18:
                ProductsSelectionBottomSheet.Builder.b bVar = (ProductsSelectionBottomSheet.Builder.b) obj;
                Activity h = e3m.h(((ProductsSelectionBottomSheet) obj2).requireContext());
                ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y != null) {
                    Y.H(bVar);
                }
                break;
            case 19:
                nkd nkdVar = (nkd) obj2;
                ikd ikdVar = (ikd) obj;
                if (nkdVar != null) {
                    nkdVar.a(ClipsBottomSheetSideEffectOptions.REMOVE_FROM_OWNER, ikdVar.a);
                }
                break;
            case 20:
                initialize$lambda$220$lambda$27 = ServiceProvider.initialize$lambda$220$lambda$27((UnityAdsModule) obj2, (ServicesRegistry) obj);
                break;
            case 21:
                ((com.vk.newsfeed.impl.items.posting.item.modals.a) obj).a().invoke();
                s3q0 s3q0Var = s3q0.a;
                dw20 dw20Var = ((com.vk.newsfeed.impl.items.posting.item.modals.d) obj2).e;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 22:
                ClipActionButton clipActionButton = new ClipActionButton(((VkViewStub) obj2).getContext());
                jjc.g(clipActionButton, new alj0((zvk0) obj, 4));
                break;
            case 23:
                FragmentImpl fragmentImpl = (FragmentImpl) obj;
                qg90 i6 = vua0.i(false);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", com.vk.core.files.a.N((File) i6.b));
                if (intent.resolveActivity(((Context) obj2).getPackageManager()) != null) {
                    fragmentImpl.startActivityForResult(intent, ((Number) i6.a).intValue());
                }
                break;
            case 24:
                VideoCatalogRootVh videoCatalogRootVh = (VideoCatalogRootVh) obj2;
                videoCatalogRootVh.U.remove((String) obj);
                com.vk.catalog2.common.ui.mvp.holder.video.a aVar = videoCatalogRootVh.L0;
                if (!aVar.b.a()) {
                    aVar.e.a(true);
                    aVar.h.a(true);
                }
                break;
            case 25:
                ((izs) obj2).invoke(new qtt0.a(((rtt0) obj).b));
                break;
            case 26:
                int i7 = VoipAssessmentActivity.m;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().e0(((VoipAssessmentActivity) obj2).l, (cow0) obj);
                break;
            default:
                low0 low0Var = (low0) obj2;
                kow0.a aVar2 = ((kow0.b) obj).l;
                boolean z2 = low0Var.l;
                UserId userId = low0Var.b;
                if (!z2) {
                    break;
                } else {
                    if (low0Var.j) {
                        aVar2.d(userId);
                    } else {
                        aVar2.a(userId);
                    }
                    break;
                }
        }
        return s3q0.a;
    }
}
