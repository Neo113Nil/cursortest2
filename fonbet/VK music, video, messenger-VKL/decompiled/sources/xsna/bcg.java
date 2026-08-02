package xsna;

import android.util.SparseArray;
import com.vk.dto.badges.BadgeItem;
import com.vk.dto.newsfeed.PostAuthor;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommentParserParams.kt */
/* loaded from: classes18.dex */
public final class bcg {
    public final PostAuthor a;
    public final HashMap b;
    public final Object c;
    public final SparseArray<BadgeItem> d;
    public final int e;

    public bcg(PostAuthor postAuthor, HashMap hashMap, Map map, SparseArray sparseArray, int i) {
        this.a = postAuthor;
        this.b = hashMap;
        this.c = map;
        this.d = sparseArray;
        this.e = i;
    }
}
