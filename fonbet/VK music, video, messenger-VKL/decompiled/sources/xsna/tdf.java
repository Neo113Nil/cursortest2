package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tdf implements Runnable {
    public final /* synthetic */ int b;

    public /* synthetic */ tdf(int i) {
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.clips.upload.vk.impl.uploader.c.e.getClass();
                wmi0.a.c("clips.persist.uploads");
                break;
            case 1:
                k720 k720Var = k720.a;
                k720.U();
                break;
            default:
                ru.ok.android.webrtc.protocol.screenshare.recv.c.c();
                break;
        }
    }
}
