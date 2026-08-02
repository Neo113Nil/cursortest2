package xsna;

import com.vk.dto.messages.MsgTextFormatItem;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Comparator;
import xsna.gdl;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class fzr implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ fzr(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        e7g0 e7g0Var;
        androidx.media3.common.a aVar;
        e7g0 e7g0Var2;
        androidx.media3.common.a aVar2;
        switch (this.b) {
            case 0:
                return jw5.b(((Dialog) obj2).Sb(), ((Dialog) obj).Sb());
            case 1:
                gdl.a aVar3 = (gdl.a) obj2;
                Integer num = null;
                Integer valueOf = (aVar3 == null || (e7g0Var2 = aVar3.b) == null || (aVar2 = e7g0Var2.b) == null) ? null : Integer.valueOf(aVar2.j);
                gdl.a aVar4 = (gdl.a) obj;
                if (aVar4 != null && (e7g0Var = aVar4.b) != null && (aVar = e7g0Var.b) != null) {
                    num = Integer.valueOf(aVar.j);
                }
                return jw5.b(valueOf, num);
            default:
                return jw5.b(Integer.valueOf(((MsgTextFormatItem) obj).b), Integer.valueOf(((MsgTextFormatItem) obj2).b));
        }
    }
}
