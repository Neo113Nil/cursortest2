package com.ybsdk.core.utils.dto;

import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.dqg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(DataWithStatusResponse dataWithStatusResponse, wls wlsVar, Continuation continuation) {
        DataWithStatusEntityKt$extractEntityResult$3 dataWithStatusEntityKt$extractEntityResult$3;
        int i;
        if (continuation instanceof DataWithStatusEntityKt$extractEntityResult$3) {
            dataWithStatusEntityKt$extractEntityResult$3 = (DataWithStatusEntityKt$extractEntityResult$3) continuation;
            int i2 = dataWithStatusEntityKt$extractEntityResult$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$extractEntityResult$3.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$extractEntityResult$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$extractEntityResult$3.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                DataWithStatusEntityKt$extractEntityResult$4 dataWithStatusEntityKt$extractEntityResult$4 = new DataWithStatusEntityKt$extractEntityResult$4(wlsVar, null);
                dataWithStatusEntityKt$extractEntityResult$3.label = 1;
                Object b = b(dataWithStatusResponse, dataWithStatusEntityKt$extractEntityResult$4, dataWithStatusEntityKt$extractEntityResult$3);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        dataWithStatusEntityKt$extractEntityResult$3 = new DataWithStatusEntityKt$extractEntityResult$3(continuation);
        Object obj2 = dataWithStatusEntityKt$extractEntityResult$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$extractEntityResult$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(DataWithStatusResponse dataWithStatusResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        DataWithStatusEntityKt$extractEntityResultWithResult$1 dataWithStatusEntityKt$extractEntityResultWithResult$1;
        int i;
        Object f;
        Throwable a;
        if (continuationImpl instanceof DataWithStatusEntityKt$extractEntityResultWithResult$1) {
            dataWithStatusEntityKt$extractEntityResultWithResult$1 = (DataWithStatusEntityKt$extractEntityResultWithResult$1) continuationImpl;
            int i2 = dataWithStatusEntityKt$extractEntityResultWithResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$extractEntityResultWithResult$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$extractEntityResultWithResult$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$extractEntityResultWithResult$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dataWithStatusEntityKt$extractEntityResultWithResult$1.label = 1;
                    f = f(dataWithStatusResponse, wlsVar, dataWithStatusEntityKt$extractEntityResultWithResult$1);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    f = ((Result) obj).getValue();
                }
                a = Result.a(f);
                if (a == null) {
                    return new Result.Failure(a);
                }
                dqg dqgVar = (dqg) f;
                if (dqgVar instanceof cqg) {
                    return ((cqg) dqgVar).a;
                }
                if (dqgVar instanceof bqg) {
                    bqg bqgVar = (bqg) dqgVar;
                    return new Result.Failure(new FailDataException(bqgVar.a, bqgVar.b, bqgVar.c, bqgVar.d, bqgVar.e, bqgVar.f));
                }
                w511.b();
                return null;
            }
        }
        dataWithStatusEntityKt$extractEntityResultWithResult$1 = new DataWithStatusEntityKt$extractEntityResultWithResult$1(continuationImpl);
        Object obj2 = dataWithStatusEntityKt$extractEntityResultWithResult$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$extractEntityResultWithResult$1.label;
        if (i != 0) {
        }
        a = Result.a(f);
        if (a == null) {
        }
    }

    public static final Object c(DataWithStatusResponse dataWithStatusResponse) {
        int i = a.b[dataWithStatusResponse.getStatus().ordinal()];
        if (i == 1) {
            return zy11.a;
        }
        if (i != 2) {
            if (i != 3) {
                w511.b();
                return null;
            }
            return new Result.Failure(new Exception("unknown status " + dataWithStatusResponse));
        }
        if (dataWithStatusResponse.getFailData() == null) {
            return new Result.Failure(new Exception("failData null"));
        }
        String title = dataWithStatusResponse.getFailData().getTitle();
        String description = dataWithStatusResponse.getFailData().getDescription();
        UtilsThemedParameter<String> icon = dataWithStatusResponse.getFailData().getIcon();
        return new Result.Failure(new FailDataException(title, description, icon != null ? icon.toEntity() : null, dataWithStatusResponse.getFailData().getSupportUrl(), dataWithStatusResponse.getFailData().getTechInfo(), dataWithStatusResponse.getFailData().getTraceId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(DataWithStatusResponse dataWithStatusResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        DataWithStatusEntityKt$toEntity$3 dataWithStatusEntityKt$toEntity$3;
        int i;
        if (continuationImpl instanceof DataWithStatusEntityKt$toEntity$3) {
            dataWithStatusEntityKt$toEntity$3 = (DataWithStatusEntityKt$toEntity$3) continuationImpl;
            int i2 = dataWithStatusEntityKt$toEntity$3.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$toEntity$3.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$toEntity$3.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$toEntity$3.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                DataWithStatusEntityKt$toEntity$4 dataWithStatusEntityKt$toEntity$4 = new DataWithStatusEntityKt$toEntity$4(wlsVar, null);
                dataWithStatusEntityKt$toEntity$3.label = 1;
                Object f = f(dataWithStatusResponse, dataWithStatusEntityKt$toEntity$4, dataWithStatusEntityKt$toEntity$3);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        dataWithStatusEntityKt$toEntity$3 = new DataWithStatusEntityKt$toEntity$3(continuationImpl);
        Object obj2 = dataWithStatusEntityKt$toEntity$3.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$toEntity$3.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(OldDataWithStatusResponse oldDataWithStatusResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        DataWithStatusEntityKt$toEntity$1 dataWithStatusEntityKt$toEntity$1;
        int i;
        if (continuationImpl instanceof DataWithStatusEntityKt$toEntity$1) {
            dataWithStatusEntityKt$toEntity$1 = (DataWithStatusEntityKt$toEntity$1) continuationImpl;
            int i2 = dataWithStatusEntityKt$toEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$toEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$toEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$toEntity$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                DataWithStatusEntityKt$toEntity$2 dataWithStatusEntityKt$toEntity$2 = new DataWithStatusEntityKt$toEntity$2(wlsVar, null);
                dataWithStatusEntityKt$toEntity$1.label = 1;
                Object g = g(oldDataWithStatusResponse, dataWithStatusEntityKt$toEntity$2, dataWithStatusEntityKt$toEntity$1);
                return g == coroutineSingletons ? coroutineSingletons : g;
            }
        }
        dataWithStatusEntityKt$toEntity$1 = new DataWithStatusEntityKt$toEntity$1(continuationImpl);
        Object obj2 = dataWithStatusEntityKt$toEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$toEntity$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(DataWithStatusResponse dataWithStatusResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        DataWithStatusEntityKt$toResultEntity$5 dataWithStatusEntityKt$toResultEntity$5;
        int i;
        if (continuationImpl instanceof DataWithStatusEntityKt$toResultEntity$5) {
            dataWithStatusEntityKt$toResultEntity$5 = (DataWithStatusEntityKt$toResultEntity$5) continuationImpl;
            int i2 = dataWithStatusEntityKt$toResultEntity$5.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$toResultEntity$5.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$toResultEntity$5.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$toResultEntity$5.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = a.b[dataWithStatusResponse.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            return new Result.Failure(new Exception("unknown status " + dataWithStatusResponse));
                        }
                        if (dataWithStatusResponse.getFailData() == null) {
                            return new Result.Failure(new Exception("failData null"));
                        }
                        String title = dataWithStatusResponse.getFailData().getTitle();
                        String description = dataWithStatusResponse.getFailData().getDescription();
                        UtilsThemedParameter<String> icon = dataWithStatusResponse.getFailData().getIcon();
                        return new bqg(title, description, icon != null ? icon.toEntity() : null, dataWithStatusResponse.getFailData().getSupportUrl(), dataWithStatusResponse.getFailData().getTechInfo(), dataWithStatusResponse.getFailData().getTraceId());
                    }
                    if (dataWithStatusResponse.getSuccessData() == null) {
                        return new Result.Failure(new Exception("successData null"));
                    }
                    Object successData = dataWithStatusResponse.getSuccessData();
                    dataWithStatusEntityKt$toResultEntity$5.label = 1;
                    obj = wlsVar.invoke(successData, dataWithStatusEntityKt$toResultEntity$5);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                return value instanceof Result.Failure ? new cqg(value) : value;
            }
        }
        dataWithStatusEntityKt$toResultEntity$5 = new DataWithStatusEntityKt$toResultEntity$5(continuationImpl);
        Object obj3 = dataWithStatusEntityKt$toResultEntity$5.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$toResultEntity$5.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj3).getValue();
        if (value2 instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(OldDataWithStatusResponse oldDataWithStatusResponse, wls wlsVar, ContinuationImpl continuationImpl) {
        DataWithStatusEntityKt$toResultEntity$1 dataWithStatusEntityKt$toResultEntity$1;
        int i;
        if (continuationImpl instanceof DataWithStatusEntityKt$toResultEntity$1) {
            dataWithStatusEntityKt$toResultEntity$1 = (DataWithStatusEntityKt$toResultEntity$1) continuationImpl;
            int i2 = dataWithStatusEntityKt$toResultEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dataWithStatusEntityKt$toResultEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = dataWithStatusEntityKt$toResultEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataWithStatusEntityKt$toResultEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = a.a[oldDataWithStatusResponse.getStatus().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        if (oldDataWithStatusResponse.getFailData() == null) {
                            return new Result.Failure(new Exception("failData null"));
                        }
                        String error = oldDataWithStatusResponse.getFailData().getError();
                        if (error == null) {
                            error = "";
                        }
                        String str = error;
                        String description = oldDataWithStatusResponse.getFailData().getDescription();
                        String supportUrl = oldDataWithStatusResponse.getFailData().getSupportUrl();
                        String techInfo = oldDataWithStatusResponse.getFailData().getTechInfo();
                        String traceId = oldDataWithStatusResponse.getFailData().getTraceId();
                        UtilsThemedParameter<String> icon = oldDataWithStatusResponse.getFailData().getIcon();
                        return new bqg(str, description, icon != null ? icon.toEntity() : null, supportUrl, techInfo, traceId);
                    }
                    if (oldDataWithStatusResponse.getSuccessData() == null) {
                        return new Result.Failure(new Exception("successData null"));
                    }
                    Object successData = oldDataWithStatusResponse.getSuccessData();
                    dataWithStatusEntityKt$toResultEntity$1.label = 1;
                    obj = ((DataWithStatusEntityKt$toEntity$2) wlsVar).invoke(successData, dataWithStatusEntityKt$toResultEntity$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                return value instanceof Result.Failure ? new cqg(value) : value;
            }
        }
        dataWithStatusEntityKt$toResultEntity$1 = new DataWithStatusEntityKt$toResultEntity$1(continuationImpl);
        Object obj2 = dataWithStatusEntityKt$toResultEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataWithStatusEntityKt$toResultEntity$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        if (value2 instanceof Result.Failure) {
        }
    }
}
