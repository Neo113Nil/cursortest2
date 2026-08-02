package xsna;

import androidx.room.RoomDatabase;

/* compiled from: AudioReactionsConfigDao_Impl.kt */
/* loaded from: classes.dex */
public final class yt4 implements xt4 {
    public final RoomDatabase a;
    public final a b;

    /* compiled from: AudioReactionsConfigDao_Impl.kt */
    /* loaded from: classes3.dex */
    public static final class a extends fqa {
        public a(yt4 yt4Var) {
        }

        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            ut4 ut4Var = (ut4) obj;
            qyg0Var.D3(1, ut4Var.a);
            qyg0Var.D3(2, ut4Var.b);
            String jSONArray = kvf.a(ut4Var.c).toString();
            if (jSONArray == null) {
                qyg0Var.bindNull(3);
            } else {
                qyg0Var.D3(3, jSONArray);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_reaction` (`title`,`subtitle`,`reactions`) VALUES (?,?,?)";
        }
    }

    public yt4(RoomDatabase roomDatabase) {
        new sp(9);
        this.a = roomDatabase;
        this.b = new a(this);
    }

    @Override // xsna.xt4
    public final io.reactivex.rxjava3.internal.operators.completable.e b() {
        return mvg0.a(this.a, new nt(5));
    }

    @Override // xsna.xt4
    public final io.reactivex.rxjava3.internal.operators.maybe.c c() {
        return mvg0.b(this.a, new db(this, 10));
    }

    @Override // xsna.xt4
    public final io.reactivex.rxjava3.internal.operators.completable.e d(ut4 ut4Var) {
        return mvg0.a(this.a, new uf1(7, this, ut4Var));
    }
}
