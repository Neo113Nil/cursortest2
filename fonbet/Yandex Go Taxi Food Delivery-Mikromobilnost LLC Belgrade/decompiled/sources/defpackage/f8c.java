package defpackage;

import android.content.Context;

/* loaded from: classes13.dex */
public final class f8c implements v7p {
    public final /* synthetic */ int a = 1;
    public final x4g b;

    public f8c(x4g x4gVar) {
        this.b = x4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        x4g x4gVar = this.b;
        switch (i) {
            case 0:
                return new e8c((Context) x4gVar.get());
            default:
                return new jsj((Context) x4gVar.get());
        }
    }

    public f8c(rsj rsjVar, x4g x4gVar) {
        this.b = x4gVar;
    }
}
