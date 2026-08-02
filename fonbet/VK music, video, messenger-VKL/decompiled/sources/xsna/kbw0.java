package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: VmojiStorageImpl.kt */
/* loaded from: classes7.dex */
public final class kbw0 implements gbw0 {
    public final y5w0 a;

    public kbw0(Context context) {
        this.a = new y5w0(new dv3(context));
    }

    @Override // xsna.gbw0
    public final Map<UserId, w5w0> a(List<UserId> list, b6w0 b6w0Var) {
        if (b6w0Var == null) {
            b6w0Var = new mrl();
        }
        Map<UserId, x5w0> a = b6w0Var.a(list);
        y5w0 y5w0Var = this.a;
        y5w0Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<UserId, x5w0> entry : a.entrySet()) {
            UserId key = entry.getKey();
            x5w0 value = entry.getValue();
            arrayList.add(new Pair(key, new a6w0(y5w0Var.a, key, value.a, value.b, value.c)));
        }
        return pn00.s(arrayList);
    }
}
