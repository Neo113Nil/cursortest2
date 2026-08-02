package xsna;

import android.net.Uri;
import com.vk.dto.common.Image;

/* compiled from: VideoOfflineImagesRepository.kt */
/* loaded from: classes.dex */
public interface bzs0 {
    default io.reactivex.rxjava3.core.x A(int i, String str, String str2) {
        return sn.b("Timeline thumb loading method not implemented");
    }

    default io.reactivex.rxjava3.core.x<Uri> i(String str, String str2) {
        return sn.b("Video author photo loading method not implemented");
    }

    default io.reactivex.rxjava3.core.x o(Image image, String str) {
        return sn.b("Video cover loading method not implemented");
    }

    default void m(String str) {
    }
}
