package xsna;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.er9;
import xsna.o2d0;
import xsna.ogo;
import xsna.q630;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public abstract class klg0 extends q630.c implements nvi, lio, ony {
    public final wax p;
    public final boolean q;
    public final float r;
    public final o7g s;
    public final gzs<ykg0> t;
    public buk0 u;
    public float v;
    public boolean x;
    public long w = 0;
    public final fh50<o2d0> y = new fh50<>((Object) null);

    /* compiled from: Ripple.kt */
    @b6l(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: Ripple.kt */
        /* renamed from: xsna.klg0$a$a, reason: collision with other inner class name */
        public static final class C3185a<T> implements lsr {
            public final /* synthetic */ klg0 b;
            public final /* synthetic */ yvj c;

            public C3185a(klg0 klg0Var, yvj yvjVar) {
                this.b = klg0Var;
                this.c = yvjVar;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                boolean z = vaxVar instanceof o2d0;
                klg0 klg0Var = this.b;
                if (!z) {
                    buk0 buk0Var = klg0Var.u;
                    if (buk0Var == null) {
                        buk0Var = new buk0(klg0Var.q, klg0Var.t);
                        mio.a(klg0Var);
                        klg0Var.u = buk0Var;
                    }
                    ArrayList arrayList = buk0Var.d;
                    boolean z2 = vaxVar instanceof lgv;
                    if (z2) {
                        arrayList.add(vaxVar);
                    } else if (vaxVar instanceof mgv) {
                        arrayList.remove(((mgv) vaxVar).a);
                    } else if (vaxVar instanceof pvr) {
                        arrayList.add(vaxVar);
                    } else if (vaxVar instanceof qvr) {
                        arrayList.remove(((qvr) vaxVar).a);
                    } else if (vaxVar instanceof ogo.b) {
                        arrayList.add(vaxVar);
                    } else if (vaxVar instanceof ogo.c) {
                        arrayList.remove(((ogo.c) vaxVar).a);
                    } else if (vaxVar instanceof ogo.a) {
                        arrayList.remove(((ogo.a) vaxVar).a);
                    }
                    vax vaxVar2 = (vax) j5g.k0(arrayList);
                    if (!epx.f(buk0Var.e, vaxVar2)) {
                        yvj yvjVar = this.c;
                        if (vaxVar2 != null) {
                            ykg0 invoke = buk0Var.b.invoke();
                            float f = z2 ? invoke.c : vaxVar instanceof pvr ? invoke.b : vaxVar instanceof ogo.b ? invoke.a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            dtp0<Float> dtp0Var = hlg0.a;
                            if (!(vaxVar2 instanceof lgv)) {
                                if (vaxVar2 instanceof pvr) {
                                    dtp0Var = new dtp0<>(45, luo.d, 2);
                                } else if (vaxVar2 instanceof ogo.b) {
                                    dtp0Var = new dtp0<>(45, luo.d, 2);
                                }
                            }
                            myc0.h(yvjVar, null, null, new ztk0(buk0Var, f, dtp0Var, null), 3);
                        } else {
                            vax vaxVar3 = buk0Var.e;
                            dtp0<Float> dtp0Var2 = hlg0.a;
                            if (!(vaxVar3 instanceof lgv) && !(vaxVar3 instanceof pvr) && (vaxVar3 instanceof ogo.b)) {
                                dtp0Var2 = new dtp0<>(150, luo.d, 2);
                            }
                            myc0.h(yvjVar, null, null, new auk0(buk0Var, dtp0Var2, null), 3);
                        }
                        buk0Var.e = vaxVar2;
                    }
                } else if (klg0Var.x) {
                    klg0Var.i2((o2d0) vaxVar);
                } else {
                    klg0Var.y.j(vaxVar);
                }
                return s3q0.a;
            }
        }

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = klg0.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                caj0 b = klg0.this.p.b();
                C3185a c3185a = new C3185a(klg0.this, yvjVar);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, c3185a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public klg0(wax waxVar, boolean z, float f, o7g o7gVar, gzs gzsVar) {
        this.p = waxVar;
        this.q = z;
        this.r = f;
        this.s = o7gVar;
        this.t = gzsVar;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        myc0.h(W1(), null, null, new a(null), 3);
    }

    @Override // xsna.ony, xsna.lp10
    public final void e(long j) {
        float I0;
        this.x = true;
        azl azlVar = itl.f(this).z;
        this.w = pli.w(j);
        float f = this.r;
        if (Float.isNaN(f)) {
            long j2 = this.w;
            float f2 = zkg0.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            I0 = ov70.d((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)) / 2.0f;
            if (this.q) {
                I0 += azlVar.I0(zkg0.a);
            }
        } else {
            I0 = azlVar.I0(f);
        }
        this.v = I0;
        fh50<o2d0> fh50Var = this.y;
        Object[] objArr = fh50Var.a;
        int i = fh50Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            i2((o2d0) objArr[i2]);
        }
        fh50Var.m();
    }

    public final void i2(o2d0 o2d0Var) {
        if (!(o2d0Var instanceof o2d0.b)) {
            if (o2d0Var instanceof o2d0.c) {
                o2d0.b bVar = ((o2d0.c) o2d0Var).a;
                glg0 glg0Var = ((dc2) this).A;
                if (glg0Var != null) {
                    glg0Var.d();
                    return;
                }
                return;
            }
            if (o2d0Var instanceof o2d0.a) {
                o2d0.b bVar2 = ((o2d0.a) o2d0Var).a;
                glg0 glg0Var2 = ((dc2) this).A;
                if (glg0Var2 != null) {
                    glg0Var2.d();
                    return;
                }
                return;
            }
            return;
        }
        o2d0.b bVar3 = (o2d0.b) o2d0Var;
        long j = this.w;
        float f = this.v;
        dc2 dc2Var = (dc2) this;
        dlg0 dlg0Var = dc2Var.z;
        if (dlg0Var == null) {
            Object obj = (View) ovi.a(dc2Var, AndroidCompositionLocals_androidKt.f);
            while (!(obj instanceof ViewGroup)) {
                Object parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    throw new IllegalArgumentException(so.a(obj, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    dlg0 dlg0Var2 = new dlg0(viewGroup.getContext());
                    viewGroup.addView(dlg0Var2);
                    dlg0Var = dlg0Var2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof dlg0) {
                        dlg0Var = (dlg0) childAt;
                        break;
                    }
                    i++;
                }
            }
            dc2Var.z = dlg0Var;
        }
        ArrayList arrayList = dlg0Var.c;
        sq90 sq90Var = dlg0Var.e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) sq90Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) sq90Var.a;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) sq90Var.b;
        glg0 glg0Var3 = (glg0) linkedHashMap.get(dc2Var);
        if (glg0Var3 == null) {
            glg0Var3 = (glg0) g5g.H(dlg0Var.d);
            if (glg0Var3 == null) {
                if (dlg0Var.f > e43.h(arrayList)) {
                    glg0Var3 = new glg0(dlg0Var.getContext());
                    dlg0Var.addView(glg0Var3);
                    arrayList.add(glg0Var3);
                } else {
                    glg0Var3 = (glg0) arrayList.get(dlg0Var.f);
                    flg0 flg0Var = (flg0) linkedHashMap3.get(glg0Var3);
                    if (flg0Var != null) {
                        flg0Var.F0();
                        glg0 glg0Var4 = (glg0) linkedHashMap2.get(flg0Var);
                        if (glg0Var4 != null) {
                        }
                        linkedHashMap2.remove(flg0Var);
                        glg0Var3.c();
                    }
                }
                int i2 = dlg0Var.f;
                if (i2 < dlg0Var.b - 1) {
                    dlg0Var.f = i2 + 1;
                } else {
                    dlg0Var.f = 0;
                }
            }
            linkedHashMap2.put(dc2Var, glg0Var3);
            linkedHashMap3.put(glg0Var3, dc2Var);
        }
        glg0 glg0Var5 = glg0Var3;
        glg0Var5.b(bVar3, dc2Var.q, j, an10.b(f), dc2Var.s.a(), dc2Var.t.invoke().d, new cc2(dc2Var));
        dc2Var.A = glg0Var5;
        mio.a(dc2Var);
    }

    @Override // xsna.lio
    public final void v(toy toyVar) {
        er9 er9Var = toyVar.b;
        toyVar.s1();
        buk0 buk0Var = this.u;
        if (buk0Var != null) {
            float f = this.v;
            long a2 = this.s.a();
            float floatValue = buk0Var.c.d().floatValue();
            if (floatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                long c = l5g.c(14, a2, floatValue);
                if (buk0Var.a) {
                    float intBitsToFloat = Float.intBitsToFloat((int) (er9Var.d() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                    er9.b bVar = er9Var.c;
                    long d = bVar.d();
                    bVar.a().e();
                    try {
                        bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat, intBitsToFloat2, 1);
                        oio.V1(toyVar, c, f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    } finally {
                        nq.b(bVar, d);
                    }
                } else {
                    oio.V1(toyVar, c, f, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                }
            }
        }
        dc2 dc2Var = (dc2) this;
        yq9 a3 = er9Var.c.a();
        glg0 glg0Var = dc2Var.A;
        if (glg0Var != null) {
            long j = dc2Var.w;
            glg0Var.e(an10.b(dc2Var.v), j, dc2Var.t.invoke().d, dc2Var.s.a());
            Canvas canvas = e52.a;
            glg0Var.draw(((d52) a3).a);
        }
    }
}
