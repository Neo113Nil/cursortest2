package com.ybsdk.feature.pdf.internal.ui;

import android.content.Context;
import androidx.core.content.FileProvider;
import com.ybsdk.core.analytics.generated.delegates.PdfEvents$LoadPdfScreenOpenedType;
import com.ybsdk.core.utils.c;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import defpackage.ak80;
import defpackage.ds31;
import defpackage.em3;
import defpackage.f42;
import defpackage.g8e;
import defpackage.h490;
import defpackage.i5z0;
import defpackage.j57;
import defpackage.mv3;
import defpackage.nqa0;
import defpackage.oyr;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.uqa0;
import defpackage.uz6;
import defpackage.v0h;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xqa0;
import defpackage.z2z;
import defpackage.zqa0;
import java.io.File;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final PdfLoaderScreenParams B;
    public final Context C;
    public final tfl0 D;
    public final com.ybsdk.feature.pdf.internal.domain.a E;
    public final nqa0 F;
    public final f42 G;
    public final c H;

    public a(PdfLoaderScreenParams pdfLoaderScreenParams, Context context, tfl0 tfl0Var, com.ybsdk.feature.pdf.internal.domain.a aVar, nqa0 nqa0Var, f42 f42Var) {
        super(new ak80(22, pdfLoaderScreenParams), new h490(1));
        PdfEvents$LoadPdfScreenOpenedType pdfEvents$LoadPdfScreenOpenedType;
        this.B = pdfLoaderScreenParams;
        this.C = context;
        this.D = tfl0Var;
        this.E = aVar;
        this.F = nqa0Var;
        this.G = f42Var;
        this.H = new c();
        ((uqa0) nqa0Var).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new ak80(23, this), 17));
        if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.Base) {
            pdfEvents$LoadPdfScreenOpenedType = PdfEvents$LoadPdfScreenOpenedType.REPORT;
        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.DepositTerms) {
            pdfEvents$LoadPdfScreenOpenedType = PdfEvents$LoadPdfScreenOpenedType.DEPOSIT_TERMS;
        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.CreditTerms) {
            pdfEvents$LoadPdfScreenOpenedType = PdfEvents$LoadPdfScreenOpenedType.CREDIT_TERMS;
        } else if (pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadById) {
            pdfEvents$LoadPdfScreenOpenedType = PdfEvents$LoadPdfScreenOpenedType.DOCUMENT_BY_ID;
        } else {
            if (!(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.SplitContractDraft)) {
                if (!(pdfLoaderScreenParams instanceof PdfLoaderScreenParams.LoadFromUrl)) {
                    w511.b();
                    throw null;
                }
                tje.N(ds31.a(this), null, null, new PdfLoaderViewModel$startDownload$1(this, null), 3);
            }
            pdfEvents$LoadPdfScreenOpenedType = PdfEvents$LoadPdfScreenOpenedType.SPLIT_CONTRACT_DRAFT;
        }
        em3 em3Var = f42Var.b.Q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("type", pdfEvents$LoadPdfScreenOpenedType.getOriginalValue());
        em3Var.a.a("load.pdf.screen_opened", linkedHashMap);
        tje.N(ds31.a(this), null, null, new PdfLoaderViewModel$startDownload$1(this, null), 3);
    }

    @Override // defpackage.yr31
    public final void V() {
        try {
            File file = ((xqa0) X()).c;
            if (file != null) {
                file.delete();
            }
        } catch (Exception e) {
            File file2 = ((xqa0) X()).c;
            x4c.g("Error deleting pdf on screen close", e, g8e.o("file name = ", file2 != null ? file2.getName() : null), null, 8);
        }
    }

    public final void b0(String str) {
        z2z c = ((uqa0) this.F).a.c(str);
        if (c.b || (c.a instanceof v0h)) {
            return;
        }
        x4c.g("Can't handle action", null, oyr.p("action: \"", str, "\""), null, 10);
    }

    public final void c0() {
        this.G.b.Q.a.a("load.pdf.screen.exit", null);
        this.D.e();
    }

    public final void d0() {
        uz6 uz6Var;
        String str;
        j57 j57Var = ((xqa0) X()).e;
        if (j57Var == null || (uz6Var = j57Var.a) == null || (str = uz6Var.b) == null) {
            return;
        }
        b0(str);
    }

    public final void e0() {
        tje.N(ds31.a(this), null, null, new PdfLoaderViewModel$startDownload$1(this, null), 3);
    }

    public final void f0() {
        uz6 uz6Var;
        String str;
        if (((xqa0) X()).d) {
            h0();
        }
        j57 j57Var = ((xqa0) X()).e;
        if (j57Var == null || (uz6Var = j57Var.b) == null || (str = uz6Var.b) == null) {
            return;
        }
        b0(str);
    }

    public final void g0() {
        String supportUrl;
        Throwable th = ((xqa0) X()).b;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        b0(supportUrl);
    }

    public final void h0() {
        this.G.b.Q.a.a("load.pdf.share.clicked", null);
        i5z0.a.a("Pdf share button clicked", new Object[0]);
        File file = ((xqa0) X()).c;
        if (file != null) {
            Context context = this.C;
            Z(new zqa0(FileProvider.getUriForFile(context, context.getPackageName() + ".feature.pdf.file.provider", file)));
        }
    }
}
