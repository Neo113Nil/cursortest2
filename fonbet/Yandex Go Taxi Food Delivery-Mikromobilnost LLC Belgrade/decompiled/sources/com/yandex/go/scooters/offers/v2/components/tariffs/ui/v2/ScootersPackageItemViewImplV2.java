package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView;
import defpackage.g5p0;
import defpackage.nsg0;
import defpackage.ny61;
import defpackage.s0h0;
import defpackage.t5p0;
import defpackage.tje;
import defpackage.vng;
import defpackage.w5p0;
import defpackage.wls;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/v2/ScootersPackageItemViewImplV2;", "Lcom/yandex/go/scooters/offers/v2/components/tariffs/ui/ScootersTariffListItemView;", "Lw5p0;", "Lg5p0;", "Landroid/content/Context;", "context", "Lt5p0;", "scootersTariffPriceFormatMapper", "<init>", "(Landroid/content/Context;Lt5p0;)V", Constants.KEY_DATA, "Lzy11;", "bindData", "(Lg5p0;)V", "bindPrice", "Lt5p0;", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPackageItemViewImplV2 extends ScootersTariffListItemView<w5p0, g5p0> {
    public static final int $stable = 8;
    private final t5p0 scootersTariffPriceFormatMapper;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersPackageItemViewImplV2$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        public static final AnonymousClass1 b = new AnonymousClass1(2, 0, w5p0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lru/yandex/taxi/scooters/preorder/databinding/ScootersTariffViewBinding;");

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return w5p0.o((LayoutInflater) obj, (ViewGroup) obj2);
        }
    }

    public ScootersPackageItemViewImplV2(Context context, t5p0 t5p0Var) {
        super(context, AnonymousClass1.b);
        this.scootersTariffPriceFormatMapper = t5p0Var;
        setBackground(vng.t(s0h0.scooters_tariff_bg_v2, getContext()));
        int u = tje.u(8, getContext());
        getBinding().a.setPaddingRelative(0, u, u, u);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!isAttachedToWindow()) {
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersPackageItemViewImplV2$special$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    this.removeOnAttachStateChangeListener(this);
                    ScootersPackageItemViewImplV2 scootersPackageItemViewImplV2 = this;
                    ru.yandex.taxi.design.utils.c.C(ru.yandex.taxi.design.utils.c.d(nsg0.scooters_tariff_v2_default_height, scootersPackageItemViewImplV2), scootersPackageItemViewImplV2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                }
            });
        } else {
            ru.yandex.taxi.design.utils.c.D(getLayoutParams().width, tje.r(nsg0.scooters_tariff_v2_default_height, getContext()), this);
        }
    }

    @Override // com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView
    public /* synthetic */ void bindData(g5p0 g5p0Var) {
        if (g5p0Var == null) {
            bindData2((g5p0) null);
        } else {
            ny61.u();
        }
    }

    /* renamed from: bindPrice, reason: avoid collision after fix types in other method */
    public void bindPrice2(g5p0 data) {
        submitTask(new a(this));
        RobotoTextView robotoTextView = getBinding().b;
        throw null;
    }

    /* renamed from: bindData, reason: avoid collision after fix types in other method */
    public void bindData2(g5p0 data) {
        RobotoTextView robotoTextView = getBinding().d;
        throw null;
    }

    @Override // com.yandex.go.scooters.offers.v2.components.tariffs.ui.ScootersTariffListItemView
    public /* synthetic */ void bindPrice(g5p0 g5p0Var) {
        if (g5p0Var == null) {
            bindPrice2((g5p0) null);
        } else {
            ny61.u();
        }
    }
}
