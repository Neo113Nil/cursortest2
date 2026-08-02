package com.yandex.go.superapp.searchbar.impl.ui.searchbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import defpackage.aog0;
import defpackage.cma1;
import defpackage.dn60;
import defpackage.e8h0;
import defpackage.ei;
import defpackage.g4h0;
import defpackage.n2y;
import defpackage.new0;
import defpackage.ny61;
import defpackage.okh0;
import defpackage.pav;
import defpackage.pew0;
import defpackage.qew0;
import defpackage.qje;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.xng0;
import defpackage.ytz;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002<=B_\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u001a\b\u0001\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n\u0012\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010&R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u001a\u0010)\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00108\u001a\u0002078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lytz;", "lottieLoader", "Lpew0;", "dimens", "Lkotlin/Function2;", "Lcom/yandex/go/dto/response/q1;", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$SearchBarTapSource;", "Lzy11;", "actionHandler", "Lkotlin/Function1;", "Lgew0;", "lottieAnimationEndHandler", "<init>", "(Landroid/content/Context;Lpav;Lytz;Lpew0;Lwls;Ltls;)V", "", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "Lytz;", "Lpew0;", "Lwls;", "Ltls;", "Lnew0;", "colors", "Lnew0;", "getColors$impl", "()Lnew0;", "Ln2y;", "binding", "Ln2y;", "getBinding$impl", "()Ln2y;", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarViewTouchDelegate;", "containerTouchDelegate", "Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarViewTouchDelegate;", "getContainerTouchDelegate$impl", "()Lcom/yandex/go/superapp/searchbar/impl/ui/searchbar/SuperappSearchbarViewTouchDelegate;", "Lqew0;", "drawDelegate", "Lqew0;", "getDrawDelegate$impl", "()Lqew0;", "mew0", "lew0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappSearchbarView extends GoFrameLayout {
    private final wls actionHandler;
    private final n2y binding;
    private final new0 colors;
    private final SuperappSearchbarViewTouchDelegate containerTouchDelegate;
    private final pew0 dimens;
    private final qew0 drawDelegate;
    private final pav imageLoader;
    private final tls lottieAnimationEndHandler;
    private final ytz lottieLoader;

    public SuperappSearchbarView(Context context, pav pavVar, ytz ytzVar, pew0 pew0Var, wls wlsVar, tls tlsVar) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.lottieLoader = ytzVar;
        this.dimens = pew0Var;
        this.actionHandler = wlsVar;
        this.lottieAnimationEndHandler = tlsVar;
        this.colors = new new0(context);
        LayoutInflater.from(context).inflate(okh0.layout_superapp_searchbar, this);
        int i = e8h0.collapsed_button;
        SuperappSearchbarButtonView superappSearchbarButtonView = (SuperappSearchbarButtonView) cma1.O(i, this);
        if (superappSearchbarButtonView != null) {
            i = e8h0.expanded_content;
            GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout != null) {
                i = e8h0.lead_buttons;
                GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, this);
                if (goLinearLayout2 != null) {
                    i = e8h0.subtitle;
                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                    if (robotoTextView != null) {
                        i = e8h0.texts_container;
                        if (((GoLinearLayout) cma1.O(i, this)) != null) {
                            i = e8h0.title;
                            PrintAnimationTextView printAnimationTextView = (PrintAnimationTextView) cma1.O(i, this);
                            if (printAnimationTextView != null) {
                                i = e8h0.trail_buttons;
                                GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i, this);
                                if (goLinearLayout3 != null) {
                                    n2y n2yVar = new n2y(this, superappSearchbarButtonView, goLinearLayout, goLinearLayout2, robotoTextView, printAnimationTextView, goLinearLayout3);
                                    this.binding = n2yVar;
                                    this.containerTouchDelegate = new SuperappSearchbarViewTouchDelegate(this, n2yVar, pew0Var);
                                    this.drawDelegate = new qew0(context);
                                    setForeground(vng.t(g4h0.ripple_superapp_searchbar, getContext()));
                                    setOutlineProvider(null);
                                    setWillNotDraw(false);
                                    b.p(this, new ei(25));
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        new0 new0Var = this.colors;
        new0Var.b = new dn60(qje.t(aog0.superappSearchbarShadowExpandedColor, new0Var.a), 13, (byte) 0);
        qew0 qew0Var = this.drawDelegate;
        Paint paint = qew0Var.e;
        Context context = qew0Var.a;
        paint.setColor(qje.u(context.getTheme(), xng0.bgFloating));
        invalidate();
    }

    /* renamed from: getBinding$impl, reason: from getter */
    public final n2y getBinding() {
        return this.binding;
    }

    /* renamed from: getColors$impl, reason: from getter */
    public final new0 getColors() {
        return this.colors;
    }

    /* renamed from: getContainerTouchDelegate$impl, reason: from getter */
    public final SuperappSearchbarViewTouchDelegate getContainerTouchDelegate() {
        return this.containerTouchDelegate;
    }

    /* renamed from: getDrawDelegate$impl, reason: from getter */
    public final qew0 getDrawDelegate() {
        return this.drawDelegate;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        qew0 qew0Var = this.drawDelegate;
        RectF rectF = qew0Var.c;
        float f = qew0Var.b;
        canvas.drawRoundRect(rectF, f, f, qew0Var.e);
        canvas.clipPath(qew0Var.d);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.containerTouchDelegate.onSizeChanged();
    }
}
