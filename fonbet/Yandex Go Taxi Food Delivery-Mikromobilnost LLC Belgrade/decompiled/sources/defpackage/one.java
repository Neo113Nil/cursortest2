package defpackage;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.k2;
import java.util.LinkedHashMap;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class one {
    public final PassportUidImpl a;
    public final LinkedHashMap b = new LinkedHashMap();

    public one(PassportUidImpl passportUidImpl) {
        this.a = passportUidImpl;
    }

    public final nne a(String str) {
        String X = a.X(a.B0(2, evu0.Y(str, new char[]{'.'}, 0, 6)), Extension.DOT_CHAR, null, null, null, 62);
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(X);
        if (obj == null) {
            obj = new nne();
            linkedHashMap.put(X, obj);
        }
        return (nne) obj;
    }

    public final k2 b() {
        return this.a;
    }
}
