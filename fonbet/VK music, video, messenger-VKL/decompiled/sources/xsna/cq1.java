package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.hq1;
import xsna.kq1;
import xsna.qfa0;
import xsna.vp1;

/* compiled from: AlbumsSettingsFeature.kt */
/* loaded from: classes4.dex */
public final class cq1 extends wk50<rq1, lq1, vp1, hq1> {
    public final UserId f;
    public final AlbumsRepository g;
    public final qfa0.c h;
    public PhotoAlbum i;
    public final io.reactivex.rxjava3.subjects.h j;
    public final f4z<kq1> k;

    /* compiled from: AlbumsSettingsFeature.kt */
    public static final class a {
        public final PhotoAlbum a;
        public final UserId b;
        public final Integer c;
        public final Integer d;

        public a(PhotoAlbum photoAlbum, UserId userId, Integer num, Integer num2) {
            this.a = photoAlbum;
            this.b = userId;
            this.c = num;
            this.d = num2;
        }
    }

    public cq1(s0e0 s0e0Var, UserId userId, AlbumsRepository albumsRepository, qfa0.c cVar) {
        super(vp1.e.b, new jq1(userId, s0e0Var));
        this.f = userId;
        this.g = albumsRepository;
        this.h = cVar;
        io.reactivex.rxjava3.subjects.h M0 = new io.reactivex.rxjava3.subjects.f().M0();
        this.j = M0;
        this.k = new f4z<>();
        this.e.b(M0.a0(asu0.a.c()).u(new tt0(new com.vk.im.engine.internal.storage.delegates.messages.b(this, 5), 1)).subscribe(new va4(0), new f60(new e60(3), 1)));
    }

    @Override // xsna.wk50
    public final void N(lq1 lq1Var, vp1 vp1Var) {
        PhotoAlbum photoAlbum;
        Integer g;
        Integer valueOf;
        Integer valueOf2;
        vp1 vp1Var2 = vp1Var;
        if (vp1Var2.equals(vp1.e.b)) {
            T(hq1.b.b);
            return;
        }
        if (vp1Var2 instanceof vp1.h) {
            vp1.h hVar = (vp1.h) vp1Var2;
            List<PhotoAlbum> list = hVar.b;
            if (hVar.c) {
                T(new hq1.f(list));
                return;
            } else {
                T(new hq1.d(list));
                return;
            }
        }
        if (vp1Var2 instanceof vp1.i) {
            vp1.i iVar = (vp1.i) vp1Var2;
            T(new hq1.c(iVar.b, iVar.c));
            return;
        }
        if (vp1Var2 instanceof vp1.g) {
            T(new hq1.e(((vp1.g) vp1Var2).b));
            return;
        }
        boolean equals = vp1Var2.equals(vp1.a.b);
        f4z<kq1> f4zVar = this.k;
        if (equals) {
            f4zVar.b(kq1.a.a);
            return;
        }
        if (vp1Var2 instanceof vp1.c) {
            f4zVar.b(new kq1.b(((vp1.c) vp1Var2).b));
            return;
        }
        if (vp1Var2 instanceof vp1.f) {
            f4zVar.b(new kq1.d());
            return;
        }
        if (vp1Var2 instanceof vp1.b) {
            final PhotoAlbum photoAlbum2 = ((vp1.b) vp1Var2).b;
            this.e.b(this.g.d(photoAlbum2.b, photoAlbum2.c).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.zp1
                @Override // io.reactivex.rxjava3.functions.a
                public final void run() {
                    cq1 cq1Var = cq1.this;
                    qfa0.c cVar = cq1Var.h;
                    PhotoAlbum photoAlbum3 = photoAlbum2;
                    cVar.c(photoAlbum3.b);
                    cq1Var.T(new hq1.a(photoAlbum3));
                    cq1Var.k.b(new kq1.e(new j7k0(tq.h(tlo0.Companion, R.string.album_removed), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
                }
            }, new m20(new aq1(0, this, photoAlbum2), 3)));
            return;
        }
        if (!(vp1Var2 instanceof vp1.d)) {
            if (!(vp1Var2 instanceof vp1.j)) {
                throw new NoWhenBranchMatchedException();
            }
            this.i = ((vp1.j) vp1Var2).b;
            return;
        }
        List<PhotoAlbum> list2 = ((vp1.d) vp1Var2).b;
        if ((list2 == null ? EmptyList.b : list2).size() > 1 && (photoAlbum = this.i) != null) {
            this.h.a(photoAlbum.b);
            if (list2 == null || (g = i7o0.g(list2, new dg(photoAlbum, 3))) == null) {
                return;
            }
            int intValue = g.intValue();
            Integer num = null;
            if (intValue == 0) {
                valueOf = Integer.valueOf(list2.get(1).b);
            } else if (intValue >= list2.size() - 1) {
                valueOf2 = Integer.valueOf(((PhotoAlbum) ji.a(2, list2)).b);
                this.j.onNext(new a(photoAlbum, this.f, num, valueOf2));
            } else {
                num = Integer.valueOf(list2.get(intValue - 1).b);
                valueOf = Integer.valueOf(list2.get(intValue + 1).b);
            }
            Integer num2 = num;
            num = valueOf;
            valueOf2 = num2;
            this.j.onNext(new a(photoAlbum, this.f, num, valueOf2));
        }
    }
}
