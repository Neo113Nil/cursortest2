package com.yandex.messaging.sdk;

import android.content.Context;
import com.yandex.messaging.TokenType;
import com.yandex.messaging.sdk.a;
import defpackage.a220;
import defpackage.b220;
import defpackage.c220;
import defpackage.e220;
import defpackage.e6b;
import defpackage.f220;
import defpackage.g110;
import defpackage.g420;
import defpackage.g5g0;
import defpackage.hbp0;
import defpackage.hit;
import defpackage.i3y;
import defpackage.jid;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.qj;
import defpackage.rfy;
import defpackage.rz10;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.x120;
import defpackage.y120;
import defpackage.z120;
import defpackage.zy11;
import defpackage.zzf;
import java.util.Collections;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final i3y b;
    public String c;
    public TokenType d = TokenType.Fcm;
    public final g420 e;

    /* JADX WARN: Type inference failed for: r8v0, types: [w120] */
    public a(Context context) {
        this.a = context;
        final int i = 0;
        this.b = kotlin.a.a(new sls(this) { // from class: w120
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                a aVar = this.b;
                switch (i2) {
                    case 0:
                        return (f220) wwg.e(aVar.a, f220.class);
                    default:
                        return Collections.singletonList(Integer.valueOf(((exu0) ((zzf) aVar.b()).T.get()).a(((pwy0) ((zzf) aVar.b()).U.get()).getThemeType()).b));
                }
            }
        });
        zzf zzfVar = (zzf) b();
        hbp0 hbp0Var = ((hit) zzfVar.z.get()).a;
        ((tt2) zzfVar.n.get()).getClass();
        sjh sjhVar = uyj.a;
        tje.N(hbp0Var, mdh.b, null, new MessengerHost$1$1(this, zzfVar, null), 2);
        ((zzf) b()).e.get();
        ((zzf) b()).e.get();
        final int i2 = 1;
        rz10 rz10Var = new rz10(new rfy(59), 99, "yandexgo", new g110(14), new sls(this) { // from class: w120
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                a aVar = this.b;
                switch (i22) {
                    case 0:
                        return (f220) wwg.e(aVar.a, f220.class);
                    default:
                        return Collections.singletonList(Integer.valueOf(((exu0) ((zzf) aVar.b()).T.get()).a(((pwy0) ((zzf) aVar.b()).U.get()).getThemeType()).b));
                }
            }
        });
        e6b e6bVar = new e6b(new jid(2, this));
        x120 x120Var = new x120(this);
        y120 y120Var = new y120(this);
        c220 c220Var = new c220(this);
        a220 a220Var = new a220(this);
        z120 z120Var = new z120();
        b220 b220Var = new b220(this);
        ((qj) ((zzf) b()).wg.get()).getClass();
        this.e = new g420(context, new e220(this), c220Var, x120Var, y120Var, a220Var, rz10Var, e6bVar, z120Var, new com.yandex.messaging.auth.passport.b(context.getApplicationContext()), b220Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        MessengerHost$setUpToken$1 messengerHost$setUpToken$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        g5g0 g5g0Var;
        String str;
        aVar.getClass();
        if (continuationImpl instanceof MessengerHost$setUpToken$1) {
            messengerHost$setUpToken$1 = (MessengerHost$setUpToken$1) continuationImpl;
            int i2 = messengerHost$setUpToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messengerHost$setUpToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messengerHost$setUpToken$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messengerHost$setUpToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g5g0Var = (g5g0) ((zzf) aVar.b()).D1.get();
                    messengerHost$setUpToken$1.L$0 = g5g0Var;
                    messengerHost$setUpToken$1.label = 1;
                    obj = g5g0Var.a.b(messengerHost$setUpToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) messengerHost$setUpToken$1.L$1;
                        kotlin.b.b(obj);
                        String str2 = (String) obj;
                        if (str == null) {
                            aVar.c = str;
                            aVar.d = TokenType.Fcm;
                        } else if (str2 != null) {
                            aVar.c = str2;
                            aVar.d = TokenType.Hms;
                        }
                        return zy11.a;
                    }
                    g5g0Var = (g5g0) messengerHost$setUpToken$1.L$0;
                    kotlin.b.b(obj);
                }
                String str3 = (String) obj;
                messengerHost$setUpToken$1.L$0 = null;
                messengerHost$setUpToken$1.L$1 = str3;
                messengerHost$setUpToken$1.label = 2;
                g5g0Var.getClass();
                if (coroutineSingletons != null) {
                    str = str3;
                    obj = null;
                    String str22 = (String) obj;
                    if (str == null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        messengerHost$setUpToken$1 = new MessengerHost$setUpToken$1(aVar, continuationImpl);
        Object obj2 = messengerHost$setUpToken$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messengerHost$setUpToken$1.label;
        if (i != 0) {
        }
        String str32 = (String) obj2;
        messengerHost$setUpToken$1.L$0 = null;
        messengerHost$setUpToken$1.L$1 = str32;
        messengerHost$setUpToken$1.label = 2;
        g5g0Var.getClass();
        if (coroutineSingletons != null) {
        }
        return coroutineSingletons;
    }

    public final f220 b() {
        return (f220) this.b.getValue();
    }
}
