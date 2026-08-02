package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fyb0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;

    public /* synthetic */ fyb0(long j, int i) {
        this.b = i;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hyb0 hyb0Var;
        switch (this.b) {
            case 0:
                long j = this.c;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM popup_stickers_chat_settings WHERE peerId = ?");
                boolean z = true;
                try {
                    V0.bindLong(1, j);
                    int k = egi.k(V0, "peerId");
                    int k2 = egi.k(V0, "animation_autoplay");
                    int k3 = egi.k(V0, "countOfInterruptClicks");
                    if (V0.step()) {
                        long j2 = V0.getLong(k);
                        if (((int) V0.getLong(k2)) == 0) {
                            z = false;
                        }
                        hyb0Var = new hyb0((int) V0.getLong(k3), j2, z);
                    } else {
                        hyb0Var = null;
                    }
                    return hyb0Var;
                } finally {
                    V0.close();
                }
            default:
                return ((kw8) obj).c(new kd3(this.c, 3));
        }
    }
}
