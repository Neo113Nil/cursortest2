package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.GenericDraweeView;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachSyncState;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.nft.Nft;
import com.vk.dto.photo.Photo;
import com.vk.imageloader.view.VKImageView;
import com.vk.photoviewer.PhotoViewer;
import com.vk.photoviewer.PhotoViewerLayout;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.NftAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.tkg;

/* compiled from: BaseImageViewer.kt */
/* loaded from: classes11.dex */
public abstract class qe6 implements ImageViewer {

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class b<T> {
        public final int a;
        public final List<T> b;
        public final Context c;
        public final ImageViewer.a d;
        public final izs<T, AttachmentWithMedia> e;
        public final izs<T, AttachWithImage> f;
        public final String g;
        public final String h;
        public final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint i;
        public final UserId j;
        public final Long k;
        public final boolean l;
        public final boolean m;
        public final boolean n;
        public final boolean o;
        public final String p;
        public final boolean q;

        public b(int i, List list, Context context, ImageViewer.a aVar, izs izsVar, izs izsVar2, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, UserId userId, Long l, boolean z, boolean z2, boolean z3, String str3, boolean z4, int i2) {
            Long l2 = (i2 & 2048) != 0 ? null : l;
            boolean z5 = (i2 & 4096) != 0 ? false : z;
            boolean z6 = (i2 & 8192) == 0;
            boolean z7 = (i2 & 16384) == 0 ? z2 : false;
            boolean z8 = (32768 & i2) != 0 ? true : z3;
            String str4 = (65536 & i2) == 0 ? str3 : null;
            boolean z9 = (i2 & 131072) == 0 ? z4 : true;
            this.a = i;
            this.b = list;
            this.c = context;
            this.d = aVar;
            this.e = izsVar;
            this.f = izsVar2;
            this.g = str;
            this.h = str2;
            this.i = mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
            this.j = userId;
            this.k = l2;
            this.l = z5;
            this.m = z6;
            this.n = z7;
            this.o = z8;
            this.p = str4;
            this.q = z9;
        }

        public final ImageViewer.a a() {
            return this.d;
        }

        public final Context b() {
            return this.c;
        }

        public final Long c() {
            return this.k;
        }

        public final MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint d() {
            return this.i;
        }

        public final List<T> e() {
            return this.b;
        }

        public final int f() {
            return this.a;
        }

        public final String g() {
            return this.p;
        }

        public final String h() {
            return this.h;
        }

        public final boolean i() {
            return this.n;
        }

        public final boolean j() {
            return this.q;
        }

        public final izs<T, AttachWithImage> k() {
            return this.f;
        }

        public final izs<T, AttachmentWithMedia> l() {
            return this.e;
        }

        public final String m() {
            return this.g;
        }

        public final UserId n() {
            return this.j;
        }

        public final boolean o() {
            return this.l;
        }

        public final boolean p() {
            return this.o;
        }

        public final boolean q() {
            return this.m;
        }
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static class c implements PhotoViewer.f {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public c(List<ImageSize> list, String str) {
            ArrayList arrayList;
            List<ImageSize> list2 = list;
            Integer i = ixj0.i(list2);
            this.a = i != null ? i.intValue() : 200;
            Integer g = ixj0.g(list2);
            this.b = g != null ? g.intValue() : 200;
            String n = ixj0.n(list2);
            this.c = n == null ? "" : n;
            String h = ixj0.h(list2);
            this.d = h == null ? "" : h;
            String a = cqm0.a(str);
            this.e = (a == null && (a = ixj0.h(list2)) == null) ? "" : a;
            fxj0 o = ixj0.o(list2);
            if (o != null) {
                List y0 = j5g.y0(ixj0.l(o.getWidth(), o.getWidth()));
                arrayList = new ArrayList(c5g.u(y0, 10));
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    arrayList.add(o.X7(((Number) it.next()).intValue()));
                }
            } else {
                List D0 = j5g.D0(new tbb0(1), list2);
                arrayList = new ArrayList(c5g.u(D0, 10));
                Iterator it2 = D0.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((fxj0) it2.next()).getUrl());
                }
            }
            this.f = arrayList;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String a() {
            return this.c;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String d() {
            return this.e;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String e() {
            return this.d;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final List<String> f() {
            return this.f;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getHeight() {
            return this.b;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getWidth() {
            return this.a;
        }
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class d implements PhotoViewer.e {
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final List<String> g;

        public d(DocumentAttachment documentAttachment) {
            String str;
            ArrayList arrayList;
            this.a = documentAttachment.l;
            this.b = documentAttachment.m;
            Image image = documentAttachment.s;
            if ((image == null || (arrayList = image.b) == null || (str = ixj0.h(arrayList)) == null) && (str = documentAttachment.h) == null) {
                str = "";
            }
            this.c = str;
            String str2 = documentAttachment.g;
            this.d = str2;
            String str3 = documentAttachment.q;
            this.e = str3 != null ? str3 : "";
            this.f = str2;
            this.g = Collections.singletonList(str);
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String a() {
            return this.c;
        }

        @Override // com.vk.photoviewer.PhotoViewer.e
        public final String b() {
            return this.e;
        }

        @Override // com.vk.photoviewer.PhotoViewer.e
        public final String c() {
            return this.f;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String e() {
            return this.d;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final List<String> f() {
            return this.g;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getHeight() {
            return this.b;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getWidth() {
            return this.a;
        }
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class e implements PhotoViewer.n {
        public final yg5 a;
        public final int b;
        public final int c;
        public final String d;
        public final String e;
        public final List<String> f;

        public e(DocumentAttachment documentAttachment, yg5 yg5Var) {
            String str;
            ArrayList arrayList;
            this.a = yg5Var;
            this.b = documentAttachment.l;
            this.c = documentAttachment.m;
            Image image = documentAttachment.s;
            if ((image == null || (arrayList = image.b) == null || (str = ixj0.h(arrayList)) == null) && (str = documentAttachment.h) == null) {
                str = "";
            }
            this.d = str;
            this.e = documentAttachment.g;
            this.f = Collections.singletonList(str);
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String a() {
            return this.d;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String e() {
            return this.e;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final List<String> f() {
            return this.f;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getHeight() {
            return this.c;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getWidth() {
            return this.b;
        }

        @Override // com.vk.photoviewer.PhotoViewer.n
        public final yg5 j() {
            return this.a;
        }
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class f implements PhotoViewer.h {
        public final VideoFile a;
        public final long b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;
        public final List<String> g;

        public f(VideoFile videoFile, long j) {
            this.a = videoFile;
            this.b = j;
            this.c = videoFile.getWidth();
            this.d = videoFile.getHeight();
            String T7 = videoFile.T7();
            this.e = T7 == null ? "" : T7;
            String T72 = videoFile.T7();
            this.f = T72 == null ? "" : T72;
            videoFile.T7();
            String T73 = videoFile.T7();
            this.g = Collections.singletonList(T73 != null ? T73 : "");
        }

        @Override // com.vk.photoviewer.PhotoViewer.h
        public final VideoFile A() {
            return this.a;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String a() {
            return this.e;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final String e() {
            return this.f;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final List<String> f() {
            return this.g;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getHeight() {
            return this.d;
        }

        @Override // com.vk.photoviewer.PhotoViewer.g
        public final int getWidth() {
            return this.c;
        }

        @Override // com.vk.photoviewer.PhotoViewer.h
        public final long y() {
            return this.b;
        }
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class g extends c {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(Nft nft) {
            super(r0, r2 != null ? r2.d.d : null);
            Photo photo = nft.e;
            ArrayList arrayList = photo.y.b;
            ImageSize imageSize = photo.J;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    public static PhotoViewer.g m(AttachmentWithMedia attachmentWithMedia, Long l) {
        ?? r1;
        String str;
        boolean z = attachmentWithMedia instanceof DocumentAttachment;
        if (z) {
            DocumentAttachment documentAttachment = (DocumentAttachment) attachmentWithMedia;
            if (documentAttachment.x5()) {
                yg5 Hb = documentAttachment.Hb();
                return (Hb == null || (str = documentAttachment.q) == null || !(drm0.N(str) ^ true)) ? new d(documentAttachment) : new e(documentAttachment, Hb);
            }
        }
        if (z) {
            DocumentAttachment documentAttachment2 = (DocumentAttachment) attachmentWithMedia;
            ImageSize imageSize = (ImageSize) ixj0.b(documentAttachment2.Db().b);
            List I = rl3.I(new ImageSize[]{imageSize != null ? imageSize.zb() : null, (ImageSize) ixj0.m(documentAttachment2.Db().b)});
            if (((ArrayList) I).isEmpty()) {
                ArrayList arrayList = documentAttachment2.Db().b;
                r1 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (mcr0.n(((ImageSize) next).getUrl())) {
                        r1.add(next);
                    }
                }
            } else {
                r1 = EmptyList.b;
            }
            return new c(j5g.u0((Iterable) r1, I), documentAttachment2.g);
        }
        if (attachmentWithMedia instanceof VideoAttachment) {
            VideoFile Jb = ((VideoAttachment) attachmentWithMedia).Jb();
            if (l != null) {
                return new f(Jb, l.longValue());
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (attachmentWithMedia instanceof NftAttachment) {
            return new g(((NftAttachment) attachmentWithMedia).Jb());
        }
        if (!(attachmentWithMedia instanceof PhotoAttachment)) {
            return new c(attachmentWithMedia.Db().b, null);
        }
        PhotoAttachment photoAttachment = (PhotoAttachment) attachmentWithMedia;
        ArrayList arrayList2 = photoAttachment.Db().b;
        ImageSize imageSize2 = photoAttachment.l.J;
        return new c(arrayList2, imageSize2 != null ? imageSize2.getUrl() : null);
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.e e(int i, List list, Activity activity, ImageViewer.a aVar, String str, String str2, boolean z, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint) {
        Activity h;
        b bVar = new b(i, list, activity, aVar, new pf(5), new nk(3), str, str2, mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, o25.a().c(), null, false, false, false, null, false, 251904);
        if (bVar.e().isEmpty() || bVar.b() == null || (h = e3m.h(bVar.b())) == null) {
            return null;
        }
        List e2 = bVar.e();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(m((AttachmentWithMedia) bVar.l().invoke(it.next()), null));
        }
        com.vk.photoviewer.b<?> n = n(bVar, h, bVar.e(), true, bVar.o(), false);
        PhotoViewer photoViewer = new PhotoViewer(bVar.f(), arrayList, bVar.b(), n, false, bVar.q(), 16);
        photoViewer.p();
        return new se6(photoViewer, n, bVar, this);
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.c g(int i, List list, Context context, ImageViewer.a aVar, UserId userId) {
        return l(new b(i, list, context, aVar, new rf(4), new gv3(1), null, null, null, userId, null, false, false, true, null, false, 227840));
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.c h(int i, List list, Activity activity, ImageViewer.a aVar, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, boolean z, UserId userId, String str3, boolean z2) {
        return l(new b(i, list, activity, aVar, new pf(5), new lt0(6), str, str2, mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, userId, null, false, z, true, str3, z2, 14848));
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.c i(int i, List list, Activity activity, ImageViewer.a aVar, Long l, final boolean z, UserId userId) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((AttachForMediaViewer) it.next()).G0() != AttachSyncState.DONE) {
                    return null;
                }
            }
        }
        boolean z2 = true;
        if (!com.vk.dto.common.b.a(l.longValue()) && !com.vk.dto.common.b.d(l.longValue()) && !com.vk.dto.common.b.b(l.longValue()) && !com.vk.dto.common.b.c(l.longValue())) {
            z2 = false;
        }
        return l(new b(i, list, activity, aVar, new izs() { // from class: xsna.pe6
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                return (AttachmentWithMedia) wdw.b((AttachForMediaViewer) obj, null, z, 2);
            }
        }, new com.vk.movika.sdk.base.utils.b(3), null, null, null, userId, l, z2, false, z, null, false, 221696));
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.c j(int i, List list, Context context, ImageViewer.a aVar, boolean z, UserId userId) {
        return l(new b(i, list, e3m.h(context), aVar, new z90(4), new xx0(3), null, null, null, userId, null, false, false, z, null, false, 227840));
    }

    @Override // com.vk.bridges.ImageViewer
    public final ImageViewer.c k(AttachWithImage attachWithImage, List list, Activity activity, ImageViewer.a aVar, boolean z, UserId userId) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((AttachWithImage) it.next()).G0() != AttachSyncState.DONE) {
                    return null;
                }
            }
        }
        Integer j = p4g.j(attachWithImage, list);
        return l(new b(j != null ? j.intValue() : 0, list, activity, aVar, new oe6(z, 0), new ci3(1), null, null, null, userId, null, false, false, z, null, false, 227840));
    }

    public final te6 l(b bVar) {
        Activity h;
        if (bVar.e().isEmpty() || bVar.b() == null || (h = e3m.h(bVar.b())) == null) {
            return null;
        }
        List e2 = bVar.e();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        Iterator it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(m((AttachmentWithMedia) bVar.l().invoke(it.next()), bVar.c()));
        }
        com.vk.core.utils.newtork.b.a.getClass();
        boolean z = !com.vk.core.utils.newtork.b.d() && bVar.o();
        com.vk.photoviewer.b<?> n = n(bVar, h, bVar.e(), false, bVar.o(), z);
        PhotoViewer photoViewer = new PhotoViewer(bVar.f(), arrayList, bVar.b(), n, z, false, 32);
        photoViewer.s();
        return new te6(photoViewer, n, bVar, this);
    }

    public final <T> com.vk.photoviewer.b<?> n(b<T> bVar, Activity activity, List<? extends T> list, boolean z, boolean z2, boolean z3) {
        re6 re6Var = new re6(new a(activity, bVar.a(), z, z2, z3, bVar.p()), bVar.a(), activity, list, bVar.l(), bVar.k(), bVar.m(), bVar.h(), bVar.d(), bVar.n(), bVar.c(), z2, bVar.i(), bVar.p(), bVar.g(), bVar.j());
        List<T> e2 = re6Var.e();
        izs l = re6Var.l();
        ArrayList arrayList = new ArrayList(c5g.u(e2, 10));
        Iterator<T> it = e2.iterator();
        while (it.hasNext()) {
            arrayList.add(l.invoke(it.next()));
        }
        idg0 idg0Var = new idg0(new bpn0(new skg(m7m.a(re6Var.a()), 0)), arrayList);
        if (!re6Var.o()) {
            return new z8u0(arrayList, re6Var.f(), re6Var.b(), re6Var.a(), re6Var.m(), re6Var.h(), re6Var.d(), re6Var.i(), re6Var.p(), re6Var.n(), idg0Var, tkg.a.a(re6Var), re6Var.g(), re6Var.j());
        }
        PhotoViewer.b f2 = re6Var.f();
        Activity a2 = re6Var.a();
        ImageViewer.a b2 = re6Var.b();
        kbj0 b3 = nr4.b();
        List<T> e3 = re6Var.e();
        izs k = re6Var.k();
        ArrayList arrayList2 = new ArrayList(c5g.u(e3, 10));
        Iterator<T> it2 = e3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k.invoke(it2.next()));
        }
        return new q3v0(f2, a2, b2, b3, arrayList2, re6Var.c(), re6Var.p(), re6Var.n(), idg0Var, tkg.a.a(re6Var));
    }

    /* compiled from: BaseImageViewer.kt */
    /* loaded from: classes7.dex */
    public static final class a implements PhotoViewer.b {
        public final Activity b;
        public final ImageViewer.a c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public a(Activity activity, ImageViewer.a aVar, boolean z, boolean z2, boolean z3, boolean z4) {
            this.b = activity;
            this.c = aVar;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void A() {
            this.c.o();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View B(fnw fnwVar, int i) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View D(PhotoViewerLayout photoViewerLayout) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View E(ViewGroup viewGroup, int i, gzs<s3q0> gzsVar) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int F(int i) {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void H(PhotoViewer photoViewer) {
            this.c.p();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean J() {
            return this.c.s();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final ImageRequest K(PhotoViewer.g gVar) {
            if (!this.d) {
                return null;
            }
            ImageRequestBuilder h = ImageRequestBuilder.h(Uri.parse(gVar.e()));
            h.j = Priority.MEDIUM;
            return h.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] L() {
            return r(0);
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean N() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean O() {
            return this.f;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Rect a() {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void b(int i) {
            this.c.b(i);
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final View c(int i) {
            return this.c.c(i);
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect d(int i) {
            return this.c.d(i);
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void e(int i) {
            this.c.e(i);
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final Integer f() {
            return this.c.f();
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final Rect g() {
            return this.c.g();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean h() {
            return true;
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void j(PhotoViewer photoViewer) {
            this.c.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final WindowManager.LayoutParams k() {
            RectF rectF = PhotoViewer.U;
            return PhotoViewer.c.a();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean l() {
            return this.g;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final String m(int i, int i2) {
            if (this.e) {
                return "";
            }
            String m = this.c.m(i, i2);
            if (m != null) {
                return m;
            }
            return this.b.getString(R.string.player_num, Integer.valueOf(i + 1), Integer.valueOf(i2));
        }

        @Override // com.vk.photoviewer.PhotoViewer.a
        public final void onDismiss() {
            this.c.onDismiss();
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final String p(int i, int i2) {
            if (this.c.m(i, i2) == null) {
                return null;
            }
            return this.b.getString(R.string.player_num, Integer.valueOf(i + 1), Integer.valueOf(i2));
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final float[] r(int i) {
            njt hierarchy;
            ImageViewer.a aVar = this.c;
            float[] q = aVar.q(i);
            if (q != null) {
                return q;
            }
            View c = aVar.c(i);
            if (c != null) {
                RoundingParams roundingParams = c instanceof FrescoImageView ? ((FrescoImageView) c).getHierarchy().c : c instanceof GenericDraweeView ? ((GenericDraweeView) c).getHierarchy().c : (!(c instanceof VKImageView) || (hierarchy = ((VKImageView) c).getHierarchy()) == null) ? null : hierarchy.c;
                if (roundingParams != null) {
                    if (!roundingParams.b) {
                        return roundingParams.c;
                    }
                    float width = c.getWidth() / 2.0f;
                    float[] fArr = new float[8];
                    for (int i2 = 0; i2 < 8; i2++) {
                        fArr[i2] = width;
                    }
                    return fArr;
                }
            }
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final View s(ViewGroup viewGroup) {
            return null;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean t(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean u(int i) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean v() {
            return this.e;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final boolean w(PhotoViewer.g gVar, int i, MenuItem menuItem, View view) {
            return false;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final int z() {
            return 0;
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void C(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void P(boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void i(int i) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void M(ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void n(int i, PhotoViewer.q qVar) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void y(int i, ViewGroup viewGroup) {
        }

        @Override // com.vk.photoviewer.PhotoViewer.b
        public final void o(PhotoViewer.g gVar, int i, Menu menu) {
        }
    }
}
