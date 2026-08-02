package xsna;

import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollOption;
import com.vk.stories.design.view.polls.a;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class p79 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p79(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.b) {
            case 0:
                ((r79) this.c).q(new xcw0.d0(z));
                break;
            default:
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) this.c;
                a.c cVar = aVar.b;
                if (cVar != null) {
                    PollOption pollOption = aVar.i;
                    if (pollOption == null) {
                        pollOption = null;
                    }
                    cVar.a(pollOption.b, z);
                }
                Drawable background = aVar.getBackground();
                if (background instanceof rqb0) {
                    rqb0 rqb0Var = (rqb0) background;
                    Poll poll = aVar.h;
                    rqb0Var.a = (poll != null ? poll : null).Fb() ? a.b.RESULT_PART_COLOR_WITH_BACKGROUND.h() : a.EnumC1805a.RESULT_PART_COLOR_NO_BACKGROUND.a(aVar.getContext());
                    rqb0Var.setLevel(z ? 10000 : 0);
                    rqb0Var.invalidateSelf();
                    break;
                }
                break;
        }
    }
}
