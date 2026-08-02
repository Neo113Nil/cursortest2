package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;

/* compiled from: AlbumPickerState.kt */
/* loaded from: classes5.dex */
public final class ak1 implements km50 {
    public final UserId b;
    public final wia0<PhotoAlbum> c;
    public final boolean d;
    public final ewp e;

    public ak1(UserId userId, wia0<PhotoAlbum> wia0Var, boolean z, ewp ewpVar) {
        this.b = userId;
        this.c = wia0Var;
        this.d = z;
        this.e = ewpVar;
    }

    public static ak1 a(ak1 ak1Var, wia0 wia0Var, boolean z, ewp ewpVar, int i) {
        UserId userId = ak1Var.b;
        if ((i & 2) != 0) {
            wia0Var = ak1Var.c;
        }
        ak1Var.getClass();
        return new ak1(userId, wia0Var, z, ewpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        return epx.f(this.b, ak1Var.b) && epx.f(this.c, ak1Var.c) && this.d == ak1Var.d && epx.f(this.e, ak1Var.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        wia0<PhotoAlbum> wia0Var = this.c;
        int b = qoy.b((hashCode + (wia0Var == null ? 0 : wia0Var.hashCode())) * 31, 31, this.d);
        ewp ewpVar = this.e;
        return b + (ewpVar != null ? ewpVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumPickerState(ownerId=" + this.b + ", photoAlbum=" + this.c + ", isLoading=" + this.d + ", errorLoading=" + this.e + ')';
    }
}
