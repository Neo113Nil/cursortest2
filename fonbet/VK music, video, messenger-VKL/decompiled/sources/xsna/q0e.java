package xsna;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.callbacks.tracker.UndoRedoEventSubtype;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.FragmentType;
import com.vk.clips.editor.voiceover.impl.ClipsEditorVoiceOverAudioRecorder;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.clips.VideoTransform;
import com.vk.dto.clips.model.ClipsEditorNextButtonState;
import com.vk.dto.clips.model.ClipsEditorVideoVolumeItem;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.clips.music.ClipsEditorMusicTrack;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.entity.Edge;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeMute;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeUndoRedo;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bzd;
import xsna.dms0;
import xsna.e3m;
import xsna.luc;
import xsna.myd;
import xsna.s0e;
import xsna.swd;
import xsna.vik;
import xsna.wzd;
import xsna.x8d;
import xsna.xwo0;

/* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class q0e implements p0e, x8d.a {
    public final bzd.g a;
    public final bwd b;
    public final hwd c;
    public final c9d d;
    public final szd e;
    public final e2e f;
    public final ClipsEditorFragment.b g;
    public final qzd h;
    public final nal0 i;
    public final ClipsEditorNextButtonState j;
    public final lxd k;
    public s0e l;
    public boolean m;
    public c n = c.a.a;
    public final bpn0 o = new bpn0(new ey0(this, 15));
    public final bpn0 p = new bpn0(new eb(this, 17));
    public final bpn0 q = new bpn0(new e4(this, 15));
    public final bpn0 r = new bpn0(new il1(this, 18));
    public final bpn0 s = new bpn0(new gy0(this, 24));
    public final bpn0 t = new bpn0(new eu1(this, 21));
    public final bpn0 u = new bpn0(new q(this, 21));
    public final bpn0 v = new bpn0(new zy(this, 25));
    public com.vk.clips.editor.voiceover.impl.a w;

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public final class a implements swd.a {
        public a() {
        }

        @Override // xsna.swd.a
        public final void a(nov novVar) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.l(novVar, true);
        }

        @Override // xsna.swd.a
        public final void b(ClipsEditorScreen.State state, ClipsEditorScreen.a.b bVar) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.h.b(state, bVar);
        }

        @Override // xsna.swd.a
        public final void c(com.vk.clips.editor.state.model.b bVar) {
            q0e.this.P(new c.b(bVar), false, true);
        }
    }

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public final class b implements myd.a {
        public b() {
        }

        @Override // xsna.myd.a
        public final void a() {
            bzd.this.d.a();
        }
    }

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public interface c {

        /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
        public static final class a implements c {
            public static final a a = new a();
        }

        /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
        public static final class b implements c {
            public final kyd a;

            public b(kyd kydVar) {
                this.a = kydVar;
            }

            public final boolean equals(Object obj) {
                kyd kydVar;
                String m = this.a.m();
                String str = null;
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null && (kydVar = bVar.a) != null) {
                    str = kydVar.m();
                }
                return epx.f(m, str);
            }

            public final int hashCode() {
                return this.a.m().hashCode();
            }
        }
    }

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public final class d implements vik.a {
        public d() {
        }

        @Override // xsna.vik.a
        public final void a(int i, int i2, boolean z) {
            q0e.this.W(i, i2, z);
        }

        @Override // xsna.vik.a
        public final void b() {
            q0e q0eVar = q0e.this;
            c9d c9dVar = q0eVar.d;
            c9dVar.d(false);
            c9dVar.o();
            com.vk.clips.editor.state.model.c j = q0eVar.e.o.a.j(q0eVar.b.e());
            if (j != null) {
                q0eVar.P(new c.b(j), false, true);
            }
        }

        @Override // xsna.vik.a
        public final void c(VideoTransform videoTransform) {
            q0e q0eVar = q0e.this;
            q0eVar.b.b(videoTransform);
            q0eVar.d.p();
        }
    }

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public final class e {
        public e() {
        }

        public final void a(boolean z) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.l = z;
        }

        public final void b() {
            q0e q0eVar = q0e.this;
            s0e s0eVar = q0eVar.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.getClass();
            s0eVar.k = s0e.d.MAIN;
            s0eVar.e(true);
            s0eVar.g().b5();
            ((FrameLayout) s0eVar.q.getValue()).setVisibility(0);
            Drawable drawable = s0eVar.getCtx().getDrawable(R.drawable.vk_icon_cancel_outline_28);
            if (drawable != null) {
                VkToolButton.b(s0eVar.f(), drawable);
            }
            awt0.v(s0eVar.f(), true);
            q0eVar.V(false);
            d(false);
            q0eVar.w = null;
        }

        public final void c(boolean z) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.c(z);
        }

        public final void d(boolean z) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            if (z) {
                s0eVar.g().d5();
            } else {
                s0eVar.g().m5();
            }
        }

        public final void e(String str, boolean z, boolean z2, io.reactivex.rxjava3.core.q<Integer> qVar) {
            s0e s0eVar = q0e.this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.e(false);
            s0eVar.k = s0e.d.VOICEOVER;
            s0eVar.g().l5(str, z, z2, qVar);
            f4m.j((FrameLayout) s0eVar.q.getValue());
            Drawable drawable = s0eVar.getCtx().getDrawable(R.drawable.vk_icon_arrow_left_outline_28);
            if (drawable != null) {
                VkToolButton.b(s0eVar.f(), drawable);
            }
            awt0.v(s0eVar.f(), !z);
        }
    }

    /* compiled from: ClipsEditorVideoCropperDelegateImpl.kt */
    public static final /* synthetic */ class f {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FragmentType.values().length];
            try {
                iArr[FragmentType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FragmentType.LICENSED_MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FragmentType.AUDIO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FragmentType.STICKER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public q0e(bzd.g gVar, bwd bwdVar, hwd hwdVar, c9d c9dVar, szd szdVar, e2e e2eVar, ClipsEditorFragment.b bVar, qzd qzdVar, nal0 nal0Var, ClipsEditorNextButtonState clipsEditorNextButtonState, lxd lxdVar) {
        this.a = gVar;
        this.b = bwdVar;
        this.c = hwdVar;
        this.d = c9dVar;
        this.e = szdVar;
        this.f = e2eVar;
        this.g = bVar;
        this.h = qzdVar;
        this.i = nal0Var;
        this.j = clipsEditorNextButtonState;
        this.k = lxdVar;
    }

    @Override // xsna.p0e
    public final boolean A() {
        return this.e.o.a.a.a != null;
    }

    @Override // xsna.p0e
    public final void B() {
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        s0eVar.h.b(ClipsEditorScreen.State.ASPECT_RATIO, null);
    }

    @Override // xsna.p0e
    public final wwo0 C(xwo0.a aVar) {
        boolean z;
        szd szdVar = this.e;
        boolean z2 = szdVar.o.a.e() < dxd.a;
        yzd yzdVar = szdVar.o.a.b;
        boolean z3 = yzdVar.a;
        boolean z4 = yzdVar.c;
        boolean z5 = yzdVar.b;
        boolean z6 = this.d.k;
        com.vk.clips.editor.state.model.a aVar2 = szdVar.o.a;
        boolean z7 = aVar2.b.d;
        List<com.vk.clips.editor.state.model.c> list = aVar2.c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((com.vk.clips.editor.state.model.c) it.next()).n != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return new wwo0(z2, z3, z5, z4, z, z6, z7, (int) (iah0.f().heightPixels * 0.25f), aVar.b, this.j);
    }

    @Override // xsna.p0e
    public final void D(View view) {
        if (A()) {
            return;
        }
        myd S = S();
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        S.a(s0eVar.getCtx(), view);
    }

    @Override // xsna.p0e
    public final void E(s0e s0eVar) {
        this.l = s0eVar;
    }

    @Override // xsna.p0e
    public final void F() {
        if (A()) {
            return;
        }
        myd S = S();
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        S.b(s0eVar.getCtx());
        s3q0 s3q0Var = s3q0.a;
    }

    @Override // xsna.p0e
    public final void G() {
        PrivateFiles.a b2;
        L();
        K(null);
        cbr cbrVar = cbr.a;
        bzd bzdVar = bzd.this;
        ayd aydVar = bzdVar.e.j;
        b2 = e8r.a.b(r4, PrivateSubdir.TEMP_UPLOADS.h(), true);
        File file = b2.a;
        cbrVar.getClass();
        File e2 = cbr.e(file, null, "mp4");
        bzdVar.k(e2, new defpackage.o(11, bzdVar, e2));
    }

    @Override // xsna.p0e
    public final void H() {
        d2e d2eVar = this.f.h;
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        ((rhd) d2eVar.b.getValue()).c(s0eVar.getCtx(), MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_EDITOR);
    }

    @Override // xsna.p0e
    public final boolean I() {
        return this.e.o.a.g.b == 0.5625f;
    }

    @Override // xsna.p0e
    public final void J(View view) {
        L();
        K(null);
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.b bVar = new e.b(view, null, null, l, 6);
        bVar.w = R.layout.ds_internal_context_menu_item;
        String string = view.getContext().getString(R.string.clip_editor_add_fragment_from_camera);
        Context context = view.getContext();
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_camera_outline_28, context);
        ClipsEditorFragment.b bVar2 = this.g;
        bVar.h(e43.l(new VkContextMenu.a(string, a2, null, false, false, new il1(bVar2, 16), 28), new VkContextMenu.a(view.getContext().getString(R.string.clip_editor_add_fragment_from_gallery), m33.a(R.drawable.vk_icon_picture_outline_28, view.getContext()), null, false, false, new gy0(bVar2, 22), 28)));
        bVar.e = view.getContext();
        bVar.g(R.attr.vk_ui_icon_primary);
        VkContextMenu.c.k(bVar);
    }

    @Override // xsna.p0e
    public final void K(String str) {
        com.vk.clips.editor.state.model.c j = this.e.o.a.j(str);
        if (j != null) {
            P(new c.b(j), false, true);
        } else {
            P(c.a.a, false, true);
        }
    }

    @Override // xsna.p0e
    public final void L() {
        this.d.d(true);
    }

    @Override // xsna.p0e
    public final void M() {
        this.m = true;
        c9d c9dVar = this.d;
        c9dVar.b(true);
        c9dVar.d(true);
    }

    @Override // xsna.p0e
    public final void N(int i, long j) {
        dms0 dms0Var = (dms0) this.r.getValue();
        com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(i, dms0Var.d.o.a.c);
        if (cVar != null) {
            boolean z = j > cVar.b + 300;
            boolean z2 = j < cVar.c - 300;
            Pair pair = null;
            if (!z || !z2) {
                hwd hwdVar = dms0Var.c;
                cxd cxdVar = dms0Var.f.k;
                hwdVar.i(100L, null);
                return;
            }
            szd szdVar = dms0Var.e.e;
            com.vk.clips.editor.state.model.c cVar2 = (com.vk.clips.editor.state.model.c) j5g.b0(i, szdVar.o.a.c);
            if (cVar2 != null) {
                long durationMs = cVar2.getDurationMs();
                long j2 = bzd.z;
                if (durationMs >= 2 * j2) {
                    long max = Math.max(cVar2.b + j2, Math.min(j, cVar2.c - j2));
                    com.vk.clips.editor.state.model.c a2 = com.vk.clips.editor.state.model.c.a(cVar2, null, 0L, max, null, null, UUID.randomUUID().toString(), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523771);
                    com.vk.clips.editor.state.model.c a3 = com.vk.clips.editor.state.model.c.a(cVar2, null, max, 0L, null, null, UUID.randomUUID().toString(), null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523773);
                    List l = e43.l(a2, a3);
                    wzd.c cVar3 = new wzd.c(0);
                    wzd.a aVar = new wzd.a(luc.c.a, 1);
                    ArrayList arrayList = new ArrayList(i7o0.a(szdVar.o.a.c));
                    if (arrayList.size() > i) {
                        arrayList.remove(i);
                        arrayList.addAll(i, l);
                        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, arrayList, null, null, null, null, 123), j5g.V(rl3.I(new wzd[]{cVar3, aVar})));
                    }
                    pair = new Pair(a2, a3);
                }
            }
            if (pair != null) {
                P(new c.b((com.vk.clips.editor.state.model.c) pair.d()), false, false);
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    @Override // xsna.p0e
    public final vwd O() {
        return (vwd) this.q.getValue();
    }

    public final void P(c cVar, boolean z, boolean z2) {
        if (this.n.equals(cVar)) {
            return;
        }
        this.n = cVar;
        if (cVar.equals(c.a.a)) {
            Q().k(true);
            s0e s0eVar = this.l;
            if (s0eVar == null) {
                s0eVar = null;
            }
            s0eVar.n(false);
            d().e = true;
            s0e s0eVar2 = this.l;
            if (s0eVar2 == null) {
                s0eVar2 = null;
            }
            s0eVar2.l(null, false);
            if (z) {
                return;
            }
            s0e s0eVar3 = this.l;
            (s0eVar3 != null ? s0eVar3 : null).g().a5();
            return;
        }
        if (!(cVar instanceof c.b)) {
            throw new NoWhenBranchMatchedException();
        }
        kyd kydVar = ((c.b) cVar).a;
        String m = kydVar.m();
        if (!z) {
            s0e s0eVar4 = this.l;
            if (s0eVar4 == null) {
                s0eVar4 = null;
            }
            if (U(m, s0eVar4.g().c5(m))) {
                s0e s0eVar5 = this.l;
                if (s0eVar5 == null) {
                    s0eVar5 = null;
                }
                s0eVar5.g().i5(kydVar.m());
            }
        }
        L();
        if (z2) {
            com.vk.clips.editor.state.model.a aVar = this.e.o.a;
            String m2 = kydVar.m();
            c9d c9dVar = this.d;
            Long b2 = aVar.b(c9dVar.n(), m2);
            if (b2 != null) {
                c9dVar.seekTo(b2.longValue());
            }
        }
        if (kydVar instanceof com.vk.clips.editor.state.model.b) {
            com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) kydVar;
            Q().l(bVar);
            s0e s0eVar6 = this.l;
            if (s0eVar6 == null) {
                s0eVar6 = null;
            }
            s0eVar6.n(false);
            s0e s0eVar7 = this.l;
            (s0eVar7 != null ? s0eVar7 : null).l(bVar.b, true);
            d().e = false;
            return;
        }
        if (kydVar instanceof ClipsEditorAudioItem) {
            Q().k(true);
            s0e s0eVar8 = this.l;
            if (s0eVar8 == null) {
                s0eVar8 = null;
            }
            s0eVar8.n(false);
            d().e = false;
            s0e s0eVar9 = this.l;
            if (s0eVar9 == null) {
                s0eVar9 = null;
            }
            s0eVar9.l(null, true);
            return;
        }
        if (!(kydVar instanceof com.vk.clips.editor.state.model.c)) {
            throw new NoWhenBranchMatchedException();
        }
        Q().k(false);
        s0e s0eVar10 = this.l;
        if (s0eVar10 == null) {
            s0eVar10 = null;
        }
        s0eVar10.n(true);
        W(T().g(), (int) T().getStickerRotation(), T().j());
        d().e = true;
        s0e s0eVar11 = this.l;
        if (s0eVar11 == null) {
            s0eVar11 = null;
        }
        s0eVar11.l(null, true);
    }

    public final swd Q() {
        return (swd) this.v.getValue();
    }

    public final wo4 R() {
        return (wo4) this.t.getValue();
    }

    public final myd S() {
        return (myd) this.u.getValue();
    }

    public final o0e T() {
        return (o0e) this.o.getValue();
    }

    public final boolean U(String str, String str2) {
        if (str2 != null) {
            FragmentType.Companion.getClass();
            FragmentType a2 = FragmentType.a.a(str2);
            if (a2 != null) {
                int i = f.$EnumSwitchMapping$0[a2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3 && i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (epx.f(str, "AUDIO_TIMELINE_ITEM_ADD_ID")) {
                        myd S = S();
                        s0e s0eVar = this.l;
                        if (s0eVar == null) {
                            s0eVar = null;
                        }
                        S.b(s0eVar.getCtx());
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void V(boolean z) {
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        com.vk.clips.editor.state.model.a aVar = this.e.o.a;
        s0eVar.j(new l0e(aVar.c, aVar.d, aVar.e, aVar.f), z);
    }

    public final void W(int i, int i2, boolean z) {
        PointF[] l = T().l();
        ArrayList arrayList = new ArrayList(l.length);
        for (PointF pointF : l) {
            arrayList.add(e43.l(Float.valueOf(pointF.x), Float.valueOf(pointF.y)));
        }
        float[] L0 = j5g.L0(c5g.v(arrayList));
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i - 100);
        sb.append('%');
        String sb2 = sb.toString();
        String b2 = vu5.b(new StringBuilder(), -i2, (char) 176);
        TransformOverlayView transformOverlayView = (TransformOverlayView) s0eVar.o.getValue();
        int i3 = TransformOverlayView.f;
        transformOverlayView.a(L0, sb2, b2, z, true);
    }

    @Override // xsna.p0e
    public final void a() {
        c9d c9dVar = this.d;
        c9dVar.d(true);
        c9dVar.b(true);
    }

    @Override // xsna.p0e
    public final void b(nov novVar) {
        Q().j(novVar);
    }

    @Override // xsna.x8d.a
    public final void c(long j) {
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        s0eVar.g().g5(j);
    }

    @Override // xsna.p0e
    public final vik d() {
        return (vik) this.p.getValue();
    }

    @Override // xsna.p0e
    public final void e(nov novVar) {
        Q().e(novVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0261  */
    @Override // xsna.p0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(y3o0 y3o0Var, Edge edge, long j, long j2, Long l) {
        dms0 dms0Var;
        int i;
        hwd hwdVar;
        szd szdVar;
        kyd kydVar;
        boolean z;
        boolean z2;
        FragmentType.a aVar = FragmentType.Companion;
        String str = y3o0Var.b;
        aVar.getClass();
        FragmentType a2 = FragmentType.a.a(str);
        if (a2 == null) {
            return;
        }
        String str2 = y3o0Var.a;
        kyd d2 = this.e.o.a.d(str2);
        int i2 = f.$EnumSwitchMapping$0[a2.ordinal()];
        Long l2 = null;
        if (i2 == 1) {
            dms0 dms0Var2 = (dms0) this.r.getValue();
            hwd hwdVar2 = dms0Var2.c;
            szd szdVar2 = dms0Var2.d;
            Iterator<T> it = szdVar2.o.a.c.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                Object next = it.next();
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                if (epx.f(((com.vk.clips.editor.state.model.c) next).j, str2)) {
                    break;
                } else {
                    i3++;
                }
            }
            Integer valueOf = i3 == -1 ? null : Integer.valueOf(i3);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                Iterator<T> it2 = szdVar2.o.a.c.subList(0, intValue).iterator();
                long j3 = 0;
                while (it2.hasNext()) {
                    j3 += ((com.vk.clips.editor.state.model.c) it2.next()).getDurationMs();
                }
                int i4 = dms0.a.$EnumSwitchMapping$0[edge.ordinal()];
                if (i4 == 1) {
                    l2 = Long.valueOf(j3);
                } else if (i4 == 2) {
                    l2 = Long.valueOf(((j2 - j) + j3) - 1);
                } else if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                szd szdVar3 = dms0Var2.e.e;
                com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) j5g.b0(intValue, szdVar3.o.a.c);
                if (cVar != null) {
                    dms0Var = dms0Var2;
                    kydVar = d2;
                    z = false;
                    hwdVar = hwdVar2;
                    szdVar = szdVar2;
                    com.vk.clips.editor.state.model.c a3 = com.vk.clips.editor.state.model.c.a(cVar, null, j, j2, null, null, null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 524281);
                    z2 = true;
                    List l3 = e43.l(new wzd.c(new com.vk.voip.ui.menu.feature.a(l2, 23)), new wzd.a(luc.h.a, 1));
                    ArrayList arrayList = new ArrayList(i7o0.a(szdVar3.o.a.c));
                    i = intValue;
                    if (arrayList.size() > i) {
                        arrayList.set(i, a3);
                        szdVar3.c(com.vk.clips.editor.state.model.a.c(szdVar3.o.a, null, arrayList, null, null, null, null, 123), j5g.V(l3));
                    }
                } else {
                    dms0Var = dms0Var2;
                    i = intValue;
                    hwdVar = hwdVar2;
                    szdVar = szdVar2;
                    kydVar = d2;
                    z = false;
                    z2 = true;
                }
                com.vk.clips.editor.state.model.c cVar2 = (com.vk.clips.editor.state.model.c) j5g.b0(i, szdVar.o.a.c);
                if (cVar2 != null) {
                    String str3 = cVar2.j;
                    long j4 = j2 - j;
                    boolean z3 = Math.abs(cVar2.b() - j4) < 20 ? z2 : z;
                    boolean z4 = Math.abs(bzd.z - j4) < 20 ? z2 : z;
                    if (cVar2.l && z3) {
                        cxd cxdVar = dms0Var.f.k;
                        hwdVar.g(5000L, str3);
                    } else {
                        hwd hwdVar3 = hwdVar;
                        if (z4) {
                            hwdVar3.i(bzd.z, str3);
                        }
                    }
                }
                if (kydVar == null) {
                    P(new c.b(kydVar), z, z2);
                    return;
                }
                return;
            }
        } else if (i2 == 2) {
            R().b(str2, j, j2, l, true);
        } else if (i2 == 3) {
            R().b(str2, j, j2, l, false);
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            szd szdVar4 = ((i4l0) this.s.getValue()).a;
            com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) l4p.a(str2, szdVar4.o.a.f);
            if (bVar != null) {
                long longValue = l.longValue();
                nov copy = bVar.b.copy();
                copy.getCommons().p(new q500(longValue, j2));
                String str4 = bVar.a;
                szdVar4.c(com.vk.clips.editor.state.model.a.c(szdVar4.o.a, null, null, null, null, l4p.d(szdVar4.o.a.f, str4, new com.vk.clips.editor.state.model.b(str4, copy)), null, 95), e43.l(new wzd.a(luc.h.a, 1), new wzd.b(null)));
            }
        }
        kydVar = d2;
        z = false;
        z2 = true;
        if (kydVar == null) {
        }
    }

    @Override // xsna.p0e
    public final void g(nov novVar) {
        Q().g(novVar);
    }

    @Override // xsna.p0e
    public final void h() {
        K(null);
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        s0eVar.h.b(ClipsEditorScreen.State.VIDEO_FULLSCREEN, null);
    }

    @Override // xsna.p0e
    public final void i() {
        Q().i();
    }

    @Override // xsna.p0e
    public final void j() {
        this.d.d(true);
    }

    @Override // xsna.p0e
    public final void k() {
        com.vk.clips.editor.voiceover.impl.a aVar = this.w;
        if (aVar != null) {
            aVar.f();
        }
        this.w = null;
    }

    @Override // xsna.p0e
    public final void l() {
        P(c.a.a, true, true);
    }

    @Override // xsna.p0e
    public final swd m() {
        return Q();
    }

    @Override // xsna.p0e
    public final void n() {
        this.m = false;
        this.d.b(false);
    }

    @Override // xsna.p0e
    public final void o() {
        com.vk.clips.editor.voiceover.impl.a aVar;
        if (this.m || (aVar = this.w) == null) {
            return;
        }
        c9d c9dVar = aVar.c;
        szd szdVar = aVar.d;
        e eVar = aVar.b;
        e2e e2eVar = aVar.e;
        a1e a1eVar = aVar.l;
        if (a1eVar == null) {
            a1eVar = null;
        }
        if (a1eVar.a) {
            aVar.a();
            return;
        }
        if (!aVar.d()) {
            hwd hwdVar = aVar.f;
            cxd cxdVar = e2eVar.k;
            hwdVar.a(100L);
            return;
        }
        eVar.a(true);
        eVar.d(true);
        ClipsEditorVoiceOverAudioRecorder b2 = aVar.b();
        long n = c9dVar.n();
        long e2 = szdVar.o.a.e() - n;
        vzd.c(szdVar, yzd.a(szdVar.o.a.b, false, false, false, false, true, 15));
        a1e a1eVar2 = aVar.l;
        if (a1eVar2 == null) {
            a1eVar2 = null;
        }
        eVar.e(String.valueOf(a1eVar2.b.b), true, true, aVar.k);
        a1e a1eVar3 = aVar.l;
        if (a1eVar3 == null) {
            a1eVar3 = null;
        }
        a1e a2 = a1e.a(a1eVar3, true, Long.valueOf(e2), 46);
        aVar.l = a2;
        File file = a2.c;
        int i = (int) e2;
        int i2 = 0;
        if (b2.e != ClipsEditorVoiceOverAudioRecorder.State.IDLE) {
            try {
                b2.b.reset();
            } catch (Exception e3) {
                lyd.a.g(e3, Arrays.copyOf(new Object[0], 0));
                try {
                    b2.b.release();
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable unused) {
                }
                b2.b = Build.VERSION.SDK_INT >= 31 ? x0e.a(b2.a) : new MediaRecorder();
            }
            b2.a(ClipsEditorVoiceOverAudioRecorder.State.IDLE);
        }
        b2.a(ClipsEditorVoiceOverAudioRecorder.State.PREPARING);
        try {
            b2.b.setAudioSource(1);
            b2.b.setOutputFormat(2);
            b2.b.setMaxDuration(i);
            b2.b.setAudioEncoder(3);
            b2.b.setAudioEncodingBitRate(96000);
            b2.b.setAudioChannels(2);
            b2.b.setAudioSamplingRate(44100);
            b2.b.setOnErrorListener(b2);
            b2.b.setOnInfoListener(b2);
            b2.b.setOutputFile(file);
            b2.b.prepare();
            b2.a(ClipsEditorVoiceOverAudioRecorder.State.PREPARED);
            b2.b.start();
            System.currentTimeMillis();
            b2.a(ClipsEditorVoiceOverAudioRecorder.State.RECORDING);
        } catch (Exception e4) {
            b2.f = e4;
            lyd.a.a("ClipsEditorVoiceOverAudioRecorder", e4);
            b2.a(ClipsEditorVoiceOverAudioRecorder.State.ERROR);
        }
        aVar.h = new io.reactivex.rxjava3.internal.operators.observable.t(new b1e(i2)).L(new com.vk.movika.sdk.base.hooks.f(new p40(aVar, 28), 10), false).r0(e2eVar.i.e().c()).subscribe(new is1(new s9(aVar, 22), 13), new js1(new t9(aVar, 25), 14));
        com.vk.clips.editor.state.model.a aVar2 = szdVar.o.a;
        a1e a1eVar4 = aVar.l;
        ClipsEditorAudioItem a3 = aVar2.a(String.valueOf((a1eVar4 == null ? null : a1eVar4).b.b));
        ClipsEditorAudioItem a4 = ClipsEditorAudioItem.a(a3, ClipsEditorMusicInfo.zb(a3.a, null, null, 0, 0, (int) n, null, 0, 2019), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
        StringBuilder b3 = fp.b(n, "start record startMs==playbackController.getCurrentTimestamp()=", " stateController.state.durationMs=");
        b3.append(szdVar.o.a.e());
        b3.append(" maxDuration=");
        b3.append(e2);
        b3.append(" updatedAudioFragment=");
        b3.append(com.vk.clips.editor.voiceover.impl.a.g(a4.a));
        lyd.a.e(Arrays.copyOf(new Object[]{"ClipsEditorVoiceoverDelegateImpl", b3.toString()}, 2));
        aVar.h(a4, a4.f, EmptyList.b);
        c9dVar.u();
    }

    @Override // xsna.p0e
    public final void onClosed() {
        S().dispose();
        vfg0 vfg0Var = (vfg0) ((dms0) this.r.getValue()).i.getValue();
        wdt0 wdt0Var = vfg0Var.h;
        if (wdt0Var != null) {
            wdt0Var.f.set(true);
            wdt0Var.a();
        }
        vfg0Var.h = null;
        hg1.f(vfg0Var.g);
        vfg0Var.g = null;
        this.d.h(this);
    }

    @Override // xsna.p0e
    public final void p() {
        L();
        K(null);
        this.e.d(true);
    }

    @Override // xsna.p0e
    public final void q() {
        luc lucVar;
        L();
        K(null);
        dms0 dms0Var = (dms0) this.r.getValue();
        qzd qzdVar = dms0Var.g;
        szd szdVar = dms0Var.d;
        if (szdVar.o.a.b.d) {
            if (qzdVar != null) {
                qzdVar.a(new MobileOfficialAppsClipsStat$TypeMute(MobileOfficialAppsClipsStat$TypeMute.EventSubtype.DISABLE));
            }
            lucVar = wuc.a;
        } else {
            if (qzdVar != null) {
                qzdVar.a(new MobileOfficialAppsClipsStat$TypeMute(MobileOfficialAppsClipsStat$TypeMute.EventSubtype.ENABLE));
            }
            lucVar = vuc.a;
        }
        yzd yzdVar = szdVar.o.a.b;
        boolean z = !yzdVar.d;
        yzd a2 = yzd.a(yzdVar, false, false, false, z, false, 23);
        List<com.vk.clips.editor.state.model.c> list = szdVar.o.a.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (com.vk.clips.editor.state.model.c cVar : list) {
            arrayList.add(com.vk.clips.editor.state.model.c.a(cVar, null, 0L, 0L, null, null, null, null, null, null, new ClipsEditorVideoVolumeItem(cVar.r.b, z), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 393215));
        }
        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, a2, arrayList, null, null, null, null, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), Collections.singletonList(new wzd.a(lucVar, 1)));
    }

    @Override // xsna.p0e
    public final boolean r(y3o0 y3o0Var) {
        String str = y3o0Var.a;
        boolean U = U(str, y3o0Var.b);
        kyd d2 = this.e.o.a.d(str);
        if (d2 != null) {
            P(new c.b(d2), true, true);
        }
        return U;
    }

    @Override // xsna.p0e
    public final void s(y3o0 y3o0Var, Long l, YIndexShift yIndexShift) {
        YIndexShift yIndexShift2 = yIndexShift;
        YIndexShift.Mode mode = yIndexShift2.b;
        int i = yIndexShift2.a;
        FragmentType.a aVar = FragmentType.Companion;
        String str = y3o0Var.b;
        aVar.getClass();
        FragmentType a2 = FragmentType.a.a(str);
        if (a2 == null) {
            return;
        }
        String str2 = y3o0Var.a;
        this.d.b(false);
        int i2 = f.$EnumSwitchMapping$0[a2.ordinal()];
        if (i2 == 2) {
            R().a(str2, l, null, true);
            return;
        }
        e2e e2eVar = this.f;
        if (i2 == 3) {
            if (e2eVar.k.c.j.a) {
                yIndexShift2 = new YIndexShift(i - 1, mode);
            }
            R().a(str2, l, yIndexShift2, false);
            return;
        }
        if (i2 != 4) {
            lyd.a.c(new IllegalArgumentException("move is not supported for fragment with type: " + a2.name()));
            return;
        }
        if (e2eVar.k.c.j.a) {
            yIndexShift2 = new YIndexShift((i - 1) - this.e.o.a.e.size(), mode);
        }
        szd szdVar = ((i4l0) this.s.getValue()).a;
        com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) l4p.a(str2, szdVar.o.a.f);
        if (bVar == null) {
            return;
        }
        nov novVar = bVar.b;
        String str3 = bVar.a;
        List<? extends wzd> l2 = e43.l(new wzd.a(luc.f.a, 1), new wzd.b(null));
        nov copy = novVar.copy();
        copy.getCommons().p(new q500(l.longValue(), (bVar.a() + l.longValue()) - bVar.getOffset().a));
        szdVar.c(com.vk.clips.editor.state.model.a.c(szdVar.o.a, null, null, null, null, l4p.c(yIndexShift2.a, str3, yIndexShift2.b == YIndexShift.Mode.MIDDLE, l4p.d(szdVar.o.a.f, str3, new com.vk.clips.editor.state.model.b(str3, copy))), null, 95), l2);
    }

    @Override // xsna.p0e
    public final void seekTo(long j) {
        this.d.seekTo(j);
    }

    @Override // xsna.p0e
    public final void t() {
        K(null);
        bzd.this.l();
    }

    @Override // xsna.p0e
    public final void u() {
        this.d.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x028c, code lost:
    
        if (r32 == 1) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x028e, code lost:
    
        if (r32 == 2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0290, code lost:
    
        if (r32 == 3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0292, code lost:
    
        if (r32 == 4) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0294, code lost:
    
        if (r32 == 5) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0296, code lost:
    
        if (r32 == 9) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x029a, code lost:
    
        if (r32 == 12) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x029c, code lost:
    
        xsna.lyd.a.h((java.lang.String[]) java.util.Arrays.copyOf(new java.lang.String[]{"ClipsEditorVideoCropperDelegateImpl", xsna.tgw.b(r32, "action ", " does not exists for video fragment")}, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02b2, code lost:
    
        r1 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r6.d.o.a.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02c0, code lost:
    
        if (r1 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c2, code lost:
    
        r1 = r1.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r1 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02c8, code lost:
    
        r6.a.a().b(com.vk.clips.editor.base.api.ClipsEditorScreen.State.SPEED, new com.vk.clips.editor.base.api.ClipsEditorScreen.a.C0579a(xsna.q9k.a("fragment_id", r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02dd, code lost:
    
        r6.getClass();
        r1 = new android.os.Bundle();
        r1.putString("fragment_id", r2);
        r6.a.a().b(com.vk.clips.editor.base.api.ClipsEditorScreen.State.VOLUME, new com.vk.clips.editor.base.api.ClipsEditorScreen.a.C0579a(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02f8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02f9, code lost:
    
        r1 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r6.d.o.a.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0307, code lost:
    
        if (r1 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0309, code lost:
    
        r1 = r1.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030b, code lost:
    
        if (r1 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x030f, code lost:
    
        r6.a.a().b(com.vk.clips.editor.base.api.ClipsEditorScreen.State.AUDIO_EFFECTS, new com.vk.clips.editor.base.api.ClipsEditorScreen.a.C0579a(xsna.q9k.a("fragment_id", r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0323, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0324, code lost:
    
        r1 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r6.d.o.a.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0332, code lost:
    
        if (r1 == null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0334, code lost:
    
        r1 = r1.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0336, code lost:
    
        if (r1 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033a, code lost:
    
        r6.a.a().b(com.vk.clips.editor.base.api.ClipsEditorScreen.State.CORRECTION, new com.vk.clips.editor.base.api.ClipsEditorScreen.a.C0579a(xsna.q9k.a("fragment_id", r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x034e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x034f, code lost:
    
        r1 = (xsna.vfg0) r6.i.getValue();
        r2 = new xsna.ogs0(r6, r3, r14);
        r4 = r1.c;
        r5 = r1.d;
        r3 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r1.b.o.a.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x036e, code lost:
    
        if (r3 != null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0372, code lost:
    
        r4.d(true);
        r6 = r3.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0377, code lost:
    
        if (r6 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x037d, code lost:
    
        if (r6.exists() == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x037f, code lost:
    
        r2.invoke(new xsna.vfg0.a.c(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0387, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0388, code lost:
    
        r6 = r5.k;
        r5 = r5.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0390, code lost:
    
        if (r6.b() == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0392, code lost:
    
        r4.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0395, code lost:
    
        r1.e.d();
        r11 = new io.reactivex.rxjava3.subjects.f();
        xsna.hg1.f(r1.g);
        r1.g = xsna.cug0.c(new io.reactivex.rxjava3.internal.operators.single.k(new io.reactivex.rxjava3.internal.operators.single.v(new xsna.jg6(r1, r3.a, r11, r15)), new xsna.ph8(r1, r7)), r1.a, null, r11, new xsna.nh3(27, r2, r1), 18).q(r5.e().b()).m(r5.e().d()).subscribe(new xsna.dh40(new xsna.p010(r2, 23), 14), new xsna.s520(new xsna.ufg0(0, r2, r1), 15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0403, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0404, code lost:
    
        r6.b.d(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0417, code lost:
    
        if (((com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r6.d.o.a.c)) == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0419, code lost:
    
        r1 = r6.e.e;
        r2 = new xsna.wzd.a(xsna.quc.a, 1);
        r4 = new xsna.wzd.c(0);
        r8 = new java.util.ArrayList(xsna.i7o0.a(r1.o.a.c));
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x043d, code lost:
    
        if (r8.size() <= r3) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x043f, code lost:
    
        r3 = (com.vk.clips.editor.state.model.c) r8.remove(r3);
        r1.c(com.vk.clips.editor.state.model.a.c(r1.o.a, null, r8, null, null, null, null, 123), xsna.j5g.V(xsna.rl3.I(new xsna.wzd[]{r4, r2})));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0466, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0467, code lost:
    
        r6.b.d(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x047a, code lost:
    
        if (((com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r6.d.o.a.c)) == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x047c, code lost:
    
        r1 = r6.e.e;
        r16 = (com.vk.clips.editor.state.model.c) xsna.j5g.b0(r3, r1.o.a.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x048e, code lost:
    
        if (r16 == null) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0490, code lost:
    
        r2 = com.vk.clips.editor.state.model.c.a(r16, null, 0, 0, null, null, java.util.UUID.randomUUID().toString(), null, null, null, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 523775);
        r5 = new xsna.wzd.a(xsna.luc.e.a, 1);
        r6 = new xsna.wzd.c(new xsna.awd(r3, 0));
        r2 = java.util.Collections.singletonList(r2);
        r7 = new java.util.ArrayList(xsna.i7o0.a(r1.o.a.c));
        r7.addAll(r3 + 1, r2);
        r1.c(com.vk.clips.editor.state.model.a.c(r1.o.a, null, r7, null, null, null, null, 123), xsna.j5g.V(xsna.rl3.I(new xsna.wzd[]{r6, r5})));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0505, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x027a, code lost:
    
        r13 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0275, code lost:
    
        if (r10 != (-1)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0277, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x027e, code lost:
    
        if (r13 == null) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0280, code lost:
    
        r3 = r13.intValue();
        r6 = (xsna.dms0) r31.r.getValue();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
    @Override // xsna.p0e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(int i, y3o0 y3o0Var) {
        FragmentType.a aVar = FragmentType.Companion;
        String str = y3o0Var.b;
        aVar.getClass();
        FragmentType a2 = FragmentType.a.a(str);
        if (a2 != null) {
            String str2 = y3o0Var.a;
            int i2 = f.$EnumSwitchMapping$0[a2.ordinal()];
            int i3 = 4;
            int i4 = 1;
            int i5 = 2;
            if (i2 == 1) {
                Iterator it = this.e.o.a.c.iterator();
                int i6 = 0;
                while (true) {
                    ?? r17 = r13;
                    if (!it.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    Object next = it.next();
                    if (i6 < 0) {
                        e43.t();
                        throw r17;
                    }
                    if (epx.f(((com.vk.clips.editor.state.model.c) next).j, str2)) {
                        break;
                    }
                    i6++;
                    r13 = r17;
                }
            } else {
                c.a aVar2 = c.a.a;
                if (i2 == 2) {
                    wo4 R = R();
                    if (i == 2) {
                        R.c(str2, true);
                        return;
                    }
                    if (i == 5) {
                        R.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putString("fragment_id", str2);
                        R.b.b(ClipsEditorScreen.State.AUDIO_EFFECTS, new ClipsEditorScreen.a.C0579a(bundle));
                        return;
                    }
                    switch (i) {
                        case 8:
                            myd S = S();
                            s0e s0eVar = this.l;
                            S.b((s0eVar != null ? s0eVar : null).getCtx());
                            return;
                        case 9:
                            R.getClass();
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("fragment_id", str2);
                            R.b.b(ClipsEditorScreen.State.VOLUME, new ClipsEditorScreen.a.C0579a(bundle2));
                            return;
                        case 10:
                            P(aVar2, false, true);
                            s0e s0eVar2 = this.l;
                            (s0eVar2 != null ? s0eVar2 : null).m(str2);
                            return;
                        case 11:
                            myd S2 = S();
                            s0e s0eVar3 = this.l;
                            S2.b((s0eVar3 != null ? s0eVar3 : null).getCtx());
                            return;
                        case 12:
                            R.getClass();
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("fragment_id", str2);
                            R.b.b(ClipsEditorScreen.State.SPEED, new ClipsEditorScreen.a.C0579a(bundle3));
                            return;
                        default:
                            lyd.a.h((String[]) Arrays.copyOf(new String[]{"ClipsEditorVideoCropperDelegateImpl", tgw.b(i, "action ", " does not exists for licensed music fragment")}, 2));
                            return;
                    }
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (i == 2) {
                        szd szdVar = ((i4l0) this.s.getValue()).a;
                        List l = e43.l(new wzd.a(zuc.a, 1), new wzd.b(null));
                        com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) l4p.a(str2, szdVar.o.a.f);
                        if (bVar == null) {
                            return;
                        }
                        vzd.b(szdVar, bVar.b, l);
                        return;
                    }
                    if (i != 7) {
                        lyd.a.h((String[]) Arrays.copyOf(new String[]{"ClipsEditorVideoCropperDelegateImpl", tgw.b(i, "action ", " does not exists for sticker fragment")}, 2));
                        return;
                    }
                    s0e s0eVar4 = this.l;
                    if (s0eVar4 == null) {
                        s0eVar4 = null;
                    }
                    s0eVar4.h.b(ClipsEditorScreen.State.VIDEO_FULLSCREEN, null);
                    return;
                }
                wo4 R2 = R();
                if (i == 1) {
                    szd szdVar2 = R2.a;
                    ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) l4p.a(str2, szdVar2.o.a.e);
                    if (clipsEditorAudioItem == null) {
                        return;
                    }
                    ClipsEditorAudioItem a3 = ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorAudioItem.a, ClipsEditorMusicTrack.zb(clipsEditorAudioItem.a.b, (int) UUID.randomUUID().getLeastSignificantBits(), 0, null, 2046), null, 0, 0, 0, null, 0, 2046), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
                    List<? extends wzd> singletonList = Collections.singletonList(new wzd.a(ruc.a, 1));
                    com.vk.clips.editor.state.model.a aVar3 = szdVar2.o.a;
                    ArrayList arrayList = new ArrayList(aVar3.e);
                    arrayList.add(Collections.singletonList(a3));
                    szdVar2.c(com.vk.clips.editor.state.model.a.c(aVar3, null, null, null, arrayList, null, null, 111), singletonList);
                    return;
                }
                if (i == 2) {
                    R2.c(str2, false);
                    return;
                }
                if (i == 5) {
                    R2.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("fragment_id", str2);
                    R2.b.b(ClipsEditorScreen.State.AUDIO_EFFECTS, new ClipsEditorScreen.a.C0579a(bundle4));
                    return;
                }
                if (i == 12) {
                    R2.getClass();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("fragment_id", str2);
                    R2.b.b(ClipsEditorScreen.State.SPEED, new ClipsEditorScreen.a.C0579a(bundle5));
                    return;
                }
                if (i == 9) {
                    R2.getClass();
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("fragment_id", str2);
                    R2.b.b(ClipsEditorScreen.State.VOLUME, new ClipsEditorScreen.a.C0579a(bundle6));
                    return;
                }
                if (i != 10) {
                    lyd.a.h((String[]) Arrays.copyOf(new String[]{"ClipsEditorVideoCropperDelegateImpl", tgw.b(i, "action ", " does not exists for audio fragment")}, 2));
                    return;
                }
                P(aVar2, false, true);
                s0e s0eVar5 = this.l;
                if (s0eVar5 == null) {
                    s0eVar5 = null;
                }
                s0eVar5.k(str2);
                s0e s0eVar6 = this.l;
                (s0eVar6 != null ? s0eVar6 : null).m(str2);
            }
        }
    }

    @Override // xsna.p0e
    public final void w() {
        Object obj;
        qzd j;
        L();
        K(null);
        szd szdVar = this.e;
        LinkedList<com.vk.clips.editor.state.model.d> linkedList = szdVar.l;
        if (linkedList.size() > 0) {
            szdVar.m.addLast(linkedList.getFirst());
            com.vk.clips.editor.state.model.d removeFirst = linkedList.removeFirst();
            com.vk.clips.editor.state.model.a aVar = removeFirst.a;
            List<wzd> list = removeFirst.b;
            szdVar.e(aVar, list);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof wzd.a) {
                        break;
                    }
                }
            }
            if (!(obj instanceof wzd.a)) {
                obj = null;
            }
            wzd.a aVar2 = (wzd.a) obj;
            luc lucVar = aVar2 != null ? aVar2.b : null;
            if (lucVar != null) {
                bzd bzdVar = bzd.this;
                Integer a2 = lucVar.a();
                if (a2 != null) {
                    String s = wlb0.s(a2.intValue(), bzdVar.c.getCtx());
                    s0e s0eVar = bzdVar.h.l;
                    s0e s0eVar2 = s0eVar != null ? s0eVar : null;
                    s0eVar2.h().setText(s);
                    if (f4m.h(s0eVar2.h())) {
                        s0eVar2.h().clearAnimation();
                        d3m.e(s0eVar2.h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 3000L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    } else {
                        d3m.c(s0eVar2.h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new pu5(s0eVar2, 2), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
                UndoRedoEventSubtype c2 = lucVar.c();
                if (c2 == null || (j = bzdVar.j()) == null) {
                    return;
                }
                j.a(new MobileOfficialAppsClipsStat$TypeUndoRedo(MobileOfficialAppsClipsStat$TypeUndoRedo.EventType.REDO, MobileOfficialAppsClipsStat$TypeUndoRedo.EventSubtype.valueOf(c2.name())));
            }
        }
    }

    @Override // xsna.p0e
    public final void x() {
        c9d c9dVar = this.d;
        c9dVar.k(this);
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        com.vk.clips.editor.state.model.a aVar = this.e.o.a;
        s0eVar.j(new l0e(aVar.c, aVar.d, aVar.e, aVar.f), false);
        c9dVar.o();
        c(c9dVar.n());
        P(c.a.a, false, true);
    }

    @Override // xsna.p0e
    public final void y() {
        this.d.d(true);
        s0e s0eVar = this.l;
        if (s0eVar == null) {
            s0eVar = null;
        }
        s0eVar.h.b(ClipsEditorScreen.State.STICKERS_SELECTOR, null);
    }

    @Override // xsna.p0e
    public final void z() {
        com.vk.clips.editor.state.model.c j = this.e.o.a.j(this.b.e());
        if (j != null) {
            P(new c.b(j), false, true);
        }
    }
}
