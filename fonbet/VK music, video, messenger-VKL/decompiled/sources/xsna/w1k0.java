package xsna;

import com.vk.dto.stories.model.StoryEntry;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class w1k0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1k0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                jai jaiVar = (jai) this.c;
                Integer num = (Integer) obj2;
                num.getClass();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1480641893, intValue, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.Header.<anonymous> (SlidingContent.kt:121)");
                }
                jaiVar.invoke(q630.a.a, num, aVar, Integer.valueOf((intValue & 112) | 6));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
            default:
                ((Boolean) obj2).getClass();
                ((jzl0) this.c).m((StoryEntry) obj, false);
                break;
        }
        return s3q0.a;
    }
}
