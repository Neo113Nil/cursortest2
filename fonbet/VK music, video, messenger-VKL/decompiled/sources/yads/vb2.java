package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class vb2 implements ag0 {
    public final int a;

    public vb2(int i) {
        this.a = i;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        return this.a == context.getResources().getConfiguration().orientation;
    }
}
