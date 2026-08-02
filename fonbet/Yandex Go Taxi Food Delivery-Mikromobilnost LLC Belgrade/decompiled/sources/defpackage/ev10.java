package defpackage;

/* loaded from: classes15.dex */
public final class ev10 extends fv10 {
    public final /* synthetic */ int c;

    public /* synthetic */ ev10(int i) {
        this.c = i;
    }

    @Override // defpackage.fv10
    public final int a(j3b j3bVar, k020 k020Var) {
        switch (this.c) {
            case 0:
                return -1;
            case 1:
                Integer num = j3bVar.g;
                if (num == null) {
                    return -1;
                }
                return num.intValue();
            default:
                return 0;
        }
    }
}
