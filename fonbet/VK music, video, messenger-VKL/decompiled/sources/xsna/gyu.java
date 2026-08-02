package xsna;

import com.vk.catalog.mvi.block.impl.HeaderView;
import com.vk.core.apps.BuildInfo;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.httpexecutor.core.knet.KnetExecutorType;
import com.vk.log.L;
import com.vkontakte.android.VKApplication;
import java.io.File;
import java.util.concurrent.TimeUnit;
import xsna.uek;
import xsna.wdk;
import xsna.wjy;
import xsna.ydk;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class gyu implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gyu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new HeaderView.c((b2a) obj, (m7a) obj2);
            case 1:
                t260 t260Var = (t260) obj2;
                NetworkClient.ClientType clientType = (NetworkClient.ClientType) obj;
                if (clientType == NetworkClient.ClientType.CLIENT_API || clientType == NetworkClient.ClientType.CLIENT_SSE) {
                    return null;
                }
                b260 b260Var = t260Var.d;
                return new m19(new z1p0(new vx5(), b260Var.c, b260Var.d, b260Var.e, null, 112));
            case 2:
                wjy.a aVar = (wjy.a) obj2;
                ydk.a aVar2 = (ydk.a) obj;
                StringBuilder sb = new StringBuilder();
                File file = aVar.d;
                wjy.a.c cVar = aVar.r;
                sb.append(file.getAbsolutePath());
                sb.append("/cronet");
                aVar2.d = new wdk.a(new File(sb.toString()));
                if (aVar.h.invoke() == KnetExecutorType.CRONET_QUIC) {
                    yek yekVar = aVar.p.d;
                    if (yekVar != null) {
                        aVar2.b = yekVar;
                    } else {
                        L.G("Quic is enabled but options is null");
                    }
                }
                aVar2.f = true;
                aVar2.o = true;
                aVar2.n = true;
                aVar2.e = new uek.a(aVar.e);
                long j = cVar.a;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                aVar2.g = timeUnit.toMillis(j);
                aVar2.i = timeUnit.toMillis(cVar.b);
                aVar2.h = timeUnit.toMillis(cVar.c);
                aVar2.j = 64;
                aVar2.k = 5;
                aVar2.l = true;
                aVar2.m = true;
                aVar2.c = new v1v();
                if (aVar.B) {
                    aVar2.s = true;
                    aVar2.t = aVar.C;
                }
                aVar2.p.add(aVar.n);
                aVar2.r = BuildInfo.h();
                aVar2.u = aVar.H;
                aVar2.v = aVar.I;
                return aVar2;
            default:
                nau0 nau0Var = (nau0) obj2;
                VKApplication.a aVar3 = VKApplication.c;
                nau0Var.f = ((Boolean) obj).booleanValue();
                nau0Var.D();
                return s3q0.a;
        }
    }
}
