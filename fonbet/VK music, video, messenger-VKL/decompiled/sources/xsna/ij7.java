package xsna;

import android.content.DialogInterface;
import com.vk.topics.impl.fragments.BoardTopicsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ij7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                int i3 = BoardTopicsFragment.S0;
                ((BoardTopicsFragment.d) obj).b(i);
                break;
            default:
                ew8.F((io.reactivex.rxjava3.core.y) obj);
                break;
        }
    }

    public /* synthetic */ ij7(ew8 ew8Var, io.reactivex.rxjava3.core.y yVar) {
        this.c = yVar;
    }
}
