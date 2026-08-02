package xsna;

import com.vk.dto.photo.PhotoAlbum;
import com.vk.lists.ListDataSet;
import java.util.List;

/* compiled from: AlbumsSettingsAction.kt */
/* loaded from: classes4.dex */
public abstract class vp1 implements kj50 {

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class a extends vp1 {
        public static final a b = new a();
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class b extends vp1 {
        public final PhotoAlbum b;

        public b(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class c extends vp1 {
        public final PhotoAlbum b;

        public c(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class d extends vp1 {
        public final List<PhotoAlbum> b;

        public d(ListDataSet.ArrayListImpl arrayListImpl) {
            this.b = arrayListImpl;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class e extends vp1 {
        public static final e b = new e();
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class f extends vp1 {
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class g extends vp1 {
        public final boolean b;

        public g(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class h extends vp1 {
        public final List<PhotoAlbum> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends PhotoAlbum> list, boolean z) {
            this.b = list;
            this.c = z;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class i extends vp1 {
        public final Throwable b;
        public final boolean c;

        public i(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumsSettingsAction.kt */
    public static final class j extends vp1 {
        public final PhotoAlbum b;

        public j(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }
}
