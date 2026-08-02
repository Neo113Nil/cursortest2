package xsna;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import com.vk.billing.InAppPurchaseManagerException;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollFilterParams;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.poll.fragments.PollUserListFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vkontakte.android.R;
import java.util.WeakHashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class itb0 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ View.OnCreateContextMenuListener d;

    public /* synthetic */ itb0(PollVotersFragment pollVotersFragment, boolean z) {
        this.d = pollVotersFragment;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                PollVotersFragment pollVotersFragment = (PollVotersFragment) onCreateContextMenuListener;
                int i2 = PollVotersFragment.a0;
                FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                fragmentContainerView.setId(View.generateViewId());
                int intValue = ((wak0) pollVotersFragment.S).getIntValue();
                long i3 = ((xak0) pollVotersFragment.T).i();
                UserId userId = (UserId) ((zak0) pollVotersFragment.U).getValue();
                PollUserListFragment.d dVar = new PollUserListFragment.d(PollUserListFragment.class, null, null);
                Bundle bundle = dVar.j;
                bundle.putInt("poll_id", intValue);
                bundle.putLong("answer_id", i3);
                bundle.putParcelable("owner_ud", userId);
                bundle.putBoolean("friends_only", z);
                bundle.putParcelable("filter", (PollFilterParams) ((zak0) pollVotersFragment.V).getValue());
                FragmentImpl f = dVar.f();
                FragmentManager childFragmentManager = pollVotersFragment.getChildFragmentManager();
                androidx.fragment.app.a b = tk5.b(childFragmentManager, childFragmentManager);
                b.g(fragmentContainerView.getId(), f, f.getClass().getSimpleName());
                b.k(false);
                return fragmentContainerView;
            default:
                ner0 ner0Var = (ner0) onCreateContextMenuListener;
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.w(l, L.LogType.e, th, new Object[]{"Billing : PurchasesManager", "Error during #consumePurchase"}, null, null, 24);
                }
                com.vk.metrics.eventtracking.b.a.a(new InAppPurchaseManagerException(th));
                if (z) {
                    cvk.u(R.string.error_purchasing, false);
                }
                z1u0.a(ner0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ itb0(boolean z, ner0 ner0Var) {
        this.c = z;
        this.d = ner0Var;
    }
}
