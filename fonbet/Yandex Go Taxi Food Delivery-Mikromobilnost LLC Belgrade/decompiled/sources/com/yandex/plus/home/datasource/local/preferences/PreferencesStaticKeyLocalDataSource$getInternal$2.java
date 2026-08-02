package com.yandex.plus.home.datasource.local.preferences;

import android.content.SharedPreferences;
import defpackage.g050;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Ltse;", "Lkotlin/Result;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.datasource.local.preferences.PreferencesStaticKeyLocalDataSource$getInternal$2", f = "PreferencesStaticKeyLocalDataSource.kt", l = {114, HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PreferencesStaticKeyLocalDataSource$getInternal$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $dynamicKey;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesStaticKeyLocalDataSource$getInternal$2(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$dynamicKey = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PreferencesStaticKeyLocalDataSource$getInternal$2 preferencesStaticKeyLocalDataSource$getInternal$2 = new PreferencesStaticKeyLocalDataSource$getInternal$2(this.this$0, this.$dynamicKey, continuation);
        preferencesStaticKeyLocalDataSource$getInternal$2.L$0 = obj;
        return preferencesStaticKeyLocalDataSource$getInternal$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferencesStaticKeyLocalDataSource$getInternal$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012e A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:9:0x0122, B:11:0x012e), top: B:8:0x0122 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        String sb;
        a aVar;
        g050 g050Var;
        int i;
        int i2;
        g050 g050Var2;
        String str;
        a aVar2;
        Throwable th;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        try {
            try {
                if (i3 == 0) {
                    b.b(obj);
                    a aVar3 = this.this$0;
                    String str2 = this.$dynamicKey;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(aVar3.b);
                    if (str2 != null) {
                        sb2.append("[" + str2 + ']');
                    }
                    sb = sb2.toString();
                    kotlinx.coroutines.sync.a aVar4 = aVar3.g;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = aVar3;
                    this.L$3 = null;
                    this.L$4 = tseVar;
                    this.L$5 = aVar4;
                    this.L$6 = null;
                    this.L$7 = sb;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.I$2 = 0;
                    this.label = 1;
                    if (aVar4.a(this) != coroutineSingletons) {
                        aVar = aVar3;
                        g050Var = aVar4;
                        i = 0;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sb = (String) this.L$8;
                    g050Var2 = (g050) this.L$7;
                    th = (Throwable) this.L$6;
                    str = (String) this.L$5;
                    aVar2 = (a) this.L$2;
                    b.b(obj);
                    try {
                        if (jl40.l(aVar2.h.get(sb), str)) {
                            SharedPreferences.Editor edit = aVar2.f.edit();
                            edit.remove(sb);
                            edit.commit();
                            aVar2.h.remove(sb);
                        }
                        g050Var2.d(null);
                        throw new IllegalStateException(("Preferences by name='" + aVar2.a + "' for key='" + sb + "' have invalid format encodedValue='" + str + "', message='" + th.getMessage() + '\'').toString());
                    } finally {
                        g050Var2.d(null);
                    }
                }
                int i4 = this.I$1;
                i2 = this.I$0;
                String str3 = (String) this.L$7;
                g050Var = (g050) this.L$5;
                aVar = (a) this.L$2;
                b.b(obj);
                i = i4;
                sb = str3;
                LinkedHashMap linkedHashMap = aVar.h;
                if (linkedHashMap.containsKey(sb)) {
                    str = (String) linkedHashMap.get(sb);
                } else {
                    String string = aVar.f.getString(sb, null);
                    linkedHashMap.put(sb, string);
                    str = string;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th3) {
            failure = new Result.Failure(th3);
        }
        if (str == null) {
            throw new IllegalStateException(("Preferences by name='" + aVar.a + "' don't contain key='" + sb + '\'').toString());
        }
        try {
            failure = aVar.d.b(aVar.c, str);
        } catch (Throwable th4) {
            failure = new Result.Failure(th4);
        }
        Throwable a = Result.a(failure);
        if (a == null) {
            return new Result(failure);
        }
        kotlinx.coroutines.sync.a aVar5 = aVar.g;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = aVar;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = str;
        this.L$6 = a;
        this.L$7 = aVar5;
        this.L$8 = sb;
        this.L$9 = null;
        this.I$0 = i2;
        this.I$1 = i;
        this.I$2 = 0;
        this.I$3 = 0;
        this.label = 2;
        if (aVar5.a(this) != coroutineSingletons) {
            g050Var2 = aVar5;
            aVar2 = aVar;
            th = a;
            if (jl40.l(aVar2.h.get(sb), str)) {
            }
            g050Var2.d(null);
            throw new IllegalStateException(("Preferences by name='" + aVar2.a + "' for key='" + sb + "' have invalid format encodedValue='" + str + "', message='" + th.getMessage() + '\'').toString());
        }
        return coroutineSingletons;
    }
}
