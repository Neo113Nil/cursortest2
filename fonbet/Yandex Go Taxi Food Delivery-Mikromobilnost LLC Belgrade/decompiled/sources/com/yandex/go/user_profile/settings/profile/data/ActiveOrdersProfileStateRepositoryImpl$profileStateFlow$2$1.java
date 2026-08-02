package com.yandex.go.user_profile.settings.profile.data;

import com.yandex.go.user_profile.fullscreen.models.UserProfileExperiment;
import com.yandex.go.user_profile.settings.profile.data.LogoutAvailabilityForServiceOrdersExperiment;
import defpackage.bms;
import defpackage.d6z;
import defpackage.d9n;
import defpackage.f7n;
import defpackage.gwk0;
import defpackage.hxq0;
import defpackage.i20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.sly;
import defpackage.vl40;
import defpackage.w511;
import defpackage.wl40;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.multiorder.multi.ServiceType;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwl40;", "ordersHolder", "Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;", "userExperiment", "Lcom/yandex/go/user_profile/settings/profile/data/LogoutAvailabilityForServiceOrdersExperiment;", "logoutAvailabilityExperiment", "Li20;", "<anonymous>", "(Lwl40;Lcom/yandex/go/user_profile/fullscreen/models/UserProfileExperiment;Lcom/yandex/go/user_profile/settings/profile/data/LogoutAvailabilityForServiceOrdersExperiment;)Li20;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.settings.profile.data.ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1", f = "ActiveOrdersProfileStateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1 activeOrdersProfileStateRepositoryImpl$profileStateFlow$2$1 = new ActiveOrdersProfileStateRepositoryImpl$profileStateFlow$2$1(this.this$0, (Continuation) obj4);
        activeOrdersProfileStateRepositoryImpl$profileStateFlow$2$1.L$0 = (wl40) obj;
        activeOrdersProfileStateRepositoryImpl$profileStateFlow$2$1.L$1 = (UserProfileExperiment) obj2;
        activeOrdersProfileStateRepositoryImpl$profileStateFlow$2$1.L$2 = (LogoutAvailabilityForServiceOrdersExperiment) obj3;
        return activeOrdersProfileStateRepositoryImpl$profileStateFlow$2$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int size;
        wl40 wl40Var = (wl40) this.L$0;
        UserProfileExperiment userProfileExperiment = (UserProfileExperiment) this.L$1;
        LogoutAvailabilityForServiceOrdersExperiment logoutAvailabilityForServiceOrdersExperiment = (LogoutAvailabilityForServiceOrdersExperiment) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        UserProfileExperiment.LogoutButtonParams logoutButtonParams = userProfileExperiment.e;
        String Y = d6z.Y(userProfileExperiment, logoutButtonParams.b);
        boolean z2 = logoutButtonParams.a;
        b bVar = this.this$0;
        bVar.getClass();
        Iterator it = logoutAvailabilityForServiceOrdersExperiment.c.entrySet().iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                boolean z3 = ((LogoutAvailabilityForServiceOrdersExperiment.ServiceParameters) entry.getValue()).a;
                hxq0 t = gwk0.t(str);
                wl40Var.getClass();
                if (t instanceof ServiceType) {
                    switch (vl40.a[((ServiceType) t).ordinal()]) {
                        case 1:
                            size = wl40Var.d.size();
                            i += size;
                            if (!z3 && size > 0) {
                                z = false;
                                break;
                            }
                            break;
                        case 2:
                            List list = wl40Var.b;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                int i2 = 0;
                                while (it2.hasNext()) {
                                    if (((sly) it2.next()).a() != null && (i2 = i2 + 1) < 0) {
                                        scc.l();
                                        throw null;
                                    }
                                }
                                size = i2;
                                i += size;
                                if (!z3) {
                                    break;
                                }
                            }
                            size = 0;
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 3:
                            size = wl40Var.a.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 4:
                            size = wl40Var.e.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 5:
                            size = wl40Var.f.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 6:
                            size = wl40Var.g.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 7:
                            size = wl40Var.h.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        case 8:
                            size = wl40Var.i.size();
                            i += size;
                            if (!z3) {
                            }
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                } else {
                    if (t instanceof d9n) {
                        size = wl40Var.k(new f7n(((d9n) t).a)).size();
                        i += size;
                        if (!z3) {
                        }
                    }
                    size = 0;
                    i += size;
                    if (!z3) {
                    }
                }
            } else {
                z = i == wl40Var.j() ? true : logoutAvailabilityForServiceOrdersExperiment.b.a;
            }
        }
        boolean z4 = bVar.a.a.Mg() || z || z2;
        if (z4) {
            Y = "";
        }
        return new i20(z, z4, Y);
    }
}
