package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vbc0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vbc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = PostingAttachActivity.X;
                ((PostingAttachActivity) obj).finish();
                break;
            case 1:
                xn50.a.c(((rhc0) obj).c, new PostingAction.Publish.SaveDraft(true));
                break;
            default:
                ((izs) obj).invoke(Boolean.FALSE);
                break;
        }
    }
}
