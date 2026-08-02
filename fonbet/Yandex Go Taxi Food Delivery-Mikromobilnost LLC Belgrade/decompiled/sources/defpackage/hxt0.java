package defpackage;

import com.google.gson.reflect.TypeToken;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes11.dex */
public class hxt0 implements ol11 {
    @Override // defpackage.ol11
    public final nl11 create(u3u u3uVar, TypeToken typeToken) {
        if (typeToken.getRawType() == Timestamp.class) {
            return new ixt0(u3uVar.f(Date.class));
        }
        return null;
    }
}
