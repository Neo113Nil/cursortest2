package xsna;

import androidx.fragment.app.FragmentActivity;

/* compiled from: DropdownFilterModalBottomSheetListener.kt */
/* loaded from: classes18.dex */
public final class omo implements ddr {
    public final FragmentActivity a;
    public final op5 b;
    public boolean c = true;

    public omo(FragmentActivity fragmentActivity, op5 op5Var) {
        this.a = fragmentActivity;
        this.b = op5Var;
    }

    @Override // xsna.ddr
    public final boolean a(int i) {
        if (i != 4) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        this.c = false;
        this.b.d(this.a);
        return true;
    }

    @Override // xsna.ddr
    public final void onCancel() {
        if (this.c) {
            this.c = false;
            this.b.d(this.a);
        }
    }

    @Override // xsna.ddr
    public final void onDismiss() {
        if (this.c) {
            this.c = false;
            this.b.d(this.a);
        }
    }
}
