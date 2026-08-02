package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import xsna.oea0;

/* compiled from: PhotoTagsRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class cda0 implements bda0 {
    public final aha0 a;

    /* compiled from: PhotoTagsRepositoryImpl.kt */
    public static final class a {
        public final List<oea0.a> a;
        public final List<oea0.a> b;

        public a(List<oea0.a> list, List<oea0.a> list2) {
            this.a = list;
            this.b = list2;
        }
    }

    public cda0(aha0 aha0Var) {
        this.a = aha0Var;
    }

    public static List d(Set set, boolean z) {
        return rli0.A(new ulp0(rli0.j(new i5g(set), new ak30(z, 1)), new x8m(27)));
    }

    public static ArrayList e(List list) {
        List<oea0.a> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (oea0.a aVar : list2) {
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.a);
            sb.append('_');
            sb.append(aVar.b);
            sb.append('_');
            sb.append(aVar.c);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override // xsna.bda0
    public final io.reactivex.rxjava3.internal.operators.single.s a(Set set) {
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new gca(this, set)), new g7(new ebx(this, 15), 29));
    }

    @Override // xsna.bda0
    public final io.reactivex.rxjava3.internal.operators.single.s b(Set set) {
        return new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new gca(this, set)), new bj50(new xc50(this, 5), 4));
    }

    @Override // xsna.bda0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(int i, UserId userId, int i2) {
        r6m.a.getClass();
        return rsg0.T(new xea0(null, false, new yea0(R.string.user_photos_title, R.string.all_photos, r6m.k()), i, i2, 257)).U(new u730(new com.vk.movika.sdk.base.logic.processor.d(23, this, userId), 5));
    }
}
