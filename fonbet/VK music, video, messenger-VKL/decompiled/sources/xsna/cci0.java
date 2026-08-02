package xsna;

import com.vk.attachpicker.b;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.Iterator;
import java.util.List;

/* compiled from: SelectionCallback.kt */
/* loaded from: classes15.dex */
public final class cci0 implements b.c {
    public final kfi0 a;
    public final q3t b;
    public final f4t c;
    public final ysd d;

    public cci0(kfi0 kfi0Var, q3t q3tVar, f4t f4tVar, ysd ysdVar) {
        this.a = kfi0Var;
        this.b = q3tVar;
        this.c = f4tVar;
        this.d = ysdVar;
    }

    @Override // com.vk.attachpicker.b.c
    public final void a(int i, MediaStoreEntry mediaStoreEntry) {
        boolean booleanValue = ((Boolean) this.c.get()).booleanValue();
        this.b.f(i, mediaStoreEntry.f(), booleanValue);
    }

    @Override // com.vk.attachpicker.b.c
    public final void b(int i, List<Integer> list) {
        if (i == 0) {
            this.a.d(false);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.d.invoke(it.next());
        }
    }

    @Override // com.vk.attachpicker.b.c
    public final boolean c(MediaStoreEntry mediaStoreEntry) {
        return true;
    }

    @Override // com.vk.attachpicker.b.c
    public final void d(MediaStoreEntry mediaStoreEntry) {
        this.b.g(mediaStoreEntry.f());
    }
}
