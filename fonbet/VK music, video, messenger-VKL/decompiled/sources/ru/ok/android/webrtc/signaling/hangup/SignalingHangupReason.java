package ru.ok.android.webrtc.signaling.hangup;

import java.util.Iterator;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.zcl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SignalingHangupReason {
    public static final SignalingHangupReason ANOTHER_DEVICE;
    public static final SignalingHangupReason BANNED;
    public static final SignalingHangupReason BUSY;
    public static final SignalingHangupReason CALL_TIMEOUT;
    public static final SignalingHangupReason CANCELED;
    public static final Companion Companion;
    public static final SignalingHangupReason FAILED;
    public static final SignalingHangupReason HUNGUP;
    public static final SignalingHangupReason INITIALLY_CLOSED;
    public static final SignalingHangupReason KILLED;
    public static final SignalingHangupReason KILLED_WITHOUT_DELETE;
    public static final SignalingHangupReason MISSED;
    public static final SignalingHangupReason OBSOLETE_CLIENT;
    public static final SignalingHangupReason REJECTED;
    public static final SignalingHangupReason REMOVED;
    public static final SignalingHangupReason SOCKET_CLOSED;
    public static final SignalingHangupReason TIMEOUT;
    public static final /* synthetic */ SignalingHangupReason[] b;
    public static final /* synthetic */ zrp c;
    public final String a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final SignalingHangupReason getFromSignalingKey(String str) {
            Object obj;
            Iterator<E> it = SignalingHangupReason.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((SignalingHangupReason) obj).getKey(), str)) {
                    break;
                }
            }
            return (SignalingHangupReason) obj;
        }
    }

    static {
        SignalingHangupReason signalingHangupReason = new SignalingHangupReason(SignalingProtocol.HUNGUP_REASON_CANCELED, 0, SignalingProtocol.HUNGUP_REASON_CANCELED);
        CANCELED = signalingHangupReason;
        SignalingHangupReason signalingHangupReason2 = new SignalingHangupReason("REJECTED", 1, "REJECTED");
        REJECTED = signalingHangupReason2;
        SignalingHangupReason signalingHangupReason3 = new SignalingHangupReason("HUNGUP", 2, "HUNGUP");
        HUNGUP = signalingHangupReason3;
        SignalingHangupReason signalingHangupReason4 = new SignalingHangupReason(SignalingProtocol.HUNGUP_REASON_MISSED, 3, SignalingProtocol.HUNGUP_REASON_MISSED);
        MISSED = signalingHangupReason4;
        SignalingHangupReason signalingHangupReason5 = new SignalingHangupReason("TIMEOUT", 4, "TIMEOUT");
        TIMEOUT = signalingHangupReason5;
        SignalingHangupReason signalingHangupReason6 = new SignalingHangupReason(SignalingProtocol.HUNGUP_REASON_BUSY, 5, SignalingProtocol.HUNGUP_REASON_BUSY);
        BUSY = signalingHangupReason6;
        SignalingHangupReason signalingHangupReason7 = new SignalingHangupReason(SignalingProtocol.HUNGUP_REASON_FAILED, 6, SignalingProtocol.HUNGUP_REASON_FAILED);
        FAILED = signalingHangupReason7;
        SignalingHangupReason signalingHangupReason8 = new SignalingHangupReason(SignalingProtocol.HUNGUP_REASON_REMOVED, 7, SignalingProtocol.HUNGUP_REASON_REMOVED);
        REMOVED = signalingHangupReason8;
        SignalingHangupReason signalingHangupReason9 = new SignalingHangupReason("BANNED", 8, "BANNED");
        BANNED = signalingHangupReason9;
        SignalingHangupReason signalingHangupReason10 = new SignalingHangupReason("ANOTHER_DEVICE", 9, "ANOTHER_DEVICE");
        ANOTHER_DEVICE = signalingHangupReason10;
        SignalingHangupReason signalingHangupReason11 = new SignalingHangupReason("KILLED", 10, "KILLED");
        KILLED = signalingHangupReason11;
        SignalingHangupReason signalingHangupReason12 = new SignalingHangupReason("KILLED_WITHOUT_DELETE", 11, "KILLED_WITHOUT_DELETE");
        KILLED_WITHOUT_DELETE = signalingHangupReason12;
        SignalingHangupReason signalingHangupReason13 = new SignalingHangupReason("CALL_TIMEOUT", 12, "CALL_TIMEOUT");
        CALL_TIMEOUT = signalingHangupReason13;
        SignalingHangupReason signalingHangupReason14 = new SignalingHangupReason("SOCKET_CLOSED", 13, "SOCKET_CLOSED");
        SOCKET_CLOSED = signalingHangupReason14;
        SignalingHangupReason signalingHangupReason15 = new SignalingHangupReason("INITIALLY_CLOSED", 14, "INITIALLY_CLOSED");
        INITIALLY_CLOSED = signalingHangupReason15;
        SignalingHangupReason signalingHangupReason16 = new SignalingHangupReason("OBSOLETE_CLIENT", 15, "OBSOLETE_CLIENT");
        OBSOLETE_CLIENT = signalingHangupReason16;
        SignalingHangupReason[] signalingHangupReasonArr = {signalingHangupReason, signalingHangupReason2, signalingHangupReason3, signalingHangupReason4, signalingHangupReason5, signalingHangupReason6, signalingHangupReason7, signalingHangupReason8, signalingHangupReason9, signalingHangupReason10, signalingHangupReason11, signalingHangupReason12, signalingHangupReason13, signalingHangupReason14, signalingHangupReason15, signalingHangupReason16};
        b = signalingHangupReasonArr;
        c = new asp(signalingHangupReasonArr);
        Companion = new Companion(null);
    }

    public SignalingHangupReason(String str, int i, String str2) {
        this.a = str2;
    }

    public static zrp<SignalingHangupReason> getEntries() {
        return c;
    }

    public static final SignalingHangupReason getFromSignalingKey(String str) {
        return Companion.getFromSignalingKey(str);
    }

    public static SignalingHangupReason valueOf(String str) {
        return (SignalingHangupReason) Enum.valueOf(SignalingHangupReason.class, str);
    }

    public static SignalingHangupReason[] values() {
        return (SignalingHangupReason[]) b.clone();
    }

    public final String getKey() {
        return this.a;
    }
}
