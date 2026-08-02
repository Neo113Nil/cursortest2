package xsna;

import androidx.compose.ui.platform.ComposeView;

/* compiled from: StoryStatHolder.kt */
/* loaded from: classes6.dex */
public final class ydm0 extends hf6<zdm0> {
    public final ComposeView m;

    public ydm0(ComposeView composeView) {
        super(composeView);
        this.m = composeView;
    }

    @Override // xsna.hf6
    public final void W5(zdm0 zdm0Var) {
        zdm0 zdm0Var2 = zdm0Var;
        String concat = "story_stat_container_".concat(zdm0Var2.a);
        ComposeView composeView = this.m;
        composeView.setTag(concat);
        composeView.setContent(new jai(-1746987529, new no3(zdm0Var2, 10), true));
    }
}
