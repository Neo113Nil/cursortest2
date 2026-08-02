package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class EssentialStopInfo implements Serializable {
    private boolean first_stop;
    private boolean important;
    private boolean intermediate_terminus;
    private boolean last_stop;

    public EssentialStopInfo() {
        this.first_stop = false;
        this.intermediate_terminus = false;
        this.important = false;
        this.last_stop = false;
    }

    public boolean getFirst_stop() {
        return this.first_stop;
    }

    public boolean getImportant() {
        return this.important;
    }

    public boolean getIntermediate_terminus() {
        return this.intermediate_terminus;
    }

    public boolean getLast_stop() {
        return this.last_stop;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.first_stop = archive.add(this.first_stop);
        this.intermediate_terminus = archive.add(this.intermediate_terminus);
        this.important = archive.add(this.important);
        this.last_stop = archive.add(this.last_stop);
    }

    public EssentialStopInfo(boolean z, boolean z2, boolean z3, boolean z4) {
        this.first_stop = z;
        this.intermediate_terminus = z2;
        this.important = z3;
        this.last_stop = z4;
    }
}
