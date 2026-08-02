package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedWithDataDto;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class qq80 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ NewsfeedRouter c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ yp80 f;
    public final /* synthetic */ boolean g;

    public /* synthetic */ qq80(Context context, NewsfeedRouter newsfeedRouter, String str, String str2, yp80 yp80Var, boolean z) {
        this.b = str;
        this.c = newsfeedRouter;
        this.d = context;
        this.e = str2;
        this.f = yp80Var;
        this.g = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UtilsDomainResolvedWithDataDto utilsDomainResolvedWithDataDto = (UtilsDomainResolvedWithDataDto) obj;
        String type = utilsDomainResolvedWithDataDto.getType();
        boolean f = epx.f(type, "user");
        yp80 yp80Var = this.f;
        if (f || epx.f(type, "group")) {
            boolean f2 = epx.f(utilsDomainResolvedWithDataDto.getType(), "user");
            int g = utilsDomainResolvedWithDataDto.g();
            if (!f2) {
                g = -g;
            }
            NewsfeedRouter.l(this.c, this.d, "#" + Uri.decode(this.b), new UserId(g), null, null, null, this.e, 56);
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
        } else {
            if (!this.g) {
                cvk.u(R.string.page_not_found, false);
            }
            if (yp80Var != null) {
                yp80Var.U();
            }
        }
        return s3q0.a;
    }
}
