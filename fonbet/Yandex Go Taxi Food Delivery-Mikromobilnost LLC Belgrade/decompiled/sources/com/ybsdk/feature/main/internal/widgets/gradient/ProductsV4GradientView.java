package com.ybsdk.feature.main.internal.widgets.gradient;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.gbf0;
import defpackage.jl40;
import defpackage.nbf0;
import defpackage.o8m;
import defpackage.oxe0;
import defpackage.pbf0;
import defpackage.qbf0;
import defpackage.rbf0;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v4b1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0019J\r\u0010 \u001a\u00020\u0015¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/ybsdk/feature/main/internal/widgets/gradient/ProductsV4GradientView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "Lnbf0;", "keyframes", "", "progress", "Lkotlin/Triple;", "interpolateKeyframes", "(Ljava/util/List;F)Lkotlin/Triple;", "", "w", "h", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lrbf0;", ClidProvider.STATE, "render", "(Lrbf0;)V", "startGradientAnimation", "stopGradientAnimation", "Landroidx/appcompat/widget/AppCompatImageView;", "gradientImageView", "Landroidx/appcompat/widget/AppCompatImageView;", "Lcom/ybsdk/feature/main/internal/widgets/gradient/ProductsV4GradientDrawable;", "gradientDrawable", "Lcom/ybsdk/feature/main/internal/widgets/gradient/ProductsV4GradientDrawable;", "", "canShowGradientDrawable", "Z", "animationStarted", "Landroid/animation/ValueAnimator;", "pulseAnimator", "Landroid/animation/ValueAnimator;", "currentState", "Lrbf0;", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsV4GradientView extends FrameLayout {
    private boolean animationStarted;
    private final boolean canShowGradientDrawable;
    private rbf0 currentState;
    private final ProductsV4GradientDrawable gradientDrawable;
    private final AppCompatImageView gradientImageView;
    private ValueAnimator pulseAnimator;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.valueOf(((nbf0) obj).a).compareTo(Float.valueOf(((nbf0) obj2).a));
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.valueOf(((nbf0) obj).a).compareTo(Float.valueOf(((nbf0) obj2).a));
        }
    }

    public ProductsV4GradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -1));
        this.gradientImageView = appCompatImageView;
        this.gradientDrawable = new ProductsV4GradientDrawable();
        this.canShowGradientDrawable = Build.VERSION.SDK_INT >= 31;
        setClipChildren(false);
    }

    private final Triple<Float, Float, Float> interpolateKeyframes(List<nbf0> keyframes, float progress) {
        Iterator<nbf0> it = keyframes.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().a >= progress) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : keyframes.size();
        if (intValue == 0) {
            nbf0 nbf0Var = (nbf0) kotlin.collections.a.P(keyframes);
            return new Triple<>(Float.valueOf(nbf0Var.b), Float.valueOf(nbf0Var.c), Float.valueOf(nbf0Var.d));
        }
        if (intValue >= keyframes.size()) {
            nbf0 nbf0Var2 = (nbf0) kotlin.collections.a.Z(keyframes);
            return new Triple<>(Float.valueOf(nbf0Var2.b), Float.valueOf(nbf0Var2.c), Float.valueOf(nbf0Var2.d));
        }
        nbf0 nbf0Var3 = keyframes.get(intValue - 1);
        nbf0 nbf0Var4 = keyframes.get(intValue);
        float f = nbf0Var4.a;
        float f2 = nbf0Var3.a;
        float f3 = f == f2 ? 0.0f : (progress - f2) / (f - f2);
        float f4 = nbf0Var3.b;
        Float valueOf2 = Float.valueOf(((nbf0Var4.b - f4) * f3) + f4);
        float f5 = nbf0Var3.c;
        Float valueOf3 = Float.valueOf(((nbf0Var4.c - f5) * f3) + f5);
        float f6 = nbf0Var3.d;
        return new Triple<>(valueOf2, valueOf3, Float.valueOf(((nbf0Var4.d - f6) * f3) + f6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startGradientAnimation$lambda$12$lambda$11(List list, ProductsV4GradientView productsV4GradientView, List list2, ValueAnimator valueAnimator) {
        gbf0 mainLayer;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (list != null) {
            Triple<Float, Float, Float> interpolateKeyframes = productsV4GradientView.interpolateKeyframes(list, floatValue);
            float floatValue2 = ((Number) interpolateKeyframes.getFirst()).floatValue();
            float floatValue3 = ((Number) interpolateKeyframes.getSecond()).floatValue();
            float floatValue4 = ((Number) interpolateKeyframes.getThird()).floatValue();
            gbf0 mainLayer2 = productsV4GradientView.gradientDrawable.getMainLayer();
            mainLayer = mainLayer2 != null ? gbf0.a(mainLayer2, floatValue2, floatValue3, floatValue4) : null;
        } else {
            mainLayer = productsV4GradientView.gradientDrawable.getMainLayer();
        }
        ArrayList arrayList = new ArrayList(productsV4GradientView.gradientDrawable.getOverlayLayers());
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                int intValue = ((Number) pair.getFirst()).intValue();
                List<nbf0> list3 = (List) pair.getSecond();
                if (intValue < arrayList.size()) {
                    Triple<Float, Float, Float> interpolateKeyframes2 = productsV4GradientView.interpolateKeyframes(list3, floatValue);
                    arrayList.set(intValue, gbf0.a((gbf0) arrayList.get(intValue), ((Number) interpolateKeyframes2.getFirst()).floatValue(), ((Number) interpolateKeyframes2.getSecond()).floatValue(), ((Number) interpolateKeyframes2.getThird()).floatValue()));
                }
            }
        }
        productsV4GradientView.gradientDrawable.setParams(mainLayer, arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new oxe0(7, this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        stopGradientAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (!this.canShowGradientDrawable) {
            this.gradientImageView.setTranslationY(0.0f);
            return;
        }
        rbf0 rbf0Var = this.currentState;
        if (rbf0Var != null) {
            this.gradientImageView.setTranslationY(rbf0Var.b * h);
        }
    }

    public final void render(rbf0 state) {
        RenderEffect createBlurEffect;
        Shader.TileMode unused;
        pbf0 pbf0Var = state.f;
        float f = state.a;
        if (state.equals(this.currentState)) {
            return;
        }
        rbf0 rbf0Var = this.currentState;
        this.currentState = state;
        boolean z = this.canShowGradientDrawable;
        AppCompatImageView appCompatImageView = this.gradientImageView;
        if (!z) {
            appCompatImageView.setTranslationY(0.0f);
            this.gradientImageView.setBackground(null);
            this.gradientImageView.setScaleType(pbf0Var.b);
            v4b1.k(pbf0Var.a, this.gradientImageView, null, null, 6);
            return;
        }
        appCompatImageView.setTranslationY(state.b * getHeight());
        if (!jl40.j(rbf0Var != null ? Float.valueOf(rbf0Var.a) : null, f)) {
            if (f > 0.0f) {
                float f2 = f * getResources().getDisplayMetrics().density;
                AppCompatImageView appCompatImageView2 = this.gradientImageView;
                unused = Shader.TileMode.DECAL;
                createBlurEffect = RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.DECAL);
                appCompatImageView2.setRenderEffect(createBlurEffect);
            } else {
                this.gradientImageView.setRenderEffect(null);
            }
        }
        ProductsV4GradientDrawable productsV4GradientDrawable = this.gradientDrawable;
        gbf0 a2 = state.c.a(getContext());
        ArrayList arrayList = state.d;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qbf0) it.next()).a(getContext()));
        }
        productsV4GradientDrawable.setParams(a2, arrayList2);
        this.gradientImageView.setBackground(this.gradientDrawable);
        startGradientAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void startGradientAnimation() {
        rbf0 rbf0Var;
        Long l;
        List list;
        rbf0 rbf0Var2;
        Pair pair;
        List list2;
        if (!isAttachedToWindow() || !this.canShowGradientDrawable || this.animationStarted || (rbf0Var = this.currentState) == null || (l = rbf0Var.e) == null) {
            return;
        }
        long longValue = l.longValue();
        rbf0 rbf0Var3 = this.currentState;
        ArrayList arrayList = null;
        if (rbf0Var3 != null && (list2 = rbf0Var3.c.e) != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                list = kotlin.collections.a.x0(list2, new a());
                rbf0Var2 = this.currentState;
                if (rbf0Var2 != null) {
                    ArrayList arrayList2 = rbf0Var2.d;
                    ArrayList arrayList3 = new ArrayList();
                    int i = 0;
                    for (Object obj : arrayList2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            scc.m();
                            throw null;
                        }
                        List list3 = ((qbf0) obj).e;
                        if (list3 != null) {
                            if (list3.isEmpty()) {
                                list3 = null;
                            }
                            if (list3 != null) {
                                pair = new Pair(Integer.valueOf(i), kotlin.collections.a.x0(list3, new b()));
                                if (pair == null) {
                                    arrayList3.add(pair);
                                }
                                i = i2;
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                        i = i2;
                    }
                    if (!arrayList3.isEmpty()) {
                        arrayList = arrayList3;
                    }
                }
                if (list == null || arrayList != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(longValue);
                    ofFloat.setRepeatCount(-1);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new o8m(5, list, this, arrayList));
                    this.pulseAnimator = ofFloat;
                    ofFloat.start();
                    this.animationStarted = true;
                }
                return;
            }
        }
        list = null;
        rbf0Var2 = this.currentState;
        if (rbf0Var2 != null) {
        }
        if (list == null) {
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(longValue);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(2);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new o8m(5, list, this, arrayList));
        this.pulseAnimator = ofFloat2;
        ofFloat2.start();
        this.animationStarted = true;
    }

    public final void stopGradientAnimation() {
        ValueAnimator valueAnimator = this.pulseAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pulseAnimator = null;
        this.animationStarted = false;
    }

    public /* synthetic */ ProductsV4GradientView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductsV4GradientView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
