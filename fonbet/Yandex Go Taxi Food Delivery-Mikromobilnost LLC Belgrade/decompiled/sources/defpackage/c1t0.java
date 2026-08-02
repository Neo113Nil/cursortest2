package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class c1t0 implements zo31 {
    public final /* synthetic */ int a;
    public final View b;

    public c1t0(ViewGroup viewGroup) {
        this.a = 0;
        View view = new View(viewGroup.getContext());
        x4e.y(-1, -1, view);
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ c1t0(View view, int i) {
        this.a = i;
        this.b = view;
    }
}
