package xsna;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: MultiAccountInfoUpdater.kt */
/* loaded from: classes11.dex */
public final class m240 implements g320, j601 {
    public final Object b;

    public m240(epf epfVar) {
        this.b = epfVar;
    }

    @Override // xsna.g320
    public void a(f320 f320Var) {
        ((CopyOnWriteArraySet) this.b).add(f320Var);
    }

    @Override // xsna.j601
    public Object zza() {
        Context context = ((yuz0) ((epf) this.b).b).a;
        return new x201(context, context.getPackageName());
    }

    public m240(int i) {
        switch (i) {
            case 1:
                this.b = new CopyOnWriteArraySet();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }
}
