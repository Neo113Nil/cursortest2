package xsna;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.story.viewer.api.StoryViewerRouter;
import java.util.Iterator;
import xsna.kex;

/* compiled from: UserProfileInterestingStoriesBlockViewHolder.kt */
/* loaded from: classes5.dex */
public final class iqq0 implements kex.a {
    public final /* synthetic */ jqq0 a;

    /* compiled from: UserProfileInterestingStoriesBlockViewHolder.kt */
    public static final class a implements StoryViewerRouter.a {
        public final /* synthetic */ kex b;

        public a(kex kexVar) {
            this.b = kexVar;
        }

        @Override // com.vk.story.viewer.api.StoryViewerRouter.a
        public final void j(String str) {
            kex kexVar = this.b;
            Iterator<dfx> it = kexVar.e.getCurrentList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (epx.f(it.next().a, str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            RecyclerView.o layoutManager = kexVar.f.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null) {
                linearLayoutManager.K(i, iah0.a(32));
            }
        }

        @Override // com.vk.story.viewer.api.StoryViewerRouter.a
        public final View k(String str) {
            RecyclerView.o layoutManager;
            kex kexVar = this.b;
            Iterator<dfx> it = kexVar.e.getCurrentList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (epx.f(it.next().a, str)) {
                    break;
                }
                i++;
            }
            if (i == -1 || (layoutManager = kexVar.f.getLayoutManager()) == null) {
                return null;
            }
            return layoutManager.findViewByPosition(i);
        }
    }

    public iqq0(jqq0 jqq0Var) {
        this.a = jqq0Var;
    }

    @Override // xsna.kex.a
    public final void a() {
        this.a.o.a(UserProfileAction.s.g.f.b);
    }

    @Override // xsna.kex.a
    public final void b(String str, kex kexVar) {
        this.a.o.a(new UserProfileAction.s.g.h(str, new a(kexVar)));
    }

    @Override // xsna.kex.a
    public final void c(String str) {
        this.a.o.a(new UserProfileAction.s.g.d(str));
    }
}
