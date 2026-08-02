package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;

/* loaded from: classes2.dex */
public final class j extends l {
    public final ManagingPlusDevicesPropertiesImpl a;

    public j(ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl) {
        this.a = managingPlusDevicesPropertiesImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.a.equals(((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowManagingPlusDevices(properties=" + this.a + ')';
    }
}
