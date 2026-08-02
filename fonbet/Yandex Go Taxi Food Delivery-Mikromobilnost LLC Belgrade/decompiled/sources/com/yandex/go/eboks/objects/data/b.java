package com.yandex.go.eboks.objects.data;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import com.yandex.runtime.image.ImageProvider;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.zhn;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes12.dex */
public final class b {
    public final e a;
    public final pwy0 b;
    public final zhn c;
    public final kotlinx.coroutines.sync.a d = gtq0.a();
    public final LruCache e = new LruCache(20);
    public final LruCache f = new LruCache(24);
    public ThemeType g;

    public b(e eVar, pwy0 pwy0Var, zhn zhnVar) {
        this.a = eVar;
        this.b = pwy0Var;
        this.c = zhnVar;
        this.g = pwy0Var.getThemeType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0072, code lost:
    
        if (r10.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[Catch: all -> 0x0087, TRY_ENTER, TryCatch #0 {all -> 0x0087, blocks: (B:33:0x0075, B:36:0x0081, B:37:0x008a, B:39:0x00a3), top: B:32:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:33:0x0075, B:36:0x0081, B:37:0x008a, B:39:0x00a3), top: B:32:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v13, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        EboksObjectsImageProvidersRepository$getImageProviderByImageTag$1 eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ?? r1;
        ThemeType themeType;
        ThemeType themeType2;
        ImageProvider imageProvider;
        LruCache lruCache;
        String str2;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        try {
            if (continuationImpl instanceof EboksObjectsImageProvidersRepository$getImageProviderByImageTag$1) {
                eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1 = (EboksObjectsImageProvidersRepository$getImageProviderByImageTag$1) continuationImpl;
                int i2 = eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$0 = str;
                        aVar = this.d;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$1 = aVar;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            str2 = (String) eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$6;
                            lruCache = (LruCache) eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$5;
                            r1 = (g050) eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                r1 = r1;
                                bitmapDrawable = (BitmapDrawable) obj;
                                if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                                    imageProvider = ImageProvider.fromBitmap(bitmap, true, str2);
                                    lruCache.put(str2, imageProvider);
                                    aVar = r1;
                                    aVar.d(null);
                                    return imageProvider;
                                }
                                r1.d(null);
                                return null;
                            } catch (Throwable th) {
                                th = th;
                                r1.d(null);
                                throw th;
                            }
                        }
                        ?? r9 = (g050) eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$1;
                        String str3 = (String) eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r9;
                        str = str3;
                    }
                    themeType = this.b.getThemeType();
                    themeType2 = this.g;
                    LruCache lruCache2 = this.e;
                    if (themeType2 != themeType) {
                        lruCache2.evictAll();
                        this.g = themeType;
                    }
                    String str4 = str + this.g;
                    imageProvider = (ImageProvider) lruCache2.get(str4);
                    if (imageProvider == null) {
                        e eVar = this.a;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$0 = null;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$1 = aVar;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$2 = null;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$3 = null;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$4 = null;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$5 = lruCache2;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$6 = str4;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.L$7 = null;
                        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label = 2;
                        Object f = e.f(eVar, str, null, eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1, 6);
                        if (f != coroutineSingletons) {
                            r1 = aVar;
                            lruCache = lruCache2;
                            obj = f;
                            str2 = str4;
                            bitmapDrawable = (BitmapDrawable) obj;
                            if (bitmapDrawable != null) {
                                imageProvider = ImageProvider.fromBitmap(bitmap, true, str2);
                                lruCache.put(str2, imageProvider);
                                aVar = r1;
                            }
                            r1.d(null);
                            return null;
                        }
                        return coroutineSingletons;
                    }
                    aVar.d(null);
                    return imageProvider;
                }
            }
            themeType = this.b.getThemeType();
            themeType2 = this.g;
            LruCache lruCache22 = this.e;
            if (themeType2 != themeType) {
            }
            String str42 = str + this.g;
            imageProvider = (ImageProvider) lruCache22.get(str42);
            if (imageProvider == null) {
            }
            aVar.d(null);
            return imageProvider;
        } catch (Throwable th2) {
            th = th2;
            r1 = aVar;
            r1.d(null);
            throw th;
        }
        eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1 = new EboksObjectsImageProvidersRepository$getImageProviderByImageTag$1(this, continuationImpl);
        Object obj2 = eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsImageProvidersRepository$getImageProviderByImageTag$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x0052, B:14:0x005e, B:15:0x0066, B:17:0x0082), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:11:0x0052, B:14:0x005e, B:15:0x0066, B:17:0x0082), top: B:10:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, CharSequence charSequence, ContinuationImpl continuationImpl) {
        EboksObjectsImageProvidersRepository$getOverlayImageProvider$1 eboksObjectsImageProvidersRepository$getOverlayImageProvider$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ThemeType themeType;
        ThemeType themeType2;
        ImageProvider imageProvider;
        try {
            if (continuationImpl instanceof EboksObjectsImageProvidersRepository$getOverlayImageProvider$1) {
                eboksObjectsImageProvidersRepository$getOverlayImageProvider$1 = (EboksObjectsImageProvidersRepository$getOverlayImageProvider$1) continuationImpl;
                int i2 = eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$0 = str;
                        eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$1 = charSequence;
                        aVar = this.d;
                        eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$2 = aVar;
                        eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.label = 1;
                        if (aVar.a(eboksObjectsImageProvidersRepository$getOverlayImageProvider$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$2;
                        charSequence = (CharSequence) eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$1;
                        String str2 = (String) eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        str = str2;
                    }
                    themeType = this.b.getThemeType();
                    themeType2 = this.g;
                    LruCache lruCache = this.f;
                    if (themeType2 != themeType) {
                        lruCache.evictAll();
                        this.g = themeType;
                    }
                    String str3 = "overlay_" + ((Object) charSequence) + str + this.g;
                    imageProvider = (ImageProvider) lruCache.get(str3);
                    if (imageProvider == null) {
                        imageProvider = ImageProvider.fromBitmap(this.c.a(charSequence, str), true, str3);
                        lruCache.put(str3, imageProvider);
                    }
                    aVar.d(null);
                    return imageProvider;
                }
            }
            themeType = this.b.getThemeType();
            themeType2 = this.g;
            LruCache lruCache2 = this.f;
            if (themeType2 != themeType) {
            }
            String str32 = "overlay_" + ((Object) charSequence) + str + this.g;
            imageProvider = (ImageProvider) lruCache2.get(str32);
            if (imageProvider == null) {
            }
            aVar.d(null);
            return imageProvider;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        eboksObjectsImageProvidersRepository$getOverlayImageProvider$1 = new EboksObjectsImageProvidersRepository$getOverlayImageProvider$1(this, continuationImpl);
        Object obj2 = eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsImageProvidersRepository$getOverlayImageProvider$1.label;
        if (i != 0) {
        }
    }
}
