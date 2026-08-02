package xsna;

import android.content.DialogInterface;
import com.vk.newsfeed.impl.fragments.NewsfeedFeedbackPollFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class qi60 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = NewsfeedFeedbackPollFragment.g0;
                dialogInterface.dismiss();
                break;
            default:
                dialogInterface.cancel();
                break;
        }
    }
}
