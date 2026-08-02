package xsna;

import com.vk.im.engine.models.dialogs.FolderType;

/* compiled from: FoldersPagerNavigationEvent.kt */
/* loaded from: classes18.dex */
public abstract class n1s implements vl50 {

    /* compiled from: FoldersPagerNavigationEvent.kt */
    public static final class a extends n1s {
        public final int a;
        public final String b;
        public final FolderType c;

        public a(int i, String str, FolderType folderType) {
            this.a = i;
            this.b = str;
            this.c = folderType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "OpenFolderConfigureEvent(id=" + this.a + ", name=" + this.b + ", type=" + this.c + ')';
        }
    }

    /* compiled from: FoldersPagerNavigationEvent.kt */
    public static final class b extends n1s {
        public static final b a = new b();
    }
}
