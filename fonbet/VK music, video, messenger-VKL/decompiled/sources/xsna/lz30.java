package xsna;

import android.text.Editable;
import android.view.KeyEvent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.log.L;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: MsgSendVc.kt */
/* loaded from: classes7.dex */
public final class lz30 extends StickersView.c {
    public final /* synthetic */ kz30 c;

    public lz30(kz30 kz30Var) {
        this.c = kz30Var;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        kz30 kz30Var = this.c;
        RichEditText richEditText = kz30Var.B;
        if (richEditText == null) {
            richEditText = null;
        }
        int selectionEnd = richEditText.getSelectionEnd();
        if (selectionEnd == -1) {
            RichEditText richEditText2 = kz30Var.B;
            if (richEditText2 == null) {
                richEditText2 = null;
            }
            selectionEnd = richEditText2.length();
        }
        RichEditText richEditText3 = kz30Var.B;
        if (richEditText3 == null) {
            richEditText3 = null;
        }
        Editable text = richEditText3.getText();
        if (text != null) {
            text.insert(selectionEnd, str);
        }
        int length = str.length() + selectionEnd;
        RichEditText richEditText4 = kz30Var.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        if (richEditText4.length() >= length) {
            RichEditText richEditText5 = kz30Var.B;
            if (richEditText5 == null) {
                richEditText5 = null;
            }
            richEditText5.setSelection(length, length);
        }
        StickersView stickersView = kz30Var.C;
        (stickersView != null ? stickersView : null).getClass();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final Long c() {
        return Long.valueOf(this.c.e);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final ContextUser e() {
        return this.c.s;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean f() {
        ChatSettings Hb;
        Dialog Cb = this.c.k.Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null) {
            return false;
        }
        return epx.f(Hb.d, com.vk.dto.common.a.a(o25.a().c()));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final List<UserId> h() {
        return new ArrayList(this.c.l);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        RichEditText richEditText = this.c.B;
        if (richEditText == null) {
            richEditText = null;
        }
        return his0.s(richEditText);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void j() {
        RichEditText richEditText = this.c.B;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void k() {
        xgy xgyVar = this.c.L;
        if (xgyVar != null) {
            xgyVar.d();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void m() {
        xgy xgyVar = this.c.L;
        if (xgyVar != null) {
            xgyVar.d();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        this.c.x(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, String str, ContextUser contextUser) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new cqt(i), null, null, 3);
        kz30 kz30Var = this.c;
        kz30Var.o.b(hg1.m(y0, kz30Var.i, 0L, false, 62).subscribe(new amt(new d410(kz30Var, 8), 11), new t520(new bw6(L.a, 7), 5)));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        AttachSticker attachSticker = new AttachSticker(stickerItem.b, i, stickerItem, str);
        kz30 kz30Var = this.c;
        WriteBar writeBar = kz30Var.t;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        ChatFragment.k kVar = kz30Var.K;
        oz30.c(kVar == null ? null : kVar, 0, null, null, null, Collections.singletonList(attachSticker), valueOf, null, null, null, 463);
        WriteBar writeBar2 = kz30Var.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.E.a().i();
        WriteBar writeBar3 = kz30Var.t;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        writeBar3.L();
        WriteBar writeBar4 = kz30Var.t;
        (writeBar4 != null ? writeBar4 : null).t();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void q(UGCStickerModel uGCStickerModel) {
        AttachUgcSticker attachUgcSticker = new AttachUgcSticker(uGCStickerModel.c, uGCStickerModel);
        kz30 kz30Var = this.c;
        WriteBar writeBar = kz30Var.t;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        ChatFragment.k kVar = kz30Var.K;
        oz30.c(kVar == null ? null : kVar, 0, null, null, null, Collections.singletonList(attachUgcSticker), valueOf, null, null, null, 463);
        WriteBar writeBar2 = kz30Var.t;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.E.a().i();
        WriteBar writeBar3 = kz30Var.t;
        if (writeBar3 == null) {
            writeBar3 = null;
        }
        writeBar3.L();
        WriteBar writeBar4 = kz30Var.t;
        (writeBar4 != null ? writeBar4 : null).t();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void r() {
        kz30 kz30Var = this.c;
        kz30Var.c.b().o(kz30Var.d.B(), kz30Var.k, kz30Var.b.q());
    }
}
