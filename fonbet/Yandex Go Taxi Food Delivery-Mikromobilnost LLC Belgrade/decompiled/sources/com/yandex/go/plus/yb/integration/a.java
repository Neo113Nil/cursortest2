package com.yandex.go.plus.yb.integration;

import com.yandex.go.yb.domain.r;
import defpackage.ny61;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final /* synthetic */ r a;

    public a(r rVar) {
        this.a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1 plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1;
        int i;
        try {
            if (continuationImpl instanceof PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1) {
                plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1 = (PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1) continuationImpl;
                int i2 = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.label;
                    if (i != 0) {
                        b.b(obj);
                        r rVar = this.a;
                        plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.label = 1;
                        if (rVar.a(plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1 = new PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1(this, continuationImpl);
        Object obj2 = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuth$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1 plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1;
        int i;
        try {
            if (continuationImpl instanceof PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1) {
                plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1 = (PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1) continuationImpl;
                int i2 = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.label;
                    if (i != 0) {
                        b.b(obj);
                        r rVar = this.a;
                        plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.label = 1;
                        if (rVar.a(plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1 = new PlusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1(this, continuationImpl);
        Object obj2 = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusYbSdkAdapterMapperImpl$wrapToPlusTreasuryAdapter$1$onNeedAuthToPortal$1.label;
    }
}
