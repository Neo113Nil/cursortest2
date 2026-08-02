package xsna;

import com.vk.catalog2.common.ui.core.util.EditorMode;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class zra extends n3a {
    public final EditorMode a;
    public final String b;

    public zra(EditorMode editorMode, String str) {
        this.a = editorMode;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zra)) {
            return false;
        }
        zra zraVar = (zra) obj;
        return this.a == zraVar.a && epx.f(this.b, zraVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeEditorStateCmd(mode=");
        sb.append(this.a);
        sb.append(", sectionId=");
        return ho8.a(sb, this.b, ')');
    }
}
