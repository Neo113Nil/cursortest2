package xsna;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.vk.photoviewer.PhotoViewer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class w520 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w520(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                z520 z520Var = (z520) obj;
                PhotoViewer photoViewer = z520Var.m;
                mhy.c(photoViewer != null ? photoViewer.w.getWindowToken() : null, z520Var.c);
                i0q0.d(200L, new m67(z520Var, 6));
                break;
            default:
                FragmentActivity activity = ((n6k0) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                    break;
                }
                break;
        }
    }
}
