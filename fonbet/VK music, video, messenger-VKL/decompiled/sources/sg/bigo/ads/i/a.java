package sg.bigo.ads.i;

import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.common.utils.o;

/* loaded from: classes9.dex */
public final class a {
    public sg.bigo.ads.y.b a;
    public x b;
    public o f;
    public InterfaceC2488a g;
    public long h;
    public boolean d = false;
    boolean e = false;
    public boolean i = true;
    public int c = 1;

    /* renamed from: sg.bigo.ads.i.a$a, reason: collision with other inner class name */
    public interface InterfaceC2488a {
        void a(boolean z, boolean z2);

        void aC();

        void aD();

        void b(long j);
    }

    public static class b implements VideoController.d {
        private final VideoController.d a;

        private b(VideoController.d dVar) {
            this.a = dVar;
        }

        @Override // sg.bigo.ads.api.VideoController.d
        public void a(int i, int i2) {
            VideoController.d dVar = this.a;
            if (dVar != null) {
                dVar.a(i, i2);
            }
        }

        public /* synthetic */ b(VideoController.d dVar, byte b) {
            this(dVar);
        }
    }

    public static class c implements VideoController.b {
        private final VideoController.b a;

        private c(VideoController.b bVar) {
            this.a = bVar;
        }

        @Override // sg.bigo.ads.api.VideoController.b
        public final void a() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.b
        public final void b() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.b();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onMuteChange(boolean z) {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.onMuteChange(z);
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoEnd() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.onVideoEnd();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoPause() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.onVideoPause();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoPlay() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.onVideoPlay();
            }
        }

        @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
        public void onVideoStart() {
            VideoController.b bVar = this.a;
            if (bVar != null) {
                bVar.onVideoStart();
            }
        }

        public /* synthetic */ c(VideoController.b bVar, byte b) {
            this(bVar);
        }
    }

    private void b() {
        InterfaceC2488a interfaceC2488a = this.g;
        if (interfaceC2488a != null) {
            interfaceC2488a.a(a(), this.d);
        }
    }

    public final void a(long j) {
        this.h = j;
        this.c = 2;
    }

    public static /* synthetic */ void a(a aVar) {
        if (!aVar.a()) {
            if (aVar.d) {
                aVar.b();
                return;
            }
            sg.bigo.ads.bn.a.a(0, "CountdownHelper", "invalid status, isCountdownIgnoreVideoProgress=" + aVar.a() + ", mVideoEnd=" + aVar.d);
            return;
        }
        if (aVar.e) {
            aVar.b();
            return;
        }
        sg.bigo.ads.y.b bVar = aVar.a;
        VideoController videoController = bVar != null ? bVar.getVideoController() : null;
        if (videoController == null || videoController.isPlaying()) {
            return;
        }
        videoController.play();
    }

    public final void b(boolean z) {
        if (z && !a()) {
            InterfaceC2488a interfaceC2488a = this.g;
            if (interfaceC2488a != null) {
                interfaceC2488a.aD();
                return;
            }
            return;
        }
        if (z || !a()) {
            return;
        }
        o oVar = this.f;
        if (oVar != null) {
            oVar.d();
        }
        InterfaceC2488a interfaceC2488a2 = this.g;
        if (interfaceC2488a2 != null) {
            interfaceC2488a2.aD();
        }
    }

    public final void a(boolean z) {
        if (z && !a()) {
            InterfaceC2488a interfaceC2488a = this.g;
            if (interfaceC2488a != null) {
                interfaceC2488a.aC();
                return;
            }
            return;
        }
        if (z || !a()) {
            return;
        }
        o oVar = this.f;
        if (oVar != null && oVar.e()) {
            this.f.c();
        }
        InterfaceC2488a interfaceC2488a2 = this.g;
        if (interfaceC2488a2 != null) {
            interfaceC2488a2.aC();
        }
    }

    public final boolean a() {
        return this.c == 2;
    }
}
