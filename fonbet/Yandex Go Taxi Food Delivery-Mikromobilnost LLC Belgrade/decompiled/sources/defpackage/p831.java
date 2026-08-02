package defpackage;

/* loaded from: classes4.dex */
public final class p831 extends s831 {
    public static final p831 k = new p831(0);
    public static final p831 l = new p831(1);
    public final /* synthetic */ int j;

    public /* synthetic */ p831(int i) {
        this.j = i;
    }

    public final String toString() {
        switch (this.j) {
            case 0:
                return "Failure: No certificates";
            default:
                return "Failure: This certificate does not have any Signed Certificate Timestamps in it.";
        }
    }
}
