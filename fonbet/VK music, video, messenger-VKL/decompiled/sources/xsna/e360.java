package xsna;

import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Set;
import one.video.player.error.OneVideoPlaybackException;

/* compiled from: NetworkErrorUtils.kt */
/* loaded from: classes8.dex */
public final class e360 {
    public static final Set<OneVideoPlaybackException.ErrorCode> a = rl3.y0(new OneVideoPlaybackException.ErrorCode[]{OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_FAILED, OneVideoPlaybackException.ErrorCode.IO_NETWORK_CONNECTION_TIMEOUT});

    public static boolean a(OneVideoPlaybackException oneVideoPlaybackException) {
        Throwable cause;
        return a.contains(oneVideoPlaybackException.d()) || ((cause = oneVideoPlaybackException.getCause()) != null && j5g.P(e43.l(fpf0.a(ConnectException.class), fpf0.a(SocketException.class), fpf0.a(SocketTimeoutException.class), fpf0.a(UnknownHostException.class), fpf0.a(ProtocolException.class)), fpf0.a(cause.getClass())));
    }
}
