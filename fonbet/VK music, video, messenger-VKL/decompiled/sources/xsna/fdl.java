package xsna;

import android.content.Context;
import android.text.TextUtils;
import com.vk.im.engine.models.EngineInvalidateSource;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.usi0;

/* compiled from: DefaultCredentialsChangeListener.kt */
/* loaded from: classes11.dex */
public final class fdl implements zx2 {
    public final mui0 a;
    public final sxi0 b;

    public fdl(mui0 mui0Var, sxi0 sxi0Var) {
        this.a = mui0Var;
        this.b = sxi0Var;
    }

    @Override // xsna.zx2
    public final synchronized void a(List<com.vk.api.sdk.auth.a> list) {
        a1w a1wVar;
        String str;
        String str2;
        String str3;
        UserCredentials userCredentials;
        try {
            if (list.isEmpty()) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"DefaultCredentialsChangeListener: onCredentialsChanged credentials are empty"});
                }
                return;
            }
            if (!epx.f(((com.vk.api.sdk.auth.a) j5g.Y(list)).a(), o25.a().h())) {
                ArrayList a = i7o0.a(this.a.e());
                Iterator<T> it = list.iterator();
                while (true) {
                    a1wVar = null;
                    Object obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    com.vk.api.sdk.auth.a aVar = (com.vk.api.sdk.auth.a) it.next();
                    Iterator it2 = a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (epx.f(((usi0.a) next).c().b(), aVar.d())) {
                            obj = next;
                            break;
                        }
                    }
                    usi0.a aVar2 = (usi0.a) obj;
                    if (aVar2 != null) {
                        sxi0 sxi0Var = this.b;
                        vj a2 = aVar2.a();
                        String a3 = aVar.a();
                        int c = aVar.c();
                        long b = aVar.b();
                        a2.getClass();
                        sxi0Var.j(aVar2, aVar2.b(vj.a(c, b, a3), aVar.e()));
                    }
                }
                ArrayList c2 = an00.c(this.a.e());
                vx2.a.getClass();
                vx2.b().j(c2);
                usi0.a i = this.a.i();
                h7r0 b2 = i != null ? an00.b(i) : null;
                if (b2 == null) {
                    L l2 = L.a;
                    l2.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l2, L.LogType.i, new Object[]{"DefaultCredentialsChangeListener: onCredentialsChanged currentActiveCredentials are null"});
                    }
                    return;
                }
                String str4 = b2.a;
                String str5 = b2.b;
                int i2 = b2.c;
                long j = b2.d;
                v6u0 v6u0Var = obu0.a;
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                obu0.e(context, new h7r0(i2, j, b2.f, b2.e, str4, str5));
                if (str5 == null) {
                    str = str4;
                    str2 = "";
                } else {
                    str = str4;
                    str2 = str5;
                }
                b25 a4 = o25.a();
                if (!a4.b()) {
                    a4 = null;
                }
                if (a4 != null) {
                    userCredentials = new UserCredentials(i2, j, a4.c(), str, str2);
                    str3 = str;
                } else {
                    str3 = str;
                    userCredentials = null;
                }
                a1w a1wVar2 = i2w.c;
                if (a1wVar2 != null) {
                    a1wVar = a1wVar2;
                }
                a1wVar.f(userCredentials, EngineInvalidateSource.UPDATE_CREDENTIALS);
                m6r0 f = q6r0.f();
                if (!TextUtils.isEmpty(str3)) {
                    f.C(str3);
                }
                if (!TextUtils.isEmpty(str5)) {
                    f.E(str5);
                }
                f.D(i2);
                f.F(j);
                q6r0.k(f, false);
                L.o(new defpackage.u(11, list, this));
            }
        } finally {
        }
    }
}
