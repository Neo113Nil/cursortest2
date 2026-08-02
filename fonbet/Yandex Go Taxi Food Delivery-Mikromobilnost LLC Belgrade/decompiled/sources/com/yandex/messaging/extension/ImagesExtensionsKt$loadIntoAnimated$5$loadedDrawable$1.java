package com.yandex.messaging.extension;

import android.graphics.ImageDecoder;
import android.net.Uri;
import android.widget.ImageView;
import com.yandex.messaging.internal.gif.GifDrawable;
import defpackage.aht;
import defpackage.bvf0;
import defpackage.g3r;
import defpackage.l8x;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sls;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vgt;
import defpackage.wls;
import defpackage.xgt;
import defpackage.z83;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/Drawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/Drawable;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.extension.ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1", f = "ImagesExtensions.kt", l = {HProv.PP_INFO, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $badGifRatio;
    final /* synthetic */ Uri $loadedUri;
    final /* synthetic */ long $maxGifMemorySize;
    final /* synthetic */ sls $onBadGifAction;
    final /* synthetic */ l8x $stubImageJob;
    final /* synthetic */ ImageView $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1(Uri uri, sls slsVar, l8x l8xVar, ImageView imageView, long j, int i, Continuation continuation) {
        super(2, continuation);
        this.$loadedUri = uri;
        this.$onBadGifAction = slsVar;
        this.$stubImageJob = l8xVar;
        this.$target = imageView;
        this.$maxGifMemorySize = j;
        this.$badGifRatio = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1(this.$loadedUri, this.$onBadGifAction, this.$stubImageJob, this.$target, this.$maxGifMemorySize, this.$badGifRatio, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImagesExtensionsKt$loadIntoAnimated$5$loadedDrawable$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r0.d <= 8294400) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String path;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            Uri uri = this.$loadedUri;
            final sls slsVar = this.$onBadGifAction;
            if (uri == null || (path = uri.getPath()) == null) {
                return null;
            }
            File file = new File(path);
            if (!file.exists()) {
                return null;
            }
            vgt b = new xgt().b(ByteBuffer.wrap(g3r.c(file)));
            if (b.f * b.g > 16777216) {
                slsVar.invoke();
                return null;
            }
            try {
                return ImageDecoder.decodeDrawable(ImageDecoder.createSource(file), new ImageDecoder.OnHeaderDecodedListener() { // from class: vhv
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        imageDecoder.setTargetSize(Math.min(imageInfo.getSize().getWidth(), 4096), Math.min(imageInfo.getSize().getHeight(), 4096));
                        final sls slsVar2 = sls.this;
                        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: uhv
                            @Override // android.graphics.ImageDecoder.OnPartialImageListener
                            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                                sls.this.invoke();
                                return true;
                            }
                        });
                    }
                });
            } catch (ImageDecoder.DecodeException unused) {
                slsVar.invoke();
                return null;
            } catch (IOException unused2) {
                slsVar.invoke();
                return null;
            } catch (IllegalStateException unused3) {
                slsVar.invoke();
                return null;
            } catch (OutOfMemoryError unused4) {
                slsVar.invoke();
                return null;
            } catch (Throwable unused5) {
                slsVar.invoke();
                z83.i();
                return null;
            }
        }
        if (i == 1) {
            b.b(obj);
            qoh a = com.yandex.messaging.internal.gif.a.a(this.$target.getContext().getApplicationContext(), this.$loadedUri, bvf0.a(uyj.a), this.$maxGifMemorySize);
            this.label = 2;
            obj = a.s(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        aht ahtVar = (aht) obj;
        if (ahtVar == null) {
            return null;
        }
        com.yandex.messaging.internal.gif.b bVar = (com.yandex.messaging.internal.gif.b) ahtVar;
        int i2 = bVar.f.o;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    z83.i();
                }
            }
            ahtVar = null;
            if (ahtVar != null) {
                return null;
            }
            int i3 = this.$badGifRatio;
            sls slsVar2 = this.$onBadGifAction;
            boolean z = ((com.yandex.messaging.internal.gif.b) ahtVar).e > i3;
            if (z) {
                slsVar2.invoke();
            }
            aht ahtVar2 = !z ? ahtVar : null;
            if (ahtVar2 == null) {
                return null;
            }
            ImageView imageView = this.$target;
            return new GifDrawable(imageView.getContext(), ahtVar2, imageView.getDrawable(), imageView, null, null, 48, null);
        }
        if (bVar.c.c > 0) {
        }
        ahtVar = null;
        if (ahtVar != null) {
        }
    }
}
