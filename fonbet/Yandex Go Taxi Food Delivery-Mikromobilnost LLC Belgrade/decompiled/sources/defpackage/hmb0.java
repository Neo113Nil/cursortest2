package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes9.dex */
public final class hmb0 {
    public final Context a;
    public final k7x0 b;
    public final pav c;
    public final mzz d = new mzz(2);
    public qxy e;

    public hmb0(pav pavVar, k7x0 k7x0Var, Context context) {
        this.a = context;
        this.b = k7x0Var;
        this.c = pavVar;
    }

    public final qxy a() {
        qxy qxyVar = this.e;
        if (qxyVar != null) {
            return qxyVar;
        }
        qxy b = gfb1.b(new ob0(7, this));
        this.e = b;
        return b;
    }

    public final List b(qxy qxyVar) {
        String id = qxyVar.getId();
        mzz mzzVar = this.d;
        List list = (List) mzzVar.c(id);
        if (list != null) {
            return list;
        }
        ListBuilder listBuilder = new ListBuilder(5);
        float[] fArr = new float[5];
        for (int i = 0; i < 5; i++) {
            fArr[i] = (8 + i) / 12.0f;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            listBuilder.add(new u3c0(qxyVar, new ewi(fArr[i2], false)));
        }
        ListBuilder j = listBuilder.j();
        mzzVar.d(qxyVar.getId(), j);
        return j;
    }
}
