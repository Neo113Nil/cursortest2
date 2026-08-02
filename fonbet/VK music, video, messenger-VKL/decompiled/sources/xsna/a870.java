package xsna;

import android.graphics.drawable.Drawable;
import com.vk.avatar.api.border.AvatarBorderType;

/* compiled from: NotificationAvatarViewDelegate.kt */
/* loaded from: classes4.dex */
public interface a870 extends ts5 {
    void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var);

    void clear();

    void f(mk6 mk6Var, boolean z);

    o9r0 getBorderParams();

    int getRoundAvatarSize();

    void setBorderParams(o9r0 o9r0Var);

    void setOverlay(Drawable drawable);

    void setPlaceholder(Drawable drawable);

    void setRoundAvatarSize(int i);
}
