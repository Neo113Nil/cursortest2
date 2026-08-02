package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TextContextMenuGesturesModifier.kt */
/* loaded from: classes11.dex */
public final class zco0 extends ytl implements nvi, o1u {
    public wzs<? super ov70, ? super spj<? super s3q0>, ? extends Object> r;
    public final wh50 s = androidx.compose.runtime.k.a(null, w65.e);

    /* compiled from: TextContextMenuGesturesModifier.kt */
    public static final class a implements PointerInputEventHandler {

        /* compiled from: TextContextMenuGesturesModifier.kt */
        /* renamed from: xsna.zco0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C4174a extends FunctionReferenceImpl implements izs<ov70, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(ov70 ov70Var) {
                long j = ov70Var.a;
                zco0 zco0Var = (zco0) this.receiver;
                zco0Var.getClass();
                gdo0 gdo0Var = (gdo0) ovi.a(zco0Var, hdo0.a);
                if (gdo0Var != null) {
                    myc0.h(zco0Var.W1(), null, null, new ado0(zco0Var, j, gdo0Var, zco0Var.new b(j), null), 3);
                }
                return s3q0.a;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object c = d7s.c(dmb0Var, new dkg0(new C4174a(1, zco0.this, zco0.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), null), spjVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (c != coroutineSingletons) {
                c = s3q0.a;
            }
            return c == coroutineSingletons ? c : s3q0.a;
        }
    }

    /* compiled from: TextContextMenuGesturesModifier.kt */
    public final class b implements wco0 {
        public final long b;

        public b(long j) {
            this.b = j;
        }

        @Override // xsna.wco0
        public final zhf0 K1(tny tnyVar) {
            return p490.e(U(tnyVar), 0L);
        }

        @Override // xsna.wco0
        public final vco0 L() {
            return fdo0.a(zco0.this);
        }

        @Override // xsna.wco0
        public final long U(tny tnyVar) {
            tny tnyVar2 = (tny) ((zak0) zco0.this.s).getValue();
            if (tnyVar2 != null) {
                return tnyVar.w(tnyVar2, this.b);
            }
            xzw.d("Tried to open context menu before the anchor was placed.");
            throw new KotlinNothingValueException();
        }
    }

    public zco0(wzs<? super ov70, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        this.r = wzsVar;
        i2(skn0.a(new a()));
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        ((zak0) this.s).setValue(oVar);
    }
}
