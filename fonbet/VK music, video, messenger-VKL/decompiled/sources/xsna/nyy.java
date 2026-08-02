package xsna;

import android.util.ArraySet;
import com.vk.dto.user.Platform;
import com.vk.log.L;
import com.vk.notifications.NotificationClickHandlerImpl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.z430;

/* compiled from: LeadFormContactsHolder.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class nyy extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nyy(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, xsna.jgp] */
    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.lang.Object] */
    @Override // xsna.gzs
    public final Object invoke() {
        q680 q680Var;
        switch (this.b) {
            case 0:
                com.vk.newsfeed.common.recycler.holders.b bVar = (com.vk.newsfeed.common.recycler.holders.b) this.receiver;
                int i = com.vk.newsfeed.common.recycler.holders.b.Q;
                bVar.A6();
                return s3q0.a;
            case 1:
                ((x530) this.receiver).a.b(z430.c.a);
                return s3q0.a;
            case 2:
                ((NotificationClickHandlerImpl) this.receiver).a.b();
                return s3q0.a;
            default:
                l1r0 l1r0Var = (l1r0) this.receiver;
                w2w w2wVar = l1r0Var.a;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = jgp.b;
                try {
                    ref$ObjectRef.element = bz2.c(new tos(w2wVar.H0()), "FriendsGetOnlineApiCmd");
                } catch (InterruptedException e) {
                    throw e;
                } catch (Throwable th) {
                    L.i(th);
                }
                try {
                    try {
                        try {
                            final ArraySet arraySet = new ArraySet();
                            Iterator it = ((Map) ref$ObjectRef.element).entrySet().iterator();
                            while (it.hasNext()) {
                                arraySet.addAll((Collection) ((Map.Entry) it.next()).getValue());
                            }
                            final long f1 = w2wVar.f1();
                            w2wVar.I0().u(new izs() { // from class: xsna.j1r0
                                @Override // xsna.izs
                                public final Object invoke(Object obj) {
                                    xgl0 xgl0Var = (xgl0) obj;
                                    for (Map.Entry entry : ((Map) Ref$ObjectRef.this.element).entrySet()) {
                                        Platform platform = (Platform) entry.getKey();
                                        Collection<Long> collection = (Collection) entry.getValue();
                                        x1r0 d = xgl0Var.d();
                                        long j = f1;
                                        d.s(collection, platform, j, j);
                                    }
                                    xgl0Var.d().l(arraySet);
                                    return s3q0.a;
                                }
                            });
                            synchronized (l1r0Var) {
                                l1r0Var.d = true;
                            }
                            q680Var = new q680("UsersOnlineSyncManager:invalidate");
                        } catch (Throwable th2) {
                            com.vk.metrics.eventtracking.b.a.a(th2);
                            synchronized (l1r0Var) {
                                l1r0Var.d = true;
                                q680Var = new q680("UsersOnlineSyncManager:invalidate");
                            }
                        }
                        w2wVar.e1(l1r0Var, q680Var);
                        w2wVar.S0().j("UsersOnlineSyncManager:invalidate");
                        return s3q0.a;
                    } catch (InterruptedException e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    synchronized (l1r0Var) {
                        l1r0Var.d = true;
                        w2wVar.e1(l1r0Var, new q680("UsersOnlineSyncManager:invalidate"));
                        w2wVar.S0().j("UsersOnlineSyncManager:invalidate");
                        throw th3;
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyy(Object obj) {
        super(0, obj, l1r0.class, "doOnInvalidate", "doOnInvalidate()V", 0);
        this.b = 3;
    }
}
