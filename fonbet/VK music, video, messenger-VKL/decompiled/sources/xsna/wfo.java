package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DragAndDropReorder.kt */
/* loaded from: classes16.dex */
public final class wfo {
    public final xvy a;
    public final yvj b;
    public final zzs<Integer, Object, Integer, Object, s3q0> c;
    public final gzs<s3q0> d;
    public final nm8 e = w0b.a(0, null, null, 7);
    public final wh50 f = androidx.compose.runtime.k.b(null);
    public final wh50 g = androidx.compose.runtime.k.b(null);
    public final if2<Float, sq2> h = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final kg50 i = androidx.compose.runtime.d.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final rg50 j = androidx.compose.runtime.i.a(0);

    /* compiled from: DragAndDropReorder.kt */
    @b6l(c = "com.vk.catalog.mvi.section.ui.view.reorder.DragDropState$onDragInterrupted$1", f = "DragAndDropReorder.kt", l = {333, 334}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $startOffset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$startOffset = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return wfo.this.new a(this.$startOffset, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        
            if (xsna.if2.c(r4, r5, r6, null, r8, 12) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = wfo.this.h;
                Float f = new Float(this.$startOffset);
                this.label = 1;
                if (if2Var.e(f, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    aVar = this;
                    ((zak0) wfo.this.g).setValue(null);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            if2<Float, sq2> if2Var2 = wfo.this.h;
            Float f2 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new Float(1.0f), 1);
            this.label = 2;
            aVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wfo(xvy xvyVar, yvj yvjVar, zzs<? super Integer, Object, ? super Integer, Object, s3q0> zzsVar, gzs<s3q0> gzsVar) {
        this.a = xvyVar;
        this.b = yvjVar;
        this.c = zzsVar;
        this.d = gzsVar;
    }

    public final xuy a() {
        Object obj;
        Iterator<T> it = this.a.j().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((xuy) obj).getKey(), ((zak0) this.f).getValue())) {
                break;
            }
        }
        return (xuy) obj;
    }

    public final float b() {
        if (a() == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return (((vak0) this.i).getFloatValue() + ((wak0) this.j).getIntValue()) - r0.getOffset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0102, code lost:
    
        if (r0 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j) {
        Object obj;
        float f;
        kg50 kg50Var = this.i;
        vak0 vak0Var = (vak0) kg50Var;
        int i = (int) (j & 4294967295L);
        ((vak0) kg50Var).g(Float.intBitsToFloat(i) + vak0Var.getFloatValue());
        xuy a2 = a();
        if (a2 == null) {
            return;
        }
        float b = b() + a2.getOffset();
        float size = a2.getSize() + b;
        float a3 = wq.a(size, b, 2.0f, b);
        xvy xvyVar = this.a;
        Iterator<T> it = xvyVar.j().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            xuy xuyVar = (xuy) obj;
            int offset = xuyVar.getOffset();
            int size2 = xuyVar.getSize() + xuyVar.getOffset();
            int i2 = (int) a3;
            if (offset <= i2 && i2 <= size2 && ((a2.getIndex() > xuyVar.getIndex() && Float.intBitsToFloat(i) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || (a2.getIndex() < xuyVar.getIndex() && Float.intBitsToFloat(i) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                break;
            }
        }
        xuy xuyVar2 = (xuy) obj;
        if (xuyVar2 == null) {
            if (vak0Var.getFloatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = size - xvyVar.j().h();
            } else {
                if (vak0Var.getFloatValue() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float g = b - xvyVar.j().g();
                    if (g <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f = g;
                    }
                }
                f = 0.0f;
            }
            if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            this.e.f(Float.valueOf(f));
            return;
        }
        if (a2.getIndex() == xvyVar.h() || xuyVar2.getIndex() == xvyVar.h()) {
            int h = xvyVar.h();
            int i3 = xvyVar.i();
            if (xvyVar.j.a()) {
                myc0.h(((hvy) ((zak0) xvyVar.f).getValue()).h, null, null, new wvy(xvyVar, null), 3);
            }
            xvyVar.l(h, i3, false);
        }
        this.c.invoke(Integer.valueOf(a2.getIndex()), a2.getKey(), Integer.valueOf(xuyVar2.getIndex()), xuyVar2.getKey());
    }

    public final void d() {
        wh50 wh50Var = this.f;
        zak0 zak0Var = (zak0) wh50Var;
        if (zak0Var.getValue() != null) {
            ((zak0) this.g).setValue(zak0Var.getValue());
            myc0.h(this.b, null, null, new a(b(), null), 3);
        }
        ((vak0) this.i).g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ((zak0) wh50Var).setValue(null);
        ((wak0) this.j).C(0);
        this.d.invoke();
    }

    public final void e(Object obj) {
        Object obj2;
        Iterator<T> it = this.a.j().f().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it.next();
                if (epx.f(((xuy) obj2).getKey(), obj)) {
                    break;
                }
            }
        }
        xuy xuyVar = (xuy) obj2;
        if (xuyVar != null) {
            ((zak0) this.f).setValue(xuyVar.getKey());
            ((wak0) this.j).C(xuyVar.getOffset());
        }
    }
}
