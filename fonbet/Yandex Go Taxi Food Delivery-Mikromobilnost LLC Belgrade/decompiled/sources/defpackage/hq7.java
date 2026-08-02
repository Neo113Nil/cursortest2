package defpackage;

import androidx.camera.core.f;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class hq7 {
    public final CardScannerActivity a;
    public final rxe0 b;
    public final md6 c;
    public final cx7 d;
    public final ExecutorService e = Executors.newSingleThreadExecutor();
    public final eq7 f = new eq7();
    public boolean g;
    public f h;

    public hq7(CardScannerActivity cardScannerActivity, rxe0 rxe0Var, md6 md6Var, cx7 cx7Var) {
        this.a = cardScannerActivity;
        this.b = rxe0Var;
        this.c = md6Var;
        this.d = cx7Var;
    }
}
