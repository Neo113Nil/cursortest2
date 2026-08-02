package com.ybsdk.feature.kyc.internal.interactor;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.c03;
import defpackage.fse;
import defpackage.if8;
import defpackage.lnx;
import defpackage.nbp0;
import defpackage.ny61;
import defpackage.opx;
import defpackage.pnx;
import defpackage.tje;
import defpackage.tnx;
import defpackage.u6z;
import defpackage.y6i0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final nbp0 a;
    public final com.ybsdk.feature.kyc.internal.data.a b;
    public final lnx c;
    public final opx d;
    public final AppAnalyticsReporter e;

    public a(nbp0 nbp0Var, com.ybsdk.feature.kyc.internal.data.a aVar, lnx lnxVar, opx opxVar, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = nbp0Var;
        this.b = aVar;
        this.c = lnxVar;
        this.d = opxVar;
        this.e = appAnalyticsReporter;
    }

    public static final Serializable a(a aVar, File file, File file2) {
        aVar.getClass();
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options b = aVar.b(file);
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, b);
            Bitmap f = aVar.f(decodeFile, file, b);
            if (file2 != null) {
                file = file2;
            }
            decodeFile.recycle();
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                f.compress(Bitmap.CompressFormat.JPEG, y6i0.d(((if8) aVar.d).a.e().getPhotoTargetCompressionQuality(), 0, 100), bufferedOutputStream);
                f.recycle();
                bufferedOutputStream.close();
                return new File(file.getAbsolutePath());
            } finally {
            }
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    public static Pair e(File file, BitmapFactory.Options options) {
        int n = new androidx.exifinterface.media.a(file).n();
        return (n == 90 || n == 270) ? new Pair(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth)) : new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public final BitmapFactory.Options b(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Pair e = e(file, options);
        int intValue = ((Number) e.getFirst()).intValue();
        int intValue2 = ((Number) e.getSecond()).intValue();
        options.inJustDecodeBounds = false;
        opx opxVar = this.d;
        if8 if8Var = (if8) opxVar;
        int photoTargetWidth = if8Var.a.e().getPhotoTargetWidth() > 0 ? if8Var.a.e().getPhotoTargetWidth() : options.outWidth;
        if8 if8Var2 = (if8) opxVar;
        int photoTargetHeight = if8Var2.a.e().getPhotoTargetHeight() > 0 ? if8Var2.a.e().getPhotoTargetHeight() : options.outHeight;
        if (intValue2 > photoTargetHeight || intValue > photoTargetWidth) {
            int i2 = intValue2 / 2;
            int i3 = intValue / 2;
            while (i2 / i >= photoTargetHeight && i3 / i >= photoTargetWidth) {
                i *= 2;
            }
        }
        options.inSampleSize = i;
        return options;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        KycInteractor$documentsInitWithContent$1 kycInteractor$documentsInitWithContent$1;
        int i;
        if (continuationImpl instanceof KycInteractor$documentsInitWithContent$1) {
            kycInteractor$documentsInitWithContent$1 = (KycInteractor$documentsInitWithContent$1) continuationImpl;
            int i2 = kycInteractor$documentsInitWithContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$documentsInitWithContent$1.label = i2 - Integer.MIN_VALUE;
                KycInteractor$documentsInitWithContent$1 kycInteractor$documentsInitWithContent$12 = kycInteractor$documentsInitWithContent$1;
                Object obj = kycInteractor$documentsInitWithContent$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$documentsInitWithContent$12.label;
                if (i != 0) {
                    b.b(obj);
                    kycInteractor$documentsInitWithContent$12.label = 1;
                    Object c = this.b.c(str, str2, str3, str4, kycInteractor$documentsInitWithContent$12);
                    return c == coroutineSingletons ? coroutineSingletons : c;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kycInteractor$documentsInitWithContent$1 = new KycInteractor$documentsInitWithContent$1(this, continuationImpl);
        KycInteractor$documentsInitWithContent$1 kycInteractor$documentsInitWithContent$122 = kycInteractor$documentsInitWithContent$1;
        Object obj2 = kycInteractor$documentsInitWithContent$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$documentsInitWithContent$122.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        KycInteractor$getApplicationInfo$1 kycInteractor$getApplicationInfo$1;
        int i;
        if (continuationImpl instanceof KycInteractor$getApplicationInfo$1) {
            kycInteractor$getApplicationInfo$1 = (KycInteractor$getApplicationInfo$1) continuationImpl;
            int i2 = kycInteractor$getApplicationInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$getApplicationInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycInteractor$getApplicationInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$getApplicationInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    kycInteractor$getApplicationInfo$1.label = 1;
                    Object d = this.b.d(str, str2, kycInteractor$getApplicationInfo$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kycInteractor$getApplicationInfo$1 = new KycInteractor$getApplicationInfo$1(this, continuationImpl);
        Object obj2 = kycInteractor$getApplicationInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$getApplicationInfo$1.label;
        if (i != 0) {
        }
    }

    public final Bitmap f(Bitmap bitmap, File file, BitmapFactory.Options options) {
        Pair e = e(file, options);
        int intValue = ((Number) e.getFirst()).intValue();
        int intValue2 = ((Number) e.getSecond()).intValue();
        Matrix matrix = new Matrix();
        matrix.postRotate(new androidx.exifinterface.media.a(file).n());
        opx opxVar = this.d;
        matrix.postScale((((if8) opxVar).a.e().getPhotoTargetWidth() > 0 ? r11.a.e().getPhotoTargetWidth() : options.outWidth) / intValue, (((if8) opxVar).a.e().getPhotoTargetHeight() > 0 ? r9.a.e().getPhotoTargetHeight() : options.outHeight) / intValue2);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, u6z u6zVar, String str2, ContinuationImpl continuationImpl) {
        KycInteractor$submitPhotos$1 kycInteractor$submitPhotos$1;
        int i;
        if (continuationImpl instanceof KycInteractor$submitPhotos$1) {
            kycInteractor$submitPhotos$1 = (KycInteractor$submitPhotos$1) continuationImpl;
            int i2 = kycInteractor$submitPhotos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$submitPhotos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycInteractor$submitPhotos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$submitPhotos$1.label;
                if (i != 0) {
                    b.b(obj);
                    kycInteractor$submitPhotos$1.label = 1;
                    Object f = this.b.f(str, u6zVar, str2, kycInteractor$submitPhotos$1);
                    return f == coroutineSingletons ? coroutineSingletons : f;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kycInteractor$submitPhotos$1 = new KycInteractor$submitPhotos$1(this, continuationImpl);
        Object obj2 = kycInteractor$submitPhotos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$submitPhotos$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(List list, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycInteractor$submitPhotosV2$1 kycInteractor$submitPhotosV2$1;
        int i;
        if (continuationImpl instanceof KycInteractor$submitPhotosV2$1) {
            kycInteractor$submitPhotosV2$1 = (KycInteractor$submitPhotosV2$1) continuationImpl;
            int i2 = kycInteractor$submitPhotosV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$submitPhotosV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kycInteractor$submitPhotosV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$submitPhotosV2$1.label;
                if (i != 0) {
                    b.b(obj);
                    kycInteractor$submitPhotosV2$1.label = 1;
                    Object g = this.b.g(list, c03Var, str, kycInteractor$submitPhotosV2$1);
                    return g == coroutineSingletons ? coroutineSingletons : g;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        kycInteractor$submitPhotosV2$1 = new KycInteractor$submitPhotosV2$1(this, continuationImpl);
        Object obj2 = kycInteractor$submitPhotosV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$submitPhotosV2$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(tnx tnxVar, File file, File file2, String str, String str2, ContinuationImpl continuationImpl) {
        KycInteractor$uploadPhoto$1 kycInteractor$uploadPhoto$1;
        int i;
        if (continuationImpl instanceof KycInteractor$uploadPhoto$1) {
            kycInteractor$uploadPhoto$1 = (KycInteractor$uploadPhoto$1) continuationImpl;
            int i2 = kycInteractor$uploadPhoto$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$uploadPhoto$1.label = i2 - Integer.MIN_VALUE;
                KycInteractor$uploadPhoto$1 kycInteractor$uploadPhoto$12 = kycInteractor$uploadPhoto$1;
                Object obj = kycInteractor$uploadPhoto$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$uploadPhoto$12.label;
                if (i != 0) {
                    b.b(obj);
                    fse fseVar = this.a.b.a;
                    KycInteractor$uploadPhoto$2 kycInteractor$uploadPhoto$2 = new KycInteractor$uploadPhoto$2(this, file, file2, tnxVar, str, str2, null);
                    kycInteractor$uploadPhoto$12.label = 1;
                    obj = tje.k0(fseVar, kycInteractor$uploadPhoto$2, kycInteractor$uploadPhoto$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        kycInteractor$uploadPhoto$1 = new KycInteractor$uploadPhoto$1(this, continuationImpl);
        KycInteractor$uploadPhoto$1 kycInteractor$uploadPhoto$122 = kycInteractor$uploadPhoto$1;
        Object obj2 = kycInteractor$uploadPhoto$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$uploadPhoto$122.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(tnx tnxVar, File file, File file2, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycInteractor$uploadPhotoV2$1 kycInteractor$uploadPhotoV2$1;
        int i;
        if (continuationImpl instanceof KycInteractor$uploadPhotoV2$1) {
            kycInteractor$uploadPhotoV2$1 = (KycInteractor$uploadPhotoV2$1) continuationImpl;
            int i2 = kycInteractor$uploadPhotoV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$uploadPhotoV2$1.label = i2 - Integer.MIN_VALUE;
                KycInteractor$uploadPhotoV2$1 kycInteractor$uploadPhotoV2$12 = kycInteractor$uploadPhotoV2$1;
                Object obj = kycInteractor$uploadPhotoV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$uploadPhotoV2$12.label;
                if (i != 0) {
                    b.b(obj);
                    fse fseVar = this.a.b.a;
                    KycInteractor$uploadPhotoV2$2 kycInteractor$uploadPhotoV2$2 = new KycInteractor$uploadPhotoV2$2(this, file, file2, tnxVar, c03Var, str, null);
                    kycInteractor$uploadPhotoV2$12.label = 1;
                    obj = tje.k0(fseVar, kycInteractor$uploadPhotoV2$2, kycInteractor$uploadPhotoV2$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        kycInteractor$uploadPhotoV2$1 = new KycInteractor$uploadPhotoV2$1(this, continuationImpl);
        KycInteractor$uploadPhotoV2$1 kycInteractor$uploadPhotoV2$122 = kycInteractor$uploadPhotoV2$1;
        Object obj2 = kycInteractor$uploadPhotoV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$uploadPhotoV2$122.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(pnx pnxVar, File file, File file2, c03 c03Var, String str, ContinuationImpl continuationImpl) {
        KycInteractor$uploadPhotoV3$1 kycInteractor$uploadPhotoV3$1;
        int i;
        if (continuationImpl instanceof KycInteractor$uploadPhotoV3$1) {
            kycInteractor$uploadPhotoV3$1 = (KycInteractor$uploadPhotoV3$1) continuationImpl;
            int i2 = kycInteractor$uploadPhotoV3$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kycInteractor$uploadPhotoV3$1.label = i2 - Integer.MIN_VALUE;
                KycInteractor$uploadPhotoV3$1 kycInteractor$uploadPhotoV3$12 = kycInteractor$uploadPhotoV3$1;
                Object obj = kycInteractor$uploadPhotoV3$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kycInteractor$uploadPhotoV3$12.label;
                if (i != 0) {
                    b.b(obj);
                    fse fseVar = this.a.b.a;
                    KycInteractor$uploadPhotoV3$2 kycInteractor$uploadPhotoV3$2 = new KycInteractor$uploadPhotoV3$2(this, file, file2, pnxVar, c03Var, str, null);
                    kycInteractor$uploadPhotoV3$12.label = 1;
                    obj = tje.k0(fseVar, kycInteractor$uploadPhotoV3$2, kycInteractor$uploadPhotoV3$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        kycInteractor$uploadPhotoV3$1 = new KycInteractor$uploadPhotoV3$1(this, continuationImpl);
        KycInteractor$uploadPhotoV3$1 kycInteractor$uploadPhotoV3$122 = kycInteractor$uploadPhotoV3$1;
        Object obj2 = kycInteractor$uploadPhotoV3$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kycInteractor$uploadPhotoV3$122.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
