package xsna;

import com.vk.instantjobs.InstantJob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class v6x implements izs {
    public final /* synthetic */ long b;

    public /* synthetic */ v6x(long j) {
        this.b = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        InstantJob instantJob = (InstantJob) obj;
        boolean z = instantJob instanceof ny30;
        long j = this.b;
        return Boolean.valueOf((z && (((ny30) instantJob).c > j ? 1 : (((ny30) instantJob).c == j ? 0 : -1)) == 0) || ((instantJob instanceof zy30) && (((zy30) instantJob).c > j ? 1 : (((zy30) instantJob).c == j ? 0 : -1)) == 0));
    }
}
