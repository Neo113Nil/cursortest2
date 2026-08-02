package xsna;

import android.content.Context;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.base.Document;
import com.vk.api.video.VideoSave;
import com.vk.bridges.ImageViewer;
import com.vk.dto.attaches.CarouselRatio;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.VideoUrlStorage;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.ImageCropData;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.media.MediaUtils;
import com.vk.newsfeed.api.posting.viewpresenter.CropsForRatio;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.newsfeed.common.recycler.holders.zhukov.CropableImageContainer;
import com.vk.pending.PendingDocumentAttachment;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vk.posting.domain.PostingMetricsCreationEntryPoint;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.LazyThreadSafetyMode;
import xsna.fhc0;

/* compiled from: AttachmentsPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class z84 implements ik6, o9q0 {
    public final qdc0 b;
    public final b94 c;
    public final tfa0 d;
    public final fhc0.a e;
    public final g760 f;
    public final jbc0 g;
    public final fhc0 h;
    public PostingMetricsCreationEntryPoint i;
    public final zbc0 j;
    public final Object k;
    public Object l;
    public o84 m;
    public final ov9 n;
    public final boolean o;
    public final lu9 p;
    public final ArrayList q;
    public final Object r;
    public final ArrayList s;
    public boolean t;

    /* compiled from: AttachmentsPostingPresenter.kt */
    public static final class a {
        public final String a;
        public boolean b = false;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DownloadStatus(id=");
            sb.append(this.a);
            sb.append(", isLoaded=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: AttachmentsPostingPresenter.kt */
    public final class b implements ymw {
        public b() {
        }

        @Override // xsna.ymw
        public final boolean a() {
            return true;
        }

        @Override // xsna.ymw
        public final Set<ImageViewer.ControlsOptions.MenuItem> b() {
            return rl3.y0(new ImageViewer.ControlsOptions.MenuItem[]{ImageViewer.ControlsOptions.MenuItem.OPEN_PHOTO_EDITOR, ImageViewer.ControlsOptions.MenuItem.ATTACH_GOOD, ImageViewer.ControlsOptions.MenuItem.ATTACH_MARKET_SERVICE});
        }

        @Override // xsna.ymw
        public final Boolean c() {
            return null;
        }

        @Override // xsna.ymw
        public final Context j() {
            return bwt0.u(z84.this.c.b);
        }
    }

    /* compiled from: AttachmentsPostingPresenter.kt */
    public static final class c implements g94 {
        public c() {
        }

        @Override // xsna.g94
        public final int d(Attachment attachment) {
            return ((ArrayList) z84.this.u()).indexOf(attachment);
        }

        @Override // xsna.g94
        public final void g(PendingPhotoAttachment pendingPhotoAttachment, Integer num) {
            b94 b94Var = z84.this.c;
            ArrayList arrayList = new ArrayList(b94Var.h());
            arrayList.add(num != null ? num.intValue() : ((ArrayList) r1).size() - 1, pendingPhotoAttachment);
            qcc0 qcc0Var = b94Var.m;
            ArrayList arrayList2 = new ArrayList(qcc0Var.C.u());
            Collections.reverse(arrayList2);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                qcc0Var.C.n2((Attachment) it.next());
                jbc0 jbc0Var = b94Var.f;
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
            }
            b94Var.f(arrayList);
        }

        @Override // xsna.g94
        public final List<Attachment> getAll() {
            return z84.this.u();
        }

        @Override // xsna.g94
        public final void i(int i) {
            b94 b94Var = z84.this.c;
            Attachment attachment = (Attachment) j5g.b0(i, b94Var.h());
            if (attachment != null) {
                b94Var.m(attachment);
            }
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.g94
        public final void j(LinkedHashMap linkedHashMap) {
            z84 z84Var = z84.this;
            if (z84Var.t) {
                List<Attachment> u = z84Var.u();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) u).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof PhotoAttachment) {
                        arrayList.add(next);
                    }
                }
                akc0 akc0Var = (akc0) z84Var.r.getValue();
                akc0Var.getClass();
                z84Var.b.a(io.reactivex.rxjava3.core.q.O(arrayList).L(new uf20(new qb6(25, linkedHashMap, akc0Var), 6), false).subscribe(new io1(new ul1(z84Var, 6), 3)));
            }
        }
    }

    public z84(qdc0 qdc0Var, b94 b94Var, tfa0 tfa0Var, fhc0.a aVar, g760 g760Var, jbc0 jbc0Var, fhc0 fhc0Var, PostingMetricsCreationEntryPoint postingMetricsCreationEntryPoint, ndc0 ndc0Var, j5d0 j5d0Var, zbc0 zbc0Var) {
        this.b = qdc0Var;
        this.c = b94Var;
        this.d = tfa0Var;
        this.e = aVar;
        this.f = g760Var;
        this.g = jbc0Var;
        this.h = fhc0Var;
        this.i = postingMetricsCreationEntryPoint;
        this.j = zbc0Var;
        x84 x84Var = new x84(0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, x84Var);
        this.n = new ov9(this);
        boolean z = ndc0Var.a;
        this.o = z;
        this.p = z ? new lu9(this, j5d0Var, pla.e().b(), zbc0Var) : null;
        b94Var.p = this;
        this.q = new ArrayList();
        this.r = msy.a(lazyThreadSafetyMode, new y84(0));
        this.s = new ArrayList();
    }

    public final boolean Bc(int i) {
        int i2;
        ArrayList arrayList = (ArrayList) u();
        if (arrayList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it = arrayList.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (((Attachment) it.next()).Ab() == i && (i2 = i2 + 1) < 0) {
                    e43.s();
                    throw null;
                }
            }
        }
        return i == 4 ? i2 >= 1 : !(i == 7 ? i2 < 4 : i == 8 ? i2 < 1 : i2 < this.b.fe());
    }

    public final void D0(Attachment attachment) {
        b94 b94Var = this.c;
        b94Var.m(attachment);
        lu9 lu9Var = this.p;
        if (lu9Var != null) {
            int i = b94Var.i();
            b94Var.h();
            bgd bgdVar = lu9Var.f;
            lu9Var.n = i;
            boolean z = attachment instanceof PhotoAttachment;
            if (z) {
                String Hb = ((PhotoAttachment) attachment).Hb();
                ArrayList arrayList = (ArrayList) bgdVar.a;
                final cjk cjkVar = new cjk(Hb, 0);
                arrayList.removeIf(new Predicate() { // from class: xsna.djk
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ((Boolean) cjk.this.invoke(obj)).booleanValue();
                    }
                });
            }
            h5 h5Var = new h5(lu9Var, 18);
            if (z) {
                h5Var.invoke(Float.valueOf(((PhotoAttachment) attachment).E0()));
            } else if (attachment instanceof PendingPhotoAttachment) {
                PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
                h5Var.invoke(Float.valueOf(pendingPhotoAttachment.g / pendingPhotoAttachment.h));
            } else if (attachment instanceof DocumentAttachment) {
                Boolean b2 = lu9Var.d.b((DocumentAttachment) attachment);
                if (b2 != null ? b2.booleanValue() : false) {
                    h5Var.invoke(Float.valueOf(fdi.u(attachment)));
                }
            }
            if (i == 0) {
                lu9Var.m = "";
                lu9Var.e = null;
                ((ArrayList) bgdVar.a).clear();
            }
            if (i == 1) {
                lu9Var.a.h1(false);
            }
        }
        this.n.a(b94Var.i());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, xsna.qv9] */
    public final void I1(boolean z) {
        ?? r0 = this.l;
        if (r0 != 0) {
            r0.c(z);
        }
    }

    @Override // xsna.o9q0
    public final void P6(int i, Throwable th) {
        this.b.P6(i, th);
    }

    @Override // xsna.o9q0
    public final void X3(int i, Attachment attachment) {
        if (this.o) {
            x(attachment);
        }
        this.b.X3(i, attachment);
    }

    public final void Y0(boolean z) {
        RecyclerView recyclerView = this.c.n;
        if (recyclerView != null) {
            bwt0.p0(recyclerView, z);
        }
    }

    public final int Z() {
        b94 b94Var = this.c;
        ArrayList arrayList = b94Var.s;
        qcc0 qcc0Var = b94Var.m;
        return this.s.size() + (!qcc0Var.C.u().isEmpty() ? qcc0Var.C.u().size() : !c5g.v(arrayList).isEmpty() ? c5g.v(arrayList).size() : 0);
    }

    @Override // xsna.o9q0
    public final void a4(ju90<?> ju90Var, int i) {
        this.b.a4(ju90Var, i);
    }

    public final PendingVideoAttachment d0(String str) {
        MediaUtils.f d;
        Uri parse = Uri.parse(str);
        String n = com.vk.core.files.a.n(parse);
        if (n != null && n.length() != 0) {
            Uri f = oeq0.f(parse, jeq0.g(n));
            ArrayList arrayList = (ArrayList) u();
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Attachment attachment = (Attachment) it.next();
                    if (!(attachment instanceof VideoAttachment) || !epx.f(f.toString(), ((VideoAttachment) attachment).k.w9().Ab(VideoUrl.EXTERNAL_URL))) {
                    }
                }
            }
            if (oeq0.e(f)) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                d = MediaUtils.a.c(context, f, false);
            } else {
                d = MediaUtils.a.d(str);
            }
            if (d == null) {
                d = MediaUtils.a.d(drm0.U(str, "file://"));
            }
            int i = (d != null ? d.f : 0) / 1000;
            int i2 = d != null ? d.a : 0;
            int i3 = d != null ? d.b : 0;
            VideoFileOld videoFileOld = new VideoFileOld();
            videoFileOld.p0 = hd60.a().a().r();
            videoFileOld.q0 = hd60.a().a().u();
            videoFileOld.q = (int) (System.currentTimeMillis() / 1000);
            videoFileOld.e = i;
            HashMap hashMap = new HashMap();
            VideoUrl videoUrl = VideoUrl.EXTERNAL_URL;
            String uri = f.toString();
            if (uri != null) {
                String str2 = myc0.f(uri) ? uri : null;
                if (str2 != null) {
                    VideoUrlStorage.b bVar = VideoUrlStorage.c;
                    VideoUrlStorage.d.b(hashMap, videoUrl, str2);
                }
            }
            videoFileOld.f = new VideoUrlStorage(hashMap);
            String lastPathSegment = Uri.parse(n).getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            videoFileOld.l = lastPathSegment;
            videoFileOld.c = com.vk.upload.impl.a.d.getAndIncrement();
            videoFileOld.I = false;
            videoFileOld.B = false;
            videoFileOld.C = false;
            videoFileOld.I0 = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(f.toString(), i2, i3, null, (char) 0, false, 56, null)));
            videoFileOld.m0 = i2;
            videoFileOld.n0 = i3;
            PendingVideoAttachment pendingVideoAttachment = new PendingVideoAttachment(videoFileOld, VideoSave.Target.POST, this.b.Qj());
            pendingVideoAttachment.s = i2;
            pendingVideoAttachment.t = i3;
            return pendingVideoAttachment;
        }
        return null;
    }

    public final void e0(mfk mfkVar) {
        boolean z = mfkVar.b;
        boolean z2 = mfkVar.c;
        boolean z3 = true;
        lu9 lu9Var = this.p;
        if (lu9Var != null) {
            lu9Var.g = z2 || z;
            if (mfkVar.a) {
                lu9Var.k = new thk(lu9Var.c, lu9Var.h, lu9Var.b, new ec(lu9Var, 17));
            }
            String str = mfkVar.f;
            if (str == null) {
                str = "";
            }
            lu9Var.m = str;
            PreviewRatio previewRatio = mfkVar.d;
            if (previewRatio != null) {
                lu9Var.b(previewRatio);
                thk thkVar = lu9Var.k;
                if (thkVar != null) {
                    thkVar.e = previewRatio;
                }
                List<ImageCropData> list = mfkVar.e;
                if (list != null) {
                    ((ArrayList) lu9Var.f.a).addAll(list);
                }
            }
        }
        ov9 ov9Var = this.n;
        ov9Var.b = !z;
        if (!z2 && !z) {
            z3 = false;
        }
        ov9Var.c = z3;
    }

    public final boolean f0(Document document) {
        List<Attachment> u = u();
        if (u.isEmpty()) {
            return false;
        }
        for (Attachment attachment : u) {
            if (attachment instanceof DocumentAttachment) {
                DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                if (document.b == documentAttachment.k && epx.f(document.h, documentAttachment.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g0(PendingDocumentAttachment pendingDocumentAttachment) {
        List<Attachment> u = u();
        if (u.isEmpty()) {
            return false;
        }
        for (Attachment attachment : u) {
            if ((attachment instanceof DocumentAttachment) && epx.f(((DocumentAttachment) attachment).g, pendingDocumentAttachment.g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h0(MusicTrack musicTrack) {
        List<Attachment> u = u();
        if (u.isEmpty()) {
            return false;
        }
        for (Attachment attachment : u) {
            if ((attachment instanceof AudioAttachment) && musicTrack.equals(((AudioAttachment) attachment).f)) {
                return true;
            }
        }
        return false;
    }

    public final void h1(boolean z) {
        eye0 eye0Var;
        b4d0 t2 = this.c.m.C.t2();
        if (t2 == null || (eye0Var = t2.P) == null) {
            return;
        }
        bwt0.p0(eye0Var, z);
    }

    public final boolean i0(String str) {
        List<Attachment> u = u();
        if (u.isEmpty()) {
            return false;
        }
        for (Attachment attachment : u) {
            if ((attachment instanceof PhotoAttachment) && str.equals(((PhotoAttachment) attachment).o)) {
                return true;
            }
            if ((attachment instanceof PendingPhotoAttachment) && str.equals(((PendingPhotoAttachment) attachment).f)) {
                return true;
            }
        }
        return false;
    }

    public final void i1(PreviewRatio previewRatio) {
        b94 b94Var = this.c;
        a94 a94Var = new a94(0, b94Var, previewRatio);
        if (!ify.e(ify.c)) {
            a94Var.invoke();
        } else {
            mhy.b(b94Var.b);
            ify.a(new e94(a94Var));
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onResume() {
        throw null;
    }

    @Override // xsna.ik6
    public final void onStart() {
        int i = 0;
        this.m = new o84(this.c.b, new c(), new c24(i), this.f, "posting", new b(), new c24(i), new c24(i), new c24(i), n84.b);
    }

    @Override // xsna.ik6
    public final void onStop() {
        o84 o84Var = this.m;
        if (o84Var != null) {
            o84Var.f();
        }
        this.m = null;
    }

    public final boolean p0(VideoFile videoFile) {
        List<Attachment> u = u();
        if (u.isEmpty()) {
            return false;
        }
        for (Attachment attachment : u) {
            if ((attachment instanceof VideoAttachment) && epx.f(videoFile.r1(), ((VideoAttachment) attachment).k.r1())) {
                return true;
            }
        }
        return false;
    }

    public final void r1(boolean z) {
        CropableImageContainer cropableImageContainer;
        b4d0 t2 = this.c.m.C.t2();
        if (t2 != null) {
            ror rorVar = t2.N;
            if (t2.D || z != rorVar.h) {
                t2.Q.c = !z;
                int i = z ? t2.M : t2.L;
                rorVar.setPadding(i, 0, i, 0);
                rorVar.setSpacing(z ? cn70.b(2) : cn70.b(4));
                if (rorVar.c && z && rorVar.getChildCount() > 1 && (cropableImageContainer = rorVar.v) != null) {
                    bwt0.p0(cropableImageContainer.c, false);
                }
                rorVar.h = z;
                rorVar.m = rorVar.l.b(z, rorVar.g);
                rorVar.requestLayout();
                rorVar.invalidate();
                t2.U6(rorVar, z);
            }
        }
    }

    public final List<Attachment> u() {
        return j5g.u0(this.s, this.c.h());
    }

    public final void u0(Attachment attachment) {
        boolean z;
        String str;
        if (attachment == null || ((z = attachment instanceof PendingVideoAttachment))) {
            return;
        }
        if (attachment instanceof PendingPhotoAttachment) {
            o84 o84Var = this.m;
            if (o84Var != null) {
                o84Var.d((PendingPhotoAttachment) attachment);
                return;
            }
            return;
        }
        if (z) {
            o84 o84Var2 = this.m;
            if (o84Var2 != null) {
                o84Var2.c((PendingVideoAttachment) attachment);
                return;
            }
            return;
        }
        if (attachment instanceof AlbumAttachment) {
            this.d.getClass();
            PhotoAlbum b2 = tfa0.b((AlbumAttachment) attachment);
            o84 o84Var3 = this.m;
            if (o84Var3 != null) {
                bay.c().d(o84Var3.a, b2);
                return;
            }
            return;
        }
        if (attachment instanceof PhotoAttachment) {
            o84 o84Var4 = this.m;
            if (o84Var4 != null) {
                o84Var4.a((PhotoAttachment) attachment);
                return;
            }
            return;
        }
        if (attachment instanceof VideoAttachment) {
            o84 o84Var5 = this.m;
            if (o84Var5 != null) {
                o84Var5.b((VideoAttachment) attachment);
                return;
            }
            return;
        }
        if (attachment instanceof DocumentAttachment) {
            o84 o84Var6 = this.m;
            if (o84Var6 != null) {
                DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
                if (documentAttachment.Ib()) {
                    bay.c().g(o84Var6.a, documentAttachment.Jb());
                    return;
                }
                return;
            }
            return;
        }
        if (!(attachment instanceof ArticleAttachment)) {
            if (attachment instanceof f010) {
                this.b.Te();
            }
        } else {
            o84 o84Var7 = this.m;
            if (o84Var7 == null || (str = ((ArticleAttachment) attachment).f.i) == null) {
                return;
            }
            bay.c().k(o84Var7.a, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void x(Attachment attachment) {
        if (!(attachment instanceof PhotoAttachment) || (attachment instanceof AlbumAttachment)) {
            return;
        }
        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
        ((Map) this.k.getValue()).put(photoAttachment.Hb(), new a(photoAttachment.Hb()));
    }

    public final void x0(CropsForRatio cropsForRatio) {
        qcc0 qcc0Var = this.c.m;
        l5d0 l5d0Var = qcc0Var.D;
        l5d0Var.getClass();
        PreviewRatio b2 = cropsForRatio.b();
        float b3 = b2.b() / b2.a();
        l5d0Var.c = new CarouselRatio(b3, b3);
        b4d0 t2 = qcc0Var.C.t2();
        if (t2 != null) {
            eye0 eye0Var = t2.P;
            if (eye0Var != null) {
                eye0Var.setRatioText(cropsForRatio.b());
            }
            t2.N.setCurrentPlacement(cropsForRatio);
        }
    }

    public final void z() {
        ov9 ov9Var = this.n;
        z84 z84Var = ov9Var.a;
        if (ov9Var.d) {
            boolean z = ov9Var.c;
            boolean z2 = !z;
            ov9Var.c = z2;
            lu9 lu9Var = z84Var.p;
            if (lu9Var != null) {
                lu9Var.g = z2;
                z84 z84Var2 = lu9Var.a;
                z84Var2.h1(z);
                if (z) {
                    PreviewRatio previewRatio = lu9Var.j;
                    if (previewRatio != null) {
                        z84Var2.i1(previewRatio);
                        lu9Var.j = null;
                    }
                    lu9Var.d();
                }
            }
            SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
            z84Var.g.g();
            z84Var.r1(ov9Var.c);
            z84Var.I1(ov9Var.c);
        }
    }
}
