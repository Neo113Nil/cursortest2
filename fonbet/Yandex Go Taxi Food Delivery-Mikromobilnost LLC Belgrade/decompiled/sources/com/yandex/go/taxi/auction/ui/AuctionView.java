package com.yandex.go.taxi.auction.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.taxi.auction.ui.AuctionView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.bdc;
import defpackage.be3;
import defpackage.cdh0;
import defpackage.ce3;
import defpackage.cma1;
import defpackage.de3;
import defpackage.ge3;
import defpackage.h0w;
import defpackage.hph0;
import defpackage.kdc;
import defpackage.mi31;
import defpackage.mrg0;
import defpackage.ny61;
import defpackage.qd3;
import defpackage.qe3;
import defpackage.rd3;
import defpackage.s8o;
import defpackage.scc;
import defpackage.sd3;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.xng0;
import defpackage.yd3;
import defpackage.zd3;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.widget.ShimmeringBar;
import ru.yandex.taxi.widget.buttons.IconCircleButton;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001-B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010\u0019R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/go/taxi/auction/ui/AuctionView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzd3;", "listener", "Lzy11;", "setClickListener", "(Lzd3;)V", "Lbe3;", ClidProvider.STATE, "setActiveStateData", "(Lbe3;)V", "", "title", "subtitle", "safeAnnounceNewContent", "(Ljava/lang/String;Ljava/lang/String;)V", "setupCard", "()V", "Lsd3;", C0553n3.g, "Landroid/graphics/drawable/Drawable;", "createBackgroundDrawable", "(Lsd3;)Landroid/graphics/drawable/Drawable;", "Lru/yandex/taxi/widget/buttons/IconCircleButton;", "control", "", BackendConfig.Restrictions.ENABLED, "updateControl", "(Lru/yandex/taxi/widget/buttons/IconCircleButton;Z)V", "Lde3;", "setState", "(Lde3;)V", "detach", "Lyd3;", "binding", "Lyd3;", "Companion", "qe3", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AuctionView extends GoConstraintLayout {
    public static final qe3 Companion = new qe3();
    private static final float disabledAlpha = 0.6f;
    private static final float enabledAlpha = 1.0f;
    private final yd3 binding;

    public AuctionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        LayoutInflater.from(context).inflate(hph0.auction_card, this);
        int i2 = cdh0.content;
        ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, this);
        if (listItemComponent != null) {
            i2 = cdh0.end_control;
            IconCircleButton iconCircleButton = (IconCircleButton) cma1.O(i2, this);
            if (iconCircleButton != null) {
                i2 = cdh0.shimmering_bar;
                ShimmeringBar shimmeringBar = (ShimmeringBar) cma1.O(i2, this);
                if (shimmeringBar != null) {
                    i2 = cdh0.start_control;
                    IconCircleButton iconCircleButton2 = (IconCircleButton) cma1.O(i2, this);
                    if (iconCircleButton2 != null) {
                        this.binding = new yd3(this, listItemComponent, iconCircleButton, shimmeringBar, iconCircleButton2);
                        setupCard();
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final Drawable createBackgroundDrawable(sd3 background) {
        List list;
        if (background instanceof rd3) {
            bdc bdcVar = ((rd3) background).a;
            list = scc.g(bdcVar, bdcVar);
        } else {
            if (!(background instanceof qd3)) {
                w511.b();
                return null;
            }
            list = ((qd3) background).a;
        }
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        List list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(s8o.m((kdc) it.next(), getContext())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, a.I0(arrayList));
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(tje.r(mrg0.go_design_m_space, getContext()));
        return gradientDrawable;
    }

    private final void safeAnnounceNewContent(String title, String subtitle) {
        List g = scc.g(title, subtitle);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String X = a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
        if (X.length() > 0) {
            announceForAccessibility(X);
        }
    }

    private final void setActiveStateData(be3 state) {
        yd3 yd3Var = this.binding;
        ShimmeringBar shimmeringBar = yd3Var.d;
        boolean z = state.g;
        String str = state.e;
        String str2 = state.d;
        shimmeringBar.setVisibility(z ? 0 : 8);
        setBackground(createBackgroundDrawable(state.a));
        updateControl(yd3Var.e, state.b.a);
        updateControl(yd3Var.c, state.c.a);
        ListItemComponent listItemComponent = yd3Var.b;
        listItemComponent.setVisibility(state.g ? 8 : 0);
        listItemComponent.setTitle(str2);
        listItemComponent.setSubtitle(str);
        safeAnnounceNewContent(str2, str);
        setClickListener(state.f);
    }

    private final void setClickListener(final zd3 listener) {
        yd3 yd3Var = this.binding;
        if (listener == null) {
            yd3Var.e.setDebounceClickListener(null);
            yd3Var.c.setDebounceClickListener(null);
        } else {
            final int i = 0;
            yd3Var.e.setDebounceClickListener(new Runnable() { // from class: pe3
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    zd3 zd3Var = listener;
                    switch (i2) {
                        case 0:
                            AuctionView.setClickListener$lambda$0$0(zd3Var);
                            break;
                        default:
                            AuctionView.setClickListener$lambda$0$1(zd3Var);
                            break;
                    }
                }
            });
            final int i2 = 1;
            yd3Var.c.setDebounceClickListener(new Runnable() { // from class: pe3
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    zd3 zd3Var = listener;
                    switch (i22) {
                        case 0:
                            AuctionView.setClickListener$lambda$0$0(zd3Var);
                            break;
                        default:
                            AuctionView.setClickListener$lambda$0$1(zd3Var);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$0$0(zd3 zd3Var) {
        h0w h0wVar = (h0w) zd3Var;
        ge3.a((ge3) h0wVar.b, (mi31) h0wVar.c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setClickListener$lambda$0$1(zd3 zd3Var) {
        h0w h0wVar = (h0w) zd3Var;
        ge3.a((ge3) h0wVar.b, (mi31) h0wVar.c, false);
    }

    private final void setupCard() {
        yd3 yd3Var = this.binding;
        ListItemComponent listItemComponent = yd3Var.b;
        listItemComponent.setTitleAlignment(1);
        listItemComponent.setTitleColorAttr(xng0.everBack);
        listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_title, listItemComponent.getContext()));
        listItemComponent.setSubtitleAlignment(1);
        listItemComponent.setSubtitleColorAttr(xng0.fog);
        listItemComponent.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
        yd3Var.e.setBackgroundColor(new bdc(xng0.bgMain));
        yd3Var.c.setBackgroundColor(new bdc(xng0.bgMain));
    }

    private final void updateControl(IconCircleButton control, boolean enabled) {
        control.setEnabled(enabled);
        control.setAlpha(enabled ? 1.0f : 0.6f);
    }

    public final void detach() {
        setClickListener(null);
    }

    public final void setState(de3 state) {
        int i;
        if (state instanceof be3) {
            setActiveStateData((be3) state);
            i = 0;
        } else {
            if (!(state instanceof ce3)) {
                w511.b();
                return;
            }
            i = 8;
        }
        setVisibility(i);
    }

    public AuctionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AuctionView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AuctionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
