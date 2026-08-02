package xsna;

import com.vk.attachpicker.b;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.preview.presentation.GalleryPickerInitialData;
import java.util.Iterator;
import java.util.List;

/* compiled from: ClipsTemplatesSelectionCallback.kt */
/* loaded from: classes15.dex */
public final class h9f implements b.c {
    public final GalleryPickerInitialData a;
    public final com.vk.attachpicker.b b;
    public final kfi0 c;
    public final q3t d;
    public final g4t e;
    public final i4h f;
    public final nef g;
    public final sim h;

    public h9f(GalleryPickerInitialData galleryPickerInitialData, com.vk.attachpicker.b bVar, kfi0 kfi0Var, q3t q3tVar, g4t g4tVar, i4h i4hVar, nef nefVar, sim simVar) {
        this.a = galleryPickerInitialData;
        this.b = bVar;
        this.c = kfi0Var;
        this.d = q3tVar;
        this.e = g4tVar;
        this.f = i4hVar;
        this.g = nefVar;
        this.h = simVar;
    }

    @Override // com.vk.attachpicker.b.c
    public final void a(int i, MediaStoreEntry mediaStoreEntry) {
        boolean booleanValue = ((Boolean) this.e.get()).booleanValue();
        this.d.f(i, mediaStoreEntry.f(), booleanValue);
    }

    @Override // com.vk.attachpicker.b.c
    public final void b(int i, List<Integer> list) {
        if (i == 0) {
            this.c.d(false);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f.invoke(it.next());
        }
    }

    @Override // com.vk.attachpicker.b.c
    public final boolean c(MediaStoreEntry mediaStoreEntry) {
        Integer num;
        com.vk.attachpicker.b bVar = this.b;
        if (bVar.h() <= bVar.k()) {
            this.g.invoke();
            return false;
        }
        if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
            return true;
        }
        long j = ((MediaStoreVideoEntry) mediaStoreEntry).q;
        int k = bVar.k();
        GalleryPickerInitialData galleryPickerInitialData = this.a;
        if (j >= ((galleryPickerInitialData == null || (num = (Integer) j5g.b0(k, galleryPickerInitialData.b)) == null) ? 0 : num.intValue())) {
            return true;
        }
        this.h.invoke();
        return false;
    }

    @Override // com.vk.attachpicker.b.c
    public final void d(MediaStoreEntry mediaStoreEntry) {
        this.d.g(mediaStoreEntry.f());
    }
}
