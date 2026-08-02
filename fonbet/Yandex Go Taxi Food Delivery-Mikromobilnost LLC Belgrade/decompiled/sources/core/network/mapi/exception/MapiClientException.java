package core.network.mapi.exception;

import defpackage.wu00;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcore/network/mapi/exception/MapiClientException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lwu00;", "details", "Lwu00;", "a", "()Lwu00;", "Lcore/network/mapi/exception/IssueType;", "issueType", "Lcore/network/mapi/exception/IssueType;", "b", "()Lcore/network/mapi/exception/IssueType;", "network-mapi"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MapiClientException extends Exception {
    private final wu00 details;
    private final IssueType issueType;

    public MapiClientException(String str, Throwable th, wu00 wu00Var, IssueType issueType) {
        super(str, th);
        this.details = wu00Var;
        this.issueType = issueType;
    }

    /* renamed from: a, reason: from getter */
    public final wu00 getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final IssueType getIssueType() {
        return this.issueType;
    }
}
