package xsna;

/* compiled from: CycleDataSwitcher.kt */
/* loaded from: classes14.dex */
public final class xpk<Data, CompanionData> {
    public Data[] a;
    public CompanionData[] b;
    public final wzs<Data, CompanionData, s3q0> c;
    public int d = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public xpk(Data[] dataArr, CompanionData[] companiondataArr, wzs<? super Data, ? super CompanionData, s3q0> wzsVar) {
        this.a = dataArr;
        this.b = companiondataArr;
        this.c = wzsVar;
        if (companiondataArr != null && dataArr.length != companiondataArr.length) {
            throw new IllegalArgumentException("Arrays must have equal sizes");
        }
    }

    public final void a(int i) {
        this.d = i;
        wzs<Data, CompanionData, s3q0> wzsVar = this.c;
        if (wzsVar != null) {
            Data data = this.a[i];
            CompanionData[] companiondataArr = this.b;
            wzsVar.invoke(data, companiondataArr != null ? companiondataArr[i] : null);
        }
    }

    public final void b(Data data) {
        int U = rl3.U(data, this.a);
        if (U != -1) {
            a(U);
        }
    }
}
