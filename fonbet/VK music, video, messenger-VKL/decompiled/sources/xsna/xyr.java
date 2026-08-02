package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FolderItem.kt */
/* loaded from: classes18.dex */
public interface xyr {

    /* compiled from: FolderItem.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final boolean c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CountersInfo(count=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isMuted=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    a a();

    int getId();

    String getName();

    FolderType getType();
}
