package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;

/* compiled from: TranslateMessageApiCmd.kt */
/* loaded from: classes2.dex */
public final class vnp0 extends nx2<a> {
    public final Peer b;
    public final int c;
    public final String d;

    /* compiled from: TranslateMessageApiCmd.kt */
    public static abstract class a {

        /* compiled from: TranslateMessageApiCmd.kt */
        /* renamed from: xsna.vnp0$a$a, reason: collision with other inner class name */
        public static final class C3897a extends a {
            public final int a;

            public C3897a(int i) {
                this.a = i;
            }
        }

        /* compiled from: TranslateMessageApiCmd.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public vnp0(int i, Peer peer, String str) {
        this.b = peer;
        this.c = i;
        this.d = str;
    }

    @Override // xsna.nx2
    public final a f(l7r0 l7r0Var) {
        try {
            UserId b = com.vk.dto.common.a.b(this.b);
            List singletonList = Collections.singletonList(Integer.valueOf(this.c));
            String str = this.d;
            tfx tfxVar = new tfx("messages.translate", new gq(27), new hq(23));
            tfx.n(tfxVar, "peer_id", b, 0L, 0L, 12);
            tfxVar.i("cmids", singletonList);
            tfx.o(tfxVar, "language", str, 0, 0, 12);
            bz2.l(tfxVar, true);
            return a.b.a;
        } catch (VKApiExecutionException e) {
            return new a.C3897a(e.s());
        }
    }
}
