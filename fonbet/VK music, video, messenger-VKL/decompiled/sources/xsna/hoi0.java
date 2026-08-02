package xsna;

import android.os.IInterface;
import androidx.health.platform.client.request.AggregateDataRequest;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetContactCallTokenEnvDto;
import java.io.IOException;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class hoi0 implements ivf0, ApiTokenInfoProvider, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hoi0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        hjz0.a aVar = (hjz0.a) this.b;
        String str = ((tez0) this.c).F;
        yil0.d(aVar);
    }

    @Override // ru.ok.android.sdk.api.token.ApiTokenInfoProvider
    public ApiTokenInfoProvider.Info getTokenInfo() {
        c2p0 c2p0Var = (c2p0) this.b;
        MessagesGetCallTokenResponseDto messagesGetCallTokenResponseDto = (MessagesGetCallTokenResponseDto) yfb.x(c2p0Var.a.k((String) this.c, MessagesGetContactCallTokenEnvDto.PRODUCTION)).u(0L);
        if (messagesGetCallTokenResponseDto == null) {
            throw new IOException("Can't get token result for contact");
        }
        String e = messagesGetCallTokenResponseDto.e();
        String d = messagesGetCallTokenResponseDto.d();
        if (d == null) {
            d = (String) c2p0Var.d.invoke();
        }
        return new ApiTokenInfoProvider.Info(e, d);
    }

    @Override // xsna.ivf0
    public void a(IInterface iInterface, lzi0 lzi0Var) {
        ((gnv) iInterface).j0(((ioi0) this.b).c(), new AggregateDataRequest((androidx.health.platform.client.proto.p0) this.c), new n71(lzi0Var));
    }
}
