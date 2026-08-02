package xsna;

import com.vk.log.L;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.rq4;
import xsna.uv4;

/* compiled from: AudioMessageRecordingViewModel.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class sq4 extends FunctionReferenceImpl implements izs<uv4.b, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(uv4.b bVar) {
        uv4.b bVar2 = bVar;
        rq4 rq4Var = (rq4) this.receiver;
        rq4 rq4Var2 = rq4.a;
        rq4Var.getClass();
        L.A(rq4.b, "onRecordingCompleted with result = " + bVar2);
        rq4.h();
        rq4.k = false;
        rq4.p = bVar2;
        if (!bVar2.h) {
            if (bVar2.c) {
                rq4.b();
            } else if (!rq4.f) {
                rq4.f = true;
                ysg0.b.a(new rq4.a());
            }
        }
        return s3q0.a;
    }
}
