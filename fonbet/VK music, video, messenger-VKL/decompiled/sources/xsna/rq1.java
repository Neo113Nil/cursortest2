package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.List;

/* compiled from: AlbumsSettingsViewState.kt */
/* loaded from: classes4.dex */
public final class rq1 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: AlbumsSettingsViewState.kt */
    public static final class a implements fm50<lq1> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: AlbumsSettingsViewState.kt */
    public static final class b {
        public final boolean a;
        public final List<PhotoAlbum> b;
        public final a c;
        public final Throwable d;

        /* compiled from: AlbumsSettingsViewState.kt */
        public static abstract class a {

            /* compiled from: AlbumsSettingsViewState.kt */
            /* renamed from: xsna.rq1$b$a$a, reason: collision with other inner class name */
            public static final class C3624a extends a {
            }

            /* compiled from: AlbumsSettingsViewState.kt */
            /* renamed from: xsna.rq1$b$a$b, reason: collision with other inner class name */
            public static final class C3625b extends a {
                public static final C3625b a = new C3625b();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, List<? extends PhotoAlbum> list, a aVar, Throwable th) {
            this.a = z;
            this.b = list;
            this.c = aVar;
            this.d = th;
        }
    }

    /* compiled from: AlbumsSettingsViewState.kt */
    public static final class c implements fm50<lq1> {
        public static final c a = new c();
    }

    public rq1(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
