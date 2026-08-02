package ru.ok.android.webrtc.simulcast;

import xsna.asp;
import xsna.zcl;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class SimulcastDirection {
    public static final Companion Companion;
    public static final SimulcastDirection RECV;
    public static final SimulcastDirection SEND;
    public static final /* synthetic */ SimulcastDirection[] b;
    public static final /* synthetic */ zrp c;
    public final String a;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }

        public final SimulcastDirection fromString(String str) {
            SimulcastDirection simulcastDirection = SimulcastDirection.SEND;
            if (!str.equals(simulcastDirection.getStringValue())) {
                SimulcastDirection simulcastDirection2 = SimulcastDirection.RECV;
                if (str.equals(simulcastDirection2.getStringValue())) {
                    return simulcastDirection2;
                }
            }
            return simulcastDirection;
        }
    }

    static {
        SimulcastDirection simulcastDirection = new SimulcastDirection("SEND", 0, "send");
        SEND = simulcastDirection;
        SimulcastDirection simulcastDirection2 = new SimulcastDirection("RECV", 1, "recv");
        RECV = simulcastDirection2;
        SimulcastDirection[] simulcastDirectionArr = {simulcastDirection, simulcastDirection2};
        b = simulcastDirectionArr;
        c = new asp(simulcastDirectionArr);
        Companion = new Companion(null);
    }

    public SimulcastDirection(String str, int i, String str2) {
        this.a = str2;
    }

    public static zrp<SimulcastDirection> getEntries() {
        return c;
    }

    public static SimulcastDirection valueOf(String str) {
        return (SimulcastDirection) Enum.valueOf(SimulcastDirection.class, str);
    }

    public static SimulcastDirection[] values() {
        return (SimulcastDirection[]) b.clone();
    }

    public final String getStringValue() {
        return this.a;
    }
}
