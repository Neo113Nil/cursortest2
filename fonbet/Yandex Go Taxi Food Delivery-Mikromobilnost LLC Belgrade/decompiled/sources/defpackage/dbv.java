package defpackage;

import com.yandex.go.places.models.data.entities.network.ImageDto;
import java.util.Arrays;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes13.dex */
public final class dbv {
    public final k7x0 a;

    public dbv(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public static k7v b(String str) {
        if (str == null || evu0.J(str)) {
            return null;
        }
        return new k7v(String.format(str, Arrays.copyOf(new Object[]{"XXL"}, 1)), String.format(str, Arrays.copyOf(new Object[]{GlideBitmapDownloader.URL_SUFFIX_PLACEHOLDER}, 1)));
    }

    public final k7v a(ImageDto imageDto) {
        String a;
        if (imageDto == null) {
            return null;
        }
        k7v b = b(imageDto.a);
        if (b != null) {
            return b;
        }
        String str = imageDto.b;
        if (str == null || (a = ((m7x0) this.a).a(str)) == null) {
            return null;
        }
        return new k7v(a, 2);
    }
}
