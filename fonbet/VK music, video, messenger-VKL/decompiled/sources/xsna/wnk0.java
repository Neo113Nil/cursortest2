package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.longpoll.polling_tasks.sse.SseInvalidUrlException;
import kotlin.Result;

/* compiled from: SseUrlBuilder.kt */
/* loaded from: classes2.dex */
public final class wnk0 implements vnk0 {
    @Override // xsna.vnk0
    public final String a(a400 a400Var, Peer peer) {
        try {
            throw null;
        } catch (Throwable th) {
            Object failure = new Result.Failure(th);
            Throwable a = Result.a(failure);
            if (a == null) {
                kotlin.a.a(failure);
                return (String) failure;
            }
            SseInvalidUrlException sseInvalidUrlException = a instanceof SseInvalidUrlException ? (SseInvalidUrlException) a : null;
            if (sseInvalidUrlException != null) {
                throw sseInvalidUrlException;
            }
            throw new SseInvalidUrlException("failed to build channels sse url", a);
        }
    }
}
