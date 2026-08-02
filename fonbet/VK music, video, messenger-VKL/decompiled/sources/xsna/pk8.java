package xsna;

import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.superapp.core.perf.BrowserPerfState;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pk8 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pk8(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                BrowserPerfState browserPerfState = (BrowserPerfState) this.c;
                v73 v73Var = (v73) this.d;
                zdx0 zdx0Var = e370.v;
                if (zdx0Var != null) {
                    zdx0Var.a(browserPerfState, v73Var);
                    break;
                }
                break;
            case 1:
                kr60 kr60Var = (kr60) this.c;
                Post post = (Post) this.d;
                kr60Var.c(new yo60.d.a(post.m));
                kr60Var.c(new yo60.h(new NewsfeedExternalAction.c.b0(post)));
                break;
            default:
                ((ParticipantStatesManager) this.c).removeHandListener((zk90) this.d);
                break;
        }
    }
}
