package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hms.framework.common.BundleUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoTemplateAudioFragmentDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoTemplateFragmentDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.camera.clips.core.drafts.ClipsDraftVkExtraData;
import com.vk.camera.clips.core.drafts.TemplateDraftData;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.editor.templates.api.model.TemplatesFlowScreen;
import com.vk.clips.editor.templates.impl.domain.ClipsTemplateEditorVideoItem;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.editor.templates.impl.player.MusicPlayerState;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.preference.Preference;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.clips.gallery.TranscodingState;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.common.clips.ClipAudioTemplate;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.log.L;
import com.vk.preview.presentation.GalleryPickerInitialData;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipTemplateItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.h7u0;

/* compiled from: ClipsTemplateEditorPresenter.kt */
/* loaded from: classes16.dex */
public final class y7f implements j6f, xsi {
    public static final d o;
    public static final /* synthetic */ qcy<Object>[] p;
    public final k6f a;
    public final j7f b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();
    public final l d = new l();
    public final z8d e;
    public final m8f f;
    public final h6f g;
    public final i8f h;
    public final d6f i;
    public final o6f j;
    public final bpn0 k;
    public final bpn0 l;
    public final Object m;
    public final Object n;

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class a {
        public a() {
        }

        public final void a(a7f a7fVar) {
            y7f.this.a.Hi(a7fVar);
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class b {
        public b() {
        }

        public final void a(boolean z) {
            y7f y7fVar = y7f.this;
            if (z) {
                y7f.z(y7fVar, null, new v40(y7fVar, 22));
                return;
            }
            ClipsDraftPersistentStore.b.getClass();
            ClipsDraftPersistentStore.p(true);
            ClipsDraftPersistentStore.s();
            y7fVar.a.finish();
            asu0.a.getClass();
            asu0.n().execute(new o63(y7fVar, 2));
        }

        public final Context b() {
            return y7f.this.a.B();
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class c {
        public c() {
        }

        public final qyd a() {
            return (qyd) y7f.this.l.getValue();
        }

        public final r8f b() {
            return y7f.this.a.getVideoView();
        }

        public final boolean c() {
            z7f B = y7f.this.B();
            return B != null && B.b() > 0;
        }

        public final void d(boolean z) {
            y7f.this.a.b2(z);
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public static final class d {
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class e {
        public e() {
        }

        public final void a() {
            boolean z;
            y7f y7fVar = y7f.this;
            k6f k6fVar = y7fVar.a;
            z7f B = y7fVar.B();
            if (B != null) {
                if (B.b() >= 3) {
                    long c = B.c();
                    y7f.o.getClass();
                    if (c >= TimeUnit.SECONDS.toMillis(1L)) {
                        z = true;
                        k6fVar.rl(z);
                    }
                }
                z = false;
                k6fVar.rl(z);
            }
            k6fVar.Ui(false, new com.vk.movika.sdk.base.logic.interactor.g(8));
        }

        public final a7f b() {
            return y7f.this.a.h4();
        }

        public final r8f c() {
            return y7f.this.a.getVideoView();
        }

        public final void d(ArrayList arrayList) {
            y7f.this.a.Mm(arrayList);
        }

        public final void e(z7f z7fVar) {
            y7f.this.C(z7fVar);
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class f implements p6f {
        public f() {
        }

        @Override // xsna.p6f
        public final h6f a() {
            return y7f.this.g;
        }

        @Override // xsna.p6f
        public final z8d b() {
            return y7f.this.e;
        }

        @Override // xsna.p6f
        public final void c() {
            a7f b;
            o6f o6fVar = y7f.this.j;
            o6fVar.e.d(false);
            e eVar = o6fVar.c;
            final z7f B = y7f.this.B();
            if (B == null || (b = eVar.b()) == null) {
                return;
            }
            final List<n7f> list = b.b;
            io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.m6f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    z7f z7fVar = z7f.this;
                    List list2 = z7fVar.d;
                    for (n7f n7fVar : list) {
                        list2 = rdi.I(n7fVar.a, n7fVar, list2);
                    }
                    return z7f.a(z7fVar, list2, null, null, null, 503);
                }
            });
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            o6fVar.b.b(new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.single.r(vVar.m(asu0.i()), new n7(new ij8(3, o6fVar, list), 15)), new rf1(new gr3(o6fVar, 20), 14)).q(asu0.k()).m(asu0Var.d()).subscribe(new c60(new sf1(o6fVar, 29), 10), new bn3(new j6e(o6fVar, 2), 12)));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.p6f
        public final i9f d() {
            return (i9f) y7f.this.n.getValue();
        }

        @Override // xsna.p6f
        public final r8f getVideoView() {
            return y7f.this.a.getVideoView();
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class g {
        public g() {
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class h {
        public h() {
        }

        public final Context a() {
            return y7f.this.a.B();
        }

        public final a7f b() {
            return y7f.this.a.h4();
        }

        public final r8f c() {
            return y7f.this.a.getVideoView();
        }

        public final void d(z7f z7fVar) {
            y7f.this.C(z7fVar);
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class i {
        public i() {
        }

        public final r8f a() {
            return y7f.this.a.getVideoView();
        }

        public final void b(boolean z) {
            k6f k6fVar = y7f.this.a;
            if (z) {
                TransformOverlayView hm = k6fVar.hm();
                if (hm != null) {
                    d3m.c(hm, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    return;
                }
                return;
            }
            TransformOverlayView hm2 = k6fVar.hm();
            if (hm2 != null) {
                d3m.e(hm2, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
            }
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public final class j {
        public j() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        public final i9f a() {
            return (i9f) y7f.this.n.getValue();
        }

        public final r8f b() {
            return y7f.this.a.getVideoView();
        }
    }

    /* compiled from: ClipsTemplateEditorPresenter.kt */
    public static final class k {
        public k() {
        }
    }

    /* compiled from: Delegates.kt */
    public static final class l extends wq70<z7f> {
        public l() {
            super(null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
        
            if (r2 >= java.util.concurrent.TimeUnit.SECONDS.toMillis(1)) goto L13;
         */
        @Override // xsna.wq70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void afterChange(qcy<?> qcyVar, z7f z7fVar, z7f z7fVar2) {
            z7f z7fVar3 = z7fVar2;
            z7f z7fVar4 = z7fVar;
            if (z7fVar3 != null) {
                k6f k6fVar = y7f.this.a;
                boolean z = true;
                if (k6fVar.B8()) {
                    k6fVar.rl(true);
                } else {
                    if (z7fVar3.b() >= 3) {
                        long c = z7fVar3.c();
                        y7f.o.getClass();
                    }
                    z = false;
                    k6fVar.rl(z);
                }
            }
            if (epx.f(z7fVar4, z7fVar3)) {
                return;
            }
            L.e("ClipsTemplateEditorPresenter", "state changed \nold = " + z7fVar4 + " \nnew = " + z7fVar3);
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(y7f.class, "state", "getState()Lcom/vk/clips/editor/templates/impl/views/main/ClipsTemplateEditorPresenterState;", 0);
        fpf0.a.getClass();
        p = new qcy[]{mutablePropertyReference1Impl};
        o = new d();
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, kotlin.Lazy] */
    public y7f(k6f k6fVar, j7f j7fVar) {
        this.a = k6fVar;
        this.b = j7fVar;
        k8f k8fVar = new k8f();
        z8d z8dVar = new z8d(new c());
        this.e = z8dVar;
        m8f m8fVar = new m8f(new j());
        this.f = m8fVar;
        h6f h6fVar = new h6f(new b());
        this.g = h6fVar;
        h hVar = new h();
        ?? r10 = j7fVar.a;
        i8f i8fVar = new i8f(hVar, z8dVar, k8fVar, m8fVar, (d9f) r10.getValue(), h6fVar, j7fVar);
        this.h = i8fVar;
        this.i = new d6f(new a(), z8dVar, i8fVar, h6fVar, (d9f) r10.getValue());
        this.j = new o6f(new e(), k8fVar, z8dVar, i8fVar, h6fVar, m8fVar);
        this.k = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 27));
        this.l = new bpn0(new f1(this, 24));
        ng1 ng1Var = new ng1(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, ng1Var);
        this.n = msy.a(lazyThreadSafetyMode, new yc(this, 27));
    }

    public static final void z(y7f y7fVar, final File file, gzs gzsVar) {
        final z7f B = y7fVar.B();
        if (B == null) {
            gzsVar.invoke();
            return;
        }
        List<n7f> list = B.d;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            Pair pair = null;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = ((n7f) obj).c;
            if (clipsTemplateEditorVideoItem != null) {
                File file2 = new File(clipsTemplateEditorVideoItem.b);
                long j2 = clipsTemplateEditorVideoItem.f;
                long j3 = clipsTemplateEditorVideoItem.g;
                TranscodingState transcodingState = clipsTemplateEditorVideoItem.i;
                boolean z = clipsTemplateEditorVideoItem.h;
                pair = new Pair(Integer.valueOf(i2), new ClipsEditorInputVideoItem(file2, j2, j3, null, null, null, transcodingState, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, clipsTemplateEditorVideoItem.j, z, null, null, null, null, null, 127928, null));
            }
            if (pair != null) {
                arrayList.add(pair);
            }
            i2 = i3;
        }
        final Map s = pn00.s(arrayList);
        final TemplateDraftData templateDraftData = new TemplateDraftData(new ClipAudioTemplate(B.a), j5g.O0(s.keySet()));
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.v7f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String h2;
                ClipsDraftPersistentStore.b.getClass();
                Future o2 = ClipsDraftPersistentStore.o(null);
                if (o2 != null) {
                    o2.get();
                }
                ClipsDraftVk k2 = ClipsDraftPersistentStore.k();
                ClipsDraftVkExtraData clipsDraftVkExtraData = k2 != null ? k2.c : null;
                TemplateDraftData templateDraftData2 = TemplateDraftData.this;
                Map map = s;
                if (clipsDraftVkExtraData != null) {
                    k2.c.i = templateDraftData2;
                    k2.b.d = new ArrayList(map.values());
                } else {
                    File file3 = file;
                    z7f z7fVar = B;
                    if (file3 == null || (h2 = file3.getAbsolutePath()) == null) {
                        Iterator<T> it = z7fVar.d.iterator();
                        while (it.hasNext()) {
                            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem2 = ((n7f) it.next()).c;
                            if (clipsTemplateEditorVideoItem2 != null) {
                                String str = clipsTemplateEditorVideoItem2.b;
                                ClipsDraftPersistentStore.b.getClass();
                                h2 = ClipsDraftPersistentStore.h(str);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    String str2 = h2;
                    ClipsDraftPersistentStore.b.getClass();
                    ClipsDraftPersistentStore.w(new ClipsDraftVk(new ClipsDraftCommonData(ClipsDraftPersistentStore.i(), Integer.MAX_VALUE, new ArrayList(map.values()), z7fVar.h, 0L, false, pvo0.a(), false, str2, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 16048, null), new ClipsDraftVkExtraData(null, null, null, null, null, null, null, templateDraftData2, null, null, 895, null)));
                    nsd nsdVar = fvr.c;
                    if (nsdVar != null) {
                        nsdVar.c(1);
                    } else {
                        Preference.F(swe0.i(Preference.m(0L, "clips_draft_prefs", "unseen_drafts_pref") + 1, 0L, ClipsDraftPersistentStore.m().size()), "clips_draft_prefs", "unseen_drafts_pref");
                    }
                }
                ClipsDraftPersistentStore.b.getClass();
                ClipsDraftPersistentStore.t();
                return s3q0.a;
            }
        });
        asu0 asu0Var = asu0.a;
        itg0.h(vVar.q(asu0Var.c()).m(asu0Var.d()), new w7f(0, gzsVar), new x7f(0, gzsVar));
    }

    public final MobileOfficialAppsClipsStat$ClipsCreateContext A() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        j7f j7fVar = this.b;
        kbk context = j7fVar.a().getContext();
        int i2 = context != null ? context.b : -1;
        kbk context2 = j7fVar.a().getContext();
        if (context2 == null || (creationEntryPoint = context2.a) == null) {
            creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
        }
        return new MobileOfficialAppsClipsStat$ClipsCreateContext(i2, creationEntryPoint);
    }

    public final z7f B() {
        return this.d.getValue(this, p[0]);
    }

    public final void C(z7f z7fVar) {
        this.d.setValue(this, p[0], z7fVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void D(int i2, int i3, boolean z) {
        PointF[] fillPoints = ((n0e) this.m.getValue()).a.getCommons().getFillPoints();
        ArrayList arrayList = new ArrayList(fillPoints.length);
        for (PointF pointF : fillPoints) {
            arrayList.add(e43.l(Float.valueOf(pointF.x), Float.valueOf(pointF.y)));
        }
        float[] L0 = j5g.L0(c5g.v(arrayList));
        TransformOverlayView hm = this.a.hm();
        if (hm != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(i2 - 100);
            sb.append('%');
            String sb2 = sb.toString();
            String b2 = vu5.b(new StringBuilder(), -i3, (char) 176);
            int i4 = TransformOverlayView.f;
            hm.a(L0, sb2, b2, z, true);
        }
    }

    @Override // xsna.xsi
    public final void a(io.reactivex.rxjava3.disposables.c cVar) {
        this.c.b(cVar);
    }

    @Override // xsna.j6f
    public final void a0() {
        k6f k6fVar = this.a;
        if (k6fVar.B8()) {
            k6fVar.D8();
        } else {
            x();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j6f
    public final void d(View view, MotionEvent motionEvent) {
        vik d2 = ((i9f) this.n.getValue()).d();
        if (d2 != null) {
            d2.onTouch(view, motionEvent);
        }
    }

    @Override // xsna.j6f
    public final void g() {
        k6f k6fVar = this.a;
        if (k6fVar.B8()) {
            k6fVar.D8();
        }
    }

    @Override // xsna.j6f
    public final void j() {
        a7f b2;
        n7f b3;
        i8f i8fVar = this.j.f;
        i8fVar.d.d(true);
        h hVar = i8fVar.c;
        z7f B = y7f.this.B();
        if (B == null || (b2 = hVar.b()) == null || (b3 = b2.b()) == null) {
            return;
        }
        hVar.d(z7f.a(B, null, Integer.valueOf(b3.a), null, null, 495));
        long d2 = b3.b.d();
        i8fVar.i = Collections.singletonList(b3);
        rwi.d().h().d(1250, hVar.a(), new n4b(i8fVar, d2));
    }

    @Override // xsna.j6f
    public final void k() {
        a7f b2;
        n7f b3;
        o6f o6fVar = this.j;
        e eVar = o6fVar.c;
        z7f B = y7f.this.B();
        if (B == null || (b2 = eVar.b()) == null || (b3 = b2.b()) == null) {
            return;
        }
        List<n7f> list = b2.b;
        final h6f h6fVar = o6fVar.g;
        l6f l6fVar = new l6f(B, o6fVar, list, b3, 0);
        androidx.appcompat.app.d dVar = h6fVar.b;
        if (dVar != null) {
            dVar.dismiss();
        }
        int i2 = h7u0.p;
        h7u0.a c2 = h7u0.b.c(h6fVar.a.b());
        c2.g0(R.string.clips_template_editor_cropper_delete_fragment_dialog_title);
        int i3 = 1;
        c2.c0(R.string.clips_template_editor_cropper_delete_fragment_dialog_confirm, new rg1(l6fVar, i3));
        c2.W(R.string.clips_template_editor_cropper_delete_fragment_dialog_cancel, new sg1(i3));
        c2.a0(new DialogInterface.OnDismissListener() { // from class: xsna.g6f
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                h6f.this.b = null;
            }
        });
        h6fVar.b = c2.m();
    }

    @Override // xsna.j6f
    public final void l() {
        z8d z8dVar = this.e;
        r8f b2 = z8dVar.a.b();
        if (b2 != null) {
            if (((s8f) b2).h()) {
                z8dVar.d(true);
            } else {
                z8dVar.g();
            }
        }
    }

    @Override // xsna.j6f
    public final void onActivityResult(int i2, int i3, Intent intent) {
        a7f b2;
        Integer num;
        i8f i8fVar = this.h;
        io.reactivex.rxjava3.disposables.b bVar = i8fVar.b;
        z8d z8dVar = i8fVar.d;
        h hVar = i8fVar.c;
        d9f d9fVar = i8fVar.g;
        z8d z8dVar2 = this.e;
        if (i3 == 0 && i2 == 1543) {
            d9fVar.b(true);
        } else if (i3 == -1) {
            if (i2 == 123) {
                z7f B = y7f.this.B();
                if (B != null && (num = B.e) != null) {
                    hVar.d(z7f.a(B, null, null, null, null, 495));
                    ArrayList d2 = B.d(num.intValue());
                    ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                    Iterator it = d2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((n7f) it.next()).a));
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList);
                    z8dVar.d(true);
                    io.reactivex.rxjava3.internal.operators.single.b0 m = i8fVar.j7(B, i8fVar.v7(intent, hVar.a(), new qe3(12)).l(new t7(new q45(i8fVar, num, B, 3), 8)), linkedHashSet).m(asu0.a.d());
                    new py(10);
                    bVar.b(m.subscribe(new h8f(), new xf1(new t1e(i8fVar, 4), 13)));
                }
            } else if (i2 == 1250) {
                z7f B2 = y7f.this.B();
                if (B2 != null && (b2 = hVar.b()) != null) {
                    int i4 = b2.c;
                    n7f b3 = b2.b();
                    if (b3 != null) {
                        z8dVar.d(true);
                        hVar.d(z7f.a(B2, null, null, null, null, 495));
                        bVar.b(i8fVar.v7(intent, hVar.a(), new x84(4)).l(new e10(new ju(5, i8fVar, b3), 17)).m(asu0.a.d()).subscribe(new j50(new dk9(i8fVar, b3, b2, i4), 11), new sh6(new wcx0(i8fVar, 1), 11)));
                    }
                }
            } else if (i2 == 1543) {
                d9fVar.b(true);
                d9fVar.f();
                kbk context = i8fVar.h.a().getContext();
                if (context == null || !context.d) {
                    g620.f().a().i(hVar.a(), fpf0.a(ClipFeedTab.TopVideo.class), null);
                }
            }
            z8dVar2.d(true);
            return;
        }
        if (this.a.s1()) {
            z8dVar2.b = null;
            z8dVar2.f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j6f
    public final void onCreate() {
        j7f j7fVar = this.b;
        if (j7fVar.a().getContext() == null) {
            j7fVar.a().a(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_VIEWER, new SecureRandom().nextInt(Integer.MAX_VALUE), (r3 & 4) == 0);
        }
        this.c.b(hg1.h(((d9f) j7fVar.a.getValue()).d(TemplatesFlowScreen.EDITOR).a0(asu0.a.d()), new com.vk.newsfeed.posting.impl.presentation.base.fragment.a(this, 24)));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.j6f
    public final void onDestroy() {
        j7f j7fVar = this.b;
        kbk context = j7fVar.a().getContext();
        if (context != null && context.c && context.a == MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_VIEWER) {
            j7fVar.a().i();
        }
        qyd qydVar = (qyd) this.l.getValue();
        qydVar.j.removeCallbacksAndMessages(null);
        q850 q850Var = (q850) qydVar.a.b;
        if (t850.a(q850Var.h()) != MusicPlayerState.STOPPED) {
            q850Var.stop(26);
        }
        bn40.f(new Object[0]);
        q850Var.d.e();
        this.c.dispose();
        this.f.dispose();
        this.h.dispose();
        this.i.dispose();
        this.j.dispose();
        ((d9f) j7fVar.a.getValue()).a(TemplatesFlowScreen.EDITOR);
    }

    @Override // xsna.j6f
    public final void onPause() {
        z8d z8dVar = this.e;
        r8f b2 = z8dVar.a.b();
        z8dVar.b = b2 != null ? Boolean.valueOf(((s8f) b2).h()) : null;
        z8dVar.d(true);
    }

    @Override // xsna.j6f
    public final void onResume() {
        z8d z8dVar = this.e;
        Boolean bool = z8dVar.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                z8dVar.g();
            } else {
                z8dVar.d(true);
            }
            z8dVar.b = null;
        }
    }

    @Override // xsna.j6f
    public final void p(ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel) {
        ShortVideoAudioDto shortVideoAudioDto;
        ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto = clipsVideoTemplateEditorInputModel.d;
        List<ShortVideoAudioDto> e2 = shortVideoGetTemplateExtendedResponseDto.e();
        if (e2 == null || (shortVideoAudioDto = (ShortVideoAudioDto) j5g.a0(e2)) == null) {
            throw new IllegalStateException("inputModel.template?.audios? is null");
        }
        MusicTrack c2 = sfj0.c(shortVideoAudioDto);
        List<ShortVideoTemplateFragmentDto> e3 = shortVideoGetTemplateExtendedResponseDto.d().e();
        ShortVideoTemplateAudioFragmentDto shortVideoTemplateAudioFragmentDto = (ShortVideoTemplateAudioFragmentDto) j5g.a0(shortVideoGetTemplateExtendedResponseDto.d().d());
        if (shortVideoTemplateAudioFragmentDto == null) {
            throw new IllegalStateException("inputModel.template.audioTemplate.audioFragments.firstOrNull() is null");
        }
        io.reactivex.rxjava3.internal.operators.observable.f0 w0 = rsg0.w0(new dae(c2.c, c2.b, c2.y));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.internal.operators.single.b0 m = w0.m(asu0.i()).l(new o40(new t7f(c2), 9)).l(new com.vk.movika.sdk.base.hooks.f(new yl3(clipsVideoTemplateEditorInputModel, shortVideoTemplateAudioFragmentDto, e3), 12)).m(asu0Var.d());
        int i2 = 7;
        this.c.b(hg1.i(cug0.c(new io.reactivex.rxjava3.internal.operators.single.r(m, new q40(new eaa(i2, clipsVideoTemplateEditorInputModel, this), i2)).m(asu0Var.d()), this.a.B(), new gtl(5), io.reactivex.rxjava3.internal.operators.observable.g0.b, new q5f(this, 1), 16).h(new ew(new x5x0(this, 1), 12)), new n40(this, 25)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r4 >= java.util.concurrent.TimeUnit.SECONDS.toMillis(1)) goto L14;
     */
    @Override // xsna.j6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t() {
        z7f B = B();
        if (B != null) {
            k6f k6fVar = this.a;
            boolean z = true;
            if (k6fVar.B8()) {
                k6fVar.rl(true);
                return;
            }
            if (B.b() >= 3) {
                long c2 = B.c();
                o.getClass();
            }
            z = false;
            k6fVar.rl(z);
        }
    }

    @Override // xsna.j6f
    public final void u(final int i2) {
        d6f d6fVar = this.i;
        z8d z8dVar = d6fVar.d;
        a aVar = d6fVar.c;
        z7f B = y7f.this.B();
        if (B == null) {
            return;
        }
        List<n7f> list = B.d;
        n7f n7fVar = (n7f) j5g.b0(i2, list);
        if (n7fVar == null) {
            return;
        }
        if (n7fVar.c == null) {
            final i8f i8fVar = d6fVar.e;
            h hVar = i8fVar.c;
            final z7f B2 = y7f.this.B();
            if (B2 == null) {
                return;
            }
            i8fVar.d.d(true);
            hVar.d(z7f.a(B2, null, Integer.valueOf(i2), null, null, 495));
            rwi.d().h().d(123, hVar.a(), new izs() { // from class: xsna.d8f
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    Intent intent = (Intent) obj;
                    i8f.w7(intent);
                    ArrayList d2 = B2.d(i2);
                    i8f.this.i = d2;
                    intent.putExtra("total_selection_limit", d2.size());
                    intent.putExtra("selection_limit", d2.size());
                    intent.putExtra("total_selection_limit", d2.size());
                    intent.putExtra("single_mode", false);
                    ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
                    Iterator it = d2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((n7f) it.next()).b.d()));
                    }
                    intent.putExtra("initial_data", new GalleryPickerInitialData(arrayList));
                    intent.putExtra("gallery_picker_source_configuration", new GalleryPickerSourceConfiguration(false, false, null, false, true, false, false, false, null, 495, null));
                    return s3q0.a;
                }
            });
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((n7f) obj).c != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            } else if (((n7f) it.next()).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("ClipsTemplateEditorActionsHandlerImpl can not find cropper position for pos=" + i2 + " state=" + B));
            return;
        }
        a7f a7fVar = new a7f(B.c, arrayList, i3);
        z8dVar.d(true);
        aVar.a(a7fVar);
        qg1 qg1Var = new qg1(8, d6fVar, a7fVar);
        k6f k6fVar = y7f.this.a;
        k6fVar.rl(true);
        k6fVar.Ui(true, qg1Var);
        z8dVar.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // xsna.j6f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v() {
        MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType eventType;
        t8o0 t8o0Var;
        int i2;
        a aVar;
        ?? r9;
        t8o0 t8o0Var2;
        if (this.a.B8()) {
            return;
        }
        MobileOfficialAppsClipsStat$ClipsCreateContext A = A();
        d6f d6fVar = this.i;
        h6f h6fVar = d6fVar.f;
        a aVar2 = d6fVar.c;
        z7f B = y7f.this.B();
        if (B == null) {
            return;
        }
        ClipAudioTemplate clipAudioTemplate = B.b.L1;
        i6f i6fVar = d6fVar.h;
        MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType eventType2 = MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType.APPLY_TEMPLATE;
        i6fVar.getClass();
        if (clipAudioTemplate != null) {
            String str = clipAudioTemplate.b;
            int K = drm0.K(0, 6, str, BundleUtil.UNDERLINE_TAG, false);
            Integer valueOf = Integer.valueOf(K);
            if (K < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Long n = arm0.n(str.substring(0, intValue));
                if (n != null) {
                    eventType = eventType2;
                    long longValue = n.longValue();
                    Integer m = arm0.m(10, str.substring(intValue + 1));
                    if (m != null) {
                        t8o0Var = new t8o0(m.intValue(), longValue);
                        if (t8o0Var != null) {
                            UiTracker uiTracker = UiTracker.a;
                            i2 = 3;
                            MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType eventType3 = eventType;
                            aVar = aVar2;
                            r9 = 0;
                            new o8f(UiTracker.c(), SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipTemplateItem(eventType3, t8o0Var.b, t8o0Var.a, A), 3)).q();
                        } else {
                            i2 = 3;
                            aVar = aVar2;
                            r9 = 0;
                        }
                        if (B.b() < i2) {
                            h6fVar.getClass();
                            h6fVar.b(y8g0.f(R.string.clips_template_editor_min_fragments_count_duration_text_snackbar, Integer.valueOf(i2)));
                            return;
                        }
                        long c2 = B.c();
                        o.getClass();
                        if (c2 < TimeUnit.SECONDS.toMillis(1L)) {
                            h6fVar.getClass();
                            h6fVar.b(y8g0.f(R.string.clips_template_editor_min_fragments_count_duration_ms_text_snackbar, 3L));
                            return;
                        }
                        dc50 dc50Var = B.c;
                        List<n7f> list = B.d;
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ClipsTemplateEditorVideoItem clipsTemplateEditorVideoItem = ((n7f) it.next()).c;
                            if (clipsTemplateEditorVideoItem != null) {
                                arrayList.add(clipsTemplateEditorVideoItem);
                            }
                        }
                        MusicTrack musicTrack = dc50Var.a;
                        String str2 = musicTrack.i;
                        if (str2 == null) {
                            str2 = "";
                        }
                        StoryMusicInfo storyMusicInfo = new StoryMusicInfo(musicTrack, str2, dc50Var.b, dc50Var.c, dc50Var.d, null, false, 0, false, false, null, false, false, 8160, null);
                        d6fVar.g.b(r9);
                        d6fVar.d.d(true);
                        String str3 = B.a;
                        if (clipAudioTemplate != null) {
                            String str4 = clipAudioTemplate.b;
                            int K2 = drm0.K(r9, 6, str4, BundleUtil.UNDERLINE_TAG, r9);
                            Integer valueOf2 = Integer.valueOf(K2);
                            if (K2 < 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                int intValue2 = valueOf2.intValue();
                                Long n2 = arm0.n(str4.substring(r9, intValue2));
                                if (n2 != null) {
                                    long longValue2 = n2.longValue();
                                    Integer m2 = arm0.m(10, str4.substring(intValue2 + 1));
                                    if (m2 != null) {
                                        t8o0Var2 = new t8o0(m2.intValue(), longValue2);
                                        y7f y7fVar = y7f.this;
                                        b8f b8fVar = (b8f) y7fVar.k.getValue();
                                        z7f B2 = y7fVar.B();
                                        b8fVar.Z(new jhd0(str3, t8o0Var2, storyMusicInfo, arrayList, B2 != null ? B2.h : null, y7fVar.A()));
                                        return;
                                    }
                                }
                            }
                        }
                        t8o0Var2 = null;
                        y7f y7fVar2 = y7f.this;
                        b8f b8fVar2 = (b8f) y7fVar2.k.getValue();
                        z7f B22 = y7fVar2.B();
                        b8fVar2.Z(new jhd0(str3, t8o0Var2, storyMusicInfo, arrayList, B22 != null ? B22.h : null, y7fVar2.A()));
                        return;
                    }
                    t8o0Var = null;
                    if (t8o0Var != null) {
                    }
                    if (B.b() < i2) {
                    }
                }
            }
        }
        eventType = eventType2;
        t8o0Var = null;
        if (t8o0Var != null) {
        }
        if (B.b() < i2) {
        }
    }

    @Override // xsna.j6f
    public final void x() {
        d6f d6fVar = this.i;
        a aVar = d6fVar.c;
        z7f B = y7f.this.B();
        if (B == null) {
            return;
        }
        if (B.b() <= 0) {
            y7f.this.a.finish();
            return;
        }
        h6f h6fVar = d6fVar.f;
        b bVar = h6fVar.a;
        r870.a().e().i();
        androidx.appcompat.app.d dVar = h6fVar.b;
        if (dVar != null) {
            dVar.dismiss();
        }
        z7f B2 = y7f.this.B();
        if (!(B2 != null ? B2.i : true)) {
            bVar.a(false);
            return;
        }
        Context b2 = bVar.b();
        ArrayList o2 = e43.o(new xu20(null, b2.getString(R.string.clips_template_editor_draft_modal_title), 0, null, 12));
        o2.add(new ModalActionSheetListItem(1, null, b2.getString(R.string.clips_template_editor_draft_modal_save), null, null, 0, null, false, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
        o2.add(new ModalActionSheetListItem(2, ModalActionSheetListItem.Appearance.Negative, b2.getString(R.string.clips_template_editor_draft_modal_delete), null, null, 0, null, false, false, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED));
        a.C0785a c0785a = new a.C0785a();
        c0785a.b = o2;
        c0785a.c = new op1(h6fVar, 27);
        c0785a.a(b2, null);
    }
}
