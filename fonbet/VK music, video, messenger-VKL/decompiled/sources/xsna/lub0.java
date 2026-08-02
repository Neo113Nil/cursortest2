package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.BaseFragment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollFilterParams;
import com.vk.poll.fragments.PollEditorFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.poll.fragments.PollVotersFragment;

/* compiled from: PollsVkBridge.kt */
/* loaded from: classes.dex */
public interface lub0 {
    default boolean b() {
        return false;
    }

    default boolean f() {
        return false;
    }

    default PollVotersFragment.a i(int i, long j, UserId userId, String str) {
        return new PollVotersFragment.a(i, j, userId, str);
    }

    default void g() {
    }

    default void b0(Poll poll) {
    }

    default void d(PollEditorFragment.a aVar) {
    }

    default void h(BaseFragment baseFragment) {
    }

    default void j(int i) {
    }

    default void a(PollResultsFragment pollResultsFragment, kn20 kn20Var) {
    }

    default void k(Context context, Poll poll) {
    }

    default void l(Context context, UserId userId) {
    }

    default void c(String str, UserId userId, xc50 xc50Var) {
    }

    default void e(bqz0 bqz0Var, FragmentActivity fragmentActivity, PollFilterParams pollFilterParams, FragmentManager fragmentManager) {
    }
}
