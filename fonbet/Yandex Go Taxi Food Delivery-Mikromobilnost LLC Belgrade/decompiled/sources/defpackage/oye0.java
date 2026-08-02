package defpackage;

import android.content.Context;

/* loaded from: classes12.dex */
public final class oye0 implements v7p {
    public final /* synthetic */ int a;
    public final t0g b;

    public /* synthetic */ oye0(t0g t0gVar, int i) {
        this.a = i;
        this.b = t0gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        t0g t0gVar = this.b;
        switch (i) {
            case 0:
                return new abe((Context) t0gVar.get(), false, false);
            default:
                return new tct0((Context) t0gVar.get());
        }
    }
}
