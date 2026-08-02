package com.yandex.messaging.internal.view.chat.input;

import android.widget.TextView;
import com.yandex.messaging.base.view.EmojiDrawable;
import com.yandex.messaging.domain.statuses.StatusIconType;
import com.yandex.messaging.internal.avatar.AvatarImageView;
import defpackage.bob1;
import defpackage.du21;
import defpackage.e8m;
import defpackage.gu21;
import defpackage.r0k;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class MentionSuggestViewHolder$onBrickAttach$1 extends AdaptedFunctionReference implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str;
        r0k r0kVar = (r0k) obj;
        b bVar = (b) this.receiver;
        AvatarImageView avatarImageView = bVar.W;
        TextView textView = bVar.Z;
        avatarImageView.updateDisplayUserStatus(r0kVar);
        gu21 gu21Var = r0kVar.a;
        EmojiDrawable emojiDrawable = null;
        du21 du21Var = gu21Var instanceof du21 ? (du21) gu21Var : null;
        StatusIconType statusIconType = du21Var != null ? du21Var.f : null;
        if (statusIconType != null) {
            bob1.c(textView, statusIconType.getIconRes(), statusIconType.getColor(), 16);
        } else {
            if (du21Var != null && (str = du21Var.d) != null) {
                emojiDrawable = new EmojiDrawable(str, textView.getTextSize() - e8m.a(2));
            }
            bob1.d(textView, emojiDrawable, false);
        }
        return zy11.a;
    }
}
