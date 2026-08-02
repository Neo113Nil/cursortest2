package com.yandex.div.core.view2.divs;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.widget.LoadableImageView;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBlendMode;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.a;
import com.yandex.div2.b4;
import com.yandex.div2.e4;
import com.yandex.div2.e5;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.e43;
import xsna.epx;
import xsna.izs;
import xsna.s3q0;

/* compiled from: DivImageBinder.kt */
/* loaded from: classes7.dex */
public final class DivImageBinder extends DivViewBinder<a.f, e5, DivImageView> {
    private final ErrorCollectors errorCollectors;
    private final DivImageLoader imageLoader;
    private final DivPlaceholderLoader placeholderLoader;

    public DivImageBinder(DivBaseBinder divBaseBinder, DivImageLoader divImageLoader, DivPlaceholderLoader divPlaceholderLoader, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFiltersAndSetBitmap(final DivImageView divImageView, BindingContext bindingContext, List<? extends e4> list) {
        Bitmap currentBitmapWithoutFilters$div_release = divImageView.getCurrentBitmapWithoutFilters$div_release();
        if (currentBitmapWithoutFilters$div_release == null) {
            divImageView.setImageBitmap(null);
        } else {
            BaseDivViewExtensionsKt.applyBitmapFilters(divImageView, bindingContext, currentBitmapWithoutFilters$div_release, list, new izs<Bitmap, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyFiltersAndSetBitmap$1
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Bitmap bitmap) {
                    DivImageView.this.setImageBitmap(bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean applyImage(final DivImageView divImageView, final BindingContext bindingContext, final e5 e5Var, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final Uri evaluate = e5Var.B.evaluate(expressionResolver);
        if (epx.f(evaluate, divImageView.getImageUrl$div_release())) {
            return false;
        }
        boolean isHighPriorityShow = isHighPriorityShow(expressionResolver, divImageView, e5Var);
        divImageView.resetImageLoaded();
        clearTint(divImageView);
        LoadReference loadReference$div_release = divImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        applyPlaceholders(divImageView, bindingContext, e5Var, isHighPriorityShow, errorCollector);
        divImageView.setImageUrl$div_release(evaluate);
        DivImageLoader divImageLoader = this.imageLoader;
        String uri = evaluate.toString();
        final Div2View divView = bindingContext.getDivView();
        LoadReference loadImage = divImageLoader.loadImage(uri, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                DivImageView.this.setImageUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                DivImageView.this.setCurrentBitmapWithoutFilters$div_release(cachedBitmap.getBitmap());
                this.applyFiltersAndSetBitmap(DivImageView.this, bindingContext, e5Var.t);
                this.applyLoadingFade(DivImageView.this, e5Var, expressionResolver, cachedBitmap.getFrom());
                DivImageView.this.imageLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                Expression<Integer> expression = e5Var.P;
                divImageBinder.applyTint(divImageView2, expression != null ? expression.evaluate(expressionResolver) : null, e5Var.Q.evaluate(expressionResolver));
                DivImageView.this.invalidate();
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(PictureDrawable pictureDrawable) {
                boolean isVectorCompatible;
                isVectorCompatible = this.isVectorCompatible(e5Var);
                if (!isVectorCompatible) {
                    onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, evaluate, null, 2, null));
                    return;
                }
                super.onSuccess(pictureDrawable);
                DivImageView.this.setImageDrawable(pictureDrawable);
                this.applyLoadingFade(DivImageView.this, e5Var, expressionResolver, null);
                DivImageView.this.imageLoaded();
                DivImageView.this.invalidate();
            }
        });
        bindingContext.getDivView().addLoadReference(loadImage, divImageView);
        divImageView.setLoadReference$div_release(loadImage);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyImageScale(DivImageView divImageView, DivImageScale divImageScale) {
        divImageView.setImageScale(DivUtilKt.toImageScale(divImageScale));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLoadingFade(DivImageView divImageView, e5 e5Var, ExpressionResolver expressionResolver, BitmapSource bitmapSource) {
        divImageView.animate().cancel();
        b4 b4Var = e5Var.i;
        float doubleValue = (float) e5Var.g.evaluate(expressionResolver).doubleValue();
        if (b4Var == null || bitmapSource == BitmapSource.MEMORY) {
            divImageView.setAlpha(doubleValue);
            return;
        }
        long longValue = b4Var.b.evaluate(expressionResolver).longValue();
        Interpolator androidInterpolator = DivUtilKt.getAndroidInterpolator(b4Var.c.evaluate(expressionResolver));
        divImageView.setAlpha((float) b4Var.a.evaluate(expressionResolver).doubleValue());
        divImageView.animate().alpha(doubleValue).setDuration(longValue).setInterpolator(androidInterpolator).setStartDelay(b4Var.d.evaluate(expressionResolver).longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final e5 e5Var, boolean z, ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression<String> expression = e5Var.K;
        divPlaceholderLoader.applyPlaceholder(divImageView, errorCollector, expression != null ? expression.evaluate(expressionResolver) : null, e5Var.G.evaluate(expressionResolver).intValue(), z, new izs<Drawable, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$1
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Drawable drawable) {
                invoke2(drawable);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Drawable drawable) {
                if (DivImageView.this.isImageLoaded() || DivImageView.this.isImagePreview()) {
                    return;
                }
                DivImageView.this.setPlaceholder(drawable);
            }
        }, new izs<ImageRepresentation, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$applyPlaceholders$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(ImageRepresentation imageRepresentation) {
                invoke2(imageRepresentation);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageRepresentation imageRepresentation) {
                if (DivImageView.this.isImageLoaded()) {
                    return;
                }
                if (!(imageRepresentation instanceof ImageRepresentation.Bitmap)) {
                    if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                        DivImageView.this.previewLoaded();
                        DivImageView.this.setImageDrawable(((ImageRepresentation.PictureDrawable) imageRepresentation).m133unboximpl());
                        return;
                    }
                    return;
                }
                DivImageView.this.setCurrentBitmapWithoutFilters$div_release(((ImageRepresentation.Bitmap) imageRepresentation).m127unboximpl());
                this.applyFiltersAndSetBitmap(DivImageView.this, bindingContext, e5Var.t);
                DivImageView.this.previewLoaded();
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                Expression<Integer> expression2 = e5Var.P;
                divImageBinder.applyTint(divImageView2, expression2 != null ? expression2.evaluate(expressionResolver) : null, e5Var.Q.evaluate(expressionResolver));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTint(LoadableImageView loadableImageView, Integer num, DivBlendMode divBlendMode) {
        if ((loadableImageView.isImageLoaded() || loadableImageView.isImagePreview()) && num != null) {
            loadableImageView.setColorFilter(num.intValue(), DivUtilKt.toPorterDuffMode(divBlendMode));
        } else {
            clearTint(loadableImageView);
        }
    }

    private final void bindContentAlignment(final DivImageView divImageView, final e5 e5Var, e5 e5Var2, final ExpressionResolver expressionResolver) {
        Expression<DivAlignmentHorizontal> expression = e5Var.o;
        Expression<DivAlignmentHorizontal> expression2 = e5Var.o;
        Expression<DivAlignmentVertical> expression3 = e5Var.p;
        if (ExpressionsKt.equalsToConstant(expression, e5Var2 != null ? e5Var2.o : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, e5Var2 != null ? e5Var2.p : null)) {
                return;
            }
        }
        applyContentAlignment(divImageView, expression2.evaluate(expressionResolver), expression3.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(expression2) && ExpressionsKt.isConstant(expression3)) {
            return;
        }
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindContentAlignment$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivImageBinder.this.applyContentAlignment(divImageView, e5Var.o.evaluate(expressionResolver), e5Var.p.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(expression2.observe(expressionResolver, izsVar));
        divImageView.addSubscription(expression3.observe(expressionResolver, izsVar));
    }

    private final void bindFilters(final DivImageView divImageView, final BindingContext bindingContext, final e5 e5Var, e5 e5Var2) {
        boolean z;
        List<e4> list;
        List<e4> list2;
        List<e4> list3 = e5Var.t;
        List<e4> list4 = e5Var.t;
        Boolean bool = null;
        boolean f = epx.f(list3 != null ? Integer.valueOf(list3.size()) : null, (e5Var2 == null || (list2 = e5Var2.t) == null) ? null : Integer.valueOf(list2.size()));
        boolean z2 = false;
        if (f) {
            if (list4 != null) {
                int i = 0;
                z = true;
                for (Object obj : list4) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    e4 e4Var = (e4) obj;
                    if (z) {
                        if (DivDataExtensionsKt.equalsToConstant(e4Var, (e5Var2 == null || (list = e5Var2.t) == null) ? null : list.get(i))) {
                            z = true;
                            i = i2;
                        }
                    }
                    z = false;
                    i = i2;
                }
            } else {
                z = true;
            }
            if (z) {
                return;
            }
        }
        applyFiltersAndSetBitmap(divImageView, bindingContext, list4);
        if (list4 != null) {
            List<e4> list5 = list4;
            if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                Iterator<T> it = list5.iterator();
                while (it.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((e4) it.next())) {
                        break;
                    }
                }
            }
            z2 = true;
            bool = Boolean.valueOf(z2);
        }
        if (epx.f(bool, Boolean.FALSE)) {
            izs<? super Long, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindFilters$callback$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Object obj2) {
                    invoke2(obj2);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object obj2) {
                    DivImageBinder.this.applyFiltersAndSetBitmap(divImageView, bindingContext, e5Var.t);
                }
            };
            if (list4 != null) {
                for (e4 e4Var2 : list4) {
                    if (e4Var2 instanceof e4.a) {
                        divImageView.addSubscription(((e4.a) e4Var2).b.a.observe(bindingContext.getExpressionResolver(), izsVar));
                    }
                }
            }
        }
    }

    private final void bindImageScale(final DivImageView divImageView, e5 e5Var, e5 e5Var2, ExpressionResolver expressionResolver) {
        Expression<DivImageScale> expression = e5Var.N;
        Expression<DivImageScale> expression2 = e5Var.N;
        if (ExpressionsKt.equalsToConstant(expression, e5Var2 != null ? e5Var2.N : null)) {
            return;
        }
        applyImageScale(divImageView, expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(expression2)) {
            return;
        }
        divImageView.addSubscription(expression2.observe(expressionResolver, new izs<DivImageScale, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindImageScale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(DivImageScale divImageScale) {
                invoke2(divImageScale);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivImageScale divImageScale) {
                DivImageBinder.this.applyImageScale(divImageView, divImageScale);
            }
        }));
    }

    private final void bindPreviewAndImage(final DivImageView divImageView, final BindingContext bindingContext, e5 e5Var, e5 e5Var2, final ErrorCollector errorCollector) {
        boolean z;
        boolean z2;
        final e5 e5Var3 = e5Var;
        Expression<Uri> expression = e5Var3.B;
        Expression<Uri> expression2 = e5Var3.B;
        Expression<Integer> expression3 = e5Var3.G;
        Expression<String> expression4 = e5Var3.K;
        boolean equalsToConstant = ExpressionsKt.equalsToConstant(expression, e5Var2 != null ? e5Var2.B : null);
        if (ExpressionsKt.equalsToConstant(expression4, e5Var2 != null ? e5Var2.K : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, e5Var2 != null ? e5Var2.G : null)) {
                z = false;
                boolean z3 = !ExpressionsKt.isConstantOrNull(expression4) && ExpressionsKt.isConstant(expression3);
                z2 = divImageView.isImageLoaded() && z;
                if (z2 && !z3) {
                    observePlaceholders(divImageView, bindingContext, e5Var, errorCollector);
                }
                if (!equalsToConstant && !ExpressionsKt.isConstantOrNull(expression2)) {
                    ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
                    izs<Uri, s3q0> izsVar = new izs<Uri, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public /* bridge */ /* synthetic */ s3q0 invoke(Uri uri) {
                            invoke2(uri);
                            return s3q0.a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Uri uri) {
                            DivImageBinder.this.applyImage(divImageView, bindingContext, e5Var3, errorCollector);
                        }
                    };
                    e5Var3 = e5Var3;
                    divImageView.addSubscription(expression2.observe(expressionResolver, izsVar));
                }
                if (applyImage(divImageView, bindingContext, e5Var, errorCollector) && z2) {
                    applyPlaceholders(divImageView, bindingContext, e5Var3, isHighPriorityShow(bindingContext.getExpressionResolver(), divImageView, e5Var), errorCollector);
                    return;
                }
            }
        }
        z = true;
        if (ExpressionsKt.isConstantOrNull(expression4)) {
        }
        if (divImageView.isImageLoaded()) {
        }
        if (z2) {
            observePlaceholders(divImageView, bindingContext, e5Var, errorCollector);
        }
        if (!equalsToConstant) {
            ExpressionResolver expressionResolver2 = bindingContext.getExpressionResolver();
            izs<Uri, s3q0> izsVar2 = new izs<Uri, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindPreviewAndImage$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // xsna.izs
                public /* bridge */ /* synthetic */ s3q0 invoke(Uri uri) {
                    invoke2(uri);
                    return s3q0.a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Uri uri) {
                    DivImageBinder.this.applyImage(divImageView, bindingContext, e5Var3, errorCollector);
                }
            };
            e5Var3 = e5Var3;
            divImageView.addSubscription(expression2.observe(expressionResolver2, izsVar2));
        }
        if (applyImage(divImageView, bindingContext, e5Var, errorCollector)) {
        }
    }

    private final void bindTint(final DivImageView divImageView, final e5 e5Var, e5 e5Var2, final ExpressionResolver expressionResolver) {
        Expression<Integer> expression = e5Var.P;
        Expression<Integer> expression2 = e5Var.P;
        Expression<DivBlendMode> expression3 = e5Var.Q;
        if (ExpressionsKt.equalsToConstant(expression, e5Var2 != null ? e5Var2.P : null)) {
            if (ExpressionsKt.equalsToConstant(expression3, e5Var2 != null ? e5Var2.Q : null)) {
                return;
            }
        }
        applyTint(divImageView, expression2 != null ? expression2.evaluate(expressionResolver) : null, expression3.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(expression2) && ExpressionsKt.isConstant(expression3)) {
            return;
        }
        izs<? super Integer, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$bindTint$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivImageBinder divImageBinder = DivImageBinder.this;
                DivImageView divImageView2 = divImageView;
                Expression<Integer> expression4 = e5Var.P;
                divImageBinder.applyTint(divImageView2, expression4 != null ? expression4.evaluate(expressionResolver) : null, e5Var.Q.evaluate(expressionResolver));
            }
        };
        divImageView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, izsVar) : null);
        divImageView.addSubscription(expression3.observe(expressionResolver, izsVar));
    }

    private final void clearTint(ImageView imageView) {
        imageView.setColorFilter((ColorFilter) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHighPriorityShow(ExpressionResolver expressionResolver, DivImageView divImageView, e5 e5Var) {
        return !divImageView.isImageLoaded() && e5Var.x.evaluate(expressionResolver).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVectorCompatible(e5 e5Var) {
        if (e5Var.P != null) {
            return false;
        }
        List<e4> list = e5Var.t;
        return list == null || list.isEmpty();
    }

    private final void observePlaceholders(final DivImageView divImageView, final BindingContext bindingContext, final e5 e5Var, final ErrorCollector errorCollector) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        izs<? super String, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivImageBinder$observePlaceholders$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke2(obj);
                return s3q0.a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                boolean isHighPriorityShow;
                if (DivImageView.this.isImageLoaded()) {
                    return;
                }
                DivImageBinder divImageBinder = this;
                DivImageView divImageView2 = DivImageView.this;
                BindingContext bindingContext2 = bindingContext;
                e5 e5Var2 = e5Var;
                isHighPriorityShow = divImageBinder.isHighPriorityShow(expressionResolver, divImageView2, e5Var2);
                divImageBinder.applyPlaceholders(divImageView2, bindingContext2, e5Var2, isHighPriorityShow, errorCollector);
            }
        };
        Expression<String> expression = e5Var.K;
        divImageView.addSubscription(expression != null ? expression.observe(expressionResolver, izsVar) : null);
        divImageView.addSubscription(e5Var.G.observe(expressionResolver, izsVar));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivImageView divImageView, BindingContext bindingContext, e5 e5Var, e5 e5Var2) {
        BaseDivViewExtensionsKt.applyDivActions(divImageView, bindingContext, e5Var.b, e5Var.d, e5Var.D, e5Var.r, e5Var.z, e5Var.y, e5Var.J, e5Var.I, e5Var.c, e5Var.m);
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.bindAspectRatio(divImageView, e5Var.j, e5Var2 != null ? e5Var2.j : null, expressionResolver);
        bindImageScale(divImageView, e5Var, e5Var2, expressionResolver);
        bindContentAlignment(divImageView, e5Var, e5Var2, expressionResolver);
        bindPreviewAndImage(divImageView, bindingContext, e5Var, e5Var2, orCreate);
        bindTint(divImageView, e5Var, e5Var2, expressionResolver);
        bindFilters(divImageView, bindingContext, e5Var, e5Var2);
    }
}
