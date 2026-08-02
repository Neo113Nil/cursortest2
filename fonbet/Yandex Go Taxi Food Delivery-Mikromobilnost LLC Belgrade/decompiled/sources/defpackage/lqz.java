package defpackage;

import com.yandex.go.taxi.order.models.api.response.typed_experiments.LootBoxAnimationInfo;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Llqz;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface lqz extends l050 {
    void dismissView();

    void setLootBoxV1ActivateData(ppz ppzVar);

    void showError(String str);

    void showLoadingLottie(InputStream inputStream);

    void showLoadingWithoutLottie();

    void startAnimateGifts(List list, InputStream inputStream, InputStream inputStream2, LootBoxAnimationInfo lootBoxAnimationInfo);
}
