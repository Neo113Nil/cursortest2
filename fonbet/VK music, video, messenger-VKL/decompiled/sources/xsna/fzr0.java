package xsna;

import android.content.Context;
import com.vk.libvideo.adfree.api.domain.objects.VideoAdFreeTrapEventTrigger;
import com.vk.video.ui.discovery.minimizable.adfree.VideoAdFreeButton;

/* compiled from: VideoAdFreeTrapManager.kt */
/* loaded from: classes18.dex */
public interface fzr0 {
    void a(VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger, Context context);

    void b(boolean z);

    ryr0 c();

    void d(VideoAdFreeButton videoAdFreeButton);

    void release();

    /* compiled from: VideoAdFreeTrapManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final fzr0 STUB = new C2902a();

        public final fzr0 getSTUB() {
            return STUB;
        }

        /* compiled from: VideoAdFreeTrapManager.kt */
        /* renamed from: xsna.fzr0$a$a, reason: collision with other inner class name */
        public static final class C2902a implements fzr0 {
            @Override // xsna.fzr0
            public final ryr0 c() {
                return new C2903a();
            }

            /* compiled from: VideoAdFreeTrapManager.kt */
            /* renamed from: xsna.fzr0$a$a$a, reason: collision with other inner class name */
            public static final class C2903a implements ryr0 {
                @Override // xsna.ryr0
                public final void a() {
                }

                @Override // xsna.ryr0
                public final void onClick() {
                }

                @Override // xsna.ryr0
                public final void onClose() {
                }
            }

            @Override // xsna.fzr0
            public final void release() {
            }

            @Override // xsna.fzr0
            public final void b(boolean z) {
            }

            @Override // xsna.fzr0
            public final void d(VideoAdFreeButton videoAdFreeButton) {
            }

            @Override // xsna.fzr0
            public final void a(VideoAdFreeTrapEventTrigger videoAdFreeTrapEventTrigger, Context context) {
            }
        }
    }
}
