package defpackage;

import android.content.Context;
import com.yandex.go.proxyprovision.mob.d;
import com.yandex.messaging.domain.folders.i;
import com.yandex.messaging.internal.authorized.j;
import com.yandex.messaging.internal.e;
import com.yandex.messaging.internal.g;
import com.ybsdk.common.domain.b;
import com.ybsdk.common.repositiories.balance.a;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import ru.yandex.taxi.utils.c;

/* loaded from: classes8.dex */
public final class a4t implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ a4t(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new b((a) xvf0Var2.get(), (com.ybsdk.common.repositiories.agreements.a) xvf0Var.get());
            case 1:
                return new f4t((ney0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 2:
                return new j4t((kse) xvf0Var2.get(), (azj) xvf0Var.get());
            case 3:
                return new com.yandex.messaging.chat.b((kse) xvf0Var.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get());
            case 4:
                return new p4t((e) xvf0Var2.get(), (kse) xvf0Var.get());
            case 5:
                return new g((kse) xvf0Var.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get());
            case 6:
                return new o5t((n170) xvf0Var2.get(), (c1f) xvf0Var.get());
            case 7:
                return new w5t((kse) xvf0Var2.get(), (com.yandex.messaging.data.e) xvf0Var.get());
            case 8:
                return new n7t((k020) xvf0Var2.get(), (kse) xvf0Var.get());
            case 9:
                return new o7t((i) xvf0Var2.get(), (kse) xvf0Var.get());
            case 10:
                return new c((hit) xvf0Var2.get(), (pav) xvf0Var.get());
            case 11:
                return new q8t((com.yandex.messaging.domain.contacts.c) xvf0Var2.get(), (kse) xvf0Var.get());
            case 12:
                return new ibt((kse) xvf0Var.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var2.get());
            case 13:
                return new com.yandex.messaging.domain.personal.a((kse) xvf0Var.get(), (j) xvf0Var2.get());
            case 14:
                return new com.yandex.messaging.domain.personal.mentions.a((kse) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 15:
                return new com.ybsdk.common.domain.c((com.ybsdk.common.repositiories.plus.a) xvf0Var2.get(), (AppAnalyticsReporter) xvf0Var.get());
            case 16:
                return new pdt((kse) xvf0Var2.get(), (j) xvf0Var.get());
            case 17:
                return new net((wiq0) xvf0Var2.get(), (b8r) xvf0Var.get());
            case 18:
                return new com.yandex.messaging.domain.inviteLink.a((kse) xvf0Var2.get(), (j) xvf0Var.get());
            case 19:
                return new vet((kse) xvf0Var2.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var.get());
            case 20:
                return new com.yandex.messaging.internal.urlpreview.a((kse) xvf0Var2.get(), (j) xvf0Var.get());
            case 21:
                return new fft((kse) xvf0Var2.get(), (q0k) xvf0Var.get());
            case 22:
                return new zjt((kse) xvf0Var.get(), (j) xvf0Var2.get());
            case 23:
                return new com.yandex.go.antirobot.b((on2) xvf0Var2.get(), (com.yandex.go.antirobot.experiment.b) xvf0Var.get());
            case 24:
                return new hzk((fkh) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 25:
                return new d((Context) xvf0Var2.get(), (v2u0) xvf0Var.get());
            case 26:
                return new vot(i5m.a(xvf0Var2), (hs50) xvf0Var.get());
            case 27:
                return new ept(i5m.a(xvf0Var2), (hs50) xvf0Var.get());
            case 28:
                return new ipt(i5m.a(xvf0Var2), (hs50) xvf0Var.get());
            default:
                return new spt((zuj0) xvf0Var2.get(), (d6u0) xvf0Var.get());
        }
    }
}
