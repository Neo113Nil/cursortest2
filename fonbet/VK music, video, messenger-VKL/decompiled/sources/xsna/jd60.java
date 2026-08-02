package xsna;

import android.content.Intent;
import com.vk.dto.common.id.UserId;

/* compiled from: NewsfeedBroadcastSenderImpl.kt */
/* loaded from: classes4.dex */
public final class jd60 implements id60 {
    @Override // xsna.id60
    public final void a(UserId userId, boolean z) {
        Intent intent = new Intent("com.vkontakte.android.RELOAD_PROFILE");
        intent.putExtra("id", userId);
        intent.putExtra("post_pinned", z);
        hf8.a(intent);
    }
}
