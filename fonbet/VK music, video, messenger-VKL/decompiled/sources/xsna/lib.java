package xsna;

import android.content.Context;
import android.util.SparseArray;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* compiled from: ChannelsSearchDecoration.kt */
/* loaded from: classes2.dex */
public final class lib extends m2i0 {
    public final Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lib(Context context, boolean z) {
        super(context, true, !z, 0, 56);
        Integer valueOf = Integer.valueOf(R.string.vkim_recommended_communities_section_header);
        this.m = z ? pn00.k(new Pair(r6q0.class, Integer.valueOf(R.string.vkim_among_all_channels_section_header)), new Pair(uwm0.class, Integer.valueOf(R.string.vkim_subscribed_section_header)), new Pair(lcf0.class, valueOf)) : pn00.k(new Pair(r6q0.class, Integer.valueOf(R.string.vkim_global_search_section_header)), new Pair(lcf0.class, valueOf));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    public final void o(List<? extends com.vk.im.ui.components.msg_search.vc.a> list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            Class<?> cls = ((com.vk.im.ui.components.msg_search.vc.a) obj).getClass();
            ?? r5 = this.m;
            if (r5.containsKey(cls) && !linkedHashSet.contains(cls)) {
                linkedHashSet.add(cls);
                Object obj2 = r5.get(cls);
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                sparseArray.put(i, this.b.getString(((Number) obj2).intValue()));
            }
            i = i2;
        }
        this.h = sparseArray;
    }
}
