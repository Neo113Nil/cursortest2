package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.CustomSpinner;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import com.vk.mediastore.system.AlbumEntry;
import java.lang.ref.WeakReference;

/* compiled from: AlbumsAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class fm1 {
    public final int a;
    public final boolean b;
    public final GalleryFragmentImpl.a c;
    public int d;
    public final gj1 e;
    public WeakReference<CustomSpinner> f = new WeakReference<>(null);
    public int g;

    public fm1(Context context, int i, boolean z, GalleryFragmentImpl.a aVar, hj1 hj1Var) {
        this.a = i;
        this.b = z;
        this.c = aVar;
        this.e = new gj1(context, hj1Var);
    }

    public final void a(CustomSpinner customSpinner) {
        gj1 gj1Var = this.e;
        gj1Var.e = customSpinner;
        customSpinner.setAdapter((SpinnerAdapter) gj1Var);
        customSpinner.setVisibility(0);
        customSpinner.setOnItemSelectedListener(new a(customSpinner));
        WeakReference<CustomSpinner> weakReference = new WeakReference<>(customSpinner);
        this.f = weakReference;
        CustomSpinner customSpinner2 = weakReference.get();
        if (customSpinner2 != null) {
            customSpinner2.setSelection(this.g);
        }
    }

    public final AlbumEntry b() {
        gj1 gj1Var = this.e;
        int size = gj1Var.d.size();
        int i = this.d;
        if (size <= i) {
            gj1Var = null;
        }
        if (gj1Var != null) {
            return gj1Var.d.get(i);
        }
        return null;
    }

    /* compiled from: AlbumsAdapterDelegate.kt */
    public final class a implements AdapterView.OnItemSelectedListener {
        public final CustomSpinner b;
        public int c;
        public AlbumEntry d;

        public a(CustomSpinner customSpinner) {
            this.b = customSpinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            RecyclerView recyclerView;
            fm1 fm1Var = fm1.this;
            GalleryFragmentImpl.a aVar = fm1Var.c;
            try {
                fm1Var.d = i;
                AlbumEntry albumEntry = fm1Var.e.d.get(i);
                boolean equals = albumEntry.equals(gj1.f);
                CustomSpinner customSpinner = this.b;
                if (equals) {
                    customSpinner.setSelection(this.c);
                    GalleryFragmentImpl galleryFragmentImpl = aVar.a.h;
                    Intent intent = new Intent();
                    intent.setType("image/*");
                    intent.setAction("android.intent.action.GET_CONTENT");
                    galleryFragmentImpl.startActivityForResult(Intent.createChooser(intent, "Select Picture"), 2);
                    return;
                }
                if (albumEntry.equals(gj1.g)) {
                    customSpinner.setSelection(this.c);
                    GalleryFragmentImpl galleryFragmentImpl2 = aVar.a.h;
                    Intent intent2 = new Intent();
                    intent2.setType("video/*");
                    intent2.setAction("android.intent.action.GET_CONTENT");
                    galleryFragmentImpl2.startActivityForResult(Intent.createChooser(intent2, "Select Video"), 3);
                    return;
                }
                AlbumEntry albumEntry2 = this.d;
                if (albumEntry2 == null || albumEntry2.b != albumEntry.b) {
                    GalleryFragmentImpl galleryFragmentImpl3 = GalleryFragmentImpl.this;
                    PhotoSmallAdapter photoSmallAdapter = galleryFragmentImpl3.c0;
                    if (photoSmallAdapter != null) {
                        photoSmallAdapter.N0(albumEntry.d);
                    }
                    GalleryRecyclerView galleryRecyclerView = galleryFragmentImpl3.a0;
                    if (galleryRecyclerView != null && (recyclerView = galleryRecyclerView.getRecyclerView()) != null) {
                        recyclerView.scrollToPosition(0);
                    }
                    galleryFragmentImpl3.m0 = albumEntry.f;
                    com.vk.lists.c cVar = galleryFragmentImpl3.f0;
                    if (cVar != null) {
                        cVar.o();
                    }
                    com.vk.lists.c cVar2 = galleryFragmentImpl3.f0;
                    if (cVar2 != null) {
                        cVar2.p(false);
                    }
                }
                this.c = i;
                this.d = albumEntry;
            } catch (Exception e) {
                com.vk.metrics.eventtracking.b.a.q(e);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }
}
