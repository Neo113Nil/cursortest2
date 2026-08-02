package defpackage;

/* loaded from: classes4.dex */
public final class crm extends erm {
    public final ldc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crm(String str, ldc ldcVar, int i, int i2) {
        super(new kk2(str), 2);
        switch (i2) {
            case 1:
                int i3 = (i & 2) == 0 ? 1 : 2;
                ldcVar = (i & 8) != 0 ? null : ldcVar;
                super(new kk2(str), i3);
                this.c = ldcVar;
                break;
            default:
                ldcVar = (i & 8) != 0 ? null : ldcVar;
                this.c = ldcVar;
                break;
        }
    }
}
