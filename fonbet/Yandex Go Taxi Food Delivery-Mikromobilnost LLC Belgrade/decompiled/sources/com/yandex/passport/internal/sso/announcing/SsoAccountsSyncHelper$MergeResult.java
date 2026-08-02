package com.yandex.passport.internal.sso.announcing;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"com/yandex/passport/internal/sso/announcing/SsoAccountsSyncHelper$MergeResult", "", "Lcom/yandex/passport/internal/sso/announcing/SsoAccountsSyncHelper$MergeResult;", "LOCAL_EMPTY_REMOTE_DELETED", "LOCAL_EMPTY_REMOTE_ACCOUNT_EMPTY", "LOCAL_EMPTY_REMOTE_ADDED", "LOCAL_TIMESTAMP_NEWER", "REMOTE_DELETED_LOCAL_LOCAL_TIMESTAMP_NEWER", "REMOTE_DELETED_LOCAL_REMOVE_SUCCESS", "REMOTE_DELETED_LOCAL_ACCOUNT_NOT_FOUND", "REMOTE_DELETED_LOCAL_DELETED", "REMOTE_ACCOUNT_EMPTY", "LOCAL_TIMESTAMP_OLDER_UPGRADE", "LOCAL_LOCAL_TIMESTAMP_SAME", "LOCAL_LOCAL_TIMESTAMP_NEWER", "LOCAL_LOCAL_TIMESTAMP_OLDER", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SsoAccountsSyncHelper$MergeResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SsoAccountsSyncHelper$MergeResult[] $VALUES;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_EMPTY_REMOTE_ACCOUNT_EMPTY;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_EMPTY_REMOTE_ADDED;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_EMPTY_REMOTE_DELETED;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_LOCAL_TIMESTAMP_NEWER;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_LOCAL_TIMESTAMP_OLDER;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_LOCAL_TIMESTAMP_SAME;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_TIMESTAMP_NEWER;
    public static final SsoAccountsSyncHelper$MergeResult LOCAL_TIMESTAMP_OLDER_UPGRADE;
    public static final SsoAccountsSyncHelper$MergeResult REMOTE_ACCOUNT_EMPTY;
    public static final SsoAccountsSyncHelper$MergeResult REMOTE_DELETED_LOCAL_ACCOUNT_NOT_FOUND;
    public static final SsoAccountsSyncHelper$MergeResult REMOTE_DELETED_LOCAL_DELETED;
    public static final SsoAccountsSyncHelper$MergeResult REMOTE_DELETED_LOCAL_LOCAL_TIMESTAMP_NEWER;
    public static final SsoAccountsSyncHelper$MergeResult REMOTE_DELETED_LOCAL_REMOVE_SUCCESS;

    static {
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult = new SsoAccountsSyncHelper$MergeResult("LOCAL_EMPTY_REMOTE_DELETED", 0);
        LOCAL_EMPTY_REMOTE_DELETED = ssoAccountsSyncHelper$MergeResult;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult2 = new SsoAccountsSyncHelper$MergeResult("LOCAL_EMPTY_REMOTE_ACCOUNT_EMPTY", 1);
        LOCAL_EMPTY_REMOTE_ACCOUNT_EMPTY = ssoAccountsSyncHelper$MergeResult2;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult3 = new SsoAccountsSyncHelper$MergeResult("LOCAL_EMPTY_REMOTE_ADDED", 2);
        LOCAL_EMPTY_REMOTE_ADDED = ssoAccountsSyncHelper$MergeResult3;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult4 = new SsoAccountsSyncHelper$MergeResult("LOCAL_TIMESTAMP_NEWER", 3);
        LOCAL_TIMESTAMP_NEWER = ssoAccountsSyncHelper$MergeResult4;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult5 = new SsoAccountsSyncHelper$MergeResult("REMOTE_DELETED_LOCAL_LOCAL_TIMESTAMP_NEWER", 4);
        REMOTE_DELETED_LOCAL_LOCAL_TIMESTAMP_NEWER = ssoAccountsSyncHelper$MergeResult5;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult6 = new SsoAccountsSyncHelper$MergeResult("REMOTE_DELETED_LOCAL_REMOVE_SUCCESS", 5);
        REMOTE_DELETED_LOCAL_REMOVE_SUCCESS = ssoAccountsSyncHelper$MergeResult6;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult7 = new SsoAccountsSyncHelper$MergeResult("REMOTE_DELETED_LOCAL_ACCOUNT_NOT_FOUND", 6);
        REMOTE_DELETED_LOCAL_ACCOUNT_NOT_FOUND = ssoAccountsSyncHelper$MergeResult7;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult8 = new SsoAccountsSyncHelper$MergeResult("REMOTE_DELETED_LOCAL_DELETED", 7);
        REMOTE_DELETED_LOCAL_DELETED = ssoAccountsSyncHelper$MergeResult8;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult9 = new SsoAccountsSyncHelper$MergeResult("REMOTE_ACCOUNT_EMPTY", 8);
        REMOTE_ACCOUNT_EMPTY = ssoAccountsSyncHelper$MergeResult9;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult10 = new SsoAccountsSyncHelper$MergeResult("LOCAL_TIMESTAMP_OLDER_UPGRADE", 9);
        LOCAL_TIMESTAMP_OLDER_UPGRADE = ssoAccountsSyncHelper$MergeResult10;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult11 = new SsoAccountsSyncHelper$MergeResult("LOCAL_LOCAL_TIMESTAMP_SAME", 10);
        LOCAL_LOCAL_TIMESTAMP_SAME = ssoAccountsSyncHelper$MergeResult11;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult12 = new SsoAccountsSyncHelper$MergeResult("LOCAL_LOCAL_TIMESTAMP_NEWER", 11);
        LOCAL_LOCAL_TIMESTAMP_NEWER = ssoAccountsSyncHelper$MergeResult12;
        SsoAccountsSyncHelper$MergeResult ssoAccountsSyncHelper$MergeResult13 = new SsoAccountsSyncHelper$MergeResult("LOCAL_LOCAL_TIMESTAMP_OLDER", 12);
        LOCAL_LOCAL_TIMESTAMP_OLDER = ssoAccountsSyncHelper$MergeResult13;
        SsoAccountsSyncHelper$MergeResult[] ssoAccountsSyncHelper$MergeResultArr = {ssoAccountsSyncHelper$MergeResult, ssoAccountsSyncHelper$MergeResult2, ssoAccountsSyncHelper$MergeResult3, ssoAccountsSyncHelper$MergeResult4, ssoAccountsSyncHelper$MergeResult5, ssoAccountsSyncHelper$MergeResult6, ssoAccountsSyncHelper$MergeResult7, ssoAccountsSyncHelper$MergeResult8, ssoAccountsSyncHelper$MergeResult9, ssoAccountsSyncHelper$MergeResult10, ssoAccountsSyncHelper$MergeResult11, ssoAccountsSyncHelper$MergeResult12, ssoAccountsSyncHelper$MergeResult13};
        $VALUES = ssoAccountsSyncHelper$MergeResultArr;
        $ENTRIES = kotlin.enums.a.a(ssoAccountsSyncHelper$MergeResultArr);
    }

    public static SsoAccountsSyncHelper$MergeResult valueOf(String str) {
        return (SsoAccountsSyncHelper$MergeResult) Enum.valueOf(SsoAccountsSyncHelper$MergeResult.class, str);
    }

    public static SsoAccountsSyncHelper$MergeResult[] values() {
        return (SsoAccountsSyncHelper$MergeResult[]) $VALUES.clone();
    }
}
