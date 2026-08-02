package xsna;

import android.view.View;
import android.widget.ImageView;
import com.vk.avatar.api.VKAvatarView;

/* compiled from: ClipsAvatarView.kt */
/* loaded from: classes5.dex */
public final class kjd extends VKAvatarView implements ljd {
    @Override // xsna.ljd
    public o9r0 getBorderParams() {
        return getAvatarBorderConfigParamsOverride();
    }

    @Override // xsna.ljd
    public int getRoundAvatarSize() {
        return 0;
    }

    @Override // xsna.ljd
    public void setBorderParams(o9r0 o9r0Var) {
        if (o9r0Var != null) {
            setAvatarBorderConfigParamsOverride(o9r0Var);
        }
    }

    @Override // xsna.ljd
    public ImageView getImageView() {
        return this;
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }

    @Override // xsna.ljd
    public void setRoundAvatarSize(int i) {
    }
}
