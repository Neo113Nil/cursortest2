package xsna;

import android.view.View;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import xsna.u7n0;

/* compiled from: UniWidgetConstructor.kt */
/* loaded from: classes6.dex */
public final class l3q0 {
    public static final void a(final View view, final WebAction webAction, final u7n0.a aVar, final u7n0 u7n0Var) {
        view.setOnClickListener(new View.OnClickListener() { // from class: xsna.k3q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                WebAction webAction2 = webAction;
                if (webAction2 == null) {
                    return;
                }
                u7n0Var.u0(view.getContext(), aVar, webAction2);
            }
        });
    }
}
