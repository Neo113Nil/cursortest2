package xsna;

import android.content.Context;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class br80 implements izs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ yp80 e;
    public final /* synthetic */ String f;

    public /* synthetic */ br80(Context context, String str, String str2, String str3, yp80 yp80Var) {
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = yp80Var;
        this.f = str3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String type = ((UtilsDomainResolvedWithDataDto) obj).getType();
        boolean f = epx.f(type, "user");
        Context context = this.b;
        String str = this.c;
        String str2 = this.d;
        yp80 yp80Var = this.e;
        String str3 = this.f;
        if (f) {
            com.vk.common.links.c.t(context, null, r1.g(), 0, null, str, str2, null, false, yp80Var, str3, null, null, 6554);
        } else if (epx.f(type, "group")) {
            com.vk.common.links.c.t(context, null, -r1.g(), 0, null, str, str2, null, false, yp80Var, str3, null, null, 6554);
        } else {
            yp80Var.U();
        }
        return s3q0.a;
    }
}
