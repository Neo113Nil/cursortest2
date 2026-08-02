package com.yandex.messenger.websdk.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/messenger/websdk/api/Authentication;", "", "NeedTokenRefreshReason", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Authentication {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messenger/websdk/api/Authentication$NeedTokenRefreshReason;", "", "UNAUTHORIZED", "INVALID_SCOPE", "NEED_RESET", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class NeedTokenRefreshReason {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ NeedTokenRefreshReason[] $VALUES;
        public static final NeedTokenRefreshReason INVALID_SCOPE;
        public static final NeedTokenRefreshReason NEED_RESET;
        public static final NeedTokenRefreshReason UNAUTHORIZED;

        static {
            NeedTokenRefreshReason needTokenRefreshReason = new NeedTokenRefreshReason("UNAUTHORIZED", 0);
            UNAUTHORIZED = needTokenRefreshReason;
            NeedTokenRefreshReason needTokenRefreshReason2 = new NeedTokenRefreshReason("INVALID_SCOPE", 1);
            INVALID_SCOPE = needTokenRefreshReason2;
            NeedTokenRefreshReason needTokenRefreshReason3 = new NeedTokenRefreshReason("NEED_RESET", 2);
            NEED_RESET = needTokenRefreshReason3;
            NeedTokenRefreshReason[] needTokenRefreshReasonArr = {needTokenRefreshReason, needTokenRefreshReason2, needTokenRefreshReason3};
            $VALUES = needTokenRefreshReasonArr;
            $ENTRIES = a.a(needTokenRefreshReasonArr);
        }

        public static NeedTokenRefreshReason valueOf(String str) {
            return (NeedTokenRefreshReason) Enum.valueOf(NeedTokenRefreshReason.class, str);
        }

        public static NeedTokenRefreshReason[] values() {
            return (NeedTokenRefreshReason[]) $VALUES.clone();
        }
    }
}
