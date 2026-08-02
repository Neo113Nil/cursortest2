package xsna;

import android.content.DialogInterface;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zb5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zb5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b.j1;
                ((com.vk.video.ui.upload.impl.publish.presentation.author.fragment.b) obj).eo().b(g75.b);
                dialogInterface.dismiss();
                break;
            default:
                bpn0 bpn0Var = VideoOverlayView.I;
                gzs<s3q0> gzsVar = ((VideoOverlayView.c.i) obj).d;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
