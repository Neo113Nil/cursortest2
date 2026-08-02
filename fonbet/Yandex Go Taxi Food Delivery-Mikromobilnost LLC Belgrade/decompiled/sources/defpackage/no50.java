package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class no50 extends dcx {
    public static final no50 d = new no50(qoi0.a(mo50.class));

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
        if (hashCode != -1025483274) {
            if (hashCode != 455757578) {
                if (hashCode == 995110224 && str.equals("RADIAL_GRADIENT")) {
                    return dz50.Companion.serializer();
                }
            } else if (str.equals("LINEAR_GRADIENT")) {
                return kw50.Companion.serializer();
            }
        } else if (str.equals("TRANSPARENT_COLOR")) {
            return w160.Companion.serializer();
        }
        w511.j("Can't find discriminator=", str, " for NetworkBackgroundColorModel");
        return null;
    }
}
