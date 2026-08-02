package xsna;

import com.vk.superapp.api.dto.story.WebStoryBox;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes2.dex */
public final class qze0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qze0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((ArrayList) this.c).get(((Number) obj).intValue());
                return null;
            default:
                return WebStoryBox.zb((WebStoryBox) this.c, null, null, (List) obj, 191);
        }
    }
}
