package com.ybsdk.feature.pdf.internal.domain;

import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.feature.pdf.internal.network.dto.InputParameterType;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueDate;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueProduct;
import com.ybsdk.feature.pdf.internal.network.dto.InputParametersValue$InputParametersValueText;
import com.ybsdk.feature.pdf.internal.network.dto.ReportStatusTypeDto;
import com.ybsdk.utils.poller.b;
import com.ybsdk.utils.poller.c;
import defpackage.aoc;
import defpackage.cwj0;
import defpackage.d2j0;
import defpackage.e1e0;
import defpackage.f42;
import defpackage.j73;
import defpackage.l0w;
import defpackage.n0e0;
import defpackage.ny61;
import defpackage.ost0;
import defpackage.txs;
import defpackage.u3j0;
import defpackage.w1j0;
import defpackage.w511;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.pdf.internal.data.a a;
    public final f42 b;
    public final b c;

    public a(com.ybsdk.feature.pdf.internal.data.a aVar, f42 f42Var, b bVar) {
        this.a = aVar;
        this.b = f42Var;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PdfLoaderScreenParams.CreditTerms creditTerms, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getCreditLink$1 pdfLinkInteractor$getCreditLink$1;
        int i;
        Object d;
        boolean z;
        if (continuationImpl instanceof PdfLinkInteractor$getCreditLink$1) {
            pdfLinkInteractor$getCreditLink$1 = (PdfLinkInteractor$getCreditLink$1) continuationImpl;
            int i2 = pdfLinkInteractor$getCreditLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfLinkInteractor$getCreditLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfLinkInteractor$getCreditLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfLinkInteractor$getCreditLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String agreementId = creditTerms.getAgreementId();
                    pdfLinkInteractor$getCreditLink$1.label = 1;
                    d = this.a.d(agreementId, pdfLinkInteractor$getCreditLink$1);
                    if (d == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    d = new cwj0((String) d, null);
                }
                z = d instanceof Result.Failure;
                f42 f42Var = this.b;
                if (!z) {
                    f42Var.N(true);
                }
                if (Result.a(d) != null) {
                    f42Var.N(false);
                }
                return d;
            }
        }
        pdfLinkInteractor$getCreditLink$1 = new PdfLinkInteractor$getCreditLink$1(this, continuationImpl);
        Object obj2 = pdfLinkInteractor$getCreditLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getCreditLink$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        z = d instanceof Result.Failure;
        f42 f42Var2 = this.b;
        if (!z) {
        }
        if (Result.a(d) != null) {
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PdfLoaderScreenParams.DepositTerms depositTerms, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getDepositLink$1 pdfLinkInteractor$getDepositLink$1;
        int i;
        Object e;
        boolean z;
        if (continuationImpl instanceof PdfLinkInteractor$getDepositLink$1) {
            pdfLinkInteractor$getDepositLink$1 = (PdfLinkInteractor$getDepositLink$1) continuationImpl;
            int i2 = pdfLinkInteractor$getDepositLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfLinkInteractor$getDepositLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfLinkInteractor$getDepositLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfLinkInteractor$getDepositLink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String agreementId = depositTerms.getAgreementId();
                    pdfLinkInteractor$getDepositLink$1.label = 1;
                    e = this.a.e(agreementId, pdfLinkInteractor$getDepositLink$1);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (!(e instanceof Result.Failure)) {
                    e = new cwj0((String) e, null);
                }
                z = e instanceof Result.Failure;
                f42 f42Var = this.b;
                if (!z) {
                    f42Var.y(true);
                }
                if (Result.a(e) != null) {
                    f42Var.y(false);
                }
                return e;
            }
        }
        pdfLinkInteractor$getDepositLink$1 = new PdfLinkInteractor$getDepositLink$1(this, continuationImpl);
        Object obj2 = pdfLinkInteractor$getDepositLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getDepositLink$1.label;
        if (i != 0) {
        }
        if (!(e instanceof Result.Failure)) {
        }
        z = e instanceof Result.Failure;
        f42 f42Var2 = this.b;
        if (!z) {
        }
        if (Result.a(e) != null) {
        }
        return e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0094, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a9, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ee, code lost:
    
        if (r11 == r1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(PdfLoaderScreenParams pdfLoaderScreenParams, String str, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getLink$1 pdfLinkInteractor$getLink$1;
        int i;
        String str2;
        Object f;
        Throwable a;
        Object obj;
        cwj0 cwj0Var;
        Throwable a2;
        if (continuationImpl instanceof PdfLinkInteractor$getLink$1) {
            pdfLinkInteractor$getLink$1 = (PdfLinkInteractor$getLink$1) continuationImpl;
            int i2 = pdfLinkInteractor$getLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfLinkInteractor$getLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = pdfLinkInteractor$getLink$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfLinkInteractor$getLink$1.label;
                f42 f42Var = this.b;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj2);
                        boolean z = pdfLoaderScreenParams instanceof PdfLoaderScreenParams.Base;
                        if (z) {
                            str2 = ((PdfLoaderScreenParams.Base) pdfLoaderScreenParams).getFileName();
                        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.DepositTerms) {
                            str2 = ((PdfLoaderScreenParams.DepositTerms) pdfLoaderScreenParams).getFileName();
                        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadFromUrl) {
                            str2 = ((PdfLoaderScreenParams.LoadFromUrl) pdfLoaderScreenParams).getFileName();
                        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.CreditTerms) {
                            str2 = ((PdfLoaderScreenParams.CreditTerms) pdfLoaderScreenParams).getFileName();
                        } else {
                            if (!(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadById) && !(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.SplitContractDraft)) {
                                w511.b();
                                return null;
                            }
                            str2 = null;
                        }
                        if (z) {
                            pdfLinkInteractor$getLink$1.L$0 = str2;
                            pdfLinkInteractor$getLink$1.label = 1;
                            f = d(str, (PdfLoaderScreenParams.Base) pdfLoaderScreenParams, pdfLinkInteractor$getLink$1);
                            break;
                        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.DepositTerms) {
                            pdfLinkInteractor$getLink$1.L$0 = str2;
                            pdfLinkInteractor$getLink$1.label = 2;
                            f = b((PdfLoaderScreenParams.DepositTerms) pdfLoaderScreenParams, pdfLinkInteractor$getLink$1);
                            break;
                        } else {
                            if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadFromUrl) {
                                f = new cwj0(((PdfLoaderScreenParams.LoadFromUrl) pdfLoaderScreenParams).getUrl(), null);
                                a = Result.a(f);
                                if (a != null) {
                                    f42Var.H(a.getMessage(), false);
                                    return new w1j0(null, a, null, 5);
                                }
                                cwj0 cwj0Var2 = (cwj0) f;
                                String str3 = cwj0Var2.a;
                                pdfLinkInteractor$getLink$1.L$0 = cwj0Var2;
                                pdfLinkInteractor$getLink$1.label = 6;
                                Object b = this.a.b(str3, str2, pdfLinkInteractor$getLink$1);
                                if (b != obj3) {
                                    obj = b;
                                    cwj0Var = cwj0Var2;
                                    a2 = Result.a(obj);
                                    if (a2 == null) {
                                        return new w1j0(null, a2, null, 5);
                                    }
                                    f42Var.H(null, true);
                                    return new w1j0((File) obj, null, cwj0Var.b, 2);
                                }
                                return obj3;
                            }
                            if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.CreditTerms) {
                                pdfLinkInteractor$getLink$1.L$0 = str2;
                                pdfLinkInteractor$getLink$1.label = 3;
                                f = a((PdfLoaderScreenParams.CreditTerms) pdfLoaderScreenParams, pdfLinkInteractor$getLink$1);
                                break;
                            } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadById) {
                                pdfLinkInteractor$getLink$1.L$0 = str2;
                                pdfLinkInteractor$getLink$1.label = 4;
                                f = e((PdfLoaderScreenParams.LoadById) pdfLoaderScreenParams, pdfLinkInteractor$getLink$1);
                                break;
                            } else {
                                if (!(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.SplitContractDraft)) {
                                    w511.b();
                                    return null;
                                }
                                pdfLinkInteractor$getLink$1.L$0 = str2;
                                pdfLinkInteractor$getLink$1.label = 5;
                                f = f((PdfLoaderScreenParams.SplitContractDraft) pdfLoaderScreenParams, pdfLinkInteractor$getLink$1);
                                break;
                            }
                        }
                        str2 = r10;
                        a = Result.a(f);
                        if (a != null) {
                        }
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        String str4 = (String) pdfLinkInteractor$getLink$1.L$0;
                        kotlin.b.b(obj2);
                        f = ((Result) obj2).getValue();
                        str2 = str4;
                        a = Result.a(f);
                        if (a != null) {
                        }
                        break;
                    case 6:
                        cwj0Var = (cwj0) pdfLinkInteractor$getLink$1.L$0;
                        kotlin.b.b(obj2);
                        obj = ((Result) obj2).getValue();
                        a2 = Result.a(obj);
                        if (a2 == null) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        pdfLinkInteractor$getLink$1 = new PdfLinkInteractor$getLink$1(this, continuationImpl);
        Object obj22 = pdfLinkInteractor$getLink$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getLink$1.label;
        f42 f42Var2 = this.b;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0171, code lost:
    
        if (r0 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0173, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010a, code lost:
    
        if (r1 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ce, code lost:
    
        if (r1 == r2) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, PdfLoaderScreenParams.Base base, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getLinkBaseScenario$1 pdfLinkInteractor$getLinkBaseScenario$1;
        int i;
        int i2;
        InputParametersValue$InputParametersValueDate inputParametersValue$InputParametersValueDate;
        Object a;
        Throwable a2;
        txs txsVar;
        Object e;
        Object g;
        if (continuationImpl instanceof PdfLinkInteractor$getLinkBaseScenario$1) {
            pdfLinkInteractor$getLinkBaseScenario$1 = (PdfLinkInteractor$getLinkBaseScenario$1) continuationImpl;
            int i3 = pdfLinkInteractor$getLinkBaseScenario$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdfLinkInteractor$getLinkBaseScenario$1.label = i3 - Integer.MIN_VALUE;
                PdfLinkInteractor$getLinkBaseScenario$1 pdfLinkInteractor$getLinkBaseScenario$12 = pdfLinkInteractor$getLinkBaseScenario$1;
                Object obj = pdfLinkInteractor$getLinkBaseScenario$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfLinkInteractor$getLinkBaseScenario$12.label;
                f42 f42Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String reportType = base.getReportType();
                    String reportVersion = base.getReportVersion();
                    f42Var.b.Q.a.a("load.pdf.link_generation_started", null);
                    String operationId = base.getOperationId();
                    InputParametersValue$InputParametersValueText inputParametersValue$InputParametersValueText = operationId != null ? new InputParametersValue$InputParametersValueText("operationId", InputParameterType.TEXT, operationId) : null;
                    String agreementId = base.getAgreementId();
                    InputParametersValue$InputParametersValueProduct inputParametersValue$InputParametersValueProduct = agreementId != null ? new InputParametersValue$InputParametersValueProduct("productId", InputParameterType.PRODUCT, agreementId, null, null, 24, null) : null;
                    String operationTimestamp = base.getOperationTimestamp();
                    if (operationTimestamp != null) {
                        i2 = 2;
                        inputParametersValue$InputParametersValueDate = new InputParametersValue$InputParametersValueDate("operationTimestamp", InputParameterType.TIMESTAMP, operationTimestamp);
                    } else {
                        i2 = 2;
                        inputParametersValue$InputParametersValueDate = null;
                    }
                    l0w[] l0wVarArr = new l0w[3];
                    l0wVarArr[0] = inputParametersValue$InputParametersValueText;
                    l0wVarArr[1] = inputParametersValue$InputParametersValueProduct;
                    l0wVarArr[i2] = inputParametersValue$InputParametersValueDate;
                    List A = j73.A(l0wVarArr);
                    pdfLinkInteractor$getLinkBaseScenario$12.label = 1;
                    a = this.a.a(str, reportType, reportVersion, A, pdfLinkInteractor$getLinkBaseScenario$12);
                } else if (i == 1) {
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                    i2 = 2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        g = ((Result) obj).getValue();
                        if (!(g instanceof Result.Failure)) {
                            f42Var.w(true);
                        }
                        if (Result.a(g) != null) {
                            f42Var.w(false);
                        }
                        return Result.a(g) == null ? new cwj0((String) g, null) : new Result.Failure(new Exception("poll status finished no files response"));
                    }
                    txsVar = (txs) pdfLinkInteractor$getLinkBaseScenario$12.L$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                    if (!(e instanceof Result.Failure)) {
                        f42Var.E(true);
                    }
                    if (Result.a(e) != null) {
                        f42Var.E(false);
                    }
                    Throwable a3 = Result.a(e);
                    if (a3 != null) {
                        return new Result.Failure(a3);
                    }
                    u3j0 u3j0Var = (u3j0) e;
                    d2j0 d2j0Var = (d2j0) kotlin.collections.a.b0(u3j0Var.d);
                    if (u3j0Var.c == ReportStatusTypeDto.FAIL) {
                        return new Result.Failure(new Exception("poll status finished with ERROR status"));
                    }
                    if ((d2j0Var != null ? d2j0Var.a : null) == null) {
                        return new Result.Failure(new Exception("poll status finished no files response"));
                    }
                    String str2 = d2j0Var.d;
                    if (str2 != null) {
                        f42Var.w(true);
                        return new cwj0(str2, null);
                    }
                    String str3 = txsVar.a;
                    String str4 = d2j0Var.a;
                    pdfLinkInteractor$getLinkBaseScenario$12.L$0 = null;
                    pdfLinkInteractor$getLinkBaseScenario$12.label = 3;
                    g = this.a.g(str3, str4, pdfLinkInteractor$getLinkBaseScenario$12);
                }
                if (!(a instanceof Result.Failure)) {
                    f42Var.z(true);
                }
                if (Result.a(a) != null) {
                    f42Var.z(false);
                }
                a2 = Result.a(a);
                if (a2 == null) {
                    return new Result.Failure(a2);
                }
                txsVar = (txs) a;
                int i4 = i2;
                c c = this.c.c(n0e0.b, new PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$1(i4, null), new PdfLinkInteractor$getLinkBaseScenario$terminatedStatusResult$2(this, txsVar, null));
                pdfLinkInteractor$getLinkBaseScenario$12.L$0 = txsVar;
                pdfLinkInteractor$getLinkBaseScenario$12.label = i4;
                e = c.e(pdfLinkInteractor$getLinkBaseScenario$12);
            }
        }
        pdfLinkInteractor$getLinkBaseScenario$1 = new PdfLinkInteractor$getLinkBaseScenario$1(this, continuationImpl);
        PdfLinkInteractor$getLinkBaseScenario$1 pdfLinkInteractor$getLinkBaseScenario$122 = pdfLinkInteractor$getLinkBaseScenario$1;
        Object obj2 = pdfLinkInteractor$getLinkBaseScenario$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getLinkBaseScenario$122.label;
        f42 f42Var2 = this.b;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
        if (Result.a(a) != null) {
        }
        a2 = Result.a(a);
        if (a2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PdfLoaderScreenParams.LoadById loadById, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getLoadById$1 pdfLinkInteractor$getLoadById$1;
        int i;
        Object c;
        boolean z;
        if (continuationImpl instanceof PdfLinkInteractor$getLoadById$1) {
            pdfLinkInteractor$getLoadById$1 = (PdfLinkInteractor$getLoadById$1) continuationImpl;
            int i2 = pdfLinkInteractor$getLoadById$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfLinkInteractor$getLoadById$1.label = i2 - Integer.MIN_VALUE;
                PdfLinkInteractor$getLoadById$1 pdfLinkInteractor$getLoadById$12 = pdfLinkInteractor$getLoadById$1;
                Object obj = pdfLinkInteractor$getLoadById$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfLinkInteractor$getLoadById$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String id = loadById.getId();
                    Long lifetimeInSeconds = loadById.getLifetimeInSeconds();
                    String target = loadById.getTarget();
                    Map<String, String> additionalData = loadById.getAdditionalData();
                    pdfLinkInteractor$getLoadById$12.label = 1;
                    c = this.a.c(id, lifetimeInSeconds, target, additionalData, pdfLinkInteractor$getLoadById$12);
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
                if (!(c instanceof Result.Failure)) {
                    aoc aocVar = (aoc) c;
                    c = new cwj0(aocVar.a, aocVar.b);
                }
                z = c instanceof Result.Failure;
                f42 f42Var = this.b;
                if (!z) {
                    f42Var.A(true);
                }
                if (Result.a(c) != null) {
                    f42Var.A(false);
                }
                return c;
            }
        }
        pdfLinkInteractor$getLoadById$1 = new PdfLinkInteractor$getLoadById$1(this, continuationImpl);
        PdfLinkInteractor$getLoadById$1 pdfLinkInteractor$getLoadById$122 = pdfLinkInteractor$getLoadById$1;
        Object obj2 = pdfLinkInteractor$getLoadById$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getLoadById$122.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        z = c instanceof Result.Failure;
        f42 f42Var2 = this.b;
        if (!z) {
        }
        if (Result.a(c) != null) {
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r10 != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:12:0x002c, B:13:0x0093, B:15:0x0099, B:16:0x009e, B:18:0x00a7, B:21:0x00b2, B:22:0x00be, B:26:0x0040, B:27:0x005a, B:29:0x005e, B:30:0x0066, B:32:0x006c, B:33:0x0071, B:37:0x004d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[Catch: all -> 0x00bf, TryCatch #0 {all -> 0x00bf, blocks: (B:12:0x002c, B:13:0x0093, B:15:0x0099, B:16:0x009e, B:18:0x00a7, B:21:0x00b2, B:22:0x00be, B:26:0x0040, B:27:0x005a, B:29:0x005e, B:30:0x0066, B:32:0x006c, B:33:0x0071, B:37:0x004d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(PdfLoaderScreenParams.SplitContractDraft splitContractDraft, ContinuationImpl continuationImpl) {
        PdfLinkInteractor$getSplitContractDraft$1 pdfLinkInteractor$getSplitContractDraft$1;
        int i;
        Object k;
        Object e;
        try {
            if (continuationImpl instanceof PdfLinkInteractor$getSplitContractDraft$1) {
                pdfLinkInteractor$getSplitContractDraft$1 = (PdfLinkInteractor$getSplitContractDraft$1) continuationImpl;
                int i2 = pdfLinkInteractor$getSplitContractDraft$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pdfLinkInteractor$getSplitContractDraft$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = pdfLinkInteractor$getSplitContractDraft$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pdfLinkInteractor$getSplitContractDraft$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.ybsdk.feature.pdf.internal.data.a aVar = this.a;
                        pdfLinkInteractor$getSplitContractDraft$1.L$0 = this;
                        pdfLinkInteractor$getSplitContractDraft$1.label = 1;
                        k = aVar.k(splitContractDraft, pdfLinkInteractor$getSplitContractDraft$1);
                        if (k == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            this = (a) pdfLinkInteractor$getSplitContractDraft$1.L$0;
                            kotlin.b.b(obj);
                            e = ((Result) obj).getValue();
                            if (Result.a(e) != null) {
                                this.b.M(false);
                            }
                            kotlin.b.b(e);
                            String str = ((ost0) e).b;
                            if (str != null) {
                                this.b.M(true);
                                return new cwj0(str, null);
                            }
                            this.b.M(false);
                            throw new IllegalStateException("Poll finished but no url received");
                        }
                        this = (a) pdfLinkInteractor$getSplitContractDraft$1.L$0;
                        kotlin.b.b(obj);
                        k = ((Result) obj).getValue();
                    }
                    if (!(k instanceof Result.Failure)) {
                        this.b.L(true);
                    }
                    if (Result.a(k) != null) {
                        this.b.L(false);
                    }
                    kotlin.b.b(k);
                    c c = this.c.c(e1e0.b, new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1(2, null), new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2(this, (String) k, null));
                    pdfLinkInteractor$getSplitContractDraft$1.L$0 = this;
                    pdfLinkInteractor$getSplitContractDraft$1.label = 2;
                    e = c.e(pdfLinkInteractor$getSplitContractDraft$1);
                }
            }
            if (i != 0) {
            }
            if (!(k instanceof Result.Failure)) {
            }
            if (Result.a(k) != null) {
            }
            kotlin.b.b(k);
            c c2 = this.c.c(e1e0.b, new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$1(2, null), new PdfLinkInteractor$getSplitContractDraft$2$splitDepositContractDraft$2(this, (String) k, null));
            pdfLinkInteractor$getSplitContractDraft$1.L$0 = this;
            pdfLinkInteractor$getSplitContractDraft$1.label = 2;
            e = c2.e(pdfLinkInteractor$getSplitContractDraft$1);
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
        pdfLinkInteractor$getSplitContractDraft$1 = new PdfLinkInteractor$getSplitContractDraft$1(this, continuationImpl);
        Object obj2 = pdfLinkInteractor$getSplitContractDraft$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfLinkInteractor$getSplitContractDraft$1.label;
    }
}
