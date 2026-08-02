package com.ybsdk.widgets.common;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import defpackage.bmg0;
import defpackage.c451;
import defpackage.cma1;
import defpackage.d451;
import defpackage.fch0;
import defpackage.lwg0;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.rje;
import defpackage.sm91;
import defpackage.tls;
import defpackage.wd2;
import defpackage.y7z0;
import defpackage.ya61;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 <2\u00020\u0001:\u0002\n=B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0002¢\u0006\u0004\b!\u0010\u0012J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010#J!\u0010/\u001a\u00020\u00102\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00100-¢\u0006\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0010\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0014\u0010:\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0014\u0010;\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00108¨\u0006>"}, d2 = {"Lcom/ybsdk/widgets/common/WidgetView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ld451;", ClidProvider.STATE, "lastState", "", "updateWidget", "(Ld451;Ld451;)Ljava/lang/Object;", "Lzy11;", "clearWidget", "()V", "Landroid/view/View;", "view", "targetColor", "previousColor", "updateBackgroundColor", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "title", "titleColor", "desc", "descColor", "setTextsAndAnimate", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "setCurrentTexts", "clearTexts", "setTexts", "(Ld451;)V", "updateTexts", "", "isButtonVisible", "(Ld451;)Z", "color", "setBackgroundColor", "(I)V", "newState", "render", "Lkotlin/Function1;", "actionListener", "setOnActionListener", "(Ltls;)V", "Lya61;", "binding", "Lya61;", "listener", "Ltls;", "Ld451;", "imageSize", CA20Status.STATUS_USER_I, "iconSize", "iconMargin", "iconLeftMargin", "Companion", "c451", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WidgetView extends CardView {
    private static final long ANIM_DURATION = 300;
    private static final c451 Companion = new c451();

    @Deprecated
    public static final float ICON_VERTICAL_BIAS = 0.5f;

    @Deprecated
    public static final float IMAGE_VERTICAL_BIAS = 1.0f;
    private final ya61 binding;
    private final int iconLeftMargin;
    private final int iconMargin;
    private final int iconSize;
    private final int imageSize;
    private d451 lastState;
    private tls listener;

    public WidgetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        LayoutInflater.from(context).inflate(poh0.ybsdk_widget_layout, this);
        int i2 = fch0.barrier;
        if (((Barrier) cma1.O(i2, this)) != null) {
            i2 = fch0.button;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null && (O = cma1.O((i2 = fch0.delimiter), this)) != null) {
                i2 = fch0.image_view;
                ImageView imageView = (ImageView) cma1.O(i2, this);
                if (imageView != null) {
                    i2 = fch0.texts_first;
                    if (((TextsHolder) cma1.O(i2, this)) != null) {
                        i2 = fch0.texts_second;
                        if (((TextsHolder) cma1.O(i2, this)) != null) {
                            i2 = fch0.texts_switcher;
                            ViewSwitcher viewSwitcher = (ViewSwitcher) cma1.O(i2, this);
                            if (viewSwitcher != null) {
                                this.binding = new ya61(this, textView, O, imageView, viewSwitcher);
                                this.imageSize = getResources().getDimensionPixelSize(lwg0.ybsdk_widget_view_image_size);
                                this.iconSize = getResources().getDimensionPixelSize(lwg0.ybsdk_widget_view_icon_size);
                                this.iconMargin = getResources().getDimensionPixelSize(lwg0.ybsdk_widget_view_margin);
                                this.iconLeftMargin = getResources().getDimensionPixelSize(lwg0.ybsdk_widget_view_icon_margin_left);
                                setCardElevation(0.0f);
                                setRadius(rje.d(lwg0.ybsdk_widget_view_corner_radius, context));
                                viewSwitcher.setInAnimation(AnimationUtils.loadAnimation(context, bmg0.ybsdk_fade_in_slide_in_top));
                                viewSwitcher.setOutAnimation(AnimationUtils.loadAnimation(context, bmg0.ybsdk_fade_out_slide_out_bottom));
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void clearTexts() {
        ya61 ya61Var = this.binding;
        ((TextsHolder) ya61Var.e.getCurrentView()).setTexts$widgets_common_release(null, null, null, null);
        ((TextsHolder) ya61Var.e.getNextView()).setTexts$widgets_common_release(null, null, null, null);
    }

    private final void clearWidget() {
        ya61 ya61Var = this.binding;
        clearTexts();
        ya61Var.c.setBackgroundColor(0);
        TextView textView = ya61Var.b;
        textView.setText(new String());
        textView.setTextColor(0);
        textView.setBackgroundColor(0);
        ya61Var.d.setImageDrawable(null);
    }

    private final boolean isButtonVisible(d451 state) {
        return (state.j == null || state.c == null || state.g == null || state.h == null || state.i == null) ? false : true;
    }

    private final void setCurrentTexts(String title, int titleColor, String desc, Integer descColor) {
        ((TextsHolder) this.binding.e.getCurrentView()).setTexts$widgets_common_release(title, Integer.valueOf(titleColor), desc, descColor);
    }

    private final void setTexts(d451 state) {
        CharSequence a;
        String obj = com.ybsdk.core.utils.text.d.a(getContext(), state.a).toString();
        int i = state.e.get(getContext());
        Text text = state.b;
        String obj2 = (text == null || (a = com.ybsdk.core.utils.text.d.a(getContext(), text)) == null) ? null : a.toString();
        ColorModel colorModel = state.f;
        setCurrentTexts(obj, i, obj2, colorModel != null ? Integer.valueOf(colorModel.get(getContext())) : null);
    }

    private final void setTextsAndAnimate(String title, int titleColor, String desc, Integer descColor) {
        ya61 ya61Var = this.binding;
        ((TextsHolder) ya61Var.e.getNextView()).setTexts$widgets_common_release(title, Integer.valueOf(titleColor), desc, descColor);
        ya61Var.e.showNext();
    }

    private final void updateBackgroundColor(View view, Integer targetColor, Integer previousColor) {
        int intValue;
        if (targetColor != null) {
            intValue = targetColor.intValue();
        } else {
            Drawable background = view.getBackground();
            ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
            Integer valueOf = colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null;
            intValue = valueOf != null ? valueOf.intValue() : 0;
        }
        if (previousColor == null) {
            view.setBackgroundColor(intValue);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), previousColor, Integer.valueOf(intValue));
        ofObject.setDuration(300L);
        ofObject.addUpdateListener(new wd2(view, 3));
        ofObject.start();
    }

    private final void updateTexts(d451 state) {
        CharSequence a;
        String obj = com.ybsdk.core.utils.text.d.a(getContext(), state.a).toString();
        int i = state.e.get(getContext());
        Text text = state.b;
        String obj2 = (text == null || (a = com.ybsdk.core.utils.text.d.a(getContext(), text)) == null) ? null : a.toString();
        ColorModel colorModel = state.f;
        setTextsAndAnimate(obj, i, obj2, colorModel != null ? Integer.valueOf(colorModel.get(getContext())) : null);
    }

    private final Object updateWidget(d451 state, d451 lastState) {
        ColorModel colorModel;
        ya61 ya61Var = this.binding;
        WidgetView widgetView = ya61Var.a;
        View view = ya61Var.c;
        TextView textView = ya61Var.b;
        widgetView.setOnClickListener(new y7z0(17, state, this));
        ColorModel colorModel2 = state.g;
        if (colorModel2 != null) {
            view.setBackgroundColor(colorModel2.get(sm91.c(ya61Var)));
        }
        view.setVisibility(isButtonVisible(state) ? 0 : 8);
        Text text = state.c;
        Integer num = null;
        textView.setText(text != null ? com.ybsdk.core.utils.text.d.a(sm91.c(ya61Var), text) : null);
        ColorModel colorModel3 = state.h;
        if (colorModel3 != null) {
            textView.setTextColor(colorModel3.get(sm91.c(ya61Var)));
        }
        updateBackgroundColor(ya61Var.a, Integer.valueOf(state.d.get(sm91.c(ya61Var))), lastState != null ? Integer.valueOf(lastState.d.get(sm91.c(ya61Var))) : null);
        ColorModel colorModel4 = state.i;
        Integer valueOf = colorModel4 != null ? Integer.valueOf(colorModel4.get(sm91.c(ya61Var))) : null;
        if (lastState != null && (colorModel = lastState.i) != null) {
            num = Integer.valueOf(colorModel.get(sm91.c(ya61Var)));
        }
        updateBackgroundColor(textView, valueOf, num);
        textView.setVisibility(isButtonVisible(state) ? 0 : 8);
        ya61Var.d.setVisibility(8);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateWidget$lambda$4$lambda$1(d451 d451Var, WidgetView widgetView, View view) {
        tls tlsVar;
        String str = d451Var.j;
        if (str == null || (tlsVar = widgetView.listener) == null) {
            return;
        }
        tlsVar.invoke(str);
    }

    public final void render(d451 newState) {
        if (newState != null) {
            d451 d451Var = this.lastState;
            if (d451Var == null) {
                clearWidget();
                updateWidget(newState, this.lastState);
                setTexts(newState);
            } else if (d451Var != null && !newState.equals(d451Var)) {
                updateWidget(newState, this.lastState);
                updateTexts(newState);
            }
        }
        this.lastState = newState;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        setCardBackgroundColor(color);
    }

    public final void setOnActionListener(tls actionListener) {
        this.listener = actionListener;
    }

    public WidgetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WidgetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public WidgetView(Context context) {
        this(context, null, 0, 6, null);
    }
}
