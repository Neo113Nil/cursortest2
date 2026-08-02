package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.verification.libverify.LibverifyPresenter;
import com.vk.catalog2.common.ui.holders.search.SearchResultsVh;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsCatalogRootVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.CommunityReviewsView;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.ml.MLFeatures;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.fragment.impl.MusicCatalogFragment;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.impl.postmodal.ModalPostCommonFragment;
import com.vk.profile.community.subscription.api.di.CommunitySubscriptionComponent;
import com.vk.profile.community.suggestions.impl.ui.suggestions.CommunitySuggestionsFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.menu.SuperAppAnimationConfig;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.b0i;
import xsna.b78;
import xsna.bex0;
import xsna.e3m;
import xsna.egm;
import xsna.mss;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wzh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wzh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        float f;
        String str;
        ExposedFunction invoke$lambda$36;
        gvv0 view;
        WebApiApplication v;
        WebApiApplication v2;
        MLFeatures.MLFeature mLFeature;
        int i = 0;
        r3 = false;
        boolean z = false;
        int i2 = 1;
        switch (this.b) {
            case 0:
                a0i<? super zzh> a0iVar = ((CommunityReviewsView) this.c).e;
                if (a0iVar != null) {
                    a0iVar.c(b0i.b.a);
                }
                return s3q0.a;
            case 1:
                o1i o1iVar = (o1i) this.c;
                n6h.b((n6h) o1iVar.u.getValue(), o1iVar.c, true, "community_page", o1iVar.j, null, 48);
                return s3q0.a;
            case 2:
                CommunitySuggestionsFragment communitySuggestionsFragment = (CommunitySuggestionsFragment) this.c;
                int i3 = CommunitySuggestionsFragment.X;
                return ((CommunitySubscriptionComponent) m7m.d(communitySuggestionsFragment).mo408a(fpf0.a(CommunitySubscriptionComponent.class))).a();
            case 3:
                i1j i1jVar = (i1j) this.c;
                View findViewById = i1jVar.c.findViewById(R.id.voip_room_options);
                bwt0.i0(findViewById, new t3h(i1jVar, 5));
                return findViewById;
            case 4:
                return new c2j(((p2j) this.c).d);
            case 5:
                return ((MusicPrefsComponent) ((k7m) m7m.f((b7j) this.c)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 6:
                ((oaj) this.c).itemView.callOnClick();
                return s3q0.a;
            case 7:
                ((zak0) ((rfj) this.c).k).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 8:
                efm efmVar = ((cfm) this.c).e;
                if (efmVar != null) {
                    efmVar.A();
                }
                return s3q0.a;
            case 9:
                egm egmVar = (egm) this.c;
                Context context = egmVar.d;
                VkText vkText = new VkText(context, null, 6, 0);
                FontFamily fontFamily = FontFamily.REGULAR;
                egm.b bVar = egmVar.m;
                float f2 = (bVar != null ? bVar : null).c;
                TextSizeUnit textSizeUnit = TextSizeUnit.PX;
                int i4 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                if (i4 == 1) {
                    f = f2;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = com.vk.typography.b.b(f2);
                }
                Font.Companion.getClass();
                Font a = Font.a.a(fontFamily, f);
                Typeface k = a.k(context);
                float j = a.j();
                vkText.setTypeface(k);
                vkText.setLetterSpacing(j);
                if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
                    int i5 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 2;
                    }
                    vkText.setTextSize(i, f2);
                }
                vkText.setTextColor(e3m.f(R.attr.vk_ui_text_link_themed, context));
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                vkText.setLayoutParams(egm.W(egmVar, 0, 0, 0, 0, 0, 0, 63));
                vkText.setVisibility(8);
                egmVar.b.addView(vkText);
                return vkText;
            case 10:
                gcn gcnVar = (gcn) this.c;
                gcnVar.g = false;
                gcnVar.f = false;
                gcnVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                gcnVar.i = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                return s3q0.a;
            case 11:
                return (ViewGroup) ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.f) this.c).c.findViewById(R.id.profile_user_data_container);
            case 12:
                FriendsCatalogRootVh friendsCatalogRootVh = (FriendsCatalogRootVh) this.c;
                friendsCatalogRootVh.i8(vyh0.a);
                VkSearchView vkSearchView = friendsCatalogRootVh.C.h;
                if (vkSearchView == null || (str = vkSearchView.getQuery()) == null) {
                    str = "";
                }
                SearchResultsVh.cb(friendsCatalogRootVh.u, str, null, friendsCatalogRootVh.v, friendsCatalogRootVh.t.p.j, null, false, 50);
                return s3q0.a;
            case 13:
                mss mssVar = (mss) this.c;
                String str2 = mssVar.a;
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = mssVar.b;
                rfz rfzVar = mssVar.d;
                mss.a aVar = mssVar.f;
                return new mw50(str2, mobileOfficialAppsCoreNavStat$EventScreen, rfzVar, aVar.c, aVar.d, mssVar.g.b, mssVar.h, mssVar.i);
            case 14:
                invoke$lambda$36 = HandleInvocationsFromAdViewer.invoke$lambda$36((HandleInvocationsFromAdViewer) this.c);
                return invoke$lambda$36;
            case 15:
                skv skvVar = (skv) this.c;
                String scheme = skvVar.a.getScheme();
                if (scheme != null) {
                    return scheme;
                }
                throw new IllegalStateException("Uri " + skvVar.a + " doesn't have scheme!");
            case 16:
                return new wvp(((l4y) this.c).e);
            case 17:
                r6y r6yVar = (r6y) this.c;
                fvv0 M = r6yVar.M();
                Boolean bool = (M == null || (v2 = M.v()) == null) ? null : v2.S;
                fvv0 M2 = r6yVar.M();
                if ((M2 == null || !M2.h()) && bool != null) {
                    fvv0 M3 = r6yVar.M();
                    if (M3 != null && (v = M3.v()) != null) {
                        z = epx.f(v.S, Boolean.TRUE);
                    }
                    if (z) {
                        bex0.a.b(r6yVar, JsApiMethodType.RECOMMEND_APP, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                    } else {
                        fvv0 M4 = r6yVar.M();
                        if (M4 != null && (view = M4.getView()) != null) {
                            view.Wl();
                        }
                    }
                } else {
                    bex0.a.a(r6yVar, JsApiMethodType.RECOMMEND_APP, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
                }
                return s3q0.a;
            case 18:
                LibverifyPresenter libverifyPresenter = (LibverifyPresenter) this.c;
                par0.a.getClass();
                par0.a("[LibverifyPresenter] Permissions were granted, waiting for a flash call");
                libverifyPresenter.b0 = LibverifyPresenter.PermissionsStatus.GRANTED;
                libverifyPresenter.R0();
                return s3q0.a;
            case 19:
                MarketEditAlbumFinishedFragment marketEditAlbumFinishedFragment = (MarketEditAlbumFinishedFragment) this.c;
                int i6 = MarketEditAlbumFinishedFragment.Q;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) marketEditAlbumFinishedFragment.requireArguments().getParcelable("album");
                marketEditAlbumFinishedFragment.Mf(-1, null);
                ((dhc) marketEditAlbumFinishedFragment.P.getValue()).d(marketEditAlbumFinishedFragment.requireContext(), new ngc(null, "album", goodAlbumEditFlowEntity.b, null, null, null, null, null, null, null, new MarketAnalyticsParams(null, MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM_ALBUM, CommonMarketStat$TypeRefSource.COMMUNITY_GROUP_GOODS, null, null, null, null, false, null, false, false, null, false, 8057, null), goodAlbumEditFlowEntity.d, true, goodAlbumEditFlowEntity.c, 3211235));
                return s3q0.a;
            case 20:
                SuperAppAnimationConfig superAppAnimationConfig = (SuperAppAnimationConfig) this.c;
                if (superAppAnimationConfig != null) {
                    k720.G.onNext(superAppAnimationConfig);
                }
                return s3q0.a;
            case 21:
                String str3 = (String) this.c;
                StringBuilder sb = new StringBuilder();
                int length = str3.length();
                for (int i7 = 0; i7 < length; i7++) {
                    char charAt = str3.charAt(i7);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                return sb;
            case 22:
                ModalPostCommonFragment modalPostCommonFragment = (ModalPostCommonFragment) this.c;
                int i8 = ModalPostCommonFragment.a0;
                return modalPostCommonFragment.s;
            case 23:
                com.vk.ml.b bVar2 = (com.vk.ml.b) this.c;
                bVar2.f.incrementAndGet();
                bVar2.c = false;
                j330 j330Var = bVar2.d;
                if (j330Var != null) {
                    Iterator it = j330Var.d(null, null).iterator();
                    while (it.hasNext()) {
                        zb00 zb00Var = (zb00) it.next();
                        if (zb00Var.f) {
                            try {
                                mLFeature = MLFeatures.MLFeature.valueOf(zb00Var.a);
                            } catch (IllegalArgumentException unused) {
                                mLFeature = null;
                            }
                            if (mLFeature != null) {
                                bVar2.i(mLFeature);
                            }
                            try {
                                j330 j330Var2 = bVar2.d;
                                if (j330Var2 != null) {
                                    j330Var2.e(zb00Var.a, true);
                                }
                                if (mLFeature != null) {
                                    bVar2.k(mLFeature);
                                }
                            } catch (Throwable th) {
                                if (mLFeature != null) {
                                    bVar2.k(mLFeature);
                                }
                                throw th;
                            }
                        }
                    }
                }
                return s3q0.a;
            case 24:
                return new com.vk.im.ui.views.avatars.b(((zm30) this.c).b, true);
            case 25:
                Context t = ((xt30) this.c).t();
                e3m.a aVar2 = e3m.a;
                return new PorterDuffColorFilter(t.getColor(R.color.vk_black_alpha75), PorterDuff.Mode.SRC_ATOP);
            case 26:
                rw30 rw30Var = (rw30) this.c;
                io.reactivex.rxjava3.internal.operators.single.b0 E = rw30Var.i.E(rw30Var, new h9f0());
                o330 o330Var = new o330(new vam(rw30Var, 27), i2);
                int i9 = kwg0.a;
                rw30Var.I0(E.subscribe(o330Var, new jwg0("MsgSearchComponent")));
                return s3q0.a;
            case 27:
                MusicCatalogFragment musicCatalogFragment = (MusicCatalogFragment) this.c;
                int i10 = MusicCatalogFragment.W;
                return ((VkClientMultiAccountComponent) m7m.d(musicCatalogFragment).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 28:
                ((rw40) this.c).y.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return s3q0.a;
            default:
                b78 b78Var = (b78) this.c;
                if (!(b78Var instanceof b78.f)) {
                    b78Var.a().invoke(sx40.f.b);
                }
                return s3q0.a;
        }
    }
}
