package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.gift.CatalogedGift;
import com.vk.libvideo.live.api.view.WriteContract$State;
import java.util.List;

/* compiled from: WriteContract.java */
/* loaded from: classes3.dex */
public interface f2y0 extends rr6<e2y0> {
    void F2();

    void P0();

    void Z2();

    boolean a0();

    void d0();

    void g1();

    void k();

    void k0(String str);

    void o2(UserId userId, CharSequence charSequence);

    void setMarketItemsBadge(int i);

    void setMaskButtonState(boolean z);

    void setOpenStickersMarketWithoutNavigation(boolean z);

    void setRedDot(boolean z);

    void setState(WriteContract$State writeContract$State);

    void u2(CatalogedGift catalogedGift, int i, String str, List list);
}
