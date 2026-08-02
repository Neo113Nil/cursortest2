package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderConfigurationNameInputItem.kt */
/* loaded from: classes18.dex */
public final class xxr implements hfz {
    public final String b;
    public final long c;
    public final boolean d;
    public final int e;
    public final FolderType f;

    public xxr(String str, long j, boolean z, int i, FolderType folderType) {
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = i;
        this.f = folderType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxr)) {
            return false;
        }
        xxr xxrVar = (xxr) obj;
        return epx.f(this.b, xxrVar.b) && this.c == xxrVar.c && this.d == xxrVar.d && this.e == xxrVar.e && this.f == xxrVar.f;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.f.hashCode() + shy.a(this.e, qoy.b(bh10.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        return "FolderConfigurationNameInputItem(predefinedText=" + this.b + ", id=" + this.c + ", isError=" + this.d + ", nameLenLimit=" + this.e + ", type=" + this.f + ')';
    }
}
