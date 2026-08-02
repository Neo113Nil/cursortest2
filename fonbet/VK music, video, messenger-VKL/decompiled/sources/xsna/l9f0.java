package xsna;

import androidx.room.RoomDatabase;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RecentGifsDao_Impl.kt */
/* loaded from: classes2.dex */
public final class l9f0 implements k9f0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: RecentGifsDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            String str;
            j9f0 j9f0Var = (j9f0) obj;
            qyg0Var.D3(1, j9f0Var.a);
            Image image = j9f0Var.b;
            if (image == null || (str = image.Gb().toString()) == null) {
                str = "";
            }
            qyg0Var.D3(2, str);
            String str2 = j9f0Var.c;
            if (str2 == null) {
                qyg0Var.bindNull(3);
            } else {
                qyg0Var.D3(3, str2);
            }
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `recent_gif` (`id`,`image`,`preview`) VALUES (?,?,?)";
        }
    }

    public l9f0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public static s3q0 d(l9f0 l9f0Var, ArrayList arrayList) {
        super.c(arrayList);
        return s3q0.a;
    }

    @Override // xsna.k9f0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new q7a0(4, this, arrayList));
    }

    @Override // xsna.k9f0
    public final void b() {
        u370.f(this.a, false, true, new n9w(19));
    }

    @Override // xsna.k9f0
    public final void c(ArrayList arrayList) {
        u370.f(this.a, false, true, new yu1(24, this, arrayList));
    }

    @Override // xsna.k9f0
    public final List<j9f0> getAll() {
        return (List) u370.f(this.a, true, false, new kl60(14));
    }
}
