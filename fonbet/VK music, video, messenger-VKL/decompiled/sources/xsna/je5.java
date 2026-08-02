package xsna;

import com.vk.httpexecutor.api.NetworkClient;
import com.vkontakte.android.VKApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class je5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ je5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new de5((b2a) obj, new ie5(new zqu()), (m7a) obj2);
            case 1:
                t260 t260Var = ((dky) obj2).f;
                if (obj == NetworkClient.ClientType.CLIENT_API) {
                    booleanValue = t260Var.g.b.invoke().booleanValue();
                } else if (obj == NetworkClient.ClientType.CLIENT_PLAYER) {
                    booleanValue = true;
                } else if (obj == NetworkClient.ClientType.CLIENT_IMAGE_LOADER) {
                    booleanValue = t260Var.g.c.invoke().booleanValue();
                } else if (obj == NetworkClient.ClientType.CLIENT_SSE) {
                    booleanValue = t260Var.g.d.invoke().booleanValue();
                } else if (obj == NetworkClient.ClientType.CLIENT_PLAYER_DOWNLOADER) {
                    booleanValue = t260Var.g.e.invoke().booleanValue();
                } else {
                    t260Var.g.f.getClass();
                    booleanValue = Boolean.FALSE.booleanValue();
                }
                return Boolean.valueOf(booleanValue);
            default:
                VKApplication.a aVar = VKApplication.c;
                xwk.d().b().a((VKApplication) obj2, (String) obj);
                return s3q0.a;
        }
    }
}
