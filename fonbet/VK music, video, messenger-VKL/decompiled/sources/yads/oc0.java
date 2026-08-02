package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class oc0 implements o30 {
    public final Context a;
    public final o30 b;

    public oc0(Context context, o30 o30Var) {
        this.a = context.getApplicationContext();
        this.b = o30Var;
    }

    @Override // yads.o30
    public final p30 createDataSource() {
        return new pc0(this.a, this.b.createDataSource());
    }
}
