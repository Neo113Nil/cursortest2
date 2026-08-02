package xsna;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vkm implements Callable {
    public final /* synthetic */ wkm b;
    public final /* synthetic */ com.vk.im.engine.models.dialogs.c c;

    public /* synthetic */ vkm(wkm wkmVar, com.vk.im.engine.models.dialogs.c cVar) {
        this.b = wkmVar;
        this.c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.b.a(this.c);
    }
}
