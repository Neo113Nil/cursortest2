package xsna;

import com.vk.stories.design.view.stickers.selection.SelectionStickerView;
import xsna.ify;

/* compiled from: SelectionStickerView.java */
/* loaded from: classes6.dex */
public final class bfi0 implements ify.a {
    public final /* synthetic */ SelectionStickerView b;

    public bfi0(SelectionStickerView selectionStickerView) {
        this.b = selectionStickerView;
    }

    @Override // xsna.ify.a
    public final void Y0() {
        SelectionStickerView selectionStickerView = this.b;
        if (selectionStickerView.i0 != null) {
            selectionStickerView.l0.onNext(Boolean.FALSE);
        }
    }

    @Override // xsna.ify.a
    public final void x0(int i) {
        SelectionStickerView selectionStickerView = this.b;
        if (selectionStickerView.i0 != null) {
            selectionStickerView.l0.onNext(Boolean.TRUE);
        }
    }
}
