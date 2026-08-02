package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.external_service.view.ExternalServiceModalView;
import defpackage.hst;
import defpackage.jst;
import defpackage.uzf;
import defpackage.x1p;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public final class j1p {
    public final t5e a = new t5e(this);

    public final void a(i1p i1pVar, final String str) {
        final uzf uzfVar = (uzf) i1pVar;
        final ExternalServiceModalView externalServiceModalView = (ExternalServiceModalView) uzfVar.f0.get();
        WeakHashMap weakHashMap = b.a;
        if (externalServiceModalView.isAttachedToWindow()) {
            externalServiceModalView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.go.external_service.view.ExternalServiceComponentCache$destroyComponentOnDetach$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    externalServiceModalView.removeOnAttachStateChangeListener(this);
                    hst hstVar = jst.e;
                    this.getClass();
                    hstVar.getClass();
                    ((x1p) ((uzf) uzfVar).g.get()).b.g(Lifecycle.Event.ON_DESTROY);
                }
            });
        } else {
            jst.e.getClass();
            ((x1p) uzfVar.g.get()).b.g(Lifecycle.Event.ON_DESTROY);
        }
    }
}
