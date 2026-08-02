package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ConcertsTapsHandler.kt */
/* loaded from: classes16.dex */
public final class kwi implements ud40 {
    public final w950 a;

    /* compiled from: ConcertsTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SLIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kwi(w950 w950Var) {
        this.a = w950Var;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        if ((i == 1 || i == 2) && (obj instanceof String)) {
            String str = uIBlock.b;
            CommonAudioStat$TypeAudioUiNavigationItem.EventType eventType = CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO;
            w950 w950Var = this.a;
            w950Var.t(str, eventType);
            w950.p(w950Var, null, MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP_INTERNAL, (String) obj, 1);
        }
    }
}
