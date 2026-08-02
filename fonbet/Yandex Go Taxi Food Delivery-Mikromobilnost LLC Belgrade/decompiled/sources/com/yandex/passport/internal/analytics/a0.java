package com.yandex.passport.internal.analytics;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.ExperimentsInternalTestActivity;
import com.yandex.passport.internal.flags.presentation.n0;
import com.yandex.passport.internal.flags.presentation.o0;
import com.yandex.passport.internal.social.esia.i0;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.ui.base.BaseNotificationActivity;
import com.yandex.passport.internal.ui.bouncer.model.e2;
import com.yandex.passport.internal.ui.bouncer.model.q2;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.k1;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.call.CallConfirmFragment;
import com.yandex.passport.internal.ui.router.LoginRouterActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesActivity;
import com.yandex.passport.sloth.t0;
import defpackage.ium;
import defpackage.tcc;
import defpackage.tls;
import defpackage.w511;
import defpackage.yhl;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class a0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        o0 viewModel;
        Object b;
        boolean onCreate$lambda$0;
        zy11 lambda$onCreate$6;
        zy11 onViewCreated$lambda$2;
        zy11 startProgressBarAnimation$lambda$5$lambda$4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                String str = ((b0) obj2).w;
                if (str != null) {
                    map.put("session_hash", str);
                    break;
                }
                break;
            case 1:
                ((Map) obj).putAll(((d0) obj2).b);
                break;
            case 2:
                com.yandex.passport.internal.core.announcing.g gVar = (com.yandex.passport.internal.core.announcing.g) obj2;
                String str2 = (String) obj;
                break;
            case 3:
                viewModel = ((ExperimentsInternalTestActivity) obj2).getViewModel();
                viewModel.i0((n0) obj);
                break;
            case 4:
                PassportProcessGlobalComponent passportProcessGlobalComponent = (PassportProcessGlobalComponent) obj2;
                break;
            case 5:
                JSONObject jSONObject = (JSONObject) obj;
                com.yandex.passport.internal.core.accounts.p pVar = ((com.yandex.passport.internal.sloth.performers.m) obj2).a;
                pVar.getClass();
                ArrayList o = tcc.o(com.yandex.passport.internal.flags.q.a().values());
                ArrayList arrayList = new ArrayList();
                Iterator it = o.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((com.yandex.passport.internal.flags.experiments.k) pVar.a).a.contains(((com.yandex.passport.internal.flags.g) next).a)) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    com.yandex.passport.internal.flags.g gVar2 = (com.yandex.passport.internal.flags.g) it2.next();
                    String str3 = gVar2.a;
                    com.yandex.passport.internal.flags.j jVar = (com.yandex.passport.internal.flags.j) pVar.b;
                    if (!(gVar2 instanceof com.yandex.passport.internal.flags.a) && !(gVar2 instanceof com.yandex.passport.internal.flags.l) && !(gVar2 instanceof com.yandex.passport.internal.flags.m)) {
                        if (!(gVar2 instanceof com.yandex.passport.internal.flags.b)) {
                            w511.b();
                            break;
                        } else {
                            b = Integer.valueOf(((Enum) jVar.b(gVar2)).ordinal());
                        }
                    } else {
                        b = jVar.b(gVar2);
                    }
                    if (b != null) {
                        arrayList2.add(new Pair(str3, b));
                    } else {
                        yhl.d(gVar2, "no value for flag ");
                    }
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    jSONObject.put((String) pair.getFirst(), pair.getSecond());
                }
                break;
            case 6:
                ((i0) obj2).b.a(new com.yandex.passport.internal.social.esia.d0((Uri) obj));
                break;
            case 7:
                onCreate$lambda$0 = BaseNotificationActivity.onCreate$lambda$0((PassportTheme) obj2, (Resources) obj);
                break;
            case 8:
                ((com.yandex.passport.internal.ui.bouncer.t) obj2).a(new e2((q2) obj));
                break;
            case 9:
                ((com.yandex.passport.internal.ui.bouncer.chooser.l) obj2).D.a(new e2((q2) obj));
                break;
            case 10:
                new com.yandex.passport.internal.core.announcing.f(13).invoke(new com.lightside.animations.a((View) obj2, ((ium) obj).a));
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                ((DeleteAccountActivity) obj2).finishWithResult((k1) obj);
                break;
            case 15:
                ((VpnChallengeActivity) obj2).finish();
                break;
            case 16:
                lambda$onCreate$6 = ((DomikActivity) obj2).lambda$onCreate$6((Boolean) obj);
                break;
            case 17:
                onViewCreated$lambda$2 = CallConfirmFragment.onViewCreated$lambda$2((CallConfirmFragment) obj2, (Boolean) obj);
                break;
            case 18:
                ((com.yandex.passport.internal.ui.domik.smsauth.b) obj2).b.m((EventError) obj);
                break;
            case 19:
                startProgressBarAnimation$lambda$5$lambda$4 = LoginRouterActivity.startProgressBarAnimation$lambda$5$lambda$4((com.yandex.passport.internal.ui.router.w) obj2, (ium) obj);
                break;
            case 20:
                com.yandex.passport.internal.ui.c.k((AuthSdkSlothComposeActivity) obj2, com.yandex.passport.internal.ui.sloth.authsdk.o.b((com.yandex.passport.internal.ui.sloth.authsdk.g) obj));
                break;
            case 21:
                ManagingPlusDevicesActivity managingPlusDevicesActivity = (ManagingPlusDevicesActivity) obj2;
                managingPlusDevicesActivity.setResult(((Integer) obj).intValue());
                managingPlusDevicesActivity.finish();
                break;
            case 22:
                ((com.yandex.passport.sloth.h) obj2).b.a(t0.c);
                break;
            default:
                ((com.yandex.passport.user_id.w) obj2).W(new com.yandex.passport.user_id.models.i((String) obj));
                break;
        }
        return zy11Var;
    }
}
