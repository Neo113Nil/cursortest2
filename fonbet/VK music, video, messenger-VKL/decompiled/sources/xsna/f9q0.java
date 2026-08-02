package xsna;

import com.vk.dto.stickers.StickerItem;
import com.vk.im.engine.models.attaches.AttachSticker;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;

/* compiled from: UpdateStickerCmd.kt */
/* loaded from: classes2.dex */
public final class f9q0 extends le6<s3q0> {
    public final Msg b;
    public final StickerItem c;
    public final Object d;

    public f9q0(Msg msg, StickerItem stickerItem, Object obj) {
        this.b = msg;
        this.c = stickerItem;
        this.d = obj;
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        Msg msg = this.b;
        if ((msg instanceof MsgFromUser) && (j5g.a0(((MsgFromUser) msg).H) instanceof AttachSticker)) {
            w2wVar.I0().u(new dvh0(6, w2wVar.I0().o(), this));
            w2wVar.e1(this, new p980(this.d, msg.c, msg.b));
        }
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f9q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f9q0 f9q0Var = (f9q0) obj;
        if (epx.f(this.b, f9q0Var.b)) {
            return epx.f(this.c, f9q0Var.c);
        }
        return false;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "UpdateStickerCmd(msg=" + this.b + ", sticker=" + this.c + ')';
    }
}
