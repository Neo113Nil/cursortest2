package xsna;

import com.vk.story.viewer.impl.presentation.stories.StoryViewerKBHPolicy;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StoryViewerKBHListener.kt */
/* loaded from: classes6.dex */
public final class inm0 implements j6q0 {
    public final gzs<com.vk.story.viewer.impl.presentation.stories.b> b;
    public final gzs<s3q0> c;
    public final StoryViewerKBHPolicy d;

    /* compiled from: StoryViewerKBHListener.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoryViewerKBHPolicy.values().length];
            try {
                iArr[StoryViewerKBHPolicy.CLOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoryViewerKBHPolicy.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public inm0(gzs<? extends com.vk.story.viewer.impl.presentation.stories.b> gzsVar, gzs<s3q0> gzsVar2, StoryViewerKBHPolicy storyViewerKBHPolicy) {
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = storyViewerKBHPolicy;
    }

    @Override // xsna.j6q0
    public final void c() {
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        if (i == 1) {
            this.c.invoke();
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        com.vk.story.viewer.impl.presentation.stories.b invoke = this.b.invoke();
        invoke.P();
        qo6 currentStoryView = invoke.getCurrentStoryView();
        mkm0 mkm0Var = currentStoryView instanceof mkm0 ? (mkm0) currentStoryView : null;
        if (mkm0Var != null) {
            mkm0Var.setActionInProgress(true);
        }
    }

    @Override // xsna.j6q0
    public final void e() {
        qo6 currentStoryView = this.b.invoke().getCurrentStoryView();
        mkm0 mkm0Var = currentStoryView instanceof mkm0 ? (mkm0) currentStoryView : null;
        if (mkm0Var == null || mkm0Var.w || !mkm0Var.u) {
            return;
        }
        mkm0Var.setActionInProgress(false);
        mkm0Var.play();
    }

    @Override // xsna.j6q0
    public final void a(boolean z) {
    }

    @Override // xsna.j6q0
    public final void b(boolean z) {
    }
}
