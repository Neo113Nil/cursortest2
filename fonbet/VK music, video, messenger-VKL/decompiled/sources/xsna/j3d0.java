package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.attachments.PrettyCardAttachment;
import java.util.List;

/* compiled from: PrettyCardsPrefetchHelper.kt */
/* loaded from: classes4.dex */
public final class j3d0 extends de {
    @Override // xsna.de
    public final int b0(u1c0 u1c0Var) {
        r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        PrettyCardAttachment prettyCardAttachment = attachment instanceof PrettyCardAttachment ? (PrettyCardAttachment) attachment : null;
        List<PrettyCardAttachment.Card> list = prettyCardAttachment != null ? prettyCardAttachment.f : null;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // xsna.de
    public final String d0(u1c0 u1c0Var, int i) {
        PrettyCardAttachment.Card card;
        Image image;
        ImageSize Cb;
        r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        PrettyCardAttachment prettyCardAttachment = attachment instanceof PrettyCardAttachment ? (PrettyCardAttachment) attachment : null;
        List<PrettyCardAttachment.Card> list = prettyCardAttachment != null ? prettyCardAttachment.f : null;
        if (list == null || (card = (PrettyCardAttachment.Card) j5g.b0(i, list)) == null || (image = card.h) == null || (Cb = image.Cb(iah0.a(224.0f), true, false)) == null) {
            return null;
        }
        return Cb.d.d;
    }
}
