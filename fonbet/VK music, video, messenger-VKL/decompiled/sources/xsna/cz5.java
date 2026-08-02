package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeImage;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class cz5 implements Comparator {
    public final /* synthetic */ int b;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Serializer.c<BadgeImage> cVar = BadgeImage.CREATOR;
        int intValue = ((Integer) obj).intValue();
        int i = this.b;
        return Math.abs(intValue - i) - Math.abs(((Integer) obj2).intValue() - i);
    }
}
