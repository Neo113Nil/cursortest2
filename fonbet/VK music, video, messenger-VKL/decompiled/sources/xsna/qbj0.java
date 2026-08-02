package xsna;

import com.vk.sharing.api.dto.ActionsInfo;
import com.vk.sharing.api.dto.AttachmentInfo;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qbj0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ qbj0(com.vk.sharing.core.a aVar, com.vk.sharing.core.view.l lVar, AttachmentInfo attachmentInfo) {
        this.b = 0;
        this.c = aVar;
        this.d = lVar;
        this.e = attachmentInfo;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                com.vk.sharing.core.a aVar = (com.vk.sharing.core.a) this.c;
                com.vk.sharing.core.view.l lVar = (com.vk.sharing.core.view.l) this.d;
                AttachmentInfo attachmentInfo = (AttachmentInfo) this.e;
                ((Boolean) obj).getClass();
                ActionsInfo d3 = aVar.f.d3();
                d3.h = ((gmq) obj2).X();
                lVar.ae(d3, attachmentInfo != null ? attachmentInfo.b : 0);
                lVar.setToggleFaveActionIsEnabled(true);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((i6v0) this.c).b((ao50) this.d, (izs) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                vmx0 vmx0Var = (vmx0) this.c;
                List list = (List) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                vmx0Var.D(ne7.I(513), (androidx.compose.runtime.a) obj, list, izsVar);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qbj0(Object obj, Object obj2, izs izsVar, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = izsVar;
    }
}
