package xsna;

import android.content.DialogInterface;
import com.vk.clips.attachments.impl.views.video.ClipsVideoAttachmentPickerFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class f86 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f86(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((u440) obj).X7();
                break;
            default:
                int i3 = ClipsVideoAttachmentPickerFragment.W;
                ((ClipsVideoAttachmentPickerFragment) obj).finish();
                break;
        }
    }
}
