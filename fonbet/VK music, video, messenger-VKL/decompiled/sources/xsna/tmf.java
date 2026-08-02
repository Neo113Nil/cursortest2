package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class tmf implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tmf(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                com.vk.clips.upload.vk.impl.uploader.f fVar = (com.vk.clips.upload.vk.impl.uploader.f) this.d;
                fVar.d.r(this.c);
                break;
            default:
                ((xv40) this.d).b(this.c);
                break;
        }
    }
}
