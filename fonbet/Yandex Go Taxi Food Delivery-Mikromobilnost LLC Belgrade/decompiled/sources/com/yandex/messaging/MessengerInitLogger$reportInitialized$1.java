package com.yandex.messaging;

import android.content.SharedPreferences;
import androidx.core.app.s0;
import com.yandex.alicekit.core.permissions.Permission;
import com.yandex.messaging.internal.auth.AuthorizationObservable$AuthState;
import defpackage.ek3;
import defpackage.eu1;
import defpackage.htu0;
import defpackage.jn3;
import defpackage.lqo;
import defpackage.me60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oqo;
import defpackage.p120;
import defpackage.q120;
import defpackage.r96;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.tz10;
import defpackage.vlz;
import defpackage.w511;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.MessengerInitLogger$reportInitialized$1", f = "MessengerInitLogger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class MessengerInitLogger$reportInitialized$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessengerInitLogger$reportInitialized$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MessengerInitLogger$reportInitialized$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MessengerInitLogger$reportInitialized$1 messengerInitLogger$reportInitialized$1 = (MessengerInitLogger$reportInitialized$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        messengerInitLogger$reportInitialized$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean z = a.k;
        zy11 zy11Var = zy11.a;
        if (z) {
            return zy11Var;
        }
        a.k = true;
        String loggingName = this.this$0.b.a(Permission.READ_CONTACTS).getLoggingName();
        this.this$0.f.i("contacts permission", loggingName);
        jn3 jn3Var = (jn3) this.this$0.c.get();
        ek3 ek3Var = new ek3();
        jn3Var.getClass();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState = jn3Var.i;
        if (authorizationObservable$AuthState == null) {
            authorizationObservable$AuthState = jn3Var.a();
            jn3Var.i = authorizationObservable$AuthState;
        }
        Pair pair = new Pair("user status", jn3Var.b(authorizationObservable$AuthState, ek3Var));
        Pair pair2 = new Pair("contacts permission", loggingName);
        Pair pair3 = new Pair("audio permission", this.this$0.b.a(Permission.RECORD_AUDIO).getLoggingName());
        Pair pair4 = new Pair("camera permission", this.this$0.b.a(Permission.CAMERA).getLoggingName());
        Pair pair5 = new Pair("notifications", new s0(this.this$0.a).b.areNotificationsEnabled() ? "on" : "off");
        a aVar = this.this$0;
        SharedPreferences sharedPreferences = aVar.e;
        jn3 jn3Var2 = (jn3) aVar.c.get();
        jn3Var2.getClass();
        eu1 eu1Var = new eu1();
        tje.e();
        AuthorizationObservable$AuthState authorizationObservable$AuthState2 = jn3Var2.i;
        if (authorizationObservable$AuthState2 == null) {
            authorizationObservable$AuthState2 = jn3Var2.a();
            jn3Var2.i = authorizationObservable$AuthState2;
        }
        boolean booleanValue = ((Boolean) jn3Var2.b(authorizationObservable$AuthState2, eu1Var)).booleanValue();
        boolean z2 = false;
        Pair pair6 = new Pair("users recommendations", Boolean.valueOf(booleanValue && sharedPreferences.getBoolean("enable_users_suggest", true)));
        a aVar2 = this.this$0;
        SharedPreferences sharedPreferences2 = aVar2.e;
        if (((Boolean) aVar2.d.c(new me60())).booleanValue() && sharedPreferences2.getBoolean("enable_discovery", true)) {
            z2 = true;
        }
        Map i = kotlin.collections.b.i(pair, pair2, pair3, pair4, pair5, pair6, new Pair("channel recommendations", Boolean.valueOf(z2)), new Pair("see_myself_on_screen_state", Boolean.valueOf(((SharedPreferences) this.this$0.i.a).getBoolean("showMyVideo", true))));
        if (this.this$0.h.c.getValue() != null) {
            ny61.u();
            return null;
        }
        this.this$0.f.reportEvent("start status", kotlin.collections.b.n(i, kotlin.collections.b.f()));
        q120 q120Var = this.this$0.g;
        q120Var.getClass();
        Set M0 = kotlin.collections.a.M0(tz10.a0);
        ycc.r(EmptySet.a, M0);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : M0) {
            if (hashSet.add(((oqo) obj2).a)) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            oqo oqoVar = (oqo) it.next();
            String str2 = oqoVar.a;
            lqo lqoVar = q120Var.a;
            int i2 = p120.a[oqoVar.a().ordinal()];
            if (i2 == 1) {
                str = (String) ((htu0) oqoVar).b;
            } else if (i2 == 2) {
                str = String.valueOf(((Long) ((vlz) oqoVar).b).longValue());
            } else if (i2 == 3) {
                str = String.valueOf(lqoVar.a((r96) oqoVar));
            } else {
                if (i2 != 4) {
                    if (i2 != 5) {
                        w511.b();
                        return null;
                    }
                    ny61.u();
                    return null;
                }
                str = ((Enum) oqoVar.b).toString();
            }
            arrayList2.add(new Pair(str2, str));
        }
        q120Var.b.reportEvent("flag status", kotlin.collections.b.s(arrayList2));
        return zy11Var;
    }
}
