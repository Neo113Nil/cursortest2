package defpackage;

import androidx.camera.video.internal.audio.d;

/* loaded from: classes10.dex */
public final class fh3 implements iqs {
    public final /* synthetic */ d a;

    public /* synthetic */ fh3(d dVar) {
        this.a = dVar;
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.a.hashCode()));
        sgb1.g(3, "Recorder");
    }

    @Override // defpackage.iqs
    public void onSuccess(Object obj) {
        String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.a.hashCode()));
        sgb1.g(3, "Recorder");
    }
}
