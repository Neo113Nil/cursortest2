package com.yandex.plus.core.graphql.target;

import com.yandex.plus.core.graphql.type.CONSUMER_TYPE;
import com.yandex.plus.core.graphql.type.PLATFORM;
import defpackage.kzs;
import defpackage.ny61;
import defpackage.p5z;
import defpackage.pax0;
import defpackage.q5z;
import defpackage.qax0;
import defpackage.qje;
import defpackage.qog;
import defpackage.tls;
import defpackage.vf70;
import defpackage.x75;
import defpackage.yf70;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final kzs a;
    public final String b;
    public final String c;
    public final p5z d;
    public final x75 e;
    public final qog f;
    public final qog g;
    public final tls h;
    public final qog i;

    public a(kzs kzsVar, String str, String str2, p5z p5zVar, x75 x75Var, qog qogVar, qog qogVar2, tls tlsVar, qog qogVar3) {
        this.a = kzsVar;
        this.b = str;
        this.c = str2;
        this.d = p5zVar;
        this.e = x75Var;
        this.f = qogVar;
        this.g = qogVar2;
        this.h = tlsVar;
        this.i = qogVar3;
    }

    public static /* synthetic */ Object b(a aVar, String str, CONSUMER_TYPE consumer_type, String str2, ContinuationImpl continuationImpl, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return aVar.a(str, consumer_type, str2, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, CONSUMER_TYPE consumer_type, String str2, ContinuationImpl continuationImpl) {
        TargetingInputFactory$createTargetingInput$1 targetingInputFactory$createTargetingInput$1;
        int i;
        String str3;
        CONSUMER_TYPE consumer_type2;
        Object invoke;
        String str4;
        String str5;
        if (continuationImpl instanceof TargetingInputFactory$createTargetingInput$1) {
            targetingInputFactory$createTargetingInput$1 = (TargetingInputFactory$createTargetingInput$1) continuationImpl;
            int i2 = targetingInputFactory$createTargetingInput$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                targetingInputFactory$createTargetingInput$1.label = i2 - Integer.MIN_VALUE;
                Object obj = targetingInputFactory$createTargetingInput$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = targetingInputFactory$createTargetingInput$1.label;
                if (i != 0) {
                    b.b(obj);
                    str3 = str;
                    targetingInputFactory$createTargetingInput$1.L$0 = str3;
                    consumer_type2 = consumer_type;
                    targetingInputFactory$createTargetingInput$1.L$1 = consumer_type2;
                    targetingInputFactory$createTargetingInput$1.L$2 = null;
                    targetingInputFactory$createTargetingInput$1.L$3 = str2;
                    targetingInputFactory$createTargetingInput$1.label = 1;
                    invoke = this.h.invoke(targetingInputFactory$createTargetingInput$1);
                    if (invoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str4 = null;
                    str5 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str5 = (String) targetingInputFactory$createTargetingInput$1.L$3;
                    String str6 = (String) targetingInputFactory$createTargetingInput$1.L$2;
                    CONSUMER_TYPE consumer_type3 = (CONSUMER_TYPE) targetingInputFactory$createTargetingInput$1.L$1;
                    String str7 = (String) targetingInputFactory$createTargetingInput$1.L$0;
                    b.b(obj);
                    invoke = obj;
                    str3 = str7;
                    str4 = str6;
                    consumer_type2 = consumer_type3;
                }
                qax0 qax0Var = (qax0) invoke;
                yf70 c0 = qje.c0(PLATFORM.ANDROID);
                yf70 c02 = qje.c0(str4);
                yf70 c03 = qje.c0(consumer_type2);
                yf70 c04 = qje.c0(str3);
                String v = q5z.v(this.d);
                yf70 c05 = qje.c0(this.a.a());
                yf70 c06 = qje.c0(this.f.invoke());
                yf70 c07 = qje.c0(this.i.invoke());
                Set set = (Set) this.g.invoke();
                yf70 c08 = qje.c0(set == null ? kotlin.collections.a.J0(set) : null);
                yf70 c09 = qje.c0(this.c);
                yf70 c010 = qje.c0("110.0.2");
                yf70 c011 = qje.c0(this.e.b());
                yf70 c012 = qje.c0(str5);
                yf70 c013 = qje.c0(qax0Var == null ? qax0Var.a : null);
                yf70 c014 = qje.c0(qax0Var == null ? Boolean.valueOf(qax0Var.b) : null);
                yf70 c015 = qje.c0(qax0Var != null ? qax0Var.c : null);
                vf70 vf70Var = vf70.a;
                return new pax0(c011, c09, c02, c03, vf70Var, vf70Var, c08, vf70Var, c013, c014, v, vf70Var, c05, vf70Var, c012, vf70Var, vf70Var, c04, c0, vf70Var, c015, c010, vf70Var, this.b, vf70Var, vf70Var, c06, c07);
            }
        }
        targetingInputFactory$createTargetingInput$1 = new TargetingInputFactory$createTargetingInput$1(this, continuationImpl);
        Object obj2 = targetingInputFactory$createTargetingInput$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = targetingInputFactory$createTargetingInput$1.label;
        if (i != 0) {
        }
        qax0 qax0Var2 = (qax0) invoke;
        yf70 c016 = qje.c0(PLATFORM.ANDROID);
        yf70 c022 = qje.c0(str4);
        yf70 c032 = qje.c0(consumer_type2);
        yf70 c042 = qje.c0(str3);
        String v2 = q5z.v(this.d);
        yf70 c052 = qje.c0(this.a.a());
        yf70 c062 = qje.c0(this.f.invoke());
        yf70 c072 = qje.c0(this.i.invoke());
        Set set2 = (Set) this.g.invoke();
        yf70 c082 = qje.c0(set2 == null ? kotlin.collections.a.J0(set2) : null);
        yf70 c092 = qje.c0(this.c);
        yf70 c0102 = qje.c0("110.0.2");
        yf70 c0112 = qje.c0(this.e.b());
        yf70 c0122 = qje.c0(str5);
        yf70 c0132 = qje.c0(qax0Var2 == null ? qax0Var2.a : null);
        yf70 c0142 = qje.c0(qax0Var2 == null ? Boolean.valueOf(qax0Var2.b) : null);
        yf70 c0152 = qje.c0(qax0Var2 != null ? qax0Var2.c : null);
        vf70 vf70Var2 = vf70.a;
        return new pax0(c0112, c092, c022, c032, vf70Var2, vf70Var2, c082, vf70Var2, c0132, c0142, v2, vf70Var2, c052, vf70Var2, c0122, vf70Var2, vf70Var2, c042, c016, vf70Var2, c0152, c0102, vf70Var2, this.b, vf70Var2, vf70Var2, c062, c072);
    }
}
