package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.Set;
import kotlin.collections.EmptyList;
import xsna.mke;

/* compiled from: ClipsFeedRepository.kt */
/* loaded from: classes17.dex */
public interface t8e {

    /* compiled from: ClipsFeedRepository.kt */
    public static final class a {
        public static io.reactivex.rxjava3.core.x a(i4r i4rVar, mke.x xVar) {
            return i4rVar.h(xVar, PaginationKey.Initial.b, null, EmptyList.b);
        }

        public static io.reactivex.rxjava3.core.x b(i4r i4rVar, mke.y yVar, PaginationKey paginationKey, int i) {
            if ((i & 2) != 0) {
                paginationKey = PaginationKey.Initial.b;
            }
            return i4rVar.h(yVar, paginationKey, null, EmptyList.b);
        }
    }

    io.reactivex.rxjava3.core.x<qih0> a(mke mkeVar, PaginationKey paginationKey);

    io.reactivex.rxjava3.core.x<Set<Integer>> b(Set<ekz> set);

    io.reactivex.rxjava3.core.k<vw50> c();
}
