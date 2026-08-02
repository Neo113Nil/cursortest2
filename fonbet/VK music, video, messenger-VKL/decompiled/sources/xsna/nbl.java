package xsna;

import com.vk.profile.design.compose.header.a;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.e95;
import xsna.kja0;
import xsna.ma5;
import xsna.wkj;

/* compiled from: DefaultAvatarSlotImpl.kt */
/* loaded from: classes5.dex */
public final class nbl implements e95.a {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;

    public nbl(a.C1660a c1660a, la5 la5Var, ka5 ka5Var, lja0 lja0Var, float f) {
        this.a = androidx.compose.runtime.k.b(c1660a);
        this.b = androidx.compose.runtime.k.b(la5Var);
        this.c = androidx.compose.runtime.k.b(ka5Var);
        this.d = androidx.compose.runtime.k.b(lja0Var);
        this.e = cq.f(f);
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 lg90Var;
        androidx.compose.runtime.a M = aVar.M(-20195215);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-20195215, i2, -1, "com.vk.profile.design.compose.header.header.DefaultAvatarSlotImpl.Content (DefaultAvatarSlotImpl.kt:38)");
            }
            boolean booleanValue = ((Boolean) M.r(c5x.a)).booleanValue();
            izs izsVar = (izs) M.r(h85.a);
            List list = ((a.C1660a) ((zak0) this.a).getValue()).a;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            Iterator it = list.iterator();
            while (true) {
                lg90Var = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                arrayList.add(new ma5.a(str, str, null, false));
            }
            eb5 eb5Var = new eb5((la5) ((zak0) this.b).getValue(), (ka5) ((zak0) this.c).getValue());
            fb5 fb5Var = new fb5(((pco) ((zak0) this.e).getValue()).b, wkj.a.c, (lja0) ((zak0) this.d).getValue(), kja0.a.a, false, null, false, false);
            if (booleanValue) {
                lg90Var = or.b(M, -339376836, R.drawable.vk_icon_illustration_placeholder_kid_llama_ny_h150, M, 0);
            } else {
                M.K(-339257331);
                M.j();
            }
            xa5.b(arrayList, eb5Var, fb5Var, izsVar, q630Var, lg90Var, null, M, ((i2 << 12) & 57344) | SQLiteDatabase.OPEN_PRIVATECACHE, 64);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c8k(this, q630Var, i, 1);
        }
    }
}
