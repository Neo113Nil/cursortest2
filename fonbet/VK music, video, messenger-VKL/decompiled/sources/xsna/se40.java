package xsna;

import com.vk.dto.music.Thumb;
import java.util.List;

/* compiled from: MusicCategoryOfflineDataProviderImpl.kt */
/* loaded from: classes16.dex */
public final class se40 implements izs<Object[], tt70> {
    public static final se40 b = new se40();

    @Override // xsna.izs
    public final tt70 invoke(Object[] objArr) {
        tt70 tt70Var = new tt70(7, 0L, (List) null);
        for (Object obj : objArr) {
            if (obj instanceof tt70) {
                tt70 tt70Var2 = (tt70) obj;
                List<Thumb> list = tt70Var.b;
                if (list.size() != 2) {
                    list = j5g.H0(j5g.u0(tt70Var2.b, list), 2);
                }
                tt70Var = new tt70(tt70Var.c | tt70Var2.c, tt70Var.a + tt70Var2.a, list);
            }
        }
        return tt70Var;
    }
}
