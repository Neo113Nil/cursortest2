package xsna;

import com.vk.libvideo.tooltips.VideoTooltip;

/* compiled from: LinkBaseVh.kt */
/* loaded from: classes16.dex */
public final class w8z implements VideoTooltip.a {
    public final /* synthetic */ gzs<s3q0> a;

    public w8z(gzs<s3q0> gzsVar) {
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
