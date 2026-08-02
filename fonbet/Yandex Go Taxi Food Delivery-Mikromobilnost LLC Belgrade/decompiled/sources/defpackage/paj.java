package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.security.impl.internal.devicechallenge.a;

/* loaded from: classes12.dex */
public final class paj implements oaj, qbj {
    public final a a;

    public /* synthetic */ paj(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.oaj
    public void a(FragmentActivity fragmentActivity, int i, int i2, String str, String str2, j9a j9aVar) {
        this.a.e(fragmentActivity, i, i2, str, str2, j9aVar);
    }

    @Override // defpackage.qbj
    public String getPublicKey() {
        return this.a.d();
    }
}
