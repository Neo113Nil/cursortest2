package defpackage;

import androidx.fragment.app.m;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderScreenParams;

/* loaded from: classes3.dex */
public final class pu01 implements tn01 {
    public final /* synthetic */ yvf0 a;
    public final /* synthetic */ b7g0 b;

    public pu01(xvf0 xvf0Var, b7g0 b7g0Var) {
        this.a = xvf0Var;
        this.b = b7g0Var;
    }

    public final m a() {
        return (m) this.a.get();
    }

    public final FragmentScreen b(String str, boolean z, String str2, Text text, String str3) {
        QrReaderScreenType.New r3 = new QrReaderScreenType.New(z);
        c7g0 c7g0Var = (c7g0) this.b;
        QrReaderScreenParams qrReaderScreenParams = new QrReaderScreenParams(true, str, r3, str2, text, str3);
        c7g0Var.b.getClass();
        return new FragmentScreen("QrReaderScreen", false, qrReaderScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrReaderFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null);
    }

    public final void c(Integer num) {
        ((c7g0) this.b).e.a.l(num);
    }
}
