package xsna;

import android.os.Looper;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: Wrapper.android.kt */
/* loaded from: classes11.dex */
public final class rzx0 implements bvi, androidx.lifecycle.l {
    public final p52 b;
    public final ivi c;
    public boolean d;
    public Lifecycle e;
    public wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> f = yoi.a;

    /* compiled from: Wrapper.android.kt */
    public static final class a extends Lambda implements izs<iri, s3q0> {
        final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
            super(1);
            this.$content = wzsVar;
        }

        @Override // xsna.izs
        public final s3q0 invoke(iri iriVar) {
            iri iriVar2 = iriVar;
            if (!rzx0.this.d) {
                f5z f5zVar = iriVar2.c;
                View view = iriVar2.a;
                Lifecycle lifecycle = f5zVar.getLifecycle();
                rzx0 rzx0Var = rzx0.this;
                rzx0Var.f = this.$content;
                if (rzx0Var.e == null) {
                    if (epx.f(Looper.myLooper(), view.getHandler().getLooper())) {
                        rzx0 rzx0Var2 = rzx0.this;
                        rzx0Var2.e = lifecycle;
                        lifecycle.addObserver(rzx0Var2);
                    } else {
                        view.post(new kgb(8, rzx0.this, lifecycle));
                    }
                } else if (lifecycle.getCurrentState().a(Lifecycle.State.CREATED)) {
                    rzx0 rzx0Var3 = rzx0.this;
                    rzx0Var3.c.d(new jai(-1723985096, new qzx0(rzx0Var3, iriVar2, this.$content), true));
                }
            }
            return s3q0.a;
        }
    }

    public rzx0(p52 p52Var, ivi iviVar) {
        this.b = p52Var;
        this.c = iviVar;
    }

    @Override // xsna.bvi
    public final void d(wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> wzsVar) {
        this.b.setOnReadyForComposition(new a(wzsVar));
    }

    @Override // xsna.bvi
    public final void dispose() {
        if (!this.d) {
            this.d = true;
            this.b.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.e;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            this.e = null;
        }
        this.c.dispose();
    }

    @Override // xsna.bvi
    public final boolean h() {
        return this.c.h();
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.d) {
                return;
            }
            d(this.f);
        }
    }
}
