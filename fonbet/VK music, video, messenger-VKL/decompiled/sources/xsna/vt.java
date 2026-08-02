package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.loyaltyTeen.dto.LoyaltyTeenPartnerAchievementDto;
import com.vk.api.generated.messages.dto.MessagesGetUserAchievementsResponseDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.education.EduAchievement;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AchievementsGetApiCmd.kt */
/* loaded from: classes2.dex */
public final class vt extends nx2<List<? extends EduAchievement>> {
    public final Peer b;

    public vt(Peer peer) {
        this.b = peer;
    }

    @Override // xsna.nx2
    public final List<? extends EduAchievement> f(l7r0 l7r0Var) {
        Image image;
        Peer peer = this.b;
        peer.getClass();
        if (!peer.Ab(Peer.Type.USER)) {
            return EmptyList.b;
        }
        UserId b = com.vk.dto.common.a.b(peer);
        tfx tfxVar = new tfx("messages.getUserAchievements", new oq(21), new pq(15));
        tfx.n(tfxVar, "user_id", b, 0L, 0L, 12);
        List<LoyaltyTeenPartnerAchievementDto> d = ((MessagesGetUserAchievementsResponseDto) bz2.l(tfxVar, false)).d();
        if (d == null) {
            return EmptyList.b;
        }
        List<LoyaltyTeenPartnerAchievementDto> list = d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (LoyaltyTeenPartnerAchievementDto loyaltyTeenPartnerAchievementDto : list) {
            int e = loyaltyTeenPartnerAchievementDto.e();
            String f = loyaltyTeenPartnerAchievementDto.f();
            String d2 = loyaltyTeenPartnerAchievementDto.d();
            List<BaseImageDto> g = loyaltyTeenPartnerAchievementDto.g();
            if (g != null) {
                List<BaseImageDto> list2 = g;
                ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
                for (BaseImageDto baseImageDto : list2) {
                    arrayList2.add(new Image(baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.getUrl(), epx.f(baseImageDto.e(), Boolean.TRUE)));
                }
                image = (Image) j5g.Y(arrayList2);
            } else {
                image = null;
            }
            arrayList.add(new EduAchievement(e, f, d2, image));
        }
        return arrayList;
    }
}
