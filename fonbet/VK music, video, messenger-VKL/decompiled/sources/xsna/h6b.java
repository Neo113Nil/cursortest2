package xsna;

import android.text.Editable;
import android.view.KeyEvent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.ui.views.RichEditText;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import xsna.zbb;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final class h6b extends StickersView.c {
    public final /* synthetic */ com.vk.channels.impl.channel_screen.send_msg.a c;

    public h6b(com.vk.channels.impl.channel_screen.send_msg.a aVar) {
        this.c = aVar;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        com.vk.channels.impl.channel_screen.send_msg.a aVar = this.c;
        RichEditText richEditText = aVar.B;
        if (richEditText == null) {
            richEditText = null;
        }
        int selectionEnd = richEditText.getSelectionEnd();
        if (selectionEnd == -1) {
            RichEditText richEditText2 = aVar.B;
            if (richEditText2 == null) {
                richEditText2 = null;
            }
            selectionEnd = richEditText2.length();
        }
        RichEditText richEditText3 = aVar.B;
        if (richEditText3 == null) {
            richEditText3 = null;
        }
        Editable text = richEditText3.getText();
        if (text != null) {
            text.insert(selectionEnd, str);
        }
        int length = str.length() + selectionEnd;
        RichEditText richEditText4 = aVar.B;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        if (richEditText4.length() >= length) {
            RichEditText richEditText5 = aVar.B;
            if (richEditText5 == null) {
                richEditText5 = null;
            }
            richEditText5.setSelection(length, length);
        }
        StickersView stickersView = aVar.C;
        (stickersView != null ? stickersView : null).getClass();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final Long c() {
        return Long.valueOf(this.c.g);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final ContextUser e() {
        return this.c.w;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final List<UserId> h() {
        return new ArrayList(this.c.t);
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
        xgy xgyVar = this.c.F;
        if (xgyVar != null) {
            xgyVar.d();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void m() {
        xgy xgyVar = this.c.F;
        if (xgyVar != null) {
            xgyVar.d();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        this.c.x(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        AttachSticker attachSticker = new AttachSticker(stickerItem.b, i, stickerItem, str);
        com.vk.channels.impl.channel_screen.send_msg.a aVar = this.c;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        zbb.b bVar = aVar.E;
        oz30.c(bVar == null ? null : bVar, 0, null, null, null, Collections.singletonList(attachSticker), valueOf, null, null, aVar.E(), 207);
        WriteBar writeBar2 = aVar.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.L();
        WriteBar writeBar3 = aVar.x;
        (writeBar3 != null ? writeBar3 : null).t();
        com.vk.channels.impl.channel_screen.send_msg.a.G(aVar.F);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void q(UGCStickerModel uGCStickerModel) {
        AttachUgcSticker attachUgcSticker = new AttachUgcSticker(uGCStickerModel.c, uGCStickerModel);
        com.vk.channels.impl.channel_screen.send_msg.a aVar = this.c;
        WriteBar writeBar = aVar.x;
        if (writeBar == null) {
            writeBar = null;
        }
        MsgFromUser replyMessage = writeBar.getReplyMessage();
        Integer valueOf = replyMessage != null ? Integer.valueOf(replyMessage.d) : null;
        zbb.b bVar = aVar.E;
        oz30.c(bVar == null ? null : bVar, 0, null, null, null, Collections.singletonList(attachUgcSticker), valueOf, null, null, aVar.E(), 207);
        WriteBar writeBar2 = aVar.x;
        if (writeBar2 == null) {
            writeBar2 = null;
        }
        writeBar2.L();
        WriteBar writeBar3 = aVar.x;
        (writeBar3 != null ? writeBar3 : null).t();
        com.vk.channels.impl.channel_screen.send_msg.a.G(aVar.F);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void r() {
    }
}
