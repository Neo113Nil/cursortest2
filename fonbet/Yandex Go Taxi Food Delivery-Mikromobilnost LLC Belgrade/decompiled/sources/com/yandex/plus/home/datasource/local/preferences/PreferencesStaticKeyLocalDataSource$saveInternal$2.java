package com.yandex.plus.home.datasource.local.preferences;

import android.content.SharedPreferences;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.datasource.local.preferences.PreferencesStaticKeyLocalDataSource$saveInternal$2", f = "PreferencesStaticKeyLocalDataSource.kt", l = {114, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PreferencesStaticKeyLocalDataSource$saveInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $dynamicKey;
    final /* synthetic */ Object $value;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesStaticKeyLocalDataSource$saveInternal$2(Object obj, a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$value = obj;
        this.this$0 = aVar;
        this.$dynamicKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesStaticKeyLocalDataSource$saveInternal$2 preferencesStaticKeyLocalDataSource$saveInternal$2 = new PreferencesStaticKeyLocalDataSource$saveInternal$2(this.$value, this.this$0, this.$dynamicKey, continuation);
        preferencesStaticKeyLocalDataSource$saveInternal$2.L$0 = obj;
        return preferencesStaticKeyLocalDataSource$saveInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesStaticKeyLocalDataSource$saveInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        a aVar;
        String sb;
        a aVar2;
        g050 g050Var;
        String str;
        g050 g050Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                Object obj3 = this.$value;
                aVar = this.this$0;
                String str2 = this.$dynamicKey;
                StringBuilder sb2 = new StringBuilder();
                String str3 = aVar.b;
                kotlinx.coroutines.sync.a aVar3 = aVar.g;
                sb2.append(str3);
                if (str2 != null) {
                    sb2.append("[" + str2 + ']');
                }
                sb = sb2.toString();
                if (obj3 == null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = aVar3;
                    this.L$6 = null;
                    this.L$7 = sb;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    if (aVar3.a(this) != coroutineSingletons) {
                        g050Var2 = aVar3;
                        SharedPreferences.Editor edit = aVar.f.edit();
                        edit.remove(sb);
                        edit.commit();
                        g050Var.d(null);
                        obj2 = zy11.a;
                    }
                } else {
                    String c = aVar.d.c(obj3, aVar.c);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = c;
                    this.L$6 = aVar3;
                    this.L$7 = null;
                    this.L$8 = sb;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 2;
                    if (aVar3.a(this) != coroutineSingletons) {
                        aVar2 = aVar;
                        g050Var = aVar3;
                        str = c;
                        SharedPreferences.Editor edit2 = aVar2.f.edit();
                        edit2.putString(sb, str);
                        edit2.commit();
                        aVar2.h.put(sb, str);
                        obj2 = zy11.a;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                sb = (String) this.L$7;
                g050Var2 = (g050) this.L$5;
                aVar = (a) this.L$2;
                b.b(obj);
                try {
                    SharedPreferences.Editor edit3 = aVar.f.edit();
                    edit3.remove(sb);
                    edit3.commit();
                    g050Var.d(null);
                    obj2 = zy11.a;
                } finally {
                }
            } else {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sb = (String) this.L$8;
                g050Var = (g050) this.L$6;
                str = (String) this.L$5;
                aVar2 = (a) this.L$2;
                b.b(obj);
                try {
                    SharedPreferences.Editor edit22 = aVar2.f.edit();
                    edit22.putString(sb, str);
                    edit22.commit();
                    aVar2.h.put(sb, str);
                    obj2 = zy11.a;
                } finally {
                }
            }
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
            obj2 = failure;
            return new Result(obj2);
        }
        return new Result(obj2);
    }
}
