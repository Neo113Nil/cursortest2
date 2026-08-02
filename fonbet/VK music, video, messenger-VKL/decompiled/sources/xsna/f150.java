package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.dialogtags.impl.list.TagsListState;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f150 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ f150(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return ((UIBlockPlaceholder) this.c.get(((Integer) obj).intValue())).z;
            default:
                return TagsListState.a((TagsListState) obj, this.c, null, 6);
        }
    }
}
