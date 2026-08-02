package defpackage;

import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class bcg0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ QrReaderFragment b;

    public /* synthetic */ bcg0(QrReaderFragment qrReaderFragment, int i) {
        this.a = i;
        this.b = qrReaderFragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        stz0 initRecognitionFromFileForOldScanner$lambda$38$lambda$36;
        stz0 renderToolbarWithoutTsarButton$lambda$32;
        int i = this.a;
        QrReaderFragment qrReaderFragment = this.b;
        stz0 stz0Var = (stz0) obj;
        switch (i) {
            case 0:
                initRecognitionFromFileForOldScanner$lambda$38$lambda$36 = QrReaderFragment.initRecognitionFromFileForOldScanner$lambda$38$lambda$36(qrReaderFragment, stz0Var);
                return initRecognitionFromFileForOldScanner$lambda$38$lambda$36;
            default:
                renderToolbarWithoutTsarButton$lambda$32 = QrReaderFragment.renderToolbarWithoutTsarButton$lambda$32(qrReaderFragment, stz0Var);
                return renderToolbarWithoutTsarButton$lambda$32;
        }
    }
}
