package xsna;

import android.content.DialogInterface;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class du1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;

    public /* synthetic */ du1(int i) {
        this.b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                int i2 = AllHighlightsFragment.g0;
                break;
            default:
                dialogInterface.dismiss();
                break;
        }
    }
}
