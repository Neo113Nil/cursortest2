package com.yandex.go.image.internal.coil.decoder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import coil3.c;
import com.yandex.go.image.internal.coil.model.TagBitmapDecodeType;
import defpackage.bb1;
import defpackage.clx;
import defpackage.ebv;
import defpackage.fyg;
import defpackage.g5p;
import defpackage.i3y;
import defpackage.iev;
import defpackage.iyg;
import defpackage.jl40;
import defpackage.kev;
import defpackage.lev;
import defpackage.lg70;
import defpackage.ny61;
import defpackage.q7v;
import defpackage.s8o;
import defpackage.sac;
import defpackage.sb2;
import defpackage.uh;
import defpackage.w06;
import defpackage.wxg;
import defpackage.xis0;
import defpackage.zct0;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements iyg {
    public final zct0 a;
    public final lg70 b;
    public final c c;
    public final i3y d;

    public a(zct0 zct0Var, lg70 lg70Var, c cVar, i3y i3yVar) {
        this.a = zct0Var;
        this.b = lg70Var;
        this.c = cVar;
        this.d = i3yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x005f  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // defpackage.iyg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        BitmapWithMetaImageDecoder$decode$1 bitmapWithMetaImageDecoder$decode$1;
        int i;
        ebv ebvVar;
        boolean z;
        ebv ebvVar2;
        int intValue;
        int i2;
        ebv ebvVar3;
        int i3;
        int i4;
        int i5;
        ebv ebvVar4;
        boolean z2;
        q7v q7vVar;
        w06 w06Var;
        Bitmap createBitmap;
        if (continuationImpl instanceof BitmapWithMetaImageDecoder$decode$1) {
            bitmapWithMetaImageDecoder$decode$1 = (BitmapWithMetaImageDecoder$decode$1) continuationImpl;
            int i6 = bitmapWithMetaImageDecoder$decode$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bitmapWithMetaImageDecoder$decode$1.label = i6 - Integer.MIN_VALUE;
                Object obj = bitmapWithMetaImageDecoder$decode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitmapWithMetaImageDecoder$decode$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean isEmpty = ((List) s8o.p(this.b, kev.a)).isEmpty();
                    bitmapWithMetaImageDecoder$decode$1.Z$0 = isEmpty;
                    bitmapWithMetaImageDecoder$decode$1.label = 1;
                    iev ievVar = (iev) bitmapWithMetaImageDecoder$decode$1.get_context().get(iev.b);
                    if (ievVar == null || (ebvVar = ievVar.a) == null) {
                        ebvVar = null;
                    } else if (isEmpty) {
                        ievVar.a = null;
                    }
                    if (ebvVar != coroutineSingletons) {
                        z = isEmpty;
                        obj = ebvVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        z2 = bitmapWithMetaImageDecoder$decode$1.Z$0;
                        ebvVar4 = (ebv) bitmapWithMetaImageDecoder$decode$1.L$0;
                        b.b(obj);
                        wxg wxgVar = (wxg) obj;
                        q7v q7vVar2 = wxgVar.a;
                        return (z2 || !(q7vVar2 instanceof w06)) ? wxgVar : new wxg(new sac((w06) q7vVar2, ebvVar4), wxgVar.b);
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = bitmapWithMetaImageDecoder$decode$1.I$5;
                    i4 = bitmapWithMetaImageDecoder$decode$1.I$4;
                    i3 = bitmapWithMetaImageDecoder$decode$1.I$3;
                    i2 = bitmapWithMetaImageDecoder$decode$1.I$2;
                    intValue = bitmapWithMetaImageDecoder$decode$1.I$1;
                    z = bitmapWithMetaImageDecoder$decode$1.Z$0;
                    ebvVar3 = (ebv) bitmapWithMetaImageDecoder$decode$1.L$0;
                    b.b(obj);
                    wxg wxgVar2 = (wxg) obj;
                    q7vVar = wxgVar2.a;
                    if (q7vVar instanceof w06) {
                        return wxgVar2;
                    }
                    if (i5 != 0) {
                        w06 w06Var2 = (w06) q7vVar;
                        lg70 lg70Var = this.b;
                        boolean z3 = i2 != 0;
                        boolean z4 = i3 != 0;
                        boolean z5 = i4 != 0;
                        Bitmap bitmap = w06Var2.a;
                        Bitmap.Config e = bb1.e(bitmap);
                        Matrix matrix = new Matrix();
                        int i7 = ebvVar3.c;
                        if (z3) {
                            float f = intValue / i7;
                            matrix.setTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            matrix.postScale(f, f);
                            createBitmap = Bitmap.createBitmap((int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f), e);
                        } else {
                            matrix.setTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), e);
                        }
                        Paint paint = new Paint(7);
                        if (z4) {
                            paint.setColorFilter(new PorterDuffColorFilter(((Number) s8o.p(lg70Var, clx.b)).intValue(), PorterDuff.Mode.SRC_ATOP));
                        }
                        if (z5) {
                            matrix.postScale(-1.0f, 1.0f);
                        }
                        matrix.postTranslate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawBitmap(bitmap, matrix, paint);
                        canvas.setBitmap(null);
                        bitmap.recycle();
                        w06Var = new w06(createBitmap);
                    } else {
                        w06Var = (w06) q7vVar;
                    }
                    return z ? new wxg(new sac(w06Var, ebvVar3), wxgVar2.b) : new wxg(w06Var, wxgVar2.b);
                }
                boolean z6 = bitmapWithMetaImageDecoder$decode$1.Z$0;
                b.b(obj);
                z = z6;
                ebvVar2 = (ebv) obj;
                if (ebvVar2 != null) {
                    return null;
                }
                TagBitmapDecodeType tagBitmapDecodeType = (TagBitmapDecodeType) s8o.p(this.b, clx.a);
                if (tagBitmapDecodeType == TagBitmapDecodeType.NotApplicable) {
                    bitmapWithMetaImageDecoder$decode$1.L$0 = ebvVar2;
                    bitmapWithMetaImageDecoder$decode$1.L$1 = null;
                    bitmapWithMetaImageDecoder$decode$1.Z$0 = z;
                    bitmapWithMetaImageDecoder$decode$1.label = 2;
                    Object b = b(false, bitmapWithMetaImageDecoder$decode$1);
                    if (b != coroutineSingletons) {
                        ebvVar4 = ebvVar2;
                        obj = b;
                        z2 = z;
                        wxg wxgVar3 = (wxg) obj;
                        q7v q7vVar22 = wxgVar3.a;
                        if (z2) {
                        }
                    }
                } else {
                    int i8 = tagBitmapDecodeType == TagBitmapDecodeType.Compose ? 1 : 0;
                    intValue = ((Number) s8o.p(this.b, clx.c)).intValue();
                    int i9 = ebvVar2.c;
                    i2 = (i9 == 0 || i9 == intValue || !jl40.l(this.b.b, xis0.c)) ? 0 : 1;
                    int i10 = (ebvVar2.a && i8 == 0) ? 1 : 0;
                    int i11 = (ebvVar2.b && i8 == 0 && this.b.a.getResources().getConfiguration().getLayoutDirection() == 1) ? 1 : 0;
                    ?? r12 = (i2 == 0 && i10 == 0 && i11 == 0) ? 0 : 1;
                    bitmapWithMetaImageDecoder$decode$1.L$0 = ebvVar2;
                    bitmapWithMetaImageDecoder$decode$1.L$1 = null;
                    bitmapWithMetaImageDecoder$decode$1.Z$0 = z;
                    bitmapWithMetaImageDecoder$decode$1.I$0 = i8;
                    bitmapWithMetaImageDecoder$decode$1.I$1 = intValue;
                    bitmapWithMetaImageDecoder$decode$1.I$2 = i2;
                    bitmapWithMetaImageDecoder$decode$1.I$3 = i10;
                    bitmapWithMetaImageDecoder$decode$1.I$4 = i11;
                    bitmapWithMetaImageDecoder$decode$1.I$5 = r12;
                    bitmapWithMetaImageDecoder$decode$1.label = 3;
                    Object b2 = b(r12, bitmapWithMetaImageDecoder$decode$1);
                    if (b2 != coroutineSingletons) {
                        ebvVar3 = ebvVar2;
                        obj = b2;
                        i3 = i10;
                        i4 = i11;
                        i5 = r12;
                        wxg wxgVar22 = (wxg) obj;
                        q7vVar = wxgVar22.a;
                        if (q7vVar instanceof w06) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        bitmapWithMetaImageDecoder$decode$1 = new BitmapWithMetaImageDecoder$decode$1(this, continuationImpl);
        Object obj2 = bitmapWithMetaImageDecoder$decode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitmapWithMetaImageDecoder$decode$1.label;
        if (i != 0) {
        }
        ebvVar2 = (ebv) obj2;
        if (ebvVar2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00cc -> B:10:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(boolean z, ContinuationImpl continuationImpl) {
        BitmapWithMetaImageDecoder$obtainRawImage$1 bitmapWithMetaImageDecoder$obtainRawImage$1;
        int i;
        Iterator it;
        lg70 lg70Var;
        boolean z2;
        if (continuationImpl instanceof BitmapWithMetaImageDecoder$obtainRawImage$1) {
            bitmapWithMetaImageDecoder$obtainRawImage$1 = (BitmapWithMetaImageDecoder$obtainRawImage$1) continuationImpl;
            int i2 = bitmapWithMetaImageDecoder$obtainRawImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bitmapWithMetaImageDecoder$obtainRawImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bitmapWithMetaImageDecoder$obtainRawImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitmapWithMetaImageDecoder$obtainRawImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    uh uhVar = lev.a;
                    lg70 lg70Var2 = this.b;
                    Bitmap.Config config = (Bitmap.Config) s8o.p(lg70Var2, uhVar);
                    if (z && sb2.x(config)) {
                        g5p g5pVar = new g5p(lg70Var2.i);
                        g5pVar.b(uhVar, Bitmap.Config.ARGB_8888);
                        lg70Var2 = new lg70(lg70Var2.a, lg70Var2.b, lg70Var2.c, lg70Var2.d, lg70Var2.e, lg70Var2.f, lg70Var2.g, lg70Var2.h, g5pVar.a());
                    }
                    it = ((Iterable) this.d.getValue()).iterator();
                    lg70Var = lg70Var2;
                    z2 = z;
                    while (it.hasNext()) {
                    }
                    ny61.r("Fail to decode image with original decoders");
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z3 = bitmapWithMetaImageDecoder$obtainRawImage$1.Z$0;
                it = (Iterator) bitmapWithMetaImageDecoder$obtainRawImage$1.L$3;
                lg70Var = (lg70) bitmapWithMetaImageDecoder$obtainRawImage$1.L$1;
                b.b(obj);
                wxg wxgVar = (wxg) obj;
                if (wxgVar != null) {
                    z2 = z3;
                    while (it.hasNext()) {
                        iyg a = ((fyg) it.next()).a(this.a, lg70Var, this.c);
                        if (a != null) {
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$0 = null;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$1 = lg70Var;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$2 = null;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$3 = it;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$4 = null;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$5 = null;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.L$6 = null;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.Z$0 = z2;
                            bitmapWithMetaImageDecoder$obtainRawImage$1.label = 1;
                            Object a2 = a.a(bitmapWithMetaImageDecoder$obtainRawImage$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            z3 = z2;
                            obj = a2;
                            wxg wxgVar2 = (wxg) obj;
                            if (wxgVar2 != null) {
                                return wxgVar2;
                            }
                        }
                    }
                    ny61.r("Fail to decode image with original decoders");
                    return null;
                }
            }
        }
        bitmapWithMetaImageDecoder$obtainRawImage$1 = new BitmapWithMetaImageDecoder$obtainRawImage$1(this, continuationImpl);
        Object obj2 = bitmapWithMetaImageDecoder$obtainRawImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitmapWithMetaImageDecoder$obtainRawImage$1.label;
        if (i != 0) {
        }
    }
}
