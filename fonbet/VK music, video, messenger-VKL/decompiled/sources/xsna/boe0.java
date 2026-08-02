package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.mediastore.system.MediaStoreEntry;

/* compiled from: QrSelectionTouchListener.kt */
/* loaded from: classes15.dex */
public final class boe0 extends kfi0 {
    public final zne0 C;

    public boe0(RecyclerView recyclerView, com.vk.attachpicker.b bVar, t4t t4tVar, h7v h7vVar, q3t q3tVar, zne0 zne0Var, PhotoSmallAdapter photoSmallAdapter) {
        super(recyclerView, bVar, t4tVar.j, t4tVar.v, h7vVar, q3tVar, photoSmallAdapter);
        this.C = zne0Var;
    }

    @Override // xsna.kfi0
    public final void y(int i, MediaStoreEntry mediaStoreEntry) {
        String path = mediaStoreEntry.f().getPath();
        if (path == null || path.length() == 0 || hg1.d(this.C.a())) {
            return;
        }
        mediaStoreEntry.i = true;
        this.B.notifyItemChanged(i);
        this.C.b(mediaStoreEntry.f(), mediaStoreEntry, i);
        this.A.d(mediaStoreEntry.f());
    }
}
