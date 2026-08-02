package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.Date;

/* loaded from: classes11.dex */
public class o9h implements ol11 {
    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        if (typeToken.getRawType() == Date.class) {
            return new r9h(q9h.b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
