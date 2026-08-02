package xsna;

import androidx.annotation.NonNull;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.log.L;

/* compiled from: PlaybackStoryViewDelegate.java */
/* loaded from: classes6.dex */
public final class eza0 {

    @NonNull
    public q7r a;

    public final void a() {
        if (this.a.i0.T0()) {
            return;
        }
        tcm0 tcm0Var = this.a.W;
        if (tcm0Var != null) {
            tcm0Var.dismiss();
        }
        gta gtaVar = this.a.p0;
        if (gtaVar != null) {
            gtaVar.b = null;
            gtaVar.c = null;
            gtaVar.d().n(null);
            gtaVar.d().e();
            gtaVar.b();
            this.a.p0 = null;
        }
        int i = ify.a;
        ify.g(this.a.j0);
        this.a.j0.j1();
        xaj0 xaj0Var = this.a.v;
        if (xaj0Var != null) {
            xaj0Var.e(false);
            xaj0 xaj0Var2 = this.a.v;
            xaj0Var2.getClass();
            L.e("VideoPlayer", "releasePlayer");
            xaj0Var2.a.e();
        }
    }

    public final void b() {
        StoryEntry currentStory = this.a.i0.getCurrentStory();
        if (currentStory == null || !currentStory.i0 || this.a.e()) {
            this.a.j0.n1();
            xaj0 xaj0Var = this.a.v;
            if (xaj0Var != null) {
                xaj0Var.e(false);
            }
        }
    }

    public final void c() {
        this.a.j0.o1();
    }
}
