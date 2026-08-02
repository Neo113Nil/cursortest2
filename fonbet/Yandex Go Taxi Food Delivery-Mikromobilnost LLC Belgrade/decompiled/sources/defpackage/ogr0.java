package defpackage;

/* loaded from: classes11.dex */
public final class ogr0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb2 b;
    public final /* synthetic */ m3u0 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ igr0 x;
    public final /* synthetic */ eb2 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ogr0(eb2 eb2Var, m3u0 m3u0Var, long j, igr0 igr0Var, Object obj, eb2 eb2Var2, int i) {
        this.a = i;
        this.b = eb2Var;
        this.c = m3u0Var;
        this.w = j;
        this.x = igr0Var;
        this.z = obj;
        this.y = eb2Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        qam qamVar;
        int i = this.a;
        eb2 eb2Var = this.y;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.z;
        m3u0 m3u0Var = this.c;
        eb2 eb2Var2 = this.b;
        igr0 igr0Var = this.x;
        switch (i) {
            case 0:
                qamVar = (qam) obj;
                long j = this.w;
                if (m3u0Var != null) {
                    j = ldc.b(j, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j), 0.0f, 0.0f, 0.0f, 14);
                }
                eb2Var2.f(j);
                igr0Var.getClass();
                ((cot) qamVar.N().a).n(qamVar.w0(0.0f), qamVar.w0(igr0Var.c));
                try {
                    i28 q = qamVar.N().q();
                    zii0 zii0Var = ((gx80) obj2).a;
                    q.i(zii0Var.a, zii0Var.b, zii0Var.c, zii0Var.d, this.y);
                    return zy11Var;
                } finally {
                }
            case 1:
                qamVar = (qam) obj;
                sxk0 sxk0Var = (sxk0) obj2;
                long j2 = this.w;
                if (m3u0Var != null) {
                    j2 = ldc.b(j2, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j2), 0.0f, 0.0f, 0.0f, 14);
                }
                eb2Var2.f(j2);
                igr0Var.getClass();
                ((cot) qamVar.N().a).n(qamVar.w0(0.0f), qamVar.w0(igr0Var.c));
                try {
                    i28 q2 = qamVar.N().q();
                    float intBitsToFloat = Float.intBitsToFloat((int) (sxk0Var.h >> 32));
                    q2.e(sxk0Var.a, sxk0Var.b, sxk0Var.c, sxk0Var.d, intBitsToFloat, intBitsToFloat, this.y);
                    return zy11Var;
                } finally {
                }
            case 2:
                qamVar = (qam) obj;
                long j3 = this.w;
                if (m3u0Var != null) {
                    j3 = ldc.b(j3, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j3), 0.0f, 0.0f, 0.0f, 14);
                }
                eb2Var2.f(j3);
                igr0Var.getClass();
                ((cot) qamVar.N().a).n(qamVar.w0(0.0f), qamVar.w0(igr0Var.c));
                try {
                    qamVar.N().q().p((jb2) obj2, eb2Var);
                    return zy11Var;
                } finally {
                }
            default:
                qamVar = (qam) obj;
                long j4 = this.w;
                if (m3u0Var != null) {
                    j4 = ldc.b(j4, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j4), 0.0f, 0.0f, 0.0f, 14);
                }
                eb2Var2.f(j4);
                igr0Var.getClass();
                ((cot) qamVar.N().a).n(qamVar.w0(0.0f), qamVar.w0(igr0Var.c));
                try {
                    qamVar.N().q().p(((fx80) obj2).a, eb2Var);
                    return zy11Var;
                } finally {
                }
        }
    }
}
