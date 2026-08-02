package xsna;

import com.vk.dto.music.Thumb;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: OfflineCategoryData.kt */
/* loaded from: classes16.dex */
public final class tt70 {
    public final long a;
    public final List<Thumb> b;
    public final boolean c;

    public tt70() {
        this(7, 0L, (List) null);
    }

    public tt70(boolean z, long j, List list) {
        this.a = j;
        this.b = list;
        this.c = z;
    }

    public tt70(int i, long j, List list) {
        this((i & 4) == 0, (i & 1) != 0 ? 0L : j, (i & 2) != 0 ? EmptyList.b : list);
    }
}
