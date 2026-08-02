package defpackage;

import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes15.dex */
public final class fe51 {
    public final String a;
    public final String b;

    public fe51(MessengerEnvironment messengerEnvironment, rz10 rz10Var) {
        String str = null;
        switch (ee51.a[messengerEnvironment.ordinal()]) {
            case 1:
            case 2:
                str = "messenger-prod";
                break;
            case 3:
            case 4:
            case 5:
                str = "messenger";
                break;
            case 6:
                break;
            default:
                w511.b();
                throw null;
        }
        this.a = str;
        String str2 = rz10Var.c;
        this.b = "version4*common+version4*".concat(str2 == null ? "main" : str2);
    }
}
