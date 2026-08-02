package yads;

import android.view.TextureView;

/* loaded from: classes10.dex */
public final class h82 {
    public final q62 a;

    public h82(q62 q62Var) {
        this.a = q62Var;
    }

    public final void a(g82 g82Var) {
        TextureView textureView = g82Var.b;
        this.a.a(textureView);
        textureView.setVisibility(0);
        g82Var.c.setVisibility(0);
        g82Var.a.setVisibility(0);
    }

    public final void b(g82 g82Var) {
        TextureView textureView = g82Var.b;
        this.a.a((TextureView) null);
        textureView.setVisibility(8);
        g82Var.c.setVisibility(8);
        g82Var.a.setVisibility(8);
    }
}
