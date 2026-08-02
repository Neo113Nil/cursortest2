package xsna;

import android.view.KeyEvent;
import android.widget.EditText;
import com.vk.dto.stickers.StickerItem;
import com.vk.stickers.keyboard.StickersView;
import com.vkontakte.android.attachments.StickerAttachment;

/* compiled from: RepliesController.kt */
/* loaded from: classes18.dex */
public final class f2g0 extends StickersView.c {
    public final /* synthetic */ izs<StickerAttachment, s3q0> c;
    public final /* synthetic */ e2g0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public f2g0(izs<? super StickerAttachment, s3q0> izsVar, e2g0 e2g0Var) {
        this.c = izsVar;
        this.d = e2g0Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        EditText input = this.d.a.getInput();
        int selectionEnd = input.getSelectionEnd();
        input.getText().insert(selectionEnd, str);
        int length = str.length() + selectionEnd;
        if (input.length() >= length) {
            input.setSelection(length, length);
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        return his0.s(this.d.a.getInput());
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void j() {
        this.d.a.getInput().dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        e2g0 e2g0Var = this.d;
        xgy xgyVar = e2g0Var.e;
        if (xgyVar != null) {
            int i2 = xgy.F;
            xgyVar.h(null);
        }
        StickersView stickersView = e2g0Var.d;
        if (stickersView != null) {
            stickersView.g(i);
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        this.c.invoke(new StickerAttachment(stickerItem, i, str));
        this.d.a.t();
    }
}
