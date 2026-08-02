package xsna;

import com.vk.dto.photo.PhotoAlbum;
import java.util.List;

/* compiled from: AlbumsSettingsPatch.kt */
/* loaded from: classes4.dex */
public abstract class hq1 implements xl50 {

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class a extends hq1 {
        public final PhotoAlbum b;

        public a(PhotoAlbum photoAlbum) {
            this.b = photoAlbum;
        }
    }

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class b extends hq1 {
        public static final b b = new b();
    }

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class c extends hq1 {
        public final Throwable b;
        public final boolean c;

        public c(Throwable th, boolean z) {
            this.b = th;
            this.c = z;
        }
    }

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class d extends hq1 {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class e extends hq1 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: AlbumsSettingsPatch.kt */
    public static final class f extends hq1 {
        public final List<PhotoAlbum> b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(List<? extends PhotoAlbum> list) {
            this.b = list;
        }
    }
}
