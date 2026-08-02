package xsna;

import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.PollOption;
import com.vk.poll.views.PollSettingView;
import com.vk.stories.design.view.polls.AbstractPollView;
import java.util.Collections;
import xsna.gtb0;
import xsna.jeo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class wg implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractPollView.c cVar;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AbstractPollView abstractPollView = (AbstractPollView) obj;
                int i2 = AbstractPollView.S;
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) view;
                if (!abstractPollView.getPoll().Bb()) {
                    if (!abstractPollView.getPoll().Bb() && abstractPollView.c && (cVar = abstractPollView.b) != null) {
                        cVar.J4(abstractPollView.getPoll());
                        break;
                    }
                } else {
                    int k = abstractPollView.k(aVar);
                    if (k != -1) {
                        if (!abstractPollView.getPoll().Ib()) {
                            aVar.f.setVisibility(aVar.getVisibility());
                            aVar.d.setVisibility(4);
                            aVar.e.setVisibility(4);
                            abstractPollView.j();
                            PollOption pollOption = abstractPollView.getPoll().f.get(k);
                            UserId userId = abstractPollView.getPoll().c;
                            int i3 = abstractPollView.getPoll().b;
                            boolean z = abstractPollView.getPoll().j;
                            String str = abstractPollView.e;
                            String str2 = abstractPollView.f;
                            AbstractPollView.c cVar2 = abstractPollView.b;
                            gtb0.a aVar2 = new gtb0.a(userId, i3, z, str, str2, cVar2 != null ? cVar2.K2() : null);
                            gtb0 pollVoteController = abstractPollView.getPollVoteController();
                            if (pollVoteController != null) {
                                pollVoteController.a(aVar2, Collections.singletonList(Long.valueOf(pollOption.b)), abstractPollView.F);
                                break;
                            }
                        } else {
                            aVar.e.toggle();
                            break;
                        }
                    }
                }
                break;
            case 1:
                izs<? super View, s3q0> izsVar = ((pr50) obj).d0.k;
                if (izsVar != null) {
                    izsVar.invoke(view);
                    break;
                }
                break;
            case 2:
                r5a0 r5a0Var = (r5a0) obj;
                x64 x64Var = r5a0Var.l;
                if (x64Var != null) {
                    x64Var.c(r5a0Var.d);
                    break;
                }
                break;
            case 3:
                ((PollSettingView) obj).b.setChecked(!r10.isChecked());
                break;
            case 4:
                ((qfk0) obj).b.refresh();
                break;
            default:
                ((ffo0) obj).b.invoke(jeo0.c.a);
                break;
        }
    }
}
