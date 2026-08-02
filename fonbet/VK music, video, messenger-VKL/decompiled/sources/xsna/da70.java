package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.NotificationImage;
import java.util.Comparator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class da70 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ da70(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Serializer.c<NotificationImage> cVar = NotificationImage.CREATOR;
        int i = ((NotificationImage.ImageInfo) obj).b;
        int i2 = this.b;
        return Math.abs(i - i2) - Math.abs(((NotificationImage.ImageInfo) obj2).b - i2);
    }
}
