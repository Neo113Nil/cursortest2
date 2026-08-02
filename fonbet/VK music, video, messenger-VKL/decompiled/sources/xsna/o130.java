package xsna;

import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Counters;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ModalPostReactionsInfo.kt */
/* loaded from: classes4.dex */
public final class o130 {
    public final long a;
    public final UserId b;
    public final String c;
    public final LikesGetList.Type d;
    public final Counters e;
    public final UserId f;
    public final String g;
    public final List<v130> h;

    public o130(long j, UserId userId, String str, LikesGetList.Type type, Counters counters, UserId userId2, String str2, ListBuilder listBuilder) {
        this.a = j;
        this.b = userId;
        this.c = str;
        this.d = type;
        this.e = counters;
        this.f = userId2;
        this.g = str2;
        this.h = listBuilder;
    }
}
