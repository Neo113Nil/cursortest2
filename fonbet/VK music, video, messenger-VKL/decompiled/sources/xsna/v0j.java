package xsna;

/* compiled from: ConfigureRoomParticipantsListItemDecorator.kt */
/* loaded from: classes7.dex */
public final class v0j extends ajf0 {
    @Override // xsna.ajf0
    public final boolean l(int i) {
        return i == 0 ? this.b.c(i) instanceof u0j : n(i);
    }

    @Override // xsna.ajf0
    public final boolean m(int i) {
        return n(i);
    }

    @Override // xsna.ajf0
    public final boolean n(int i) {
        if (i > 0) {
            return this.b.c(i) instanceof u0j;
        }
        return false;
    }
}
