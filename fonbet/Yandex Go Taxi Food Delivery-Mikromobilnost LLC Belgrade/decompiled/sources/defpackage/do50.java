package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class do50 extends dcx {
    public static final do50 d = new do50(qoi0.a(co50.class));

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
        int hashCode = str.hashCode();
        if (hashCode != -1984573540) {
            if (hashCode != 1143313449) {
                if (hashCode == 1411860198 && str.equals("DEEPLINK")) {
                    return mr50.Companion.serializer();
                }
            } else if (str.equals("JUST_INTERACT")) {
                return dw50.Companion.serializer();
            }
        } else if (str.equals("SERVICE_SPECIFIC")) {
            return k060.Companion.serializer();
        }
        w511.j("Can't find discriminator=", str, " for NetworkActionModel");
        return null;
    }
}
