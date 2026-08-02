package xsna;

import android.os.SystemClock;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ykl implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ykl(long j, gzs gzsVar, wh50 wh50Var) {
        this.c = j;
        this.d = gzsVar;
        this.e = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                bll bllVar = (bll) this.d;
                Long l = (Long) this.e;
                StringBuilder sb = new StringBuilder("Posting picker attaching [");
                sb.append(bllVar.k);
                sb.append("]: (");
                sb.append(l);
                sb.append(", ");
                long j = this.c;
                sb.append(j);
                sb.append("), diff: ");
                return efz.b(j - l.longValue(), " ms", sb);
            default:
                gzs gzsVar = (gzs) this.d;
                wh50 wh50Var = (wh50) this.e;
                long uptimeMillis = SystemClock.uptimeMillis();
                if (uptimeMillis - ((Number) wh50Var.getValue()).longValue() > this.c) {
                    gzsVar.invoke();
                }
                wh50Var.setValue(Long.valueOf(uptimeMillis));
                return s3q0.a;
        }
    }

    public /* synthetic */ ykl(bll bllVar, Long l, long j) {
        this.d = bllVar;
        this.e = l;
        this.c = j;
    }
}
