package com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.b;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.delegates.SuperAppMapSearchbarViewTouchDelegate;
import defpackage.a5w0;
import defpackage.a76;
import defpackage.b5w0;
import defpackage.c5w0;
import defpackage.cma1;
import defpackage.d5w0;
import defpackage.e5w0;
import defpackage.ei;
import defpackage.evu0;
import defpackage.gyt0;
import defpackage.i8h0;
import defpackage.nac;
import defpackage.ny61;
import defpackage.oxv0;
import defpackage.pav;
import defpackage.qje;
import defpackage.rzo;
import defpackage.s6w0;
import defpackage.scc;
import defpackage.skh0;
import defpackage.sug0;
import defpackage.tje;
import defpackage.tls;
import defpackage.u4w0;
import defpackage.uid;
import defpackage.v66;
import defpackage.w511;
import defpackage.xng0;
import defpackage.y4w0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ9\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J/\u0010%\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001dH\u0014¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0014¢\u0006\u0004\b'\u0010\fJ\u000f\u0010(\u001a\u00020\nH\u0014¢\u0006\u0004\b(\u0010\fJ\u0017\u0010+\u001a\u00020\n2\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0014\u00103\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/views/SuperAppMapSearchbarView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lv66;", "contentBlurDelegate", "<init>", "(Landroid/content/Context;Lpav;Lv66;)V", "Lzy11;", "updateSearchButtonsIconsTheme", "()V", "applyLayout", "updateBlur", "Lcom/yandex/go/design/view/GoLinearLayout;", "container", "", "Lu4w0;", "buttons", "Lkotlin/Function1;", "Ly4w0;", "actionHandler", "configureButtons", "(Lcom/yandex/go/design/view/GoLinearLayout;Ljava/util/List;Ltls;)V", "Lc5w0;", ClidProvider.STATE, "render", "(Lc5w0;Ltls;)V", "", "inset", "applyBottomInset", "(I)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lpav;", "Lv66;", "imageSize", CA20Status.STATUS_USER_I, "blurTopPadding", "Ls6w0;", "binding", "Ls6w0;", "Le5w0;", "dimens", "Le5w0;", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/delegates/SuperAppMapSearchbarViewTouchDelegate;", "searchbarTouchDelegate", "Lcom/yandex/go/superapp/discovery/map/impl/ui/main/searchbar/delegates/SuperAppMapSearchbarViewTouchDelegate;", "", "backgroundCornerRadius", "F", "Landroid/graphics/RectF;", "backgroundRect", "Landroid/graphics/RectF;", "Landroid/graphics/Path;", "backgroundPath", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "backgroundPaint", "Landroid/graphics/Paint;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "preDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperAppMapSearchbarView extends GoFrameLayout {
    private float backgroundCornerRadius;
    private final Paint backgroundPaint;
    private final Path backgroundPath;
    private final RectF backgroundRect;
    private final s6w0 binding;
    private final int blurTopPadding;
    private final v66 contentBlurDelegate;
    private final e5w0 dimens;
    private final pav imageLoader;
    private final int imageSize;
    private final ViewTreeObserver.OnPreDrawListener preDrawListener;
    private final SuperAppMapSearchbarViewTouchDelegate searchbarTouchDelegate;

    public SuperAppMapSearchbarView(Context context, pav pavVar, v66 v66Var) {
        super(context, null, 0, 0, 14, null);
        this.imageLoader = pavVar;
        this.contentBlurDelegate = v66Var;
        this.imageSize = tje.u(40, getContext());
        int r = tje.r(sug0.discovery_map_searchbar_blur_padding_top, getContext());
        this.blurTopPadding = r;
        LayoutInflater.from(context).inflate(skh0.super_app_searchbar_layout, this);
        int i = i8h0.expanded_content;
        GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i, this);
        if (goLinearLayout != null) {
            i = i8h0.lead_buttons;
            GoLinearLayout goLinearLayout2 = (GoLinearLayout) cma1.O(i, this);
            if (goLinearLayout2 != null) {
                i = i8h0.subtitle;
                RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
                if (robotoTextView != null) {
                    i = i8h0.texts_container;
                    if (((GoLinearLayout) cma1.O(i, this)) != null) {
                        i = i8h0.title;
                        DiscoveryMapSearchbarAnimatedTextView discoveryMapSearchbarAnimatedTextView = (DiscoveryMapSearchbarAnimatedTextView) cma1.O(i, this);
                        if (discoveryMapSearchbarAnimatedTextView != null) {
                            i = i8h0.trail_buttons;
                            GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i, this);
                            if (goLinearLayout3 != null) {
                                s6w0 s6w0Var = new s6w0(this, goLinearLayout, goLinearLayout2, robotoTextView, discoveryMapSearchbarAnimatedTextView, goLinearLayout3);
                                this.binding = s6w0Var;
                                e5w0 e5w0Var = new e5w0(this);
                                this.dimens = e5w0Var;
                                this.searchbarTouchDelegate = new SuperAppMapSearchbarViewTouchDelegate(this, s6w0Var, e5w0Var);
                                this.backgroundRect = new RectF();
                                this.backgroundPath = new Path();
                                Paint paint = new Paint(1);
                                paint.setColor(qje.t(xng0.bgFloating, context));
                                this.backgroundPaint = paint;
                                this.preDrawListener = new uid(4, this);
                                setOutlineProvider(null);
                                setWillNotDraw(false);
                                setPaddingRelative(getPaddingStart(), r, getPaddingEnd(), getPaddingBottom());
                                b.p(this, new ei(24));
                                return;
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void applyLayout() {
        setTranslationX(0.0f);
        float f = this.blurTopPadding;
        e5w0 e5w0Var = this.dimens;
        float f2 = e5w0Var.d;
        float f3 = e5w0Var.e;
        this.backgroundCornerRadius = f3;
        this.backgroundRect.set(f2, f, ((Number) e5w0Var.b.invoke()).floatValue() + f2, this.dimens.c + f);
        this.backgroundPath.addRoundRect(this.backgroundRect, f3, f3, Path.Direction.CW);
        int i = this.dimens.d;
        setPaddingRelative(i, getPaddingTop(), i, getPaddingBottom());
    }

    private final void configureButtons(GoLinearLayout container, List<u4w0> buttons, tls actionHandler) {
        int childCount = container.getChildCount();
        for (int size = buttons.size(); size < childCount; size++) {
            container.removeViewAt(size);
        }
        int size2 = buttons.size() - container.getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < size2; i2++) {
            GoImageView goImageView = new GoImageView(getContext(), null, 0, 6, null);
            goImageView.setScaleType(ImageView.ScaleType.CENTER);
            int i3 = this.imageSize;
            container.addView(goImageView, new LinearLayout.LayoutParams(i3, i3));
        }
        for (Object obj : buttons) {
            int i4 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            u4w0 u4w0Var = (u4w0) obj;
            GoImageView goImageView2 = (GoImageView) container.getChildAt(i);
            ((nac) this.imageLoader.a(goImageView2)).c(u4w0Var.a);
            c.z(new gyt0(12, u4w0Var, actionHandler), goImageView2);
            goImageView2.setContentDescription(u4w0Var.b);
            i = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 configureButtons$lambda$1$0(u4w0 u4w0Var, tls tlsVar) {
        y4w0 y4w0Var = u4w0Var.c;
        if (y4w0Var != null) {
            tlsVar.invoke(y4w0Var);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a76 onDetachedFromWindow$lambda$0(a76 a76Var) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean preDrawListener$lambda$0(SuperAppMapSearchbarView superAppMapSearchbarView) {
        superAppMapSearchbarView.updateBlur();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0(c5w0 c5w0Var, tls tlsVar) {
        y4w0 y4w0Var = c5w0Var.d;
        if (y4w0Var != null) {
            tlsVar.invoke(y4w0Var);
        }
        return zy11.a;
    }

    private final void updateBlur() {
        if (getMeasuredHeight() == 0) {
            return;
        }
        this.contentBlurDelegate.d(new d5w0(this, Float.intBitsToFloat((int) (rzo.A(this) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))), null);
    }

    private final void updateSearchButtonsIconsTheme() {
        int t = qje.t(xng0.textMain, getContext());
        s6w0 s6w0Var = this.binding;
        for (GoLinearLayout goLinearLayout : scc.g(s6w0Var.c, s6w0Var.f)) {
            int childCount = goLinearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = goLinearLayout.getChildAt(i);
                GoImageView goImageView = childAt instanceof GoImageView ? (GoImageView) childAt : null;
                if (goImageView != null) {
                    goImageView.setColorFilter(t);
                }
            }
        }
    }

    public final void applyBottomInset(int inset) {
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), tje.r(sug0.discovery_map_searchbar_blur_padding_bottom, getContext()) + inset);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = getPaddingBottom() + this.blurTopPadding + ((int) this.dimens.c);
        } else {
            layoutParams = null;
        }
        setLayoutParams(layoutParams);
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.backgroundPaint.setColor(qje.t(xng0.bgFloating, getContext()));
        this.contentBlurDelegate.c();
        updateSearchButtonsIconsTheme();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setTouchDelegate(this.searchbarTouchDelegate);
        }
        getViewTreeObserver().addOnPreDrawListener(this.preDrawListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.preDrawListener);
        this.contentBlurDelegate.d(new oxv0(2), null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        RectF rectF = this.backgroundRect;
        float f = this.backgroundCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
        canvas.clipPath(this.backgroundPath);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.searchbarTouchDelegate.onSizeChanged();
    }

    public final void render(c5w0 state, tls actionHandler) {
        CharSequence charSequence;
        applyLayout();
        b5w0 b5w0Var = state.a;
        String str = state.b;
        if (b5w0Var != null) {
            this.binding.e.render$impl(b5w0Var);
        }
        int i = 8;
        this.binding.e.setVisibility(b5w0Var == null ? 8 : 0);
        this.binding.d.setText(str);
        RobotoTextView robotoTextView = this.binding.d;
        if (str != null && !evu0.J(str)) {
            i = 0;
        }
        robotoTextView.setVisibility(i);
        c.z(new gyt0(11, state, actionHandler), this);
        if (b5w0Var instanceof a5w0) {
            charSequence = ((a5w0) b5w0Var).a;
        } else {
            if (b5w0Var != null) {
                w511.b();
                return;
            }
            charSequence = "";
        }
        if (str == null) {
            str = "";
        }
        setContentDescription(evu0.k0(((Object) charSequence) + " " + str).toString());
        configureButtons(this.binding.c, state.e, actionHandler);
        configureButtons(this.binding.f, state.f, actionHandler);
        int abs = Math.abs(this.binding.c.getChildCount() - this.binding.f.getChildCount());
        int childCount = this.binding.c.getChildCount();
        int childCount2 = this.binding.f.getChildCount();
        s6w0 s6w0Var = this.binding;
        if (childCount > childCount2) {
            GoLinearLayout goLinearLayout = s6w0Var.f;
            goLinearLayout.setPaddingRelative(this.imageSize * abs, goLinearLayout.getPaddingTop(), goLinearLayout.getPaddingEnd(), goLinearLayout.getPaddingBottom());
        } else if (s6w0Var.c.getChildCount() < this.binding.f.getChildCount()) {
            GoLinearLayout goLinearLayout2 = this.binding.c;
            goLinearLayout2.setPaddingRelative(goLinearLayout2.getPaddingStart(), goLinearLayout2.getPaddingTop(), this.imageSize * abs, goLinearLayout2.getPaddingBottom());
        }
    }
}
