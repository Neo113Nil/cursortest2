package com.yandex.passport.internal.flags.presentation;

import android.content.Context;
import android.net.ConnectivityManager;
import android.widget.CheckBox;
import android.widget.EditText;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.push.NotificationsBuilderActivity;
import com.yandex.passport.internal.utils.ConnectivityManagerUtilsKt$observeConnectivity$1$callback$1;
import defpackage.i3y;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes15.dex */
public final /* synthetic */ class l implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) obj2).invoke((String) obj);
                return zy11Var;
            case 1:
                ((tls) obj2).invoke(((Enum) obj).name());
                return zy11Var;
            case 2:
                ((tls) obj2).invoke((v) obj);
                return zy11Var;
            case 3:
                ((tls) obj2).invoke(new l0(((d0) obj).b.a, null));
                return zy11Var;
            case 4:
                ((oz40) obj).setValue((Environment) obj2);
                return zy11Var;
            case 5:
                return (CheckBox) ((NotificationsBuilderActivity) obj2).findViewById(((com.yandex.passport.internal.push.k) obj).a);
            case 6:
                return (EditText) ((NotificationsBuilderActivity) obj2).findViewById(((com.yandex.passport.internal.push.m) obj).a);
            case 7:
                Context context = (Context) obj2;
                return new com.yandex.passport.internal.methods.requester.f(context, new com.yandex.passport.common.network.u(context.getContentResolver(), com.yandex.passport.internal.util.p.l(context.getPackageName())), (IReporterYandex) ((i3y) ((com.yandex.passport.internal.push.n0) obj).b).getValue());
            default:
                ConnectivityManagerUtilsKt$observeConnectivity$1$callback$1 connectivityManagerUtilsKt$observeConnectivity$1$callback$1 = (ConnectivityManagerUtilsKt$observeConnectivity$1$callback$1) obj;
                try {
                    ((ConnectivityManager) obj2).unregisterNetworkCallback(connectivityManagerUtilsKt$observeConnectivity$1$callback$1);
                    com.yandex.passport.internal.utils.b.a(connectivityManagerUtilsKt$observeConnectivity$1$callback$1.hashCode(), "unregisterNetworkCallback");
                } catch (Exception e) {
                    com.yandex.passport.internal.utils.b.b(connectivityManagerUtilsKt$observeConnectivity$1$callback$1.hashCode(), e, "unregisterNetworkCallback");
                }
                return zy11Var;
        }
    }
}
