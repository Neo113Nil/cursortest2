package defpackage;

import com.yandex.go.loyalty.impl.selector.domain.model.LoyaltyProgramState;

/* loaded from: classes.dex */
public final class lvz {
    public static evz a(dvz dvzVar, mxz mxzVar) {
        String b = dvzVar.b();
        if (jl40.l(b, "plus")) {
            return new t5d0(mxzVar.e(), dvzVar.c() == LoyaltyProgramState.ENABLED, dvzVar.b(), dvzVar.a(), mxzVar.a(), mxzVar.c(), mxzVar.b());
        }
        if (jl40.l(b, "birbonus")) {
            return new tz5(mxzVar.e(), dvzVar.c() == LoyaltyProgramState.ENABLED, dvzVar.b(), dvzVar.a(), mxzVar.a(), mxzVar.c(), mxzVar.b());
        }
        return null;
    }
}
