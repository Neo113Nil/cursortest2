package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FoldersEvent.kt */
/* loaded from: classes2.dex */
public final class ob80 extends a1s {
    public final FolderType b;

    public ob80(FolderType folderType) {
        this.b = folderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob80) && this.b == ((ob80) obj).b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "OnSelectedFolderChanged(type=" + this.b + ')';
    }
}
