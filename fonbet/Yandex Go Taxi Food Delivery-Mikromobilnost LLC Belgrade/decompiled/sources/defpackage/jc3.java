package defpackage;

import com.yandex.messaging.files.ImageFileInfo;

/* loaded from: classes15.dex */
public final class jc3 {
    public final ImageFileInfo a;

    public jc3(ImageFileInfo imageFileInfo) {
        this.a = imageFileInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc3) && this.a.equals(((jc3) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31);
    }

    public final String toString() {
        return "Single(isAux=false, data=" + this.a + ", treatAsFile=false)";
    }
}
