package androidx.compose.foundation.gestures;

import android.view.ViewConfiguration;
import defpackage.clp0;
import defpackage.fwi;
import defpackage.gb30;
import defpackage.hb30;
import defpackage.iob1;
import defpackage.k631;
import defpackage.kjj;
import defpackage.ma91;
import defpackage.ni9;
import defpackage.ny61;
import defpackage.oi9;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.rrq0;
import defpackage.ryh;
import defpackage.sb2;
import defpackage.tvd0;
import defpackage.uh6;
import defpackage.vrq0;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class q extends r {
    public final ryh f;
    public final kotlinx.coroutines.channels.a g;
    public pzt0 h;

    public q(y yVar, ryh ryhVar, wls wlsVar, fwi fwiVar) {
        super(yVar, wlsVar, fwiVar);
        this.f = ryhVar;
        this.g = sb2.a(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015b A[PHI: r16
      0x015b: PHI (r16v1 zy11) = (r16v0 zy11), (r16v2 zy11) binds: [B:35:0x00c9, B:28:0x0158] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, hb30] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, kj2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(q qVar, y yVar, hb30 hb30Var, float f, float f2, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        int i;
        zy11 zy11Var;
        Ref$FloatRef ref$FloatRef;
        float f3;
        y yVar2;
        long a;
        qVar.getClass();
        kjj kjjVar = qVar.e;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$1) continuationImpl;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$1.label = i2 - Integer.MIN_VALUE;
                MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$12 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label;
                zy11 zy11Var2 = zy11.a;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    z.element = hb30Var;
                    long j = hb30Var.b;
                    zy11Var = zy11Var2;
                    long j2 = hb30Var.a;
                    kjjVar.a.a(Float.intBitsToFloat((int) (j2 >> 32)), j);
                    kjjVar.b.a(Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j);
                    hb30 g = g(qVar.g);
                    if (g != null) {
                        long j3 = g.b;
                        long j4 = g.a;
                        kjjVar.a.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                        kjjVar.b.a(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                        z.element = ((hb30) z.element).a(g);
                    }
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    float g2 = yVar.g(yVar.e(((hb30) z.element).a));
                    ref$FloatRef2.element = g2;
                    if (!iob1.a(g2)) {
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        ref$ObjectRef.element = uh6.a(0.0f, 0.0f, 30);
                        wls mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(ref$FloatRef2, ref$ObjectRef, z, f, qVar, f2, yVar, null);
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = yVar;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = ref$FloatRef2;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0 = f2;
                        mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 1;
                        if (qVar.b(mouseWheelScrollingLogic$dispatchMouseWheelScroll$3, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != obj2) {
                            ref$FloatRef = ref$FloatRef2;
                            f3 = f2;
                            yVar2 = yVar;
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var2;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.F$0;
                ref$FloatRef = (Ref$FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1;
                yVar2 = (y) mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0;
                kotlin.b.b(obj);
                zy11Var = zy11Var2;
                a = ma91.a(kjjVar.a.b(Float.MAX_VALUE), kjjVar.b.b(Float.MAX_VALUE));
                if (a == 0) {
                    float d = yVar2.d(Math.signum(ref$FloatRef.element)) * Math.min(Math.abs(ref$FloatRef.element) / 100.0f, f3) * 1000.0f;
                    if (d == 0.0f) {
                        a = 0;
                    } else {
                        a = yVar2.d == Orientation.Horizontal ? ma91.a(d, 0.0f) : ma91.a(0.0f, d);
                    }
                }
                wls wlsVar = qVar.b;
                k631 k631Var = new k631(a);
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$0 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.L$1 = null;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$12.label = 2;
                return wlsVar.invoke(k631Var, mouseWheelScrollingLogic$dispatchMouseWheelScroll$12) != obj2 ? obj2 : zy11Var;
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(qVar, continuationImpl);
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$122 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$1;
        Object obj3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label;
        zy11 zy11Var22 = zy11.a;
        if (i != 0) {
        }
        a = ma91.a(kjjVar.a.b(Float.MAX_VALUE), kjjVar.b.b(Float.MAX_VALUE));
        if (a == 0) {
        }
        wls wlsVar2 = qVar.b;
        k631 k631Var2 = new k631(a);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$0 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.L$1 = null;
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$122.label = 2;
        if (wlsVar2.invoke(k631Var2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$122) != obj22) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, kj2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, hb30] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(q qVar, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, y yVar, Ref$ObjectRef ref$ObjectRef2, long j, ContinuationImpl continuationImpl) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1;
        int i;
        y yVar2;
        Ref$ObjectRef ref$ObjectRef3;
        q qVar2;
        Ref$ObjectRef ref$ObjectRef4;
        Ref$FloatRef ref$FloatRef2;
        hb30 hb30Var;
        boolean z;
        if (continuationImpl instanceof MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) {
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = (MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1) continuationImpl;
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (j < 0) {
                        return Boolean.FALSE;
                    }
                    MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2(qVar, null);
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0 = qVar;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1 = ref$ObjectRef;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2 = ref$FloatRef;
                    yVar2 = yVar;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3 = yVar2;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4 = ref$ObjectRef3;
                    mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label = 1;
                    obj = kotlinx.coroutines.a.w(j, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qVar2 = qVar;
                    ref$ObjectRef4 = ref$ObjectRef;
                    ref$FloatRef2 = ref$FloatRef;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$4;
                    y yVar3 = (y) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$3;
                    ref$FloatRef2 = (Ref$FloatRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$2;
                    ref$ObjectRef4 = (Ref$ObjectRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$1;
                    q qVar3 = (q) mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.L$0;
                    kotlin.b.b(obj);
                    ref$ObjectRef3 = ref$ObjectRef5;
                    yVar2 = yVar3;
                    qVar2 = qVar3;
                }
                hb30Var = (hb30) obj;
                if (hb30Var == null) {
                    boolean z2 = ((hb30) ref$ObjectRef4.element).c;
                    long j2 = hb30Var.a;
                    ref$ObjectRef4.element = new hb30(j2, hb30Var.b, z2);
                    ref$FloatRef2.element = yVar2.i(yVar2.e(j2));
                    ref$ObjectRef3.element = uh6.a(0.0f, 0.0f, 30);
                    kjj kjjVar = qVar2.e;
                    long j3 = hb30Var.b;
                    long j4 = hb30Var.a;
                    kjjVar.a.a(Float.intBitsToFloat((int) (j4 >> 32)), j3);
                    kjjVar.b.a(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), j3);
                    z = !iob1.a(ref$FloatRef2.element);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1(continuationImpl);
        Object obj2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$waitNextScrollDelta$1.label;
        if (i != 0) {
        }
        hb30Var = (hb30) obj2;
        if (hb30Var == null) {
        }
        return Boolean.valueOf(z);
    }

    public static hb30 g(kotlinx.coroutines.channels.a aVar) {
        hb30 hb30Var = null;
        rrq0 a = vrq0.a(new NonTouchScrollingLogicKt$untilNull$1(new gb30(aVar, 0), null));
        while (a.hasNext()) {
            hb30 hb30Var2 = (hb30) a.next();
            if (hb30Var != null) {
                hb30Var2 = hb30Var.a(hb30Var2);
            }
            hb30Var = hb30Var2;
        }
        return hb30Var;
    }

    public final float e(clp0 clp0Var, float f) {
        y yVar = this.a;
        long h = yVar.h(yVar.d(f));
        y yVar2 = clp0Var.a;
        return yVar.g(yVar.e(yVar2.c(yVar2.k, h, 1)));
    }

    public final boolean f(tvd0 tvd0Var) {
        long j;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.b;
        float f = -viewConfiguration.getScaledVerticalScrollFactor();
        float f2 = -viewConfiguration.getScaledHorizontalScrollFactor();
        List list = tvd0Var.a;
        wu60 wu60Var = new wu60(0L);
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            j = wu60Var.a;
            if (i >= size) {
                break;
            }
            wu60Var = new wu60(wu60.f(j, ((zvd0) list.get(i)).j));
            i++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        y yVar = this.a;
        float i2 = yVar.i(yVar.e(floatToRawIntBits));
        if (i2 != 0.0f) {
            wkp0 wkp0Var = yVar.a;
            z = i2 > 0.0f ? wkp0Var.b() : wkp0Var.e();
        }
        if (!z) {
            return this.d;
        }
        Object d = this.g.d(new hb30(floatToRawIntBits, ((zvd0) kotlin.collections.a.P(tvd0Var.a)).b, false));
        ni9 ni9Var = oi9.b;
        return !(d instanceof ni9);
    }
}
