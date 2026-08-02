package xsna;

import com.vk.log.L;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kpk;

/* compiled from: CustomVirtualBackground.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class dpk extends FunctionReferenceImpl implements izs<kpk.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(kpk.a aVar) {
        kpk.a aVar2 = aVar;
        cpk cpkVar = (cpk) this.receiver;
        if (aVar2 instanceof kpk.a.c) {
            cpkVar.e.c();
            cpkVar.f.d.invoke(((kpk.a.c) aVar2).a);
        } else if (aVar2 instanceof kpk.a.C3195a) {
            cpkVar.b(R.string.voip_add_custom_virtual_background_image_error);
            L.e("save custom virtual background error", ((kpk.a.C3195a) aVar2).a);
        } else {
            if (!(aVar2 instanceof kpk.a.b)) {
                cpkVar.getClass();
                throw new NoWhenBranchMatchedException();
            }
            cpkVar.b(R.string.voip_add_custom_virtual_background_upload_error);
            L.e("save custom virtual background error", ((kpk.a.b) aVar2).a);
        }
        return s3q0.a;
    }
}
