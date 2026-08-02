package defpackage;

import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class cf0 implements hk0 {
    public final /* synthetic */ int a;
    public final String b;
    public final String c;
    public final PaymentMethod$Type d;

    public cf0(String str, String str2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                this.c = str2;
                this.d = PaymentMethod$Type.NEQUI_TOKEN;
                break;
            default:
                this.b = str;
                this.c = str2;
                this.d = PaymentMethod$Type.JAZZCASH_WALLET;
                break;
        }
    }

    @Override // defpackage.hk0
    public final PaymentMethod$Type a() {
        switch (this.a) {
        }
        return this.d;
    }

    @Override // defpackage.hk0
    public final String getScreen() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.hk0
    public final String getService() {
        switch (this.a) {
        }
        return this.c;
    }
}
