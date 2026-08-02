package xsna;

import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: CommunitySimilarSuggestionsStrategy.kt */
/* loaded from: classes5.dex */
public final class g2i {
    public final zqu a;
    public final String b;
    public final xe8 c = new xe8(2);

    public g2i(zqu zquVar, String str) {
        this.a = zquVar;
        this.b = str;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 a(UserId userId, String str, List list) {
        return rsg0.T(yfb.x(xqu.w(this.a, userId, 30, str, list, null, this.b, 16))).U(new z7(new fre(this, 12), 18));
    }
}
