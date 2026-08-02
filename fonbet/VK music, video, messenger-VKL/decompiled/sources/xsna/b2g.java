package xsna;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ExifInterface;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.b4p;
import xsna.p4p;
import xsna.w0g;

/* compiled from: CollageRendererGrid.kt */
/* loaded from: classes4.dex */
public final class b2g implements h5p<w1g> {
    public final e4p b;
    public final h9 c;
    public final com.vk.movika.sdk.base.presenter.b d;

    public b2g(e4p e4pVar, h9 h9Var, com.vk.movika.sdk.base.presenter.b bVar) {
        this.b = e4pVar;
        this.c = h9Var;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Integer num, w1g w1gVar, spj spjVar) {
        a2g a2gVar;
        int i;
        Ref$IntRef ref$IntRef;
        Ref$IntRef ref$IntRef2;
        Ref$IntRef ref$IntRef3;
        boolean z;
        int b;
        int i2;
        int i3;
        int i4;
        ld7 ld7Var;
        w1g w1gVar2 = w1gVar;
        if (spjVar instanceof a2g) {
            a2gVar = (a2g) spjVar;
            int i5 = a2gVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                a2gVar.label = i5 - Integer.MIN_VALUE;
                Object obj = a2gVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a2gVar.label;
                int i6 = 0;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ref$IntRef = new Ref$IntRef();
                    ref$IntRef2 = new Ref$IntRef();
                    CollageAspectRatioFormat collageAspectRatioFormat = w1gVar2.c;
                    if (collageAspectRatioFormat == CollageAspectRatioFormat.CollageOriginal) {
                        e4p e4pVar = this.b;
                        if (e4pVar instanceof g4p) {
                            g4p g4pVar = (g4p) e4pVar;
                            Boolean bool = g4pVar.d;
                            if (bool != null) {
                                z = bool.booleanValue();
                            } else {
                                try {
                                    int attributeInt = new ExifInterface(g4pVar.a).getAttributeInt("Orientation", 0);
                                    if (attributeInt != 6 && attributeInt != 8) {
                                        z = false;
                                        g4pVar.d = Boolean.valueOf(z);
                                    }
                                    z = true;
                                    g4pVar.d = Boolean.valueOf(z);
                                } catch (Throwable unused) {
                                    z = false;
                                }
                            }
                            if (z) {
                                ref$IntRef.element = g4pVar.getHeight();
                                ref$IntRef2.element = g4pVar.getWidth();
                            }
                        }
                        ref$IntRef.element = e4pVar.getWidth();
                        ref$IntRef2.element = e4pVar.getHeight();
                    } else if (collageAspectRatioFormat.i() > 1.0f) {
                        int i7 = Resources.getSystem().getDisplayMetrics().widthPixels;
                        ref$IntRef.element = i7;
                        ref$IntRef2.element = an10.b(i7 / collageAspectRatioFormat.i());
                    } else {
                        int i8 = Resources.getSystem().getDisplayMetrics().heightPixels;
                        ref$IntRef2.element = i8;
                        ref$IntRef.element = an10.b(collageAspectRatioFormat.i() * i8);
                    }
                    if (num != null && (ref$IntRef.element > num.intValue() || ref$IntRef2.element > num.intValue())) {
                        float f = ref$IntRef.element / ref$IntRef2.element;
                        if (f >= 1.0f) {
                            ref$IntRef.element = num.intValue();
                            ref$IntRef2.element = an10.b(num.intValue() / f);
                        } else {
                            ref$IntRef2.element = num.intValue();
                            ref$IntRef.element = an10.b(num.intValue() * f);
                        }
                    }
                    k3g k3gVar = ((r2g) this.c.c).v;
                    if (k3gVar != null) {
                        int i9 = ref$IntRef.element;
                        int i10 = ref$IntRef2.element;
                        a2gVar.L$0 = null;
                        a2gVar.L$1 = null;
                        a2gVar.L$2 = null;
                        a2gVar.L$3 = w1gVar2;
                        a2gVar.L$4 = ref$IntRef;
                        a2gVar.L$5 = ref$IntRef2;
                        a2gVar.L$6 = null;
                        a2gVar.I$0 = 0;
                        a2gVar.label = 1;
                        gzg0 gzg0Var = new gzg0(s7s0.c(a2gVar));
                        k3gVar.a(new z1g(i9, i10, gzg0Var));
                        Object a = gzg0Var.a();
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$IntRef3 = ref$IntRef;
                        obj = a;
                    }
                    Bitmap b2 = n3p.b(ref$IntRef.element, ref$IntRef2.element);
                    Canvas canvas = new Canvas(b2);
                    w0g w0gVar = w1gVar2.b;
                    g2g g2gVar = w1gVar2.g;
                    for (Map.Entry<n2k0, w0g.a> entry : w0gVar.a().entrySet()) {
                        n2k0 key = entry.getKey();
                        entry.getValue();
                        c2g c2gVar = g2gVar.a.get(key);
                        if (c2gVar == null) {
                            throw new IllegalStateException("Slot without config");
                        }
                        e4p e4pVar2 = c2gVar.i;
                        if (e4pVar2 == null) {
                            throw new IllegalStateException("Slot config without image");
                        }
                        o3p c = ((b4p) this.d.invoke()).c(e4pVar2, b4p.a.C2587a.e);
                        if (c == null) {
                            throw new IllegalStateException("Can't load slot image");
                        }
                        Bitmap bitmap = c.c.a;
                        if (bitmap == null) {
                            throw new IllegalStateException("Can't load slot bitmap");
                        }
                        float f2 = c2gVar.a;
                        float f3 = c2gVar.b;
                        Rect rect = new Rect(an10.b(f2 * canvas.getWidth()), an10.b(f3 * canvas.getHeight()), an10.b((c2gVar.c + f2) * canvas.getWidth()), an10.b((c2gVar.d + f3) * canvas.getHeight()));
                        Rect rect2 = new Rect(i6, i6, bitmap.getWidth(), bitmap.getHeight());
                        RectF rectF = new RectF(rect2);
                        fdi.J(rectF, new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width(), rect.height()));
                        Bitmap b3 = n3p.b(an10.b(rectF.width()), an10.b(rectF.height()));
                        Canvas canvas2 = new Canvas(b3);
                        RectF rectF2 = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rectF.width(), rectF.height());
                        canvas2.translate(c2gVar.e * canvas.getWidth(), c2gVar.f * canvas.getHeight());
                        float f4 = c2gVar.g;
                        canvas2.scale(f4, f4, rectF2.centerX(), rectF2.centerY());
                        canvas2.rotate(c2gVar.h, rectF2.centerX(), rectF2.centerY());
                        Rect rect3 = new Rect();
                        rectF2.roundOut(rect3);
                        canvas2.drawBitmap(bitmap, rect2, rect3, (Paint) null);
                        float width = rect.width() / rect.height();
                        if (width >= rectF.width() / rectF.height()) {
                            i3 = an10.b(rectF.width());
                            float width2 = rectF.width() / width;
                            int b4 = an10.b((rectF.height() - width2) / 2.0f);
                            i2 = an10.b(b4 + width2);
                            i4 = b4;
                            b = 0;
                        } else {
                            int b5 = an10.b(rectF.height());
                            float height = rectF.height() * width;
                            b = an10.b((rectF.width() - height) / 2.0f);
                            int b6 = an10.b(b + height);
                            i2 = b5;
                            i3 = b6;
                            i4 = 0;
                        }
                        canvas.drawBitmap(b3, new Rect(b, i4, i3, i2), rect, (Paint) null);
                        i6 = 0;
                    }
                    return new ld7(b2);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ref$IntRef ref$IntRef4 = (Ref$IntRef) a2gVar.L$5;
                ref$IntRef3 = (Ref$IntRef) a2gVar.L$4;
                w1g w1gVar3 = (w1g) a2gVar.L$3;
                kotlin.a.a(obj);
                ref$IntRef2 = ref$IntRef4;
                w1gVar2 = w1gVar3;
                ld7Var = (ld7) obj;
                if (ld7Var == null) {
                    return ld7Var;
                }
                ref$IntRef = ref$IntRef3;
                Bitmap b22 = n3p.b(ref$IntRef.element, ref$IntRef2.element);
                Canvas canvas3 = new Canvas(b22);
                w0g w0gVar2 = w1gVar2.b;
                g2g g2gVar2 = w1gVar2.g;
                while (r4.hasNext()) {
                }
                return new ld7(b22);
            }
        }
        a2gVar = new a2g(this, (ContinuationImpl) spjVar);
        Object obj2 = a2gVar.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a2gVar.label;
        int i62 = 0;
        if (i != 0) {
        }
        ld7Var = (ld7) obj2;
        if (ld7Var == null) {
        }
    }

    @Override // xsna.h5p
    public final /* bridge */ /* synthetic */ Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        return a(num, (w1g) g5pVar, bVar);
    }
}
