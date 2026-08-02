package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: DialogFolderStorageModel.kt */
/* loaded from: classes2.dex */
public final class rdm {
    public final int a;
    public final String b;
    public final FolderType c;
    public final int d;

    public rdm(int i, String str, FolderType folderType, int i2) {
        this.a = i;
        this.b = str;
        this.c = folderType;
        this.d = i2;
    }

    public final FolderType a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdm)) {
            return false;
        }
        rdm rdmVar = (rdm) obj;
        return this.a == rdmVar.a && epx.f(this.b, rdmVar.b) && this.c == rdmVar.c && this.d == rdmVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "DialogFolderStorageModel(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ", flags=" + ((Object) ("FolderFlags(flags=" + this.d + ')')) + ')';
    }
}
