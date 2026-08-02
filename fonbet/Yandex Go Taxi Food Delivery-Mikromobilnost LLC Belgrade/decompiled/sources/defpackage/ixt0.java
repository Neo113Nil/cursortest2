package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes11.dex */
public final class ixt0 extends nl11 {
    public static final hxt0 b = new hxt0();
    public final nl11 a;

    public ixt0(nl11 nl11Var) {
        this.a = nl11Var;
    }

    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        Date date = (Date) this.a.read(wdxVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        this.a.write(afxVar, (Timestamp) obj);
    }
}
