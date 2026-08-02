package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PosterPreviewItem.kt */
/* loaded from: classes3.dex */
public final class xac0 {
    public final int a;
    public final UserId b;
    public final int c;
    public final List<ImageSize> d;
    public final boolean e;
    public final String f;
    public final String g;

    public xac0(int i, UserId userId, int i2, ArrayList arrayList, boolean z, String str) {
        this.a = i;
        this.b = userId;
        this.c = i2;
        this.d = arrayList;
        this.e = z;
        this.f = str;
        this.g = r11.b(new StringBuilder(), userId.b, '_', i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xac0)) {
            return false;
        }
        xac0 xac0Var = (xac0) obj;
        return this.a == xac0Var.a && epx.f(this.b, xac0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }
}
