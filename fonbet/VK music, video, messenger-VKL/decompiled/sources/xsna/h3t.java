package xsna;

import android.content.Context;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.lists.c;
import com.vk.mediastore.system.AlbumEntry;
import com.vk.mediastore.system.MediaStoreEntry;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.EmptyList;

/* compiled from: GalleryDataProvider.kt */
/* loaded from: classes15.dex */
public final class h3t implements c.l<List<? extends MediaStoreEntry>> {
    public final io.reactivex.rxjava3.disposables.b b;
    public final wje c;
    public final int d;
    public final GalleryFragmentImpl.c e;
    public final v3t f;
    public final boolean g;
    public final boolean h;
    public final Context j;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public List<? extends MediaStoreEntry> i = EmptyList.b;
    public boolean k = true;

    public h3t(Context context, io.reactivex.rxjava3.disposables.b bVar, wje wjeVar, int i, GalleryFragmentImpl.c cVar, v3t v3tVar, boolean z, boolean z2) {
        this.b = bVar;
        this.c = wjeVar;
        this.d = i;
        this.e = cVar;
        this.f = v3tVar;
        this.g = z;
        this.h = z2;
        this.j = context.getApplicationContext();
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.l = emptyDisposable;
        this.m = emptyDisposable;
    }

    @Override // com.vk.lists.c.k
    public final void X5(io.reactivex.rxjava3.core.q qVar, com.vk.lists.c cVar) {
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = qVar.a0(asu0.i()).U(new ai3(this.c, 22)).a0(asu0Var.d()).subscribe(new mf1(new com.vk.movika.sdk.base.logic.interactor.i(12, cVar, this), 27), new ubq(new t9e(this, 22), 4), new vdq(this, 2));
        this.b.b(subscribe);
        this.m = subscribe;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<MediaStoreEntry>> hj(com.vk.lists.c cVar, boolean z) {
        int parseInt;
        int i;
        GalleryFragmentImpl.c cVar2 = this.e;
        boolean z2 = this.h;
        if (!z2) {
            this.l.dispose();
            this.m.dispose();
            this.k = true;
            cVar2.d(true);
            this.i = EmptyList.b;
            cVar.r(false);
            return ui(0, cVar);
        }
        this.l.dispose();
        this.m.dispose();
        this.k = true;
        this.i = EmptyList.b;
        cVar2.d(true);
        if (z2) {
            if (j5t.b < 0) {
                j5t.b = Preference.j().getInt("camera_gallery_offset", 0);
            }
            parseInt = j5t.b;
        } else {
            parseInt = Integer.parseInt("0");
        }
        cVar.q(parseInt);
        if (z2) {
            if (j5t.b < 0) {
                j5t.b = Preference.j().getInt("camera_gallery_offset", 0);
            }
            i = j5t.b;
        } else {
            i = 0;
        }
        if (cVar.f) {
            cVar.d.j(i);
        }
        cVar.r(false);
        final int i2 = cVar.i();
        bpn0 bpn0Var = iz10.a;
        final yz10 a = iz10.a(this.j);
        AlbumEntry albumEntry = (AlbumEntry) this.f.get();
        final int i3 = albumEntry != null ? albumEntry.b : -2;
        final int i4 = this.d;
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.qz10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(i2 < yz10.this.a.c(i3, i4));
            }
        });
        asu0 asu0Var = asu0.a;
        return new io.reactivex.rxjava3.internal.operators.mixed.q(vVar.q(asu0Var.c()).m(asu0Var.d()).l(new rt0(new g3t(i2), 15)), new bk1(new v74(15, cVar, this), 17));
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends MediaStoreEntry>> ri(int i, int i2, com.vk.lists.c cVar) {
        boolean z = this.g;
        v3t v3tVar = this.f;
        Context context = this.j;
        if (!z) {
            yz10 a = iz10.a(context);
            AlbumEntry albumEntry = (AlbumEntry) v3tVar.get();
            return a.d(this.d, albumEntry != null ? albumEntry.b : -2, i, i2).w();
        }
        yz10 a2 = iz10.a(context);
        AlbumEntry albumEntry2 = (AlbumEntry) v3tVar.get();
        io.reactivex.rxjava3.core.q a3 = hz10.a(a2, this.d, albumEntry2 != null ? albumEntry2.b : -2, i, i2, 16);
        asu0 asu0Var = asu0.a;
        return a3.r0(asu0Var.c()).a0(asu0Var.d());
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends MediaStoreEntry>> ui(int i, com.vk.lists.c cVar) {
        boolean z = this.g;
        v3t v3tVar = this.f;
        Context context = this.j;
        if (!z) {
            yz10 a = iz10.a(context);
            AlbumEntry albumEntry = (AlbumEntry) v3tVar.get();
            return a.d(this.d, albumEntry != null ? albumEntry.b : -2, i, cVar.k()).w();
        }
        yz10 a2 = iz10.a(context);
        AlbumEntry albumEntry2 = (AlbumEntry) v3tVar.get();
        io.reactivex.rxjava3.core.q a3 = hz10.a(a2, this.d, albumEntry2 != null ? albumEntry2.b : -2, i, 0, 24);
        asu0 asu0Var = asu0.a;
        return a3.r0(asu0Var.c()).a0(asu0Var.d());
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<MediaStoreEntry>> qVar, boolean z, com.vk.lists.c cVar) {
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        int i = 1;
        io.reactivex.rxjava3.disposables.c subscribe = qVar.a0(asu0.i()).U(new g7(this.c, 19)).a0(asu0Var.d()).subscribe(new tf(new ii3(this, cVar, z), 26), new afs(new v6k(this, z, i), i), new dh1(this, 4));
        this.b.b(subscribe);
        this.l = subscribe;
    }
}
