package com.ybsdk.feature.pdf.internal.data;

import android.content.Context;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$TechPdfParsedErrorBodyType;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.core.utils.dto.ErrorResponseDto;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.feature.pdf.internal.network.PdfService;
import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportResponse;
import com.ybsdk.feature.pdf.internal.network.dto.GenerateReportStatusResponse;
import com.ybsdk.rconfig.configs.PdfErrorDetailsReportingFlag;
import defpackage.b64;
import defpackage.evu0;
import defpackage.f42;
import defpackage.g8e;
import defpackage.gvu0;
import defpackage.if8;
import defpackage.iyd0;
import defpackage.kvj0;
import defpackage.lg91;
import defpackage.ny61;
import defpackage.oqa0;
import defpackage.pqa0;
import defpackage.qqa0;
import defpackage.rvj0;
import defpackage.rzo;
import defpackage.txs;
import defpackage.us3;
import defpackage.uza;
import defpackage.w511;
import defpackage.wg10;
import defpackage.x4c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.StringReader;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a {
    public final Context a;
    public final PdfService b;
    public final f42 c;
    public final us3 d;
    public final if8 e;

    public a(Context context, PdfService pdfService, f42 f42Var, us3 us3Var, if8 if8Var) {
        this.a = context;
        this.b = pdfService;
        this.c = f42Var;
        this.d = us3Var;
        this.e = if8Var;
    }

    public static pqa0 j(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                str5 = newPullParser.getName();
            } else if (eventType == 3) {
                str5 = null;
            } else if (eventType == 4 && str5 != null) {
                int hashCode = str5.hashCode();
                if (hashCode != -1675388953) {
                    if (hashCode != -1597066262) {
                        if (hashCode == 2105869 && str5.equals("Code")) {
                            str3 = newPullParser.getText();
                        }
                    } else if (str5.equals("RequestId")) {
                        str4 = newPullParser.getText();
                    }
                } else if (str5.equals("Message")) {
                    str2 = newPullParser.getText();
                }
            }
        }
        return new pqa0(str2, str3, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, List list, ContinuationImpl continuationImpl) {
        PdfRepository$createDocument$1 pdfRepository$createDocument$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$createDocument$1) {
            pdfRepository$createDocument$1 = (PdfRepository$createDocument$1) continuationImpl;
            int i2 = pdfRepository$createDocument$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$createDocument$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$createDocument$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$createDocument$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$createDocument$2 pdfRepository$createDocument$2 = new PdfRepository$createDocument$2(this, str, str2, str3, list, null);
                    pdfRepository$createDocument$1.label = 1;
                    c = c.c(pdfRepository$createDocument$2, pdfRepository$createDocument$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                GenerateReportStatusResponse generateReportStatusResponse = (GenerateReportStatusResponse) c;
                int i3 = com.ybsdk.feature.pdf.internal.network.dto.a.a[generateReportStatusResponse.getStatus().ordinal()];
                if (i3 == 1) {
                    GenerateReportResponse successData = generateReportStatusResponse.getSuccessData();
                    return successData != null ? new txs(successData.getId(), successData.getType(), successData.getVersion()) : new Result.Failure(new IllegalStateException("Report generation success data is missing"));
                }
                if (i3 == 2) {
                    ErrorResponseDto failData = generateReportStatusResponse.getFailData();
                    return new Result.Failure(new IllegalStateException(failData != null ? g8e.p(failData.getCode(), Extension.COLON_SPACE, failData.getMessage()) : "Report generation fail data is missing"));
                }
                w511.b();
                return null;
            }
        }
        pdfRepository$createDocument$1 = new PdfRepository$createDocument$1(this, continuationImpl);
        Object obj2 = pdfRepository$createDocument$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$createDocument$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
    
        if (r3 == null) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[Catch: all -> 0x0066, TRY_ENTER, TryCatch #4 {all -> 0x0066, blocks: (B:13:0x005b, B:16:0x0061, B:17:0x008e, B:19:0x0094, B:20:0x0098, B:23:0x00ce, B:75:0x00d5, B:76:0x00d8, B:81:0x006a, B:83:0x0077, B:84:0x0080, B:91:0x0045, B:22:0x00c7, B:72:0x00d3), top: B:90:0x0045, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0094 A[Catch: all -> 0x0066, TryCatch #4 {all -> 0x0066, blocks: (B:13:0x005b, B:16:0x0061, B:17:0x008e, B:19:0x0094, B:20:0x0098, B:23:0x00ce, B:75:0x00d5, B:76:0x00d8, B:81:0x006a, B:83:0x0077, B:84:0x0080, B:91:0x0045, B:22:0x00c7, B:72:0x00d3), top: B:90:0x0045, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006a A[Catch: all -> 0x0066, TryCatch #4 {all -> 0x0066, blocks: (B:13:0x005b, B:16:0x0061, B:17:0x008e, B:19:0x0094, B:20:0x0098, B:23:0x00ce, B:75:0x00d5, B:76:0x00d8, B:81:0x006a, B:83:0x0077, B:84:0x0080, B:91:0x0045, B:22:0x00c7, B:72:0x00d3), top: B:90:0x0045, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(String str, String str2, ContinuationImpl continuationImpl) {
        PdfRepository$downloadFile$1 pdfRepository$downloadFile$1;
        int i;
        Object obj;
        String str3;
        a aVar;
        Throwable th;
        String str4;
        Result.Failure failure;
        Throwable a;
        Object oqa0Var;
        String sb;
        String str5;
        String g0;
        try {
            if (continuationImpl instanceof PdfRepository$downloadFile$1) {
                pdfRepository$downloadFile$1 = (PdfRepository$downloadFile$1) continuationImpl;
                int i2 = pdfRepository$downloadFile$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pdfRepository$downloadFile$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = pdfRepository$downloadFile$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pdfRepository$downloadFile$1.label;
                    if (i != 0) {
                        b.b(obj2);
                        try {
                            PdfService pdfService = this.b;
                            pdfRepository$downloadFile$1.L$0 = str;
                            pdfRepository$downloadFile$1.L$1 = str2;
                            pdfRepository$downloadFile$1.L$2 = this;
                            pdfRepository$downloadFile$1.label = 1;
                            Object a2 = pdfService.a(str, "SKIP_PERFORMANCE", pdfRepository$downloadFile$1);
                            if (a2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = a2;
                            str3 = str2;
                            aVar = this;
                        } catch (Throwable th2) {
                            str4 = str;
                            th = th2;
                            Result.Failure failure2 = new Result.Failure(th);
                            str = str4;
                            failure = failure2;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return failure;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a aVar2 = (a) pdfRepository$downloadFile$1.L$2;
                        String str6 = (String) pdfRepository$downloadFile$1.L$1;
                        str4 = (String) pdfRepository$downloadFile$1.L$0;
                        try {
                            b.b(obj2);
                            aVar = aVar2;
                            str = str4;
                            obj = obj2;
                            str3 = str6;
                        } catch (Throwable th3) {
                            th = th3;
                            Result.Failure failure22 = new Result.Failure(th);
                            str = str4;
                            failure = failure22;
                            a = Result.a(failure);
                            if (a != null) {
                            }
                            return failure;
                        }
                    }
                    rvj0 rvj0Var = (rvj0) obj;
                    if (str3 == null) {
                        g0 = evu0.g0(str3, ".pdf", str3);
                    } else {
                        aVar.getClass();
                        int L = evu0.L("/", str, 6) + 1;
                        if (L == 0) {
                            g0 = UUID.randomUUID().toString();
                        } else {
                            String substring = str.substring(L);
                            g0 = evu0.g0(substring, ".pdf", gvu0.A0(20, substring));
                        }
                    }
                    wg10 contentType = rvj0Var.contentType();
                    String str7 = g0 + Extension.DOT_CHAR + (contentType == null ? contentType.c : null);
                    aVar.d.a.Q.a.a("tech.pdf.local_file_name", null);
                    File file = new File(aVar.h(), str7);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    rzo.l(rvj0Var.byteStream(), fileOutputStream);
                    fileOutputStream.close();
                    failure = file;
                    a = Result.a(failure);
                    if (a != null) {
                        this.c.H(a.getMessage(), false);
                        if8 if8Var = this.e;
                        com.ybsdk.rconfig.b bVar = if8Var.a;
                        com.ybsdk.rconfig.b bVar2 = if8Var.a;
                        if (((PdfErrorDetailsReportingFlag) bVar.d(qqa0.a).getData()).isEnabled()) {
                            HttpException httpException = a instanceof HttpException ? (HttpException) a : null;
                            us3 us3Var = this.d;
                            if (httpException != null) {
                                Response response = httpException.a;
                                if (response != null) {
                                    try {
                                        rvj0 rvj0Var2 = response.c;
                                        if (rvj0Var2 != null) {
                                            str5 = rvj0Var2.string();
                                            if (str5 != null) {
                                                try {
                                                    oqa0Var = j(str5);
                                                    us3Var.e(PdfEvents$TechPdfParsedErrorBodyType.HTTP_XML);
                                                } catch (Exception e) {
                                                    e = e;
                                                    x4c.g("Failed to parse pdf error xml log", e, null, null, 12);
                                                    if (((PdfErrorDetailsReportingFlag) bVar2.d(qqa0.a).getData()).isEnabled()) {
                                                        kvj0 kvj0Var = response.a;
                                                        Object pqa0Var = new pqa0(b64.l("errorBody: ", str5, " ; message: ", kvj0Var.c), String.valueOf(Integer.valueOf(kvj0Var.w)), null);
                                                        us3Var.e(PdfEvents$TechPdfParsedErrorBodyType.HTTP_COMMON);
                                                        oqa0Var = pqa0Var;
                                                    }
                                                    oqa0Var = null;
                                                }
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str5 = null;
                                    }
                                }
                                oqa0Var = null;
                            }
                            oqa0Var = new oqa0(a.getMessage());
                            us3Var.e(PdfEvents$TechPdfParsedErrorBodyType.COMMON);
                            if (oqa0Var instanceof oqa0) {
                                sb = ((oqa0) oqa0Var).a;
                            } else {
                                if (!(oqa0Var instanceof pqa0)) {
                                    w511.b();
                                    return null;
                                }
                                pqa0 pqa0Var2 = (pqa0) oqa0Var;
                                String str8 = pqa0Var2.b;
                                String str9 = pqa0Var2.a;
                                String str10 = pqa0Var2.c;
                                StringBuilder v = b64.v("Code: ", str8, "; Message: ", str9, "; RequestId: ");
                                v.append(str10);
                                sb = v.toString();
                            }
                            StringBuilder sb2 = new StringBuilder();
                            if (((PdfErrorDetailsReportingFlag) bVar2.d(qqa0.a).getData()).isUrlReportingEnabled()) {
                                sb2.append("url=" + str + Extension.SEMICOLON_SPACE);
                            }
                            sb2.append("message=" + sb);
                            x4c.g("Pdf parse error log", a, sb2.toString(), null, 8);
                        }
                    }
                    return failure;
                }
            }
            rzo.l(rvj0Var.byteStream(), fileOutputStream);
            fileOutputStream.close();
            failure = file;
            a = Result.a(failure);
            if (a != null) {
            }
            return failure;
        } finally {
        }
        pdfRepository$downloadFile$1 = new PdfRepository$downloadFile$1(this, continuationImpl);
        Object obj22 = pdfRepository$downloadFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$downloadFile$1.label;
        if (i != 0) {
        }
        rvj0 rvj0Var3 = (rvj0) obj;
        if (str3 == null) {
        }
        wg10 contentType2 = rvj0Var3.contentType();
        if (contentType2 == null) {
        }
        String str72 = g0 + Extension.DOT_CHAR + (contentType2 == null ? contentType2.c : null);
        aVar.d.a.Q.a.a("tech.pdf.local_file_name", null);
        File file2 = new File(aVar.h(), str72);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r0 == r9) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Long l, String str2, Map map, ContinuationImpl continuationImpl) {
        PdfRepository$getCommonScreenData$1 pdfRepository$getCommonScreenData$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$getCommonScreenData$1) {
            pdfRepository$getCommonScreenData$1 = (PdfRepository$getCommonScreenData$1) continuationImpl;
            int i2 = pdfRepository$getCommonScreenData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getCommonScreenData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getCommonScreenData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$getCommonScreenData$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$getCommonScreenData$2 pdfRepository$getCommonScreenData$2 = new PdfRepository$getCommonScreenData$2(this, str, str2, l, map, null);
                    pdfRepository$getCommonScreenData$1.label = 1;
                    c = c.c(pdfRepository$getCommonScreenData$2, pdfRepository$getCommonScreenData$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PdfRepository$getCommonScreenData$3$1 pdfRepository$getCommonScreenData$3$1 = new PdfRepository$getCommonScreenData$3$1(2, null);
                pdfRepository$getCommonScreenData$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, pdfRepository$getCommonScreenData$3$1, pdfRepository$getCommonScreenData$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        pdfRepository$getCommonScreenData$1 = new PdfRepository$getCommonScreenData$1(this, continuationImpl);
        Object obj2 = pdfRepository$getCommonScreenData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$getCommonScreenData$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        PdfRepository$getCreditLink$1 pdfRepository$getCreditLink$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$getCreditLink$1) {
            pdfRepository$getCreditLink$1 = (PdfRepository$getCreditLink$1) continuationImpl;
            int i2 = pdfRepository$getCreditLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getCreditLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getCreditLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$getCreditLink$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$getCreditLink$2 pdfRepository$getCreditLink$2 = new PdfRepository$getCreditLink$2(this, str, null);
                    pdfRepository$getCreditLink$1.label = 1;
                    c = c.c(pdfRepository$getCreditLink$2, pdfRepository$getCreditLink$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PdfRepository$getCreditLink$3$1 pdfRepository$getCreditLink$3$1 = new PdfRepository$getCreditLink$3$1(2, null);
                pdfRepository$getCreditLink$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, pdfRepository$getCreditLink$3$1, pdfRepository$getCreditLink$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        pdfRepository$getCreditLink$1 = new PdfRepository$getCreditLink$1(this, continuationImpl);
        Object obj2 = pdfRepository$getCreditLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$getCreditLink$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PdfRepository$getDepositLink$1 pdfRepository$getDepositLink$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$getDepositLink$1) {
            pdfRepository$getDepositLink$1 = (PdfRepository$getDepositLink$1) continuationImpl;
            int i2 = pdfRepository$getDepositLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getDepositLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getDepositLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$getDepositLink$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$getDepositLink$2 pdfRepository$getDepositLink$2 = new PdfRepository$getDepositLink$2(this, str, null);
                    pdfRepository$getDepositLink$1.label = 1;
                    c = c.c(pdfRepository$getDepositLink$2, pdfRepository$getDepositLink$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PdfRepository$getDepositLink$3$1 pdfRepository$getDepositLink$3$1 = new PdfRepository$getDepositLink$3$1(2, null);
                pdfRepository$getDepositLink$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, pdfRepository$getDepositLink$3$1, pdfRepository$getDepositLink$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        pdfRepository$getDepositLink$1 = new PdfRepository$getDepositLink$1(this, continuationImpl);
        Object obj2 = pdfRepository$getDepositLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$getDepositLink$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, String str, ContinuationImpl continuationImpl) {
        PdfRepository$getDocumentStatus$1 pdfRepository$getDocumentStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof PdfRepository$getDocumentStatus$1) {
            pdfRepository$getDocumentStatus$1 = (PdfRepository$getDocumentStatus$1) continuationImpl;
            int i3 = pdfRepository$getDocumentStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getDocumentStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getDocumentStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pdfRepository$getDocumentStatus$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    PdfRepository$getDocumentStatus$2 pdfRepository$getDocumentStatus$2 = new PdfRepository$getDocumentStatus$2(this, str, i, null);
                    pdfRepository$getDocumentStatus$1.label = 1;
                    c = c.c(pdfRepository$getDocumentStatus$2, pdfRepository$getDocumentStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) pdfRepository$getDocumentStatus$1.L$0;
                        b.b(obj);
                        a2 = ((Result) obj).getValue();
                        return !(a2 instanceof Result.Failure) ? new iyd0(iyd0Var.b, a2) : a2;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                PdfRepository$getDocumentStatus$3$1$1 pdfRepository$getDocumentStatus$3$1$1 = new PdfRepository$getDocumentStatus$3$1$1(2, null);
                pdfRepository$getDocumentStatus$1.L$0 = iyd0Var;
                pdfRepository$getDocumentStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, pdfRepository$getDocumentStatus$3$1$1, pdfRepository$getDocumentStatus$1);
            }
        }
        pdfRepository$getDocumentStatus$1 = new PdfRepository$getDocumentStatus$1(this, continuationImpl);
        Object obj2 = pdfRepository$getDocumentStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pdfRepository$getDocumentStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, ContinuationImpl continuationImpl) {
        PdfRepository$getLink$1 pdfRepository$getLink$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$getLink$1) {
            pdfRepository$getLink$1 = (PdfRepository$getLink$1) continuationImpl;
            int i2 = pdfRepository$getLink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getLink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$getLink$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$getLink$2 pdfRepository$getLink$2 = new PdfRepository$getLink$2(this, str, str2, null);
                    pdfRepository$getLink$1.label = 1;
                    c = c.c(pdfRepository$getLink$2, pdfRepository$getLink$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PdfRepository$getLink$3$1 pdfRepository$getLink$3$1 = new PdfRepository$getLink$3$1(2, null);
                pdfRepository$getLink$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, pdfRepository$getLink$3$1, pdfRepository$getLink$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        pdfRepository$getLink$1 = new PdfRepository$getLink$1(this, continuationImpl);
        Object obj2 = pdfRepository$getLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$getLink$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    public final File h() {
        String path = this.a.getCacheDir().getPath();
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (lg91.b[i] ^ lg91.a[i % 8]);
        }
        String p = g8e.p(path, "/", new String(bArr, uza.a));
        File file = new File(p);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, String str, ContinuationImpl continuationImpl) {
        PdfRepository$getSplitContractDraftStatus$1 pdfRepository$getSplitContractDraftStatus$1;
        int i2;
        Object c;
        Throwable a;
        iyd0 iyd0Var;
        Object a2;
        if (continuationImpl instanceof PdfRepository$getSplitContractDraftStatus$1) {
            pdfRepository$getSplitContractDraftStatus$1 = (PdfRepository$getSplitContractDraftStatus$1) continuationImpl;
            int i3 = pdfRepository$getSplitContractDraftStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pdfRepository$getSplitContractDraftStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pdfRepository$getSplitContractDraftStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pdfRepository$getSplitContractDraftStatus$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    PdfRepository$getSplitContractDraftStatus$2 pdfRepository$getSplitContractDraftStatus$2 = new PdfRepository$getSplitContractDraftStatus$2(this, str, i, null);
                    pdfRepository$getSplitContractDraftStatus$1.label = 1;
                    c = c.c(pdfRepository$getSplitContractDraftStatus$2, pdfRepository$getSplitContractDraftStatus$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        iyd0Var = (iyd0) pdfRepository$getSplitContractDraftStatus$1.L$0;
                        b.b(obj);
                        a2 = ((Result) obj).getValue();
                        return !(a2 instanceof Result.Failure) ? new iyd0(iyd0Var.b, a2) : a2;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                iyd0Var = (iyd0) c;
                DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) iyd0Var.a;
                PdfRepository$getSplitContractDraftStatus$3$1$1 pdfRepository$getSplitContractDraftStatus$3$1$1 = new PdfRepository$getSplitContractDraftStatus$3$1$1(2, null);
                pdfRepository$getSplitContractDraftStatus$1.L$0 = iyd0Var;
                pdfRepository$getSplitContractDraftStatus$1.label = 2;
                a2 = com.ybsdk.core.utils.dto.b.a(dataWithStatusResponse, pdfRepository$getSplitContractDraftStatus$3$1$1, pdfRepository$getSplitContractDraftStatus$1);
            }
        }
        pdfRepository$getSplitContractDraftStatus$1 = new PdfRepository$getSplitContractDraftStatus$1(this, continuationImpl);
        Object obj2 = pdfRepository$getSplitContractDraftStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pdfRepository$getSplitContractDraftStatus$1.label;
        if (i2 != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(PdfLoaderScreenParams.SplitContractDraft splitContractDraft, ContinuationImpl continuationImpl) {
        PdfRepository$splitContractDraftCreate$1 pdfRepository$splitContractDraftCreate$1;
        int i;
        Object c;
        Throwable a;
        if (continuationImpl instanceof PdfRepository$splitContractDraftCreate$1) {
            pdfRepository$splitContractDraftCreate$1 = (PdfRepository$splitContractDraftCreate$1) continuationImpl;
            int i2 = pdfRepository$splitContractDraftCreate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfRepository$splitContractDraftCreate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfRepository$splitContractDraftCreate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pdfRepository$splitContractDraftCreate$1.label;
                if (i != 0) {
                    b.b(obj);
                    PdfRepository$splitContractDraftCreate$2 pdfRepository$splitContractDraftCreate$2 = new PdfRepository$splitContractDraftCreate$2(this, splitContractDraft, null);
                    pdfRepository$splitContractDraftCreate$1.label = 1;
                    c = c.c(pdfRepository$splitContractDraftCreate$2, pdfRepository$splitContractDraftCreate$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            b.b(obj);
                            return ((Result) obj).getValue();
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                a = Result.a(c);
                if (a == null) {
                    return new Result.Failure(a);
                }
                PdfRepository$splitContractDraftCreate$3$1 pdfRepository$splitContractDraftCreate$3$1 = new PdfRepository$splitContractDraftCreate$3$1(2, null);
                pdfRepository$splitContractDraftCreate$1.label = 2;
                Object a2 = com.ybsdk.core.utils.dto.b.a((DataWithStatusResponse) c, pdfRepository$splitContractDraftCreate$3$1, pdfRepository$splitContractDraftCreate$1);
                return a2 == coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        pdfRepository$splitContractDraftCreate$1 = new PdfRepository$splitContractDraftCreate$1(this, continuationImpl);
        Object obj2 = pdfRepository$splitContractDraftCreate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pdfRepository$splitContractDraftCreate$1.label;
        if (i != 0) {
        }
        a = Result.a(c);
        if (a == null) {
        }
    }
}
