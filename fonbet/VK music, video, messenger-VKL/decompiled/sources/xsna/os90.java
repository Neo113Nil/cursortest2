package xsna;

/* compiled from: PaymentNotificationEvent.kt */
/* loaded from: classes4.dex */
public final class os90 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ os90(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return h5s.c(this.b, ", eventCode=0)", new StringBuilder("PaymentNotificationEvent(transferId="));
            default:
                return super.toString();
        }
    }
}
