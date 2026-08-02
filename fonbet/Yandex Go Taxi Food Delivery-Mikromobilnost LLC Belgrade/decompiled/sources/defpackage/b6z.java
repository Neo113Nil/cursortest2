package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class b6z implements i231 {
    public final /* synthetic */ int a;
    public final zuj0 b;

    public /* synthetic */ b6z(zuj0 zuj0Var, int i) {
        this.a = i;
        this.b = zuj0Var;
    }

    @Override // defpackage.i231
    public final c231 create() {
        switch (this.a) {
            case 0:
                return new z131("strings.common_back", ((avj0) this.b).h(kyh0.common_back));
            case 1:
                return new y131("superapp.navigation_shortcuts_padding.horizontal", (long) vez0.R(((avj0) this.b).b(ktg0.shortcuts_horizontal_paddings), Resources.getSystem().getDisplayMetrics()));
            default:
                return new y131("superapp.images.size_hint", ((avj0) this.b).j());
        }
    }
}
