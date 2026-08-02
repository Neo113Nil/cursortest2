package xsna;

import com.vk.dto.common.Peer;

/* compiled from: TranslateMsgResultLpEvent.kt */
/* loaded from: classes2.dex */
public abstract class ynp0 implements e900 {
    public final Peer a;
    public final int b;

    /* compiled from: TranslateMsgResultLpEvent.kt */
    public static final class a extends ynp0 {
        public final int c;

        public a(int i, int i2, Peer peer) {
            super(i, peer);
            this.c = i2;
        }
    }

    /* compiled from: TranslateMsgResultLpEvent.kt */
    public static final class b extends ynp0 {
        public final String c;
        public final String d;
        public final String e;

        public b(Peer peer, int i, String str, String str2, String str3) {
            super(i, peer);
            this.c = str;
            this.d = str2;
            this.e = str3;
        }
    }

    public ynp0(int i, Peer peer) {
        this.a = peer;
        this.b = i;
    }
}
