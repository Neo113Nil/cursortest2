package ru.ok.android.webrtc.simulcast;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.irt;
import xsna.j5g;
import xsna.ow60;

/* loaded from: classes9.dex */
public final class SimulcastConfig {
    public final String a;
    public final List b;

    public SimulcastConfig(String str, List<SimulcastLayerInfo> list) {
        this.a = str;
        this.b = list;
    }

    public static final CharSequence a(SimulcastLayerInfo simulcastLayerInfo) {
        return simulcastLayerInfo.getRid();
    }

    public static final CharSequence b(SimulcastLayerInfo simulcastLayerInfo) {
        return simulcastLayerInfo.getRid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimulcastConfig copy$default(SimulcastConfig simulcastConfig, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simulcastConfig.a;
        }
        if ((i & 2) != 0) {
            list = simulcastConfig.b;
        }
        return simulcastConfig.copy(str, list);
    }

    public final String component1() {
        return this.a;
    }

    public final List<SimulcastLayerInfo> component2() {
        return this.b;
    }

    public final SimulcastConfig copy(String str, List<SimulcastLayerInfo> list) {
        return new SimulcastConfig(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimulcastConfig)) {
            return false;
        }
        SimulcastConfig simulcastConfig = (SimulcastConfig) obj;
        return epx.f(this.a, simulcastConfig.a) && epx.f(this.b, simulcastConfig.b);
    }

    public final List<SimulcastLayerInfo> getLayers() {
        return this.b;
    }

    public final String getMid() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final List<String> toSdpSimulcastLine() {
        List list = this.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SimulcastLayerInfo) obj).getDirection() == SimulcastDirection.SEND) {
                arrayList.add(obj);
            }
        }
        String g0 = j5g.g0(arrayList, ";", null, null, 0, new irt(21), 30);
        List list2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (((SimulcastLayerInfo) obj2).getDirection() == SimulcastDirection.RECV) {
                arrayList2.add(obj2);
            }
        }
        String g02 = j5g.g0(arrayList2, ";", null, null, 0, new ow60(14), 30);
        ArrayList arrayList3 = new ArrayList();
        if (g0.length() > 0) {
            arrayList3.add("a=simulcast:" + SimulcastDirection.SEND.getStringValue() + " " + g0);
        }
        if (g02.length() > 0) {
            arrayList3.add("a=simulcast:" + SimulcastDirection.RECV.getStringValue() + " " + g02);
        }
        return arrayList3;
    }

    public String toString() {
        return "SimulcastConfig(mid=" + this.a + ", layers=" + this.b + ")";
    }
}
