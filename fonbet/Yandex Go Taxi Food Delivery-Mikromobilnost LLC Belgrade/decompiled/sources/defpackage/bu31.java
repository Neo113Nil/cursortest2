package defpackage;

import android.view.View;
import java.util.Arrays;

/* loaded from: classes10.dex */
public class bu31 implements kty, ojs0 {
    private int[] size;
    private au31 viewTarget;

    public bu31(View view) {
        au31 au31Var = new au31(view);
        this.viewTarget = au31Var;
        au31Var.getSize(this);
    }

    @Override // defpackage.kty
    public int[] getPreloadSize(Object obj, int i, int i2) {
        int[] iArr = this.size;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Override // defpackage.ojs0
    public void onSizeReady(int i, int i2) {
        this.size = new int[]{i, i2};
        this.viewTarget = null;
    }

    public void setView(View view) {
        if (this.size == null && this.viewTarget == null) {
            au31 au31Var = new au31(view);
            this.viewTarget = au31Var;
            au31Var.getSize(this);
        }
    }

    public bu31() {
    }
}
