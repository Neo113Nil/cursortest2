package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class mb80 extends a1s {
    public final FolderType b;

    public mb80(FolderType folderType) {
        this.b = folderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mb80) && this.b == ((mb80) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnSelectFolderByTypeReceived(type=" + this.b + ')';
    }
}
