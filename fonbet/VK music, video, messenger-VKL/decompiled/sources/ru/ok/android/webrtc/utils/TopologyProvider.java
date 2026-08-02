package ru.ok.android.webrtc.utils;

import ru.ok.android.webrtc.Topology;
import ru.ok.android.webrtc.topology.CallTopology;
import xsna.gzs;

/* loaded from: classes9.dex */
public final class TopologyProvider {
    public gzs a;

    public TopologyProvider(gzs<? extends CallTopology> gzsVar) {
        this.a = gzsVar;
    }

    public final Topology getIdentity() {
        return ((CallTopology) this.a.invoke()).getIdentity();
    }

    public final gzs<CallTopology> getTopology() {
        return this.a;
    }

    public final void setTopology(gzs<? extends CallTopology> gzsVar) {
        this.a = gzsVar;
    }
}
