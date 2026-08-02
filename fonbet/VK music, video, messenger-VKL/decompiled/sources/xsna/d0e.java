package xsna;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.clips.editor.stickers.api.NewStickersArranger;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import java.util.EnumSet;

/* compiled from: ClipsEditorStickersSelectorView.kt */
/* loaded from: classes16.dex */
public final class d0e implements ClipsEditorScreen {
    public final ViewStub b;
    public final nal0 c;
    public final com.vk.clips.editor.base.api.b d;
    public final u0e e;
    public final ClipsEditorScreen.State f = ClipsEditorScreen.State.STICKERS_SELECTOR;
    public final gov g;
    public final bpn0 h;

    /* compiled from: ClipsEditorStickersSelectorView.kt */
    public final class a {
        public a() {
        }

        public final void a(nov novVar) {
            com.vk.clips.editor.state.model.b bVar = new com.vk.clips.editor.state.model.b(novVar);
            d0e d0eVar = d0e.this;
            d0eVar.e.invoke(bVar, Boolean.FALSE, NewStickersArranger.LEFT_TOP);
            Bundle bundle = new Bundle();
            bundle.putString("vertical_scroll_to_item_id", bVar.a);
            d0eVar.d.b(ClipsEditorScreen.State.VIDEO_CROPPER, new ClipsEditorScreen.a.C0579a(bundle));
        }
    }

    public d0e(ViewStub viewStub, nal0 nal0Var, rj01 rj01Var, uy50 uy50Var, u0e u0eVar, boolean z) {
        this.b = viewStub;
        this.c = nal0Var;
        this.d = uy50Var;
        this.e = u0eVar;
        bpn0 bpn0Var = new bpn0(new b3(this, 20));
        bpn0 bpn0Var2 = new bpn0(new f84(this));
        this.h = bpn0Var2;
        ((ViewGroup) bpn0Var.getValue()).setVisibility(0);
        dfi0 b = ((x4f) bpn0Var2.getValue()).b(((ViewGroup) bpn0Var.getValue()).getContext(), new a(), z);
        this.g = b;
        SelectionStickerView selectionStickerView = b.e;
        f4m.j(selectionStickerView);
        ((ViewGroup) bpn0Var.getValue()).addView(selectionStickerView);
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        return this.g.a0();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        x4f x4fVar = (x4f) this.h.getValue();
        nal0 nal0Var = this.c;
        EnumSet a2 = x4fVar.a(nal0Var.getWidth(), nal0Var.getHeight(), nal0Var.getStickers());
        gov govVar = this.g;
        govVar.a(a2);
        govVar.b();
        govVar.show();
        govVar.c();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        this.g.hide();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.f;
    }
}
