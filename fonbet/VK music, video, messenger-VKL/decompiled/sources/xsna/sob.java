package xsna;

import android.content.Context;
import android.text.Editable;
import android.view.KeyEvent;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.attaches.AttachUgcSticker;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.views.RichEditText;
import com.vk.log.L;
import com.vk.stickers.ContextUser;
import com.vk.stickers.keyboard.StickersView;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ChatClipsMsgSendVc.kt */
/* loaded from: classes2.dex */
public final class sob extends StickersView.c {
    public final /* synthetic */ oob c;

    public sob(oob oobVar) {
        this.c = oobVar;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
    public final void b(String str) {
        oob oobVar = this.c;
        RichEditText richEditText = oobVar.v;
        if (richEditText == null) {
            richEditText = null;
        }
        int selectionEnd = richEditText.getSelectionEnd();
        if (selectionEnd == -1) {
            RichEditText richEditText2 = oobVar.v;
            if (richEditText2 == null) {
                richEditText2 = null;
            }
            selectionEnd = richEditText2.length();
        }
        RichEditText richEditText3 = oobVar.v;
        if (richEditText3 == null) {
            richEditText3 = null;
        }
        Editable text = richEditText3.getText();
        if (text != null) {
            text.insert(selectionEnd, str);
        }
        int length = str.length() + selectionEnd;
        RichEditText richEditText4 = oobVar.v;
        if (richEditText4 == null) {
            richEditText4 = null;
        }
        if (richEditText4.length() >= length) {
            RichEditText richEditText5 = oobVar.v;
            if (richEditText5 == null) {
                richEditText5 = null;
            }
            richEditText5.setSelection(length, length);
        }
        StickersView stickersView = oobVar.w;
        (stickersView != null ? stickersView : null).getClass();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final Long c() {
        return Long.valueOf(this.c.f);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final ContextUser e() {
        return this.c.p;
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean f() {
        ChatSettings Hb;
        Dialog Cb = this.c.l.Cb();
        if (Cb == null || (Hb = Cb.Hb()) == null) {
            return false;
        }
        return epx.f(Hb.d, com.vk.dto.common.a.a(o25.a().c()));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final List<UserId> h() {
        return new ArrayList(this.c.m);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final boolean i() {
        RichEditText richEditText = this.c.v;
        if (richEditText == null) {
            richEditText = null;
        }
        return his0.s(richEditText);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void j() {
        RichEditText richEditText = this.c.v;
        if (richEditText == null) {
            richEditText = null;
        }
        richEditText.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void k() {
        com.vk.movika.sdk.base.ui.f fVar = this.c.G;
        if (fVar != null) {
            fVar.invoke();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void l() {
        com.vk.movika.sdk.base.ui.f fVar = this.c.G;
        if (fVar != null) {
            fVar.invoke();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void m() {
        com.vk.movika.sdk.base.ui.f fVar = this.c.G;
        if (fVar != null) {
            fVar.invoke();
        }
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void n(int i) {
        this.c.x(i);
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void o(int i, String str, ContextUser contextUser) {
        io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new cqt(i), null, null, 3);
        oob oobVar = this.c;
        oobVar.o.b(hg1.m(y0, oobVar.k, 0L, false, 62).subscribe(new defpackage.p(new ec(oobVar, 21), 10), new bf2(new uw4(L.a, 3), 7)));
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void p(StickerItem stickerItem, int i, String str) {
        AttachSticker attachSticker = new AttachSticker(stickerItem.b, i, stickerItem, str);
        oob oobVar = this.c;
        tob tobVar = oobVar.z;
        oz30.c(tobVar == null ? null : tobVar, 0, null, null, null, Collections.singletonList(attachSticker), null, null, null, null, 495);
        WriteBar writeBar = oobVar.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setStickersSuggestEnabled(false);
        WriteBar writeBar2 = oobVar.q;
        (writeBar2 != null ? writeBar2 : null).t();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void q(UGCStickerModel uGCStickerModel) {
        AttachUgcSticker attachUgcSticker = new AttachUgcSticker(uGCStickerModel.c, uGCStickerModel);
        oob oobVar = this.c;
        tob tobVar = oobVar.z;
        oz30.c(tobVar == null ? null : tobVar, 0, null, null, null, Collections.singletonList(attachUgcSticker), null, null, null, null, 495);
        WriteBar writeBar = oobVar.q;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.setStickersSuggestEnabled(false);
        WriteBar writeBar2 = oobVar.q;
        (writeBar2 != null ? writeBar2 : null).t();
    }

    @Override // com.vk.stickers.keyboard.StickersView.c
    public final void r() {
        oob oobVar = this.c;
        o0w b = oobVar.c.b();
        Context context = oobVar.d.a;
        DialogExt dialogExt = oobVar.l;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        b.o(context, dialogExt, Peer.Unknown.e);
    }
}
