package xsna;

import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: GalleryState.kt */
/* loaded from: classes4.dex */
public class ouz extends q4t {
    public final MediaStoreEntry a;
    public final String b;
    public final long c;

    public ouz(MediaStoreEntry mediaStoreEntry) {
        this.a = mediaStoreEntry;
        this.b = mediaStoreEntry.f().toString();
        this.c = r3.hashCode();
    }

    @Override // xsna.q4t
    public final String a() {
        return this.b;
    }

    @Override // xsna.q4t
    public final int b() {
        return this.a.getHeight();
    }

    @Override // xsna.q4t
    public final long c() {
        return this.c;
    }

    @Override // xsna.q4t
    public final String d() {
        return this.b;
    }

    @Override // xsna.q4t
    public final int e() {
        return this.a.getWidth();
    }
}
