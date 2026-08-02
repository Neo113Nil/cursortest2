package xsna;

import android.view.View;
import com.vk.avatar.api.VKAvatarView;
import com.vk.avatar.api.border.AvatarBorderType;

/* compiled from: LikesAvatarView.kt */
/* loaded from: classes4.dex */
public final class s6z extends VKAvatarView implements t6z {
    @Override // xsna.t6z
    public final void a(String str, AvatarBorderType avatarBorderType, cq5 cq5Var) {
        VKAvatarView.c1(this, avatarBorderType, cq5Var, 4);
        load(str);
    }

    @Override // xsna.t6z
    public o9r0 getBorderParams() {
        return getAvatarBorderConfigParamsOverride();
    }

    @Override // xsna.t6z
    public void setBorderParams(o9r0 o9r0Var) {
        if (o9r0Var != null) {
            setAvatarBorderConfigParamsOverride(o9r0Var);
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
