package xsna;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.stories.model.clickable.ClickablePoll;

/* compiled from: StoryViewPollDelegate.kt */
/* loaded from: classes6.dex */
public final class jmm0 {
    public final View a;
    public String b;
    public String c;
    public final Context d;
    public t9 e;
    public t40 f;
    public ClickablePoll g;
    public final xla h = new xla(this);
    public final imm0 i = new imm0(this);

    public jmm0(FrameLayout frameLayout, String str, String str2) {
        this.a = frameLayout;
        this.b = str;
        this.c = str2;
        this.d = frameLayout.getContext();
    }
}
