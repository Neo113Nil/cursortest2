package xsna;

import com.vk.dto.common.Peer;

/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public abstract class pq8 {
    public final int a;

    /* compiled from: BotKeyboard.kt */
    public static final class a extends c {
        public final int d;

        public a(int i, int i2, int i3, Peer peer) {
            super(i, i3, peer);
            this.d = i2;
        }

        @Override // xsna.pq8.c, xsna.pq8
        public final int a() {
            return 1;
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class b extends pq8 {
        public final Peer b;

        public b(int i, Peer peer) {
            super(i);
            this.b = peer;
        }

        @Override // xsna.pq8
        public final int a() {
            return 2;
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static class c extends pq8 {
        public final Peer b;
        public final int c;

        public c(int i, int i2, Peer peer) {
            super(i2);
            this.b = peer;
            this.c = i;
        }

        @Override // xsna.pq8
        public int a() {
            return 0;
        }
    }

    public pq8(int i) {
        this.a = i;
    }

    public abstract int a();
}
