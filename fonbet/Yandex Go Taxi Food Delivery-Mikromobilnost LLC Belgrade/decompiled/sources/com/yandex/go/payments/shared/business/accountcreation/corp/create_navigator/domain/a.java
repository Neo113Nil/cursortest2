package com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.domain;

import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.ClientInfoResponse;
import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.CorpAccountClientInfoApi;
import com.yandex.go.payments.shared.business.accountcreation.corp.checklogin.Role;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zn1;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class a {
    public final h a;
    public final i3y b;

    public a(on2 on2Var, h hVar) {
        this.a = hVar;
        this.b = kotlin.a.a(new zn1(on2Var, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CorpAccountNavigatorShowCheckInteractor$canShowNavigator$1 corpAccountNavigatorShowCheckInteractor$canShowNavigator$1;
        int i;
        try {
            if (continuationImpl instanceof CorpAccountNavigatorShowCheckInteractor$canShowNavigator$1) {
                corpAccountNavigatorShowCheckInteractor$canShowNavigator$1 = (CorpAccountNavigatorShowCheckInteractor$canShowNavigator$1) continuationImpl;
                int i2 = corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.label;
                    if (i != 0) {
                        b.b(obj);
                        cmt<ClientInfoResponse> a = ((CorpAccountClientInfoApi) this.b.getValue()).a(this.a.Jg());
                        corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.L$0 = null;
                        corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.label = 1;
                        obj = ru.yandex.taxi.network.api.a.d(a, corpAccountNavigatorShowCheckInteractor$canShowNavigator$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    ClientInfoResponse clientInfoResponse = (ClientInfoResponse) obj;
                    Role role = clientInfoResponse.a;
                    String str = role != null ? role.a : null;
                    return Boolean.valueOf(((str != null || str.length() == 0) || jl40.l(clientInfoResponse.b, Boolean.TRUE)) ? false : true);
                }
            }
            if (i != 0) {
            }
            ClientInfoResponse clientInfoResponse2 = (ClientInfoResponse) obj;
            Role role2 = clientInfoResponse2.a;
            if (role2 != null) {
            }
            return Boolean.valueOf(((str != null || str.length() == 0) || jl40.l(clientInfoResponse2.b, Boolean.TRUE)) ? false : true);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.i("CorpAccountNavigatorShowCheckInteractor", th);
            return Boolean.FALSE;
        }
        corpAccountNavigatorShowCheckInteractor$canShowNavigator$1 = new CorpAccountNavigatorShowCheckInteractor$canShowNavigator$1(this, continuationImpl);
        Object obj2 = corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = corpAccountNavigatorShowCheckInteractor$canShowNavigator$1.label;
    }
}
