package com.yandex.passport.biometric.ui.verification;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportLogLevel;
import com.yandex.passport.api.c1;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.network.g;
import com.yandex.passport.common.network.i;
import com.yandex.passport.common.network.j;
import com.yandex.passport.common.network.x;
import com.yandex.passport.data.models.UserInfoData;
import com.yandex.passport.data.models.t;
import com.yandex.passport.data.network.bb;
import com.yandex.passport.data.network.core.m;
import com.yandex.passport.data.network.fb;
import com.yandex.passport.internal.methods.MethodRef;
import com.yandex.passport.internal.methods.f;
import com.yandex.passport.internal.report.kd;
import com.yandex.passport.internal.report.l2;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.EventError;
import com.yandex.passport.internal.util.p;
import com.yandex.passport.sloth.ui.d1;
import com.yandex.passport.sloth.ui.dependencies.n;
import defpackage.cma1;
import defpackage.gw00;
import defpackage.i5m;
import defpackage.kvj0;
import defpackage.q5z;
import defpackage.tcc;
import defpackage.ut;
import defpackage.w511;
import defpackage.xvf0;
import defpackage.yvf0;
import defpackage.zcx;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.rt.ebs.cryptosdk.core.common.entities.exceptions.NotInitializedSdkEbsException;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener;

/* loaded from: classes15.dex */
public class a implements IVerificationListener, com.yandex.passport.data.network.core.d, com.yandex.passport.common.logger.c, f {
    public final /* synthetic */ int a;
    public Object b;

    public a(kd kdVar) {
        this.a = 4;
        this.a = 4;
        this.b = kdVar;
    }

    public static PassportLogLevel k(LogLevel logLevel) {
        switch (com.yandex.passport.internal.logging.a.a[logLevel.ordinal()]) {
            case 1:
                return PassportLogLevel.VERBOSE;
            case 2:
                return PassportLogLevel.DEBUG;
            case 3:
                return PassportLogLevel.INFO;
            case 4:
                return PassportLogLevel.WARN;
            case 5:
                return PassportLogLevel.ERROR;
            case 6:
                return PassportLogLevel.ASSERT;
            default:
                w511.b();
                return null;
        }
    }

    @Override // com.yandex.passport.common.logger.c
    public void a(LogLevel logLevel, String str, String str2, Throwable th) {
        ((c1) this.b).b(k(logLevel), str, str2, th);
    }

    @Override // com.yandex.passport.common.logger.c
    public void b(LogLevel logLevel, String str, String str2) {
        ((c1) this.b).a(k(logLevel), str, str2);
    }

    @Override // com.yandex.passport.internal.methods.f
    public void d(Bundle bundle, Object obj) {
        bundle.putString((String) this.b, (String) obj);
    }

    @Override // com.yandex.passport.data.network.core.d
    public j e(kvj0 kvj0Var) {
        String b = p.b(kvj0Var);
        zcx zcxVar = m.a;
        zcxVar.getClass();
        j jVar = (j) zcxVar.b(j.Companion.serializer(fb.Companion.serializer(), x.Companion.serializer()), b);
        if (!(jVar instanceof i)) {
            if (jVar instanceof g) {
                return new g(((g) jVar).a);
            }
            w511.b();
            return null;
        }
        fb fbVar = (fb) ((i) jVar).a;
        String str = fbVar.a;
        String str2 = fbVar.b;
        String str3 = fbVar.c;
        t tVar = UserInfoData.Companion;
        String a = kvj0Var.y.a("ETag");
        String str4 = a != null ? a : null;
        ((com.yandex.passport.common.a) this.b).getClass();
        long a2 = com.yandex.passport.common.a.a();
        tVar.getClass();
        return new i(new bb(str, str2, str3, t.a(a2, b, str4)));
    }

    public com.yandex.passport.sloth.ui.b f() {
        q5z.f(com.yandex.passport.sloth.ui.dependencies.m.class, (com.yandex.passport.sloth.ui.dependencies.m) this.b);
        com.yandex.passport.sloth.ui.dependencies.m mVar = (com.yandex.passport.sloth.ui.dependencies.m) this.b;
        com.yandex.passport.sloth.ui.b bVar = new com.yandex.passport.sloth.ui.b();
        n nVar = new n(mVar, 0);
        bVar.a = nVar;
        int i = 7;
        n nVar2 = new n(mVar, i);
        bVar.b = nVar2;
        int i2 = 5;
        bVar.c = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.error.i(nVar, nVar2, new n(mVar, 4), i2)));
        xvf0 c = i5m.c(d1.a);
        bVar.d = c;
        int i3 = 6;
        bVar.e = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.roundabout.items.d((yvf0) bVar.c, (yvf0) bVar.b, c, i3)));
        xvf0 b = i5m.b(cma1.i(new com.yandex.passport.internal.ui.bouncer.f(new n(mVar, 9), bVar.d, 19)));
        n nVar3 = new n(mVar, 2);
        xvf0 xvf0Var = bVar.e;
        xvf0 xvf0Var2 = bVar.d;
        bVar.f = i5m.b(cma1.i(new ut(bVar.a, xvf0Var, com.yandex.passport.sloth.ui.n.a, bVar.b, b, nVar3, new com.yandex.passport.internal.ui.bouncer.roundabout.items.d((yvf0) xvf0Var, b, (yvf0) xvf0Var2, i), com.yandex.passport.sloth.ui.webview.p.a, xvf0Var2, new n(mVar, 3), new n(mVar, 1), new n(mVar, i3), new n(mVar, 8), new n(mVar, i2))));
        return bVar;
    }

    public void g(MethodRef methodRef, boolean z) {
        l2 l2Var = l2.w;
        Pair[] pairArr = (Pair[]) Arrays.copyOf(new Pair[]{new Pair("method", methodRef.name()), new Pair("success", String.valueOf(z))}, 2);
        ArrayList arrayList = new ArrayList();
        for (Pair pair : pairArr) {
            arrayList.add(new com.yandex.passport.internal.report.f((String) pair.c(), String.valueOf(pair.f())));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((pd) next).a()) {
                arrayList2.add(next);
            }
        }
        kd kdVar = (kd) this.b;
        String fd20Var = l2Var.toString();
        int d = gw00.d(tcc.n(arrayList2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            pd pdVar = (pd) it2.next();
            Pair pair2 = new Pair(pdVar.getName(), pdVar.getValue());
            linkedHashMap.put(pair2.c(), pair2.f());
        }
        kdVar.a(fd20Var, linkedHashMap);
    }

    @Override // com.yandex.passport.internal.methods.f
    public String getKey() {
        return (String) this.b;
    }

    public void h(EventError eventError) {
        switch (this.a) {
            case 7:
                ((com.yandex.passport.internal.ui.domik.call.e) this.b).b.m(eventError);
                break;
            default:
                ((com.yandex.passport.internal.ui.domik.phone_number.a) this.b).b.m(eventError);
                break;
        }
    }

    public void i(boolean z) {
        switch (this.a) {
            case 7:
                ((com.yandex.passport.internal.ui.domik.call.e) this.b).W(z);
                break;
            default:
                ((com.yandex.passport.internal.ui.domik.phone_number.a) this.b).W(z);
                break;
        }
    }

    @Override // com.yandex.passport.common.logger.c
    public boolean isEnabled() {
        return true;
    }

    @Override // com.yandex.passport.internal.methods.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String c(Bundle bundle) {
        return bundle.getString((String) this.b, null);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener
    public void onCancel() {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "IVerificationListener onCancel state", 8);
        }
        BiometricAuthSdkActivity biometricAuthSdkActivity = (BiometricAuthSdkActivity) this.b;
        int i = BiometricAuthSdkActivity.c;
        biometricAuthSdkActivity.setResult(0, null);
        biometricAuthSdkActivity.finish();
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener
    public void onError(Throwable th) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "IVerificationListener onError state", th);
        }
        BiometricAuthSdkActivity biometricAuthSdkActivity = (BiometricAuthSdkActivity) this.b;
        int i = BiometricAuthSdkActivity.c;
        if (th instanceof NotInitializedSdkEbsException) {
            biometricAuthSdkActivity.setResult(999, null);
            biometricAuthSdkActivity.finish();
        } else {
            biometricAuthSdkActivity.setResult(444, new Intent().putExtra(EsiaBindActivity.EXTRA_EXCEPTION, th));
            biometricAuthSdkActivity.finish();
        }
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationListener
    public void onSuccess(Token token) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "IVerificationListener onSuccess state", 8);
        }
        BiometricAuthSdkActivity biometricAuthSdkActivity = (BiometricAuthSdkActivity) this.b;
        int i = BiometricAuthSdkActivity.c;
        biometricAuthSdkActivity.setResult(-1, null);
        biometricAuthSdkActivity.finish();
    }

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ a() {
        this.a = 9;
    }
}
