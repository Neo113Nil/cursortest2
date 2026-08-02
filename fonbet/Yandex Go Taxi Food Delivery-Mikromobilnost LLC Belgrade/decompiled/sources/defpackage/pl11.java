package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public class pl11 extends nl11 {
    @Override // defpackage.nl11
    public final Object read(wdx wdxVar) {
        return new AtomicBoolean(wdxVar.nextBoolean());
    }

    @Override // defpackage.nl11
    public final void write(afx afxVar, Object obj) {
        afxVar.Z(((AtomicBoolean) obj).get());
    }
}
