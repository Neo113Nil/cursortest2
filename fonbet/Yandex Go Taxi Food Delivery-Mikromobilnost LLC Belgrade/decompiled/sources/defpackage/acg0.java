package defpackage;

import android.view.animation.Interpolator;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderScreenParams;

/* loaded from: classes3.dex */
public final /* synthetic */ class acg0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrReaderFragment b;

    public /* synthetic */ acg0(QrReaderFragment qrReaderFragment, int i) {
        this.a = i;
        this.b = qrReaderFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 consumeSideEffect$lambda$23$lambda$22;
        QrReaderScreenParams screenParams_delegate$lambda$2;
        Interpolator defaultInterpolator_delegate$lambda$4;
        zy11 onViewCreated$lambda$18$lambda$8;
        zy11 onViewCreated$lambda$18$lambda$9;
        zy11 onViewCreated$lambda$18$lambda$16$lambda$13;
        zy11 onViewCreated$lambda$18$lambda$16$lambda$14;
        zy11 onViewCreated$lambda$18$lambda$16$lambda$15;
        zy11 viewBinding$lambda$7$lambda$5;
        int i = this.a;
        QrReaderFragment qrReaderFragment = this.b;
        switch (i) {
            case 0:
                consumeSideEffect$lambda$23$lambda$22 = QrReaderFragment.consumeSideEffect$lambda$23$lambda$22(qrReaderFragment);
                return consumeSideEffect$lambda$23$lambda$22;
            case 1:
                screenParams_delegate$lambda$2 = QrReaderFragment.screenParams_delegate$lambda$2(qrReaderFragment);
                return screenParams_delegate$lambda$2;
            case 2:
                defaultInterpolator_delegate$lambda$4 = QrReaderFragment.defaultInterpolator_delegate$lambda$4(qrReaderFragment);
                return defaultInterpolator_delegate$lambda$4;
            case 3:
                onViewCreated$lambda$18$lambda$8 = QrReaderFragment.onViewCreated$lambda$18$lambda$8(qrReaderFragment);
                return onViewCreated$lambda$18$lambda$8;
            case 4:
                onViewCreated$lambda$18$lambda$9 = QrReaderFragment.onViewCreated$lambda$18$lambda$9(qrReaderFragment);
                return onViewCreated$lambda$18$lambda$9;
            case 5:
                onViewCreated$lambda$18$lambda$16$lambda$13 = QrReaderFragment.onViewCreated$lambda$18$lambda$16$lambda$13(qrReaderFragment);
                return onViewCreated$lambda$18$lambda$16$lambda$13;
            case 6:
                onViewCreated$lambda$18$lambda$16$lambda$14 = QrReaderFragment.onViewCreated$lambda$18$lambda$16$lambda$14(qrReaderFragment);
                return onViewCreated$lambda$18$lambda$16$lambda$14;
            case 7:
                onViewCreated$lambda$18$lambda$16$lambda$15 = QrReaderFragment.onViewCreated$lambda$18$lambda$16$lambda$15(qrReaderFragment);
                return onViewCreated$lambda$18$lambda$16$lambda$15;
            default:
                viewBinding$lambda$7$lambda$5 = QrReaderFragment.getViewBinding$lambda$7$lambda$5(qrReaderFragment);
                return viewBinding$lambda$7$lambda$5;
        }
    }
}
