package com.yandex.go.image.loader.domain;

import android.content.Context;
import defpackage.cne0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.image.loader.domain.CoilAfterMigrationClean$onLargestContentfulPaint$1", f = "CoilAfterMigrationClean.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class CoilAfterMigrationClean$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoilAfterMigrationClean$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoilAfterMigrationClean$onLargestContentfulPaint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CoilAfterMigrationClean$onLargestContentfulPaint$1 coilAfterMigrationClean$onLargestContentfulPaint$1 = (CoilAfterMigrationClean$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        coilAfterMigrationClean$onLargestContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        Context context = aVar.a;
        cne0 cne0Var = aVar.d;
        if (!cne0Var.g("migration_complete", false)) {
            jst.e.n("CoilAfterMigrationClean: start clean old caches");
            try {
                kotlin.io.b.l(kotlin.io.b.o(context.getCacheDir(), "image_manager_disk_cache"));
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable unused) {
            }
            try {
                kotlin.io.b.l(kotlin.io.b.o(context.getCacheDir(), "network-cache"));
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
            jst.e.n("CoilAfterMigrationClean: clean old finished");
            cne0Var.d().putBoolean("migration_complete", true).commit();
        }
        a aVar2 = this.this$0;
        cne0 cne0Var2 = aVar2.d;
        if (!cne0Var2.g("old_cache_clean_complete", false)) {
            try {
                kotlin.io.b.l(kotlin.io.b.o(aVar2.a.getCacheDir(), "network-protocol-cache"));
            } catch (CancellationException e3) {
                throw e3;
            } catch (Throwable unused3) {
            }
            cne0Var2.d().putBoolean("old_cache_clean_complete", true).commit();
        }
        return zy11.a;
    }
}
