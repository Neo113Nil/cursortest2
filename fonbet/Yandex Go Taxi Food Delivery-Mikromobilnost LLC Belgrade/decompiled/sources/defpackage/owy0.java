package defpackage;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.r;
import com.yandex.go.image.domain.requests.ThemeSwitcherListener$onAttachStateChangeListener$1;
import defpackage.owy0;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes12.dex */
public final class owy0 {
    public final View a;
    public sls b;
    public pzt0 c;
    public final ThemeSwitcherListener$onAttachStateChangeListener$1 d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.go.image.domain.requests.ThemeSwitcherListener$onAttachStateChangeListener$1] */
    public owy0(View view, final pwy0 pwy0Var, final Lifecycle lifecycle, sls slsVar) {
        this.a = view;
        this.b = slsVar;
        ?? r4 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.image.domain.requests.ThemeSwitcherListener$onAttachStateChangeListener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                owy0.this.c = tje.N(r.a(lifecycle), null, null, new ThemeSwitcherListener$onAttachStateChangeListener$1$onViewAttachedToWindow$1(pwy0Var, owy0.this, null), 3);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
                pzt0 pzt0Var = owy0.this.c;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
            }
        };
        this.d = r4;
        view.setTag(pih0.image_view_tag_theme_switcher_listener, this);
        view.addOnAttachStateChangeListener(r4);
    }

    public final void a() {
        pzt0 pzt0Var = this.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        ThemeSwitcherListener$onAttachStateChangeListener$1 themeSwitcherListener$onAttachStateChangeListener$1 = this.d;
        View view = this.a;
        view.removeOnAttachStateChangeListener(themeSwitcherListener$onAttachStateChangeListener$1);
        view.setTag(pih0.image_view_tag_theme_switcher_listener, null);
    }
}
