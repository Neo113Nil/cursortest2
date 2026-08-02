package xsna;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.stickers.api.ClipsEditorStickersStyleEditScreen$Type;
import com.vk.clips.editor.stickers.api.NewStickersArranger;
import kotlin.collections.EmptyList;
import xsna.wzd;

/* compiled from: ClipsEditorStickersStyleEditDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class f0e implements e0e {
    public final x8d a;
    public final nal0 b;
    public final rzd c;
    public final e2e d;
    public final qu e;
    public h0e f;
    public com.vk.clips.editor.state.model.b g;
    public boolean h;
    public final bpn0 i = new bpn0(new sa0(this, 25));
    public final bpn0 j = new bpn0(new im0(this, 20));

    /* compiled from: ClipsEditorStickersStyleEditDelegateImpl.kt */
    public final class a {
        public a() {
        }
    }

    /* compiled from: ClipsEditorStickersStyleEditDelegateImpl.kt */
    public final class b {
        public b() {
        }

        public final void a(kr9 kr9Var) {
            NewStickersArranger newStickersArranger = NewStickersArranger.CENTER;
            com.vk.clips.editor.state.model.b bVar = new com.vk.clips.editor.state.model.b(kr9Var);
            f0e f0eVar = f0e.this;
            h0e h0eVar = f0eVar.f;
            if (h0eVar == null) {
                h0eVar = null;
            }
            rj01 rj01Var = f0eVar.d.b;
            h0eVar.f.invoke(bVar, Boolean.valueOf(kr9Var instanceof xlo0), newStickersArranger);
            Bundle bundle = new Bundle();
            bundle.putString("vertical_scroll_to_item_id", bVar.a);
            f0eVar.c(new ClipsEditorScreen.a.C0579a(bundle));
        }

        public final void b() {
            f0e.this.b.invalidate();
        }

        public final void c(nov novVar) {
            if (novVar != null) {
                novVar.setInEditMode(false);
            }
            f0e f0eVar = f0e.this;
            f0eVar.b.invalidate();
            e2e e2eVar = f0eVar.d;
            com.vk.clips.editor.state.model.b bVar = f0eVar.g;
            if (bVar == null || novVar == null) {
                f0eVar.c(null);
                return;
            }
            if (e2eVar.b.i(bVar.b, novVar)) {
                f0eVar.c(null);
                return;
            }
            wzd.a aVar = novVar instanceof xlo0 ? new wzd.a(cvc.a, 1) : new wzd.a(yuc.a, 1);
            rzd rzdVar = f0eVar.c;
            rzdVar.c(com.vk.clips.editor.state.model.a.c(rzdVar.getState(), null, null, null, null, l4p.d(rzdVar.getState().f, bVar.a, new com.vk.clips.editor.state.model.b(novVar.copy())), null, 95), e43.l(aVar, new wzd.b(bVar)));
            f0eVar.c(null);
        }

        public final void d(nov novVar) {
            f0e f0eVar = f0e.this;
            f0eVar.b.r2(novVar);
            vzd.b(f0eVar.c, novVar, EmptyList.b);
        }
    }

    /* compiled from: ClipsEditorStickersStyleEditDelegateImpl.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsEditorStickersStyleEditScreen$Type.values().length];
            try {
                iArr[ClipsEditorStickersStyleEditScreen$Type.HASHTAG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsEditorStickersStyleEditScreen$Type.MENTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsEditorStickersStyleEditScreen$Type.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f0e(c9d c9dVar, nal0 nal0Var, rzd rzdVar, e2e e2eVar, qu quVar) {
        this.a = c9dVar;
        this.b = nal0Var;
        this.c = rzdVar;
        this.d = e2eVar;
        this.e = quVar;
    }

    @Override // xsna.e0e
    public final void a(h0e h0eVar) {
        this.f = h0eVar;
    }

    @Override // xsna.e0e
    public final void b(ClipsEditorScreen.a aVar) {
        ClipsEditorStickersStyleEditScreen$Type clipsEditorStickersStyleEditScreen$Type = (ClipsEditorStickersStyleEditScreen$Type) (aVar != null ? aVar.a.getSerializable("sticker_type") : null);
        com.vk.clips.editor.state.model.b bVar = aVar instanceof ClipsEditorScreen.a.b ? ((ClipsEditorScreen.a.b) aVar).b : null;
        this.h = aVar != null ? aVar.a.getBoolean("from_fullscreen") : false;
        this.g = bVar != null ? new com.vk.clips.editor.state.model.b(bVar.a, bVar.b.copy()) : null;
        this.a.d(true);
        int i = clipsEditorStickersStyleEditScreen$Type == null ? -1 : d.$EnumSwitchMapping$0[clipsEditorStickersStyleEditScreen$Type.ordinal()];
        bpn0 bpn0Var = this.i;
        if (i == 1) {
            ((w4f) bpn0Var.getValue()).a(bVar != null ? bVar.b : null);
            return;
        }
        if (i == 2) {
            ((w4f) bpn0Var.getValue()).b(bVar != null ? bVar.b : null);
            return;
        }
        if (i != 3) {
            h0e h0eVar = this.f;
            (h0eVar != null ? h0eVar : null).e.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
            return;
        }
        Size size = new Size(iah0.f().widthPixels, iah0.f().heightPixels);
        w4f w4fVar = (w4f) bpn0Var.getValue();
        nov novVar = bVar != null ? bVar.b : null;
        int width = this.b.getWidth();
        h0e h0eVar2 = this.f;
        Float b2 = (h0eVar2 != null ? h0eVar2 : null).c.b();
        w4fVar.c(novVar, size, width, (int) (b2 != null ? b2.floatValue() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    public final void c(ClipsEditorScreen.a.C0579a c0579a) {
        if (this.h) {
            h0e h0eVar = this.f;
            (h0eVar != null ? h0eVar : null).e.b(ClipsEditorScreen.State.VIDEO_FULLSCREEN, c0579a);
        } else {
            h0e h0eVar2 = this.f;
            (h0eVar2 != null ? h0eVar2 : null).e.b(ClipsEditorScreen.State.VIDEO_CROPPER, c0579a);
        }
    }

    @Override // xsna.e0e
    public final void onClosed() {
        this.g = null;
        this.h = false;
    }

    /* compiled from: ClipsEditorStickersStyleEditDelegateImpl.kt */
    public final class c implements xpa0 {
        public c() {
        }

        @Override // xsna.xpa0
        public final s5l0 J() {
            return (s5l0) f0e.this.j.getValue();
        }

        @Override // xsna.xpa0
        public final int K() {
            return f0e.this.b.getWidth();
        }

        @Override // xsna.xpa0
        public final Size L() {
            int i = iah0.f().widthPixels;
            h0e h0eVar = f0e.this.f;
            if (h0eVar == null) {
                h0eVar = null;
            }
            return new Size(i, h0eVar.c().getHeight());
        }

        @Override // xsna.xpa0
        public final Bitmap M() {
            return null;
        }

        @Override // xsna.xpa0
        public final k9l0 N() {
            f0e f0eVar = f0e.this;
            w4f w4fVar = (w4f) f0eVar.i.getValue();
            nal0 nal0Var = f0eVar.b;
            return w4fVar.d(nal0Var.getWidth(), nal0Var.getHeight(), nal0Var.getStickers());
        }

        @Override // xsna.xpa0
        public final int O() {
            return f0e.this.b.getHeight();
        }

        @Override // xsna.xpa0
        public final boolean P() {
            return true;
        }

        @Override // xsna.xpa0
        public final Size Q() {
            h0e h0eVar = f0e.this.f;
            if (h0eVar == null) {
                h0eVar = null;
            }
            return h0eVar.c();
        }

        @Override // xsna.xpa0
        public final void R() {
            f0e.this.b.i().a(false);
        }

        @Override // xsna.xpa0
        public final void S(int i) {
            f0e f0eVar = f0e.this;
            x8d x8dVar = f0eVar.a;
            x8dVar.l();
            x8dVar.d(false);
            f0eVar.b.i().a(false);
        }

        @Override // xsna.xpa0
        public final Bitmap T() {
            return f0e.this.b.f();
        }

        @Override // xsna.xpa0
        public final Point U() {
            return null;
        }

        @Override // xsna.xpa0
        public final int V() {
            return (int) f0e.this.a.n();
        }

        @Override // xsna.xpa0
        public final String W() {
            return "";
        }

        @Override // xsna.xpa0
        public final void playVideo() {
            f0e f0eVar = f0e.this;
            f0eVar.a.j();
            f0eVar.b.i().a(true);
        }

        @Override // xsna.xpa0
        public final void C0(String str) {
        }
    }
}
