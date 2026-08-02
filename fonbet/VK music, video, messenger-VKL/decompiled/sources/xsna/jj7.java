package xsna;

import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.li7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jj7 implements izs {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ii7 c;
    public final /* synthetic */ BoardTopicsFragment d;

    public /* synthetic */ jj7(BoardTopicsFragment boardTopicsFragment, ii7 ii7Var, boolean z) {
        this.b = z;
        this.c = ii7Var;
        this.d = boardTopicsFragment;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = BoardTopicsFragment.S0;
        boolean z = this.b;
        int i7 = 0;
        cvk.u(z ? R.string.topic_unfixed : R.string.topic_fixed, false);
        ii7 ii7Var = this.c;
        if (z) {
            ii7Var.g &= -3;
        } else {
            ii7Var.g |= 2;
        }
        BoardTopicsFragment boardTopicsFragment = this.d;
        if (z) {
            ArrayList<T> arrayList = boardTopicsFragment.v0;
            arrayList.remove(ii7Var);
            int size = arrayList.size() - 1;
            boolean z2 = false;
            while (true) {
                if (i7 < size) {
                    ii7 ii7Var2 = (ii7) arrayList.get(i7);
                    if (ii7Var2 == null) {
                        break;
                    }
                    i7++;
                    ii7 ii7Var3 = (ii7) arrayList.get(i7);
                    if (ii7Var3 == null) {
                        break;
                    }
                    if ((ii7Var2.g & 2) <= 0 && (((i = boardTopicsFragment.M0) == 1 && (i5 = ii7Var.e) < ii7Var2.e && i5 >= ii7Var3.e) || ((i == -1 && (i4 = ii7Var.e) < ii7Var3.e && i4 >= ii7Var2.e) || ((i == 2 && (i3 = ii7Var.d) < ii7Var2.d && i3 >= ii7Var3.d) || (i == -2 && (i2 = ii7Var.d) < ii7Var3.d && i2 >= ii7Var2.d))))) {
                        arrayList.add(i7, ii7Var);
                        z2 = true;
                    }
                } else if (!z2) {
                    arrayList.add(ii7Var);
                }
            }
        } else {
            boardTopicsFragment.v0.remove(ii7Var);
            boardTopicsFragment.v0.add(0, ii7Var);
        }
        ((ysg0) boardTopicsFragment.P0.getValue()).a(new li7.c(boardTopicsFragment.No()));
        boardTopicsFragment.q();
        return s3q0.a;
    }
}
