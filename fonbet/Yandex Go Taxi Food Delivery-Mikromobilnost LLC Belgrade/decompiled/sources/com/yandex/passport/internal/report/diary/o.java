package com.yandex.passport.internal.report.diary;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.report.n9;
import com.yandex.passport.internal.report.p6;
import defpackage.bvf0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class o extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.flags.j b;
    public final n c;
    public final com.yandex.passport.common.a d;
    public final l e;

    public o(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.flags.j jVar, n nVar, com.yandex.passport.common.a aVar2, l lVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = jVar;
        this.c = nVar;
        this.d = aVar2;
        this.e = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[Catch: Exception -> 0x0038, LOOP:0: B:13:0x00a5->B:15:0x00ab, LOOP_END, TryCatch #0 {Exception -> 0x0038, blocks: (B:11:0x0034, B:12:0x009c, B:13:0x00a5, B:15:0x00ab, B:17:0x00de, B:24:0x0044, B:26:0x004e, B:27:0x007c), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o oVar, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, ContinuationImpl continuationImpl) {
        DiaryUploadUseCase$uploadDiaryMethodsForDay$1 diaryUploadUseCase$uploadDiaryMethodsForDay$1;
        int i;
        com.yandex.passport.internal.database.diary.f fVar2;
        o oVar2 = oVar;
        oVar2.getClass();
        try {
            if (continuationImpl instanceof DiaryUploadUseCase$uploadDiaryMethodsForDay$1) {
                diaryUploadUseCase$uploadDiaryMethodsForDay$1 = (DiaryUploadUseCase$uploadDiaryMethodsForDay$1) continuationImpl;
                int i2 = diaryUploadUseCase$uploadDiaryMethodsForDay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    diaryUploadUseCase$uploadDiaryMethodsForDay$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = diaryUploadUseCase$uploadDiaryMethodsForDay$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = diaryUploadUseCase$uploadDiaryMethodsForDay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            LogLevel logLevel = LogLevel.DEBUG;
                            StringBuilder sb = new StringBuilder("Start uploading methods for day: [");
                            sb.append((Object) com.yandex.passport.common.time.a.f(j));
                            sb.append(Extension.FIX_SPACE);
                            sb.append((Object) com.yandex.passport.common.time.a.f(j2));
                            sb.append("] with upload ");
                            fVar2 = fVar;
                            sb.append(fVar2);
                            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
                        } else {
                            fVar2 = fVar;
                        }
                        n nVar = oVar2.c;
                        diaryUploadUseCase$uploadDiaryMethodsForDay$1.L$0 = oVar2;
                        diaryUploadUseCase$uploadDiaryMethodsForDay$1.label = 1;
                        obj = tje.k0(((com.yandex.passport.common.coroutine.b) nVar.b).f, new DiaryUploadDaoWrapper$getMethodStats$2(nVar, j, j2, fVar2, null), diaryUploadUseCase$uploadDiaryMethodsForDay$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oVar2 = (o) diaryUploadUseCase$uploadDiaryMethodsForDay$1.L$0;
                        kotlin.b.b(obj);
                    }
                    List<d> list = (List) obj;
                    for (d dVar : list) {
                        String a = dVar.a();
                        int b = dVar.b();
                        l lVar = oVar2.e;
                        lVar.getClass();
                        lVar.f(new n9(a, 20), new com.yandex.passport.internal.report.a(a, 22, false), new com.yandex.passport.internal.report.a(b, 21));
                    }
                    return new Integer(list.size());
                }
            }
            if (i != 0) {
            }
            List<d> list2 = (List) obj;
            while (r2.hasNext()) {
            }
            return new Integer(list2.size());
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, String.valueOf(e.getMessage()), 8);
            }
            return new Integer(0);
        }
        diaryUploadUseCase$uploadDiaryMethodsForDay$1 = new DiaryUploadUseCase$uploadDiaryMethodsForDay$1(oVar2, continuationImpl);
        Object obj2 = diaryUploadUseCase$uploadDiaryMethodsForDay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryUploadUseCase$uploadDiaryMethodsForDay$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: Exception -> 0x0037, LOOP:0: B:13:0x00a2->B:15:0x00a8, LOOP_END, TryCatch #0 {Exception -> 0x0037, blocks: (B:11:0x0033, B:12:0x0099, B:13:0x00a2, B:15:0x00a8, B:17:0x00c4, B:24:0x0043, B:26:0x004d, B:27:0x007b), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(o oVar, long j, long j2, com.yandex.passport.internal.database.diary.f fVar, ContinuationImpl continuationImpl) {
        DiaryUploadUseCase$uploadDiaryParametersForDay$1 diaryUploadUseCase$uploadDiaryParametersForDay$1;
        int i;
        com.yandex.passport.internal.database.diary.f fVar2;
        o oVar2 = oVar;
        oVar2.getClass();
        try {
            if (continuationImpl instanceof DiaryUploadUseCase$uploadDiaryParametersForDay$1) {
                diaryUploadUseCase$uploadDiaryParametersForDay$1 = (DiaryUploadUseCase$uploadDiaryParametersForDay$1) continuationImpl;
                int i2 = diaryUploadUseCase$uploadDiaryParametersForDay$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    diaryUploadUseCase$uploadDiaryParametersForDay$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = diaryUploadUseCase$uploadDiaryParametersForDay$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = diaryUploadUseCase$uploadDiaryParametersForDay$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            LogLevel logLevel = LogLevel.DEBUG;
                            StringBuilder sb = new StringBuilder("Start uploading parameters for day: [");
                            sb.append((Object) com.yandex.passport.common.time.a.f(j));
                            sb.append(Extension.FIX_SPACE);
                            sb.append((Object) com.yandex.passport.common.time.a.f(j2));
                            sb.append("] with upload ");
                            fVar2 = fVar;
                            sb.append(fVar2);
                            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
                        } else {
                            fVar2 = fVar;
                        }
                        n nVar = oVar2.c;
                        diaryUploadUseCase$uploadDiaryParametersForDay$1.L$0 = oVar2;
                        diaryUploadUseCase$uploadDiaryParametersForDay$1.label = 1;
                        obj = tje.k0(((com.yandex.passport.common.coroutine.b) nVar.b).f, new DiaryUploadDaoWrapper$getParameterStats$2(nVar, j, j2, fVar2, null), diaryUploadUseCase$uploadDiaryParametersForDay$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oVar2 = (o) diaryUploadUseCase$uploadDiaryParametersForDay$1.L$0;
                        kotlin.b.b(obj);
                    }
                    List<e> list = (List) obj;
                    for (e eVar : list) {
                        String a = eVar.a();
                        String b = eVar.b();
                        String c = eVar.c();
                        oVar2.e.k(eVar.d(), a, b, c);
                    }
                    return new Integer(list.size());
                }
            }
            if (i != 0) {
            }
            List<e> list2 = (List) obj;
            while (r2.hasNext()) {
            }
            return new Integer(list2.size());
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, String.valueOf(e.getMessage()), 8);
            }
            return new Integer(0);
        }
        diaryUploadUseCase$uploadDiaryParametersForDay$1 = new DiaryUploadUseCase$uploadDiaryParametersForDay$1(oVar2, continuationImpl);
        Object obj2 = diaryUploadUseCase$uploadDiaryParametersForDay$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryUploadUseCase$uploadDiaryParametersForDay$1.label;
    }

    @Override // com.yandex.passport.common.domain.d
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return e(continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(7:11|12|13|14|(3:16|(1:18)|19)|20|21)(2:23|24))(3:25|26|27))(3:36|37|(4:39|(1:41)|42|43)(6:44|(1:46)|47|(1:49)(1:52)|(1:51)|30))|28|(6:31|13|14|(0)|20|21)|30))|54|6|7|(0)(0)|28|(0)|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0032, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Continuation continuation) {
        DiaryUploadUseCase$run$1 diaryUploadUseCase$run$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object failure;
        Throwable a;
        o oVar;
        if (continuation instanceof DiaryUploadUseCase$run$1) {
            diaryUploadUseCase$run$1 = (DiaryUploadUseCase$run$1) continuation;
            int i2 = diaryUploadUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diaryUploadUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                obj = diaryUploadUseCase$run$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diaryUploadUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!((Boolean) this.b.b(q.H)).booleanValue()) {
                        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Skip uploading diary: Disabled by flag", 8);
                        }
                        return new Result(new Integer(0));
                    }
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Start uploading diary", 8);
                    }
                    n nVar = this.c;
                    this.d.getClass();
                    long a2 = com.yandex.passport.common.a.a() - com.yandex.passport.common.util.a.k(0, 253);
                    diaryUploadUseCase$run$1.L$0 = this;
                    diaryUploadUseCase$run$1.L$1 = this;
                    diaryUploadUseCase$run$1.label = 1;
                    Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) nVar.b).f, new DiaryUploadDaoWrapper$deleteUploaded$2(nVar, a2, null), diaryUploadUseCase$run$1);
                    if (k0 != coroutineSingletons) {
                        k0 = zy11.a;
                    }
                    if (k0 != coroutineSingletons) {
                        oVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (o) diaryUploadUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    failure = new Integer(((Number) obj).intValue());
                    a = Result.a(failure);
                    if (a != null) {
                        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Internal error catching to calling DiaryUploadDaoWrapper::deleteUploaded", a);
                        }
                        this.e.j(a, MethodDiary.DELETE_UPLOADED);
                    }
                    return new Result(failure);
                }
                this = (o) diaryUploadUseCase$run$1.L$1;
                oVar = (o) diaryUploadUseCase$run$1.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th) {
                    th = th;
                    this = oVar;
                    failure = new Result.Failure(th);
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    return new Result(failure);
                }
                diaryUploadUseCase$run$1.L$0 = oVar;
                diaryUploadUseCase$run$1.L$1 = null;
                diaryUploadUseCase$run$1.label = 2;
                obj = this.f(diaryUploadUseCase$run$1);
                if (obj != coroutineSingletons) {
                    this = oVar;
                    failure = new Integer(((Number) obj).intValue());
                    a = Result.a(failure);
                    if (a != null) {
                    }
                    return new Result(failure);
                }
                return coroutineSingletons;
            }
        }
        diaryUploadUseCase$run$1 = new DiaryUploadUseCase$run$1(this, (ContinuationImpl) continuation);
        obj = diaryUploadUseCase$run$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryUploadUseCase$run$1.label;
        if (i != 0) {
        }
        diaryUploadUseCase$run$1.L$0 = oVar;
        diaryUploadUseCase$run$1.L$1 = null;
        diaryUploadUseCase$run$1.label = 2;
        obj = this.f(diaryUploadUseCase$run$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0193 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024a A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0297 A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b A[Catch: Exception -> 0x003e, TryCatch #0 {Exception -> 0x003e, blocks: (B:14:0x0039, B:15:0x0263, B:21:0x005b, B:24:0x020e, B:25:0x018d, B:27:0x0193, B:29:0x01b3, B:30:0x01e0, B:35:0x024a, B:39:0x006e, B:40:0x00b4, B:42:0x00b8, B:44:0x00d5, B:45:0x0102, B:47:0x0111, B:49:0x0119, B:50:0x0122, B:52:0x0129, B:54:0x0131, B:55:0x013a, B:56:0x013c, B:60:0x0157, B:62:0x0165, B:63:0x0179, B:58:0x028a, B:64:0x0297, B:66:0x02a1, B:67:0x02aa, B:70:0x0076, B:71:0x0096, B:74:0x009b, B:78:0x007d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0208 -> B:23:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        DiaryUploadUseCase$uploadDiaryForIntervals$1 diaryUploadUseCase$uploadDiaryForIntervals$1;
        int i;
        Long l;
        long b;
        long j;
        o oVar;
        Collection arrayList;
        DiaryUploadUseCase$uploadDiaryForIntervals$1 diaryUploadUseCase$uploadDiaryForIntervals$12;
        Iterator it;
        o oVar2;
        o oVar3 = this;
        try {
            if (continuationImpl instanceof DiaryUploadUseCase$uploadDiaryForIntervals$1) {
                diaryUploadUseCase$uploadDiaryForIntervals$1 = (DiaryUploadUseCase$uploadDiaryForIntervals$1) continuationImpl;
                int i2 = diaryUploadUseCase$uploadDiaryForIntervals$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    diaryUploadUseCase$uploadDiaryForIntervals$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = diaryUploadUseCase$uploadDiaryForIntervals$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = diaryUploadUseCase$uploadDiaryForIntervals$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        n nVar = oVar3.c;
                        diaryUploadUseCase$uploadDiaryForIntervals$1.L$0 = oVar3;
                        diaryUploadUseCase$uploadDiaryForIntervals$1.label = 1;
                        obj = tje.k0(((com.yandex.passport.common.coroutine.b) nVar.b).f, new DiaryUploadDaoWrapper$getLastUploadTimestamp$2(nVar, null), diaryUploadUseCase$uploadDiaryForIntervals$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                oVar3 = (o) diaryUploadUseCase$uploadDiaryForIntervals$1.L$0;
                                kotlin.b.b(obj);
                                l = (Long) obj;
                                if (l == null) {
                                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Nothing to upload", 8);
                                    }
                                    return new Integer(0);
                                }
                                b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, l.longValue());
                                oVar3.d.getClass();
                                long a = com.yandex.passport.common.a.a();
                                j = a - b;
                                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Try start uploading: lastUploadTime=" + ((Object) com.yandex.passport.common.time.a.f(b)) + ", now=" + ((Object) com.yandex.passport.common.time.a.f(a)) + ", interval=" + ((Object) com.yandex.passport.common.time.a.f(j)), 8);
                                }
                                if (jl40.r(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "It's not a time for upload a diary now.", 8);
                                    }
                                    return new Integer(0);
                                }
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "It's a good time to upload", 8);
                                }
                                Collection collection = EmptyList.a;
                                while (true) {
                                    long c = com.yandex.passport.common.time.a.c(24, 0, 0, 14) + b;
                                    Pair pair = new Pair(new com.yandex.passport.common.time.a(b), new com.yandex.passport.common.time.a(a));
                                    if (jl40.r(c, a) > 0) {
                                        break;
                                    }
                                    collection = kotlin.collections.a.o0(collection, pair);
                                    b = c;
                                }
                                LogLevel logLevel = LogLevel.DEBUG;
                                com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(logLevel, null, "Uploading diary for intervals: " + collection, 10);
                                }
                                Collection collection2 = collection;
                                oVar = oVar3;
                                arrayList = new ArrayList(tcc.n(collection2, 10));
                                diaryUploadUseCase$uploadDiaryForIntervals$12 = diaryUploadUseCase$uploadDiaryForIntervals$1;
                                it = collection2.iterator();
                                if (it.hasNext()) {
                                }
                                return coroutineSingletons;
                            }
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oVar2 = (o) diaryUploadUseCase$uploadDiaryForIntervals$1.L$0;
                                kotlin.b.b(obj);
                                Integer num = new Integer(kotlin.collections.a.z0((Iterable) obj));
                                int intValue = num.intValue();
                                l lVar = oVar2.e;
                                lVar.getClass();
                                lVar.f(p6.w, new com.yandex.passport.internal.report.a(intValue, 21));
                                return num;
                            }
                            long j2 = diaryUploadUseCase$uploadDiaryForIntervals$1.J$1;
                            long j3 = diaryUploadUseCase$uploadDiaryForIntervals$1.J$0;
                            arrayList = (Collection) diaryUploadUseCase$uploadDiaryForIntervals$1.L$3;
                            Iterator it2 = (Iterator) diaryUploadUseCase$uploadDiaryForIntervals$1.L$2;
                            Collection collection3 = (Collection) diaryUploadUseCase$uploadDiaryForIntervals$1.L$1;
                            o oVar4 = (o) diaryUploadUseCase$uploadDiaryForIntervals$1.L$0;
                            kotlin.b.b(obj);
                            diaryUploadUseCase$uploadDiaryForIntervals$12 = diaryUploadUseCase$uploadDiaryForIntervals$1;
                            o oVar5 = oVar4;
                            it = it2;
                            Object obj2 = obj;
                            Collection collection4 = collection3;
                            long j4 = j3;
                            long j5 = j2;
                            com.yandex.passport.internal.database.diary.f fVar = (com.yandex.passport.internal.database.diary.f) obj2;
                            arrayList.add(new Pair(tje.h(bvf0.a(diaryUploadUseCase$uploadDiaryForIntervals$12.get_context()), null, null, new DiaryUploadUseCase$uploadDiaryForIntervals$6$2(oVar5, j4, j5, fVar, null), 3), tje.h(bvf0.a(diaryUploadUseCase$uploadDiaryForIntervals$12.get_context()), null, null, new DiaryUploadUseCase$uploadDiaryForIntervals$6$3(oVar5, j4, j5, fVar, null), 3)));
                            arrayList = collection4;
                            oVar = oVar5;
                            if (it.hasNext()) {
                                Pair pair2 = (Pair) it.next();
                                j3 = ((com.yandex.passport.common.time.a) pair2.getFirst()).a;
                                j2 = ((com.yandex.passport.common.time.a) pair2.getSecond()).a;
                                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Uploading diary for interval: [" + ((Object) com.yandex.passport.common.time.a.f(j3)) + Extension.FIX_SPACE + ((Object) com.yandex.passport.common.time.a.f(j2)) + ']', 8);
                                }
                                n nVar2 = oVar.c;
                                com.yandex.passport.internal.database.diary.f fVar2 = new com.yandex.passport.internal.database.diary.f(j2);
                                diaryUploadUseCase$uploadDiaryForIntervals$12.L$0 = oVar;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.L$1 = arrayList;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.L$2 = it;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.L$3 = arrayList;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.J$0 = j3;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.J$1 = j2;
                                diaryUploadUseCase$uploadDiaryForIntervals$12.label = 3;
                                Object k0 = tje.k0(((com.yandex.passport.common.coroutine.b) nVar2.b).f, new DiaryUploadDaoWrapper$insertAndGet$2(nVar2, fVar2, null), diaryUploadUseCase$uploadDiaryForIntervals$12);
                                if (k0 != coroutineSingletons) {
                                    oVar5 = oVar;
                                    obj2 = k0;
                                    collection4 = arrayList;
                                    long j42 = j3;
                                    long j52 = j2;
                                    com.yandex.passport.internal.database.diary.f fVar3 = (com.yandex.passport.internal.database.diary.f) obj2;
                                    arrayList.add(new Pair(tje.h(bvf0.a(diaryUploadUseCase$uploadDiaryForIntervals$12.get_context()), null, null, new DiaryUploadUseCase$uploadDiaryForIntervals$6$2(oVar5, j42, j52, fVar3, null), 3), tje.h(bvf0.a(diaryUploadUseCase$uploadDiaryForIntervals$12.get_context()), null, null, new DiaryUploadUseCase$uploadDiaryForIntervals$6$3(oVar5, j42, j52, fVar3, null), 3)));
                                    arrayList = collection4;
                                    oVar = oVar5;
                                    if (it.hasNext()) {
                                        ArrayList l2 = com.yandex.passport.internal.ui.c.l((List) arrayList);
                                        diaryUploadUseCase$uploadDiaryForIntervals$12.L$0 = oVar;
                                        diaryUploadUseCase$uploadDiaryForIntervals$12.L$1 = null;
                                        diaryUploadUseCase$uploadDiaryForIntervals$12.L$2 = null;
                                        diaryUploadUseCase$uploadDiaryForIntervals$12.L$3 = null;
                                        diaryUploadUseCase$uploadDiaryForIntervals$12.label = 4;
                                        obj = kotlinx.coroutines.a.b(l2, diaryUploadUseCase$uploadDiaryForIntervals$12);
                                        if (obj != coroutineSingletons) {
                                            oVar2 = oVar;
                                            Integer num2 = new Integer(kotlin.collections.a.z0((Iterable) obj));
                                            int intValue2 = num2.intValue();
                                            l lVar2 = oVar2.e;
                                            lVar2.getClass();
                                            lVar2.f(p6.w, new com.yandex.passport.internal.report.a(intValue2, 21));
                                            return num2;
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        }
                        oVar3 = (o) diaryUploadUseCase$uploadDiaryForIntervals$1.L$0;
                        kotlin.b.b(obj);
                    }
                    l = (Long) obj;
                    if (l == null) {
                        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, l.longValue());
                        oVar3.d.getClass();
                        long a2 = com.yandex.passport.common.a.a();
                        j = a2 - b;
                        com.yandex.passport.common.logger.c cVar22 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        if (jl40.r(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                        }
                    } else {
                        n nVar3 = oVar3.c;
                        diaryUploadUseCase$uploadDiaryForIntervals$1.L$0 = oVar3;
                        diaryUploadUseCase$uploadDiaryForIntervals$1.label = 2;
                        obj = tje.k0(((com.yandex.passport.common.coroutine.b) nVar3.b).f, new DiaryUploadDaoWrapper$getFirstIssueTimestamp$2(nVar3, null), diaryUploadUseCase$uploadDiaryForIntervals$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        l = (Long) obj;
                        if (l == null) {
                        }
                        b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, l.longValue());
                        oVar3.d.getClass();
                        long a22 = com.yandex.passport.common.a.a();
                        j = a22 - b;
                        com.yandex.passport.common.logger.c cVar222 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        }
                        if (jl40.r(j, com.yandex.passport.common.time.a.c(24, 0, 0, 14)) < 0) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            l = (Long) obj;
            if (l == null) {
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.WARN, null, String.valueOf(e.getMessage()), 8);
            }
            return new Integer(0);
        }
        diaryUploadUseCase$uploadDiaryForIntervals$1 = new DiaryUploadUseCase$uploadDiaryForIntervals$1(oVar3, continuationImpl);
        Object obj3 = diaryUploadUseCase$uploadDiaryForIntervals$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diaryUploadUseCase$uploadDiaryForIntervals$1.label;
    }
}
