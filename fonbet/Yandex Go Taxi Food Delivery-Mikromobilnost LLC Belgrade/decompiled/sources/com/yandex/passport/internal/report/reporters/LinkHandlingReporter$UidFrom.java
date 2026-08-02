package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.ui.domik.DomikActivity;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/passport/internal/report/reporters/LinkHandlingReporter$UidFrom", "", "Lcom/yandex/passport/internal/report/reporters/LinkHandlingReporter$UidFrom;", "", "from", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ACCOUNT_WITH_MACHINE_READABLE_LOGIN", "CURRENT_ACCOUNT", "AUTOLOGIN", "EMPTY", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LinkHandlingReporter$UidFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkHandlingReporter$UidFrom[] $VALUES;
    public static final LinkHandlingReporter$UidFrom ACCOUNT_WITH_MACHINE_READABLE_LOGIN;
    public static final LinkHandlingReporter$UidFrom AUTOLOGIN;
    public static final LinkHandlingReporter$UidFrom CURRENT_ACCOUNT;
    public static final LinkHandlingReporter$UidFrom EMPTY;
    private final String from;

    static {
        LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom = new LinkHandlingReporter$UidFrom("ACCOUNT_WITH_MACHINE_READABLE_LOGIN", 0, "account_with_machine_readable_login");
        ACCOUNT_WITH_MACHINE_READABLE_LOGIN = linkHandlingReporter$UidFrom;
        LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom2 = new LinkHandlingReporter$UidFrom("CURRENT_ACCOUNT", 1, DomikActivity.EXTRA_CURRENT_ACCOUNT);
        CURRENT_ACCOUNT = linkHandlingReporter$UidFrom2;
        LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom3 = new LinkHandlingReporter$UidFrom("AUTOLOGIN", 2, "autologin");
        AUTOLOGIN = linkHandlingReporter$UidFrom3;
        LinkHandlingReporter$UidFrom linkHandlingReporter$UidFrom4 = new LinkHandlingReporter$UidFrom("EMPTY", 3, "empty");
        EMPTY = linkHandlingReporter$UidFrom4;
        LinkHandlingReporter$UidFrom[] linkHandlingReporter$UidFromArr = {linkHandlingReporter$UidFrom, linkHandlingReporter$UidFrom2, linkHandlingReporter$UidFrom3, linkHandlingReporter$UidFrom4};
        $VALUES = linkHandlingReporter$UidFromArr;
        $ENTRIES = kotlin.enums.a.a(linkHandlingReporter$UidFromArr);
    }

    public LinkHandlingReporter$UidFrom(String str, int i, String str2) {
        this.from = str2;
    }

    public static LinkHandlingReporter$UidFrom valueOf(String str) {
        return (LinkHandlingReporter$UidFrom) Enum.valueOf(LinkHandlingReporter$UidFrom.class, str);
    }

    public static LinkHandlingReporter$UidFrom[] values() {
        return (LinkHandlingReporter$UidFrom[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getFrom() {
        return this.from;
    }
}
