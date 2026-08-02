package ru.ok.android.externcalls.sdk.events.end;

import com.huawei.hms.hihealth.data.DeviceInfo;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import xsna.asp;
import xsna.epx;
import xsna.ss9;
import xsna.zrp;

/* compiled from: ConversationEndReason.kt */
/* loaded from: classes9.dex */
public interface ConversationEndReason {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String KEY_ANOTHER_DEVICE = "another_device";
    public static final String KEY_BANNED = "banned";
    public static final String KEY_BUSY = "busy";
    public static final String KEY_CALL_TIMEOUT = "call_timeout";
    public static final String KEY_CANCELLED = "canceled";
    public static final String KEY_ERROR = "error";
    public static final String KEY_FAILED = "failed";
    public static final String KEY_HANGUP = "hangup";
    public static final String KEY_INITIALLY_CLOSED = "initially_closed";
    public static final String KEY_KILLED = "killed";
    public static final String KEY_KILLED_WITHOUT_DELETE = "killed_without_delete";
    public static final String KEY_MISSED = "missed";
    public static final String KEY_OBSOLETE_CLIENT = "obsolete_client";
    public static final String KEY_REJECTED = "rejected";
    public static final String KEY_REMOVED = "removed";
    public static final String KEY_SOCKET_CLOSED = "socket_closed";
    public static final String KEY_TIMEOUT = "timeout";

    /* compiled from: ConversationEndReason.kt */
    public static final class AcceptedOnAnotherDevice implements ConversationEndReason {
        public static final AcceptedOnAnotherDevice INSTANCE = new AcceptedOnAnotherDevice();
        private static final String key = "another_device";

        private AcceptedOnAnotherDevice() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof AcceptedOnAnotherDevice);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 941556652;
        }

        public String toString() {
            return "AcceptedOnAnotherDevice";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Banned implements ConversationEndReason {
        public static final Banned INSTANCE = new Banned();
        private static final String key = "banned";

        private Banned() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Banned);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -2039493819;
        }

        public String toString() {
            return "Banned";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Busy implements ConversationEndReason {
        public static final Busy INSTANCE = new Busy();
        private static final String key = "busy";

        private Busy() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Busy);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1199866912;
        }

        public String toString() {
            return "Busy";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class CallTimeout implements ConversationEndReason {
        public static final CallTimeout INSTANCE = new CallTimeout();
        private static final String key = "call_timeout";

        private CallTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CallTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 746379612;
        }

        public String toString() {
            return "CallTimeout";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Canceled implements ConversationEndReason {
        private final String description;
        private final String key = "canceled";
        private final Source source;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConversationEndReason.kt */
        public static final class Source {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Source[] $VALUES;
            public static final Source PARTICIPANT = new Source("PARTICIPANT", 0);
            public static final Source RINGING_TIMEOUT = new Source("RINGING_TIMEOUT", 1);

            private static final /* synthetic */ Source[] $values() {
                return new Source[]{PARTICIPANT, RINGING_TIMEOUT};
            }

            static {
                Source[] $values = $values();
                $VALUES = $values;
                $ENTRIES = new asp($values);
            }

            private Source(String str, int i) {
            }

            public static zrp<Source> getEntries() {
                return $ENTRIES;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        public Canceled(Source source, String str) {
            this.source = source;
            this.description = str;
        }

        public static /* synthetic */ Canceled copy$default(Canceled canceled, Source source, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                source = canceled.source;
            }
            if ((i & 2) != 0) {
                str = canceled.description;
            }
            return canceled.copy(source, str);
        }

        public final Source component1() {
            return this.source;
        }

        public final String component2() {
            return this.description;
        }

        public final Canceled copy(Source source, String str) {
            return new Canceled(source, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Canceled)) {
                return false;
            }
            Canceled canceled = (Canceled) obj;
            return this.source == canceled.source && epx.f(this.description, canceled.description);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getDescription() {
            return this.description;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public final Source getSource() {
            return this.source;
        }

        public int hashCode() {
            int hashCode = this.source.hashCode() * 31;
            String str = this.description;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Canceled(source=" + this.source + ", description=" + this.description + ")";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String KEY_ANOTHER_DEVICE = "another_device";
        public static final String KEY_BANNED = "banned";
        public static final String KEY_BUSY = "busy";
        public static final String KEY_CALL_TIMEOUT = "call_timeout";
        public static final String KEY_CANCELLED = "canceled";
        public static final String KEY_ERROR = "error";
        public static final String KEY_FAILED = "failed";
        public static final String KEY_HANGUP = "hangup";
        public static final String KEY_INITIALLY_CLOSED = "initially_closed";
        public static final String KEY_KILLED = "killed";
        public static final String KEY_KILLED_WITHOUT_DELETE = "killed_without_delete";
        public static final String KEY_MISSED = "missed";
        public static final String KEY_OBSOLETE_CLIENT = "obsolete_client";
        public static final String KEY_REJECTED = "rejected";
        public static final String KEY_REMOVED = "removed";
        public static final String KEY_SOCKET_CLOSED = "socket_closed";
        public static final String KEY_TIMEOUT = "timeout";

        private Companion() {
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class ConversationAlreadyEnded implements ConversationEndReason {
        public static final ConversationAlreadyEnded INSTANCE = new ConversationAlreadyEnded();
        private static final String key = "canceled";

        private ConversationAlreadyEnded() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ConversationAlreadyEnded);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -513124916;
        }

        public String toString() {
            return "ConversationAlreadyEnded";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class EndedForAll implements ConversationEndReason {
        public static final EndedForAll INSTANCE = new EndedForAll();
        private static final String key = "killed";

        private EndedForAll() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof EndedForAll);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1468058539;
        }

        public String toString() {
            return "EndedForAll";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Hangup implements ConversationEndReason {
        public static final Hangup INSTANCE = new Hangup();
        private static final String key = "hangup";

        private Hangup() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Hangup);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1867725132;
        }

        public String toString() {
            return "Hangup";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class InitiallyClosed implements ConversationEndReason {
        public static final InitiallyClosed INSTANCE = new InitiallyClosed();
        private static final String key = "initially_closed";

        private InitiallyClosed() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof InitiallyClosed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 498008150;
        }

        public String toString() {
            return "InitiallyClosed";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class KilledWithoutDelete implements ConversationEndReason {
        public static final KilledWithoutDelete INSTANCE = new KilledWithoutDelete();
        private static final String key = "killed_without_delete";

        private KilledWithoutDelete() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof KilledWithoutDelete);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -2109906353;
        }

        public String toString() {
            return "KilledWithoutDelete";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Missed implements ConversationEndReason {
        public static final Missed INSTANCE = new Missed();
        private static final String key = "missed";

        private Missed() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Missed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1717031230;
        }

        public String toString() {
            return "Missed";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class ObsoleteClient implements ConversationEndReason {
        private final String code;
        private final String explanationHtml;
        private final String key = "obsolete_client";

        public ObsoleteClient(String str, String str2) {
            this.explanationHtml = str;
            this.code = str2;
        }

        public static /* synthetic */ ObsoleteClient copy$default(ObsoleteClient obsoleteClient, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = obsoleteClient.explanationHtml;
            }
            if ((i & 2) != 0) {
                str2 = obsoleteClient.code;
            }
            return obsoleteClient.copy(str, str2);
        }

        public final String component1() {
            return this.explanationHtml;
        }

        public final String component2() {
            return this.code;
        }

        public final ObsoleteClient copy(String str, String str2) {
            return new ObsoleteClient(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ObsoleteClient)) {
                return false;
            }
            ObsoleteClient obsoleteClient = (ObsoleteClient) obj;
            return epx.f(this.explanationHtml, obsoleteClient.explanationHtml) && epx.f(this.code, obsoleteClient.code);
        }

        public final String getCode() {
            return this.code;
        }

        public final String getExplanationHtml() {
            return this.explanationHtml;
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public int hashCode() {
            String str = this.explanationHtml;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return ss9.a("ObsoleteClient(explanationHtml=", this.explanationHtml, ", code=", this.code, ")");
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class PeerConnectionTimeout implements ConversationEndReason {
        public static final PeerConnectionTimeout INSTANCE = new PeerConnectionTimeout();
        private static final String key = "timeout";

        private PeerConnectionTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof PeerConnectionTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -303820710;
        }

        public String toString() {
            return "PeerConnectionTimeout";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Rejected implements ConversationEndReason {
        public static final Rejected INSTANCE = new Rejected();
        private static final String key = "rejected";

        private Rejected() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Rejected);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -201133339;
        }

        public String toString() {
            return "Rejected";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class RemovedFromCall implements ConversationEndReason {
        public static final RemovedFromCall INSTANCE = new RemovedFromCall();
        private static final String key = "removed";

        private RemovedFromCall() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof RemovedFromCall);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 354659681;
        }

        public String toString() {
            return "RemovedFromCall";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class SignalingTimeout implements ConversationEndReason {
        public static final SignalingTimeout INSTANCE = new SignalingTimeout();
        private static final String key = "timeout";

        private SignalingTimeout() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SignalingTimeout);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -269234386;
        }

        public String toString() {
            return "SignalingTimeout";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class SocketClosed implements ConversationEndReason {
        public static final SocketClosed INSTANCE = new SocketClosed();
        private static final String key = "socket_closed";

        private SocketClosed() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof SocketClosed);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return -1133470298;
        }

        public String toString() {
            return "SocketClosed";
        }
    }

    /* compiled from: ConversationEndReason.kt */
    public static final class Unknown implements ConversationEndReason {
        public static final Unknown INSTANCE = new Unknown();
        private static final String key = "failed";

        private Unknown() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unknown);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return key;
        }

        public int hashCode() {
            return 1252320515;
        }

        public String toString() {
            return DeviceInfo.STR_TYPE_UNKNOWN;
        }
    }

    default String getDescription() {
        return null;
    }

    String getKey();

    /* compiled from: ConversationEndReason.kt */
    public static final class Error implements ConversationEndReason {
        private final String key = "error";
        private final Throwable throwable;

        public Error(Throwable th) {
            this.throwable = th;
        }

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final Error copy(Throwable th) {
            return new Error(th);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && epx.f(this.throwable, ((Error) obj).throwable);
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getDescription() {
            Throwable th = this.throwable;
            return th instanceof CallTerminatingException ? ((CallTerminatingException) th).asString() : new CallTerminatingException.Builder(Domain.UNKNOWN, th).build().asString();
        }

        @Override // ru.ok.android.externcalls.sdk.events.end.ConversationEndReason
        public String getKey() {
            return this.key;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public static /* synthetic */ void getDescription$annotations() {
        }
    }
}
