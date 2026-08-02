package xsna;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.qrcode.QRStatsTracker;
import kotlin.collections.EmptyList;

/* compiled from: CommonQrBridge.kt */
/* loaded from: classes5.dex */
public final class zlg implements hne0 {
    public final b25 a;

    public zlg(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.hne0
    public final void b() {
        QRStatsTracker qRStatsTracker = QRStatsTracker.a;
    }

    @Override // xsna.hne0
    public final Intent c(String str) {
        Intent intent = new Intent();
        intent.putExtra("CODE_READER_RESULT", str);
        return intent;
    }

    @Override // xsna.hne0
    public final g5t d(Activity activity) {
        g5t g5tVar = new g5t(activity);
        g5tVar.n = EmptyList.b;
        g5tVar.o = -1;
        return g5tVar;
    }

    @Override // xsna.hne0
    public final cme0 e(FragmentActivity fragmentActivity, qc00 qc00Var) {
        return new cme0(fragmentActivity, qc00Var, null, null);
    }

    @Override // xsna.hne0
    public final String f() {
        return "https://" + a0a.d + "/id" + this.a.o().a;
    }
}
