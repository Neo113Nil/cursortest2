package xsna;

import com.vk.im.engine.ImEnvironmentNotReadyException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mrs;

/* compiled from: UsersOnlineSyncManager.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class k1r0 extends FunctionReferenceImpl implements izs<mrs.a, s3q0> {
    public k1r0(Object obj) {
        super(1, obj, l1r0.class, "doOnEvent", "doOnEvent(Lcom/vk/queue/events/FriendsOnlineChangeQueueEvent$Info;)V", 0);
    }

    @Override // xsna.izs
    public final s3q0 invoke(mrs.a aVar) {
        mrs.a aVar2 = aVar;
        w2w w2wVar = ((l1r0) this.receiver).a;
        try {
            w2wVar.I0().d().d(aVar2.a, aVar2.b, w2wVar.f1());
            w2wVar.S0().R(aVar2.a);
        } catch (ImEnvironmentNotReadyException unused) {
        } catch (InterruptedException e) {
            throw e;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(th);
        }
        return s3q0.a;
    }
}
