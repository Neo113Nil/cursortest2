package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: PostingMentionSpanProvider.kt */
/* loaded from: classes4.dex */
public final class ehc0 extends wn4 {
    public final int a = dhr0.t.c(R.attr.vk_ui_text_link);

    @Override // xsna.wn4
    public final i420 j(UserId userId) {
        return new ogq0(userId, this.a);
    }

    @Override // xsna.wn4
    public final Integer k() {
        return Integer.valueOf(this.a);
    }
}
