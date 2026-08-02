package com.yandex.div.svg;

import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.images.DivImageDownloadCallback;
import java.io.ByteArrayInputStream;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okhttp3.d;
import xsna.b6l;
import xsna.bdn;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;

/* compiled from: SvgDivImageLoader.kt */
@b6l(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2", f = "SvgDivImageLoader.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class SvgDivImageLoader$loadImage$2 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ d $call;
    final /* synthetic */ DivImageDownloadCallback $callback;
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ SvgDivImageLoader this$0;

    /* compiled from: SvgDivImageLoader.kt */
    @b6l(c = "com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1", f = "SvgDivImageLoader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.div.svg.SvgDivImageLoader$loadImage$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super PictureDrawable>, Object> {
        final /* synthetic */ d $call;
        final /* synthetic */ String $imageUrl;
        int label;
        final /* synthetic */ SvgDivImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, SvgDivImageLoader svgDivImageLoader, String str, spj<? super AnonymousClass1> spjVar) {
            super(2, spjVar);
            this.$call = dVar;
            this.this$0 = svgDivImageLoader;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SvgDecoder svgDecoder;
            SvgCacheManager svgCacheManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
            d dVar = this.$call;
            byte[] imageData = dVar == null ? this.this$0.getImageData(this.$imageUrl) : this.this$0.downloadImage(dVar);
            if (imageData == null) {
                return null;
            }
            svgDecoder = this.this$0.svgDecoder;
            PictureDrawable decode = svgDecoder.decode(new ByteArrayInputStream(imageData));
            if (decode == null) {
                return null;
            }
            svgCacheManager = this.this$0.svgCacheManager;
            svgCacheManager.set(this.$imageUrl, decode);
            return decode;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super PictureDrawable> spjVar) {
            return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SvgDivImageLoader$loadImage$2(DivImageDownloadCallback divImageDownloadCallback, d dVar, SvgDivImageLoader svgDivImageLoader, String str, spj<? super SvgDivImageLoader$loadImage$2> spjVar) {
        super(2, spjVar);
        this.$callback = divImageDownloadCallback;
        this.$call = dVar;
        this.this$0 = svgDivImageLoader;
        this.$imageUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new SvgDivImageLoader$loadImage$2(this.$callback, this.$call, this.this$0, this.$imageUrl, spjVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        s3q0 s3q0Var = null;
        if (i == 0) {
            a.a(obj);
            bdn bdnVar = bdn.a;
            wgl wglVar = wgl.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$call, this.this$0, this.$imageUrl, null);
            this.label = 1;
            obj = myc0.k(wglVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(obj);
        }
        PictureDrawable pictureDrawable = (PictureDrawable) obj;
        if (pictureDrawable != null) {
            this.$callback.onSuccess(pictureDrawable);
            s3q0Var = s3q0.a;
        }
        if (s3q0Var == null) {
            this.$callback.onError();
        }
        return s3q0.a;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((SvgDivImageLoader$loadImage$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
