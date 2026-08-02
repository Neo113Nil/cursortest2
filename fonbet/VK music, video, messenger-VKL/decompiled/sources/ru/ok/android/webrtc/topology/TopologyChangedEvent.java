package ru.ok.android.webrtc.topology;

import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* loaded from: classes9.dex */
public abstract class TopologyChangedEvent {
    public final Reason a;

    public static final class ConnectionFailed extends TopologyChangedEvent {
        public ConnectionFailed() {
            super(Reason.CONNECTION_FAILED, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Reason {
        public static final Reason CONNECTION_FAILED;
        public static final Reason NO_CONNECTION_TIMEOUT;
        public static final Reason NO_DATA_TIMEOUT;
        public static final Reason SUCCESS_AUDIO;
        public static final Reason SUCCESS_CONNECTION;
        public static final /* synthetic */ Reason[] b;
        public static final /* synthetic */ zrp c;
        public final String a;

        static {
            Reason reason = new Reason("NO_CONNECTION_TIMEOUT", 0, "no_connection_timeout");
            NO_CONNECTION_TIMEOUT = reason;
            Reason reason2 = new Reason("NO_DATA_TIMEOUT", 1, "no_data_timeout");
            NO_DATA_TIMEOUT = reason2;
            Reason reason3 = new Reason("CONNECTION_FAILED", 2, "connection_failed");
            CONNECTION_FAILED = reason3;
            Reason reason4 = new Reason("SUCCESS_AUDIO", 3, "success_audio");
            SUCCESS_AUDIO = reason4;
            Reason reason5 = new Reason("SUCCESS_CONNECTION", 4, "success_connection");
            SUCCESS_CONNECTION = reason5;
            Reason[] reasonArr = {reason, reason2, reason3, reason4, reason5};
            b = reasonArr;
            c = new asp(reasonArr);
        }

        public Reason(String str, int i, String str2) {
            this.a = str2;
        }

        public static zrp<Reason> getEntries() {
            return c;
        }

        public static Reason valueOf(String str) {
            return (Reason) Enum.valueOf(Reason.class, str);
        }

        public static Reason[] values() {
            return (Reason[]) b.clone();
        }

        public final String getStringName() {
            return this.a;
        }
    }

    public static abstract class Timeouted extends TopologyChangedEvent {

        public static final class NoConnection extends Timeouted {
            public final long b;

            public NoConnection(long j) {
                super(Reason.NO_CONNECTION_TIMEOUT, null);
                this.b = j;
            }

            @Override // ru.ok.android.webrtc.topology.TopologyChangedEvent.Timeouted
            public long getStartTime() {
                return this.b;
            }
        }

        public static final class NoData extends Timeouted {
            public final long b;

            public NoData(long j) {
                super(Reason.NO_DATA_TIMEOUT, null);
                this.b = j;
            }

            @Override // ru.ok.android.webrtc.topology.TopologyChangedEvent.Timeouted
            public long getStartTime() {
                return this.b;
            }
        }

        public static final class SuccessAudio extends Timeouted {
            public final long b;

            public SuccessAudio(long j) {
                super(Reason.SUCCESS_AUDIO, null);
                this.b = j;
            }

            @Override // ru.ok.android.webrtc.topology.TopologyChangedEvent.Timeouted
            public long getStartTime() {
                return this.b;
            }
        }

        public static final class SuccessConnection extends Timeouted {
            public final long b;

            public SuccessConnection(long j) {
                super(Reason.SUCCESS_CONNECTION, null);
                this.b = j;
            }

            @Override // ru.ok.android.webrtc.topology.TopologyChangedEvent.Timeouted
            public long getStartTime() {
                return this.b;
            }
        }

        public Timeouted(Reason reason, zcl zclVar) {
            super(reason, null);
        }

        public abstract long getStartTime();
    }

    public TopologyChangedEvent(Reason reason, zcl zclVar) {
        this.a = reason;
    }

    public final Reason getReason() {
        return this.a;
    }
}
