package xsna;

import android.content.Context;
import android.graphics.PointF;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.photo.Photo;
import com.vk.dto.tags.Tag;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ikv0;
import xsna.n0o0;
import xsna.q8u;
import xsna.r0o0;
import xsna.z8u0;

/* compiled from: TaggedGoodsControllerImpl.kt */
/* loaded from: classes18.dex */
public final class x0o0 implements r0o0 {
    public final Context a;
    public final e9u0 b;
    public final String c;
    public final u4h d;
    public final atd0 e;
    public final boolean f;
    public r0o0.a h;
    public z8u0.f i;
    public z8u0.d j;
    public d390 k;
    public Photo l;
    public int m;
    public final o2o0 g = new o2o0();
    public final ArrayList n = new ArrayList();
    public final io.reactivex.rxjava3.disposables.b o = new io.reactivex.rxjava3.disposables.b();
    public final Object p = msy.a(LazyThreadSafetyMode.NONE, new ta50(10));

    /* compiled from: TaggedGoodsControllerImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final a b = new a(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public x0o0(Context context, e9u0 e9u0Var, String str, u4h u4hVar, atd0 atd0Var, boolean z) {
        this.a = context;
        this.b = e9u0Var;
        this.c = str;
        this.d = u4hVar;
        this.e = atd0Var;
        this.f = z;
    }

    public static void k(x0o0 x0o0Var, Photo photo, vql0 vql0Var, int i) {
        boolean z = (i & 2) == 0;
        Object obj = vql0Var;
        if ((i & 4) != 0) {
            obj = new w0o0(0);
        }
        if (!x0o0Var.n.contains(Integer.valueOf(photo.c)) || z) {
            io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(x0o0Var.g.b(photo.c, photo.e, Tag.ContentType.PHOTO.h(), photo.v)), null, null, 3);
            jsv jsvVar = new jsv(new r770(9, x0o0Var, photo), 28);
            a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
            x0o0Var.o.b(new io.reactivex.rxjava3.internal.operators.observable.c0(y0, jsvVar, kVar).G(new ef3(1, photo, x0o0Var)).U(new b690(new n0m0(5))).E(new j7l0(new vlc0(photo, 19), 4), io.reactivex.rxjava3.internal.functions.a.d, kVar, kVar).subscribe(new u0o0(new ki4(x0o0Var, photo, obj, 8), 0), new o060(new gz30(24), 16)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, xsna.ysd0] */
    @Override // xsna.r0o0
    public final void a(Photo photo, PointF pointF) {
        PhotoViewerLayout photoViewerLayout;
        int size = photo.x.size();
        Context context = this.a;
        if (size < 5) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            dn0 dn0Var = new dn0(1, ref$ObjectRef, this, photo, pointF);
            dhr0.a.getClass();
            ref$ObjectRef.element = this.e.a(context, new g910(null, 1, null, null, dn0Var, dhr0.u().c, null, null, null, null, null, null, 16285));
            return;
        }
        String string = context.getString(R.string.photo_too_many_tagged_goods);
        z8u0.f fVar = this.i;
        if (fVar == null || (photoViewerLayout = fVar.a.w) == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(context);
        aVar.t = ikv0.c.b.a;
        aVar.u = new ikv0.d(new ikv0.d.c(string, null), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.l = 81;
        aVar.o(photoViewerLayout);
    }

    @Override // xsna.r0o0
    public final void b(r0o0.a aVar) {
        this.h = aVar;
    }

    @Override // xsna.r0o0
    public final void c(z8u0.d dVar) {
        this.j = dVar;
    }

    @Override // xsna.r0o0
    public final void d(Photo photo, int i, vql0 vql0Var) {
        this.l = photo;
        this.m = i;
        if (photo == null || !photo.r) {
            d390 d390Var = this.k;
            if (d390Var != null) {
                d390Var.k(EmptyList.b, false);
                return;
            }
            return;
        }
        d390 d390Var2 = this.k;
        if (d390Var2 != null) {
            List<Tag> list = photo.x;
            if (list == null) {
                list = EmptyList.b;
            }
            d390Var2.k(list, false);
        }
        if (photo.m) {
            vql0Var.invoke();
        } else {
            k(this, photo, vql0Var, 2);
        }
    }

    @Override // xsna.r0o0
    public final void e(Tag tag, AttachmentWithMedia attachmentWithMedia) {
        PhotoAttachment photoAttachment = attachmentWithMedia instanceof PhotoAttachment ? (PhotoAttachment) attachmentWithMedia : null;
        if (photoAttachment != null) {
            if (!this.d.d(photoAttachment.l.e)) {
                l(tag, photoAttachment);
                return;
            }
            q8u.a aVar = new q8u.a(this.a, tag);
            aVar.f = new zwc(this, tag, photoAttachment, 3);
            aVar.g = new gba0(this, photoAttachment, tag, 2);
            aVar.I0(null);
        }
    }

    @Override // xsna.r0o0
    public final void g(z8u0.f fVar) {
        this.i = fVar;
    }

    @Override // xsna.r0o0
    public final void h(d390 d390Var) {
        this.k = d390Var;
    }

    @Override // xsna.r0o0
    public final void i(Photo photo, Tag tag) {
        if (this.d.d(photo.e)) {
            j(photo, tag);
        }
    }

    public final void j(Photo photo, Tag tag) {
        List<Tag> list = photo.x;
        photo.x = j5g.s0(list, tag);
        photo.r = !r1.isEmpty();
        this.b.invoke(photo);
        String h = Tag.ContentType.PHOTO.h();
        io.reactivex.rxjava3.core.q m = hg1.m(rsg0.y0(yfb.x(this.g.a(tag.e, tag.a, photo.e, h, photo.v)), null, null, 3), this.a, 0L, false, 62);
        wx00 wx00Var = new wx00(new ml1(29, photo, list), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        io.reactivex.rxjava3.internal.operators.observable.b0 G = m.E(wx00Var, lVar, kVar, kVar).F(new uk40(new ju(28, photo, list), 18)).G(new b7w(2, photo, this));
        int i = kwg0.a;
        this.o.b(G.subscribe(new iwg0(), new n780(a.b, 1)));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void l(Tag tag, PhotoAttachment photoAttachment) {
        zzq zzqVar = (zzq) this.p.getValue();
        int i = tag.b;
        n0o0 n0o0Var = tag.f;
        long j = tag.d.b;
        int i2 = this.m;
        zzqVar.getClass();
        zzq.b(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PHOTO_VIEWER_PIN, i, j, this.c, Integer.valueOf(i2), null);
        boolean z = this.f;
        String str = z ? "POSTS_CONTEXT_MECHANISM" : null;
        String h = z ? "POSTS_CONTEXT_MECHANISM" : tag.c.h();
        String a2 = n0o0Var.a(Long.valueOf(photoAttachment.g.b), Integer.valueOf(photoAttachment.k), CommonMarketStat$TypeMarketContextContent.Type.POST, str);
        r0o0.a aVar = this.h;
        if (aVar != null) {
            String str2 = n0o0Var.f;
            n0o0.a aVar2 = n0o0Var.e;
            aVar.a(this.a, a2, str2, new LaunchContext(false, false, false, null, null, null, null, this.c, a2, h, null, false, false, false, null, null, null, aVar2 != null ? aVar2.e : null, null, false, false, null, null, null, 66583679));
        }
    }

    @Override // xsna.r0o0
    public final void onDismiss() {
        this.i = null;
        this.o.dispose();
    }

    @Override // xsna.r0o0
    public final void f() {
    }
}
