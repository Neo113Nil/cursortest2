package xsna;

import android.view.View;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.ecosystem.dto.EcosystemCheckPhoneReuseResponseDto;
import com.vk.api.generated.messages.dto.MessagesCallScheduleDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallSingleItemDto;
import com.vk.dto.common.Peer;
import com.vk.dto.group.Group;
import com.vk.log.L;
import com.vk.music.stickyplayer.domain.PlayerUiMode;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vk.search.params.impl.presentation.modal.database.mvi.model.b;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.builders.ListBuilder;
import xsna.f9k0;
import xsna.g6n0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p6e0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ p6e0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                r6e0.b().b((List) obj);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((sy40) obj).b == PlayerUiMode.VK_MIX);
            case 2:
                float f = 1;
                float floatValue = f - ((Float) obj).floatValue();
                return Float.valueOf(f - (((floatValue * floatValue) * floatValue) * floatValue));
            case 3:
                omh0 omh0Var = (omh0) obj;
                List<kt0> list = omh0Var.d;
                boolean z = omh0Var.e;
                ListBuilder e = e43.e();
                List<kt0> list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                for (kt0 kt0Var : list2) {
                    arrayList.add(new g6n0.a(kt0Var.a, kt0Var.b, kt0Var.c));
                }
                e.addAll(arrayList);
                if (z && !e.isEmpty()) {
                    e.add(new g6n0.b());
                }
                return e.g();
            case 4:
                return b.a.d.a;
            case 5:
                return io.reactivex.rxjava3.core.x.t(((Long) obj).longValue(), TimeUnit.SECONDS);
            case 6:
                List<zam0> list3 = (List) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                for (zam0 zam0Var : list3) {
                    arrayList2.add(new y0f0(zam0Var.a, zam0Var.b, zam0Var.c, zam0Var.d, zam0Var.e));
                }
                return arrayList2;
            case 7:
                return ((RepliesCachedData) obj).b;
            case 8:
                ((View) obj).setPadding(0, 0, 0, 0);
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.r);
            case 10:
                qgi0.r((tgi0) obj, "upload_cell_right_chevron");
                return s3q0.a;
            case 11:
                return Boolean.valueOf(((UserProfileAdapterItem) obj) instanceof UserProfileAdapterItem.e);
            case 12:
                return Long.valueOf(((Peer) obj).d);
            case 13:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, f9k0.d.a, false, false, false, false, -1, 2015);
            case 14:
                return Long.valueOf(((EcosystemCheckPhoneReuseResponseDto) obj).d());
            case 15:
                return s3q0.a;
            case 16:
                String str = (String) j5g.k0(drm0.c0((String) obj, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                if (str != null) {
                    return Integer.valueOf(Integer.parseInt(str));
                }
                return null;
            case 17:
                return ((com.vk.video.ui.discovery.minimizable.q) obj).p;
            case 18:
                return Boolean.valueOf(((Integer) obj).intValue() >= 720);
            case 19:
                return ahn.C((io.reactivex.rxjava3.core.q) obj);
            case 20:
                List list4 = (List) obj;
                L.e("update view_segments storage size:" + list4.size());
                wmi0.a.m("video_viewed_segments", list4);
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                ((tdu) obj).Q0(1);
                return s3q0.a;
            case 23:
                return s3q0.a;
            case 24:
                return (fux0) ((n730) obj);
            case 25:
                return tnf0.i;
            case 26:
                return s3q0.a;
            case 27:
                L.i((Throwable) obj);
                return s3q0.a;
            case 28:
                MessagesScheduledCallSingleItemDto messagesScheduledCallSingleItemDto = (MessagesScheduledCallSingleItemDto) obj;
                MessagesScheduledCallItemDto d = messagesScheduledCallSingleItemDto.d();
                MessagesCallScheduleDto u = messagesScheduledCallSingleItemDto.d().u();
                long g = messagesScheduledCallSingleItemDto.d().u().g();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return MessagesScheduledCallItemDto.a(d, MessagesCallScheduleDto.a(u, timeUnit.toMillis(g), (int) timeUnit.toMillis(messagesScheduledCallSingleItemDto.d().u().getDuration())));
            default:
                Group group = (Group) obj;
                if (epx.f(com.vk.voip.ui.c.L, fkq0.e(group.c))) {
                    com.vk.voip.ui.c.M = group.d;
                    com.vk.voip.ui.c.b.getClass();
                    com.vk.voip.ui.c.D0();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ p6e0(Object obj, int i) {
        this.b = i;
    }
}
