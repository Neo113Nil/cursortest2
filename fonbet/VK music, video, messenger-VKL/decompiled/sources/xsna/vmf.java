package xsna;

import xsna.jkp0;

/* compiled from: ClipsVideoEncoder.kt */
/* loaded from: classes17.dex */
public final class vmf implements jkp0.a {
    public final /* synthetic */ com.vk.clips.upload.vk.impl.uploader.f a;

    public vmf(com.vk.clips.upload.vk.impl.uploader.f fVar) {
        this.a = fVar;
    }

    @Override // xsna.jkp0.a
    public final void a(int i) {
        com.vk.clips.upload.vk.impl.uploader.f fVar = this.a;
        fVar.g.post(new tmf(fVar, i, 0));
    }

    @Override // xsna.jkp0.a
    public final void b(final int i) {
        final com.vk.clips.upload.vk.impl.uploader.f fVar = this.a;
        fVar.g.post(new Runnable() { // from class: xsna.umf
            @Override // java.lang.Runnable
            public final void run() {
                com.vk.clips.upload.vk.impl.uploader.f.this.d.s(i);
            }
        });
    }
}
