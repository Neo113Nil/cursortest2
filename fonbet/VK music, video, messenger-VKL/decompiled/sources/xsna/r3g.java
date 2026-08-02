package xsna;

import com.vk.dto.common.AttachmentType;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class r3g implements wzs {
    public final /* synthetic */ int b = 2;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r3g(x3g x3gVar, izs izsVar, rmp rmpVar, q630 q630Var, int i) {
        this.d = x3gVar;
        this.c = izsVar;
        this.e = rmpVar;
        this.f = q630Var;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                w3g.a((x3g) this.d, (izs) this.c, (rmp) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ydc0.a((rsx) this.d, (AttachmentType) this.e, (izs) this.c, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                vaf0.a((q630) this.f, (String) this.d, (Pair) this.c, (String) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ r3g(rsx rsxVar, AttachmentType attachmentType, izs izsVar, gzs gzsVar, int i) {
        this.d = rsxVar;
        this.e = attachmentType;
        this.c = izsVar;
        this.f = gzsVar;
    }

    public /* synthetic */ r3g(q630 q630Var, String str, Pair pair, String str2, int i) {
        this.f = q630Var;
        this.d = str;
        this.c = pair;
        this.e = str2;
    }
}
