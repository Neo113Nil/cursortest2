package xsna;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.webrtc.cid.ConversationIdProviderImpl;

/* compiled from: CallFinishHandler.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public final class h39 {
    public final OkApiServiceInternal a;
    public final CidLogger b;
    public final ConversationIdProviderImpl c;
    public final String d;
    public final Set<far> e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* compiled from: CallFinishHandler.kt */
    public static final class a {
        public final ear a;
        public final String b;

        public a(ear earVar, String str) {
            this.a = earVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "UploadStage(event=" + this.a + ", destinationUrl=" + this.b + ")";
        }
    }

    public h39(OkApiServiceInternal okApiServiceInternal, CidLogger cidLogger, ConversationIdProviderImpl conversationIdProviderImpl, String str, Set set) {
        this.a = okApiServiceInternal;
        this.b = cidLogger;
        this.c = conversationIdProviderImpl;
        this.d = str;
        this.e = set;
    }
}
