package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;

/* compiled from: DefaultMentionSpanProvider.kt */
/* loaded from: classes3.dex */
public final class pil extends wn4 {
    public final int a;

    public pil(Context context) {
        this.a = context.getColor(R.color.vk_blue_200_muted);
    }

    @Override // xsna.wn4
    public final i420 j(UserId userId) {
        return new ogq0(userId, this.a);
    }

    @Override // xsna.wn4
    public final Integer k() {
        return Integer.valueOf(this.a);
    }
}
