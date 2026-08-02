package defpackage;

import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzjd;
import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
public final class oca1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String w;
    public final /* synthetic */ zzjd x;

    public /* synthetic */ oca1(zzjd zzjdVar, String str, String str2, String str3, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.w = str3;
        this.x = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.w;
        String str2 = this.c;
        String str3 = this.b;
        zzjd zzjdVar = this.x;
        switch (i) {
            case 0:
                zzjdVar.zzL().w();
                b bVar = zzjdVar.zzL().c;
                n.O(bVar);
                return bVar.Ch(str3, str2, str);
            case 1:
                zzjdVar.zzL().w();
                b bVar2 = zzjdVar.zzL().c;
                n.O(bVar2);
                return bVar2.Ch(str3, str2, str);
            case 2:
                zzjdVar.zzL().w();
                b bVar3 = zzjdVar.zzL().c;
                n.O(bVar3);
                return bVar3.Gh(str3, str2, str);
            default:
                zzjdVar.zzL().w();
                b bVar4 = zzjdVar.zzL().c;
                n.O(bVar4);
                return bVar4.Gh(str3, str2, str);
        }
    }
}
