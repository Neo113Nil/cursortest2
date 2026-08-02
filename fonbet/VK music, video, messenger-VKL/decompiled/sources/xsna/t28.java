package xsna;

import com.vk.dto.common.Peer;

/* compiled from: MsgBotBtnSendEventApiCmd.kt */
/* loaded from: classes2.dex */
public abstract class t28 {
    public final Peer a;
    public final String b;

    /* compiled from: MsgBotBtnSendEventApiCmd.kt */
    public static final class a extends t28 {
        public final Peer c;

        public a(Peer peer, String str, Peer peer2) {
            super(peer, str);
            this.c = peer2;
        }
    }

    /* compiled from: MsgBotBtnSendEventApiCmd.kt */
    public static final class b extends t28 {
        public final int c;

        public b(int i, Peer peer, String str) {
            super(peer, str);
            this.c = i;
        }
    }

    public t28(Peer peer, String str) {
        this.a = peer;
        this.b = str;
    }
}
