package xsna;

import com.vk.dto.common.im.ImageList;

/* compiled from: WithPreview.kt */
/* loaded from: classes18.dex */
public interface ztx0 {
    ImageList d();

    ImageList f();

    default ImageList g() {
        ImageList d = d();
        return d.Jb() ? d : f();
    }
}
