package defpackage;

import com.yandex.messaging.MessengerEnvironment;

/* loaded from: classes8.dex */
public final class m120 {
    public final x120 a;
    public final nff0 b;
    public MessengerEnvironment c;

    public m120(x120 x120Var, nff0 nff0Var) {
        this.a = x120Var;
        this.b = nff0Var;
    }

    public final MessengerEnvironment a() {
        MessengerEnvironment messengerEnvironment;
        MessengerEnvironment messengerEnvironment2 = this.c;
        if (messengerEnvironment2 != null) {
            return messengerEnvironment2;
        }
        int i = this.b.a.getInt("MESSENGER_ENVIRONMENT", -1);
        MessengerEnvironment[] values = MessengerEnvironment.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                messengerEnvironment = null;
                break;
            }
            messengerEnvironment = values[i2];
            if (messengerEnvironment.ordinal() == i) {
                break;
            }
            i2++;
        }
        return messengerEnvironment == null ? this.a.a() : messengerEnvironment;
    }
}
