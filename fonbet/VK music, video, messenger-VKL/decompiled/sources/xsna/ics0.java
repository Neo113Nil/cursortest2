package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: VideoCommentsRepository.kt */
/* loaded from: classes4.dex */
public final class ics0 {
    public static final List<String> c = e43.l("first_name_dat", "photo_base");
    public static final Set<Integer> d = Collections.singleton(Integer.valueOf(ApiInvocationException.ErrorCodes.CHAT_PARTICIPANTS_EMPTY_BLOCKED_USERS));
    public static final VideoGetCommentsExtendedResponseDto e;
    public final bpn0 a = new bpn0(new ltb0(12));
    public final Object b;

    static {
        EmptyList emptyList = EmptyList.b;
        e = new VideoGetCommentsExtendedResponseDto(0, emptyList, emptyList, emptyList, null, null, null, null, null, null, null, null, null, null, null, 32752, null);
    }

    public ics0(Lazy<pax0> lazy) {
        this.b = msy.a(LazyThreadSafetyMode.NONE, new s(22, lazy, this));
    }

    public final io.reactivex.rxjava3.core.q<NewsComment> a(x1p x1pVar, izs<? super Integer, owt> izsVar) {
        int i = x1pVar.a;
        UserId userId = x1pVar.b;
        String str = x1pVar.c;
        List<Attachment> list = x1pVar.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Attachment) it.next()).toString());
        }
        String str2 = x1pVar.e;
        xsg0 xsg0Var = new xsg0("video.editComment");
        xsg0Var.g(i, "comment_id");
        if (userId != null) {
            xsg0Var.j.put("owner_id", String.valueOf(userId.b));
        }
        if (str != null) {
            xsg0Var.j("message", str);
        }
        xsg0Var.i("attachments", arrayList);
        if (str2 != null) {
            xsg0Var.j("screen_mode", str2);
        }
        return rsg0.T(xsg0Var).L(new cmc0(new o15(this, izsVar, x1pVar, 8), 5), false);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 b(owt owtVar) {
        return new io.reactivex.rxjava3.internal.operators.observable.i0(c(owtVar).U(new cyh0(new b1o0(3), 3)), new ac20(new hcs0(0), 22)).U(new uf20(new puq0(3), 21));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 c(owt owtVar) {
        uft0 uft0Var = new uft0();
        int i = owtVar.a;
        UserId userId = owtVar.b;
        String str = owtVar.c;
        boolean z = owtVar.g;
        Integer num = owtVar.d;
        Integer num2 = owtVar.e;
        Integer num3 = (num2 == null || num2.intValue() <= 0) ? null : num2;
        int i2 = owtVar.h;
        Integer num4 = owtVar.i;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = owtVar.j;
        if (videoGetCommentsExtendedSortDto == null) {
            videoGetCommentsExtendedSortDto = VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST;
        }
        dz2 x = yfb.x(tft0.C(uft0Var, i, userId, str, Boolean.valueOf(z), num, num4, Integer.valueOf(i2), videoGetCommentsExtendedSortDto, c, null, num3, null, 13568));
        ahn.D(x);
        return rsg0.y0(x, null, new qyn0(4), 1).U(new nlf0(new ito0(3, this, owtVar), 10));
    }
}
