package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k extends l {
    public final boolean a;
    public final ManagingPlusDevicesPropertiesImpl b;

    public k(boolean z, ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl) {
        this.a = z;
        this.b = managingPlusDevicesPropertiesImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && jl40.l(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TryAddPlusDevice(isFirstRequest=" + this.a + ", properties=" + this.b + ')';
    }
}
