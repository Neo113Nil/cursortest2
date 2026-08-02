package xsna;

import android.content.DialogInterface;
import com.vk.dto.common.VideoFile;
import xsna.ig3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gj3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gj3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((nj3) obj).d.invoke(ig3.e.a.b);
                break;
            case 1:
                int i3 = c2h.p1;
                ((c2h) obj).dismiss();
                break;
            default:
                fxc0.B().d((VideoFile) obj);
                break;
        }
    }
}
