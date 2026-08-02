package defpackage;

import android.content.Context;
import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes13.dex */
public final class i3h implements nu {
    public final Context a;
    public final tse b;
    public final n3h c;
    public final DeeplinkSource d;
    public final f3h e;

    public i3h(Context context, tse tseVar, n3h n3hVar, DeeplinkSource deeplinkSource, f3h f3hVar) {
        this.a = context;
        this.b = tseVar;
        this.c = n3hVar;
        this.d = deeplinkSource;
        this.e = f3hVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return new mu("DeeplinkNavigationAction", qoi0.a(DeeplinkNavigationAction.class), new rsf(29), a.b(LazyThreadSafetyMode.NONE, new ybf(20, this)), EmptyList.a, true);
    }
}
