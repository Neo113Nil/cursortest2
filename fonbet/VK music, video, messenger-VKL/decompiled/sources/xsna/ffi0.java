package xsna;

import android.content.Context;
import android.view.View;
import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.Set;
import xsna.fov;

/* compiled from: SelectionStickerViewWrapper.kt */
/* loaded from: classes18.dex */
public final class ffi0 implements fov {
    public final SelectionStickerView a;

    public ffi0(Context context, boolean z, fov.a aVar) {
        this.a = new SelectionStickerView(context, SelectionStickerView.OpenFrom.STORY, z, aVar != null ? new vei0(aVar) : null, true, false);
    }

    @Override // xsna.fov
    public final void a(Set<? extends WebStickerType> set) {
        this.a.setPermittedClickableStickers(set);
    }

    @Override // xsna.fov
    public final boolean a0() {
        afi0 afi0Var = this.a.i0;
        if (afi0Var == null || afi0Var.w != SearchMode.GIF || !afi0Var.e()) {
            return false;
        }
        afi0Var.a();
        return true;
    }

    @Override // xsna.fov
    public final void b() {
        SelectionStickerView selectionStickerView = this.a;
        selectionStickerView.Q.e(selectionStickerView.S.getCurrentItem());
    }

    @Override // xsna.fov
    public final void c(boolean z) {
        this.a.setShowReactionOnboarding(z);
    }

    @Override // xsna.fov
    public final void d() {
        this.a.setTopPadding(0);
    }

    @Override // xsna.fov
    public final View getView() {
        return this.a;
    }

    @Override // xsna.fov
    public final void hide() {
        this.a.hide();
    }

    @Override // xsna.fov
    public final void setVisible(boolean z) {
        super.setVisible(true);
    }

    @Override // xsna.fov
    public final void show() {
        this.a.show();
    }
}
