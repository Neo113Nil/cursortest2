package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoryEntry;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ysl0 implements izs {
    public final /* synthetic */ StoryEntry b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ctl0 d;

    public /* synthetic */ ysl0(StoryEntry storyEntry, int i, ctl0 ctl0Var) {
        this.b = storyEntry;
        this.c = i;
        this.d = ctl0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryEntry storyEntry = this.b;
        UserId userId = storyEntry.d;
        this.d.b.e(111, new tu1(storyEntry.P, storyEntry.O, this.c));
        return s3q0.a;
    }
}
