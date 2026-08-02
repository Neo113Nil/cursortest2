package xsna;

import com.vk.dto.photo.ImageCropData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AttachmentsBottomPreviewControls.kt */
/* loaded from: classes3.dex */
public final class kfk {
    public final List<ImageCropData> a;
    public final String b;

    public kfk(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfk)) {
            return false;
        }
        kfk kfkVar = (kfk) obj;
        return epx.f(this.a, kfkVar.a) && epx.f(this.b, kfkVar.b);
    }

    public final int hashCode() {
        List<ImageCropData> list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CropDataForRequest(currentCrops=");
        sb.append(this.a);
        sb.append(", ratioMeta=");
        return ho8.a(sb, this.b, ')');
    }
}
