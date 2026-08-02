package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.core.view.components.divider.VkSeparator;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.bottomsheets.onboarding.di.RecommendationOnboardingComponentImpl;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.playlist.display.audiobook.offline.presentation.fragment.OfflineAudioBookChaptersFragment;
import com.vk.narratives.impl.di.NarrativeComponentImpl;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.geo_picker.presentation.a;
import com.vk.photos.root.presentation.PhotosRootFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.superapp.auth.js.bridge.api.di.JsAuthDelegateComponent;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.io.IOException;
import java.util.ArrayList;
import xsna.g2y;
import xsna.iv20;
import xsna.nyd0.a;
import xsna.x6y;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class s6y implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s6y(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        switch (this.b) {
            case 0:
                x6y x6yVar = (x6y) this.c;
                return ((JsAuthDelegateComponent) x6y.H().a(fpf0.a(JsAuthDelegateComponent.class))).Hc().a(x6yVar.M(), x6yVar, new g2y.a(new x6y.d(0, x6yVar, x6y.class, "getAuthCredentials", "getAuthCredentials()Lcom/vk/superapp/api/dto/auth/VkAuthCredentials;", 0), new x6y.e(2, x6yVar, x6y.class, "onAuth", "onAuth(Lcom/vk/auth/api/models/AuthResult;Z)V", 0), new x6y.f(0, x6yVar, x6y.class, "getAuth", "getAuth()Lcom/vk/superapp/bridges/dto/AuthData;", 0), (wvs) x6yVar.t.getValue(), new xis(x6yVar, 12)), new awz(), x6yVar.L(), new bpn0(new nh(x6yVar)), ((SakAnalyticsComponent) x6y.H().a(fpf0.a(SakAnalyticsComponent.class))).Oe());
            case 1:
                return ((IOException) this.c).toString();
            case 2:
                return ((com.vk.clips.sdk.shared.item.market_ads.b) this.c).l.q0();
            case 3:
                c810 c810Var = (c810) this.c;
                int i = c810.o1;
                return new xsd0(((MarketComponent) m7m.d(c810Var).a(fpf0.a(MarketComponent.class))).U1());
            case 4:
                f910 f910Var = (f910) this.c;
                return new i810(f910Var.A, (q530) f910Var.u.getValue(), f910Var.e);
            case 5:
                return ((VkClientMultiAccountComponent) j6i.b(m7m.f((MenuListView) this.c), VkClientMultiAccountComponent.class)).a();
            case 6:
                hk30 hk30Var = (hk30) this.c;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(dhr0.t.c(R.attr.vk_ui_text_contrast));
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.MEDIUM, Float.valueOf(e3m.a(R.dimen.vkim_msg_part_text_body, hk30Var.a)), TextSizeUnit.PX);
                return textPaint;
            case 7:
                return (TextView) ((un30) this.c).d.findViewById(R.id.blocked_title);
            case 8:
                return new q2u((a1w) this.c);
            case 9:
                y1m0 n3 = ((StoryEditorComponent) ((k7m) m7m.f((u440) this.c)).a(fpf0.a(StoryEditorComponent.class))).n3();
                if (n3 instanceof x1m0) {
                    return (x1m0) n3;
                }
                return null;
            case 10:
                ((gzs) this.c).invoke();
                return s3q0.a;
            case 11:
                return ((PlayerUIComponent) ((k7m) m7m.c((rv40) this.c)).a(fpf0.a(PlayerUIComponent.class))).ub();
            case 12:
                return ((LinksBridgeComponent) ((k7m) m7m.c((com.vk.music.informer.mvi.f) this.c)).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 13:
                return ((BridgeComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) this.c)).a(fpf0.a(BridgeComponent.class))).p();
            case 14:
                return new iu50(((NarrativeComponentImpl) this.c).Ic());
            case 15:
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return new at60(new zf20(newsfeedFragment, 6));
            case 16:
                return (NewsFeedComponent) ((mo60) this.c).c().a(fpf0.a(NewsFeedComponent.class));
            case 17:
                q970 q970Var = (q970) this.c;
                int i2 = q970.i1;
                q970Var.hide();
                euk eukVar = q970Var.h1;
                if (eukVar != null) {
                    eukVar.a(true);
                }
                return s3q0.a;
            case 18:
                OfflineAudioBookChaptersFragment offlineAudioBookChaptersFragment = (OfflineAudioBookChaptersFragment) this.c;
                OfflineAudioBookChaptersFragment.b bVar = OfflineAudioBookChaptersFragment.Q;
                return (BridgeComponent) m7m.d(offlineAudioBookChaptersFragment).a(fpf0.a(BridgeComponent.class));
            case 19:
                ((GlobalSearchVideosCatalogFragment) ((xz70) this.c).a).qb();
                return s3q0.a;
            case 20:
                return ((xk80) this.c).Y;
            case 21:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) this.c;
                bwt0.p0(jVar.m, true);
                jVar.n.setImagesReadyCallback(null);
                return s3q0.a;
            case 22:
                return rl3.u0(((lba0) this.c).getFillPoints());
            case 23:
                PhotosRootFragment photosRootFragment = (PhotosRootFragment) this.c;
                int i3 = PhotosRootFragment.X;
                UserId userId2 = (UserId) photosRootFragment.requireArguments().getParcelable("uid");
                return userId2 == null ? UserId.d : userId2;
            case 24:
                tma0 tma0Var = (tma0) this.c;
                Bundle arguments = tma0Var.getArguments();
                if (arguments != null) {
                    String l = fpf0.a(UserId.class).l();
                    if (l == null) {
                        l = "";
                    }
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable2 = arguments.getParcelable(l, UserId.class);
                        parcelable = (Parcelable) parcelable2;
                    } else {
                        Parcelable parcelable3 = arguments.getParcelable(l);
                        if (!(parcelable3 instanceof UserId)) {
                            parcelable3 = null;
                        }
                        parcelable = (UserId) parcelable3;
                    }
                    userId = (UserId) parcelable;
                } else {
                    userId = null;
                }
                final t060 t060Var = new t060(new fh9(new yd10(), new up2()), ((DataRepositoryComponent) m7m.d(tma0Var).a(fpf0.a(DataRepositoryComponent.class))).D());
                b25 s = ((BridgeComponent) m7m.d(tma0Var).a(fpf0.a(BridgeComponent.class))).s();
                final mla0 qb = ((ReviewsComponent) m7m.d(tma0Var).a(fpf0.a(ReviewsComponent.class))).qb();
                return new fna0(sm50.a(new rn8(new n9(23, userId, s)), new wb0() { // from class: xsna.ena0
                    @Override // xsna.izs
                    /* renamed from: j */
                    public final qj50 invoke(sj50 sj50Var) {
                        return new sma0(t060.this, sj50Var, qb);
                    }
                }, new un8(), null, 24));
            case 25:
                sra0 sra0Var = (sra0) this.c;
                if (!jjc.b()) {
                    sra0Var.c.yi(a.InterfaceC1406a.d.b);
                }
                return s3q0.a;
            case 26:
                return ((nyd0) this.c).new a();
            case 27:
                return (VkSeparator) ((View) ((i0e0) this.c).d.getValue()).findViewById(R.id.separator);
            case 28:
                QrWithCodeAuthModal qrWithCodeAuthModal = (QrWithCodeAuthModal) this.c;
                com.vk.auth.modal.qrwithcode.a aVar = qrWithCodeAuthModal.g;
                if (aVar == null) {
                    aVar = null;
                }
                aVar.getClass();
                com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                iv20.b bVar3 = aVar.d;
                String str = (bVar3 != null ? bVar3 : null).f;
                SchemeStatSak$EventScreen u5 = aVar.h.u5();
                bVar2.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str));
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.QR_CODE_CLOSE_TAP, arrayList, null, u5, null, null, null, 244);
                dw20 dw20Var = qrWithCodeAuthModal.f;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            default:
                nwy nwyVar = ((RecommendationOnboardingComponentImpl) this.c).c;
                qcy<Object> qcyVar = RecommendationOnboardingComponentImpl.f[0];
                return new vd80((ph80) nwyVar.c());
        }
    }
}
