package com.yandex.div.core.view2.divs;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ImageRepresentation;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivPlaceholderLoader;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivGifImageView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.AspectImageView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.a;
import com.yandex.div2.y4;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import xsna.epx;
import xsna.izs;
import xsna.nbr;
import xsna.s3q0;
import xsna.zcl;

/* compiled from: DivGifImageBinder.kt */
/* loaded from: classes7.dex */
public final class DivGifImageBinder extends DivViewBinder<a.d, y4, DivGifImageView> {
    private static final Companion Companion = new Companion(null);
    private final ErrorCollectors errorCollectors;
    private final DivImageLoader imageLoader;
    private final DivPlaceholderLoader placeholderLoader;

    /* compiled from: DivGifImageBinder.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: DivGifImageBinder.kt */
    public static final class LoadDrawableOnPostPTask extends AsyncTask<Void, Void, Drawable> {
        private final CachedBitmap cachedBitmap;
        private final WeakReference<DivGifImageView> view;

        public LoadDrawableOnPostPTask(WeakReference<DivGifImageView> weakReference, CachedBitmap cachedBitmap) {
            this.view = weakReference;
            this.cachedBitmap = cachedBitmap;
        }

        private final Drawable createDrawableFromBytes() throws IOException, IllegalStateException {
            Context context;
            byte[] bytes = this.cachedBitmap.getBytes();
            if (bytes == null) {
                throw new IllegalStateException("no bytes stored in cached bitmap");
            }
            DivGifImageView divGifImageView = this.view.get();
            if (divGifImageView == null || (context = divGifImageView.getContext()) == null) {
                throw new IllegalStateException("failed retrieve context");
            }
            File createTempFile = File.createTempFile("if_u_see_me_in_file_system_plz_report", ".gif", context.getCacheDir());
            try {
                nbr.v(createTempFile, bytes);
                return ImageDecoder.decodeDrawable(ImageDecoder.createSource(createTempFile));
            } finally {
                createTempFile.delete();
            }
        }

        private final ImageDecoder.Source createSourceFromUri() {
            Uri cacheUri = this.cachedBitmap.getCacheUri();
            String path = cacheUri != null ? cacheUri.getPath() : null;
            if (path == null) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "No bytes or file in cache to decode gif drawable");
                }
                return null;
            }
            try {
                return ImageDecoder.createSource(new File(path));
            } catch (IOException e) {
                if (!KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    return null;
                }
                Log.e("DivGifImageBinder", "", e);
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Drawable doInBackground(Void... voidArr) {
            ImageDecoder.Source createSourceFromUri;
            try {
                return createDrawableFromBytes();
            } catch (IOException e) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivGifImageBinder", "Failed writing bytes to temp file, exception: " + e.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                    return null;
                }
                try {
                    return ImageDecoder.decodeDrawable(createSourceFromUri);
                } catch (IOException e2) {
                    KLog kLog2 = KLog.INSTANCE;
                    if (!kLog2.isAtLeast(Severity.ERROR)) {
                        return null;
                    }
                    kLog2.print(6, "DivGifImageBinder", "Decode drawable from uri exception " + e2.getMessage());
                    return null;
                }
            } catch (IllegalStateException e3) {
                KLog kLog3 = KLog.INSTANCE;
                if (kLog3.isAtLeast(Severity.ERROR)) {
                    kLog3.print(6, "DivGifImageBinder", "Failed create drawable from bytes, exception: " + e3.getMessage());
                }
                createSourceFromUri = createSourceFromUri();
                if (createSourceFromUri != null) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute((LoadDrawableOnPostPTask) drawable);
            if (drawable == null || !(drawable instanceof AnimatedImageDrawable)) {
                DivGifImageView divGifImageView = this.view.get();
                if (divGifImageView != null) {
                    divGifImageView.setImage(this.cachedBitmap.getBitmap());
                }
            } else {
                DivGifImageView divGifImageView2 = this.view.get();
                if (divGifImageView2 != null) {
                    divGifImageView2.setImage(drawable);
                }
            }
            DivGifImageView divGifImageView3 = this.view.get();
            if (divGifImageView3 != null) {
                divGifImageView3.imageLoaded();
            }
        }
    }

    public DivGifImageBinder(DivBaseBinder divBaseBinder, DivImageLoader divImageLoader, DivPlaceholderLoader divPlaceholderLoader, ErrorCollectors errorCollectors) {
        super(divBaseBinder);
        this.imageLoader = divImageLoader;
        this.placeholderLoader = divPlaceholderLoader;
        this.errorCollectors = errorCollectors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyContentAlignment(AspectImageView aspectImageView, ExpressionResolver expressionResolver, Expression<DivAlignmentHorizontal> expression, Expression<DivAlignmentVertical> expression2) {
        aspectImageView.setGravity(DivUtilKt.evaluateGravity(expression.evaluate(expressionResolver), expression2.evaluate(expressionResolver)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyGifImage(final DivGifImageView divGifImageView, final Div2View div2View, ExpressionResolver expressionResolver, y4 y4Var, ErrorCollector errorCollector) {
        Uri evaluate = y4Var.u.evaluate(expressionResolver);
        if (epx.f(evaluate, divGifImageView.getGifUrl$div_release())) {
            return;
        }
        divGifImageView.resetImageLoaded();
        LoadReference loadReference$div_release = divGifImageView.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        DivPlaceholderLoader divPlaceholderLoader = this.placeholderLoader;
        Expression<String> expression = y4Var.H;
        divPlaceholderLoader.applyPlaceholder(divGifImageView, errorCollector, expression != null ? expression.evaluate(expressionResolver) : null, y4Var.D.evaluate(expressionResolver).intValue(), false, new izs<Drawable, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$1
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
                if (DivGifImageView.this.isImageLoaded() || DivGifImageView.this.isImagePreview()) {
                    return;
                }
                DivGifImageView.this.setPlaceholder(drawable);
            }
        }, new izs<ImageRepresentation, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$2
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
                if (DivGifImageView.this.isImageLoaded()) {
                    return;
                }
                if (imageRepresentation instanceof ImageRepresentation.Bitmap) {
                    DivGifImageView.this.setPreview(((ImageRepresentation.Bitmap) imageRepresentation).m127unboximpl());
                } else if (imageRepresentation instanceof ImageRepresentation.PictureDrawable) {
                    DivGifImageView.this.setPreview(((ImageRepresentation.PictureDrawable) imageRepresentation).m133unboximpl());
                }
                DivGifImageView.this.previewLoaded();
            }
        });
        divGifImageView.setGifUrl$div_release(evaluate);
        LoadReference loadImageBytes = this.imageLoader.loadImageBytes(evaluate.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$applyGifImage$reference$1
            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onError() {
                super.onError();
                divGifImageView.setGifUrl$div_release(null);
            }

            @Override // com.yandex.div.core.images.DivImageDownloadCallback
            public void onSuccess(CachedBitmap cachedBitmap) {
                super.onSuccess(cachedBitmap);
                this.loadDrawable(divGifImageView, cachedBitmap);
            }
        });
        div2View.addLoadReference(loadImageBytes, divGifImageView);
        divGifImageView.setLoadReference$div_release(loadImageBytes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDrawable(DivGifImageView divGifImageView, CachedBitmap cachedBitmap) {
        new LoadDrawableOnPostPTask(new WeakReference(divGifImageView), cachedBitmap).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private final void observeContentAlignment(final DivGifImageView divGifImageView, final ExpressionResolver expressionResolver, final Expression<DivAlignmentHorizontal> expression, final Expression<DivAlignmentVertical> expression2) {
        applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
        izs<? super DivAlignmentHorizontal, s3q0> izsVar = new izs<Object, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$observeContentAlignment$callback$1
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
                DivGifImageBinder.this.applyContentAlignment(divGifImageView, expressionResolver, expression, expression2);
            }
        };
        divGifImageView.addSubscription(expression.observe(expressionResolver, izsVar));
        divGifImageView.addSubscription(expression2.observe(expressionResolver, izsVar));
    }

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(final DivGifImageView divGifImageView, BindingContext bindingContext, final y4 y4Var, y4 y4Var2) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final ErrorCollector orCreate = this.errorCollectors.getOrCreate(divView.getDataTag(), divView.getDivData());
        BaseDivViewExtensionsKt.applyDivActions(divGifImageView, bindingContext, y4Var.b, y4Var.d, y4Var.A, y4Var.q, y4Var.x, y4Var.w, y4Var.G, y4Var.F, y4Var.c, y4Var.l);
        BaseDivViewExtensionsKt.bindAspectRatio(divGifImageView, y4Var.i, y4Var2 != null ? y4Var2.i : null, expressionResolver);
        divGifImageView.addSubscription(y4Var.K.observeAndGet(expressionResolver, new izs<DivImageScale, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$1
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
                DivGifImageView.this.setImageScale(DivUtilKt.toImageScale(divImageScale));
            }
        }));
        observeContentAlignment(divGifImageView, expressionResolver, y4Var.n, y4Var.o);
        divGifImageView.addSubscription(y4Var.u.observeAndGet(expressionResolver, new izs<Uri, s3q0>() { // from class: com.yandex.div.core.view2.divs.DivGifImageBinder$bind$2
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
                DivGifImageBinder.this.applyGifImage(divGifImageView, divView, expressionResolver, y4Var, orCreate);
            }
        }));
    }
}
