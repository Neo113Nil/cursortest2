package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p27 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            default:
                UserId b = ((oju) ((awd0) obj)).b();
                return !fkq0.b(b) ? fkq0.e(b) : b;
        }
    }
}
