package com.ybsdk.feature.main.internal.data.network;

import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.UtilsThemedParameter;
import com.ybsdk.core.utils.dto.common.NoReply;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import com.ybsdk.feature.main.internal.data.network.dto.SbpAccountDetailsResponse;
import com.ybsdk.feature.main.internal.data.network.dto.UnbindAccountSheetDto;
import com.ybsdk.feature.main.internal.data.network.dto.UnbindAccountSnackbarDto;
import defpackage.bqg;
import defpackage.bx11;
import defpackage.cqg;
import defpackage.cx11;
import defpackage.dx11;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.rr51;
import defpackage.w511;
import defpackage.wdm0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class c {
    public final SbpAccountApi a;

    public c(SbpAccountApi sbpAccountApi) {
        this.a = sbpAccountApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, SbpAccountDetailsResponse sbpAccountDetailsResponse, ContinuationImpl continuationImpl) {
        SbpAccountRepository$toResultEntity$1 sbpAccountRepository$toResultEntity$1;
        int i;
        Object b;
        cVar.getClass();
        if (continuationImpl instanceof SbpAccountRepository$toResultEntity$1) {
            sbpAccountRepository$toResultEntity$1 = (SbpAccountRepository$toResultEntity$1) continuationImpl;
            int i2 = sbpAccountRepository$toResultEntity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpAccountRepository$toResultEntity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpAccountRepository$toResultEntity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpAccountRepository$toResultEntity$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.feature.divkit.api.domain.a aVar = new com.ybsdk.feature.divkit.api.domain.a(null);
                    DivDataDto divkitData = sbpAccountDetailsResponse.getDivkitData();
                    sbpAccountRepository$toResultEntity$1.L$0 = sbpAccountDetailsResponse;
                    sbpAccountRepository$toResultEntity$1.label = 1;
                    b = aVar.b(divkitData, sbpAccountRepository$toResultEntity$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sbpAccountDetailsResponse = (SbpAccountDetailsResponse) sbpAccountRepository$toResultEntity$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                kotlin.b.b(b);
                UnbindAccountSheetDto unbindAccountSheet = sbpAccountDetailsResponse.getUnbindAccountSheet();
                return new wdm0((rr51) b, new cx11(unbindAccountSheet.getTitle(), unbindAccountSheet.getDescription(), new bx11(unbindAccountSheet.getPrimaryButton().getText()), new bx11(unbindAccountSheet.getSecondaryButton().getText()), e(unbindAccountSheet.getSuccessSnackbar()), e(unbindAccountSheet.getFailureSnackbar())));
            }
        }
        sbpAccountRepository$toResultEntity$1 = new SbpAccountRepository$toResultEntity$1(cVar, continuationImpl);
        Object obj2 = sbpAccountRepository$toResultEntity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpAccountRepository$toResultEntity$1.label;
        if (i != 0) {
        }
        kotlin.b.b(b);
        UnbindAccountSheetDto unbindAccountSheet2 = sbpAccountDetailsResponse.getUnbindAccountSheet();
        return new wdm0((rr51) b, new cx11(unbindAccountSheet2.getTitle(), unbindAccountSheet2.getDescription(), new bx11(unbindAccountSheet2.getPrimaryButton().getText()), new bx11(unbindAccountSheet2.getSecondaryButton().getText()), e(unbindAccountSheet2.getSuccessSnackbar()), e(unbindAccountSheet2.getFailureSnackbar())));
    }

    public static dx11 e(UnbindAccountSnackbarDto unbindAccountSnackbarDto) {
        Text.Constant i = g8e.i(Text.Companion, unbindAccountSnackbarDto.getTitle());
        String subtitle = unbindAccountSnackbarDto.getSubtitle();
        return new dx11(i, subtitle != null ? new Text.Constant(subtitle) : Text.Empty.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        SbpAccountRepository$bindSbpAccount$1 sbpAccountRepository$bindSbpAccount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SbpAccountRepository$bindSbpAccount$1) {
            sbpAccountRepository$bindSbpAccount$1 = (SbpAccountRepository$bindSbpAccount$1) continuationImpl;
            int i2 = sbpAccountRepository$bindSbpAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpAccountRepository$bindSbpAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpAccountRepository$bindSbpAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpAccountRepository$bindSbpAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SbpAccountRepository$bindSbpAccount$2 sbpAccountRepository$bindSbpAccount$2 = new SbpAccountRepository$bindSbpAccount$2(this, str, null);
                    sbpAccountRepository$bindSbpAccount$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(sbpAccountRepository$bindSbpAccount$2, sbpAccountRepository$bindSbpAccount$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SbpAccountRepository$bindSbpAccount$3$1 sbpAccountRepository$bindSbpAccount$3$1 = new SbpAccountRepository$bindSbpAccount$3$1(this, null);
                sbpAccountRepository$bindSbpAccount$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, sbpAccountRepository$bindSbpAccount$3$1, sbpAccountRepository$bindSbpAccount$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        sbpAccountRepository$bindSbpAccount$1 = new SbpAccountRepository$bindSbpAccount$1(this, continuationImpl);
        Object obj2 = sbpAccountRepository$bindSbpAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpAccountRepository$bindSbpAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        SbpAccountRepository$getSbpAccountInfo$1 sbpAccountRepository$getSbpAccountInfo$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SbpAccountRepository$getSbpAccountInfo$1) {
            sbpAccountRepository$getSbpAccountInfo$1 = (SbpAccountRepository$getSbpAccountInfo$1) continuationImpl;
            int i2 = sbpAccountRepository$getSbpAccountInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpAccountRepository$getSbpAccountInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpAccountRepository$getSbpAccountInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpAccountRepository$getSbpAccountInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SbpAccountRepository$getSbpAccountInfo$2 sbpAccountRepository$getSbpAccountInfo$2 = new SbpAccountRepository$getSbpAccountInfo$2(this, str, null);
                    sbpAccountRepository$getSbpAccountInfo$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(sbpAccountRepository$getSbpAccountInfo$2, sbpAccountRepository$getSbpAccountInfo$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SbpAccountRepository$getSbpAccountInfo$3$1 sbpAccountRepository$getSbpAccountInfo$3$1 = new SbpAccountRepository$getSbpAccountInfo$3$1(this, null);
                sbpAccountRepository$getSbpAccountInfo$1.label = 2;
                Object f = com.ybsdk.core.utils.dto.b.f((DataWithStatusResponse) c, sbpAccountRepository$getSbpAccountInfo$3$1, sbpAccountRepository$getSbpAccountInfo$1);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        sbpAccountRepository$getSbpAccountInfo$1 = new SbpAccountRepository$getSbpAccountInfo$1(this, continuationImpl);
        Object obj2 = sbpAccountRepository$getSbpAccountInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpAccountRepository$getSbpAccountInfo$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SbpAccountRepository$getSbpBanksList$1 sbpAccountRepository$getSbpBanksList$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SbpAccountRepository$getSbpBanksList$1) {
            sbpAccountRepository$getSbpBanksList$1 = (SbpAccountRepository$getSbpBanksList$1) continuationImpl;
            int i2 = sbpAccountRepository$getSbpBanksList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpAccountRepository$getSbpBanksList$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpAccountRepository$getSbpBanksList$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpAccountRepository$getSbpBanksList$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SbpAccountRepository$getSbpBanksList$2 sbpAccountRepository$getSbpBanksList$2 = new SbpAccountRepository$getSbpBanksList$2(this, null);
                    sbpAccountRepository$getSbpBanksList$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(sbpAccountRepository$getSbpBanksList$2, sbpAccountRepository$getSbpBanksList$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                SbpAccountRepository$getSbpBanksList$3$1 sbpAccountRepository$getSbpBanksList$3$1 = new SbpAccountRepository$getSbpBanksList$3$1(this, null);
                sbpAccountRepository$getSbpBanksList$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, sbpAccountRepository$getSbpBanksList$3$1, sbpAccountRepository$getSbpBanksList$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        sbpAccountRepository$getSbpBanksList$1 = new SbpAccountRepository$getSbpBanksList$1(this, continuationImpl);
        Object obj2 = sbpAccountRepository$getSbpBanksList$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpAccountRepository$getSbpBanksList$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, ContinuationImpl continuationImpl) {
        SbpAccountRepository$unbindSbpAccount$1 sbpAccountRepository$unbindSbpAccount$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof SbpAccountRepository$unbindSbpAccount$1) {
            sbpAccountRepository$unbindSbpAccount$1 = (SbpAccountRepository$unbindSbpAccount$1) continuationImpl;
            int i2 = sbpAccountRepository$unbindSbpAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpAccountRepository$unbindSbpAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpAccountRepository$unbindSbpAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpAccountRepository$unbindSbpAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SbpAccountRepository$unbindSbpAccount$2 sbpAccountRepository$unbindSbpAccount$2 = new SbpAccountRepository$unbindSbpAccount$2(this, str, null);
                    sbpAccountRepository$unbindSbpAccount$1.label = 1;
                    c = com.ybsdk.core.utils.ext.c.c(sbpAccountRepository$unbindSbpAccount$2, sbpAccountRepository$unbindSbpAccount$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) c;
                int i3 = com.ybsdk.core.utils.dto.a.b[dataWithStatusResponse.getStatus().ordinal()];
                if (i3 == 1) {
                    return new cqg(new NoReply());
                }
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
        }
        sbpAccountRepository$unbindSbpAccount$1 = new SbpAccountRepository$unbindSbpAccount$1(this, continuationImpl);
        Object obj2 = sbpAccountRepository$unbindSbpAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpAccountRepository$unbindSbpAccount$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
