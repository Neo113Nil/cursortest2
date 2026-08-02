package defpackage;

import com.yandex.go.scooters.ble.domain.model.ninebot.Result;

/* loaded from: classes13.dex */
public final class g6p0 {
    public final Result a;

    public g6p0(byte[] bArr) {
        this.a = bArr[6] == 1 ? Result.SUCCESS : Result.FAILURE;
    }
}
