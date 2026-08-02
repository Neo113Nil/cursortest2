package xsna;

import android.os.Bundle;
import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.log.L;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.d;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vk.toggle.anonymous.SakFeatures;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.hg1;
import xsna.kh1;
import xsna.m7a0;
import xsna.qfa0;
import xsna.tlo0;
import xsna.uh1;

/* compiled from: AlbumDetailsFeature.kt */
/* loaded from: classes4.dex */
public final class gg1 extends wk50<com.vk.photos.root.albumdetails.presentation.k, com.vk.photos.root.albumdetails.presentation.j, com.vk.photos.root.albumdetails.presentation.a, com.vk.photos.root.albumdetails.presentation.d> {
    public final s0e0 f;
    public final el1 g;
    public final ch1 h;
    public final PhotoUploadInteractor i;
    public final AlbumsRepository j;
    public final UserId k;
    public final gd60 l;
    public final kdg0 m;
    public final qfa0.b n;
    public final int o;
    public final f4z p;
    public boolean q;
    public io.reactivex.rxjava3.disposables.c r;
    public final th1 s;
    public Integer t;
    public final List<uh1> u;
    public final List<uh1> v;
    public final c w;
    public final qf1 x;

    /* compiled from: AlbumDetailsFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: AlbumDetailsFeature.kt */
    public interface b {
        void a(int i);

        void b();

        void c();
    }

    /* compiled from: AlbumDetailsFeature.kt */
    public static final class c implements b {
        public c() {
        }

        @Override // xsna.gg1.b
        public final void a(int i) {
            tlo0.f h = tq.h(tlo0.Companion, i == 1 ? R.string.album_details_archive_one_photo_success : R.string.album_details_archive_photos_success);
            tlo0.f fVar = new tlo0.f(R.string.photo_archive_go);
            gg1 gg1Var = gg1.this;
            gg1Var.b0(new ic(gg1Var, 3), fVar, h);
        }

        @Override // xsna.gg1.b
        public final void b() {
            tlo0.f h = tq.h(tlo0.Companion, R.string.archive_partial_success);
            tlo0.f fVar = new tlo0.f(R.string.see_photo_move_result);
            gg1 gg1Var = gg1.this;
            gg1Var.Z(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(gg1Var, 2), fVar, h);
        }

        @Override // xsna.gg1.b
        public final void c() {
            tlo0.Companion.getClass();
            gg1.this.Z(null, null, new tlo0.f(R.string.album_details_archive_photo_error));
        }
    }

    /* compiled from: AlbumDetailsFeature.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<com.vk.photos.root.albumdetails.presentation.d, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.photos.root.albumdetails.presentation.d dVar) {
            ((gg1) this.receiver).T(dVar);
            return s3q0.a;
        }
    }

    /* compiled from: RxExt.kt */
    public static final class e implements izs {
        public static final e b = new e();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof cl1);
        }
    }

    /* compiled from: RxExt.kt */
    public static final class f implements izs {
        public static final f b = new f();

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            return Boolean.valueOf(obj instanceof zaa0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [xsna.bd70, xsna.qf1] */
    public gg1(s0e0 s0e0Var, el1 el1Var, ch1 ch1Var, PhotoUploadInteractor photoUploadInteractor, AlbumsRepository albumsRepository, UserId userId, PhotoAlbum photoAlbum, ysg0<m7a0> ysg0Var, gd60 gd60Var, kdg0 kdg0Var, qfa0.b bVar, int i, boolean z) {
        super(a.k.b, new com.vk.photos.root.albumdetails.presentation.h(s0e0Var, el1Var, photoAlbum, userId, i, z));
        this.f = s0e0Var;
        this.g = el1Var;
        this.h = ch1Var;
        this.i = photoUploadInteractor;
        this.j = albumsRepository;
        this.k = userId;
        this.l = gd60Var;
        this.m = kdg0Var;
        this.n = bVar;
        this.o = i;
        f4z f4zVar = new f4z();
        this.p = f4zVar;
        io.reactivex.rxjava3.subjects.f<m7a0> fVar = ysg0Var.a;
        int i2 = 1;
        k7 k7Var = new k7(new yx0(this, i2), i2);
        fVar.getClass();
        int i3 = 2;
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, k7Var).v0(500L, TimeUnit.MILLISECONDS).a0(asu0.a.d()).subscribe(new y50(new dg(this, i3), i2)));
        ysg0<Object> ysg0Var2 = ysg0.b;
        io.reactivex.rxjava3.subjects.f<Object> fVar2 = ysg0Var2.a;
        hg1.a aVar = new hg1.a(e.b);
        fVar2.getClass();
        int i4 = 4;
        int i5 = 0;
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar2, aVar), new rf1(new zx(this, i4), 0)).subscribe(new c60(new sf1(this, i5), i2)));
        this.s = new th1(ch1Var, f4zVar, this.e, new r7(this, i3), new d(1, this, gg1.class, "updateState", "updateState(Lcom/vk/mvi/core/data/MviPatch;)V", 0), bVar);
        int i6 = 3;
        uh1.d dVar = uh1.d.d;
        this.u = e43.l(uh1.j.d, uh1.k.d, uh1.l.d, uh1.h.d, dVar, uh1.i.d);
        this.v = e43.l(uh1.c.d, uh1.e.d, uh1.f.d, dVar, uh1.a.d);
        this.w = new c();
        this.e.b(fVar.subscribe(new nf1(new za(this, i6), i5)));
        io.reactivex.rxjava3.subjects.f<Object> fVar3 = ysg0Var2.a;
        hg1.a aVar2 = new hg1.a(f.b);
        fVar3.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, aVar2), new g7(new com.vk.movika.sdk.base.logic.interactor.p(this, i3), i6)).subscribe(new tf(new ay0(this, i2), i2), new pf1(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), i5)));
        hg1.a aVar3 = new hg1.a(kg1.c);
        fVar3.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, aVar3), new pi0(new com.vk.movika.sdk.base.observable.p(this, 5), i2)).subscribe(new v8(new tb(this, 6), i6));
        io.reactivex.rxjava3.disposables.b bVar2 = this.e;
        bVar2.b(subscribe);
        hg1.a aVar4 = new hg1.a(lg1.c);
        fVar3.getClass();
        bVar2.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar3, aVar4), new dg1(new w8(this, i4), 0)).subscribe(new defpackage.n(new com.vk.movika.sdk.base.observable.w(this, i3), i2)));
        ?? r0 = new bd70() { // from class: xsna.qf1
            @Override // xsna.bd70
            public final void x0(int i7, int i8, Object obj) {
                Photo photo = (Photo) obj;
                gg1 gg1Var = gg1.this;
                if (i7 == 130) {
                    gg1Var.C(new a.b0(photo, true));
                } else {
                    if (i7 != 131) {
                        return;
                    }
                    gg1Var.C(new a.b0(photo, false));
                }
            }
        };
        this.x = r0;
        p870 w = gd60Var.w();
        w.b(130, r0);
        w.b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, r0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:363:0x07a3, code lost:
    
        if (((xsna.m7a0.a) r1).a == r14) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07a5, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x07e9, code lost:
    
        if (((xsna.m7a0.e) r1).a == r14) goto L345;
     */
    @Override // xsna.wk50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(com.vk.photos.root.albumdetails.presentation.j jVar, com.vk.photos.root.albumdetails.presentation.a aVar) {
        boolean contains;
        ArrayList arrayList;
        int size;
        String str;
        com.vk.photos.root.albumdetails.presentation.j jVar2 = jVar;
        com.vk.photos.root.albumdetails.presentation.a aVar2 = aVar;
        int i = jVar2.m;
        VKList<Photo> vKList = jVar2.b;
        UserId userId = jVar2.f;
        PhotoAlbum photoAlbum = jVar2.l;
        boolean z = jVar2.j;
        if (aVar2.equals(a.k.b)) {
            T(d.c.b);
            return;
        }
        if (aVar2 instanceof a.q) {
            a.q qVar = (a.q) aVar2;
            boolean z2 = qVar.c;
            VKList<Photo> vKList2 = qVar.b;
            if (z2) {
                T(new d.i(vKList2));
                return;
            } else {
                T(new d.e(vKList2));
                return;
            }
        }
        boolean z3 = aVar2 instanceof a.r;
        f4z f4zVar = this.p;
        if (z3) {
            a.r rVar = (a.r) aVar2;
            Throwable th = rVar.b;
            if (th instanceof VKApiExecutionException) {
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                if (vKApiExecutionException.T() && SakFeatures.Type.NEW_GEOBLOCK_ERROR.h()) {
                    Bundle w = vKApiExecutionException.w();
                    long j = w != null ? w.getLong("owner_id") : 0L;
                    if (j != 0) {
                        f4zVar.b(new i.d(new UserId(j)));
                        s3q0 s3q0Var = s3q0.a;
                        return;
                    }
                    return;
                }
            }
            T(new d.C1483d(th, rVar.c));
            return;
        }
        boolean z4 = aVar2 instanceof a.p;
        int i2 = 2;
        UserId userId2 = this.k;
        AlbumsRepository albumsRepository = this.j;
        int i3 = this.o;
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        int i4 = 1;
        if (z4) {
            boolean z5 = ((a.p) aVar2).b;
            T(new d.f(z5));
            if (z5) {
                io.reactivex.rxjava3.disposables.c cVar = this.r;
                if (cVar != null) {
                    cVar.dispose();
                }
                io.reactivex.rxjava3.disposables.c subscribe = albumsRepository.a(i3, userId2).subscribe(new h60(new a8(this, i2), i4), new xf1(new com.vk.movika.sdk.base.observable.a(this, 3), 0));
                bVar.b(subscribe);
                this.r = subscribe;
                return;
            }
            return;
        }
        boolean z6 = aVar2 instanceof a.s;
        qfa0.b bVar2 = this.n;
        if (z6) {
            Photo photo = ((a.s) aVar2).b;
            if (z && this.f.a(userId)) {
                T(new d.k(photo));
                return;
            }
            bVar2.a(photo.c);
            if (vKList == null) {
                return;
            }
            Iterator<Photo> it = vKList.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i5 = -1;
                    break;
                } else if (it.next().c == photo.c) {
                    break;
                } else {
                    i5++;
                }
            }
            f4zVar.b(new i.g(i5, vKList));
            return;
        }
        if (aVar2 instanceof a.t) {
            a.t tVar = (a.t) aVar2;
            if (z) {
                return;
            }
            Photo photo2 = tVar.b;
            bVar2.d(photo2);
            List<uh1> list = this.u;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (U(jVar2, (uh1) obj, photo2)) {
                    arrayList2.add(obj);
                }
            }
            f4zVar.b(new i.q(arrayList2, tVar.c, photo2));
            return;
        }
        if (aVar2.equals(a.l.b)) {
            T(d.b.b);
            return;
        }
        if (aVar2 instanceof a.w) {
            a.w wVar = (a.w) aVar2;
            th1 th1Var = this.s;
            f4z f4zVar2 = th1Var.b;
            qfa0.b bVar3 = th1Var.f;
            Photo photo3 = wVar.c;
            uh1 uh1Var = wVar.b;
            if (epx.f(uh1Var, uh1.d.d)) {
                d dVar = th1Var.e;
                if (!z) {
                    if (photo3 != null) {
                        bVar3.n(photo3.c);
                    } else {
                        bVar3.h(i);
                    }
                    if (photo3 != null) {
                        dVar.invoke(new d.j(photo3));
                    }
                    dVar.invoke(d.a.b);
                }
            } else if (epx.f(uh1Var, uh1.j.d)) {
                if (z) {
                    List<Photo> b2 = jVar2.b(null);
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<T> it2 = b2.iterator();
                    while (it2.hasNext()) {
                        String str2 = ((Photo) it2.next()).t;
                        if (str2 != null) {
                            arrayList3.add(str2);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        bVar3.f(b2);
                        f4zVar2.b(new i.b.a(arrayList3));
                    }
                } else if (photo3 != null && (str = photo3.t) != null) {
                    bVar3.f(Collections.singletonList(photo3));
                    f4zVar2.b(new i.b.C1484b(str));
                }
            } else if (epx.f(uh1Var, uh1.e.d)) {
                if (photoAlbum != null) {
                    bVar3.g(photoAlbum.b);
                    f4zVar2.b(new i.l(photoAlbum));
                }
            } else if (epx.f(uh1Var, uh1.f.d)) {
                if (photoAlbum != null) {
                    bVar3.o(photoAlbum.b);
                    th1Var.c.b(th1Var.a.b().subscribe(new sh1(th1Var, 0)));
                }
            } else if (epx.f(uh1Var, uh1.b.d)) {
                bVar3.q(i);
            } else if (epx.f(uh1Var, uh1.a.d)) {
                if (photoAlbum != null) {
                    f4zVar2.b(new i.n(tq.h(tlo0.Companion, R.string.delete_album_dialog_title), new tlo0.f((!photoAlbum.x || photoAlbum.w) ? R.string.delete_album_dialog_description : R.string.delete_album_dialog_description_flow), new tlo0.f(R.string.album_details_delete_album_confirmation_button), i.n.a.b.a));
                }
            } else if (epx.f(uh1Var, uh1.i.d)) {
                if (photo3 != null) {
                    bVar3.k(Collections.singletonList(photo3));
                    f4zVar2.b(new i.n(tq.h(tlo0.Companion, R.string.photos_delete_single_title), new tlo0.f(R.string.photos_delete_single_message), new tlo0.f(R.string.album_details_delete_photo_confirmation_button), new i.n.a.d(photo3)));
                }
            } else if (uh1Var instanceof uh1.g.a) {
                th1Var.a(jVar2, wVar);
            } else if (epx.f(uh1Var, uh1.c.d)) {
                if (photoAlbum != null) {
                    bVar3.b(photoAlbum.b);
                    f4zVar2.b(new i.c(photoAlbum));
                }
            } else if (uh1Var instanceof uh1.g.b) {
                if (z && (size = jVar2.h.size()) > 0) {
                    bVar3.k(jVar2.b(null));
                    tlo0.a aVar3 = tlo0.Companion;
                    Object[] objArr = {Integer.valueOf(size)};
                    aVar3.getClass();
                    f4zVar2.b(new i.n(tlo0.a.a(R.plurals.photos_delete_multiple_title2, size, objArr), new tlo0.f(R.string.photos_delete_multiple_message), new tlo0.f(R.string.album_details_delete_photo_confirmation_button), i.n.a.c.a));
                }
            } else if (epx.f(uh1Var, uh1.l.d)) {
                if (!z && photo3 != null) {
                    bVar3.j(Collections.singletonList(photo3));
                    f4zVar2.b(new i.m(photo3));
                }
            } else if (epx.f(uh1Var, uh1.h.d)) {
                th1Var.a(jVar2, wVar);
            } else {
                if (!epx.f(uh1Var, uh1.k.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<Photo> b3 = jVar2.b(photo3);
                f4zVar2.b(new i.s(b3));
                bVar3.c(b3);
            }
            s3q0 s3q0Var2 = s3q0.a;
            return;
        }
        if (aVar2 instanceof a.e) {
            a.e eVar = (a.e) aVar2;
            if (z) {
                arrayList = V(jVar2);
            } else {
                bVar2.e(i);
                List<uh1> list2 = this.v;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    if (U(jVar2, (uh1) obj2, null)) {
                        arrayList4.add(obj2);
                    }
                }
                arrayList = arrayList4;
            }
            f4zVar.b(new i.q(arrayList, eVar.b, null));
            return;
        }
        if (aVar2 instanceof a.j) {
            a.j jVar3 = (a.j) aVar2;
            if (jVar3 instanceof a.j.b.C1481b) {
                b0(null, null, hq.b(tlo0.Companion, R.plurals.download_photos_success, 1));
                return;
            }
            if (jVar3 instanceof a.j.b.C1480a) {
                Z(new ag1(0, this, jVar3), new tlo0.f(R.string.photos_retry), hq.b(tlo0.Companion, R.plurals.download_photos_error, 1));
                return;
            }
            if (jVar3 instanceof a.j.AbstractC1478a.b) {
                T(d.b.b);
                b0(null, null, hq.b(tlo0.Companion, R.plurals.download_photos_success, 1));
                return;
            } else {
                if (!(jVar3 instanceof a.j.AbstractC1478a.C1479a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Z(new cg1(0, this, jVar3), new tlo0.f(R.string.photos_retry), hq.b(tlo0.Companion, R.plurals.download_photos_error, 1));
                return;
            }
        }
        if (aVar2 instanceof a.g) {
            if (z) {
                T(d.b.b);
                return;
            }
            return;
        }
        if (aVar2 instanceof a.f) {
            f4zVar.b(new i.k(kh1.a.a));
            return;
        }
        if (aVar2 instanceof a.a0) {
            if (photoAlbum != null) {
                f4zVar.b(new i.o(photoAlbum.g, photoAlbum.h));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.i) {
            if (photoAlbum != null) {
                f4zVar.b(new i.o(photoAlbum.g, photoAlbum.h));
                return;
            }
            return;
        }
        if (aVar2 instanceof a.h) {
            i.n.a aVar4 = ((a.h) aVar2).b;
            if (epx.f(aVar4, i.n.a.b.a)) {
                f4zVar.b(i.r.a);
                int i6 = 0;
                bVar.b(albumsRepository.d(i3, userId2).j(new if1(this, 0)).subscribe(new of1(i6, this, jVar2), new wf1(new j20(1, jVar2, this), i6)));
                return;
            }
            boolean z7 = aVar4 instanceof i.n.a.c;
            ch1 ch1Var = this.h;
            if (z7) {
                f4zVar.b(i.r.a);
                List<Photo> b4 = jVar2.b(null);
                int i7 = 2;
                bVar.b(ch1Var.a(userId2, b4).subscribe(new bg1(new k8(1, this, b4), 0), new hz(new mb(this, i7), i7)));
                return;
            }
            if (!(aVar4 instanceof i.n.a.d)) {
                if (!(aVar4 instanceof i.n.a.C1486a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Y(new PhotoAlbumWrapper.SpecialPhotoAlbum(-185, "", false), ((i.n.a.C1486a) aVar4).a, this.w);
                return;
            } else {
                Photo photo4 = ((i.n.a.d) aVar4).a;
                f4zVar.b(i.r.a);
                io.reactivex.rxjava3.internal.operators.single.b0 m = ch1Var.a(userId2, Collections.singletonList(photo4)).m(asu0.a.d());
                int i8 = 1;
                int i9 = 0;
                bVar.b(m.subscribe(new tf1(new ab(i8, this, photo4), i9), new um0(new uf1(i9, this, photo4), i8)));
                return;
            }
        }
        if (aVar2 instanceof a.b) {
            f4zVar.b(i.f.a);
            return;
        }
        if (aVar2 instanceof a.C1477a) {
            a.C1477a c1477a = (a.C1477a) aVar2;
            this.t = this.i.a(c1477a.b, c1477a.c, c1477a.d, bVar);
            return;
        }
        if (aVar2 instanceof a.c) {
            PhotoAlbum photoAlbum2 = ((a.c) aVar2).b;
            if (photoAlbum2 == null) {
                f4zVar.b(i.a.a);
                return;
            } else {
                T(new d.m(photoAlbum2));
                return;
            }
        }
        if (aVar2 instanceof a.u) {
            T(new d.j(((a.u) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.v) {
            T(new d.l(((a.v) aVar2).b));
            return;
        }
        if (aVar2 instanceof a.d) {
            a.d dVar2 = (a.d) aVar2;
            if (photoAlbum == null) {
                return;
            }
            PhotoAlbumWrapper photoAlbumWrapper = dVar2.b;
            List<Photo> list3 = dVar2.c;
            if ((photoAlbumWrapper instanceof PhotoAlbumWrapper.CommonPhotoAlbum) && !dVar2.d) {
                boolean z8 = list3.size() == 1;
                PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum = (PhotoAlbumWrapper.CommonPhotoAlbum) photoAlbumWrapper;
                boolean z9 = photoAlbum.w;
                if (!z9 && photoAlbum.x && !commonPhotoAlbum.e.x) {
                    f4zVar.b(z8 ? new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photo_title), new tlo0.f(R.string.album_confirm_move_photo_to_private_album), new tlo0.f(R.string.photo_flow_confirm_move), new i5(1, this, dVar2)) : new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photos_title), new tlo0.f(R.string.album_confirm_move_photos_to_private_album), new tlo0.f(R.string.photo_flow_confirm_move), new eg1(0, this, dVar2)));
                    return;
                }
                if (!z9 && commonPhotoAlbum.e.w) {
                    f4zVar.b(z8 ? new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photo_title), new tlo0.f(R.string.photo_flow_confirm_move_photo_to_disabled_album), new tlo0.f(R.string.photo_flow_confirm_move), new vf1(0, this, dVar2)) : new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photos_title), new tlo0.f(R.string.photo_flow_confirm_move_photos_to_disabled_album), new tlo0.f(R.string.photo_flow_confirm_move), new fy0(1, this, dVar2)));
                    return;
                } else if (photoAlbum.x && z9 && !commonPhotoAlbum.e.w) {
                    f4zVar.b(z8 ? new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photo_title), new tlo0.f(R.string.move_photo_to_album_in_photo_flow), new tlo0.f(R.string.photo_flow_confirm_move), new fg1(0, this, dVar2)) : new i.p(tq.h(tlo0.Companion, R.string.photo_flow_confirm_move_photos_title), new tlo0.f(R.string.move_photos_to_album_in_photo_flow), new tlo0.f(R.string.photo_flow_confirm_move), new com.vk.movika.sdk.base.logic.interactor.c(2, this, dVar2)));
                    return;
                }
            }
            Y(photoAlbumWrapper, list3, new jg1(photoAlbumWrapper, this));
            return;
        }
        if (aVar2 instanceof a.c0) {
            Parcelable parcelable = ((a.c0) aVar2).b.b;
            PhotoUploadInteractor.UploadTaskExtraParams uploadTaskExtraParams = parcelable instanceof PhotoUploadInteractor.UploadTaskExtraParams ? (PhotoUploadInteractor.UploadTaskExtraParams) parcelable : null;
            List<String> list4 = uploadTaskExtraParams != null ? uploadTaskExtraParams.b : null;
            Integer valueOf = list4 != null ? Integer.valueOf(list4.size()) : null;
            if (list4 != null && photoAlbum != null) {
                f4zVar.b(new i.t(new j7k0(null, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, new tjc(tq.h(tlo0.Companion, (valueOf != null && valueOf.intValue() == 1) ? R.string.photo_flow_one_photo_uploaded_2 : R.string.photo_flow_several_photo_uploaded_2), new tlo0.f(R.string.photo_flow_post_to_story), new a.x(list4)), 25)));
            }
            f4zVar.b(i.C1485i.a);
            return;
        }
        a.y yVar = a.y.b;
        int i10 = 4;
        if (aVar2.equals(yVar)) {
            io.reactivex.rxjava3.internal.operators.observable.c0 c0Var = new io.reactivex.rxjava3.internal.operators.observable.c0(albumsRepository.a(i3, userId), new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, i10), 3), io.reactivex.rxjava3.internal.functions.a.c);
            int i11 = 0;
            bVar.b(c0Var.G(new jf1(this, i11)).subscribe(new lf1(new kf1(this, i11), i11), new mf1(new com.vk.voip.ui.menu.feature.a(this, 1), i11)));
            return;
        }
        if (aVar2.equals(a.n.b)) {
            if (jVar2.k) {
                C(yVar);
                T(new d.g(false));
                return;
            }
            return;
        }
        if (aVar2.equals(a.o.b)) {
            T(new d.g(true));
            return;
        }
        if (aVar2 instanceof a.m) {
            m7a0 m7a0Var = ((a.m) aVar2).b;
            if (!(m7a0Var instanceof m7a0.a)) {
                if (m7a0Var instanceof m7a0.b) {
                    List<Photo> list5 = ((m7a0.b) m7a0Var).a;
                    ArrayList arrayList5 = new ArrayList(c5g.u(list5, 10));
                    Iterator<T> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(Integer.valueOf(((Photo) it3.next()).d));
                    }
                    contains = arrayList5.contains(Integer.valueOf(i3));
                } else {
                    if (m7a0Var instanceof m7a0.e) {
                    }
                    contains = false;
                }
            }
            if (contains) {
                this.q = true;
                return;
            }
            return;
        }
        if (!(aVar2 instanceof a.b0)) {
            if (aVar2.equals(a.z.b)) {
                f4zVar.b(i.C1485i.a);
                return;
            } else {
                if (!(aVar2 instanceof a.x)) {
                    throw new NoWhenBranchMatchedException();
                }
                f4zVar.b(new i.h(((a.x) aVar2).b));
                return;
            }
        }
        a.b0 b0Var = (a.b0) aVar2;
        List list6 = vKList;
        if (vKList == null) {
            list6 = EmptyList.b;
        }
        Photo photo5 = b0Var.b;
        boolean z10 = b0Var.c;
        fh1 fh1Var = new fh1(17, photo5, new h5(this, i10));
        kdg0 kdg0Var = this.m;
        bVar.b(z10 ? kdg0Var.b(list6, photo5, fh1Var) : kdg0Var.e(list6, photo5, fh1Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0134 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean U(com.vk.photos.root.albumdetails.presentation.j jVar, uh1 uh1Var, Photo photo) {
        boolean f2 = epx.f(uh1Var, uh1.a.d);
        s0e0 s0e0Var = this.f;
        UserId userId = this.k;
        if (f2) {
            return !this.g.c(this.o) && s0e0Var.a(userId);
        }
        if (epx.f(uh1Var, uh1.c.d)) {
            if (com.vk.photos.root.albums.presentation.b.n.contains(Integer.valueOf(jVar.m)) || !s0e0Var.a(userId)) {
            }
        } else {
            if (epx.f(uh1Var, uh1.d.d)) {
                VKList<Photo> vKList = jVar.b;
                if ((vKList != null ? vKList.size() : -1) > 0) {
                    if (s0e0Var.a(userId) && !V(jVar).isEmpty()) {
                    }
                }
            }
            if (!epx.f(uh1Var, uh1.f.d)) {
                if (!epx.f(uh1Var, uh1.b.d)) {
                    if (uh1Var instanceof uh1.g.a) {
                        int i = jVar.m;
                        return (i == -6 || i == -9000) ? false : true;
                    }
                    if (uh1Var instanceof uh1.g.b) {
                        return jVar.m != -9000;
                    }
                    if (epx.f(uh1Var, uh1.i.d)) {
                        return jVar.m != -9000;
                    }
                    if (epx.f(uh1Var, uh1.j.d)) {
                        if (jVar.j || photo == null || photo.Ib()) {
                            if (jVar.h.size() <= 1) {
                                List<Photo> b2 = jVar.b(null);
                                if (!(b2 instanceof Collection) || !b2.isEmpty()) {
                                    Iterator<T> it = b2.iterator();
                                    while (it.hasNext()) {
                                        if (!((Photo) it.next()).Ib()) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (!epx.f(uh1Var, uh1.l.d)) {
                        if (epx.f(uh1Var, uh1.h.d)) {
                            int i2 = jVar.m;
                            return (i2 == -6 || i2 == -9000) ? false : true;
                        }
                        if (!epx.f(uh1Var, uh1.e.d)) {
                            if (!epx.f(uh1Var, uh1.k.d)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            int i3 = jVar.m;
                            if (!((i3 == -6 || i3 == -9000) ? false : true) || !s0e0Var.a(userId)) {
                            }
                        }
                    }
                }
            }
            VKList<Photo> vKList2 = jVar.b;
            if ((vKList2 != null ? vKList2.size() : 0) > 1) {
            }
        }
    }

    public final ArrayList V(com.vk.photos.root.albumdetails.presentation.j jVar) {
        List l = e43.l(uh1.j.d, uh1.k.d, new uh1.g.a(R.string.album_details_archive_photo, R.plurals.album_details_archive_photos, R.drawable.vk_icon_archive_outline_28, jVar.h.size(), R.attr.vk_ui_icon_accent), new uh1.g.b(R.string.album_details_delete_photo, R.plurals.album_details_delete_photos, R.drawable.vk_icon_delete_outline_28, jVar.h.size(), R.attr.vk_ui_icon_negative));
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (U(jVar, (uh1) obj, null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void W() {
        tlo0.f h = tq.h(tlo0.Companion, R.string.photo_flow_delete_photos_error);
        Z(new defpackage.e(this, 3), new tlo0.f(R.string.photos_retry), h);
    }

    public final void X(Photo photo) {
        tlo0.f h = tq.h(tlo0.Companion, R.string.photo_flow_delete_photo_error);
        Z(new gd0(2, this, photo), new tlo0.f(R.string.photos_retry), h);
    }

    public final void Y(PhotoAlbumWrapper photoAlbumWrapper, List<? extends Photo> list, b bVar) {
        io.reactivex.rxjava3.core.x<Integer> c2 = this.h.c(this.k, photoAlbumWrapper.getId(), list);
        az azVar = new az(new com.vk.movika.sdk.base.observable.c(this, 4), 3);
        c2.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.single.n(c2, azVar).subscribe(new cz(new yf1(this, list, bVar, 0), 3), new gn0(new zf1(0, this, bVar), 1)));
    }

    public final void Z(gzs gzsVar, tlo0.f fVar, tlo0 tlo0Var) {
        this.p.b(new i.t(new j7k0(tlo0Var, Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), fVar, gzsVar, null, 32)));
    }

    public final void b0(gzs gzsVar, tlo0.f fVar, tlo0 tlo0Var) {
        this.p.b(new i.t(new j7k0(tlo0Var, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), fVar, gzsVar, null, 32)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.l.w().g(this.x);
    }

    public final void onResume() {
        if (this.q) {
            this.p.b(i.C1485i.a);
            this.q = false;
        }
    }

    public final wj50<com.vk.photos.root.albumdetails.presentation.i> x() {
        return this.p;
    }
}
