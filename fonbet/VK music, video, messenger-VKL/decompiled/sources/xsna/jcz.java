package xsna;

import com.vk.libvideo.tooltips.VideoTooltip;

/* compiled from: LinkVh.kt */
/* loaded from: classes16.dex */
public final class jcz implements VideoTooltip.a {
    public final /* synthetic */ gzs<s3q0> a;

    public jcz(gzs<s3q0> gzsVar) {
        this.a = gzsVar;
    }

    @Override // com.vk.libvideo.tooltips.VideoTooltip.a
    public final void onClick() {
        gzs<s3q0> gzsVar = this.a;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // com.vk.libvideo.tooltips.VideoTooltip.a
    public final void a() {
    }
}
