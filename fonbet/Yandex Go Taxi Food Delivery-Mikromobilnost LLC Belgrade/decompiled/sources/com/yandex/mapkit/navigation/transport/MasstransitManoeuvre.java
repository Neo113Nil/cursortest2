package com.yandex.mapkit.navigation.transport;

import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;
import defpackage.ny61;

/* loaded from: classes15.dex */
public class MasstransitManoeuvre implements Serializable {
    private GetOffTransport getOff;
    private GetOnTransport getOn;

    public static MasstransitManoeuvre fromGetOff(GetOffTransport getOffTransport) {
        if (getOffTransport == null) {
            ny61.g("Variant value \"getOff\" cannot be null");
            return null;
        }
        MasstransitManoeuvre masstransitManoeuvre = new MasstransitManoeuvre();
        masstransitManoeuvre.getOff = getOffTransport;
        return masstransitManoeuvre;
    }

    public static MasstransitManoeuvre fromGetOn(GetOnTransport getOnTransport) {
        if (getOnTransport == null) {
            ny61.g("Variant value \"getOn\" cannot be null");
            return null;
        }
        MasstransitManoeuvre masstransitManoeuvre = new MasstransitManoeuvre();
        masstransitManoeuvre.getOn = getOnTransport;
        return masstransitManoeuvre;
    }

    public GetOffTransport getGetOff() {
        return this.getOff;
    }

    public GetOnTransport getGetOn() {
        return this.getOn;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        this.getOn = (GetOnTransport) archive.add((Archive) this.getOn, true, (Class<Archive>) GetOnTransport.class);
        this.getOff = (GetOffTransport) archive.add((Archive) this.getOff, true, (Class<Archive>) GetOffTransport.class);
    }
}
