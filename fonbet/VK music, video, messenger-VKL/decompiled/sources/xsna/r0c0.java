package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.newsfeed.PostCaptionInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0c0 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r0c0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Action action;
        switch (this.b) {
            case 0:
                PostCaptionInfo postCaptionInfo = (PostCaptionInfo) this.c;
                dw20 dw20Var = (dw20) this.d;
                LinkButton linkButton = postCaptionInfo.e;
                if (linkButton != null && (action = linkButton.c) != null) {
                    di60.w(action, view.getContext(), null, null, null, null, 62);
                }
                dw20Var.hide();
                break;
            default:
                o0w0 o0w0Var = (o0w0) this.c;
                ViewGroup viewGroup = (ViewGroup) this.d;
                ViewGroup viewGroup2 = o0w0Var.p;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                viewGroup.setVisibility(4);
                ConstraintLayout constraintLayout = o0w0Var.g;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(0);
                }
                o0w0Var.i.V();
                break;
        }
    }
}
