package xsna;

import com.vk.attachpicker.b;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoriesSelectionCallback.kt */
/* loaded from: classes15.dex */
public final class tul0 implements b.c {
    public final com.vk.attachpicker.b a;
    public final kfi0 b;
    public final q3t c;
    public final h4t d;
    public final pvh e;
    public final b4t f;
    public final yf7 g;
    public boolean h;

    public tul0(com.vk.attachpicker.b bVar, kfi0 kfi0Var, q3t q3tVar, h4t h4tVar, pvh pvhVar, b4t b4tVar, yf7 yf7Var) {
        this.a = bVar;
        this.b = kfi0Var;
        this.c = q3tVar;
        this.d = h4tVar;
        this.e = pvhVar;
        this.f = b4tVar;
        this.g = yf7Var;
    }

    @Override // com.vk.attachpicker.b.c
    public final void a(int i, MediaStoreEntry mediaStoreEntry) {
        StoriesFeatures storiesFeatures = StoriesFeatures.COLLAGES_UPDATE;
        storiesFeatures.getClass();
        if (!com.vk.toggle.b.A.a(storiesFeatures) && (mediaStoreEntry instanceof MediaStoreVideoEntry) && !this.h) {
            this.f.invoke(Integer.valueOf(R.string.collage_with_video_message), null);
            this.h = true;
        }
        boolean booleanValue = ((Boolean) this.d.get()).booleanValue();
        this.c.f(i, mediaStoreEntry.f(), booleanValue);
    }

    @Override // com.vk.attachpicker.b.c
    public final void b(int i, List<Integer> list) {
        if (i == 0) {
            this.b.d(false);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.g.invoke(it.next());
        }
    }

    @Override // com.vk.attachpicker.b.c
    public final boolean c(MediaStoreEntry mediaStoreEntry) {
        boolean z = this.a.k() < 5;
        if (!z) {
            this.e.invoke();
        }
        return z;
    }

    @Override // com.vk.attachpicker.b.c
    public final void d(MediaStoreEntry mediaStoreEntry) {
        this.c.g(mediaStoreEntry.f());
    }
}
