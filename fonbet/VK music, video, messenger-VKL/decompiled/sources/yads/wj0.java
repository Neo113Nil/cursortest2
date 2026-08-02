package yads;

import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class wj0 {
    public final uj0 a;

    public wj0() {
        int maxMemory = ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
        this.a = new uj0(maxMemory > 10240 ? 10240 : maxMemory);
    }

    public final vj0 a(String str) {
        return (vj0) this.a.get(str);
    }

    public final void a(String str, Drawable drawable, v41 v41Var) {
        this.a.put(str, new vj0(drawable, v41Var));
    }
}
