package xsna;

import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class onc0 extends FunctionReferenceImpl implements izs<Integer, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(Integer num) {
        Integer num2 = num;
        enc0 enc0Var = (enc0) this.receiver;
        List<MediaPickerState.Tab> list = enc0.q0;
        enc0Var.getClass();
        if (num2 != null) {
            enc0Var.h(num2.intValue());
            if (num2.intValue() == 3) {
                enc0Var.n.clearFocus();
            }
        }
        return s3q0.a;
    }
}
