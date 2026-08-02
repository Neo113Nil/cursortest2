package xsna;

import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import java.util.List;

/* compiled from: ClipsFavoritesFoldersPickerContentView.kt */
/* loaded from: classes16.dex */
public final class r4e implements VkCell.f {
    public final List<Image> a;

    public r4e(List<Image> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r4e) && epx.f(this.a, ((r4e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CoverViewParams(coverImages="), this.a);
    }
}
