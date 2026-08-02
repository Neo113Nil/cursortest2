package xsna;

import com.vk.core.view.components.tooltip.VkTooltip;
import com.vk.dto.hints.Hint;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class fl60 implements VkTooltip.b, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fl60(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onVerificationFailed$26((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // com.vk.core.view.components.tooltip.VkTooltip.b
    public void b(VkTooltip.DismissReason dismissReason) {
        Hint hint = (Hint) this.b;
        x6v x6vVar = (x6v) this.c;
        hl60.d = null;
        hl60.h.remove(hint.b);
        x6vVar.b(hint.b);
    }
}
