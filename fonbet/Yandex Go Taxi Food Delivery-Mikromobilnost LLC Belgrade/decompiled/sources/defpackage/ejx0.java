package defpackage;

import android.view.View;
import androidx.core.view.b;
import defpackage.u6s0;
import defpackage.ukv0;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class ejx0 {
    public final eh2 a;

    public ejx0(eh2 eh2Var) {
        this.a = eh2Var;
    }

    public final void a(final zjj0 zjj0Var, final View view, final int i) {
        WeakHashMap weakHashMap = b.a;
        if (!view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.common.TariffOptionsShowRequirementsInteractor$showTariffRequirements$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view.removeOnAttachStateChangeListener(this);
                    ukv0.c(this.a, view.getHandler(), new u6s0(5, view), zjj0Var, i);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
            return;
        }
        ukv0.c(this.a, view.getHandler(), new u6s0(5, view), zjj0Var, i);
    }
}
