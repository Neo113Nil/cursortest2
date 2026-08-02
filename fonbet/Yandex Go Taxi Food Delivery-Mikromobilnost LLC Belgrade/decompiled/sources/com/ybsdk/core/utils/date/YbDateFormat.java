package com.ybsdk.core.utils.date;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/core/utils/date/YbDateFormat;", "", "pattern", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getPattern", "()Ljava/lang/String;", "SHORT_SERVER_DATE_ONLY", "SHORT_USER_DATE_ONLY", "SHORT_USER_DAY_AND_MONTH_ONLY", "ISO_8601", "ISO_8601_Z", "ISO_8601_WITHOUT_TIMEZONE", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbDateFormat {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbDateFormat[] $VALUES;
    private final String pattern;
    public static final YbDateFormat SHORT_SERVER_DATE_ONLY = new YbDateFormat("SHORT_SERVER_DATE_ONLY", 0, "yyyy-MM-dd");
    public static final YbDateFormat SHORT_USER_DATE_ONLY = new YbDateFormat("SHORT_USER_DATE_ONLY", 1, "dd.MM.yyyy");
    public static final YbDateFormat SHORT_USER_DAY_AND_MONTH_ONLY = new YbDateFormat("SHORT_USER_DAY_AND_MONTH_ONLY", 2, "dd.MM");
    public static final YbDateFormat ISO_8601 = new YbDateFormat("ISO_8601", 3, "yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    public static final YbDateFormat ISO_8601_Z = new YbDateFormat("ISO_8601_Z", 4, "yyyy-MM-dd'T'HH:mm:ss'Z'");
    public static final YbDateFormat ISO_8601_WITHOUT_TIMEZONE = new YbDateFormat("ISO_8601_WITHOUT_TIMEZONE", 5, "yyyy-MM-dd'T'HH:mm:ss.SSS");

    private static final /* synthetic */ YbDateFormat[] $values() {
        return new YbDateFormat[]{SHORT_SERVER_DATE_ONLY, SHORT_USER_DATE_ONLY, SHORT_USER_DAY_AND_MONTH_ONLY, ISO_8601, ISO_8601_Z, ISO_8601_WITHOUT_TIMEZONE};
    }

    static {
        YbDateFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YbDateFormat(String str, int i, String str2) {
        this.pattern = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YbDateFormat valueOf(String str) {
        return (YbDateFormat) Enum.valueOf(YbDateFormat.class, str);
    }

    public static YbDateFormat[] values() {
        return (YbDateFormat[]) $VALUES.clone();
    }

    public final String getPattern() {
        return this.pattern;
    }
}
