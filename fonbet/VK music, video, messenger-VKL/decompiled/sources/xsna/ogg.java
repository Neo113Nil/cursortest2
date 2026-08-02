package xsna;

import com.ironsource.InterfaceC4413l1;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.Set;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: CommentsViewHolderTypes.kt */
/* loaded from: classes3.dex */
public final class ogg {
    public static final Set<Integer> a;
    public static final Set<Integer> b;

    static {
        Integer valueOf = Integer.valueOf(InterfaceC4413l1.a.b.k);
        Integer valueOf2 = Integer.valueOf(Http.StatusCode.RANGE_NOT_SATISFIABLE);
        a = rl3.y0(new Integer[]{410, 417, 418, 419, 421, 422, 423, valueOf, 412, 413, 414, 415, valueOf2, 425, 426, 427, 428, 430, 431, Integer.valueOf(Tensorflow.FRAME_WIDTH), Integer.valueOf(CommonGatewayClient.CODE_TOO_MANY_REQUESTS), 433, 434, 435, 436, 437, 439, 440, 441, 442, 445, 446, 447});
        b = rl3.y0(new Integer[]{valueOf, 412, 413, 414, 415, valueOf2, 452, Integer.valueOf(ApiInvocationException.ErrorCodes.SESSION_REQUIRED), Integer.valueOf(ApiInvocationException.ErrorCodes.CENSOR_MATCH)});
    }
}
