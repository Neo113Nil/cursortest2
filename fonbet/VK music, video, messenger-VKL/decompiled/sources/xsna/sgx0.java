package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import kotlin.text.Regex;
import xsna.vf3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class sgx0 implements izs {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ sgx0(String str, long j, long j2) {
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        WebApiApplication webApiApplication = (WebApiApplication) obj;
        Regex regex = ugx0.a;
        String str = webApiApplication.D;
        boolean g = webApiApplication.g();
        String str2 = this.b;
        long j = this.c;
        long j2 = this.d;
        if (g && str != null && str.length() != 0 && ugx0.a(j, str2)) {
            return io.reactivex.rxjava3.core.q.T(new eag0(webApiApplication, new nex0(str, str), j2));
        }
        String str3 = webApiApplication.D;
        if (ugx0.a(j, str2)) {
            str2 = dd80.g(j, null, str3, null, "", null);
        }
        return rdx0.u(e370.e(vf3.a.i((int) webApiApplication.b, new UserId(0L), str2, null, null))).U(new awi0(new dh8(1, (q73) ugx0.d.getValue(), q73.class, "mapToWebAppEmbeddedUrl", "mapToWebAppEmbeddedUrl(Lcom/vk/api/generated/apps/dto/AppsGetEmbeddedUrlResponseDto;)Lcom/vk/superapp/api/dto/app/WebAppEmbeddedUrl;", 0, 7), 18)).U(new z250(new tgx0(j2, webApiApplication), 13));
    }
}
