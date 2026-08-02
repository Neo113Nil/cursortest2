package xsna;

/* compiled from: IncorrectFragmentationSniffFailure.java */
/* loaded from: classes12.dex */
public final class dtw implements lbk0 {
    public static final dtw c = new dtw(true);
    public static final dtw d = new dtw(false);
    public final boolean b;

    public dtw(boolean z) {
        this.b = z;
    }

    public final String toString() {
        return n23.b(new StringBuilder("IncorrectFragmentation{expected="), !this.b, "}");
    }
}
