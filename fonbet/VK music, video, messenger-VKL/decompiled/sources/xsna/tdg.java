package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.newsfeed.api.data.TypeReply;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: CommentViewHolderListener.kt */
/* loaded from: classes3.dex */
public interface tdg {
    void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z);

    boolean X3(VideoAttachment videoAttachment);

    default boolean a4(cbg cbgVar) {
        return true;
    }

    void ei(iag iagVar, TypeReply typeReply);

    void fd(StickerAttachment stickerAttachment, o4l0 o4l0Var);

    void gm(iag iagVar, aa aaVar);

    UserId p();

    default boolean t2() {
        return true;
    }

    void x(int i);

    default boolean z(rdg rdgVar) {
        return false;
    }

    default void nc() {
    }

    default CharSequence mb(int i, CharSequence charSequence) {
        return charSequence;
    }
}
