package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: DiscoverMediaPatch.kt */
/* loaded from: classes4.dex */
public interface h4n extends yl50 {

    /* compiled from: DiscoverMediaPatch.kt */
    public interface a extends h4n {

        /* compiled from: DiscoverMediaPatch.kt */
        /* renamed from: xsna.h4n$a$a, reason: collision with other inner class name */
        public static final class C2971a implements a {
            public static final C2971a a = new C2971a();
        }

        /* compiled from: DiscoverMediaPatch.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    /* compiled from: DiscoverMediaPatch.kt */
    public interface b extends h4n {

        /* compiled from: DiscoverMediaPatch.kt */
        public static final class a implements b {
            public final VideoFile a;
            public final boolean b;

            public a(VideoFile videoFile, boolean z) {
                this.a = videoFile;
                this.b = z;
            }
        }
    }
}
