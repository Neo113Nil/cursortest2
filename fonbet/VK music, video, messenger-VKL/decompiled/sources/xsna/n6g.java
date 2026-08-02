package xsna;

import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorSpace;
import com.vk.media.pipeline.gl.codec.handler.dto.colorinfo.ColorTransfer;

/* compiled from: ColorInfo.kt */
/* loaded from: classes3.dex */
public final class n6g {
    public static final bpn0 c = new bpn0(new gu0(9));
    public final ColorSpace a;
    public final ColorTransfer b;

    /* compiled from: ColorInfo.kt */
    public static final class a {
        public static n6g a() {
            return (n6g) n6g.c.getValue();
        }
    }

    public n6g(ColorSpace colorSpace, ColorTransfer colorTransfer) {
        this.a = colorSpace;
        this.b = colorTransfer;
    }
}
