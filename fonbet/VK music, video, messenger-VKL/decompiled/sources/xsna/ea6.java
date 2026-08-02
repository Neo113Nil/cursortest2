package xsna;

import android.net.Uri;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import java.util.Collections;

/* compiled from: BaseChannelLinkHandler.kt */
/* loaded from: classes16.dex */
public abstract class ea6 {
    public final a1w a;
    public final rxr b;

    /* compiled from: BaseChannelLinkHandler.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final int c;
        public final e1b d;
        public final io.reactivex.rxjava3.disposables.b e;

        public a(long j, int i, int i2, e1b e1bVar, io.reactivex.rxjava3.disposables.b bVar) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = e1bVar;
            this.e = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + shy.a(this.c, shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31)) * 31);
        }

        public final String toString() {
            return "OpenChannelCommentModel(channelId=" + this.a + ", cnvMsgId=" + this.b + ", commentId=" + this.c + ", channelLinkCallback=" + this.d + ", cancellationDisposable=" + this.e + ')';
        }
    }

    /* compiled from: BaseChannelLinkHandler.kt */
    public static final class b {
        public final long a;
        public final Uri b;
        public final e1b c;
        public final io.reactivex.rxjava3.disposables.b d;

        public b(long j, Uri uri, e1b e1bVar, io.reactivex.rxjava3.disposables.b bVar) {
            this.a = j;
            this.b = uri;
            this.c = e1bVar;
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "OpenChannelModel(channelId=" + this.a + ", uri=" + this.b + ", channelLinkCallback=" + this.c + ", cancellationDisposable=" + this.d + ", isVkApp=true)";
        }
    }

    /* compiled from: BaseChannelLinkHandler.kt */
    public static final class c {
        public final faz a;
        public final Uri b;
        public final e1b c;
        public final io.reactivex.rxjava3.disposables.b d;

        public c(faz fazVar, Uri uri, e1b e1bVar, io.reactivex.rxjava3.disposables.b bVar) {
            this.a = fazVar;
            this.b = uri;
            this.c = e1bVar;
            this.d = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return Boolean.hashCode(true) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "OpenChannelPostModel(linkPostInfo=" + this.a + ", uri=" + this.b + ", channelLinkCallback=" + this.c + ", cancellationDisposable=" + this.d + ", isVkApp=true)";
        }
    }

    /* compiled from: BaseChannelLinkHandler.kt */
    public static abstract class d {

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class a extends d {
            public static final a a = new a();
        }

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class b extends d {
            public final long a;

            public b(long j) {
                this.a = j;
            }
        }

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class c extends d {
            public final long a;

            public c(long j) {
                this.a = j;
            }
        }
    }

    /* compiled from: BaseChannelLinkHandler.kt */
    public static abstract class e {

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class a extends e {
            public static final a a = new a();
        }

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class b extends e {
            public final long a;

            public b(long j) {
                this.a = j;
            }
        }

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class c extends e {
            public final long a;
            public final int b;

            public c(long j, int i) {
                this.a = j;
                this.b = i;
            }
        }

        /* compiled from: BaseChannelLinkHandler.kt */
        public static final class d extends e {
            public final long a;
            public final int b;

            public d(long j, int i) {
                this.a = j;
                this.b = i;
            }
        }
    }

    public ea6(a1w a1wVar, rxr rxrVar) {
        this.a = a1wVar;
        this.b = rxrVar;
    }

    public static boolean d(Throwable th) {
        Throwable cause = th.getCause();
        VKApiExecutionException vKApiExecutionException = null;
        VKApiExecutionException vKApiExecutionException2 = cause instanceof VKApiExecutionException ? (VKApiExecutionException) cause : null;
        if (vKApiExecutionException2 == null) {
            Throwable cause2 = th.getCause();
            Throwable cause3 = cause2 != null ? cause2.getCause() : null;
            if (cause3 instanceof VKApiExecutionException) {
                vKApiExecutionException = (VKApiExecutionException) cause3;
            }
        } else {
            vKApiExecutionException = vKApiExecutionException2;
        }
        return (vKApiExecutionException != null && vKApiExecutionException.X()) || (vKApiExecutionException != null && vKApiExecutionException.C() == 1173) || (vKApiExecutionException != null && vKApiExecutionException.C() == 1172);
    }

    public final io.reactivex.rxjava3.internal.operators.single.y c(long j) {
        return this.a.E(this, new gfb(Collections.singletonList(new Peer.Channel(j)), Source.ACTUAL, true, 8)).l(new ca6(new ba6(j, 0), 0));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y e(int i, long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        int i2 = 0;
        return this.a.E(this, new x4b(Peer.a.b(j), new rj30(MsgIdType.CNV_ID, i), false, 3, Source.ACTUAL, 32)).l(new z7(new da6(i, i2), 6)).l(new aa6(new z96(j, i), i2));
    }
}
