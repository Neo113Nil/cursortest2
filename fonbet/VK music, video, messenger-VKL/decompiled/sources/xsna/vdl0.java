package xsna;

import android.view.KeyEvent;
import android.widget.EditText;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.keyboard.StickersView;
import com.vkontakte.android.attachments.StickerAttachment;

/* compiled from: StickersViewListener.kt */
/* loaded from: classes17.dex */
public final class vdl0 extends StickersView.c {
    public final EditText c;
    public final b3 d;
    public final sbg e;
    public final g84 f;

    public vdl0(EditText editText, b3 b3Var, sbg sbgVar, g84 g84Var) {
        this.c = editText;
        this.d = b3Var;
        this.e = sbgVar;
        this.f = g84Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        EditText editText = this.c;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        editText.getText().insert(selectionEnd, str);
        int length = str.length() + selectionEnd;
        if (editText.length() >= length) {
            editText.setSelection(length, length);
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        return his0.s(this.c);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void j() {
        EditText editText = this.c;
        if (editText == null) {
            return;
        }
        editText.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        xgy xgyVar = ((leg) this.d.c).o;
        int i2 = xgy.F;
        xgyVar.h(null);
        ((leg) this.e.c).n.g(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        StickerAttachment stickerAttachment = new StickerAttachment(stickerItem, i, str);
        StickerAttachment.a aVar = StickerAttachment.k;
        int i2 = stickerItem.b;
        aVar.getClass();
        StickerAttachment.m = i2;
        this.f.invoke(stickerAttachment);
    }
}
