package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.fragments.FragmentImpl;
import com.vk.messagetemplates.impl.details.TemplateDetailsState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ak2(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                String str = this.c;
                if (str != null) {
                    qgi0.h(tgi0Var, str);
                }
                return s3q0.a;
            case 1:
                return Boolean.valueOf(epx.f(((UIBlockList) obj).b, this.c));
            case 2:
                qgi0.h((tgi0) obj, this.c);
                return s3q0.a;
            case 3:
                TemplateDetailsState templateDetailsState = (TemplateDetailsState) obj;
                String str2 = templateDetailsState.d;
                String str3 = this.c;
                if (str2 != null && str2.length() != 0 && !brm0.v(str2, " ", false)) {
                    return TemplateDetailsState.a(templateDetailsState, null, v1v.a(' ', str2, str3), false, 11);
                }
                StringBuilder sb = new StringBuilder();
                if (str2 == null) {
                    str2 = "";
                }
                return TemplateDetailsState.a(templateDetailsState, null, i5s.a(sb, str2, str3), false, 11);
            default:
                nr4.b().m(new jbs((FragmentImpl) obj), this.c);
                return s3q0.a;
        }
    }
}
