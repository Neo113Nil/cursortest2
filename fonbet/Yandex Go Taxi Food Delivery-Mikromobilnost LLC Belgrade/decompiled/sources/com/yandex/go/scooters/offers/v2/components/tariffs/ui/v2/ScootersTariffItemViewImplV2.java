package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.core.view.OneShotPreDrawListener;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView;
import defpackage.cma1;
import defpackage.h5p0;
import defpackage.i5p0;
import defpackage.k5p0;
import defpackage.kyh0;
import defpackage.nao0;
import defpackage.ny61;
import defpackage.own0;
import defpackage.q4i0;
import defpackage.qfh0;
import defpackage.s0h0;
import defpackage.srh0;
import defpackage.t5p0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tqs;
import defpackage.u5p0;
import defpackage.vng;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u000e*\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010\"\u001a\u00020\u000e*\u00020\u001d2\u0006\u0010!\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020\u000e*\u00020\u001d2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b\"\u0010&J\u0013\u0010'\u001a\u00020\u000e*\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\u00020\u000e*\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010\u0010J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010\u0010J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010\u0010J\u001f\u00102\u001a\u00020\u000e2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u00106\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0016\u0010:\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffItemViewImplV2;", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/ScootersTariffListItemView;", "Lk5p0;", "Li5p0;", "Lown0;", "Landroid/content/Context;", "context", "Lru/yandex/taxi/widget/utils/e;", "mediaInfoConverter", "Lt5p0;", "scootersTariffPriceFormatMapper", "<init>", "(Landroid/content/Context;Lru/yandex/taxi/widget/utils/e;Lt5p0;)V", Constants.KEY_DATA, "Lzy11;", "bindModifications", "(Li5p0;)V", "Lh5p0;", "superpassAlternative", "setSuperpassAlternative", "(Lh5p0;)V", "", "selected", "", "title", "", "titleAdditionalAccessibility", "updateTitleContentDescription", "(ZLjava/lang/CharSequence;Ljava/lang/String;)V", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;", "surgeIconTag", "updatePriceImage", "(Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;ZLjava/lang/String;)V", "iconTag", "setLeadPriceIcon", "(Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "icon", "(Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;Landroid/graphics/drawable/Drawable;)V", "removeLeadPriceIcon", "(Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersTariffView;)V", "Landroid/widget/TextView;", "removeDrawables", "(Landroid/widget/TextView;)V", "bindData", "bindPrice", "bindSelection", "", "availableWidth", "listSize", "applyLayoutBy", "(II)V", "Lru/yandex/taxi/widget/utils/e;", "Lt5p0;", "tariffPadding", CA20Status.STATUS_USER_I, "superPassStartAlternativePadding", "superPassPriceIconHeight", "isTariffWithModification", "Z", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffItemViewImplV2 extends ScootersTariffListItemView<k5p0, i5p0> implements own0 {
    public static final int $stable = 8;
    private boolean isTariffWithModification;
    private final e mediaInfoConverter;
    private final t5p0 scootersTariffPriceFormatMapper;
    private final int superPassPriceIconHeight;
    private final int superPassStartAlternativePadding;
    private final int tariffPadding;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffItemViewImplV2$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, k5p0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lru/yandex/taxi/scooters/preorder/databinding/ScootersTariffItemV2Binding;");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            LayoutInflater layoutInflater = (LayoutInflater) obj;
            ViewGroup viewGroup = (ViewGroup) obj2;
            if (viewGroup == null) {
                ny61.t("parent");
                return null;
            }
            layoutInflater.inflate(srh0.scooters_tariff_item_v2, viewGroup);
            int i = qfh0.tariff;
            ScootersTariffView scootersTariffView = (ScootersTariffView) cma1.O(i, viewGroup);
            if (scootersTariffView != null) {
                i = qfh0.tariff_alternative;
                ScootersTariffView scootersTariffView2 = (ScootersTariffView) cma1.O(i, viewGroup);
                if (scootersTariffView2 != null) {
                    i = qfh0.tariff_right;
                    if (((Barrier) cma1.O(i, viewGroup)) != null) {
                        return new k5p0(viewGroup, scootersTariffView, scootersTariffView2);
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(viewGroup.getResources().getResourceName(i)));
            return null;
        }
    }

    public ScootersTariffItemViewImplV2(Context context, e eVar, t5p0 t5p0Var) {
        super(context, AnonymousClass1.b);
        this.mediaInfoConverter = eVar;
        this.scootersTariffPriceFormatMapper = t5p0Var;
        int u = tje.u(8, getContext());
        this.tariffPadding = u;
        this.superPassStartAlternativePadding = tje.u(20, getContext());
        this.superPassPriceIconHeight = tje.u(24, getContext());
        setBackground(vng.t(s0h0.scooters_tariff_item_v2_bg, getContext()));
        getBinding().b.setBackground(vng.t(s0h0.scooters_tariff_bg_v2, getContext()));
        getBinding().c.setBackground(vng.t(s0h0.scooters_tariff_alternative_bg, getContext()));
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (isAttachedToWindow()) {
            loadLayoutDescription(q4i0.scooters_tariff_item_v2_scene);
        } else {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersTariffItemViewImplV2$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    this.loadLayoutDescription(q4i0.scooters_tariff_item_v2_scene);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        }
        getBinding().b.setPaddingRelative(0, u, u, u);
    }

    private final void bindModifications(i5p0 data) {
        data.getClass();
        ScootersTariffView scootersTariffView = getBinding().c;
        scootersTariffView.setOnClickListener(null);
        scootersTariffView.setPaddingRelative(0, scootersTariffView.getPaddingTop(), 0, scootersTariffView.getPaddingBottom());
        scootersTariffView.clearContent();
        setLeadPriceIcon(scootersTariffView, (Drawable) null);
        this.isTariffWithModification = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 bindSelection$lambda$0(ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2, i5p0 i5p0Var) {
        tls clickAction = scootersTariffItemViewImplV2.getClickAction();
        if (clickAction != null) {
            clickAction.invoke(i5p0Var);
        }
        return zy11.a;
    }

    private final void removeDrawables(TextView textView) {
        textView.setCompoundDrawablesRelative(null, null, null, null);
    }

    private final void removeLeadPriceIcon(ScootersTariffView scootersTariffView) {
        removeDrawables(scootersTariffView.getPriceTextView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLeadPriceIcon(ScootersTariffView scootersTariffView, Drawable drawable) {
        if (drawable != null) {
            scootersTariffView.getPriceTextView().setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            removeLeadPriceIcon(scootersTariffView);
        }
    }

    private final void setSuperpassAlternative(h5p0 superpassAlternative) {
        throw null;
    }

    private static final zy11 setSuperpassAlternative$lambda$0(ScootersTariffItemViewImplV2 scootersTariffItemViewImplV2, h5p0 h5p0Var) {
        tls clickAction = scootersTariffItemViewImplV2.getClickAction();
        if (clickAction != null) {
            clickAction.invoke(h5p0Var);
        }
        return zy11.a;
    }

    private final void updatePriceImage(ScootersTariffView scootersTariffView, boolean z, String str) {
        if (!z || str == null || str.length() == 0) {
            removeLeadPriceIcon(scootersTariffView);
        } else {
            setLeadPriceIcon(scootersTariffView, str);
        }
    }

    private final void updateTitleContentDescription(boolean selected, CharSequence title, String titleAdditionalAccessibility) {
        RobotoTextView titleTextView = getBinding().b.getTitleTextView();
        if (selected && titleAdditionalAccessibility != null && titleAdditionalAccessibility.length() != 0) {
            title = ((Object) title) + " " + titleAdditionalAccessibility;
        }
        titleTextView.setContentDescription(title);
    }

    @Override // defpackage.own0
    public void applyLayoutBy(int availableWidth, int listSize) {
        u5p0 u5p0Var = listSize != 1 ? listSize != 2 ? new u5p0(availableWidth, ScootersTariffView$LayoutConfig$WidthSpec.BY_CONTENT, ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY) : new u5p0(availableWidth, ScootersTariffView$LayoutConfig$WidthSpec.HALF, ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY) : this.isTariffWithModification ? new u5p0(availableWidth, ScootersTariffView$LayoutConfig$WidthSpec.HALF, ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY) : new u5p0(availableWidth, ScootersTariffView$LayoutConfig$WidthSpec.FULL, ScootersTariffView$LayoutConfig$Appearance.AS_SINGLE);
        u5p0 u5p0Var2 = this.isTariffWithModification ? listSize == 1 ? new u5p0(tje.u(16, getContext()) + (availableWidth / 2), ScootersTariffView$LayoutConfig$WidthSpec.FULL, ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY) : new u5p0(availableWidth, ScootersTariffView$LayoutConfig$WidthSpec.BY_CONTENT, ScootersTariffView$LayoutConfig$Appearance.AS_ONE_OF_MANY) : null;
        getBinding().b.setLayoutConfig(u5p0Var);
        getBinding().c.setLayoutConfig(u5p0Var2);
    }

    @Override // com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView
    public void bindData(i5p0 data) {
        bindSelection(data);
        bindPrice(data);
        getBinding().b.getTitleTextView().setText(data.a);
        getBinding().b.getSubtitleTextView().setText(data.b);
    }

    @Override // com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView
    public void bindPrice(i5p0 data) {
        submitTask(new b(this, data));
        getBinding().b.getPriceTextView().setContentDescription(ru.yandex.taxi.design.utils.c.H(this, kyh0.scooters_offer_card_v2_a11y_tariff_price, data.d));
    }

    @Override // com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView
    public void bindSelection(i5p0 data) {
        getBinding().a.setSelected(data.c);
        ScootersTariffView scootersTariffView = getBinding().b;
        boolean z = data.c;
        scootersTariffView.setSelected(z);
        ScootersTariffView scootersTariffView2 = getBinding().b;
        scootersTariffView2.setPaddingRelative(z ? this.tariffPadding : 0, scootersTariffView2.getPaddingTop(), scootersTariffView2.getPaddingEnd(), scootersTariffView2.getPaddingBottom());
        getBinding().b.getTitleTextView().setTextColorAttr(z ? xng0.textMain : xng0.textMinor);
        int i = z ? 3 : 0;
        getBinding().b.getTitleTextView().setTextTypeface(i);
        getBinding().b.getPriceTextView().setTextTypeface(i);
        updatePriceImage(getBinding().b, z, data.e);
        updateTitleContentDescription(z, data.a, data.g);
        bindModifications(data);
        ru.yandex.taxi.design.utils.c.z(new nao0(11, this, data), getBinding().b);
        OneShotPreDrawListener.add(this, new tqs(this, data, this, 15));
    }

    private final void setLeadPriceIcon(ScootersTariffView scootersTariffView, String str) {
        submitTask(new c(this, scootersTariffView, str));
    }
}
