package com.yandex.passport.internal.report.diary;

import com.yandex.passport.common.logger.LogLevel;
import defpackage.ny61;
import defpackage.tje;
import defpackage.zko;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.passport.common.coroutine.a a;
    public final com.yandex.passport.internal.database.diary.d b;
    public final l c;

    public c(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.database.diary.d dVar, l lVar) {
        this.a = aVar;
        this.b = dVar;
        this.c = lVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(3:15|(1:17)|18)|19))|35|6|7|(0)(0)|12|13|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.internal.database.diary.a aVar, ContinuationImpl continuationImpl) {
        DiaryEntityRecorder$record$1 diaryEntityRecorder$record$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiaryEntityRecorder$record$1) {
            diaryEntityRecorder$record$1 = (DiaryEntityRecorder$record$1) continuationImpl;
            int i2 = diaryEntityRecorder$record$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryEntityRecorder$record$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryEntityRecorder$record$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryEntityRecorder$record$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zko zkoVar = ((com.yandex.passport.common.coroutine.b) this.a).f;
                    DiaryEntityRecorder$record$2$1 diaryEntityRecorder$record$2$1 = new DiaryEntityRecorder$record$2$1(this, aVar, null);
                    diaryEntityRecorder$record$1.L$0 = this;
                    diaryEntityRecorder$record$1.label = 1;
                    if (tje.k0(zkoVar, diaryEntityRecorder$record$2$1, diaryEntityRecorder$record$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) diaryEntityRecorder$record$1.L$0;
                    kotlin.b.b(obj);
                }
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Internal error catching to calling DiaryRecordDao::insertMethod", a);
                    }
                    this.c.j(a, MethodDiary.INSERT_METHOD);
                }
                return obj2;
            }
        }
        diaryEntityRecorder$record$1 = new DiaryEntityRecorder$record$1(this, continuationImpl);
        Object obj3 = diaryEntityRecorder$record$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryEntityRecorder$record$1.label;
        if (i != 0) {
        }
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a != null) {
        }
        return obj22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:22|23))(3:24|25|(1:27))|12|13|(3:15|(1:17)|18)|19))|35|6|7|(0)(0)|12|13|(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(com.yandex.passport.internal.database.diary.b bVar, ContinuationImpl continuationImpl) {
        DiaryEntityRecorder$record$4 diaryEntityRecorder$record$4;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiaryEntityRecorder$record$4) {
            diaryEntityRecorder$record$4 = (DiaryEntityRecorder$record$4) continuationImpl;
            int i2 = diaryEntityRecorder$record$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryEntityRecorder$record$4.label = i2 - Integer.MIN_VALUE;
                Object obj = diaryEntityRecorder$record$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryEntityRecorder$record$4.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zko zkoVar = ((com.yandex.passport.common.coroutine.b) this.a).f;
                    DiaryEntityRecorder$record$5$1 diaryEntityRecorder$record$5$1 = new DiaryEntityRecorder$record$5$1(this, bVar, null);
                    diaryEntityRecorder$record$4.L$0 = this;
                    diaryEntityRecorder$record$4.label = 1;
                    if (tje.k0(zkoVar, diaryEntityRecorder$record$5$1, diaryEntityRecorder$record$4) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (c) diaryEntityRecorder$record$4.L$0;
                    kotlin.b.b(obj);
                }
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a != null) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Internal error catching to calling DiaryRecordDao::insertParameter", a);
                    }
                    this.c.j(a, MethodDiary.INSERT_PARAMETER);
                }
                return obj2;
            }
        }
        diaryEntityRecorder$record$4 = new DiaryEntityRecorder$record$4(this, continuationImpl);
        Object obj3 = diaryEntityRecorder$record$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryEntityRecorder$record$4.label;
        if (i != 0) {
        }
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a != null) {
        }
        return obj22;
    }
}
