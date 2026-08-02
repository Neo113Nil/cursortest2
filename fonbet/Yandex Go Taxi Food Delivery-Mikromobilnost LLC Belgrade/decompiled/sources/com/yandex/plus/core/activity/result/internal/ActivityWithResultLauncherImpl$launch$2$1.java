package com.yandex.plus.core.activity.result.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import androidx.lifecycle.Lifecycle;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.ie60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pb;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.vg10;
import defpackage.vuu0;
import defpackage.wls;
import defpackage.x40;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0000*\u00020\u0002H\n"}, d2 = {"", "O", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl$launch$2$1", f = "ActivityWithResultLauncherImpl.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 58, 61, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ActivityWithResultLauncherImpl$launch$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ x40 $contract;
    final /* synthetic */ Object $input;
    final /* synthetic */ c $this_runSuspendCatching;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/plus/core/activity/result/internal/PlusProxyActivity;", "<anonymous>", "(Ltse;)Lcom/yandex/plus/core/activity/result/internal/PlusProxyActivity;"}, k = 3, mv = {2, 2, 0})
    @mvg(c = "com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl$launch$2$1$1", f = "ActivityWithResultLauncherImpl.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl$launch$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ c $this_runSuspendCatching;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.$this_runSuspendCatching = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_runSuspendCatching, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.$this_runSuspendCatching;
            this.label = 1;
            Object y = e.y(new pb(cVar.c, 2), this);
            return y == coroutineSingletons ? coroutineSingletons : y;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityWithResultLauncherImpl$launch$2$1(c cVar, x40 x40Var, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$this_runSuspendCatching = cVar;
        this.$contract = x40Var;
        this.$input = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ActivityWithResultLauncherImpl$launch$2$1 activityWithResultLauncherImpl$launch$2$1 = new ActivityWithResultLauncherImpl$launch$2$1(this.$this_runSuspendCatching, this.$contract, this.$input, continuation);
        activityWithResultLauncherImpl$launch$2$1.L$0 = obj;
        return activityWithResultLauncherImpl$launch$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActivityWithResultLauncherImpl$launch$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0145, code lost:
    
        if (r14 != r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0126, code lost:
    
        if (r14 == r0) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Object obj2;
        d dVar;
        Ref$BooleanRef ref$BooleanRef;
        c cVar;
        int i;
        Object obj3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Ref$BooleanRef ref$BooleanRef2 = this.label;
        int i2 = 2;
        int i3 = 1;
        try {
        } catch (Throwable th2) {
            if (!ref$BooleanRef2.element) {
                throw th2;
            }
            ie60 ie60Var = ie60.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_runSuspendCatching, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = th2;
            this.L$4 = null;
            this.label = 5;
            Object k0 = tje.k0(ie60Var, anonymousClass1, this);
            if (k0 != coroutineSingletons) {
                th = th2;
                obj = k0;
            }
        }
        if (ref$BooleanRef2 == 0) {
            kotlin.b.b(obj);
            if (this.$this_runSuspendCatching.a == null) {
                StringBuilder x = unr0.x("\n            'com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl' не инициализирован!\n            Возможно, вы вызываете эту функцию вне процесса инициализации объекта класса!\n            Название текущего процесса: ", Build.VERSION.SDK_INT >= 33 ? Process.myProcessName() : "доступно с 13 андроида :c", "\n            Идентификатор текущего процесса: ");
                x.append(Process.myPid());
                x.append("\n            \n            Если есть необходимость использовать данный функционал не из основного процесса,\n            то необходимо прописать в AndroidManifest.xml `InitializationProvider` со значением параметра \n            android:authorities, отличным от \"$\\{applicationId}.androidx-startup\", и добавить ему\n            название дочернего процесса после двоеточия в параметр android:process.\n            Также нужно добавить тег android:process для \n            `com.yandex.plus.core.activity.result.internal.PlusProxyActivity`.\n            Пример:\n            ```\n            <activity\n                android:name=\"com.yandex.plus.core.activity.result.internal.PlusProxyActivity\"\n                android:process=\":customProc\"\n                tools:node=\"merge\" />\n                \n            <provider\n                android:name=\"androidx.startup.InitializationProvider\"\n                android:authorities=\"$\\{applicationId}.androidx-startup\"\n                android:process=\":customProc\"\n                tools:node=\"merge\">\n            ```\n            ");
                vg10.d(vuu0.c(x.toString()));
                return null;
            }
            Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
            Iterator it = this.$this_runSuspendCatching.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((d) obj2).b.a(Lifecycle.State.RESUMED)) {
                    break;
                }
            }
            dVar = (d) obj2;
            if (dVar == null) {
                c cVar2 = this.$this_runSuspendCatching;
                this.L$0 = null;
                this.L$1 = ref$BooleanRef3;
                this.L$2 = cVar2;
                this.L$3 = null;
                this.I$0 = 0;
                this.label = 1;
                Object y = e.y(new pb(cVar2.c, i3), this);
                if (y != coroutineSingletons) {
                    ref$BooleanRef = ref$BooleanRef3;
                    obj = y;
                    cVar = cVar2;
                    i = 0;
                }
                return coroutineSingletons;
            }
            ref$BooleanRef = ref$BooleanRef3;
            x40 x40Var = this.$contract;
            Object obj4 = this.$input;
            this.L$0 = null;
            this.L$1 = ref$BooleanRef;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            obj = dVar.W(x40Var, obj4, this);
        } else if (ref$BooleanRef2 == 1) {
            int i4 = this.I$0;
            c cVar3 = (c) this.L$2;
            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) this.L$1;
            kotlin.b.b(obj);
            i = i4;
            ref$BooleanRef = ref$BooleanRef4;
            cVar = cVar3;
        } else {
            if (ref$BooleanRef2 != 2) {
                if (ref$BooleanRef2 != 3) {
                    if (ref$BooleanRef2 == 4) {
                        obj3 = this.L$3;
                        kotlin.b.b(obj);
                        ((PlusProxyActivity) obj).finish();
                        return obj3;
                    }
                    if (ref$BooleanRef2 != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) this.L$3;
                    kotlin.b.b(obj);
                    ((PlusProxyActivity) obj).finish();
                    throw th;
                }
                ref$BooleanRef = (Ref$BooleanRef) this.L$1;
                kotlin.b.b(obj);
                ref$BooleanRef2 = ref$BooleanRef.element;
                if (ref$BooleanRef2 == 0) {
                    return obj;
                }
                ie60 ie60Var2 = ie60.a;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.$this_runSuspendCatching, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = obj;
                this.label = 4;
                Object k02 = tje.k0(ie60Var2, anonymousClass12, this);
                if (k02 != coroutineSingletons) {
                    obj3 = obj;
                    obj = k02;
                    ((PlusProxyActivity) obj).finish();
                    return obj3;
                }
                return coroutineSingletons;
            }
            ref$BooleanRef = (Ref$BooleanRef) this.L$1;
            kotlin.b.b(obj);
            dVar = ((PlusProxyActivity) obj).getViewModel();
            x40 x40Var2 = this.$contract;
            Object obj42 = this.$input;
            this.L$0 = null;
            this.L$1 = ref$BooleanRef;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.label = 3;
            obj = dVar.W(x40Var2, obj42, this);
        }
        Activity activity = (Activity) obj;
        activity.startActivity(new Intent(activity, (Class<?>) PlusProxyActivity.class));
        ref$BooleanRef.element = true;
        this.L$0 = null;
        this.L$1 = ref$BooleanRef;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.I$0 = i;
        this.label = 2;
        obj = e.y(new pb(cVar.c, i2), this);
    }
}
