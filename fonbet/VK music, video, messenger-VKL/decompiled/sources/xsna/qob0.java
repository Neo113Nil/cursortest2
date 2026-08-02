package xsna;

import com.vk.newsfeed.posting.poll_editor.domain.model.PollEditorScreen;
import kotlin.NoWhenBranchMatchedException;
import xsna.hob0;
import xsna.pnb0;
import xsna.qpb0;
import xsna.yob0;

/* compiled from: PollEditorNavigationFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class qob0 {
    public final hob0.a a;
    public final hob0 b;

    public qob0(hob0.a aVar, hob0 hob0Var) {
        this.a = aVar;
        this.b = hob0Var;
    }

    public final void a(pnb0.c.g gVar) {
        PollEditorScreen pollEditorScreen = gVar.b;
        boolean z = pollEditorScreen instanceof PollEditorScreen.PollDatePicker;
        hob0.a aVar = this.a;
        if (z) {
            aVar.c(new qpb0.a.g(((PollEditorScreen.PollDatePicker) pollEditorScreen).b));
            return;
        }
        if (pollEditorScreen instanceof PollEditorScreen.PollTimePicker) {
            aVar.c(new qpb0.a.h(((PollEditorScreen.PollTimePicker) pollEditorScreen).b));
        } else if (pollEditorScreen instanceof PollEditorScreen.ExitPollEditorAlert) {
            aVar.a(new yob0.b.d(new PollEditorScreen.ExitPollEditorAlert(((PollEditorScreen.ExitPollEditorAlert) pollEditorScreen).b)));
        } else {
            if (!(pollEditorScreen instanceof PollEditorScreen.RemovePollAlert)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a(new yob0.b.d(PollEditorScreen.RemovePollAlert.b));
        }
    }
}
