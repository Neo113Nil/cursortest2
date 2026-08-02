package xsna;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.photo.editor.features.filter.d;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.voip.ui.calls.presentation.base.view.components.VoipBanner;
import xsna.gtb0;
import xsna.om70;
import xsna.y4m;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class og implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ og(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Runnable runnable;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                int i2 = AbstractPollView.S;
                if (abstractPollView.getPoll().Ib() && !abstractPollView.getPoll().x.isEmpty()) {
                    abstractPollView.B.setVisibility(0);
                    abstractPollView.x.setVisibility(4);
                    abstractPollView.j();
                    UserId userId = abstractPollView.getPoll().c;
                    int i3 = abstractPollView.getPoll().b;
                    boolean z = abstractPollView.getPoll().j;
                    String str = abstractPollView.e;
                    String str2 = abstractPollView.f;
                    AbstractPollView.c cVar = abstractPollView.b;
                    gtb0.a aVar = new gtb0.a(userId, i3, z, str, str2, cVar != null ? cVar.K2() : null);
                    gtb0 pollVoteController = abstractPollView.getPollVoteController();
                    if (pollVoteController != null) {
                        pollVoteController.a(aVar, j5g.O0(abstractPollView.getPoll().x), abstractPollView.F);
                        break;
                    }
                }
                break;
            case 1:
                y4m y4mVar = (y4m) ((y4m.a) obj).m;
                if (y4mVar != null && (runnable = y4mVar.k) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                com.vk.newsfeed.common.recycler.holders.b bVar = (com.vk.newsfeed.common.recycler.holders.b) obj;
                bVar.v6(bVar.u);
                bVar.q.invoke(LeadFormHolder.ButtonAction.SEND_DATA);
                break;
            case 3:
                int i4 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(PostingAction.MediaPicker.OpenCamera.b);
                    break;
                }
                break;
            case 4:
                ((pm70) obj).O(om70.b.b);
                break;
            case 5:
                int i5 = PollResultsFragment.b0;
                FragmentActivity activity = ((PollResultsFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    break;
                }
                break;
            case 6:
                rj20 rj20Var = (rj20) obj;
                if (rj20Var != null) {
                    rj20Var.D();
                    break;
                }
                break;
            case 7:
                ((awk0) obj).a.a(zwk0.b);
                break;
            case 8:
                rtm0 rtm0Var = (rtm0) obj;
                d.C1460d c1460d = rtm0Var.l;
                if (c1460d != null) {
                    c1460d.invoke(rtm0Var);
                    break;
                }
                break;
            case 9:
                ((g86) obj).invoke(view);
                break;
            case 10:
                ((qqt0) obj).invoke();
                break;
            default:
                int i6 = VoipBanner.d;
                ((gzs) obj).invoke();
                break;
        }
    }
}
