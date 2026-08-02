package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.socialgraph.SocialGraphActivity;
import com.vk.socialgraph.SocialGraphStrategy;
import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j550 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ ArrayList c;

    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        int i2 = this.b;
        ArrayList arrayList = this.c;
        switch (i2) {
            case 0:
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                    } else if (((UIBlock) listIterator.previous()).d.l()) {
                        i = listIterator.nextIndex();
                    }
                }
                if (i == e43.h(arrayList)) {
                    g5g.J(arrayList);
                }
                break;
            default:
                int i3 = SocialGraphActivity.i;
                SocialGraphStrategy.Screen screen = SocialGraphStrategy.Screen.TOPICS;
                if (!arrayList.contains(screen)) {
                    arrayList.add(screen);
                }
                break;
        }
        return s3q0.a;
    }
}
