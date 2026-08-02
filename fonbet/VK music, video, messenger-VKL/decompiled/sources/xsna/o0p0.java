package xsna;

import android.net.Uri;
import com.vk.dto.video.VideoAlbum;
import com.vk.external.miniapp.net.app.WebApiApplication;
import xsna.d2t0;
import xsna.mp90;
import xsna.op90;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class o0p0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o0p0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                break;
            case 1:
                d2t0.a aVar = (d2t0.a) this.c;
                f2t0 f2t0Var = (f2t0) this.d;
                VideoAlbum videoAlbum = aVar.o;
                if (videoAlbum != null) {
                    f2t0Var.b(videoAlbum);
                }
                break;
            case 2:
                ggu0 ggu0Var = (ggu0) this.c;
                izs izsVar = (izs) this.d;
                WebApiApplication webApiApplication = (WebApiApplication) obj;
                fvv0 fvv0Var = ggu0Var.e;
                fvv0Var.C(webApiApplication);
                fvv0Var.p(Uri.parse(fvv0Var.c()).getFragment());
                xgx0.a.getClass();
                xgx0.f("app info updated");
                izsVar.invoke(webApiApplication);
                break;
            default:
                ((kuw0) this.c).m.a(new mp90.a.b(((op90.a) this.d).c()));
                break;
        }
        return s3q0.a;
    }
}
