package androidx.camera.video.internal.encoder;

import defpackage.yci0;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((EncoderImpl$MediaCodecCallback) obj).reachEndData();
                break;
            default:
                j jVar = (j) obj;
                switch (jVar.w.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        jVar.g();
                        break;
                    case 3:
                    case 4:
                    case 5:
                        jVar.j(EncoderImpl$InternalState.PENDING_RELEASE);
                        break;
                    case 6:
                    case 8:
                        break;
                    default:
                        yci0.t(jVar.w, "Unknown state: ");
                        break;
                }
        }
    }
}
