package ru.ok.android.externcalls.sdk.api.delegate;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.qoy;
import xsna.ss9;

/* compiled from: StartConversationDelegate.kt */
/* loaded from: classes9.dex */
public interface StartConversationDelegate {

    /* compiled from: StartConversationDelegate.kt */
    public static final class Params {
        private final List<String> calleeIds;
        private final Long chatId;
        private final String conversationId;
        private final String internalParams;
        private final boolean isVideo;

        public Params(String str, List<String> list, Long l, boolean z, String str2) {
            this.conversationId = str;
            this.calleeIds = list;
            this.chatId = l;
            this.isVideo = z;
            this.internalParams = str2;
        }

        public static /* synthetic */ Params copy$default(Params params, String str, List list, Long l, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = params.conversationId;
            }
            if ((i & 2) != 0) {
                list = params.calleeIds;
            }
            if ((i & 4) != 0) {
                l = params.chatId;
            }
            if ((i & 8) != 0) {
                z = params.isVideo;
            }
            if ((i & 16) != 0) {
                str2 = params.internalParams;
            }
            String str3 = str2;
            Long l2 = l;
            return params.copy(str, list, l2, z, str3);
        }

        public final String component1() {
            return this.conversationId;
        }

        public final List<String> component2() {
            return this.calleeIds;
        }

        public final Long component3() {
            return this.chatId;
        }

        public final boolean component4() {
            return this.isVideo;
        }

        public final String component5() {
            return this.internalParams;
        }

        public final Params copy(String str, List<String> list, Long l, boolean z, String str2) {
            return new Params(str, list, l, z, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return epx.f(this.conversationId, params.conversationId) && epx.f(this.calleeIds, params.calleeIds) && epx.f(this.chatId, params.chatId) && this.isVideo == params.isVideo && epx.f(this.internalParams, params.internalParams);
        }

        public final List<String> getCalleeIds() {
            return this.calleeIds;
        }

        public final Long getChatId() {
            return this.chatId;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final String getInternalParams() {
            return this.internalParams;
        }

        public int hashCode() {
            int a = fw3.a(this.conversationId.hashCode() * 31, 31, this.calleeIds);
            Long l = this.chatId;
            return this.internalParams.hashCode() + qoy.b((a + (l == null ? 0 : l.hashCode())) * 31, 31, this.isVideo);
        }

        public final boolean isVideo() {
            return this.isVideo;
        }

        public String toString() {
            String str = this.conversationId;
            List<String> list = this.calleeIds;
            Long l = this.chatId;
            boolean z = this.isVideo;
            String str2 = this.internalParams;
            StringBuilder sb = new StringBuilder("Params(conversationId=");
            sb.append(str);
            sb.append(", calleeIds=");
            sb.append(list);
            sb.append(", chatId=");
            sb.append(l);
            sb.append(", isVideo=");
            sb.append(z);
            sb.append(", internalParams=");
            return i5s.a(sb, str2, ")");
        }
    }

    Result invoke(Params params);

    /* compiled from: StartConversationDelegate.kt */
    public interface Result {

        /* compiled from: StartConversationDelegate.kt */
        public static final class Success implements Result {
            private final String conversationId;
            private final String internalCallerParams;

            public Success(String str, String str2) {
                this.conversationId = str;
                this.internalCallerParams = str2;
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.conversationId;
                }
                if ((i & 2) != 0) {
                    str2 = success.internalCallerParams;
                }
                return success.copy(str, str2);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String component2() {
                return this.internalCallerParams;
            }

            public final Success copy(String str, String str2) {
                return new Success(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return epx.f(this.conversationId, success.conversationId) && epx.f(this.internalCallerParams, success.internalCallerParams);
            }

            public final String getConversationId() {
                return this.conversationId;
            }

            public final String getInternalCallerParams() {
                return this.internalCallerParams;
            }

            public int hashCode() {
                return this.internalCallerParams.hashCode() + (this.conversationId.hashCode() * 31);
            }

            public String toString() {
                return ss9.a("Success(conversationId=", this.conversationId, ", internalCallerParams=", this.internalCallerParams, ")");
            }
        }

        /* compiled from: StartConversationDelegate.kt */
        public static final class Error implements Result {
            private final String errorCode;
            private final Throwable throwable;

            private Error(String str, Throwable th) {
                this.errorCode = str;
                this.throwable = th;
            }

            public final String getErrorCode() {
                return this.errorCode;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public Error(String str) {
                this(str, null);
            }

            public Error(Throwable th) {
                this(null, th);
            }
        }
    }
}
