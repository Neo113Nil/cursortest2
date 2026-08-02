package xsna;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.view.ViewStub;
import com.vk.clips.editor.base.api.ClipsEditorScreen;

/* compiled from: ClipsEditorStickersStyleEditView.kt */
/* loaded from: classes16.dex */
public final class h0e implements ClipsEditorScreen {
    public final ViewStub b;
    public final wn2 c;
    public final e0e d;
    public final com.vk.clips.editor.base.api.b e;
    public final v0e f;
    public final ClipsEditorScreen.State g = ClipsEditorScreen.State.STICKERS_STYLE_EDITOR;
    public final bpn0 h = new bpn0(new ra(this, 22));
    public final bpn0 i = new bpn0(new h20(this, 16));
    public final g0e j = new g0e(this, 0);

    public h0e(ViewStub viewStub, wn2 wn2Var, e0e e0eVar, uy50 uy50Var, v0e v0eVar) {
        this.b = viewStub;
        this.c = wn2Var;
        this.d = e0eVar;
        this.e = uy50Var;
        this.f = v0eVar;
        e0eVar.a(this);
    }

    public final Context a() {
        return ((View) this.h.getValue()).getContext();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        return true;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        boolean z2 = aVar != null ? aVar.a.getBoolean("from_fullscreen") : false;
        this.d.b(aVar);
        if (z2) {
            return;
        }
        ((View) this.h.getValue()).addOnLayoutChangeListener(this.j);
    }

    public final Size c() {
        Size a = this.c.a();
        return a == null ? new Size(iah0.f().widthPixels, iah0.f().heightPixels) : a;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        ((View) this.h.getValue()).removeOnLayoutChangeListener(this.j);
        this.d.onClosed();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.g;
    }
}
