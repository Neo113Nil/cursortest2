package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class td20 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ td20(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                PostingUserMessageButton postingUserMessageButton = (PostingUserMessageButton) this.c;
                PostingAction postingAction = (PostingAction) this.d;
                ud20 ud20Var = (ud20) this.e;
                boolean z = postingUserMessageButton.e;
                PostingAction postingAction2 = postingUserMessageButton.c;
                if (z) {
                    postingAction2 = com.vk.newsfeed.posting.impl.domain.model.d.a(postingAction2, postingAction);
                }
                if (postingAction2 != null) {
                    ud20Var.a.invoke(postingAction2);
                }
                dialogInterface.dismiss();
                break;
            default:
                rhc0 rhc0Var = (rhc0) this.c;
                FragmentActivity fragmentActivity = (FragmentActivity) this.d;
                PostEditingReason postEditingReason = (PostEditingReason) this.e;
                xn50.a.c(rhc0Var.c, PostingAction.LocalDraft.RemoveDraft.b);
                rhc0Var.a(fragmentActivity, true, postEditingReason, false);
                break;
        }
    }
}
