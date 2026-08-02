package defpackage;

import androidx.media3.common.PriorityTaskManager;
import androidx.media3.datasource.FileDataSource;

/* loaded from: classes.dex */
public final class db7 implements ipg {
    public int A;
    public int B;
    public ra7 a;
    public gpg c;
    public boolean x;
    public ipg y;
    public PriorityTaskManager z;
    public FileDataSource.a b = new FileDataSource.a();
    public pb7 w = pb7.i1;

    @Override // defpackage.ipg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eb7 createDataSource() {
        ipg ipgVar = this.y;
        return c(ipgVar != null ? ipgVar.createDataSource() : null, this.B, this.A);
    }

    public final eb7 b() {
        ipg ipgVar = this.y;
        return c(ipgVar != null ? ipgVar.createDataSource() : null, this.B | 1, -4000);
    }

    public final eb7 c(kpg kpgVar, int i, int i2) {
        hpg hpgVar;
        ra7 ra7Var = this.a;
        ra7Var.getClass();
        if (this.x || kpgVar == null) {
            hpgVar = null;
        } else {
            gpg gpgVar = this.c;
            if (gpgVar != null) {
                hpgVar = gpgVar.c();
            } else {
                bb7 bb7Var = new bb7();
                bb7Var.a(ra7Var);
                hpgVar = bb7Var.c();
            }
        }
        return new eb7(ra7Var, kpgVar, this.b.createDataSource(), hpgVar, this.w, i, this.z, i2);
    }
}
