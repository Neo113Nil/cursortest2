package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: CounterChangeSettingsItem.kt */
/* loaded from: classes18.dex */
public final class fxj implements hfz {
    public final int b;
    public final FolderType c;
    public final boolean d;

    public fxj(int i, FolderType folderType, boolean z) {
        this.b = i;
        this.c = folderType;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxj)) {
            return false;
        }
        fxj fxjVar = (fxj) obj;
        return this.b == fxjVar.b && this.c == fxjVar.c && this.d == fxjVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (Integer.hashCode(this.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterChangeSettingsItem(id=");
        sb.append(this.b);
        sb.append(", type=");
        sb.append(this.c);
        sb.append(", isChecked=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
