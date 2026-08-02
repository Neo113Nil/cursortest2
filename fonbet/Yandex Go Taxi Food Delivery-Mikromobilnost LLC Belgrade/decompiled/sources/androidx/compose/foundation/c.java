package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.db2;
import defpackage.ekt;
import defpackage.exw0;
import defpackage.fwi;
import defpackage.j690;
import defpackage.k631;
import defpackage.lqh;
import defpackage.m810;
import defpackage.ma91;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rzo;
import defpackage.tls;
import defpackage.tvd0;
import defpackage.u3a1;
import defpackage.vm2;
import defpackage.wls;
import defpackage.wu60;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class c {
    public final fwi a;
    public long b = 9205357640488583168L;
    public final f c;
    public final oz40 d;
    public final boolean e;
    public boolean f;
    public long g;
    public long h;
    public final lqh i;

    public c(Context context, fwi fwiVar, long j, j690 j690Var) {
        this.a = fwiVar;
        f fVar = new f(context, rzo.X(j));
        this.c = fVar;
        this.d = androidx.compose.runtime.f.i(zy11.a, x4c.Q);
        this.e = true;
        this.g = 0L;
        this.h = -1L;
        b bVar = new b(this);
        tvd0 tvd0Var = exw0.a;
        androidx.compose.ui.input.pointer.g gVar = new androidx.compose.ui.input.pointer.g(null, null, bVar);
        this.i = Build.VERSION.SDK_INT >= 31 ? new ekt(gVar, this, fVar) : new ekt(gVar, this, fVar, j690Var);
    }

    public final void a() {
        boolean z;
        f fVar = this.c;
        EdgeEffect edgeEffect = fVar.d;
        boolean z2 = true;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = !edgeEffect.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = fVar.e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z = !edgeEffect2.isFinished() || z;
        }
        EdgeEffect edgeEffect3 = fVar.f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z = !edgeEffect3.isFinished() || z;
        }
        EdgeEffect edgeEffect4 = fVar.g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() && !z) {
                z2 = false;
            }
            z = z2;
        }
        if (z) {
            e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r4 == r6) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, wls wlsVar, ContinuationImpl continuationImpl) {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        int i;
        long e;
        long e2;
        if (continuationImpl instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuationImpl;
            int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
                zy11 zy11Var = zy11.a;
                f fVar = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (cjs0.e(this.g)) {
                        Object k631Var = new k631(j);
                        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
                        if (wlsVar.invoke(k631Var, androidEdgeEffectOverscrollEffect$applyToFling$1) != obj2) {
                            return zy11Var;
                        }
                    } else {
                        boolean g = f.g(fVar.f);
                        fwi fwiVar = this.a;
                        long a = ma91.a((!g || k631.c(j) >= 0.0f) ? (!f.g(fVar.g) || k631.c(j) <= 0.0f) ? 0.0f : -u3a1.b(fVar.d(), -k631.c(j), Float.intBitsToFloat((int) (this.g >> 32)), fwiVar) : u3a1.b(fVar.c(), k631.c(j), Float.intBitsToFloat((int) (this.g >> 32)), fwiVar), (!f.g(fVar.d) || k631.d(j) >= 0.0f) ? (!f.g(fVar.e) || k631.d(j) <= 0.0f) ? 0.0f : -u3a1.b(fVar.b(), -k631.d(j), Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), fwiVar) : u3a1.b(fVar.e(), k631.d(j), Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), fwiVar));
                        if (a != 0) {
                            e();
                        }
                        e = k631.e(j, a);
                        Object k631Var2 = new k631(e);
                        androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = e;
                        androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                        obj = wlsVar.invoke(k631Var2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                    }
                    return obj2;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
                kotlin.b.b(obj);
                e2 = k631.e(e, ((k631) obj).a);
                this.f = false;
                if (k631.c(e2) <= 0.0f) {
                    EdgeEffect c = fVar.c();
                    int b = m810.b(k631.c(e2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        c.onAbsorb(b);
                    } else if (c.isFinished()) {
                        c.onAbsorb(b);
                    }
                } else if (k631.c(e2) < 0.0f) {
                    EdgeEffect d = fVar.d();
                    int i3 = -m810.b(k631.c(e2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        d.onAbsorb(i3);
                    } else if (d.isFinished()) {
                        d.onAbsorb(i3);
                    }
                }
                if (k631.d(e2) <= 0.0f) {
                    EdgeEffect e3 = fVar.e();
                    int b2 = m810.b(k631.d(e2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        e3.onAbsorb(b2);
                    } else if (e3.isFinished()) {
                        e3.onAbsorb(b2);
                    }
                } else if (k631.d(e2) < 0.0f) {
                    EdgeEffect b3 = fVar.b();
                    int i4 = -m810.b(k631.d(e2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        b3.onAbsorb(i4);
                    } else if (b3.isFinished()) {
                        b3.onAbsorb(i4);
                    }
                }
                a();
                return zy11Var;
            }
        }
        androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuationImpl);
        Object obj3 = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        zy11 zy11Var2 = zy11.a;
        f fVar2 = this.c;
        if (i != 0) {
        }
        e2 = k631.e(e, ((k631) obj3).a);
        this.f = false;
        if (k631.c(e2) <= 0.0f) {
        }
        if (k631.d(e2) <= 0.0f) {
        }
        a();
        return zy11Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(long j, int i, tls tlsVar) {
        long j2;
        float intBitsToFloat;
        int i2;
        float h;
        float intBitsToFloat2;
        long floatToRawIntBits;
        long e;
        boolean z;
        boolean z2;
        long j3;
        float f;
        float f2;
        boolean z3;
        int i3;
        boolean z4;
        if (cjs0.e(this.g)) {
            return ((wu60) tlsVar.invoke(new wu60(j))).a;
        }
        boolean z5 = this.f;
        boolean z6 = true;
        f fVar = this.c;
        if (!z5) {
            if (f.g(fVar.f)) {
                g(0L);
            }
            if (f.g(fVar.g)) {
                h(0L);
            }
            if (f.g(fVar.d)) {
                i(0L);
            }
            if (f.g(fVar.e)) {
                f(0L);
            }
            this.f = true;
        }
        int i4 = db2.a;
        float f3 = i == 2 ? 4.0f : 1.0f;
        long g = wu60.g(f3, j);
        int i5 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (Float.intBitsToFloat(i5) != 0.0f) {
            if (!f.g(fVar.d) || Float.intBitsToFloat(i5) >= 0.0f) {
                j2 = 4294967295L;
                if (f.g(fVar.e) && Float.intBitsToFloat(i5) > 0.0f) {
                    float f4 = f(g);
                    if (!f.g(fVar.e)) {
                        fVar.b().finish();
                    }
                    intBitsToFloat = f4 == Float.intBitsToFloat((int) (g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) ? Float.intBitsToFloat(i5) : f4 / f3;
                }
            } else {
                float i6 = i(g);
                j2 = 4294967295L;
                if (!f.g(fVar.d)) {
                    fVar.e().finish();
                }
                intBitsToFloat = i6 == Float.intBitsToFloat((int) (g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) ? Float.intBitsToFloat(i5) : i6 / f3;
            }
            i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != 0.0f) {
                if (f.g(fVar.f) && Float.intBitsToFloat(i2) < 0.0f) {
                    h = g(g);
                    if (!f.g(fVar.f)) {
                        fVar.c().finish();
                    }
                    if (h == Float.intBitsToFloat((int) (g >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = h / f3;
                } else if (f.g(fVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                    h = h(g);
                    if (!f.g(fVar.g)) {
                        fVar.d().finish();
                    }
                    if (h == Float.intBitsToFloat((int) (g >> 32))) {
                        intBitsToFloat2 = Float.intBitsToFloat(i2);
                    }
                    intBitsToFloat2 = h / f3;
                }
                floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
                if (!wu60.c(floatToRawIntBits, 0L)) {
                    e();
                }
                e = wu60.e(j, floatToRawIntBits);
                long j4 = ((wu60) tlsVar.invoke(new wu60(e))).a;
                long e2 = wu60.e(e, j4);
                if ((Float.intBitsToFloat((int) (e >> 32)) == 0.0f || Float.intBitsToFloat((int) (e & j2)) != 0.0f) && ((Float.intBitsToFloat((int) (j4 >> 32)) != 0.0f || Float.intBitsToFloat((int) (j4 & j2)) != 0.0f) && (f.g(fVar.f) || f.g(fVar.d) || f.g(fVar.g) || f.g(fVar.e)))) {
                    a();
                }
                if (i == 1) {
                    int i7 = (int) (e2 >> 32);
                    if (Float.intBitsToFloat(i7) > 0.5f) {
                        j3 = e2;
                        g(j3);
                    } else {
                        j3 = e2;
                        if (Float.intBitsToFloat(i7) >= -0.5f) {
                            f = 0.5f;
                            f2 = -0.5f;
                            z3 = false;
                            i3 = (int) (j3 & j2);
                            if (Float.intBitsToFloat(i3) <= f) {
                                i(j3);
                            } else if (Float.intBitsToFloat(i3) < f2) {
                                f(j3);
                            } else {
                                z4 = false;
                                if (!z3 || z4) {
                                    z = true;
                                    if (!wu60.c(e, 0L)) {
                                        if (!f.f(fVar.f) || Float.intBitsToFloat(i2) >= 0.0f) {
                                            z2 = false;
                                        } else {
                                            EdgeEffect c = fVar.c();
                                            float intBitsToFloat3 = Float.intBitsToFloat(i2);
                                            if (c instanceof GlowEdgeEffectCompat) {
                                                ((GlowEdgeEffectCompat) c).releaseWithOppositeDelta(intBitsToFloat3);
                                            } else {
                                                c.onRelease();
                                            }
                                            z2 = f.f(fVar.f);
                                        }
                                        if (f.f(fVar.g) && Float.intBitsToFloat(i2) > 0.0f) {
                                            EdgeEffect d = fVar.d();
                                            float intBitsToFloat4 = Float.intBitsToFloat(i2);
                                            if (d instanceof GlowEdgeEffectCompat) {
                                                ((GlowEdgeEffectCompat) d).releaseWithOppositeDelta(intBitsToFloat4);
                                            } else {
                                                d.onRelease();
                                            }
                                            z2 = z2 || f.f(fVar.g);
                                        }
                                        if (f.f(fVar.d) && Float.intBitsToFloat(i5) < 0.0f) {
                                            EdgeEffect e3 = fVar.e();
                                            float intBitsToFloat5 = Float.intBitsToFloat(i5);
                                            if (e3 instanceof GlowEdgeEffectCompat) {
                                                ((GlowEdgeEffectCompat) e3).releaseWithOppositeDelta(intBitsToFloat5);
                                            } else {
                                                e3.onRelease();
                                            }
                                            z2 = z2 || f.f(fVar.d);
                                        }
                                        if (f.f(fVar.e) && Float.intBitsToFloat(i5) > 0.0f) {
                                            EdgeEffect b = fVar.b();
                                            float intBitsToFloat6 = Float.intBitsToFloat(i5);
                                            if (b instanceof GlowEdgeEffectCompat) {
                                                ((GlowEdgeEffectCompat) b).releaseWithOppositeDelta(intBitsToFloat6);
                                            } else {
                                                b.onRelease();
                                            }
                                            z2 = z2 || f.f(fVar.e);
                                        }
                                        if (!z2 && !z) {
                                            z6 = false;
                                        }
                                        z = z6;
                                    }
                                    if (z) {
                                        e();
                                    }
                                    return wu60.f(floatToRawIntBits, j4);
                                }
                            }
                            z4 = true;
                            if (!z3) {
                            }
                            z = true;
                            if (!wu60.c(e, 0L)) {
                            }
                            if (z) {
                            }
                            return wu60.f(floatToRawIntBits, j4);
                        }
                        h(j3);
                    }
                    z3 = true;
                    f = 0.5f;
                    f2 = -0.5f;
                    i3 = (int) (j3 & j2);
                    if (Float.intBitsToFloat(i3) <= f) {
                    }
                    z4 = true;
                    if (!z3) {
                    }
                    z = true;
                    if (!wu60.c(e, 0L)) {
                    }
                    if (z) {
                    }
                    return wu60.f(floatToRawIntBits, j4);
                }
                z = false;
                if (!wu60.c(e, 0L)) {
                }
                if (z) {
                }
                return wu60.f(floatToRawIntBits, j4);
            }
            intBitsToFloat2 = 0.0f;
            floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
            if (!wu60.c(floatToRawIntBits, 0L)) {
            }
            e = wu60.e(j, floatToRawIntBits);
            long j42 = ((wu60) tlsVar.invoke(new wu60(e))).a;
            long e22 = wu60.e(e, j42);
            if (Float.intBitsToFloat((int) (e >> 32)) == 0.0f) {
            }
            a();
            if (i == 1) {
            }
            z = false;
            if (!wu60.c(e, 0L)) {
            }
            if (z) {
            }
            return wu60.f(floatToRawIntBits, j42);
        }
        j2 = 4294967295L;
        intBitsToFloat = 0.0f;
        i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) != 0.0f) {
        }
        intBitsToFloat2 = 0.0f;
        floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        if (!wu60.c(floatToRawIntBits, 0L)) {
        }
        e = wu60.e(j, floatToRawIntBits);
        long j422 = ((wu60) tlsVar.invoke(new wu60(e))).a;
        long e222 = wu60.e(e, j422);
        if (Float.intBitsToFloat((int) (e >> 32)) == 0.0f) {
        }
        a();
        if (i == 1) {
        }
        z = false;
        if (!wu60.c(e, 0L)) {
        }
        if (z) {
        }
        return wu60.f(floatToRawIntBits, j422);
    }

    public final long d() {
        long j = this.b;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            j = cma1.Q(this.g);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / Float.intBitsToFloat((int) (this.g >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) / Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void e() {
        if (this.e) {
            this.d.setValue(zy11.a);
        }
    }

    public final float f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (d() >> 32));
        int i = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        EdgeEffect b = this.c.b();
        float f = -intBitsToFloat2;
        float f2 = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = vm2.g(b, f, f2);
        } else {
            b.onPull(f, f2);
        }
        return (i2 >= 31 ? vm2.e(b) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & this.g)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float g(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (d() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect c = this.c.c();
        float f = 1.0f - intBitsToFloat;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = vm2.g(c, intBitsToFloat2, f);
        } else {
            c.onPull(intBitsToFloat2, f);
        }
        return (i2 >= 31 ? vm2.e(c) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final float h(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (d() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        int i = (int) (j >> 32);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g >> 32));
        EdgeEffect d = this.c.d();
        float f = -intBitsToFloat2;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            f = vm2.g(d, f, intBitsToFloat);
        } else {
            d.onPull(f, intBitsToFloat);
        }
        return (i2 >= 31 ? vm2.e(d) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g >> 32)) * (-f) : Float.intBitsToFloat(i);
    }

    public final float i(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (d() >> 32));
        int i = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat2 = Float.intBitsToFloat(i) / Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        EdgeEffect e = this.c.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            intBitsToFloat2 = vm2.g(e, intBitsToFloat2, intBitsToFloat);
        } else {
            e.onPull(intBitsToFloat2, intBitsToFloat);
        }
        return (i2 >= 31 ? vm2.e(e) : 0.0f) == 0.0f ? Float.intBitsToFloat((int) (this.g & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * intBitsToFloat2 : Float.intBitsToFloat(i);
    }

    public final void j(long j) {
        boolean a = cjs0.a(this.g, 0L);
        boolean a2 = cjs0.a(j, this.g);
        this.g = j;
        if (!a2) {
            long b = (m810.b(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (m810.b(Float.intBitsToFloat((int) (j >> 32))) << 32);
            f fVar = this.c;
            fVar.c = b;
            EdgeEffect edgeEffect = fVar.d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            EdgeEffect edgeEffect2 = fVar.e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            EdgeEffect edgeEffect3 = fVar.f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (int) (b >> 32));
            }
            EdgeEffect edgeEffect4 = fVar.g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (int) (b >> 32));
            }
            EdgeEffect edgeEffect5 = fVar.h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            EdgeEffect edgeEffect6 = fVar.i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (b >> 32), (int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            }
            EdgeEffect edgeEffect7 = fVar.j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (int) (b >> 32));
            }
            EdgeEffect edgeEffect8 = fVar.k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & b), (int) (b >> 32));
            }
        }
        if (a || a2) {
            return;
        }
        a();
    }
}
