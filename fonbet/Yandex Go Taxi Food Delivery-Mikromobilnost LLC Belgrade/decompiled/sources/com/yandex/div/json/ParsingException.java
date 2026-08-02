package com.yandex.div.json;

import defpackage.edx;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/div/json/ParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/yandex/div/json/ParsingExceptionReason;", CRLReasonCodeExtension.REASON, "Lcom/yandex/div/json/ParsingExceptionReason;", "b", "()Lcom/yandex/div/json/ParsingExceptionReason;", "Ledx;", "source", "Ledx;", "c", "()Ledx;", "", "jsonSummary", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ParsingException extends RuntimeException {
    private final String jsonSummary;
    private final ParsingExceptionReason reason;
    private final edx source;

    public /* synthetic */ ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, edx edxVar, String str2, int i) {
        this(parsingExceptionReason, str, (i & 4) != 0 ? null : th, (i & 8) != 0 ? null : edxVar, (i & 16) != 0 ? null : str2);
    }

    /* renamed from: a, reason: from getter */
    public final String getJsonSummary() {
        return this.jsonSummary;
    }

    /* renamed from: b, reason: from getter */
    public final ParsingExceptionReason getReason() {
        return this.reason;
    }

    /* renamed from: c, reason: from getter */
    public final edx getSource() {
        return this.source;
    }

    public ParsingException(ParsingExceptionReason parsingExceptionReason, String str, Throwable th, edx edxVar, String str2) {
        super(str, th);
        this.reason = parsingExceptionReason;
        this.source = edxVar;
        this.jsonSummary = str2;
    }
}
