package defpackage;

import com.yandex.go.deeplinks.generated.scooters.ScootersUpdateUserPdDataSection;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class i6p0 {
    public static ScootersUpdateUserPdDataSection a(String str) {
        Object obj;
        Iterator<E> it = ScootersUpdateUserPdDataSection.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvu0.t(((ScootersUpdateUserPdDataSection) obj).getValue(), str, true)) {
                break;
            }
        }
        return (ScootersUpdateUserPdDataSection) obj;
    }
}
