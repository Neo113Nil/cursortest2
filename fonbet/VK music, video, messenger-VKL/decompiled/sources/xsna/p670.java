package xsna;

import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioUiNavigationItem;

/* compiled from: NoneDataTypeTapsHandler.kt */
/* loaded from: classes16.dex */
public final class p670 implements ud40 {
    public final w950 a;
    public final gzs<String> b;

    /* compiled from: NoneDataTypeTapsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p670(w950 w950Var, gzs<String> gzsVar) {
        this.a = w950Var;
        this.b = gzsVar;
    }

    @Override // xsna.ud40
    public final void a(UIBlock uIBlock, Object obj) {
        String str = uIBlock.b;
        int i = a.$EnumSwitchMapping$0[uIBlock.d.ordinal()];
        w950 w950Var = this.a;
        if (i == 1) {
            w950Var.K(str);
            w950Var.t(str, CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            return;
        }
        gzs<String> gzsVar = this.b;
        if (i == 2) {
            w950Var.M(str, CommonAudioStat$TypeAudioUiClickItem.EventType.TAP_GOTO);
            w950Var.t(gzsVar.invoke(), CommonAudioStat$TypeAudioUiNavigationItem.EventType.TAP_GOTO);
            w950.p(w950Var, uIBlock.b, null, null, 6);
        } else if (obj instanceof pp40) {
            if (str.length() == 0) {
                String invoke = gzsVar.invoke();
                if (invoke == null) {
                    invoke = "";
                }
                str = invoke;
            }
            w950Var.A(str);
        }
    }
}
