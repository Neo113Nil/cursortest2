package xsna;

import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;

/* compiled from: MessagesListViewEvent.kt */
/* loaded from: classes16.dex */
public abstract class dg20 {

    /* compiled from: MessagesListViewEvent.kt */
    public static final class a extends dg20 {
        public final Attach a;
        public final Msg b;
        public final NestedMsg c;

        public a(Attach attach, Msg msg, NestedMsg nestedMsg) {
            this.a = attach;
            this.b = msg;
            this.c = nestedMsg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class b extends dg20 {
        public final Attach a;
        public final Msg b;
        public final NestedMsg c;

        public b(Attach attach, Msg msg, NestedMsg nestedMsg) {
            this.a = attach;
            this.b = msg;
            this.c = nestedMsg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class c extends dg20 {
        public final Attach a;
        public final Msg b;

        public c(Attach attach, Msg msg, NestedMsg nestedMsg) {
            this.a = attach;
            this.b = msg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class d extends dg20 {
        public final Attach a;

        public d(Attach attach) {
            this.a = attach;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class e extends dg20 {
        public final Throwable a;

        public e(Throwable th) {
            this.a = th;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class f extends dg20 {
        public final Peer a;

        public f(Peer peer) {
            this.a = peer;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class g extends dg20 {
        public final Msg a;

        public g(Msg msg) {
            this.a = msg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class h extends dg20 {
        public final Msg a;

        public h(Msg msg) {
            this.a = msg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class i extends dg20 {
        public final Msg a;

        public i(Msg msg) {
            this.a = msg;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class j extends dg20 {
        public final uh30 a;

        public j(uh30 uh30Var) {
            this.a = uh30Var;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class k extends dg20 {
        public final boolean a;
        public final boolean b = true;
        public final String c;

        public k(boolean z, String str) {
            this.a = z;
            this.c = str;
        }
    }

    /* compiled from: MessagesListViewEvent.kt */
    public static final class l extends dg20 {
        public final MsgIdType a;
        public final int b;
        public final boolean c;
        public final String d;

        public l(MsgIdType msgIdType, int i, boolean z, String str) {
            this.a = msgIdType;
            this.b = i;
            this.c = z;
            this.d = str;
        }
    }
}
