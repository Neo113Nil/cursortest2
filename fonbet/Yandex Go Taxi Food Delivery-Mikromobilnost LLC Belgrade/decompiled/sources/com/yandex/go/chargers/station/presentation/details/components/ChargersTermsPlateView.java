package com.yandex.go.chargers.station.presentation.details.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.b;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.payment.common.result.ResultType;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.g18;
import defpackage.n8a;
import defpackage.nac;
import defpackage.ny61;
import defpackage.nya;
import defpackage.oya;
import defpackage.pav;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn9;
import defpackage.uj9;
import defpackage.vhh0;
import defpackage.vng;
import defpackage.wsh0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+¨\u0006,"}, d2 = {"Lcom/yandex/go/chargers/station/presentation/details/components/ChargersTermsPlateView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lkotlin/Function1;", "Luj9;", "Lzy11;", "onButtonClickListener", "<init>", "(Landroid/content/Context;Lpav;Ltls;)V", "Lru/yandex/taxi/widget/RobotoTextView;", "info", "", "terms", "Ltn9;", "attribute", "setUpInfo", "(Lru/yandex/taxi/widget/RobotoTextView;Ljava/lang/CharSequence;Ltn9;)V", "setUpBadge", "(Ltn9;)V", "", "leadImageUrl", "setUpLeadImage", "(Ljava/lang/String;)V", "Lnya;", "success", "(Lnya;)V", ResultType.RESULT_TYPE_LOADING, "()V", "", ClidProvider.STATE, "updatePlateBySheetState", "(I)V", "Lpav;", "Ltls;", "Loya;", "binding", "Loya;", "Lg18;", "imageLoadCancellable", "Lg18;", "Lnya;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersTermsPlateView extends GoConstraintLayout {
    public static final int $stable = 8;
    private final oya binding;
    private g18 imageLoadCancellable;
    private final pav imageLoader;
    private final tls onButtonClickListener;
    private nya terms;

    public ChargersTermsPlateView(Context context, pav pavVar, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.onButtonClickListener = tlsVar;
        LayoutInflater.from(context).inflate(wsh0.chargers_terms_plate_view, this);
        int i = vhh0.badge;
        BadgeView badgeView = (BadgeView) cma1.O(i, this);
        if (badgeView != null) {
            i = vhh0.info;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView != null) {
                i = vhh0.lead_image;
                GoImageView goImageView = (GoImageView) cma1.O(i, this);
                if (goImageView != null) {
                    i = vhh0.trail_image;
                    GoImageView goImageView2 = (GoImageView) cma1.O(i, this);
                    if (goImageView2 != null) {
                        this.binding = new oya(this, badgeView, robotoTextView, goImageView, goImageView2);
                        setPadding(tje.u(14, getContext()), tje.u(10, getContext()), tje.u(14, getContext()), tje.u(2, getContext()));
                        setClipChildren(false);
                        setClipToPadding(false);
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void setUpBadge(tn9 attribute) {
        this.binding.b.setVisibility(attribute != null ? 0 : 8);
        if (attribute == null) {
            return;
        }
        int i = attribute.b;
        BadgeView badgeView = this.binding.b;
        badgeView.setText(attribute.a);
        badgeView.setTintColor(i);
        badgeView.setOutlineSpotShadowColor(i);
    }

    private final void setUpInfo(final RobotoTextView info, CharSequence terms, final tn9 attribute) {
        info.setText(terms);
        ViewGroup.LayoutParams layoutParams = info.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(attribute == null ? tje.u(12, getContext()) : tje.u(6, getContext()));
        info.setLayoutParams(marginLayoutParams);
        WeakHashMap weakHashMap = b.a;
        if (!info.isLaidOut() || info.isLayoutRequested()) {
            info.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.chargers.station.presentation.details.components.ChargersTermsPlateView$setUpInfo$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    RobotoTextView robotoTextView = RobotoTextView.this;
                    int i = 17;
                    if (attribute != null && robotoTextView.getLineCount() != 1) {
                        i = 8388611;
                    }
                    robotoTextView.setGravity(i);
                }
            });
            return;
        }
        int i = 17;
        if (attribute != null && info.getLineCount() != 1) {
            i = 8388611;
        }
        info.setGravity(i);
    }

    private final void setUpLeadImage(String leadImageUrl) {
        if (leadImageUrl == null) {
            this.binding.d.setVisibility(8);
            return;
        }
        g18 g18Var = this.imageLoadCancellable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        this.imageLoadCancellable = ((nac) this.imageLoader.a(this.binding.d)).c(leadImageUrl);
        this.binding.d.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 success$lambda$0(nya nyaVar, ChargersTermsPlateView chargersTermsPlateView) {
        uj9 uj9Var = nyaVar.d;
        if (uj9Var != null) {
            chargersTermsPlateView.onButtonClickListener.invoke(uj9Var);
        }
        return zy11.a;
    }

    public final void loading() {
        this.terms = null;
        this.binding.a.setVisibility(8);
    }

    public final void success(nya terms) {
        this.terms = terms;
        oya oyaVar = this.binding;
        if (terms == null) {
            oyaVar.a.setVisibility(8);
            return;
        }
        tn9 tn9Var = terms.c;
        oyaVar.a.setVisibility(0);
        setUpLeadImage(terms.a);
        setUpBadge(tn9Var);
        setUpInfo(this.binding.c, terms.b, tn9Var);
        this.binding.e.setImageDrawable(vng.t(dzg0.chevron_next, getContext()));
        c.z(new n8a(12, terms, this), this.binding.a);
    }

    public final void updatePlateBySheetState(int state) {
        if (state == 3) {
            setVisibility(8);
        } else if (this.terms != null) {
            setVisibility(0);
        }
    }
}
