package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.clips.external.ClipsDuetInfo;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.masks.MaskLight;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.dto.clips.upload.ClipEditorSizeParams;
import com.vk.dto.clips.upload.ClipTemplateInfo;
import com.vk.dto.clips.upload.ClipsEditorEntry;
import com.vk.dto.clips.upload.ClipsEditorUploadParams;
import com.vk.dto.common.id.UserId;
import com.vk.media.MediaUtils;
import com.vk.media.pipeline.di.MediaPipelineComponent;
import com.vk.media.pipeline.model.quality.MediaQuality;
import com.vk.media.pipeline.model.timeline.Timeline;
import com.vk.media.pipeline.model.transform.TransformFormat;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeDownloadClip;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import xsna.bzd;
import xsna.hpa0;
import xsna.lzd;
import xsna.qpa0;
import xsna.rpa0;

/* compiled from: ClipsEditorProcessingDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class lzd implements gzd {
    public final Context a;
    public final x8d b;
    public final bzd.e c;
    public final nal0 d;
    public final bzd.d e;
    public final e2e f;
    public final lxd g;
    public final os9 h;
    public io.reactivex.rxjava3.disposables.c i;

    /* compiled from: ClipsEditorProcessingDelegateImpl.kt */
    public final class a {
        public final AtomicBoolean a = new AtomicBoolean(false);
        public WeakReference<gpa0> b;
        public rye c;

        public a(lzd lzdVar) {
        }
    }

    public lzd(Context context, c9d c9dVar, bzd.e eVar, nal0 nal0Var, bzd.d dVar, e2e e2eVar, lxd lxdVar) {
        this.a = context;
        this.b = c9dVar;
        this.c = eVar;
        this.d = nal0Var;
        this.e = dVar;
        this.f = e2eVar;
        this.g = lxdVar;
        this.h = e2eVar.d;
    }

    public static /* synthetic */ Pair d(lzd lzdVar, com.vk.clips.editor.state.model.a aVar, boolean z, gny gnyVar, int i) {
        if ((i & 4) != 0) {
            gnyVar = null;
        }
        return lzdVar.c(aVar, z, gnyVar, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0136 A[LOOP:1: B:30:0x0130->B:32:0x0136, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0155 A[LOOP:2: B:35:0x014f->B:37:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a1  */
    @Override // xsna.gzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.vk.clips.editor.state.model.a aVar, ClipsEditorUploadParams clipsEditorUploadParams) {
        ClipsEditorUploadParams.LicensedAudioInfo licensedAudioInfo;
        boolean z;
        List<com.vk.clips.editor.state.model.c> list;
        boolean z2;
        Iterator<T> it;
        ClipsEditorEntry clipsEditorEntry;
        List<com.vk.clips.editor.state.model.c> list2;
        Iterator<T> it2;
        Iterator<T> it3;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        List<List<ClipsEditorAudioItem>> list3;
        ArrayList arrayList;
        Iterator<T> it4;
        boolean z3;
        List<List<ClipsEditorAudioItem>> list4;
        boolean z4;
        Iterator<T> it5;
        boolean z5;
        ClipsDuetInfo clipsDuetInfo;
        String str;
        Iterator<T> it6;
        boolean z6;
        Iterator<T> it7;
        ClipsEditorMusicInfo clipsEditorMusicInfo2;
        ClipsEditorMusicInfo clipsEditorMusicInfo3;
        List<List<ClipsEditorAudioItem>> list5 = aVar.e;
        List<com.vk.clips.editor.state.model.c> list6 = aVar.c;
        x8d x8dVar = this.b;
        x8dVar.d(true);
        x8dVar.o();
        ClipsEditorAudioItem clipsEditorAudioItem = aVar.d;
        if (clipsEditorAudioItem == null || (clipsEditorMusicInfo3 = clipsEditorAudioItem.a) == null) {
            licensedAudioInfo = null;
        } else {
            ClipsEditorMusicTrack clipsEditorMusicTrack = clipsEditorMusicInfo3.b;
            licensedAudioInfo = new ClipsEditorUploadParams.LicensedAudioInfo(clipsEditorMusicTrack.b, clipsEditorMusicTrack.c, clipsEditorMusicInfo3.k);
        }
        if (clipsEditorAudioItem == null || (clipsEditorMusicInfo2 = clipsEditorAudioItem.a) == null || !clipsEditorMusicInfo2.j) {
            List<List<ClipsEditorAudioItem>> list7 = list5;
            if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                Iterator<T> it8 = list7.iterator();
                loop12: while (it8.hasNext()) {
                    List list8 = (List) it8.next();
                    if (!(list8 instanceof Collection) || !list8.isEmpty()) {
                        Iterator it9 = list8.iterator();
                        while (it9.hasNext()) {
                            if (((ClipsEditorAudioItem) it9.next()).a.j) {
                            }
                        }
                    }
                }
            }
            z = false;
            list = list6;
            z2 = list instanceof Collection;
            if (z2 || !list.isEmpty()) {
                it = list.iterator();
                while (it.hasNext()) {
                    if (((com.vk.clips.editor.state.model.c) it.next()).g != TranscodingState.CAMERA_FRONT) {
                        if (!z2 || !list.isEmpty()) {
                            Iterator<T> it10 = list.iterator();
                            while (it10.hasNext()) {
                                if (((com.vk.clips.editor.state.model.c) it10.next()).g != TranscodingState.CAMERA_BACK) {
                                    if (!z2 || !list.isEmpty()) {
                                        Iterator<T> it11 = list.iterator();
                                        while (it11.hasNext()) {
                                            TranscodingState transcodingState = ((com.vk.clips.editor.state.model.c) it11.next()).g;
                                            if (transcodingState != TranscodingState.GALLERY_TRANSCODED && transcodingState != TranscodingState.GALLERY_NOT_TRANSCODED) {
                                                clipsEditorEntry = ClipsEditorEntry.MULTI;
                                                break;
                                            }
                                        }
                                    }
                                    clipsEditorEntry = ClipsEditorEntry.GALLERY;
                                    ClipsEditorEntry clipsEditorEntry2 = clipsEditorEntry;
                                    int size = list6.size();
                                    list2 = list6;
                                    ArrayList arrayList2 = new ArrayList();
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        MaskLight maskLight = ((com.vk.clips.editor.state.model.c) it2.next()).d;
                                        if (maskLight != null) {
                                            arrayList2.add(maskLight);
                                        }
                                    }
                                    ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        arrayList3.add(((com.vk.clips.editor.state.model.c) it3.next()).m);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    long j = 0;
                                    for (com.vk.clips.editor.state.model.c cVar : list2) {
                                        arrayList4.add(new ClipTemplateInfo.VideoFragment(j, cVar.getDurationMs() + j));
                                        j += cVar.getDurationMs();
                                        arrayList2 = arrayList2;
                                        arrayList3 = arrayList3;
                                    }
                                    ArrayList arrayList5 = arrayList2;
                                    ArrayList arrayList6 = arrayList3;
                                    ArrayList arrayList7 = new ArrayList();
                                    clipsEditorMusicInfo = clipsEditorAudioItem == null ? clipsEditorAudioItem.a : null;
                                    if (clipsEditorMusicInfo == null) {
                                        int i = clipsEditorMusicInfo.d;
                                        int i2 = clipsEditorMusicInfo.f;
                                        list3 = list5;
                                        if (!clipsEditorMusicInfo.j) {
                                            long j2 = i2;
                                            arrayList = arrayList4;
                                            long j3 = i;
                                            arrayList7.add(new ClipTemplateInfo.AudioFragment(j2, Math.min((j2 + clipsEditorMusicInfo.e) - j3, j), j3, clipsEditorMusicInfo.b.Ab()));
                                            ClipTemplateInfo clipTemplateInfo = new ClipTemplateInfo(arrayList, arrayList7, null, 4, null);
                                            int e = (int) aVar.e();
                                            if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((com.vk.clips.editor.state.model.c) it4.next()).s != 1.0f) {
                                                        z3 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            z3 = false;
                                            list4 = list3;
                                            z4 = list4 instanceof Collection;
                                            if (z4 || !list4.isEmpty()) {
                                                it5 = list4.iterator();
                                                loop6: while (it5.hasNext()) {
                                                    List list9 = (List) it5.next();
                                                    if (!(list9 instanceof Collection) || !list9.isEmpty()) {
                                                        Iterator it12 = list9.iterator();
                                                        while (it12.hasNext()) {
                                                            if (((ClipsEditorAudioItem) it12.next()).c != 1.0f) {
                                                                z5 = true;
                                                                break loop6;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            z5 = false;
                                            clipsDuetInfo = aVar.a.a;
                                            if (clipsDuetInfo != null) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(clipsDuetInfo.b);
                                                sb.append('_');
                                                sb.append(clipsDuetInfo.c);
                                                str = sb.toString();
                                            } else {
                                                str = null;
                                            }
                                            if (clipsEditorAudioItem != null || clipsEditorAudioItem.d() != ClipsEditorAudioItem.Type.VOICEOVER) {
                                                if (z4 || !list4.isEmpty()) {
                                                    it6 = list4.iterator();
                                                    loop4: while (it6.hasNext()) {
                                                        List list10 = (List) it6.next();
                                                        if (!(list10 instanceof Collection) || !list10.isEmpty()) {
                                                            Iterator it13 = list10.iterator();
                                                            while (it13.hasNext()) {
                                                                if (((ClipsEditorAudioItem) it13.next()).d() == ClipsEditorAudioItem.Type.VOICEOVER) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z6 = false;
                                                ArrayList arrayList8 = new ArrayList();
                                                it7 = list2.iterator();
                                                while (it7.hasNext()) {
                                                    ClipsVideoItemLocation clipsVideoItemLocation = ((com.vk.clips.editor.state.model.c) it7.next()).p;
                                                    if (clipsVideoItemLocation != null) {
                                                        arrayList8.add(clipsVideoItemLocation);
                                                    }
                                                }
                                                ClipsEditorUploadParams a2 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size, clipsEditorEntry2, licensedAudioInfo, z, arrayList5, arrayList6, clipTemplateInfo, e, z3, z5, z6, arrayList8, null, str, 65601719);
                                                this.d.i().a(false);
                                                io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
                                                e2e e2eVar = this.f;
                                                this.i = cug0.c(vVar.q(e2eVar.i.e().b()).m(e2eVar.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a2, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
                                            }
                                            z6 = true;
                                            ArrayList arrayList82 = new ArrayList();
                                            it7 = list2.iterator();
                                            while (it7.hasNext()) {
                                            }
                                            ClipsEditorUploadParams a22 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size, clipsEditorEntry2, licensedAudioInfo, z, arrayList5, arrayList6, clipTemplateInfo, e, z3, z5, z6, arrayList82, null, str, 65601719);
                                            this.d.i().a(false);
                                            io.reactivex.rxjava3.internal.operators.single.v vVar2 = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
                                            e2e e2eVar2 = this.f;
                                            this.i = cug0.c(vVar2.q(e2eVar2.i.e().b()).m(e2eVar2.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a22, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
                                        }
                                    } else {
                                        list3 = list5;
                                    }
                                    arrayList = arrayList4;
                                    arrayList7.add(new ClipTemplateInfo.AudioFragment(0L, j, 0L, "original"));
                                    ClipTemplateInfo clipTemplateInfo2 = new ClipTemplateInfo(arrayList, arrayList7, null, 4, null);
                                    int e2 = (int) aVar.e();
                                    if (list2 instanceof Collection) {
                                    }
                                    it4 = list2.iterator();
                                    while (it4.hasNext()) {
                                    }
                                    z3 = false;
                                    list4 = list3;
                                    z4 = list4 instanceof Collection;
                                    if (z4) {
                                    }
                                    it5 = list4.iterator();
                                    loop6: while (it5.hasNext()) {
                                    }
                                    z5 = false;
                                    clipsDuetInfo = aVar.a.a;
                                    if (clipsDuetInfo != null) {
                                    }
                                    if (clipsEditorAudioItem != null) {
                                    }
                                    if (z4) {
                                    }
                                    it6 = list4.iterator();
                                    loop4: while (it6.hasNext()) {
                                    }
                                    z6 = false;
                                    ArrayList arrayList822 = new ArrayList();
                                    it7 = list2.iterator();
                                    while (it7.hasNext()) {
                                    }
                                    ClipsEditorUploadParams a222 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size, clipsEditorEntry2, licensedAudioInfo, z, arrayList5, arrayList6, clipTemplateInfo2, e2, z3, z5, z6, arrayList822, null, str, 65601719);
                                    this.d.i().a(false);
                                    io.reactivex.rxjava3.internal.operators.single.v vVar22 = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
                                    e2e e2eVar22 = this.f;
                                    this.i = cug0.c(vVar22.q(e2eVar22.i.e().b()).m(e2eVar22.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a222, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
                                }
                            }
                        }
                        clipsEditorEntry = ClipsEditorEntry.CAMERA_BACK;
                        ClipsEditorEntry clipsEditorEntry22 = clipsEditorEntry;
                        int size2 = list6.size();
                        list2 = list6;
                        ArrayList arrayList22 = new ArrayList();
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                        }
                        ArrayList arrayList32 = new ArrayList(c5g.u(list2, 10));
                        it3 = list2.iterator();
                        while (it3.hasNext()) {
                        }
                        ArrayList arrayList42 = new ArrayList();
                        long j4 = 0;
                        while (r11.hasNext()) {
                        }
                        ArrayList arrayList52 = arrayList22;
                        ArrayList arrayList62 = arrayList32;
                        ArrayList arrayList72 = new ArrayList();
                        if (clipsEditorAudioItem == null) {
                        }
                        if (clipsEditorMusicInfo == null) {
                        }
                        arrayList = arrayList42;
                        arrayList72.add(new ClipTemplateInfo.AudioFragment(0L, j4, 0L, "original"));
                        ClipTemplateInfo clipTemplateInfo22 = new ClipTemplateInfo(arrayList, arrayList72, null, 4, null);
                        int e22 = (int) aVar.e();
                        if (list2 instanceof Collection) {
                        }
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                        }
                        z3 = false;
                        list4 = list3;
                        z4 = list4 instanceof Collection;
                        if (z4) {
                        }
                        it5 = list4.iterator();
                        loop6: while (it5.hasNext()) {
                        }
                        z5 = false;
                        clipsDuetInfo = aVar.a.a;
                        if (clipsDuetInfo != null) {
                        }
                        if (clipsEditorAudioItem != null) {
                        }
                        if (z4) {
                        }
                        it6 = list4.iterator();
                        loop4: while (it6.hasNext()) {
                        }
                        z6 = false;
                        ArrayList arrayList8222 = new ArrayList();
                        it7 = list2.iterator();
                        while (it7.hasNext()) {
                        }
                        ClipsEditorUploadParams a2222 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size2, clipsEditorEntry22, licensedAudioInfo, z, arrayList52, arrayList62, clipTemplateInfo22, e22, z3, z5, z6, arrayList8222, null, str, 65601719);
                        this.d.i().a(false);
                        io.reactivex.rxjava3.internal.operators.single.v vVar222 = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
                        e2e e2eVar222 = this.f;
                        this.i = cug0.c(vVar222.q(e2eVar222.i.e().b()).m(e2eVar222.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a2222, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
                    }
                }
            }
            clipsEditorEntry = ClipsEditorEntry.CAMERA_FRONT;
            ClipsEditorEntry clipsEditorEntry222 = clipsEditorEntry;
            int size22 = list6.size();
            list2 = list6;
            ArrayList arrayList222 = new ArrayList();
            it2 = list2.iterator();
            while (it2.hasNext()) {
            }
            ArrayList arrayList322 = new ArrayList(c5g.u(list2, 10));
            it3 = list2.iterator();
            while (it3.hasNext()) {
            }
            ArrayList arrayList422 = new ArrayList();
            long j42 = 0;
            while (r11.hasNext()) {
            }
            ArrayList arrayList522 = arrayList222;
            ArrayList arrayList622 = arrayList322;
            ArrayList arrayList722 = new ArrayList();
            if (clipsEditorAudioItem == null) {
            }
            if (clipsEditorMusicInfo == null) {
            }
            arrayList = arrayList422;
            arrayList722.add(new ClipTemplateInfo.AudioFragment(0L, j42, 0L, "original"));
            ClipTemplateInfo clipTemplateInfo222 = new ClipTemplateInfo(arrayList, arrayList722, null, 4, null);
            int e222 = (int) aVar.e();
            if (list2 instanceof Collection) {
            }
            it4 = list2.iterator();
            while (it4.hasNext()) {
            }
            z3 = false;
            list4 = list3;
            z4 = list4 instanceof Collection;
            if (z4) {
            }
            it5 = list4.iterator();
            loop6: while (it5.hasNext()) {
            }
            z5 = false;
            clipsDuetInfo = aVar.a.a;
            if (clipsDuetInfo != null) {
            }
            if (clipsEditorAudioItem != null) {
            }
            if (z4) {
            }
            it6 = list4.iterator();
            loop4: while (it6.hasNext()) {
            }
            z6 = false;
            ArrayList arrayList82222 = new ArrayList();
            it7 = list2.iterator();
            while (it7.hasNext()) {
            }
            ClipsEditorUploadParams a22222 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size22, clipsEditorEntry222, licensedAudioInfo, z, arrayList522, arrayList622, clipTemplateInfo222, e222, z3, z5, z6, arrayList82222, null, str, 65601719);
            this.d.i().a(false);
            io.reactivex.rxjava3.internal.operators.single.v vVar2222 = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
            e2e e2eVar2222 = this.f;
            this.i = cug0.c(vVar2222.q(e2eVar2222.i.e().b()).m(e2eVar2222.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a22222, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
        }
        z = true;
        list = list6;
        z2 = list instanceof Collection;
        if (z2) {
        }
        it = list.iterator();
        while (it.hasNext()) {
        }
        clipsEditorEntry = ClipsEditorEntry.CAMERA_FRONT;
        ClipsEditorEntry clipsEditorEntry2222 = clipsEditorEntry;
        int size222 = list6.size();
        list2 = list6;
        ArrayList arrayList2222 = new ArrayList();
        it2 = list2.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList3222 = new ArrayList(c5g.u(list2, 10));
        it3 = list2.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList4222 = new ArrayList();
        long j422 = 0;
        while (r11.hasNext()) {
        }
        ArrayList arrayList5222 = arrayList2222;
        ArrayList arrayList6222 = arrayList3222;
        ArrayList arrayList7222 = new ArrayList();
        if (clipsEditorAudioItem == null) {
        }
        if (clipsEditorMusicInfo == null) {
        }
        arrayList = arrayList4222;
        arrayList7222.add(new ClipTemplateInfo.AudioFragment(0L, j422, 0L, "original"));
        ClipTemplateInfo clipTemplateInfo2222 = new ClipTemplateInfo(arrayList, arrayList7222, null, 4, null);
        int e2222 = (int) aVar.e();
        if (list2 instanceof Collection) {
        }
        it4 = list2.iterator();
        while (it4.hasNext()) {
        }
        z3 = false;
        list4 = list3;
        z4 = list4 instanceof Collection;
        if (z4) {
        }
        it5 = list4.iterator();
        loop6: while (it5.hasNext()) {
        }
        z5 = false;
        clipsDuetInfo = aVar.a.a;
        if (clipsDuetInfo != null) {
        }
        if (clipsEditorAudioItem != null) {
        }
        if (z4) {
        }
        it6 = list4.iterator();
        loop4: while (it6.hasNext()) {
        }
        z6 = false;
        ArrayList arrayList822222 = new ArrayList();
        it7 = list2.iterator();
        while (it7.hasNext()) {
        }
        ClipsEditorUploadParams a222222 = ClipsEditorUploadParams.a(clipsEditorUploadParams, size222, clipsEditorEntry2222, licensedAudioInfo, z, arrayList5222, arrayList6222, clipTemplateInfo2222, e2222, z3, z5, z6, arrayList822222, null, str, 65601719);
        this.d.i().a(false);
        io.reactivex.rxjava3.internal.operators.single.v vVar22222 = new io.reactivex.rxjava3.internal.operators.single.v(new aa4(1, this, aVar));
        e2e e2eVar22222 = this.f;
        this.i = cug0.c(vVar22222.q(e2eVar22222.i.e().b()).m(e2eVar22222.i.e().d()), this.a, new gtl(5), null, new f1(this, 17), 16).subscribe(new sv(new ea3(a222222, this, aVar, 4), 16), new k5(new j5(this, 22), 12));
    }

    @Override // xsna.gzd
    public final void b(com.vk.clips.editor.state.model.a aVar, final UserId userId, final File file, azd azdVar) {
        ClipsEditorAudioItem clipsEditorAudioItem = aVar.d;
        final com.vk.clips.editor.state.model.a c = (clipsEditorAudioItem == null || clipsEditorAudioItem.d() != ClipsEditorAudioItem.Type.LICENSED || clipsEditorAudioItem.a.b.j) ? aVar : com.vk.clips.editor.state.model.a.c(aVar, null, null, null, null, null, null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
        final a aVar2 = new a(this);
        i0q0.f(new com.vk.movika.sdk.base.flow.binding.g(5, aVar2, this));
        qzd j = bzd.this.j();
        if (j != null) {
            j.a(new MobileOfficialAppsClipsStat$TypeDownloadClip(MobileOfficialAppsClipsStat$TypeDownloadClip.EventType.DOWNLOAD_CLIP));
        }
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.hzd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Pair<ClipsEncoderParameters, List<uq10>> d;
                com.vk.clips.editor.state.model.a aVar3 = c;
                UserId userId2 = userId;
                lzd lzdVar = lzd.this;
                e2e e2eVar = lzdVar.f;
                Context context = lzdVar.a;
                f1e f1eVar = e2eVar.l;
                boolean z = false;
                boolean z2 = true;
                try {
                    ClipsDuetInfo clipsDuetInfo = aVar3.a.a;
                    UserId userId3 = clipsDuetInfo != null ? clipsDuetInfo.b : null;
                    if (userId3 != null) {
                        Pair pair = (Pair) io.reactivex.rxjava3.core.x.B(f1eVar.b(null, true), f1eVar.b(userId3, true), new x34(new bb9(1), 6)).c();
                        d = lzdVar.c(aVar3, false, (gny) pair.d(), (gny) pair.g());
                    } else {
                        d = lzd.d(lzdVar, aVar3, false, (gny) f1eVar.b(userId2, false).c(), 8);
                    }
                } catch (Exception e) {
                    lyd.a.a("ClipsEditorProcessingDelegateImpl", e);
                    d = lzd.d(lzdVar, aVar3, false, null, 12);
                }
                ClipsEncoderParameters d2 = d.d();
                List<uq10> g = d.g();
                lzd.a aVar4 = aVar2;
                jkp0 jkp0Var = new jkp0(new mzd(aVar4));
                MediaQuality mediaQuality = d2.e;
                ClipsEncoderParameters.VideoOutputSettings videoOutputSettings = d2.c;
                TransformFormat transformFormat = new TransformFormat(mediaQuality, new TransformFormat.VideoOutputFormat(videoOutputSettings.b, videoOutputSettings.c, null, null, null, 24, null), null);
                File file2 = file;
                ykm0 ykm0Var = new ykm0(file2, transformFormat, jkp0Var);
                gpa0 build = hpa0.a.a((hpa0) ((hpa0) lzdVar.g.b().p6(context).c(d2.b).d(new d80(3))).g(new apk(g, context, null)), "clip_save").build();
                aVar4.b = new WeakReference<>(build);
                List<uq10> list = g;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((uq10) it.next()).f();
                }
                qpa0 c2 = build.c(ykm0Var);
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((uq10) it2.next()).e();
                }
                if (c2 instanceof qpa0.b) {
                    if (!file2.exists() || aVar4.a.get()) {
                        i0q0.f(new kzd(aVar4, z, 0));
                        aVar4.b = null;
                    } else {
                        i0q0.f(new kzd(aVar4, z2, 0));
                        aVar4.b = null;
                    }
                } else if (c2 instanceof qpa0.c) {
                    lyd.a.b(((qpa0.c) c2).a);
                    i0q0.f(new kzd(aVar4, z, 0));
                    aVar4.b = null;
                }
                return s3q0.a;
            }
        });
        e2e e2eVar = this.f;
        this.i = hg1.i(vVar.q(e2eVar.i.e().b()).m(e2eVar.i.e().d()).h(new m5(new com.vk.movika.sdk.base.observable.e0(12), 16)), new nm1(4, azdVar, file));
    }

    public final Pair<ClipsEncoderParameters, List<uq10>> c(com.vk.clips.editor.state.model.a aVar, boolean z, gny gnyVar, gny gnyVar2) {
        boolean z2;
        ClipsEditorMusicInfo clipsEditorMusicInfo;
        String str;
        fny fnyVar;
        gny gnyVar3 = gnyVar;
        bzd.e eVar = this.c;
        rpa0 rpa0Var = new rpa0(new Size(eVar.b(), eVar.a()), this.g.b().Gd());
        boolean z3 = false;
        e2e e2eVar = this.f;
        if (z) {
            z2 = false;
        } else {
            cxd cxdVar = e2eVar.k;
            z2 = true;
        }
        List<com.vk.clips.editor.state.model.c> list = aVar.c;
        ClipsEditorAudioItem clipsEditorAudioItem = aVar.d;
        List<com.vk.clips.editor.state.model.c> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (com.vk.clips.editor.state.model.c cVar : list2) {
            arrayList.add(new MediaUtils.d(cVar.d(), cVar.c()));
        }
        rpa0.a a2 = rpa0Var.a(aVar, z2, two0.a(arrayList, aVar.g.b));
        Timeline timeline = a2.a;
        MediaUtils.d dVar = a2.b;
        if (!z) {
            cxd cxdVar2 = e2eVar.k;
            z3 = true;
        }
        f1e f1eVar = e2eVar.l;
        long e = aVar.e();
        h5f d = this.d.d();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(d.b);
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            nov novVar = (nov) it.next();
            boolean z4 = z3;
            if (!(novVar instanceof omv) && !(novVar instanceof u570)) {
                arrayList4.add(novVar);
            }
            z3 = z4;
        }
        boolean z5 = z3;
        if (arrayList4.size() > 0) {
            arrayList2.add(new c1f(arrayList4, dVar));
        }
        File file = null;
        if (z5) {
            if (gnyVar3 != null && gnyVar2 != null) {
                fnyVar = new fny(gnyVar3, gnyVar2);
            } else if (gnyVar3 != null || gnyVar2 == null) {
                if (gnyVar3 == null) {
                    gnyVar3 = f1eVar.a(dVar);
                }
                fnyVar = new fny(gnyVar3, null);
            } else {
                fnyVar = new fny(f1eVar.a(dVar), gnyVar2);
            }
            arrayList2.add(new zie(dVar, (int) e, fnyVar));
        }
        ClipsEncoderParameters.LicensedMusicInfo licensedMusicInfo = (clipsEditorAudioItem == null || (clipsEditorMusicInfo = clipsEditorAudioItem.a) == null || (str = clipsEditorMusicInfo.g) == null) ? null : new ClipsEncoderParameters.LicensedMusicInfo(new File(str), clipsEditorMusicInfo.b.Ab(), clipsEditorMusicInfo.c);
        if (z) {
            try {
                os9 os9Var = this.h;
                Context context = this.a;
                ClipsDraftPersistentStore.b.getClass();
                file = new pwe(context, ClipsDraftPersistentStore.j(), (MediaPipelineComponent) os9Var.c).a(timeline, arrayList2, new Size(dVar.a, dVar.b)).c();
            } catch (Throwable th) {
                lyd.a.h((String[]) Arrays.copyOf(new String[]{"ClipsEditorProcessingDelegateImpl", ms9.b("preview retrieve failed: ", th)}, 2));
            }
        }
        ClipsEncoderParameters clipsEncoderParameters = new ClipsEncoderParameters(timeline, new ClipsEncoderParameters.VideoOutputSettings(dVar.a, dVar.b), new ClipEditorSizeParams(eVar.b(), eVar.a()), MediaQuality.HIGH, file, licensedMusicInfo, null, 64, null);
        lyd.a.d(Arrays.copyOf(new Object[]{"ClipsEditorProcessingDelegateImpl", "encoder params:\n" + a2}, 2));
        return new Pair<>(clipsEncoderParameters, arrayList2);
    }

    @Override // xsna.gzd
    public final void dispose() {
        io.reactivex.rxjava3.disposables.c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
