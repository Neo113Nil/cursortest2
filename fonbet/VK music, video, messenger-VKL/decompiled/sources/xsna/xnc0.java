package xsna;

import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class xnc0 extends FunctionReferenceImpl implements izs<UserId, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(UserId userId) {
        UserId userId2 = userId;
        enc0 enc0Var = (enc0) this.receiver;
        if (!epx.f(enc0Var.Z, userId2)) {
            enc0Var.Z = userId2;
            ahc0 ahc0Var = enc0Var.V;
            if (ahc0Var != null) {
                MediaPickerState.Tab[] tabArr = {MediaPickerState.Tab.PhotoVk, MediaPickerState.Tab.VideoVk};
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 2; i++) {
                    Integer j = p4g.j(tabArr[i], ahc0Var.s);
                    if (j != null) {
                        arrayList.add(j);
                    }
                }
                Iterator it = j5g.D0(cgg0.b, arrayList).iterator();
                while (it.hasNext()) {
                    Fragment F0 = ahc0Var.F0(((Number) it.next()).intValue());
                    if (F0 != null) {
                        ahc0Var.p.replaceAll(new f1q0(F0));
                    }
                }
                ahc0Var.notifyDataSetChanged();
            }
            enc0Var.g(enc0.q0.get(enc0Var.u.getCurrentItem()));
        }
        return s3q0.a;
    }
}
