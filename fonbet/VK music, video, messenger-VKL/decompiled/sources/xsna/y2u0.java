package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.ImageSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewerImageItem.kt */
/* loaded from: classes18.dex */
public final class y2u0 implements hfz {
    public final ArrayList b;
    public final Integer c;

    /* compiled from: ViewerImageItem.kt */
    public static final class a {
        public static y2u0 a(List list) {
            List<BaseImageDto> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            String str = null;
            for (BaseImageDto baseImageDto : list2) {
                if (str == null) {
                    str = baseImageDto.getId();
                }
                arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
            }
            return new y2u0(arrayList, str != null ? arm0.m(10, str) : null);
        }
    }

    public y2u0(ArrayList arrayList, Integer num) {
        this.b = arrayList;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2u0)) {
            return false;
        }
        y2u0 y2u0Var = (y2u0) obj;
        return this.b.equals(y2u0Var.b) && epx.f(this.c, y2u0Var.c);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        Integer num = this.c;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Integer num = this.c;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewerImageItem(imageSizes=");
        sb.append(this.b);
        sb.append(", id=");
        return uqi.b(sb, this.c, ')');
    }
}
