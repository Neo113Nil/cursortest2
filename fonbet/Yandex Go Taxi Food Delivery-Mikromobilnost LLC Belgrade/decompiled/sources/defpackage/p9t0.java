package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.style.CharacterStyle;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.semantics.f;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.masstransit.sdk.checkout.impl.checkout.domain.k;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.yandex.go.shortcuts.impl.view.adapter.u;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapModalView;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.split.deposit.internal.ui.StatusScreenView;
import com.ybsdk.feature.split.deposit.internal.ui.payment.status.SplitDepositPaymentStatusFragment;
import com.ybsdk.feature.status.screen.internal.ui.b;
import com.ybsdk.feature.stories.internal.screens.stories.d;
import com.ybsdk.widgets.common.SuggestsGroupView;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.fragment.SuggestedFavoritesFragment;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;
import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView;
import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView$loadImage$1;
import ru.yandex.taxi.summary.promotions.factory.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class p9t0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9t0(a aVar, Alternatives.OptionTypeLegacy optionTypeLegacy) {
        this.a = 26;
        this.b = optionTypeLegacy;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 renderNewChallengeWebView$lambda$9$lambda$7;
        zy11 render$lambda$2$lambda$0;
        r0 r0Var;
        Object value;
        zy11 onViewAttachedToWindow$lambda$0;
        zy11 onViewCreated$lambda$3;
        zy11 suggestsAdapterDelegate$lambda$5;
        zy11 zy11Var;
        int i = this.a;
        final int i2 = 5;
        final int i3 = 4;
        final int i4 = 3;
        final int i5 = 11;
        final int i6 = 2;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        zy11 zy11Var2 = zy11.a;
        final int i7 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((m9t0) obj).S((rdb) obj2);
                return zy11Var2;
            case 1:
                r rVar = (r) obj2;
                wpb0 wpb0Var = (wpb0) obj;
                if (!wpb0Var.k) {
                    PickupPoint$PointType[] pickupPoint$PointTypeArr = {PickupPoint$PointType.PICKUP_POINT, PickupPoint$PointType.USER_PLACE, PickupPoint$PointType.EDA, PickupPoint$PointType.FAVORITES};
                    int i8 = 0;
                    while (true) {
                        if (i8 < 4) {
                            if (pickupPoint$PointTypeArr[i8] == wpb0Var.c) {
                                String str = rVar.x.b;
                                if (str == null ? true : jl40.l(wpb0Var.p, str)) {
                                    uud0 c = wpb0Var.c();
                                    if ((c != null ? c.c() : null) == null) {
                                        z = true;
                                    } else if (c.c() == null) {
                                        z = !rVar.m.g();
                                    }
                                }
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                ((qht0) ((uet0) obj2).i).b.r(new oqe0((bn30) obj, i6));
                return zy11Var2;
            case 3:
                ((n) obj2).r(new oqe0((bn30) obj, i7));
                return zy11Var2;
            case 4:
                dmt0 dmt0Var = (dmt0) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj;
                boolean z2 = characterStyle instanceof StyleSpan;
                Iterable iterable = EmptyList.a;
                if (z2) {
                    int style = ((StyleSpan) characterStyle).getStyle();
                    if (style == 1) {
                        iterable = Collections.singletonList("b");
                    } else if (style == 2) {
                        iterable = Collections.singletonList(CoreConstants.PushMessage.SERVICE_TYPE);
                    } else if (style == 3) {
                        iterable = scc.g("b", CoreConstants.PushMessage.SERVICE_TYPE);
                    }
                } else if (characterStyle instanceof UnderlineSpan) {
                    iterable = Collections.singletonList("u");
                } else if (characterStyle instanceof StrikethroughSpan) {
                    iterable = Collections.singletonList("s");
                } else if (characterStyle instanceof SuperscriptSpan) {
                    iterable = Collections.singletonList("sup");
                } else if (characterStyle instanceof SubscriptSpan) {
                    iterable = Collections.singletonList("sub");
                } else if (characterStyle instanceof URLSpan) {
                    iterable = Collections.singletonList("a href=\"" + ((URLSpan) characterStyle).getURL() + "\"");
                } else if (!(characterStyle instanceof TypefaceSpan)) {
                    dmt0Var.getClass();
                } else if (jl40.l(((TypefaceSpan) characterStyle).getFamily(), "monospace")) {
                    iterable = Collections.singletonList(AuthSdkActivity.RESPONSE_TYPE_CODE);
                }
                return new h73(i7, iterable);
            case 5:
                renderNewChallengeWebView$lambda$9$lambda$7 = SplitDepositPaymentStatusFragment.renderNewChallengeWebView$lambda$9$lambda$7((SplitDepositPaymentStatusFragment) obj2, (Throwable) obj);
                return renderNewChallengeWebView$lambda$9$lambda$7;
            case 6:
                j7r j7rVar = (j7r) obj2;
                vut0 vut0Var = (vut0) obj;
                u8j0 u8j0Var = vut0Var.a;
                r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
                if (r8j0Var != null) {
                    wtt0 wtt0Var = (wtt0) r8j0Var.a;
                    vtt0 vtt0Var = wtt0Var.c;
                    String str2 = j7rVar.e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    u8j0Var = r8j0.d(r8j0Var, wtt0.a(wtt0Var, new vtt0(j7rVar.a, str2, new ThemedImageUrlEntity(j7rVar.c, j7rVar.d))), false, false, 14);
                }
                return vut0.a(vut0Var, u8j0Var, false, null, 254);
            case 7:
                ((u) obj2).f0.setText((CharSequence) obj);
                return zy11Var2;
            case 8:
                mnq0 mnq0Var = (mnq0) obj;
                f.p(mnq0Var, 0);
                f.l(mnq0Var, ((s7u0) obj2).c);
                return zy11Var2;
            case 9:
                render$lambda$2$lambda$0 = StatusScreenView.render$lambda$2$lambda$0((StatusScreenView) obj2, (String) obj);
                return render$lambda$2$lambda$0;
            case 10:
                lur0 lur0Var = (lur0) obj;
                pz40 Y = ((b) obj2).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, h9u0.b((h9u0) value, null, null, lur0Var, 11)));
                return zy11Var2;
            case 11:
                LineAtStop lineAtStop = (LineAtStop) obj;
                return kotlin.sequences.b.o(new h73(i7, lineAtStop.getThreadsAtStop()), new scs0(25, (ru.yandex.taxi.masstransit.stopbubble.interactor.a) obj2, lineAtStop));
            case 12:
                ss9 ss9Var = (ss9) obj2;
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new scs0(26, ss9Var, new l7s0(ss9Var));
                wdd.a.getClass();
                ((agd) yfdVar).g = wdd.b;
                return zy11Var2;
            case 13:
                hmb hmbVar = (hmb) obj;
                k kVar = hmbVar.a.L;
                String str3 = hmbVar.b.d;
                String str4 = ((efu0) obj2).a;
                kVar.a.d(new co21(str3, str4));
                kVar.l(new tlc(str3, str4));
                return zy11Var2;
            case 14:
                ((d) obj2).Z(new snu0((String) obj));
                return zy11Var2;
            case 15:
                ((kou0) ((lou0) obj2).a).a((Bitmap) obj);
                return zy11Var2;
            case 16:
                onViewAttachedToWindow$lambda$0 = StoryPreviewView$loadImage$1.onViewAttachedToWindow$lambda$0((StoryPreviewView) obj2, (Drawable) obj);
                return onViewAttachedToWindow$lambda$0;
            case 17:
                onViewCreated$lambda$3 = SuccessFragment.onViewCreated$lambda$3((SuccessFragment) obj2, (mx60) obj);
                return onViewCreated$lambda$3;
            case 18:
                com.yandex.go.preorder.suggested.menu.presenter.b bVar = (com.yandex.go.preorder.suggested.menu.presenter.b) obj2;
                bVar.Wg(new k6v0((Bitmap) obj));
                hwo0 hwo0Var = bVar.z;
                o7r0 o7r0Var = (o7r0) hwo0Var.w;
                SuggestMenuLegacyAnalytics$Prefix suggestMenuLegacyAnalytics$Prefix = (SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(AppSettingsContract$Setting.COLUMN_PREFIX, suggestMenuLegacyAnalytics$Prefix.getEventValue());
                HashMap hashMap2 = new HashMap();
                Regex regex = sho.a;
                o7r0Var.a.a(sb2.q("${prefix}.MapShown", hashMap), hashMap, 1, hashMap2);
                return zy11Var2;
            case 19:
                ((t6v0) ((v6v0) ((zxs0) obj2).a).c.h).a(PlainAddress.a);
                ((sy60) obj).a();
                return zy11Var2;
            case 20:
                n70 n70Var = (n70) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                n70Var.W(new lxo0(23, n70Var, ref$ObjectRef, (lav0) obj2));
                n70Var.b0(new z00(i2, ref$ObjectRef));
                return zy11Var2;
            case 21:
                SuggestedFavoritesFragment suggestedFavoritesFragment = (SuggestedFavoritesFragment) obj2;
                FavoriteAddress favoriteAddress = (FavoriteAddress) obj;
                if (favoriteAddress != null) {
                    ((si00) suggestedFavoritesFragment.requireCallback()).a(z81.f(favoriteAddress));
                } else {
                    ((si00) suggestedFavoritesFragment.requireCallback()).d();
                }
                return zy11Var2;
            case 22:
                suggestsAdapterDelegate$lambda$5 = SuggestsGroupView.suggestsAdapterDelegate$lambda$5((SuggestsGroupView) obj2, (n70) obj);
                return suggestsAdapterDelegate$lambda$5;
            case 23:
                ((b80) obj2).getClass();
                return zy11Var2;
            case 24:
                ((mg21) ((lg21) ((llv0) obj2).d.get())).a((String) obj);
                return zy11Var2;
            case 25:
                final a aVar = (a) obj2;
                final com.yandex.go.preorder.source.altpins.b bVar2 = (com.yandex.go.preorder.source.altpins.b) obj;
                if (bVar2 instanceof Alternatives.AltpinAOptionDto) {
                    final int i9 = 6;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.AltpinAOptionDto) bVar2).b), new tls(aVar, bVar2, i9) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i9;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.AltpinBOptionDto) {
                    final int i10 = 10;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.AltpinBOptionDto) bVar2).b), new tls(aVar, bVar2, i10) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i10;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                boolean z3 = bVar2 instanceof Alternatives.MulticlassOptionDto;
                qrq0 qrq0Var = ixn.a;
                if (z3) {
                    return qrq0Var;
                }
                if (bVar2 instanceof Alternatives.PlusPromoOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.PlusPromoOptionDto) bVar2).b), new tls(aVar, bVar2, i5) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i5;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.RequirementOptionDto) {
                    final int i11 = 12;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.RequirementOptionDto) bVar2).b), new tls(aVar, bVar2, i11) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i11;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.TariffSelectorOptionDto) {
                    h73 h73Var = new h73(i7, ((Alternatives.TariffSelectorOptionDto) bVar2).b);
                    final int i12 = z ? 1 : 0;
                    return kotlin.sequences.b.o(h73Var, new tls(aVar, bVar2, i12) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i12;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.CreateYandexCardOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.CreateYandexCardOptionDto) bVar2).b), new tls(aVar, bVar2, i7) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i7;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.MarketplaceOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.MarketplaceOptionDto) bVar2).c), new tls(aVar, bVar2, i6) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i6;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.AltPaymentMethodOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.AltPaymentMethodOptionDto) bVar2).b), new tls(aVar, bVar2, i4) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i4;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.DeeplinkOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.DeeplinkOptionDto) bVar2).b), new tls(aVar, bVar2, i3) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i3;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.ComboOptionDto) {
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.ComboOptionDto) bVar2).b), new tls(aVar, bVar2, i2) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i2;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.MultimodalOptionDto) {
                    final int i13 = 7;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.MultimodalOptionDto) bVar2).b), new tls(aVar, bVar2, i13) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i13;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.PlusSubscriptionOptionDto) {
                    final int i14 = 8;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.PlusSubscriptionOptionDto) bVar2).c), new tls(aVar, bVar2, i14) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i14;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (bVar2 instanceof Alternatives.PlusDummySubscriptionOptionDto) {
                    final int i15 = 9;
                    return kotlin.sequences.b.o(new h73(i7, ((Alternatives.PlusDummySubscriptionOptionDto) bVar2).c), new tls(aVar, bVar2, i15) { // from class: cnv0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ com.yandex.go.preorder.source.altpins.b b;

                        {
                            this.a = i15;
                            this.b = bVar2;
                        }

                        @Override // defpackage.tls
                        public final Object invoke(Object obj3) {
                            ServiceLevel serviceLevel = (ServiceLevel) obj3;
                            switch (this.a) {
                                case 0:
                                    return a.b(serviceLevel.S, ((Alternatives.TariffSelectorOptionDto) this.b).a);
                                case 1:
                                    return a.b(serviceLevel.S, ((Alternatives.CreateYandexCardOptionDto) this.b).a);
                                case 2:
                                    return a.b(serviceLevel.S, ((Alternatives.MarketplaceOptionDto) this.b).a);
                                case 3:
                                    return a.b(serviceLevel.S, ((Alternatives.AltPaymentMethodOptionDto) this.b).a);
                                case 4:
                                    return a.b(serviceLevel.S, ((Alternatives.DeeplinkOptionDto) this.b).a);
                                case 5:
                                    return a.b(serviceLevel.S, ((Alternatives.ComboOptionDto) this.b).a);
                                case 6:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinAOptionDto) this.b).a);
                                case 7:
                                    return a.b(serviceLevel.S, ((Alternatives.MultimodalOptionDto) this.b).a);
                                case 8:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusSubscriptionOptionDto) this.b).a);
                                case 9:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusDummySubscriptionOptionDto) this.b).a);
                                case 10:
                                    return a.b(serviceLevel.S, ((Alternatives.AltpinBOptionDto) this.b).a);
                                case 11:
                                    return a.b(serviceLevel.S, ((Alternatives.PlusPromoOptionDto) this.b).a);
                                default:
                                    return a.b(serviceLevel.S, ((Alternatives.RequirementOptionDto) this.b).a);
                            }
                        }
                    });
                }
                if (!(bVar2 instanceof Alternatives.CommonOptionLegacyDto)) {
                    w511.b();
                    return null;
                }
                Alternatives.CommonOptionLegacyDto commonOptionLegacyDto = (Alternatives.CommonOptionLegacyDto) bVar2;
                Alternatives.OptionTypeLegacy optionTypeLegacy = commonOptionLegacyDto.a;
                switch (dnv0.b[optionTypeLegacy.ordinal()]) {
                    case 1:
                    case 2:
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        qrq0Var = new h73(i7, commonOptionLegacyDto.b);
                        break;
                    default:
                        w511.b();
                        return null;
                }
                return kotlin.sequences.b.o(qrq0Var, new p9t0(aVar, optionTypeLegacy));
            case 26:
                return a.b(((ServiceLevel) obj).S, ((Alternatives.OptionTypeLegacy) obj2).getValue());
            case 27:
                zy11Var = SuperAppDiscoveryMapModalView.setupSearchbar$lambda$0((SuperAppDiscoveryMapModalView) obj2, (TaxiMapView) obj);
                return zy11Var;
            case 28:
                ((l5w0) obj).U0((w201) obj2);
                return zy11Var2;
            default:
                String str5 = (String) obj;
                Iterator it = ((com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.f) obj2).L.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (jl40.l(((w201) next).getId(), str5)) {
                            r7 = next;
                        }
                    }
                }
                return (w201) r7;
        }
    }

    public /* synthetic */ p9t0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
