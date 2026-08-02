package xsna;

import com.vk.dto.common.VideoFile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rgt0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rgt0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((s290) ((com.vk.newsfeed.common.recycler.holders.i) this.c).i0.getValue()).a(((VideoFile) this.d).w2());
            default:
                com.vk.video.profile.presentation.g gVar = (com.vk.video.profile.presentation.g) this.c;
                return new o9t0(gVar.d, gVar.e, gVar.f, (ou1) this.d, gVar.g);
        }
    }
}
