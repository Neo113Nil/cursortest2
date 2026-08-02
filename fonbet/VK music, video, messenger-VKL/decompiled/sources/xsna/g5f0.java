package xsna;

import com.vk.api.generated.likes.dto.LikesTypeDto;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ReactionsFeedRepositoryImpl.kt */
/* loaded from: classes4.dex */
public final class g5f0 {
    public static final List<LikesTypeDto> a = e43.l(LikesTypeDto.POST, LikesTypeDto.COMMENT, LikesTypeDto.CLIP, LikesTypeDto.VIDEO);

    public static String a(String str) {
        Object obj;
        String j;
        List<LikesTypeDto> list = a;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((LikesTypeDto) obj).j(), str)) {
                break;
            }
        }
        LikesTypeDto likesTypeDto = (LikesTypeDto) obj;
        if (likesTypeDto != null && (j = likesTypeDto.j()) != null) {
            return j;
        }
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((LikesTypeDto) it2.next()).j());
        }
        return p4g.k(arrayList, StringUtils.COMMA, null);
    }
}
