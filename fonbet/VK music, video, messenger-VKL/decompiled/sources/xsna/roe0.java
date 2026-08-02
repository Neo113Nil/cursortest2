package xsna;

import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: QrWithCodeAuthModal.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class roe0 extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        QrWithCodeAuthModal qrWithCodeAuthModal = (QrWithCodeAuthModal) this.receiver;
        com.vk.auth.modal.qrwithcode.a aVar = qrWithCodeAuthModal.g;
        if (aVar != null) {
            aVar.onDestroy();
        }
        ModalAuthHostActivity modalAuthHostActivity = qrWithCodeAuthModal.e;
        if (modalAuthHostActivity != null && qrWithCodeAuthModal.A) {
            modalAuthHostActivity.finish();
        }
        qrWithCodeAuthModal.f = null;
        return s3q0.a;
    }
}
