package xsna;

import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.data.VKList;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.k;
import com.vk.voip.dto.RecordType;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import xsna.c9t0;
import xsna.hh8;
import xsna.n7t0;
import xsna.nt80;
import xsna.qtk0;
import xsna.spw0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class yaq0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ yaq0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        uj8 uj8Var;
        int i = 0;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(((ced) obj).a.h != null);
            case 1:
                return Optional.of((VKList) obj);
            case 2:
                return Boolean.valueOf(!drm0.N(((a21) obj).a));
            case 3:
                return s3q0.a;
            case 4:
                c9t0 c9t0Var = (c9t0) obj;
                if (c9t0Var instanceof c9t0.a) {
                    return n7t0.c.a;
                }
                if (!(c9t0Var instanceof c9t0.e)) {
                    if (c9t0Var instanceof c9t0.c) {
                        return n7t0.c.a;
                    }
                    if (c9t0Var instanceof c9t0.d) {
                        return n7t0.e.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                qtk0<u490> qtk0Var = ((c9t0.e) c9t0Var).e;
                if (!(qtk0Var instanceof qtk0.a)) {
                    if (qtk0Var instanceof qtk0.b) {
                        return n7t0.e.a;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                u490 u490Var = (u490) ((qtk0.a) qtk0Var).a;
                Image image = u490Var.l;
                Image image2 = u490Var.n;
                Integer G = f370.G(u490Var.k);
                boolean b = fkq0.b(u490Var.a.b);
                boolean z = b && u490Var.b.a;
                if (u490Var.o && image2 != null) {
                    return new n7t0.d(image2);
                }
                if (u490Var.m && image != null && (!b || !fxc0.B().J().x())) {
                    return new n7t0.d(image);
                }
                if (G != null) {
                    return new n7t0.b(G.intValue(), z && fxc0.B().J().x());
                }
                return new n7t0.a(z && fxc0.B().J().x());
            case 5:
                return new k.a(((tj50.a) obj).a(new wyn0(6), ao8.d));
            case 6:
                int i2 = VkFriendsPickerActivity.p;
                return s3q0.a;
            case 7:
                hh8 hh8Var = (hh8) obj;
                boolean z2 = hh8Var instanceof hh8.a;
                if (z2) {
                    hh8.a aVar = (hh8.a) hh8Var;
                    RecordType recordType = aVar.d;
                    CallMemberId callMemberId = aVar.c;
                    if (recordType == RecordType.RECORD) {
                        com.vk.voip.ui.c.b.getClass();
                        AccessibilityEvents F = com.vk.voip.ui.c.F();
                        List singletonList = Collections.singletonList(callMemberId);
                        F.getClass();
                        F.d(new sk(i, F, singletonList));
                    } else {
                        com.vk.voip.ui.c.b.getClass();
                        AccessibilityEvents F2 = com.vk.voip.ui.c.F();
                        List singletonList2 = Collections.singletonList(callMemberId);
                        F2.getClass();
                        F2.d(new com.vk.voip.a(2, F2, singletonList2));
                    }
                }
                if (z2) {
                    hh8.a aVar2 = (hh8.a) hh8Var;
                    nt80<qvw0> nt80Var = aVar2.h;
                    nt80Var.getClass();
                    if (nt80Var instanceof nt80.c) {
                        uj8Var = new uj8(aVar2.h.a(), aVar2.d == RecordType.RECORD);
                        return new it80(uj8Var);
                    }
                }
                uj8Var = null;
                return new it80(uj8Var);
            case 8:
                FriendsGetFieldsResponseDto friendsGetFieldsResponseDto = (FriendsGetFieldsResponseDto) obj;
                return new spw0.b.C3686b(friendsGetFieldsResponseDto.getCount(), kpw0.U(friendsGetFieldsResponseDto));
            case 9:
                ((ikv0) obj).a();
                return s3q0.a;
            default:
                return ((yqx0) obj).e;
        }
    }

    public /* synthetic */ yaq0(Object obj, int i) {
        this.b = i;
    }
}
