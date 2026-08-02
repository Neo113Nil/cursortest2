package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.tooling.PreviewActivity;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.attachments.EventAttachment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nnc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ nnc(int i, int i2, Object obj, izs izsVar, q630 q630Var) {
        this.b = i2;
        this.c = obj;
        this.d = izsVar;
        this.e = q630Var;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                onc.c((znc) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                gzp gzpVar = (gzp) obj4;
                EventAttachment eventAttachment = (EventAttachment) obj3;
                ((Boolean) obj).getClass();
                if (((UserId) obj2).equals(((Owner) obj5).b)) {
                    ((p870) gzpVar.T.getValue()).e(120, eventAttachment);
                }
                break;
            case 2:
                Object[] objArr = (Object[]) obj5;
                String str = (String) obj4;
                String str2 = (String) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.f;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-861939235, intValue, -1, "androidx.compose.ui.tooling.PreviewActivity.setParameterizedContent.<anonymous> (PreviewActivity.android.kt:103)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = androidx.compose.runtime.i.a(0);
                        aVar.R(x);
                    }
                    rg50 rg50Var = (rg50) x;
                    z3h0.a(null, null, null, null, kai.c(-531963740, new f7c(4, objArr, rg50Var), aVar), 0, 0L, 0L, null, kai.c(993072492, new ynj(str, str2, objArr, rg50Var), aVar), aVar, 805330944);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hpl0.b((ipl0) obj5, (izs) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(385));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nnc(Object obj, Object obj2, Comparable comparable, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = comparable;
    }
}
