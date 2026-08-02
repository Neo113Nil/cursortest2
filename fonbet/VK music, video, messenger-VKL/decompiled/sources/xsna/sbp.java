package xsna;

import com.vk.core.ui.modal.VkModal;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ybp;

/* compiled from: EmailActualizationBottomSheet.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class sbp extends FunctionReferenceImpl implements gzs<s3q0> {
    @Override // xsna.gzs
    public final s3q0 invoke() {
        ubp ubpVar = (ubp) this.receiver;
        ubpVar.a().a(ubpVar.c);
        ubpVar.j = true;
        ubpVar.d.invoke(new ybp.c(ubpVar.b, true ^ ubpVar.f));
        VkModal vkModal = ubpVar.h;
        if (vkModal != null) {
            vkModal.a();
        }
        return s3q0.a;
    }
}
