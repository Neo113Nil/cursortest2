package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipsItemsCacheRecyclerListener.kt */
/* loaded from: classes16.dex */
public abstract class rie extends RecyclerView.t {

    /* compiled from: ClipsItemsCacheRecyclerListener.kt */
    public static abstract class a {

        /* compiled from: ClipsItemsCacheRecyclerListener.kt */
        /* renamed from: xsna.rie$a$a, reason: collision with other inner class name */
        public static final class C3610a extends a {
            public final SdkVideoFile a;

            public C3610a(SdkVideoFile sdkVideoFile) {
                this.a = sdkVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3610a) && epx.f(this.a, ((C3610a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Cacheable(video=" + this.a + ')';
            }
        }

        /* compiled from: ClipsItemsCacheRecyclerListener.kt */
        public static final class b extends a {
            public static final b a = new b();
        }
    }

    public abstract void l(RecyclerView recyclerView);

    public abstract void m();
}
