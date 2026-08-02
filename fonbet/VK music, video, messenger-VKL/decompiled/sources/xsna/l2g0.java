package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.api.data.TypeReply;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: RepliesStickerAttachmentsClickListener.kt */
/* loaded from: classes18.dex */
public final class l2g0 implements tdg {
    public final izs<Integer, s3q0> b;
    public final wzs<StickerAttachment, xwb0, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public l2g0(izs<? super Integer, s3q0> izsVar, wzs<? super StickerAttachment, ? super xwb0, s3q0> wzsVar) {
        this.b = izsVar;
        this.c = wzsVar;
    }

    @Override // xsna.tdg
    public final boolean X3(VideoAttachment videoAttachment) {
        return false;
    }

    @Override // xsna.tdg
    public final boolean a4(cbg cbgVar) {
        return true;
    }

    @Override // xsna.tdg
    public final void fd(StickerAttachment stickerAttachment, o4l0 o4l0Var) {
        this.c.invoke(stickerAttachment, o4l0Var);
    }

    @Override // xsna.tdg
    public final UserId p() {
        return UserId.d;
    }

    @Override // xsna.tdg
    public final boolean t2() {
        return true;
    }

    @Override // xsna.tdg
    public final void x(int i) {
        this.b.invoke(Integer.valueOf(i));
    }

    @Override // xsna.tdg
    public final boolean z(rdg rdgVar) {
        return false;
    }

    @Override // xsna.tdg
    public final void nc() {
    }

    @Override // xsna.tdg
    public final void ei(iag iagVar, TypeReply typeReply) {
    }

    @Override // xsna.tdg
    public final void gm(iag iagVar, aa aaVar) {
    }

    @Override // xsna.tdg
    public final CharSequence mb(int i, CharSequence charSequence) {
        return charSequence;
    }

    @Override // xsna.tdg
    public final void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
    }
}
