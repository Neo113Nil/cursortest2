package xsna;

import android.database.Cursor;
import com.vk.api.sdk.auth.UtilityTokens;
import java.util.ArrayList;
import xsna.usi0;

/* compiled from: SessionsDatabaseExtractor.kt */
@ozl
/* loaded from: classes11.dex */
public final class xxi0 {
    public final lxi0 a;
    public final b61 b;
    public final mxi0 c;

    public xxi0(lxi0 lxi0Var, b61 b61Var, mxi0 mxi0Var) {
        this.a = lxi0Var;
        this.b = b61Var;
        this.c = mxi0Var;
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Cursor query = this.a.getReadableDatabase().query("sessions_authorized", null, null, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                vj c = fn00.c(query);
                fhq0 d = fn00.d(query);
                UtilityTokens.CREATOR.getClass();
                UtilityTokens utilityTokens = UtilityTokens.c;
                usi0.a aVar = new usi0.a(c, d, utilityTokens);
                byte[] d2 = this.b.d(fn00.a(aVar), c4g0.F(c.e()));
                arrayList.add(aVar.b(vj.b(c, d2 != null ? new String(d2, emb.b) : c.e()), utilityTokens));
            } finally {
            }
        }
        s3q0 s3q0Var = s3q0.a;
        query.close();
        return arrayList;
    }
}
