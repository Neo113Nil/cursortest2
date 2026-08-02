package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class nom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nom(long j, Object obj, int i) {
        this.b = i;
        this.c = j;
        this.d = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hpm hpmVar = (hpm) this.d;
                hpmVar.b.b().execSQL("\n                        UPDATE dialogs\n                        SET bar_exists = 0,\n                            bar_name = NULL, bar_title = NULL, bar_text = NULL,\n                            bar_icon = NULL, bar_buttons = NULL\n                        WHERE id = ?\n                        ", new Long[]{Long.valueOf(this.c)});
                return s3q0.a;
            default:
                io.reactivex.rxjava3.schedulers.b bVar = (io.reactivex.rxjava3.schedulers.b) obj;
                if (((Number) ((wh50) this.d).getValue()).intValue() == 1) {
                    return io.reactivex.rxjava3.core.q.T(bVar.a);
                }
                return io.reactivex.rxjava3.core.q.T(bVar.a).A(Math.max(0L, this.c - bVar.a()), TimeUnit.MILLISECONDS);
        }
    }
}
