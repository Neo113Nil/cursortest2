package com.yandex.go.parks.nearest.presentation.ui;

import android.content.Context;
import kotlin.Metadata;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/yandex/go/parks/nearest/presentation/ui/NearestZoneErrorModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Ljava/lang/Runnable;", "onChangeAddressClick", "<init>", "(Landroid/content/Context;Ljava/lang/Runnable;)V", "Ljava/lang/Runnable;", "getOnChangeAddressClick", "()Ljava/lang/Runnable;", "zwx0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class NearestZoneErrorModalView extends SlideableModalView {
    private final Runnable onChangeAddressClick;

    public NearestZoneErrorModalView(Context context, Runnable runnable) {
        super(context);
        this.onChangeAddressClick = runnable;
    }

    public final Runnable getOnChangeAddressClick() {
        return this.onChangeAddressClick;
    }
}
