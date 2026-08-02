package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class l260 extends dcx {
    public static final l260 d = new l260(qoi0.a(k260.class));

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
        if (hashCode != 69617) {
            if (hashCode != 69621) {
                if (hashCode == 2157955 && str.equals("FILL")) {
                    return du50.Companion.serializer();
                }
            } else if (str.equals("FIX")) {
                return ju50.Companion.serializer();
            }
        } else if (str.equals("FIT")) {
            return gu50.Companion.serializer();
        }
        w511.j("Can't find discriminator=", str, " for NetworkWidthTypeModel");
        return null;
    }
}
