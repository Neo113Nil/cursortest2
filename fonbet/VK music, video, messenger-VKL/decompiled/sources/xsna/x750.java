package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.audience.api.di.AudienceResearchComponent;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.camera.editor.stories.impl.di.StoryEditorComponentImpl;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.utils.shadow.Shadow;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.storefront.impl.community.presentation.fragment.StorefrontFragment;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.SelectGroupVerificationFragment;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.video.playlist.playlistscreen.di.PlaylistScreenFragmentInternalComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.it80;
import xsna.rr50;
import xsna.vhg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x750 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x750(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        tg60 wlb0Var;
        VideoFile videoFile;
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return y750.a((y750) obj2);
            case 1:
                TreeSet treeSet = new TreeSet(((kh50) obj2).f);
                rl3.p0(new gi50[0], treeSet);
                return treeSet;
            case 2:
                rr50 rr50Var = (rr50) obj2;
                cjx cjxVar = rr50Var.J;
                return new rr50.e(cjxVar != null ? cjxVar : null, rr50Var.P, rr50Var.G);
            case 3:
                return ((SharingComponent) ((com.vk.newsfeed.common.helpers.a) obj2).f.getValue()).u();
            case 4:
                int i2 = ug60.$EnumSwitchMapping$0[((sg60) obj2).j.h.k.ordinal()];
                if (i2 == 1) {
                    wlb0Var = new wlb0();
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wlb0Var = new rte0();
                }
                return new nf60(wlb0Var, new rte0(), new kh60());
            case 5:
                String str = ((nt70) obj2).a;
                return Boolean.valueOf(str != null && drm0.D(str, "kids_section", false));
            case 6:
                return new x180((UserId) ((b080) obj2).n1.getValue());
            case 7:
                yp80 yp80Var = ((op20) obj2).d.g;
                if (yp80Var != null) {
                    yp80Var.I();
                }
                return s3q0.a;
            case 8:
                mm90 mm90Var = (mm90) obj2;
                Bundle requireArguments = mm90Var.requireArguments();
                FullscreenPasswordData fullscreenPasswordData = requireArguments != null ? (FullscreenPasswordData) requireArguments.getParcelable("PASSWORD_METHOD_SELECTOR_DATA") : null;
                ek20 ek20Var = (ek20) mm90Var.C.getValue();
                FragmentManager supportFragmentManager = mm90Var.kn().getSupportFragmentManager();
                sj20 sj20Var = mm90Var.D;
                String str2 = fullscreenPasswordData != null ? fullscreenPasswordData.d : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = fullscreenPasswordData != null ? fullscreenPasswordData.b : null;
                ek20Var.a(supportFragmentManager, sj20Var, new mj20(str2, str3 != null ? str3 : "", VerificationMethodTypes.PASSWORD, false));
                return s3q0.a;
            case 9:
                return LayoutInflater.from(((xia0) obj2).a);
            case 10:
                PlaylistScreenFragmentInternalComponent playlistScreenFragmentInternalComponent = (PlaylistScreenFragmentInternalComponent) obj2;
                PlaylistScreenFragmentInternalComponent.a aVar = PlaylistScreenFragmentInternalComponent.x;
                return cea.a(playlistScreenFragmentInternalComponent.Ef(), playlistScreenFragmentInternalComponent.a.a.e, 2);
            case 11:
                ((com.vk.im.popup.b) obj2).c.b();
                return s3q0.a;
            case 12:
                frc0 frc0Var = (frc0) obj2;
                mo60 mo60Var = frc0Var.a;
                return new hv50(mo60Var.X, mo60Var.Y, ((NewsFeedComponent) frc0Var.c.getValue()).cc());
            case 13:
                return Boolean.valueOf(BuildInfo.q() && (videoFile = ((PublishState.Edit) obj2).b) != null && videoFile.Z1());
            case 14:
                ReactionListController reactionListController = (ReactionListController) obj2;
                Integer num = reactionListController.f.d;
                return Integer.valueOf(num != null ? num.intValue() : e3m.a(R.dimen.vkim_legacy_reactions_item_size, reactionListController.a.getContext()));
            case 15:
                m3f0 m3f0Var = (m3f0) obj2;
                mo60 mo60Var2 = m3f0Var.a;
                return new hv50(mo60Var2.X, mo60Var2.Y, ((NewsFeedComponent) m3f0Var.c.getValue()).cc());
            case 16:
                ((c7h0) obj2).C(vhg.a.b);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((xvy) obj2).j.a());
            case 18:
                return (AudienceResearchComponent) ((k7m) m7m.f((osh0) obj2)).a(fpf0.a(AudienceResearchComponent.class));
            case 19:
                ((dxh0) obj2).b.e();
                return s3q0.a;
            case 20:
                Iterator<T> it = ((o0i0) obj2).c().b.mo78O0().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((UIBlock) obj).d == CatalogViewType.SLIDER_WITH_VERTICAL_VIDEOS) {
                        }
                    } else {
                        obj = null;
                    }
                }
                UIBlock uIBlock = (UIBlock) obj;
                UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
                ArrayList<UIBlock> arrayList = uIBlockList != null ? uIBlockList.y : null;
                if (arrayList == null) {
                    return EmptyList.b;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof UIBlockVideo) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((UIBlockVideo) it2.next()).B);
                }
                return arrayList3;
            case 21:
                qcy<Object>[] qcyVarArr = SelectGroupVerificationFragment.U;
                return ((VerifiedSellerComponent) ((k7m) m7m.f((SelectGroupVerificationFragment) obj2)).a(fpf0.a(VerifiedSellerComponent.class))).d();
            case 22:
                int i3 = SettingsListFragment.X0;
                return ((SessionManagementComponent) m7m.d((SettingsListFragment) obj2).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 23:
                Shadow shadow = (Shadow) obj2;
                return Integer.valueOf(n8g.l(shadow.e, an10.b(shadow.f * 255.0f)));
            case 24:
                ((com.vk.sharing.core.view.f) obj2).W1();
                return s3q0.a;
            case 25:
                it80.a aVar2 = it80.b;
                hd8 a = ((clj0) obj2).c.a();
                aVar2.getClass();
                return new it80(a);
            case 26:
                ((k7k0) obj2).b();
                return s3q0.a;
            case 27:
                StorefrontFragment storefrontFragment = (StorefrontFragment) obj2;
                qcy<Object>[] qcyVarArr2 = StorefrontFragment.S;
                MarketAnalyticsParams marketAnalyticsParams = storefrontFragment.eo().c;
                UserId userId = storefrontFragment.eo().b;
                bpn0 bpn0Var = storefrontFragment.O;
                ull0 ull0Var = (ull0) bpn0Var.getValue();
                nzw nzwVar = storefrontFragment.P;
                qcy<Object> qcyVar = StorefrontFragment.S[0];
                return new yll0(new ill0(storefrontFragment, marketAnalyticsParams, userId, ull0Var, new StorefrontFragment.b(1, (cpl0) nzwVar.getValue(), cpl0.class, "send", "send(Lcom/vk/mvi/MviAction;)V", 0)), new hll0(storefrontFragment.eo().b, storefrontFragment.requireContext(), (ull0) bpn0Var.getValue()));
            case 28:
                qcy<Object>[] qcyVarArr3 = StoryEditorComponentImpl.h;
                nwy nwyVar = ((StoryEditorComponentImpl) obj2).a;
                qcy<Object> qcyVar2 = StoryEditorComponentImpl.h[0];
                return new c2m0((gpj0) nwyVar.c());
            default:
                ymn0 ymn0Var = (ymn0) obj2;
                Float f = (Float) ymn0Var.c().get(((zak0) ymn0Var.e).getValue());
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float floatValue = f != null ? f.floatValue() : 0.0f;
                Float f3 = (Float) ymn0Var.c().get(ymn0Var.f.getValue());
                float floatValue2 = (f3 != null ? f3.floatValue() : 0.0f) - floatValue;
                if (Math.abs(floatValue2) > 1.0E-6f) {
                    float d = (ymn0Var.d() - floatValue) / floatValue2;
                    if (d >= 1.0E-6f) {
                        if (d <= 0.999999f) {
                            f2 = d;
                        }
                    }
                    return Float.valueOf(f2);
                }
                f2 = 1.0f;
                return Float.valueOf(f2);
        }
    }
}
