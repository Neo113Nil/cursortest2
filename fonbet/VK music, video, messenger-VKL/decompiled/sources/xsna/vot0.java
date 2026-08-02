package xsna;

import com.vk.libvideo.upload.api.VideoUploadEvent;

/* compiled from: _Sequences.kt */
/* loaded from: classes16.dex */
public final class vot0 implements izs<Object, Boolean> {
    public static final vot0 b = new vot0();

    @Override // xsna.izs
    public final Boolean invoke(Object obj) {
        return Boolean.valueOf(obj instanceof VideoUploadEvent.Done);
    }
}
