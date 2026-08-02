package xsna;

import com.vk.im.engine.models.dialogs.DialogMember;
import java.util.Comparator;
import ru.ok.pattern.keypoints.GridReducer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lhm implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ lhm(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int lambda$reduce$0;
        switch (this.b) {
            case 0:
                return epx.h(((DialogMember) obj).d, ((DialogMember) obj2).d);
            default:
                lambda$reduce$0 = GridReducer.lambda$reduce$0((xdy) obj, (xdy) obj2);
                return lambda$reduce$0;
        }
    }
}
