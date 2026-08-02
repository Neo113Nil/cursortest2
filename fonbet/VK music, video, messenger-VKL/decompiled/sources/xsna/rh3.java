package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.ej3;
import xsna.hg1;
import xsna.ig3;
import xsna.mi3;
import xsna.oi3;
import xsna.qfa0;
import xsna.tlo0;
import xsna.zi3;

/* compiled from: ArchiveFeature.kt */
/* loaded from: classes4.dex */
public final class rh3 extends wk50<oj3, ej3, ig3, mi3> {
    public final UserId f;
    public final x7a0 g;
    public final vi3 h;
    public final ysg0<m7a0> i;
    public final gd60 j;
    public final kdg0 k;
    public final qfa0.d l;
    public final boolean m;
    public final ni3 n;
    public final f4z o;
    public final kh3 p;

    /* compiled from: ArchiveFeature.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public rh3(UserId userId, x7a0 x7a0Var, vi3 vi3Var, ysg0<m7a0> ysg0Var, gd60 gd60Var, kdg0 kdg0Var, qfa0.d dVar, boolean z) {
        super(ig3.c.b, new ti3());
        this.f = userId;
        this.g = x7a0Var;
        this.h = vi3Var;
        this.i = ysg0Var;
        this.j = gd60Var;
        this.k = kdg0Var;
        this.l = dVar;
        this.m = z;
        this.n = new ni3(new go1(this, 5), new com.vk.movika.sdk.base.observable.e(this, 7), dVar);
        this.o = new f4z();
        kh3 kh3Var = new kh3(this, 0);
        this.p = kh3Var;
        p870 w = gd60Var.w();
        w.b(130, kh3Var);
        w.b(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, kh3Var);
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.c cVar = new hg1.c();
        fVar.getClass();
        this.e.b(new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, cVar), new lh3(new dz(1), 0)).subscribe(new iu1(new vl1(this, 3), 2), new bg1(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 3)));
    }

    @Override // xsna.wk50
    public final void N(ej3 ej3Var, ig3 ig3Var) {
        tlo0 a2;
        ej3 ej3Var2 = ej3Var;
        ig3 ig3Var2 = ig3Var;
        Integer valueOf = Integer.valueOf(R.attr.vk_ui_accent_orange);
        Integer valueOf2 = Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28);
        ej3.a aVar = ej3Var2.c;
        if (ig3Var2.equals(ig3.c.b)) {
            T(new mi3.i());
            return;
        }
        if (ig3Var2 instanceof ig3.d) {
            T(new mi3.c());
            return;
        }
        if (ig3Var2 instanceof ig3.a) {
            ig3.a aVar2 = (ig3.a) ig3Var2;
            T(new mi3.b(aVar2.b, aVar2.c, aVar2.d));
            return;
        }
        boolean equals = ig3Var2.equals(ig3.b.b);
        int i = 0;
        f4z f4zVar = this.o;
        if (equals) {
            if (ej3Var2.e) {
                C(new ig3.f());
                return;
            } else {
                f4zVar.b(zi3.a.a);
                return;
            }
        }
        if (ig3Var2 instanceof ig3.i) {
            T(new mi3.h(((ig3.i) ig3Var2).b));
            f4zVar.b(zi3.e.a);
            return;
        }
        if (ig3Var2 instanceof ig3.g) {
            T(new mi3.e(((ig3.g) ig3Var2).b));
            return;
        }
        if (ig3Var2 instanceof ig3.h) {
            T(new mi3.f(((ig3.h) ig3Var2).b));
            return;
        }
        boolean z = ig3Var2 instanceof ig3.k.a;
        qfa0.d dVar = this.l;
        if (z) {
            Photo photo = ((ig3.k.a) ig3Var2).b;
            dVar.a(photo.c);
            VKList<Photo> vKList = aVar.a;
            if (vKList == null) {
                return;
            }
            Iterator<Photo> it = vKList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next().c == photo.c) {
                    break;
                } else {
                    i++;
                }
            }
            f4zVar.b(new zi3.d.c(i, vKList));
            return;
        }
        if (ig3Var2 instanceof ig3.k.b) {
            U(((ig3.k.b) ig3Var2).b);
            return;
        }
        boolean z2 = ig3Var2 instanceof ig3.k.e;
        ni3 ni3Var = this.n;
        if (z2) {
            ig3.k.e eVar = (ig3.k.e) ig3Var2;
            oi3.b bVar = eVar.b;
            Photo photo2 = eVar.c;
            com.vk.movika.sdk.base.observable.e eVar2 = ni3Var.b;
            qfa0.d dVar2 = ni3Var.c;
            if (bVar.equals(oi3.b.a.e)) {
                dVar2.i(Collections.singletonList(photo2));
                eVar2.invoke(new aj3(photo2));
                return;
            }
            if (bVar.equals(oi3.b.C3456b.e)) {
                dVar2.g(Collections.singletonList(photo2));
                String str = photo2.t;
                if (str == null) {
                    return;
                }
                eVar2.invoke(new zi3.b.C4180b(str));
                return;
            }
            if (bVar.equals(oi3.b.c.e)) {
                dVar2.e(photo2.c);
                ni3Var.a.invoke(new ig3.f(photo2, true));
                return;
            } else {
                if (!bVar.equals(oi3.b.d.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                List O0 = j5g.O0(aVar.b);
                dVar2.k(O0);
                ni3Var.b.invoke(new zi3.f(O0));
                return;
            }
        }
        if (ig3Var2 instanceof ig3.k.f) {
            U(((ig3.k.f) ig3Var2).b);
            return;
        }
        if (ig3Var2 instanceof ig3.k.g) {
            ig3.k.g gVar = (ig3.k.g) ig3Var2;
            Photo photo3 = gVar.b;
            int i2 = gVar.c;
            dVar.d(photo3.c);
            ListBuilder e = e43.e();
            if (!photo3.Ib()) {
                e.add(oi3.b.C3456b.e);
            }
            e.add(oi3.b.d.e);
            e.add(oi3.b.c.e);
            e.add(oi3.b.a.e);
            f4zVar.b(new dj3(photo3, i2, e.g()));
            return;
        }
        if (ig3Var2 instanceof ig3.k.d) {
            X();
            return;
        }
        if (ig3Var2 instanceof ig3.k.c) {
            f4zVar.b(new zi3.g(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_error, 1), valueOf2, valueOf, new tlo0.f(R.string.photos_retry), new gd0(3, this, ((ig3.k.c) ig3Var2).b), null, 32)));
            return;
        }
        if (ig3Var2 instanceof ig3.f) {
            ig3.f fVar = (ig3.f) ig3Var2;
            T(new mi3.a(fVar.b));
            Photo photo4 = fVar.c;
            if (photo4 != null) {
                T(new mi3.e(photo4));
                return;
            }
            return;
        }
        if (ig3Var2.equals(ig3.j.b)) {
            Set<Photo> set = aVar.b;
            ListBuilder e2 = e43.e();
            if (set.size() <= 1) {
                Set<Photo> set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    Iterator<T> it2 = set2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!((Photo) it2.next()).Ib()) {
                            e2.add(oi3.a.c.e);
                            break;
                        }
                    }
                }
            }
            e2.add(oi3.a.d.e);
            e2.add(oi3.a.b.e);
            int size = aVar.b.size();
            if (size == 1) {
                a2 = tq.h(tlo0.Companion, R.string.album_details_delete_photo);
            } else {
                tlo0.a aVar3 = tlo0.Companion;
                Object[] objArr = {Integer.valueOf(size)};
                aVar3.getClass();
                a2 = tlo0.a.a(R.plurals.album_details_delete_photos, size, objArr);
            }
            e2.add(new oi3.a.C3455a(R.drawable.vk_icon_delete_outline_28, R.attr.vk_ui_icon_negative, a2));
            f4zVar.b(new cj3(e2.g()));
            return;
        }
        if (ig3Var2.equals(ig3.e.a.b)) {
            V(aVar.b);
            return;
        }
        if (ig3Var2 instanceof ig3.e.d) {
            com.vk.movika.sdk.base.observable.e eVar3 = ni3Var.b;
            qfa0.d dVar3 = ni3Var.c;
            List O02 = j5g.O0(aVar.b);
            oi3.a aVar4 = ((ig3.e.d) ig3Var2).b;
            if (aVar4 instanceof oi3.a.C3455a) {
                dVar3.i(O02);
                eVar3.invoke(new bj3(O02));
                return;
            }
            if (!epx.f(aVar4, oi3.a.c.e)) {
                if (epx.f(aVar4, oi3.a.d.e)) {
                    dVar3.k(O02);
                    ni3Var.b.invoke(new zi3.f(O02));
                    return;
                } else {
                    if (!epx.f(aVar4, oi3.a.b.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ni3Var.a.invoke(new ig3.f());
                    return;
                }
            }
            if (O02.isEmpty()) {
                return;
            }
            dVar3.g(O02);
            ArrayList arrayList = new ArrayList();
            Iterator it3 = O02.iterator();
            while (it3.hasNext()) {
                String str2 = ((Photo) it3.next()).t;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            eVar3.invoke(new zi3.b.a(arrayList));
            return;
        }
        if (ig3Var2 instanceof ig3.e.C3054e) {
            V(aVar.b);
            return;
        }
        if (ig3Var2 instanceof ig3.e.c) {
            T(new mi3.a(false));
            X();
            return;
        }
        if (ig3Var2 instanceof ig3.e.b) {
            List<String> list = ((ig3.e.b) ig3Var2).b;
            f4zVar.b(new zi3.g(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_error, list.size()), valueOf2, valueOf, new tlo0.f(R.string.photos_retry), new y4(2, this, list), null, 32)));
            return;
        }
        boolean z3 = ig3Var2 instanceof ig3.m;
        int i3 = 5;
        io.reactivex.rxjava3.disposables.b bVar2 = this.e;
        if (z3) {
            Set<Photo> set3 = aVar.b;
            PhotoAlbumWrapper photoAlbumWrapper = ((ig3.m) ig3Var2).b;
            bVar2.b(this.h.a(this.f, photoAlbumWrapper.getId(), j5g.O0(set3)).subscribe(new hz(new jh3(this, photoAlbumWrapper, set3, i), i3), new ph3(new oh3(i, this, set3), i)));
            return;
        }
        if (!(ig3Var2 instanceof ig3.l)) {
            throw new NoWhenBranchMatchedException();
        }
        ig3.l lVar = (ig3.l) ig3Var2;
        List<? extends Photo> list2 = aVar.a;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        Photo photo5 = lVar.b;
        boolean z4 = lVar.c;
        fh1 fh1Var = new fh1(17, photo5, new com.vk.movika.sdk.base.observable.o(this, i3));
        kdg0 kdg0Var = this.k;
        bVar2.b(z4 ? kdg0Var.b(list2, photo5, fh1Var) : kdg0Var.e(list2, photo5, fh1Var));
    }

    public final void U(Photo photo) {
        this.e.b(this.g.b(photo, this.f).o(asu0.a.d()).subscribe(new qh3(0, this, photo), new defpackage.n(new defpackage.m(2, this, photo), 4)));
    }

    public final void V(Set<? extends Photo> set) {
        List O0 = j5g.O0(set);
        this.e.b(this.g.a(this.f, O0).m(asu0.a.d()).subscribe(new defpackage.p(new defpackage.o(3, this, set), 1), new pv2(new tn0(3, this, set), 1)));
    }

    public final wj50<zi3> W() {
        return this.o;
    }

    public final void X() {
        this.o.b(new zi3.g(new j7k0(hq.b(tlo0.Companion, R.plurals.download_photos_success, 1), Integer.valueOf(R.drawable.vk_icon_check_circle_outline_28), Integer.valueOf(R.attr.vk_ui_icon_positive), null, null, null, 32)));
    }

    @Override // xsna.wk50, xsna.g4z
    public final void onDestroy() {
        super.onDestroy();
        this.j.w().g(this.p);
    }
}
