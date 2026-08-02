package xsna;

/* compiled from: FaveSearchMergeAdapter.kt */
/* loaded from: classes18.dex */
public final class yrq extends a920 implements mf7 {
    @Override // xsna.mf7
    public final int e0(int i) {
        if (L0(i) == null) {
            return 0;
        }
        if (i == 0 && i == getItemCount() - 1) {
            return 6;
        }
        if (i == 0) {
            return 2;
        }
        return i == getItemCount() - 1 ? 4 : 1;
    }
}
