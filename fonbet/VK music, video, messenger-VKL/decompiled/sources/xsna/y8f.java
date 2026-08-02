package xsna;

import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class y8f implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        ClipsDraftPersistentStore.b.getClass();
        Future o = ClipsDraftPersistentStore.o(null);
        if (o != null) {
            o.get();
        }
        ClipsDraftPersistentStore.c(false);
        ClipsDraftPersistentStore.t();
        return EmptyList.b;
    }
}
