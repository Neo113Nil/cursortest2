package defpackage;

import android.content.Context;
import com.ybsdk.core.transfer.utils.domain.a;

/* loaded from: classes3.dex */
public final class np6 implements v7p {
    public final /* synthetic */ int a;
    public final qbg b;

    public /* synthetic */ np6(qbg qbgVar, int i) {
        this.a = i;
        this.b = qbgVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        qbg qbgVar = this.b;
        switch (i) {
            case 0:
                return new mp6((Context) qbgVar.get());
            case 1:
                return new cbs((Context) qbgVar.get());
            case 2:
                return new ktw((Context) qbgVar.get());
            case 3:
                return new jk01((Context) qbgVar.get());
            case 4:
                return new pm01((Context) qbgVar.get());
            case 5:
                qbgVar.get();
                return new br01();
            default:
                return new a((Context) qbgVar.get());
        }
    }
}
