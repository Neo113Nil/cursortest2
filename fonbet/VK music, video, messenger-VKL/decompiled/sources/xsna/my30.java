package xsna;

import android.content.Context;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.internal.api_commands.messages.b;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.exo.offline.OfflineRequirement;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class my30 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ my30(ny30 ny30Var, Ref$ObjectRef ref$ObjectRef, b.C1113b c1113b, w2w w2wVar, boolean z, Ref$BooleanRef ref$BooleanRef) {
        this.d = ny30Var;
        this.e = ref$ObjectRef;
        this.f = c1113b;
        this.g = w2wVar;
        this.c = z;
        this.h = ref$BooleanRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ny30 ny30Var = (ny30) this.d;
                long j = ny30Var.c;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                b.C1113b c1113b = (b.C1113b) this.f;
                w2w w2wVar = (w2w) this.g;
                boolean z = this.c;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.h;
                if (((xgl0) obj).o().p(ny30Var.d) == MsgSyncState.SENDING) {
                    T t = ref$ObjectRef.element;
                    ((MsgFromUser) t).d = c1113b.a;
                    xuo0.a.getClass();
                    ((MsgFromUser) t).g = xuo0.a();
                    T t2 = ref$ObjectRef.element;
                    ((MsgFromUser) t2).o = MsgSyncState.DONE;
                    new com.vk.im.engine.internal.merge.messages.b(ny30Var.n, (Msg) t2, false, false, 48).o(w2wVar);
                }
                if (z && q6x.w(w2wVar, j, (Msg) ref$ObjectRef.element)) {
                    q6x.F(w2wVar, j, (MsgFromUser) ref$ObjectRef.element);
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            default:
                ozs0 ozs0Var = (ozs0) this.d;
                ths0 ths0Var = (ths0) this.e;
                Context context = (Context) this.f;
                boolean z2 = this.c;
                gzs gzsVar = (gzs) this.g;
                z2d0 z2d0Var = (z2d0) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((j0t0) ozs0Var.a.getValue()).getClass();
                if (booleanValue) {
                    mm80 O = ozs0Var.O();
                    if (O != null) {
                        OfflineRequirement offlineRequirement = OfflineRequirement.NETWORK_UNMETERED;
                        synchronized (O) {
                            one.video.exo.offline.c e = O.e();
                            int i = e.c.p.c.b;
                            int i2 = (~offlineRequirement.i()) & i;
                            if (i != i2) {
                                e.d(i2);
                            }
                        }
                    }
                } else {
                    mm80 O2 = ozs0Var.O();
                    if (O2 != null) {
                        OfflineRequirement offlineRequirement2 = OfflineRequirement.NETWORK_UNMETERED;
                        synchronized (O2) {
                            one.video.exo.offline.c e2 = O2.e();
                            int i3 = e2.c.p.c.b;
                            int i4 = offlineRequirement2.i() | i3;
                            if (i3 != i4) {
                                e2.d(i4);
                            }
                        }
                    }
                }
                ozs0Var.w(ths0Var, context, z2, gzsVar, z2d0Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ my30(ozs0 ozs0Var, ths0 ths0Var, Context context, boolean z, gzs gzsVar, z2d0 z2d0Var) {
        this.d = ozs0Var;
        this.e = ths0Var;
        this.f = context;
        this.c = z;
        this.g = gzsVar;
        this.h = z2d0Var;
    }
}
