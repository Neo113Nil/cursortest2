package xsna;

import androidx.annotation.Nullable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickerItem;
import com.vk.libvideo.live.api.view.WriteContract$State;
import java.util.ArrayList;

/* compiled from: WriteContract.java */
/* loaded from: classes3.dex */
public interface e2y0 extends pk6 {
    void A(int i, String str);

    void A1();

    void B();

    void D0(String str);

    boolean T();

    void Z0();

    @Nullable
    UserId c0();

    WriteContract$State getState();

    String getTitle();

    void i1(StickerItem stickerItem);

    boolean isStreaming();

    boolean l2();

    void o2();

    void p1(ArrayList arrayList);

    void r();

    void w0();
}
