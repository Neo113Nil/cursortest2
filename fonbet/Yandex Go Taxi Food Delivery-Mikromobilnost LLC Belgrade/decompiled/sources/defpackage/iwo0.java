package defpackage;

import com.yandex.go.scooters.ble.domain.model.ninebot.Result;

/* loaded from: classes13.dex */
public final class iwo0 {
    public final Result a;

    public iwo0(byte[] bArr) {
        this.a = bArr[7] == 0 ? Result.SUCCESS : Result.FAILURE;
    }
}
