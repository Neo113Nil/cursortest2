package xsna;

import android.content.DialogInterface;
import one.video.controls.dialogs.videotracks.ExtendedVideoTracksDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class rcq implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rcq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ExtendedVideoTracksDialog extendedVideoTracksDialog = (ExtendedVideoTracksDialog) this.c;
                extendedVideoTracksDialog.z = null;
                extendedVideoTracksDialog.dismiss();
                break;
            default:
                gzs<s3q0> gzsVar = ((g910) this.c).l;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
        }
    }
}
