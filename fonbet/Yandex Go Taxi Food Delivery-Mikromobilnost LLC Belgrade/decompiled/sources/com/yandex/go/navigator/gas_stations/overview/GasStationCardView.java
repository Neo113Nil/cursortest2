package com.yandex.go.navigator.gas_stations.overview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Group;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.a2i0;
import defpackage.cma1;
import defpackage.dzg0;
import defpackage.evu0;
import defpackage.fuh0;
import defpackage.mrg0;
import defpackage.nts;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.ots;
import defpackage.pts;
import defpackage.qts;
import defpackage.qzm;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import defpackage.z5h0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/navigator/gas_stations/overview/GasStationCardView;", "Landroidx/cardview/widget/CardView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrsAttributeSet", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "renderPreview", "()V", "clipLogoShimmerToCircle", "Lnts;", "contentState", "bindContent", "(Lnts;)V", "", "enable", "enableLoading", "(Z)V", "Lpts;", ClidProvider.STATE, "updateState", "(Lpts;)V", "Lqts;", "binding", "Lqts;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GasStationCardView extends CardView implements nwy0 {
    public static final int $stable = 8;
    private qts binding;

    public GasStationCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        if (isInEditMode()) {
            renderPreview();
            return;
        }
        LayoutInflater.from(context).inflate(fuh0.gas_station_card_view, this);
        int i2 = z5h0.content_container;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i2, this);
        if (goLinearLayout != null && (O = cma1.O((i2 = z5h0.gas_station_slot), this)) != null) {
            int i3 = z5h0.gas_station_fuel_types;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i3, O);
            if (robotoTextView != null) {
                i3 = z5h0.gas_station_logo;
                GoImageView goImageView = (GoImageView) cma1.O(i3, O);
                if (goImageView != null) {
                    i3 = z5h0.gas_station_logo_shimmer;
                    ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i3, O);
                    if (shimmeringBar != null) {
                        i3 = z5h0.gas_station_name;
                        RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i3, O);
                        if (robotoTextView2 != null) {
                            i3 = z5h0.gas_station_name_shimmer;
                            if (((ShimmeringBar) cma1.O(i3, O)) != null) {
                                i3 = z5h0.gas_station_shimmer_group;
                                Group group = (Group) cma1.O(i3, O);
                                if (group != null) {
                                    i3 = z5h0.route_duration_diff;
                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i3, O);
                                    if (robotoTextView3 != null) {
                                        i3 = z5h0.route_duration_diff_shimmer;
                                        if (((ShimmeringBar) cma1.O(i3, O)) != null) {
                                            qzm qzmVar = new qzm((GoConstraintLayout) O, robotoTextView, goImageView, shimmeringBar, robotoTextView2, group, robotoTextView3);
                                            i2 = z5h0.go_to_button;
                                            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i2, this);
                                            if (goLinearLayout2 != null) {
                                                i2 = z5h0.go_to_button_icon;
                                                if (((GoImageView) cma1.O(i2, this)) != null) {
                                                    i2 = z5h0.go_to_button_shimmer;
                                                    ShimmeringBar shimmeringBar2 = (ShimmeringBar) cma1.O(i2, this);
                                                    if (shimmeringBar2 != null) {
                                                        i2 = z5h0.go_via_button;
                                                        GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i2, this);
                                                        if (goLinearLayout3 != null) {
                                                            i2 = z5h0.go_via_button_shimmer;
                                                            ShimmeringBar shimmeringBar3 = (ShimmeringBar) cma1.O(i2, this);
                                                            if (shimmeringBar3 != null) {
                                                                this.binding = new qts(this, goLinearLayout, qzmVar, goLinearLayout2, shimmeringBar2, goLinearLayout3, shimmeringBar3);
                                                                setRadius(tje.w(28, getContext()));
                                                                clipLogoShimmerToCircle();
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ny61.t("Missing required view with ID: ".concat(O.getResources().getResourceName(i3)));
            throw null;
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void bindContent(nts contentState) {
        qts qtsVar = this.binding;
        if (qtsVar != null) {
            qzm qzmVar = qtsVar.c;
            GoImageView goImageView = (GoImageView) qzmVar.e;
            RobotoTextView robotoTextView = (RobotoTextView) qzmVar.d;
            RobotoTextView robotoTextView2 = (RobotoTextView) qzmVar.f;
            Bitmap bitmap = contentState.a;
            String str = contentState.c;
            goImageView.setVisibility(bitmap != null ? 0 : 8);
            Bitmap bitmap2 = contentState.a;
            if (bitmap2 != null) {
                goImageView.setImageBitmap(bitmap2);
            }
            robotoTextView2.setText(contentState.b);
            robotoTextView2.setTextSize(tje.s(evu0.J(str) ? mrg0.component_text_size_title : mrg0.component_text_size_subtitle, getContext()));
            robotoTextView.setVisibility(evu0.J(str) ? 8 : 0);
            robotoTextView.setText(str);
            ((RobotoTextView) qzmVar.h).setText(contentState.d);
            qtsVar.b.setBackgroundResource(dzg0.bg_main_ripple);
            ru.yandex.taxi.design.utils.c.z(contentState.e, this);
            ru.yandex.taxi.design.utils.c.z(contentState.f, qtsVar.d);
            ru.yandex.taxi.design.utils.c.z(contentState.g, qtsVar.f);
        }
    }

    private final void clipLogoShimmerToCircle() {
        qts qtsVar = this.binding;
        ShimmeringBar shimmeringBar = qtsVar != null ? (ShimmeringBar) qtsVar.c.b : null;
        if (shimmeringBar != null) {
            shimmeringBar.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.go.navigator.gas_stations.overview.GasStationCardView$clipLogoShimmerToCircle$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, view.getWidth(), view.getHeight());
                }
            });
        }
        if (shimmeringBar != null) {
            shimmeringBar.setClipToOutline(true);
        }
    }

    private final void enableLoading(boolean enable) {
        qts qtsVar = this.binding;
        if (qtsVar != null) {
            qzm qzmVar = qtsVar.c;
            ((Group) qzmVar.g).setVisibility(enable ? 0 : 8);
            ((GoImageView) qzmVar.e).setVisibility(!enable ? 0 : 8);
            ((RobotoTextView) qzmVar.f).setVisibility(!enable ? 0 : 8);
            ((RobotoTextView) qzmVar.d).setVisibility(!enable ? 0 : 8);
            ((RobotoTextView) qzmVar.h).setVisibility(!enable ? 0 : 8);
            qtsVar.d.setVisibility(!enable ? 0 : 8);
            qtsVar.e.setVisibility(enable ? 0 : 8);
            qtsVar.f.setVisibility(!enable ? 0 : 8);
            qtsVar.g.setVisibility(enable ? 0 : 8);
            qtsVar.b.setBackgroundAttr(xng0.bgMain);
            setClickable(!enable);
        }
    }

    private final void renderPreview() {
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        LayoutInflater.from(new ContextThemeWrapper(getContext(), a2i0.Taxi_Light)).inflate(fuh0.gas_station_card_view, this);
        setRadius(tje.w(28, getContext()));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void updateState(pts state) {
        if (state instanceof ots) {
            enableLoading(true);
        } else if (!(state instanceof nts)) {
            w511.b();
        } else {
            enableLoading(false);
            bindContent((nts) state);
        }
    }

    public GasStationCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GasStationCardView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ GasStationCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
