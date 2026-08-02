package ru.ok.android.webrtc.signaling.api;

import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.epx;
import xsna.h5s;
import xsna.n6j;
import xsna.urd0;
import xsna.xe9;
import xsna.zrp;

/* loaded from: classes9.dex */
public interface SignalingStat {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SignalingEventType {
        public static final SignalingEventType CONNECTED;
        public static final SignalingEventType FAILED_BY_EXCEPTION;
        public static final SignalingEventType FAILED_BY_PINGS;
        public static final SignalingEventType RECONNECTED;
        public static final SignalingEventType RESTART;
        public static final SignalingEventType TIMEOUT;
        public static final /* synthetic */ SignalingEventType[] a;
        public static final /* synthetic */ zrp b;

        static {
            SignalingEventType signalingEventType = new SignalingEventType("RESTART", 0);
            RESTART = signalingEventType;
            SignalingEventType signalingEventType2 = new SignalingEventType("CONNECTED", 1);
            CONNECTED = signalingEventType2;
            SignalingEventType signalingEventType3 = new SignalingEventType("RECONNECTED", 2);
            RECONNECTED = signalingEventType3;
            SignalingEventType signalingEventType4 = new SignalingEventType("FAILED_BY_PINGS", 3);
            FAILED_BY_PINGS = signalingEventType4;
            SignalingEventType signalingEventType5 = new SignalingEventType("FAILED_BY_EXCEPTION", 4);
            FAILED_BY_EXCEPTION = signalingEventType5;
            SignalingEventType signalingEventType6 = new SignalingEventType("TIMEOUT", 5);
            TIMEOUT = signalingEventType6;
            SignalingEventType[] signalingEventTypeArr = {signalingEventType, signalingEventType2, signalingEventType3, signalingEventType4, signalingEventType5, signalingEventType6};
            a = signalingEventTypeArr;
            b = new asp(signalingEventTypeArr);
        }

        public SignalingEventType(String str, int i) {
        }

        public static zrp<SignalingEventType> getEntries() {
            return b;
        }

        public static SignalingEventType valueOf(String str) {
            return (SignalingEventType) Enum.valueOf(SignalingEventType.class, str);
        }

        public static SignalingEventType[] values() {
            return (SignalingEventType[]) a.clone();
        }
    }

    public static final class SignalingType {
        public final String a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SignalingEventType.values().length];
                try {
                    iArr[SignalingEventType.RESTART.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SignalingEventType.CONNECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SignalingEventType.RECONNECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SignalingEventType.FAILED_BY_PINGS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SignalingEventType.FAILED_BY_EXCEPTION.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[SignalingEventType.TIMEOUT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SignalingType(String str, String str2, String str3, String str4, String str5, String str6) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public static /* synthetic */ SignalingType copy$default(SignalingType signalingType, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = signalingType.a;
            }
            if ((i & 2) != 0) {
                str2 = signalingType.b;
            }
            if ((i & 4) != 0) {
                str3 = signalingType.c;
            }
            if ((i & 8) != 0) {
                str4 = signalingType.d;
            }
            if ((i & 16) != 0) {
                str5 = signalingType.e;
            }
            if ((i & 32) != 0) {
                str6 = signalingType.f;
            }
            String str7 = str5;
            String str8 = str6;
            return signalingType.copy(str, str2, str3, str4, str7, str8);
        }

        public final SignalingType copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new SignalingType(str, str2, str3, str4, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SignalingType)) {
                return false;
            }
            SignalingType signalingType = (SignalingType) obj;
            return epx.f(this.a, signalingType.a) && epx.f(this.b, signalingType.b) && epx.f(this.c, signalingType.c) && epx.f(this.d, signalingType.d) && epx.f(this.e, signalingType.e) && epx.f(this.f, signalingType.f);
        }

        public final String getEventByType(SignalingEventType signalingEventType) {
            switch (WhenMappings.$EnumSwitchMapping$0[signalingEventType.ordinal()]) {
                case 1:
                    return this.a;
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public int hashCode() {
            return this.f.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            String str4 = this.d;
            String str5 = this.e;
            String str6 = this.f;
            StringBuilder a = xe9.a("SignalingType(restart=", str, ", connected=", str2, ", reconnected=");
            n6j.b(a, str3, ", failedByPings=", str4, ", failedByException=");
            return h5s.d(a, str5, ", timeout=", str6, ")");
        }
    }

    void onCallFinished();

    void onCommandSent(SignalingType signalingType, String str, boolean z);

    void onConnect(SignalingType signalingType);

    void onConnected(SignalingType signalingType);

    void onDisconnectedSuccessfully(SignalingType signalingType);

    void onFailedByException(SignalingType signalingType, Throwable th);

    void onFailedByPings(SignalingType signalingType);

    void onMessageReceived(SignalingType signalingType, String str, boolean z);

    void onRestart(SignalingType signalingType);

    void onTimeout(SignalingType signalingType);
}
