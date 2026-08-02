package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.gm50;
import xsna.i1j;
import xsna.m1j;

/* compiled from: ConfigureRoomParticipantsDialog.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class m0j extends FunctionReferenceImpl implements izs<m1j.e, s3q0> {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(m1j.e eVar) {
        m1j.e eVar2 = eVar;
        i1j i1jVar = (i1j) this.receiver;
        i1jVar.getClass();
        i1jVar.b(i1j.a.READY);
        gm50.a.a(i1jVar, eVar2.e, new j1j(1, i1jVar, i1j.class, "renderError", "renderError(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$Ready$Error;)V", 0));
        gm50.a.a(i1jVar, eVar2.d, new k1j(1, i1jVar, i1j.class, "renderMoveRequest", "renderMoveRequest(Lcom/vk/voip/ui/sessionrooms/dialog/admin/participants/feature/ConfigureRoomParticipantsViewState$Ready$MoveRequest;)V", 0));
        bwt0.p0((View) i1jVar.f.getValue(), false);
        bwt0.p0((View) i1jVar.g.getValue(), false);
        bwt0.p0(i1jVar.a(), true);
        gm50.a.a(i1jVar, eVar2.c, new w5(i1jVar, 27));
        gm50.a.a(i1jVar, eVar2.a, new dhh(i1jVar, 3));
        gm50.a.a(i1jVar, eVar2.b, new z8f(i1jVar, 7));
        return s3q0.a;
    }
}
