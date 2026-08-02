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
public final class nub0 {
    public static bpn0 a;
    public static final a b = new a();

    public static final lub0 a() {
        bpn0 bpn0Var = a;
        return bpn0Var != null ? (lub0) bpn0Var.getValue() : b;
    }

    /* compiled from: PollsVkBridge.kt */
    public static final class a implements lub0 {
        @Override // xsna.lub0
        public final boolean b() {
            return false;
        }

        @Override // xsna.lub0
        public final boolean f() {
            return false;
        }

        @Override // xsna.lub0
        public final PollVotersFragment.a i(int i, long j, UserId userId, String str) {
            return new PollVotersFragment.a(i, j, userId, str);
        }

        @Override // xsna.lub0
        public final void g() {
        }

        @Override // xsna.lub0
        public final void b0(Poll poll) {
        }

        @Override // xsna.lub0
        public final void d(PollEditorFragment.a aVar) {
        }

        @Override // xsna.lub0
        public final void h(BaseFragment baseFragment) {
        }

        @Override // xsna.lub0
        public final void j(int i) {
        }

        @Override // xsna.lub0
        public final void a(PollResultsFragment pollResultsFragment, kn20 kn20Var) {
        }

        @Override // xsna.lub0
        public final void k(Context context, Poll poll) {
        }

        @Override // xsna.lub0
        public final void l(Context context, UserId userId) {
        }

        @Override // xsna.lub0
        public final void c(String str, UserId userId, xc50 xc50Var) {
        }

        @Override // xsna.lub0
        public final void e(bqz0 bqz0Var, FragmentActivity fragmentActivity, PollFilterParams pollFilterParams, FragmentManager fragmentManager) {
        }
    }
}
