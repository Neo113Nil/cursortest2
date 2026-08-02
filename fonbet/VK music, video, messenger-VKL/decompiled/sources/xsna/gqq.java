package xsna;

import com.vk.dto.photo.Photo;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: FaveGetPhotos.kt */
/* loaded from: classes14.dex */
public final class gqq extends pug0<Photo> {
    public gqq() {
        super("fave.getPhotos", Photo.R);
    }

    public gqq(int i, int i2) {
        this();
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        C(1, "photo_sizes");
    }

    public gqq(String str, int i) {
        this();
        K("start_from", str == null ? "0" : str);
        C(i, "count");
        C(1, "photo_sizes");
    }
}
