package xsna;

import android.content.DialogInterface;
import android.widget.FrameLayout;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.fullscreenbanners.ConsumeReason;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class zsd implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zsd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.b) {
            case 0:
                ((atd) this.c).b.t();
                break;
            case 1:
                qvs qvsVar = (qvs) this.c;
                if (!qvsVar.s) {
                    qvsVar.o.b.a((qvsVar.r ? ConsumeReason.CLOSE : ConsumeReason.SWIPE).h());
                }
                CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = qvsVar.k;
                if (customisableBottomSheetBehavior != null) {
                    customisableBottomSheetBehavior.J(5);
                    break;
                }
                break;
            default:
                ((d3a0) this.c).z.finish();
                break;
        }
    }
}
