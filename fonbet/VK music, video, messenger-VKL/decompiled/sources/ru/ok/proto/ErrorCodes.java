package ru.ok.proto;

import androidx.annotation.NonNull;
import xsna.tgw;

/* loaded from: classes9.dex */
public class ErrorCodes {
    public static final int CAPTURE_ERROR = 14;
    public static final int DECODE_ERROR = 13;
    public static final int INIT_ERROR = 15;
    public static final int INTERFACE_CHANGED = 18;
    public static final int NET_ERROR = 10;
    public static final int NO_ERROR = 0;
    public static final int NO_NETWORK = 17;
    public static final int NO_VIDEO_ENCODER = 100;
    public static final int PROTOCOL_ERROR = 11;
    public static final int REMOTE_ERROR = 16;
    public static final int REMOTE_REJECT = 102;
    public static final int UDP_ENOBUFS = 101;
    public static final int UNEXPECTED_ERROR = 12;

    @NonNull
    public static String getErrorCodeName(int i) {
        if (i == 0) {
            return "NO_ERROR";
        }
        switch (i) {
            case 10:
                return "NET_ERROR";
            case 11:
                return "PROTOCOL_ERROR";
            case 12:
                return "UNEXPECTED_ERROR";
            case 13:
                return "DECODE_ERROR";
            case 14:
                return "CAPTURE_ERROR";
            case 15:
                return "INIT_ERROR";
            case 16:
                return "REMOTE_ERROR";
            case 17:
                return "NO_NETWORK";
            case 18:
                return "INTERFACE_CHANGED";
            default:
                switch (i) {
                    case 100:
                        return "NO_VIDEO_ENCODER";
                    case 101:
                        return "UDP_ENOBUFS";
                    case 102:
                        return "REMOTE_REJECT";
                    default:
                        return tgw.b(i, "<unknown ", ">");
                }
        }
    }

    public static boolean isRecoverableErrorCode(int i) {
        if (i != 0) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    break;
                default:
                    switch (i) {
                    }
            }
            return true;
        }
        return true;
    }
}
