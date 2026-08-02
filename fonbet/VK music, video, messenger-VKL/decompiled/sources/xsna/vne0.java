package xsna;

import android.net.Uri;
import android.os.Parcelable;
import com.google.zxing.Result;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.mediastore.system.MediaStoreEntry;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class vne0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Parcelable e;
    public final /* synthetic */ Comparable f;

    public /* synthetic */ vne0(Object obj, Parcelable parcelable, int i, Comparable comparable, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = parcelable;
        this.c = i;
        this.f = comparable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xne0 xne0Var = (xne0) this.d;
                MediaStoreEntry mediaStoreEntry = (MediaStoreEntry) this.e;
                int i = this.c;
                Uri uri = (Uri) this.f;
                it80 it80Var = (it80) obj;
                ikv0 ikv0Var = xne0Var.i;
                if (ikv0Var != null) {
                    ikv0Var.a();
                }
                if (mediaStoreEntry != null) {
                    mediaStoreEntry.i = false;
                }
                if (i != -1) {
                    xne0Var.d.notifyItemChanged(i);
                }
                nne0 nne0Var = (nne0) it80Var.a;
                ArrayList arrayList = nne0Var != null ? nne0Var.a : null;
                if (arrayList == null || arrayList.isEmpty()) {
                    xne0Var.d();
                } else if (arrayList.size() == 1) {
                    xne0Var.c(new rne0((Result) j5g.Y(arrayList), nne0Var.b));
                } else {
                    int K0 = i >= 0 ? i - xne0Var.d.K0() : -1;
                    o4t o4tVar = ((GalleryFragmentImpl) xne0Var.e.c).g0;
                    if (o4tVar != null) {
                        o4t o4tVar2 = o4tVar.isShowing() ? null : o4tVar;
                        if (o4tVar2 != null) {
                            o4tVar2.a(uri, nne0Var, K0, new wg1(xne0Var, 16));
                        }
                    }
                }
                break;
            default:
                uvm0 uvm0Var = (uvm0) this.d;
                ClipsAuthor clipsAuthor = (ClipsAuthor) this.e;
                int i2 = this.c;
                Long l = (Long) this.f;
                uvm0Var.b(true);
                clipsAuthor.f = i2;
                uvm0Var.f(clipsAuthor);
                clipsAuthor.n(l);
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
