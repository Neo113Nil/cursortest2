package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final /* synthetic */ class psz implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ psz(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        nsz nszVar;
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) obj3;
                String str = (String) obj;
                euz b = upx.a(context).b(context, (String) obj2, str);
                if (str != null && (nszVar = b.a) != null) {
                    osz.b.a.d(str, nszVar);
                }
                return b;
            case 1:
                return ssz.b((Context) obj3, (String) obj2, (String) obj);
            default:
                return ((tqh) obj3).a.submit(new zvg(15, (Callable) obj2, (zgf) obj));
        }
    }
}
