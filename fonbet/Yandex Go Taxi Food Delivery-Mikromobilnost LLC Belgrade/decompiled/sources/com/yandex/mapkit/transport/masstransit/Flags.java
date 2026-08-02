package com.yandex.mapkit.transport.masstransit;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes15.dex */
public class Flags implements Serializable {
    private boolean builtOffline;
    private boolean hasAutoRoad;
    private boolean requiresAccessPass;

    public Flags(boolean z, boolean z2) {
        this.builtOffline = false;
        this.requiresAccessPass = z;
        this.hasAutoRoad = z2;
    }

    public boolean getBuiltOffline() {
        return this.builtOffline;
    }

    public boolean getHasAutoRoad() {
        return this.hasAutoRoad;
    }

    public boolean getRequiresAccessPass() {
        return this.requiresAccessPass;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.requiresAccessPass = archive.add(this.requiresAccessPass);
        this.hasAutoRoad = archive.add(this.hasAutoRoad);
        this.builtOffline = archive.add(this.builtOffline);
    }

    public Flags() {
        this.builtOffline = false;
    }

    public Flags(boolean z, boolean z2, boolean z3) {
        this.requiresAccessPass = z;
        this.hasAutoRoad = z2;
        this.builtOffline = z3;
    }
}
