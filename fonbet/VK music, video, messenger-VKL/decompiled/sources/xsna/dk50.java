package xsna;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import xsna.mm50;

/* compiled from: MviComposeComponent.kt */
/* loaded from: classes3.dex */
public abstract class dk50<Store extends mm50<?, ?, ?>> implements ypo0<Store>, zqi {

    /* compiled from: MviComposeComponent.kt */
    public static final class b implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ dk50<Store> b;
        public final /* synthetic */ Store c;

        public b(dk50<Store> dk50Var, Store store) {
            this.b = dk50Var;
            this.c = store;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1613169786, intValue, -1, "com.vk.mvi.component.MviComposeComponent.render.<anonymous>.<anonymous> (MviComposeComponent.kt:22)");
                }
                Store store = this.c;
                dk50<Store> dk50Var = this.b;
                dk50Var.a(6, aVar2, kai.c(1574693276, new ek50(dk50Var, store), aVar2));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public final void c(Store store, ComposeView composeView) {
        if (composeView.isAttachedToWindow()) {
            composeView.setContent(new jai(1613169786, new b(this, store), true));
        } else {
            composeView.addOnAttachStateChangeListener(new a(composeView, composeView, this, store));
        }
    }

    /* compiled from: View.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ ComposeView b;
        public final /* synthetic */ ComposeView c;
        public final /* synthetic */ dk50 d;
        public final /* synthetic */ mm50 e;

        public a(ComposeView composeView, ComposeView composeView2, dk50 dk50Var, mm50 mm50Var) {
            this.b = composeView;
            this.c = composeView2;
            this.d = dk50Var;
            this.e = mm50Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.b.removeOnAttachStateChangeListener(this);
            this.c.setContent(new jai(1613169786, new b(this.d, this.e), true));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
