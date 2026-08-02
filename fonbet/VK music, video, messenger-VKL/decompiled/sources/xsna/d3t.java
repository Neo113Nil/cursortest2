package xsna;

import android.os.Bundle;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.mediastore.system.MediaStoreEntry;
import kotlin.LazyThreadSafetyMode;
import xsna.t4p;

/* compiled from: GalleryCollageDelegate.kt */
/* loaded from: classes15.dex */
public final class d3t implements t4p {
    public final Object a;
    public final /* synthetic */ e3t b;
    public final /* synthetic */ wzs<MediaStoreEntry, Bundle, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public d3t(e3t e3tVar, wzs<? super MediaStoreEntry, ? super Bundle, s3q0> wzsVar) {
        this.b = e3tVar;
        this.c = wzsVar;
        this.a = msy.a(LazyThreadSafetyMode.NONE, new mag(e3tVar, 23));
    }

    @Override // xsna.t4p
    public final void a(t4p.a aVar) {
        Bundle bundle;
        GalleryFragmentImpl.e eVar = this.b.a;
        if (aVar instanceof t4p.a.b) {
            t4p.a.b bVar = (t4p.a.b) aVar;
            Object obj = bVar.b;
            r4p r4pVar = obj instanceof r4p ? (r4p) obj : null;
            g5p g5pVar = r4pVar != null ? r4pVar.b.get(y2g.a) : null;
            w1g w1gVar = g5pVar instanceof w1g ? (w1g) g5pVar : null;
            if (w1gVar != null) {
                bundle = new Bundle();
                bundle.putString("COLLAGE_JSON", w1gVar.toString());
            } else {
                bundle = null;
            }
            GalleryFragmentImpl.this.P0 = bundle;
            this.c.invoke(bVar.a, bundle);
        } else {
            GalleryFragmentImpl.this.P0 = null;
        }
        Object a = eVar.a();
        em6 em6Var = a != null ? (em6) a : null;
        if (em6Var != null) {
            em6Var.c();
        }
        GalleryFragmentImpl.this.A0 = null;
    }

    @Override // xsna.t4p
    public final boolean b() {
        return true;
    }

    public final com.vk.core.simplescreen.a c() {
        GalleryFragmentImpl galleryFragmentImpl = GalleryFragmentImpl.this;
        int i = GalleryFragmentImpl.R0;
        return galleryFragmentImpl.go();
    }
}
