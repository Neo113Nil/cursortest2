package com.yandex.plus.pay.internal.model;

import defpackage.b64;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult;", "", "Success", "Cancelled", "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Success;", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface PlusPayWebFamilyInviteResult {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult;", CRLReasonCodeExtension.REASON, "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled$Reason;", "<init>", "(Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled$Reason;)V", "getReason", "()Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled$Reason;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Reason", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancelled implements PlusPayWebFamilyInviteResult {
        private final Reason reason;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Cancelled$Reason;", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "MAX_FAMILY_MEMBERS", "USER_HAS_NO_FAMILY", "USER_IS_A_FAMILY_CHILD", "USER_REGION_IS_NOT_SUPPORTED", "UNKNOWN_REASON", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Reason {
            private static final /* synthetic */ k4o $ENTRIES;
            private static final /* synthetic */ Reason[] $VALUES;
            private final String description;
            public static final Reason MAX_FAMILY_MEMBERS = new Reason("MAX_FAMILY_MEMBERS", 0, "To many people in the family");
            public static final Reason USER_HAS_NO_FAMILY = new Reason("USER_HAS_NO_FAMILY", 1, "User has no family");
            public static final Reason USER_IS_A_FAMILY_CHILD = new Reason("USER_IS_A_FAMILY_CHILD", 2, "User is a child");
            public static final Reason USER_REGION_IS_NOT_SUPPORTED = new Reason("USER_REGION_IS_NOT_SUPPORTED", 3, "Region is not supported");
            public static final Reason UNKNOWN_REASON = new Reason("UNKNOWN_REASON", 4, "Unknown reason");

            private static final /* synthetic */ Reason[] $values() {
                return new Reason[]{MAX_FAMILY_MEMBERS, USER_HAS_NO_FAMILY, USER_IS_A_FAMILY_CHILD, USER_REGION_IS_NOT_SUPPORTED, UNKNOWN_REASON};
            }

            static {
                Reason[] $values = $values();
                $VALUES = $values;
                $ENTRIES = a.a($values);
            }

            private Reason(String str, int i, String str2) {
                this.description = str2;
            }

            public static k4o getEntries() {
                return $ENTRIES;
            }

            public static Reason valueOf(String str) {
                return (Reason) Enum.valueOf(Reason.class, str);
            }

            public static Reason[] values() {
                return (Reason[]) $VALUES.clone();
            }

            public final String getDescription() {
                return this.description;
            }
        }

        public Cancelled(Reason reason) {
            this.reason = reason;
        }

        public static /* synthetic */ Cancelled copy$default(Cancelled cancelled, Reason reason, int i, Object obj) {
            if ((i & 1) != 0) {
                reason = cancelled.reason;
            }
            return cancelled.copy(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final Reason getReason() {
            return this.reason;
        }

        public final Cancelled copy(Reason reason) {
            return new Cancelled(reason);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cancelled) && this.reason == ((Cancelled) other).reason;
        }

        public final Reason getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        public String toString() {
            return "Cancelled(reason=" + this.reason + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult$Success;", "Lcom/yandex/plus/pay/internal/model/PlusPayWebFamilyInviteResult;", "webUrl", "", "skipText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWebUrl", "()Ljava/lang/String;", "getSkipText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "pay-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PlusPayWebFamilyInviteResult {
        private final String skipText;
        private final String webUrl;

        public Success(String str, String str2) {
            this.webUrl = str;
            this.skipText = str2;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.webUrl;
            }
            if ((i & 2) != 0) {
                str2 = success.skipText;
            }
            return success.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getWebUrl() {
            return this.webUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSkipText() {
            return this.skipText;
        }

        public final Success copy(String webUrl, String skipText) {
            return new Success(webUrl, skipText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return jl40.l(this.webUrl, success.webUrl) && jl40.l(this.skipText, success.skipText);
        }

        public final String getSkipText() {
            return this.skipText;
        }

        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            return this.skipText.hashCode() + (this.webUrl.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Success(webUrl=");
            sb.append(this.webUrl);
            sb.append(", skipText=");
            return b64.p(sb, this.skipText, ')');
        }
    }
}
