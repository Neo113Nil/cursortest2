package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardAddressSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import defpackage.ajw;
import defpackage.bjw;
import defpackage.ckw;
import defpackage.cma1;
import defpackage.evu0;
import defpackage.haw;
import defpackage.hz40;
import defpackage.iaw;
import defpackage.j8h0;
import defpackage.k4h0;
import defpackage.k7x0;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.mqg0;
import defpackage.nac;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.p9w;
import defpackage.pav;
import defpackage.pj;
import defpackage.qje;
import defpackage.tkh0;
import defpackage.xng0;
import defpackage.ziw;
import java.util.HashMap;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B5\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010#J!\u0010(\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b(\u0010)J9\u0010/\u001a\u00020!2\u0006\u0010&\u001a\u00020%2\u0006\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\b\b\u0001\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b/\u00100J\u001f\u00103\u001a\u00020!2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b1\u00102J\u0017\u00106\u001a\u00020!2\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010B¨\u0006D"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardAddressSelectorContainerView;", "Landroid/widget/LinearLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "Lhaw;", "bannersContainerViewFactory", "Lpav;", "imageLoader", "Lk7x0;", "tagUrlFormatter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;Lhaw;Lpav;Lk7x0;)V", "Lbjw;", "content", "Lckw;", "selectedTariffId", "Lajw;", "resolveSectionData-sdzKFpM", "(Lbjw;Ljava/lang/String;)Lajw;", "resolveSectionData", "Lziw;", "contentResources", "overrideResources", "overrideAddressSelectorResources", "(Lziw;Lziw;)Lziw;", "", "getSubtitle", "(Lziw;Lziw;)Ljava/lang/String;", "resolveSubtitleWithHint", "(Lziw;)Lziw;", "Lzy11;", "updateAddressIconsTint", "()V", "renderIcons", "Lru/yandex/taxi/design/ListItemComponent;", "pointUiComponent", "iconTag", "renderIcon", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;)V", "title", "subtitle", "titleHint", "", "defaultHintResourceId", "setAddressText", "(Lru/yandex/taxi/design/ListItemComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "render-sdzKFpM", "(Lbjw;Ljava/lang/String;)V", "render", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lpav;", "Lk7x0;", "Lp9w;", "binding", "Lp9w;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardBannersContainerView;", "bannersContainerView", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardBannersContainerView;", "sourceAddressItemIconTag", "Ljava/lang/String;", "destinationAddressItemIconTag", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardAddressSelectorContainerView extends LinearLayout implements nwy0 {
    private final IntercityDashboardBannersContainerView bannersContainerView;
    private final p9w binding;
    private final g dashboardPresenter;
    private String destinationAddressItemIconTag;
    private final pav imageLoader;
    private String sourceAddressItemIconTag;
    private final k7x0 tagUrlFormatter;

    public IntercityDashboardAddressSelectorContainerView(Context context, final g gVar, haw hawVar, pav pavVar, k7x0 k7x0Var) {
        super(context);
        this.dashboardPresenter = gVar;
        this.imageLoader = pavVar;
        this.tagUrlFormatter = k7x0Var;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_address_selector_container, (ViewGroup) this, false);
        addView(inflate);
        int i2 = j8h0.banners_container_holder;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
        if (frameLayout != null) {
            i2 = j8h0.destination_address_item;
            ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
            if (listItemComponent != null) {
                i2 = j8h0.source_address_item;
                ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent2 != null) {
                    this.binding = new p9w((GoLinearLayout) inflate, frameLayout, listItemComponent, listItemComponent2);
                    IntercityDashboardBannersContainerView a = ((iaw) hawVar).a(gVar);
                    this.bannersContainerView = a;
                    listItemComponent2.setBackgroundResource(k4h0.bg_transparent_control_minor_ripple);
                    listItemComponent.setBackgroundResource(k4h0.bg_transparent_control_minor_ripple);
                    listItemComponent2.setDebounceClickListener(new Runnable() { // from class: q9w
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = i;
                            g gVar2 = gVar;
                            switch (i3) {
                                case 0:
                                    IntercityDashboardAddressSelectorContainerView._init_$onSourceItemClick(gVar2);
                                    break;
                                default:
                                    IntercityDashboardAddressSelectorContainerView._init_$onDestinationItemClick(gVar2);
                                    break;
                            }
                        }
                    });
                    final int i3 = 1;
                    listItemComponent.setDebounceClickListener(new Runnable() { // from class: q9w
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i32 = i3;
                            g gVar2 = gVar;
                            switch (i32) {
                                case 0:
                                    IntercityDashboardAddressSelectorContainerView._init_$onSourceItemClick(gVar2);
                                    break;
                                default:
                                    IntercityDashboardAddressSelectorContainerView._init_$onDestinationItemClick(gVar2);
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(a);
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onDestinationItemClick(g gVar) {
        pj pjVar = gVar.B.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(IssuingDistributionPointExtension.POINT, "b");
        pjVar.a.a("IntercityMain.AddressSelector.Tapped", hashMap, 1, new HashMap());
        e.U(gVar.x.a, PointType.DESTINATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onSourceItemClick(g gVar) {
        pj pjVar = gVar.B.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(IssuingDistributionPointExtension.POINT, "a");
        pjVar.a.a("IntercityMain.AddressSelector.Tapped", hashMap, 1, new HashMap());
        e.U(gVar.x.a, PointType.SOURCE);
    }

    private final String getSubtitle(ziw contentResources, ziw overrideResources) {
        return contentResources.c.length() > 0 ? contentResources.c : overrideResources.e.length() > 0 ? overrideResources.e : contentResources.e;
    }

    private final ziw overrideAddressSelectorResources(ziw contentResources, ziw overrideResources) {
        String str = overrideResources.a;
        if (str.length() == 0) {
            str = contentResources.a;
        }
        String str2 = str;
        String str3 = overrideResources.b;
        if (str3.length() == 0) {
            str3 = contentResources.b;
        }
        String str4 = str3;
        String subtitle = getSubtitle(contentResources, overrideResources);
        String str5 = overrideResources.d;
        if (str5.length() == 0) {
            str5 = contentResources.d;
        }
        String str6 = str5;
        String str7 = overrideResources.e;
        if (str7.length() == 0) {
            str7 = contentResources.e;
        }
        return new ziw(str2, str4, subtitle, str6, str7);
    }

    private final void renderIcon(ListItemComponent pointUiComponent, String iconTag) {
        if (iconTag == null || iconTag.length() == 0) {
            return;
        }
        ((nac) this.imageLoader.a(pointUiComponent.getLeadImageView())).c(((m7x0) this.tagUrlFormatter).a(iconTag));
    }

    private final void renderIcons() {
        renderIcon(this.binding.c, this.sourceAddressItemIconTag);
        renderIcon(this.binding.b, this.destinationAddressItemIconTag);
    }

    /* renamed from: resolveSectionData-sdzKFpM, reason: not valid java name */
    private final ajw m197resolveSectionDatasdzKFpM(bjw content, String selectedTariffId) {
        ajw ajwVar = content.b;
        ziw ziwVar = ajwVar.b;
        ziw ziwVar2 = ajwVar.a;
        hz40 hz40Var = content.d;
        if (selectedTariffId == null || !hz40Var.b(new ckw(selectedTariffId))) {
            return new ajw(resolveSubtitleWithHint(ziwVar2), resolveSubtitleWithHint(ziwVar));
        }
        Object d = hz40Var.d(new ckw(selectedTariffId));
        if (d != null) {
            ajw ajwVar2 = (ajw) d;
            return new ajw(overrideAddressSelectorResources(ziwVar2, ajwVar2.a), overrideAddressSelectorResources(ziwVar, ajwVar2.b));
        }
        ny61.g("Required value was null.");
        return null;
    }

    private final ziw resolveSubtitleWithHint(ziw contentResources) {
        if (contentResources.c.length() != 0 || contentResources.e.length() <= 0) {
            return contentResources;
        }
        String str = contentResources.e;
        return new ziw(contentResources.a, contentResources.b, str, contentResources.d, str);
    }

    private final void setAddressText(ListItemComponent pointUiComponent, String title, String subtitle, String titleHint, int defaultHintResourceId) {
        if (!evu0.J(title)) {
            pointUiComponent.setTitleTypeface(3);
            pointUiComponent.setTitle(title);
            pointUiComponent.setSubtitle(subtitle);
            pointUiComponent.setTitleColorAttr(xng0.textMain);
            return;
        }
        if (evu0.J(titleHint)) {
            pointUiComponent.setTitleTypeface(0);
            pointUiComponent.setTitle(defaultHintResourceId);
            pointUiComponent.setSubtitle("");
            pointUiComponent.setTitleColorAttr(xng0.textMinor);
            return;
        }
        pointUiComponent.setTitleTypeface(0);
        pointUiComponent.setTitle(titleHint);
        pointUiComponent.setSubtitle("");
        pointUiComponent.setTitleColorAttr(xng0.textMinor);
    }

    private final void updateAddressIconsTint() {
        renderIcons();
        if (this.destinationAddressItemIconTag == null) {
            this.binding.b.setLeadTint(getContext().getColor(qje.s(xng0.themeDarkMode, getContext()) ? mqg0.component_gray_200 : mqg0.component_gray_600));
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        updateAddressIconsTint();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    /* renamed from: render-sdzKFpM, reason: not valid java name */
    public final void m198rendersdzKFpM(bjw content, String selectedTariffId) {
        ajw m197resolveSectionDatasdzKFpM = m197resolveSectionDatasdzKFpM(content, selectedTariffId);
        this.sourceAddressItemIconTag = m197resolveSectionDatasdzKFpM.a.a;
        ziw ziwVar = m197resolveSectionDatasdzKFpM.b;
        this.destinationAddressItemIconTag = ziwVar.a;
        renderIcons();
        ListItemComponent listItemComponent = this.binding.c;
        ziw ziwVar2 = m197resolveSectionDatasdzKFpM.a;
        setAddressText(listItemComponent, ziwVar2.b, ziwVar2.c, ziwVar2.d, kyh0.navigator_route_from);
        setAddressText(this.binding.b, ziwVar.b, ziwVar.c, ziwVar.d, kyh0.navigator_route_to);
        updateAddressIconsTint();
        this.bannersContainerView.renderBanners(content.c);
    }
}
