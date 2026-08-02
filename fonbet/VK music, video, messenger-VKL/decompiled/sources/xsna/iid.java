package xsna;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketReviewCommentDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.video.dto.VideoLiveStatusDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentDto;
import com.vk.api.generated.wall.dto.WallWallpostAttachmentTypeDto;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: ClipsAuthorsSelectorBottomControllerImpl.kt */
/* loaded from: classes14.dex */
public final class iid implements gz20, c4 {
    public Object b;

    public /* synthetic */ iid(Object obj) {
        this.b = obj;
    }

    public static Pair b(VideoVideoFullDto videoVideoFullDto) {
        List<VideoVideoImageDto> t1 = videoVideoFullDto.t1();
        if (t1 == null) {
            t1 = EmptyList.b;
        }
        List<VideoVideoImageDto> list = t1;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        String str = null;
        for (VideoVideoImageDto videoVideoImageDto : list) {
            Image image = new Image(videoVideoImageDto.getWidth(), videoVideoImageDto.getHeight(), videoVideoImageDto.getUrl(), epx.f(videoVideoImageDto.e(), Boolean.TRUE));
            if (str == null && t3r0.a(image)) {
                str = image.d;
            }
            arrayList.add(image);
        }
        return new Pair(arrayList, str);
    }

    public static long c(VideoVideoFullDto videoVideoFullDto) {
        if (videoVideoFullDto.L1() == VideoLiveStatusDto.UPCOMING || videoVideoFullDto.L1() == VideoLiveStatusDto.WAITING) {
            return -2L;
        }
        if (videoVideoFullDto.L1() == VideoLiveStatusDto.STARTED) {
            return -1L;
        }
        return videoVideoFullDto.P0() != null ? r2.intValue() : 0;
    }

    public String a(VideoVideoFullDto videoVideoFullDto) {
        Resources resources = (Resources) this.b;
        Integer V2 = videoVideoFullDto.V2();
        int intValue = V2 != null ? V2.intValue() : 0;
        return uqm0.g(intValue) ? resources.getString(R.string.views_count_raw, uqm0.f(intValue)) : resources.getQuantityString(R.plurals.views_count, intValue, Integer.valueOf(intValue));
    }

    @Override // xsna.c4
    public void d(b4 b4Var) {
        q4 q4Var = ((VideoMinimizableDiscoveryFragment) this.b).I0;
        if (q4Var != null) {
            q4Var.d(b4Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    public k4g0 e(MarketReviewCommentDto marketReviewCommentDto, int i, big0 big0Var, boolean z, boolean z2, boolean z3) {
        ?? r2;
        ArrayList arrayList;
        int id = marketReviewCommentDto.getId();
        int g = marketReviewCommentDto.g();
        String i2 = marketReviewCommentDto.i();
        boolean g1 = marketReviewCommentDto.g1();
        boolean f = marketReviewCommentDto.f();
        pax0 pax0Var = (pax0) this.b;
        List<WallWallpostAttachmentDto> d = marketReviewCommentDto.d();
        if (d == null) {
            d = EmptyList.b;
        }
        if (!z2 || d.isEmpty()) {
            r2 = EmptyList.b;
        } else {
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = d.iterator();
                while (it.hasNext()) {
                    Attachment a = pax0Var.a((WallWallpostAttachmentDto) it.next(), null);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                arrayList = arrayList2;
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(marketReviewCommentDto.getId());
                return new k4g0(id, i, big0Var, g, z, i2, g1, false, f, arrayList, sb.toString().hashCode(), false);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : d) {
                if (((WallWallpostAttachmentDto) obj).H0() != WallWallpostAttachmentTypeDto.VIDEO) {
                    arrayList3.add(obj);
                }
            }
            r2 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Attachment a2 = pax0Var.a((WallWallpostAttachmentDto) it2.next(), null);
                if (a2 != null) {
                    r2.add(a2);
                }
            }
        }
        arrayList = r2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i);
        sb2.append(marketReviewCommentDto.getId());
        return new k4g0(id, i, big0Var, g, z, i2, g1, false, f, arrayList, sb2.toString().hashCode(), false);
    }

    public ArrayList f(List list, List list2, List list3) {
        Object obj;
        Long n;
        Object obj2;
        List<VideoVideoFullDto> list4 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list4, 10));
        for (VideoVideoFullDto videoVideoFullDto : list4) {
            Pair b = b(videoVideoFullDto);
            List list5 = (List) b.d();
            String str = (String) b.g();
            UserId q = videoVideoFullDto.q();
            if (q == null) {
                q = UserId.d;
            }
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((UsersUserFullDto) obj).s1(), q)) {
                    break;
                }
            }
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
            String a = usersUserFullDto != null ? rq.a(usersUserFullDto, new StringBuilder(), ' ') : null;
            UserId e = fkq0.e(q);
            if (a == null) {
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (epx.f(((GroupsGroupFullDto) obj2).P0(), e)) {
                        break;
                    }
                }
                GroupsGroupFullDto groupsGroupFullDto = (GroupsGroupFullDto) obj2;
                String y1 = groupsGroupFullDto != null ? groupsGroupFullDto.y1() : null;
                a = y1 == null ? "" : y1;
            }
            Pair pair = new Pair(q, a);
            UserId userId = (UserId) pair.d();
            String str2 = (String) pair.g();
            String X1 = videoVideoFullDto.X1();
            long longValue = (X1 == null || (n = arm0.n(X1)) == null) ? 0L : n.longValue();
            Integer s1 = videoVideoFullDto.s1();
            int intValue = s1 != null ? s1.intValue() : 0;
            String title = videoVideoFullDto.getTitle();
            arrayList.add(new p3x0(longValue, intValue, title == null ? "" : title, a(videoVideoFullDto), userId, str2, c(videoVideoFullDto), list5, str));
        }
        return arrayList;
    }

    @Override // xsna.gz20
    public void onCancel() {
        ((jid) this.b).a = null;
    }

    public iid(int i) {
        switch (i) {
            case 2:
                this.b = new Handler(Looper.getMainLooper());
                break;
            case 5:
                break;
            default:
                this.b = new j2r0();
                break;
        }
    }
}
