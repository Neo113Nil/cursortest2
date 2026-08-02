package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.api.data.TypeReply;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: CommentsInteractorViewHolderWrapper.kt */
/* loaded from: classes17.dex */
public final class yeg implements tdg {
    public final eeg b;
    public final m3a c;

    public yeg(eeg eegVar) {
        m3a m3aVar = new m3a(3);
        this.b = eegVar;
        this.c = m3aVar;
    }

    @Override // xsna.tdg
    public final void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
        this.b.b(iagVar, reactionMeta);
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
    public final void ei(iag iagVar, TypeReply typeReply) {
        this.b.i(iagVar);
    }

    @Override // xsna.tdg
    public final void fd(StickerAttachment stickerAttachment, o4l0 o4l0Var) {
        this.b.e(stickerAttachment, o4l0Var);
    }

    @Override // xsna.tdg
    public final void gm(iag iagVar, aa aaVar) {
        this.b.g(iagVar);
    }

    @Override // xsna.tdg
    public final UserId p() {
        return this.b.p();
    }

    @Override // xsna.tdg
    public final boolean t2() {
        return true;
    }

    @Override // xsna.tdg
    public final void x(int i) {
        this.b.x(i);
    }

    @Override // xsna.tdg
    public final boolean z(rdg rdgVar) {
        return false;
    }

    @Override // xsna.tdg
    public final void nc() {
    }

    @Override // xsna.tdg
    public final CharSequence mb(int i, CharSequence charSequence) {
        return charSequence;
    }
}
