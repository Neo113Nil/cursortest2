package core.network.mapi.exception;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcore/network/mapi/exception/IssueType;", "", "COMMUNICATION", "PARSING", "network-mapi"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IssueType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IssueType[] $VALUES;
    public static final IssueType COMMUNICATION;
    public static final IssueType PARSING;

    static {
        IssueType issueType = new IssueType("COMMUNICATION", 0);
        COMMUNICATION = issueType;
        IssueType issueType2 = new IssueType("PARSING", 1);
        PARSING = issueType2;
        IssueType[] issueTypeArr = {issueType, issueType2};
        $VALUES = issueTypeArr;
        $ENTRIES = a.a(issueTypeArr);
    }

    public static IssueType valueOf(String str) {
        return (IssueType) Enum.valueOf(IssueType.class, str);
    }

    public static IssueType[] values() {
        return (IssueType[]) $VALUES.clone();
    }
}
