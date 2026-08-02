package xsna;

import com.vk.core.tips.Tooltip;
import com.vk.dto.common.Attachment;
import com.vk.dto.hints.Hint;
import kotlin.Result;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;
import xsna.wjg0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gl60 implements Tooltip.c, io.reactivex.rxjava3.core.a0, Optional.Action {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gl60(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationController) this.b).lambda$onVerificationFinalized$23((VerificationApi.VerificationStateDescriptor) this.c, (VerificationListener) obj);
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        Hint hint = (Hint) this.b;
        x6v x6vVar = (x6v) this.c;
        hl60.d = null;
        hl60.h.remove(hint.b);
        x6vVar.b(hint.b);
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        Object failure;
        try {
            failure = ((ikc0) this.b).Z.a((wjg0.a) ((wjg0) this.c));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            yVar.onError(a);
            return;
        }
        ju90 ju90Var = (ju90) failure;
        if (ju90Var instanceof Attachment) {
            yVar.onSuccess(ju90Var);
        } else {
            yVar.onError(new IllegalStateException("Transformed object isn't type of Attachment"));
        }
    }
}
