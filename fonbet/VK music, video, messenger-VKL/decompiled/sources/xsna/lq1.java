package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import java.util.List;

/* compiled from: AlbumsSettingsState.kt */
/* loaded from: classes4.dex */
public final class lq1 implements km50 {
    public final List<PhotoAlbum> b;
    public final a c;
    public final a d;
    public final UserId e;

    /* compiled from: AlbumsSettingsState.kt */
    public static abstract class a {

        /* compiled from: AlbumsSettingsState.kt */
        /* renamed from: xsna.lq1$a$a, reason: collision with other inner class name */
        public static final class C3283a extends a {
            public final Throwable a;

            public C3283a(Throwable th) {
                this.a = th;
            }
        }

        /* compiled from: AlbumsSettingsState.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lq1(List<? extends PhotoAlbum> list, a aVar, a aVar2, UserId userId) {
        this.b = list;
        this.c = aVar;
        this.d = aVar2;
        this.e = userId;
    }

    public static lq1 a(lq1 lq1Var, List list, a aVar, a aVar2, int i) {
        if ((i & 1) != 0) {
            list = lq1Var.b;
        }
        if ((i & 2) != 0) {
            aVar = lq1Var.c;
        }
        if ((i & 4) != 0) {
            aVar2 = lq1Var.d;
        }
        UserId userId = lq1Var.e;
        lq1Var.getClass();
        return new lq1(list, aVar, aVar2, userId);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq1)) {
            return false;
        }
        lq1 lq1Var = (lq1) obj;
        return epx.f(this.b, lq1Var.b) && epx.f(this.c, lq1Var.c) && epx.f(this.d, lq1Var.d) && epx.f(this.e, lq1Var.e);
    }

    public final int hashCode() {
        List<PhotoAlbum> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        a aVar = this.c;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.d;
        return Long.hashCode(this.e.b) + ((hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumsSettingsState(albums=");
        sb.append(this.b);
        sb.append(", firstPageLoadingState=");
        sb.append(this.c);
        sb.append(", nextPageLoadingState=");
        sb.append(this.d);
        sb.append(", uid=");
        return gp.b(sb, this.e, ')');
    }
}
