package xsna;

import com.vk.video.ui.share.api.VideoShareComponent;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;

/* compiled from: VideoCatalogHelperDefault.kt */
/* loaded from: classes16.dex */
public class h9s0 implements com.vk.libvideo.videobottomsheet.api.a {
    public final Lazy<VideoShareComponent> a;
    public final List<r6s0> b;
    public final Lazy<hfs0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public h9s0(Lazy<? extends VideoShareComponent> lazy, List<? extends r6s0> list, Lazy<? extends hfs0> lazy2) {
        this.a = lazy;
        this.b = list;
        this.c = lazy2;
    }

    @Override // com.vk.libvideo.videobottomsheet.api.a
    public final z6s0 a() {
        return new z6s0(this.b);
    }

    @Override // com.vk.libvideo.videobottomsheet.api.a
    public final u6s0 b() {
        return new u6s0(this.a, this.b, this.c);
    }

    public h9s0(bpn0 bpn0Var, bpn0 bpn0Var2, int i) {
        this(bpn0Var, EmptyList.b, (i & 4) != 0 ? null : bpn0Var2);
    }
}
