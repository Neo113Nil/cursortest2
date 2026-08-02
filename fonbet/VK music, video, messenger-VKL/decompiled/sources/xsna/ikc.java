package xsna;

import android.view.View;
import com.vk.dto.stories.model.clickable.ClickableLink;
import com.vk.profile.questions.impl.AnswerSource;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.voip.ui.scheduled.creation.ui.VoipScheduleCallViewState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ikc implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ikc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                qkc qkcVar = (qkc) this.c;
                ClickableLink clickableLink = (ClickableLink) this.d;
                qkcVar.m(clickableLink);
                g2v.c().k().w(view.getContext(), clickableLink.e, "story");
                break;
            case 1:
                sq50 sq50Var = (sq50) this.c;
                lp50 lp50Var = (lp50) this.d;
                wzs<? super View, ? super wix, s3q0> wzsVar = sq50Var.t;
                if (wzsVar != null) {
                    wzsVar.invoke(view, lp50Var.a);
                    break;
                }
                break;
            case 2:
                iod0 iod0Var = (iod0) this.c;
                iod0Var.l.invoke((wqd0) this.d);
                break;
            case 3:
                com.vk.profile.questions.impl.e eVar = (com.vk.profile.questions.impl.e) this.c;
                d.c cVar = (d.c) this.d;
                eVar.l.e(cVar, AnswerSource.MESSAGE_REPLY);
                iqe0.a(cVar, SchemeStat$TypeQuestionItem.Type.REPLY_TO_MESSAGE);
                break;
            default:
                ((dxw0) this.c).h6(((VoipScheduleCallViewState.ScreenState.Item.Setting) this.d).b);
                break;
        }
    }
}
