package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: DialogsFolder.kt */
/* loaded from: classes2.dex */
public final class rpm {
    public final int a;
    public final String b;
    public final FolderType c;

    public rpm(int i, String str, FolderType folderType) {
        this.a = i;
        this.b = str;
        this.c = folderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpm)) {
            return false;
        }
        rpm rpmVar = (rpm) obj;
        return this.a == rpmVar.a && epx.f(this.b, rpmVar.b) && this.c == rpmVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "DialogsFolder(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ')';
    }
}
