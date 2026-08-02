package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class er50 extends dcx {
    public static final er50 d = new er50(qoi0.a(dr50.class));

    @Override // defpackage.dcx
    public final myi c(b bVar) {
        Object failure;
        try {
            b bVar2 = (b) qcx.m(bVar).get("type");
            failure = bVar2 != null ? qcx.n(bVar2).a() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Result.a(failure) != null) {
            yhl.d(bVar, "Invalid discriminator for element=");
            return null;
        }
        String str = (String) failure;
        if (str.equals("FIX")) {
            return yq50.Companion.serializer();
        }
        if (str.equals("HALF")) {
            return br50.Companion.serializer();
        }
        w511.j("Can't find discriminator=", str, " for NetworkCornerModel");
        return null;
    }
}
