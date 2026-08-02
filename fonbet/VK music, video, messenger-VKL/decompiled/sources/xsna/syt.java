package xsna;

import com.vk.dto.stories.model.GifItem;
import java.util.List;

/* compiled from: GifInteractor.kt */
/* loaded from: classes2.dex */
public interface syt {
    static /* synthetic */ io.reactivex.rxjava3.core.q d(syt sytVar, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return sytVar.e((i & 4) != 0 ? 30 : 8, str, str2);
    }

    io.reactivex.rxjava3.core.a a();

    io.reactivex.rxjava3.core.q<List<GifItem>> b();

    io.reactivex.rxjava3.core.a c(GifItem gifItem);

    io.reactivex.rxjava3.core.q e(int i, String str, String str2);
}
