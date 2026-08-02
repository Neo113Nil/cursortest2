package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.clips.editor.state.model.FragmentType;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.clips.media.AudioConfigEditor;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.editor.timeline.api.YIndexShift;
import com.vk.editor.timeline.entity.Edge;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.t60;
import xsna.wn2;
import xsna.xwo0;
import xsna.zwd;

/* compiled from: ClipsEditorVideoCropperView.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes16.dex */
public final class s0e implements r0e, ClipsEditorScreen {
    public final ViewStub b;
    public final wn2 c;
    public final p0e d;
    public final tdl0 e;
    public final g1t0 f;
    public final e2e g;
    public final com.vk.clips.editor.base.api.b h;
    public final boolean i;
    public boolean l;
    public final bpn0 q;
    public final bpn0 r;
    public final bpn0 s;
    public final xwo0 t;
    public final mg7 u;
    public final ClipsEditorScreen.State j = ClipsEditorScreen.State.VIDEO_CROPPER;
    public d k = d.CLOSED;
    public final bpn0 m = new bpn0(new z4(this, 27));
    public final bpn0 n = new bpn0(new defpackage.f(this, 15));
    public final bpn0 o = new bpn0(new defpackage.g(this, 26));
    public final bpn0 p = new bpn0(new defpackage.h(this, 21));

    /* compiled from: ClipsEditorVideoCropperView.kt */
    public final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int id = view.getId();
            s0e s0eVar = s0e.this;
            if (id != R.id.go_back_btn) {
                if (id != R.id.change_author_btn_container || s0eVar.g().Z4()) {
                    return;
                }
                s0eVar.d.H();
                return;
            }
            if (s0eVar.k != d.VOICEOVER) {
                s0eVar.h.a();
                return;
            }
            s0eVar.g().f5();
            s0eVar.k = d.MAIN;
            s0eVar.e(true);
        }
    }

    /* compiled from: ClipsEditorVideoCropperView.kt */
    public final class c implements rwo0 {
        public c() {
        }

        @Override // xsna.rwo0
        public final void M() {
            s0e s0eVar = s0e.this;
            s0eVar.d.M();
            s0eVar.l = true;
        }

        @Override // xsna.rwo0
        public final void a() {
            s0e.this.d.a();
        }

        @Override // xsna.rwo0
        public final void b() {
            s0e.this.d.O().b();
        }

        @Override // xsna.rwo0
        public final void c(y3o0 y3o0Var) {
            s0e.this.d.O().c(y3o0Var);
        }

        @Override // xsna.rwo0
        public final void d(y3o0 y3o0Var) {
            s0e.this.d.O().d(y3o0Var);
        }

        @Override // xsna.rwo0
        public final void e() {
            s0e.this.d.O().e();
        }

        @Override // xsna.rwo0
        public final void f(y3o0 y3o0Var, Edge edge, long j, long j2, Long l) {
            s0e.this.d.f(y3o0Var, edge, j, j2, l);
        }

        @Override // xsna.rwo0
        public final void g() {
            s0e.this.d.L();
        }

        @Override // xsna.rwo0
        public final void h() {
            s0e.this.d.h();
        }

        @Override // xsna.rwo0
        public final void i(y3o0 y3o0Var, long j, long j2) {
            s0e.this.d.O().i(y3o0Var, j, j2);
        }

        @Override // xsna.rwo0
        public final void j() {
            s0e.this.d.j();
        }

        @Override // xsna.rwo0
        public final void k() {
            s0e.this.d.k();
        }

        @Override // xsna.rwo0
        public final void l() {
            s0e.this.d.l();
        }

        @Override // xsna.rwo0
        public final void m(y3o0 y3o0Var) {
            s0e s0eVar = s0e.this;
            s0eVar.d.K(null);
            FragmentType.a aVar = FragmentType.Companion;
            String str = y3o0Var.b;
            aVar.getClass();
            if (FragmentType.a.a(str) == FragmentType.VIDEO) {
                s0eVar.h.b(ClipsEditorScreen.State.SWAP, null);
            }
        }

        @Override // xsna.rwo0
        public final void n() {
            s0e s0eVar = s0e.this;
            s0eVar.d.n();
            s0eVar.l = false;
        }

        @Override // xsna.rwo0
        public final void o() {
            s0e.this.d.o();
        }

        @Override // xsna.rwo0
        public final void p() {
            s0e.this.d.p();
        }

        @Override // xsna.rwo0
        public final void q() {
            s0e.this.d.q();
        }

        @Override // xsna.rwo0
        public final boolean r(y3o0 y3o0Var) {
            return s0e.this.d.r(y3o0Var);
        }

        @Override // xsna.rwo0
        public final void s(y3o0 y3o0Var, Long l, YIndexShift yIndexShift) {
            s0e.this.d.s(y3o0Var, l, yIndexShift);
        }

        @Override // xsna.rwo0
        public final void t(long j) {
            s0e.this.d.seekTo(j);
        }

        @Override // xsna.rwo0
        public final void u() {
            s0e s0eVar = s0e.this;
            p0e p0eVar = s0eVar.d;
            if (s0eVar.l) {
                return;
            }
            p0eVar.K(null);
            p0eVar.u();
            s0eVar.d();
        }

        @Override // xsna.rwo0
        public final void v(int i, y3o0 y3o0Var) {
            p0e p0eVar = s0e.this.d;
            p0eVar.L();
            p0eVar.K(null);
            p0eVar.v(i, y3o0Var);
        }

        @Override // xsna.rwo0
        public final void w() {
            s0e.this.d.w();
        }

        @Override // xsna.rwo0
        public final void x(View view) {
            s0e.this.d.J(view);
        }

        @Override // xsna.rwo0
        public final void y(View view, int i, int i2, long j) {
            s0e s0eVar = s0e.this;
            p0e p0eVar = s0eVar.d;
            p0eVar.L();
            p0eVar.K(null);
            switch (i) {
                case 13:
                    p0eVar.i();
                    break;
                case 14:
                    p0eVar.F();
                    break;
                case 15:
                    p0eVar.y();
                    break;
                case 17:
                    p0eVar.N(i2, j);
                    break;
                case 19:
                    s0eVar.h.b(ClipsEditorScreen.State.SWAP, null);
                    break;
                case 20:
                    p0eVar.D(view);
                    break;
                case 21:
                    p0eVar.G();
                    break;
                case 22:
                    p0eVar.B();
                    break;
            }
        }

        @Override // xsna.rwo0
        public final void z() {
            s0e.this.d.t();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsEditorVideoCropperView.kt */
    public static final class d {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d CLOSED;
        public static final d MAIN;
        public static final d VOICEOVER;

        static {
            d dVar = new d("CLOSED", 0);
            CLOSED = dVar;
            d dVar2 = new d("MAIN", 1);
            MAIN = dVar2;
            d dVar3 = new d("VOICEOVER", 2);
            VOICEOVER = dVar3;
            d[] dVarArr = {dVar, dVar2, dVar3};
            $VALUES = dVarArr;
            $ENTRIES = new asp(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsEditorVideoCropperView.kt */
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.VOICEOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s0e(ViewStub viewStub, wn2 wn2Var, p0e p0eVar, udl0 udl0Var, g1t0 g1t0Var, e2e e2eVar, uy50 uy50Var, boolean z) {
        this.b = viewStub;
        this.c = wn2Var;
        this.d = p0eVar;
        this.e = udl0Var;
        this.f = g1t0Var;
        this.g = e2eVar;
        this.h = uy50Var;
        this.i = z;
        bpn0 bpn0Var = new bpn0(new defpackage.i(this, 24));
        this.q = bpn0Var;
        this.r = new bpn0(new defpackage.j(this, 20));
        this.s = new bpn0(new ah(this, 24));
        bpn0 bpn0Var2 = new bpn0(new m4(this, 22));
        bpn0 bpn0Var3 = new bpn0(new pu(this, 25));
        this.t = new xwo0(e2eVar);
        this.u = new mg7(this, 1);
        p0eVar.E(this);
        ((View) bpn0Var2.getValue()).setOnClickListener(new w16(this, 2));
        ((View) bpn0Var3.getValue()).setOnClickListener(new yn3(this, 4));
        gxd gxdVar = e2eVar.f;
        View e2 = ((rhd) gxdVar.b.getValue()).e(getCtx());
        if (e2 != null) {
            ((FrameLayout) bpn0Var.getValue()).addView(e2, new FrameLayout.LayoutParams(-1, -1));
            jjc.f(new a(), (FrameLayout) bpn0Var.getValue());
            ((FrameLayout) bpn0Var.getValue()).setVisibility(0);
        }
        jjc.f(new a(), f());
    }

    @Override // xsna.r0e
    public final com.vk.clips.editor.base.api.b a() {
        return this.h;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        int i = e.$EnumSwitchMapping$0[this.k.ordinal()];
        if (i == 1) {
            return g().a0();
        }
        if (i != 2) {
            if (i == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        g().f5();
        e(true);
        this.k = d.MAIN;
        return true;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        this.k = d.MAIN;
        o();
        wn2.a.a(this.c, i(), (View) this.n.getValue(), new wn2.b(z, true), Collections.singletonList((TransformOverlayView) this.o.getValue()), 16);
        d();
        e(true);
        p0e p0eVar = this.d;
        p0eVar.x();
        swd m = p0eVar.m();
        tdl0 tdl0Var = this.e;
        tdl0Var.c(m);
        tdl0Var.h(new b());
        g().addOnLayoutChangeListener(this.u);
        tdl0Var.g(false);
        tdl0Var.k(true);
        tdl0Var.l(true, true);
        tdl0Var.i(new ju1(this, 11));
        awt0.u(f(), true ^ this.i);
        if (aVar != null) {
            String string = aVar.a.getString("vertical_scroll_to_item_id", "");
            if (myc0.f(string)) {
                g().h5(string);
            }
        }
    }

    @Override // xsna.r0e
    public final void c(boolean z) {
        tdl0 tdl0Var = this.e;
        if (z) {
            tdl0Var.k(false);
            tdl0Var.l(false, false);
        } else {
            tdl0Var.k(true);
            tdl0Var.l(true, true);
        }
        tdl0Var.g(z);
        swd m = this.d.m();
        if (z) {
            m = null;
        }
        tdl0Var.c(m);
        tdl0Var.h(z ? null : new b());
        tdl0Var.f(z);
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        g().removeOnLayoutChangeListener(this.u);
        this.c.d(i(), null);
        g().setTimelineListener(null);
        e(false);
        this.d.onClosed();
        tdl0 tdl0Var = this.e;
        tdl0Var.c(null);
        tdl0Var.h(null);
        tdl0Var.f(false);
        tdl0Var.g(true);
        tdl0Var.k(false);
        tdl0Var.l(false, false);
        tdl0Var.i(new e8(this, 12));
        this.k = d.CLOSED;
    }

    public final void d() {
        jne jneVar;
        e2e e2eVar = this.g;
        cxd cxdVar = e2eVar.k;
        cmf cmfVar = e2eVar.i;
        xwo0.a aVar = new xwo0.a(i().getContext(), e2eVar.k);
        ywd ywdVar = cxdVar.b;
        xwo0.a.a(aVar, ywdVar.a, 13, R.string.clip_timeline_action_text, null, null, 56);
        h7v h7vVar = e2eVar.n.a;
        HintId hintId = HintId.CLIPS_ADD_TRENDING_MUSIC_TO_YOUR_CLIP;
        if (h7vVar.a(hintId.getId())) {
            Hint p = h7vVar.p(hintId.getId());
            String str = p != null ? p.c : null;
            if (str == null) {
                str = "";
            }
            jneVar = new jne(str, hintId.getId());
        } else {
            jneVar = null;
        }
        e5p0 e5p0Var = jneVar == null ? null : new e5p0(jneVar.a, jneVar.b);
        zwd.b bVar = ywdVar.c;
        p0e p0eVar = this.d;
        xwo0.a.a(aVar, bVar, 20, R.string.clip_timeline_action_sound, p0eVar.A() ? new t60.a() : null, e5p0Var, 16);
        xwo0.a.a(aVar, ywdVar.b, 15, R.string.clip_timeline_action_sticker, null, null, 56);
        xwo0.a.a(aVar, ywdVar.d, 17, R.string.clip_timeline_action_split, new t60.b(), null, 48);
        xwo0.a.a(aVar, ywdVar.e, 19, R.string.clip_timeline_action_swap, null, null, 56);
        xwo0.a.a(aVar, ywdVar.f, 21, R.string.clip_timeline_action_save, null, null, 56);
        xwo0.a.a(aVar, ywdVar.g, 22, R.string.clip_timeline_action_format, null, null, 56);
        wwo0 C = p0eVar.C(aVar);
        g().k5(cmfVar.e(), cmfVar.c());
        g().setSettings(C);
        g().setTimelineListener(new c());
        g().setShowOnboardingTooltipCallback(new com.vk.movika.tools.controls.seekbar.v(this, 4));
        this.f.b2(false);
    }

    public final void e(boolean z) {
        tdl0 tdl0Var = this.e;
        if (z) {
            tdl0Var.d(new ps2(this, 10));
        } else {
            tdl0Var.d(null);
        }
    }

    public final VkToolButton f() {
        return (VkToolButton) this.r.getValue();
    }

    public final VideoEditTimelineView g() {
        return (VideoEditTimelineView) this.p.getValue();
    }

    @Override // xsna.r0e
    public final Context getCtx() {
        return i().getContext();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.j;
    }

    public final VkText h() {
        return (VkText) this.s.getValue();
    }

    public final View i() {
        return (View) this.m.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    public final void j(l0e l0eVar, boolean z) {
        long j;
        x4l0 x4l0Var;
        boolean z2;
        String str;
        Context ctx = getCtx();
        xwo0 xwo0Var = this.t;
        m900<Integer, Drawable> m900Var = xwo0Var.b;
        e2e e2eVar = xwo0Var.a;
        List<com.vk.clips.editor.state.model.c> list = l0eVar.a;
        List<com.vk.clips.editor.state.model.c> list2 = list;
        Iterator it = list2.iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += ((com.vk.clips.editor.state.model.c) it.next()).getDurationMs();
        }
        cxd cxdVar = e2eVar.k;
        cyd cydVar = cxdVar.c;
        cyd cydVar2 = cxdVar.c;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        int i = 0;
        while (true) {
            List<com.vk.clips.editor.state.model.c> list3 = list;
            if (!it2.hasNext()) {
                long j3 = j2;
                ArrayList a2 = new uwd(0, j3, true, ctx, m900Var).a(Collections.singletonList(l0eVar.b), cxdVar);
                boolean z3 = !a2.isEmpty();
                List<List<ClipsEditorAudioItem>> list4 = l0eVar.c;
                ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                Iterator it3 = list4.iterator();
                ?? r2 = z3;
                while (it3.hasNext()) {
                    arrayList2.add(new uwd(r2, j3, false, ctx, m900Var).a((List) it3.next(), cxdVar));
                    r2++;
                }
                List<List<com.vk.clips.editor.state.model.b>> list5 = l0eVar.d;
                ArrayList arrayList3 = new ArrayList(c5g.u(list5, 10));
                Iterator it4 = list5.iterator();
                int i2 = r2;
                while (it4.hasNext()) {
                    List list6 = (List) it4.next();
                    int i3 = xwo0.c;
                    i2e0 i2e0Var = new i2e0();
                    i2e0Var.a = i3;
                    List list7 = list6;
                    Iterator it5 = it4;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list7, 10));
                    Iterator it6 = list7.iterator();
                    while (it6.hasNext()) {
                        com.vk.clips.editor.state.model.b bVar = (com.vk.clips.editor.state.model.b) it6.next();
                        nov novVar = bVar.b;
                        Iterator it7 = it6;
                        if (novVar instanceof xlo0) {
                            x4l0Var = new x4l0(e43.a.getColor(R.color.vk_violet_tint), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_text_outline_24, 100, ((xlo0) novVar).l.toString(), null, null);
                        } else if (novVar instanceof v4m0) {
                            x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_hashtag_outline_24, 100, drm0.U(((v4m0) novVar).h.c, "#"), null, null);
                        } else if (novVar instanceof x6m0) {
                            x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_mention_outline_24, 100, drm0.U(((x6m0) novVar).h.d, "@"), null, null);
                        } else {
                            if (novVar instanceof ad7) {
                                ad7 ad7Var = (ad7) novVar;
                                j = j3;
                                x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_sticker_smile_outline_24, 4, null, ad7Var.n, new com.vk.movika.sdk.base.ui.s(17, i2e0Var, ad7Var));
                            } else {
                                j = j3;
                                if (novVar instanceof g4m0) {
                                    x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_sticker_smile_outline_24, 36, null, null, new z260((g4m0) novVar, 26));
                                } else if (novVar instanceof ate0) {
                                    x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_sticker_smile_outline_24, 68, null, ((ate0) novVar).k, null);
                                } else if (novVar instanceof v800) {
                                    x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_sticker_smile_outline_24, 36, null, null, new ejf0((v800) novVar, 6));
                                } else if (novVar instanceof yjm0) {
                                    hzo0 r = ((yjm0) novVar).r();
                                    x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_clock_outline_24, 100, r != null ? r.m().toString() : null, null, null);
                                } else {
                                    L.l("Unsupported sticker " + novVar);
                                    x4l0Var = new x4l0(e43.a.getColor(R.color.vk_neon_pink_deep), e43.a.getColor(R.color.vk_white), R.drawable.vk_icon_sticker_smile_outline_28, 100, null, null, null);
                                }
                            }
                            x4l0 x4l0Var2 = x4l0Var;
                            xwo0.b bVar2 = new xwo0.b(ctx, cxdVar, m900Var);
                            bVar2.a(cydVar2.f, 7, R.string.clip_timeline_action_edit);
                            bVar2.a(cydVar2.b, 2, R.string.clip_timeline_action_delete);
                            arrayList4.add(new r7l0(bVar.a, bVar.getOffset().a, bVar.a(), bzd.z, Math.min(Long.MAX_VALUE, j - bVar.getOffset().a), bVar.getOffset().a, bVar2.c, new qwo0(x4l0Var2.b, x4l0Var2.c, x4l0Var2.d, x4l0Var2.e, x4l0Var2.a, x4l0Var2.f, x4l0Var2.g), i2));
                            a2 = a2;
                            it6 = it7;
                            ctx = ctx;
                            m900Var = m900Var;
                            j3 = j;
                        }
                        j = j3;
                        x4l0 x4l0Var22 = x4l0Var;
                        xwo0.b bVar22 = new xwo0.b(ctx, cxdVar, m900Var);
                        bVar22.a(cydVar2.f, 7, R.string.clip_timeline_action_edit);
                        bVar22.a(cydVar2.b, 2, R.string.clip_timeline_action_delete);
                        arrayList4.add(new r7l0(bVar.a, bVar.getOffset().a, bVar.a(), bzd.z, Math.min(Long.MAX_VALUE, j - bVar.getOffset().a), bVar.getOffset().a, bVar22.c, new qwo0(x4l0Var22.b, x4l0Var22.c, x4l0Var22.d, x4l0Var22.e, x4l0Var22.a, x4l0Var22.f, x4l0Var22.g), i2));
                        a2 = a2;
                        it6 = it7;
                        ctx = ctx;
                        m900Var = m900Var;
                        j3 = j;
                    }
                    i2++;
                    arrayList3.add(arrayList4);
                    it4 = it5;
                }
                ArrayList arrayList5 = a2;
                if (!arrayList5.isEmpty()) {
                    arrayList2 = j5g.u0(arrayList2, Collections.singletonList(arrayList5));
                }
                gwo0 gwo0Var = new gwo0(arrayList, arrayList2, arrayList3);
                if (z) {
                    g().setTimelineItemsWithAnimations(gwo0Var);
                    return;
                } else {
                    g().setTimelineItems(gwo0Var);
                    return;
                }
            }
            Object next = it2.next();
            int i4 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            com.vk.clips.editor.state.model.c cVar = (com.vk.clips.editor.state.model.c) next;
            String str2 = cVar.j;
            String path = cVar.a.getPath();
            Iterator it8 = it2;
            long j4 = cVar.b;
            long j5 = cVar.c;
            long b2 = cVar.b();
            long j6 = bzd.z;
            long b3 = cVar.b();
            xwo0.b bVar3 = new xwo0.b(ctx, cxdVar, m900Var);
            AudioConfigEditor audioConfigEditor = cVar.n;
            boolean z4 = cVar.l;
            if (audioConfigEditor != null) {
                z2 = z4;
                str = str2;
                bVar3.a(cydVar.h, 9, R.string.clip_timeline_action_volume);
                bVar3.a(cydVar.e, 5, R.string.clip_timeline_action_effects);
            } else {
                z2 = z4;
                str = str2;
            }
            bVar3.a(cydVar.d, 4, R.string.clip_timeline_action__orrections_res_0x7f1307b0);
            if (!z2) {
                bVar3.a(cydVar.k, 12, R.string.clip_timeline_action_speed);
            }
            if (list3.size() > 1) {
                bVar3.a(cydVar.b, 2, R.string.clip_timeline_action_delete);
            }
            bVar3.a(cydVar.a, 1, R.string.clip_timeline_action_duplicate);
            if (!z2) {
                bVar3.a(cydVar.c, 3, R.string.clip_timeline_action_reverse);
            }
            arrayList.add(new ckt0(str, j4, j5, j6, b3, b2, bVar3.c, path, cVar.s));
            it2 = it8;
            list = list3;
            i = i4;
        }
    }

    public final void k(String str) {
        g().h5(str);
    }

    public final void l(nov novVar, boolean z) {
        tdl0 tdl0Var = this.e;
        tdl0Var.g(z);
        tdl0Var.a(novVar);
    }

    public final void m(String str) {
        g().setEditingAudioItem(str);
    }

    public final void n(boolean z) {
        bpn0 bpn0Var = this.o;
        if (z) {
            d3m.c((TransformOverlayView) bpn0Var.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e((TransformOverlayView) bpn0Var.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    public final void o() {
        if (this.g.k.b.g.a) {
            f4m.t(this.d.I() ? iah0.a(8) : f().getBottom() + iah0.a(16), (View) this.n.getValue());
        }
    }

    /* compiled from: ClipsEditorVideoCropperView.kt */
    public final class b implements ClipsStickersView.e {
        public b() {
        }

        @Override // xsna.sc80
        public final void b(nov novVar) {
            s0e.this.d.b(novVar);
        }

        @Override // xsna.sc80
        public final void f() {
            s0e s0eVar = s0e.this;
            nov movingSticker = s0eVar.e.getMovingSticker();
            if (movingSticker != null) {
                s0eVar.d.g(movingSticker);
            }
        }

        @Override // xsna.sc80
        public final void g() {
            s0e s0eVar = s0e.this;
            nov movingSticker = s0eVar.e.getMovingSticker();
            if (movingSticker != null) {
                s0eVar.d.g(movingSticker);
            }
        }

        @Override // xsna.sc80
        public final void h(nov novVar) {
            s0e.this.d.e(novVar);
        }

        @Override // com.vk.clips.design.view.stikers.ClipsStickersView.e
        public final void a() {
        }

        @Override // com.vk.clips.design.view.stikers.ClipsStickersView.e
        public final void c() {
        }
    }
}
