package defpackage;

import com.yandex.go.places.models.data.entities.network.MediaDto$PhotoMediaDto;
import com.yandex.go.places.models.data.entities.network.MediaDto$VideoMediaDto;
import com.yandex.go.places.models.data.entities.network.a0;
import com.yandex.go.places.models.data.entities.network.c0;
import java.util.Arrays;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;

/* loaded from: classes13.dex */
public final class je10 {
    public static k7v a(c0 c0Var) {
        if (c0Var != null) {
            if (c0Var instanceof MediaDto$PhotoMediaDto) {
                return b(((MediaDto$PhotoMediaDto) c0Var).a);
            }
            if (c0Var instanceof MediaDto$VideoMediaDto) {
                String str = ((MediaDto$VideoMediaDto) c0Var).a;
                if (str == null) {
                    str = "";
                }
                return b(str);
            }
            if (!c0Var.equals(a0.INSTANCE)) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    public static k7v b(String str) {
        if (evu0.J(str)) {
            return null;
        }
        return new k7v(String.format(str, Arrays.copyOf(new Object[]{"XXL"}, 1)), String.format(str, Arrays.copyOf(new Object[]{GlideBitmapDownloader.URL_SUFFIX_PLACEHOLDER}, 1)));
    }
}
