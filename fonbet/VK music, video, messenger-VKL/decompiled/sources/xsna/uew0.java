package xsna;

import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.dto.common.im.ImageList;
import xsna.cq5;

/* compiled from: VoipAvatarViewDelegate.kt */
/* loaded from: classes7.dex */
public interface uew0 extends ts5 {
    static /* synthetic */ void D(uew0 uew0Var, ImageList imageList, AvatarBorderType avatarBorderType, com.vk.im.ui.views.avatars.a aVar, int i) {
        cq5.b bVar = cq5.b.a;
        if ((i & 8) != 0) {
            aVar = null;
        }
        uew0Var.o(imageList, avatarBorderType, bVar, aVar);
    }

    void O(sew0 sew0Var);

    void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var);

    void c(kr5 kr5Var);

    o9r0 getBorderParams();

    int getRoundAvatarSize();

    void o(ImageList imageList, AvatarBorderType avatarBorderType, cq5 cq5Var, Drawable drawable);

    void setBorderParams(o9r0 o9r0Var);

    void setRoundAvatarSize(int i);

    void setupOverlay(Drawable drawable);
}
