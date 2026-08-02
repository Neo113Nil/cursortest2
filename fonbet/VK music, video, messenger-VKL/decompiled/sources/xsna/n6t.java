package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.games.presentation.catalog.model.items.GameCatalogBadge;

/* compiled from: GameCatalogBadge.kt */
/* loaded from: classes17.dex */
public final class n6t {

    /* compiled from: GameCatalogBadge.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GameCatalogBadge.values().length];
            try {
                iArr[GameCatalogBadge.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GameCatalogBadge.BONUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final GameCatalogBadge a(WebApiApplication webApiApplication) {
        String str = webApiApplication.o;
        if (epx.f(str, "notification_discount") || epx.f(str, "notification_gift")) {
            return GameCatalogBadge.BONUS;
        }
        if (webApiApplication.p) {
            return GameCatalogBadge.NEW;
        }
        return null;
    }
}
