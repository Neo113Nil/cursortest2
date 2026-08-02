package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jk40 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ jk40(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                UIBlock uIBlock = (UIBlock) obj;
                boolean z = uIBlock instanceof UIBlockRadioStation;
                int i = this.c;
                return Boolean.valueOf((z && ((UIBlockRadioStation) uIBlock).y.getId() == i) || ((uIBlock instanceof UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) && ((UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) uIBlock).B.getId() == i));
            default:
                return new tfu(n34.a(this.c));
        }
    }
}
