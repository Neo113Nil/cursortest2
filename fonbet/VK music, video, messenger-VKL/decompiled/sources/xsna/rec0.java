package xsna;

import android.content.Context;
import android.content.Intent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rec0 implements izs {
    public final /* synthetic */ boolean b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        l.getClass();
        if (l.longValue() != 0 && this.b) {
            Intent putExtra = new Intent("draft").putExtra("type", "draftAdded");
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            cuz.a(context).c(putExtra);
        }
        return s3q0.a;
    }
}
