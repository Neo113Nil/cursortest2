package xsna;

import android.content.DialogInterface;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class au1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ au1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = AllHighlightsFragment.g0;
                zt1 zt1Var = (zt1) ((AllHighlightsFragment) obj).S;
                if (zt1Var != null) {
                    zt1Var.E5();
                    break;
                }
                break;
            default:
                ((u1j) obj).v.invoke(v1j.q.b);
                break;
        }
    }
}
