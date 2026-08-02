package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.Image;
import java.util.ArrayList;

/* compiled from: AudioRestrictionDao_Impl.kt */
/* loaded from: classes.dex */
public final class iw4 implements gw4 {
    public final RoomDatabase a;
    public final a b = new a(this);

    /* compiled from: AudioRestrictionDao_Impl.kt */
    /* loaded from: classes3.dex */
    public static final class a extends fqa {
        public a(iw4 iw4Var) {
        }

        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            kw4 kw4Var = (kw4) obj;
            qyg0Var.bindLong(1, kw4Var.a);
            qyg0Var.D3(2, kw4Var.b);
            qyg0Var.D3(3, kw4Var.c);
            Image image = kw4Var.d;
            if (image == null || (str = image.Gb().toString()) == null) {
                str = "";
            }
            qyg0Var.D3(4, str);
            String str2 = kw4Var.e;
            if (str2 == null) {
                qyg0Var.bindNull(5);
            } else {
                qyg0Var.D3(5, str2);
            }
            String str3 = kw4Var.f;
            if (str3 == null) {
                qyg0Var.bindNull(6);
            } else {
                qyg0Var.D3(6, str3);
            }
            String str4 = kw4Var.g;
            if (str4 == null) {
                qyg0Var.bindNull(7);
            } else {
                qyg0Var.D3(7, str4);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `audio_restriction` (`id`,`title`,`description`,`image`,`button_title`,`button_url`,`button_type`) VALUES (?,?,?,?,?,?,?)";
        }
    }

    public iw4(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    @Override // xsna.gw4
    public final io.reactivex.rxjava3.internal.operators.completable.e a(ArrayList arrayList) {
        return mvg0.a(this.a, new com.vk.libvideo.b(3, this, arrayList));
    }

    @Override // xsna.gw4
    public final io.reactivex.rxjava3.internal.operators.maybe.c b(final int i) {
        return mvg0.b(this.a, new izs(i, this) { // from class: xsna.hw4
            public final /* synthetic */ int b;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v0, types: [xsna.kw4] */
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int i2 = this.b;
                qyg0 V0 = ((hyg0) obj).V0("SELECT * FROM audio_restriction WHERE id = ?");
                try {
                    V0.bindLong(1, i2);
                    int k = egi.k(V0, "id");
                    int k2 = egi.k(V0, "title");
                    int k3 = egi.k(V0, "description");
                    int k4 = egi.k(V0, "image");
                    int k5 = egi.k(V0, "button_title");
                    int k6 = egi.k(V0, "button_url");
                    int k7 = egi.k(V0, "button_type");
                    if (V0.step()) {
                        r10 = new kw4(V0.l2(k2), V0.l2(k3), V0.isNull(k5) ? null : V0.l2(k5), V0.isNull(k6) ? null : V0.l2(k6), (int) V0.getLong(k), yfb.g(V0.isNull(k4) ? null : V0.l2(k4)), V0.isNull(k7) ? null : V0.l2(k7));
                    }
                    return r10;
                } finally {
                    V0.close();
                }
            }
        });
    }
}
