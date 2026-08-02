package xsna;

import one.video.player.manifest.ManifestValidationErrorType;
import one.video.player.model.VideoContentType;

/* compiled from: ManifestValidationReporter.kt */
/* loaded from: classes3.dex */
public final class nj00 implements lj00 {
    public final boolean a;
    public final gbj b;

    public nj00(boolean z, gbj gbjVar) {
        this.a = z;
        this.b = gbjVar;
    }

    @Override // xsna.lj00
    public final void a(VideoContentType videoContentType, ManifestValidationErrorType manifestValidationErrorType) {
        if (this.a) {
            new mj00(videoContentType, manifestValidationErrorType.name(), (String) this.b.invoke()).q();
        }
    }
}
