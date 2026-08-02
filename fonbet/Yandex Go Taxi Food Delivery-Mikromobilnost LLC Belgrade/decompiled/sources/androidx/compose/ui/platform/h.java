package androidx.compose.ui.platform;

import defpackage.i1k;
import defpackage.o1k;

/* loaded from: classes.dex */
public final class h implements i1k {
    public final /* synthetic */ o1k a;

    public h(o1k o1kVar) {
        this.a = o1kVar;
    }

    @Override // defpackage.i1k
    public final void dispose() {
        ((DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1) this.a.b).invoke();
    }
}
