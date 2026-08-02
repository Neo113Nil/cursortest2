package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xbc0 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xbc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = PostingAttachActivity.X;
                ((PostingAttachActivity) obj).finish();
                break;
            default:
                ((izs) obj).invoke(Boolean.FALSE);
                break;
        }
    }
}
