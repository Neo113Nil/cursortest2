package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.util.ArrayMap;
import android.view.View;
import android.webkit.URLUtil;
import com.vk.bridges.ImageViewer;
import com.vk.core.apps.BuildInfo;
import com.vk.core.simplescreen.ScreenContainer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.photo.Photo;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.pending.PendingPhotoAttachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.MarketAlbumAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: AttachmentEditorViewer.kt */
/* loaded from: classes7.dex */
public final class o84 implements d84 {
    public final Activity a;
    public final g94 b;
    public final gzs<Boolean> c;
    public final g760 d;
    public final String e;
    public final ymw f;
    public final gzs<Boolean> g;
    public final gzs<Boolean> h;
    public final gzs<Boolean> i;
    public final gzs<Long> j;
    public ImageViewer.c<?> l;
    public s4p m;
    public final a o;
    public s0y0 p;
    public final ArrayMap<String, Photo> k = new ArrayMap<>();
    public final Object n = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.h(this, 4));

    /* compiled from: AttachmentEditorViewer.kt */
    public static final class a extends ja0 {
        public a() {
        }

        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity.equals(o84.this.a)) {
                activity.getApplication().unregisterActivityLifecycleCallbacks(this);
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            em6 currentScreen;
            o84 o84Var = o84.this;
            ?? r1 = o84Var.n;
            if (activity.equals(o84Var.a) && r1.isInitialized() && (currentScreen = ((com.vk.core.simplescreen.a) r1.getValue()).b.getCurrentScreen()) != null) {
                currentScreen.i();
            }
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.ja0, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            em6 currentScreen;
            o84 o84Var = o84.this;
            ?? r1 = o84Var.n;
            if (!activity.equals(o84Var.a) || !r1.isInitialized() || (currentScreen = ((com.vk.core.simplescreen.a) r1.getValue()).b.getCurrentScreen()) == null || currentScreen.d) {
                return;
            }
            currentScreen.j();
        }
    }

    public o84(Activity activity, g94 g94Var, gzs<Boolean> gzsVar, g760 g760Var, String str, ymw ymwVar, gzs<Boolean> gzsVar2, gzs<Boolean> gzsVar3, gzs<Boolean> gzsVar4, gzs<Long> gzsVar5) {
        this.a = activity;
        this.b = g94Var;
        this.c = gzsVar;
        this.d = g760Var;
        this.e = str;
        this.f = ymwVar;
        this.g = gzsVar2;
        this.h = gzsVar3;
        this.i = gzsVar4;
        this.j = gzsVar5;
        a aVar = new a();
        this.o = aVar;
        activity.getApplication().registerActivityLifecycleCallbacks(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public static void i(o84 o84Var, File file, int i, l84 l84Var, SpoilerConfiguration spoilerConfiguration, int i2) {
        ?? r8 = o84Var.n;
        T t = (i2 & 4) != 0 ? 0 : l84Var;
        SpoilerConfiguration spoilerConfiguration2 = (i2 & 8) != 0 ? new SpoilerConfiguration(false, false, false, false, false, null, 63, null) : spoilerConfiguration;
        g760 g760Var = o84Var.d;
        if (g760Var != null && o84Var.m == null) {
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = t;
            com.vk.attachpicker.screen.h c = o84Var.d.c(file, null, new q84(o84Var, i, ref$ObjectRef), (com.vk.core.simplescreen.a) r8.getValue(), o84Var.e, new p84(2, o84Var, o84.class, "startActivityForResultOnFragment", "startActivityForResultOnFragment(ILandroid/content/Intent;)V", 0, 0), spoilerConfiguration2);
            o84Var.m = c;
            g760Var.a(o84Var.a, c, (com.vk.core.simplescreen.a) r8.getValue(), new kg(4, o84Var, ref$ObjectRef));
        }
    }

    @Override // xsna.d84
    public final void a(PhotoAttachment photoAttachment) {
        if (photoAttachment == null) {
            return;
        }
        if (this.c.invoke().booleanValue()) {
            h(photoAttachment, new cy0(1, this, photoAttachment));
        } else {
            k(photoAttachment);
        }
    }

    @Override // xsna.d84
    public final void b(VideoAttachment videoAttachment) {
        VideoFile videoFile;
        if (videoAttachment == null || (videoFile = videoAttachment.k) == null) {
            return;
        }
        l(videoFile);
    }

    @Override // xsna.d84
    public final void c(PendingVideoAttachment pendingVideoAttachment) {
        VideoFile videoFile;
        if (pendingVideoAttachment == null || (videoFile = pendingVideoAttachment.k) == null) {
            return;
        }
        l(videoFile);
    }

    @Override // xsna.d84
    public final void d(PendingPhotoAttachment pendingPhotoAttachment) {
        if (pendingPhotoAttachment == null) {
            return;
        }
        if (this.c.invoke().booleanValue()) {
            g(pendingPhotoAttachment, new m84(0, this, pendingPhotoAttachment));
        } else {
            k(pendingPhotoAttachment);
        }
    }

    public final Photo e(Attachment attachment) {
        if (attachment instanceof PhotoAttachment) {
            return ((PhotoAttachment) attachment).l;
        }
        if (!(attachment instanceof PendingPhotoAttachment)) {
            return null;
        }
        PendingPhotoAttachment pendingPhotoAttachment = (PendingPhotoAttachment) attachment;
        String str = pendingPhotoAttachment.f;
        String str2 = pendingPhotoAttachment.f;
        ArrayMap<String, Photo> arrayMap = this.k;
        if (arrayMap.containsKey(str)) {
            return arrayMap.get(str2);
        }
        m900<String, ImageSize> m900Var = ImageSize.e;
        Photo photo = new Photo(new Image((List<ImageSize>) Collections.singletonList(new ImageSize(pendingPhotoAttachment.f, pendingPhotoAttachment.g, pendingPhotoAttachment.h, Boolean.FALSE, ImageSize.b.c(pendingPhotoAttachment.g, pendingPhotoAttachment.h), false, 32, null))));
        arrayMap.put(str2, photo);
        return photo;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void f() {
        this.a.getApplication().unregisterActivityLifecycleCallbacks(this.o);
        Object obj = this.m;
        em6 em6Var = obj instanceof em6 ? (em6) obj : null;
        if (em6Var != null) {
            em6Var.c();
        }
        this.m = null;
        ScreenContainer screenContainer = ((com.vk.core.simplescreen.a) this.n.getValue()).b;
        ArrayList<em6> arrayList = screenContainer.e;
        while (!arrayList.isEmpty()) {
            screenContainer.c((em6) xy9.b(1, arrayList));
        }
        screenContainer.c = null;
    }

    public final void g(PendingPhotoAttachment pendingPhotoAttachment, gzs<s3q0> gzsVar) {
        String str;
        Uri parse;
        String path;
        g760 g760Var = this.d;
        if (g760Var == null || (str = pendingPhotoAttachment.f) == null || (parse = Uri.parse(str)) == null || (path = parse.getPath()) == null) {
            return;
        }
        File file = new File(path);
        if (g760Var.b(file)) {
            i(this, file, this.b.d(pendingPhotoAttachment), null, new SpoilerConfiguration(this.g.invoke().booleanValue(), pendingPhotoAttachment.l != null, pendingPhotoAttachment.m, this.h.invoke().booleanValue(), this.i.invoke().booleanValue(), this.j.invoke()), 4);
        } else {
            gzsVar.invoke();
        }
    }

    public final void h(PhotoAttachment photoAttachment, gzs<s3q0> gzsVar) {
        Uri parse;
        g760 g760Var = this.d;
        if (g760Var == null) {
            return;
        }
        String str = photoAttachment.o;
        if (str == null) {
            str = photoAttachment.l.t;
        }
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        boolean isFileUrl = URLUtil.isFileUrl(parse.toString());
        g94 g94Var = this.b;
        if (!isFileUrl && !URLUtil.isContentUrl(parse.toString())) {
            int d = g94Var.d(photoAttachment);
            int i = 4;
            itg0.a(this.a, hg1.m(mcr0.h(parse).U(new bl(new jr3(1), i)), this.a, 0L, true, 38).a0(asu0.a.d()).subscribe(new um0(new es2(this, d, 1), 2), new wf1(new ot(4), i)));
            return;
        }
        String path = parse.getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        int d2 = g94Var.d(photoAttachment);
        if (g760Var.b(file)) {
            i(this, file, d2, null, new SpoilerConfiguration(this.g.invoke().booleanValue(), photoAttachment.w != null, photoAttachment.v, this.h.invoke().booleanValue(), this.i.invoke().booleanValue(), this.j.invoke()), 4);
        } else {
            gzsVar.invoke();
        }
    }

    public final void j(int i, List list) {
        ImageViewer.c<?> g;
        if (this.l != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Photo) obj).c != 0) {
                arrayList.add(obj);
            }
        }
        int e = on00.e(c5g.u(arrayList, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Photo photo = (Photo) it.next();
            Pair pair = new Pair(Integer.valueOf(photo.c), new v84(i7o0.a(photo.x), photo.r, photo.m));
            linkedHashMap.put(pair.i(), pair.j());
        }
        g = myc0.d().g(i, list, bwt0.u(this.a), new b(linkedHashMap), o25.a().c());
        this.l = g;
    }

    public final void k(Attachment attachment) {
        Photo e;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Attachment attachment2 : this.b.getAll()) {
            if (!(attachment2 instanceof AlbumAttachment) && !(attachment2 instanceof MarketAlbumAttachment) && (e = e(attachment2)) != null) {
                arrayList.add(e);
                if (epx.f(attachment2, attachment)) {
                    i = arrayList.size() - 1;
                }
            }
        }
        j(i, arrayList);
    }

    public final void l(VideoFile videoFile) {
        if (videoFile.Q0() && videoFile.w9().Ab(VideoUrl.EXTERNAL_URL) == null) {
            return;
        }
        if (!videoFile.isEmpty() || !fkq0.c(videoFile.I0())) {
            bay.c().l(this.a, videoFile);
            return;
        }
        w1s0.g(this.a, videoFile.I0(), videoFile.o0(), videoFile.C1(), videoFile.C2(), false, false, new j20(2, this, videoFile), 224);
    }

    /* compiled from: AttachmentEditorViewer.kt */
    public static final class b implements ImageViewer.a {
        public final /* synthetic */ LinkedHashMap b;

        public b(LinkedHashMap linkedHashMap) {
            this.b = linkedHashMap;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return o84.this.f.j();
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            o84 o84Var = o84.this;
            o84Var.l = null;
            o84Var.b.j(this.b);
            if (BuildInfo.q()) {
                return;
            }
            dhr0.r0(o84Var.a);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return o84.this.m == null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
            Object obj;
            boolean z;
            Image image;
            ArrayList arrayList;
            com.vk.movika.sdk.base.model.props.d dVar = new com.vk.movika.sdk.base.model.props.d(5);
            o84 o84Var = o84.this;
            Iterator<T> it = o84Var.b.getAll().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Attachment attachment = (Attachment) next;
                if (attachment instanceof PhotoAttachment) {
                    z = epx.f(((PhotoAttachment) attachment).l.t, photo != null ? photo.t : null);
                } else {
                    if (attachment instanceof PendingPhotoAttachment) {
                        if (photo != null && (image = photo.y) != null && (arrayList = image.b) != null) {
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                Object next2 = it2.next();
                                if (epx.f(((ImageSize) next2).d.d, ((PendingPhotoAttachment) attachment).f)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            obj = (ImageSize) obj;
                        }
                        if (obj != null) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            Attachment attachment2 = (Attachment) obj;
            if (attachment2 instanceof PendingPhotoAttachment) {
                o84Var.g((PendingPhotoAttachment) attachment2, dVar);
            } else if (attachment2 instanceof PhotoAttachment) {
                o84Var.h((PhotoAttachment) attachment2, dVar);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.ControlsOptions u() {
            ImageViewer.ControlsOptions n = bay.c().n();
            ymw ymwVar = o84.this.f;
            boolean a = ymwVar.a();
            Set<ImageViewer.ControlsOptions.MenuItem> b = ymwVar.b();
            Boolean c = ymwVar.c();
            return ImageViewer.ControlsOptions.a(n, a, b, c != null ? c.booleanValue() : n.f, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
