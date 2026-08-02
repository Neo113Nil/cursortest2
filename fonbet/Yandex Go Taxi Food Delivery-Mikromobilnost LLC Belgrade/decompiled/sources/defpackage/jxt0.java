package defpackage;

import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes11.dex */
public final class jxt0 extends q9h {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jxt0(int i, Class cls) {
        super(cls);
        this.c = i;
    }

    @Override // defpackage.q9h
    public final Date a(Date date) {
        switch (this.c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
