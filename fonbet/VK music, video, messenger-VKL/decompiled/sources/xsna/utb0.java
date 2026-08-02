package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollInfo;
import com.vk.poll.fragments.PollResultsFragment;

/* compiled from: PollsBridgeImpl.kt */
/* loaded from: classes4.dex */
public final class utb0 implements ttb0 {
    public static final utb0 a = new utb0();

    @Override // xsna.ttb0
    public final void a(Context context, UserId userId, int i, boolean z) {
        new PollResultsFragment.a(new PollInfo(i, userId, z), true).k(context);
    }
}
