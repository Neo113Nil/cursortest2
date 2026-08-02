package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.log.L;
import com.vkontakte.android.R;

/* compiled from: PopupStickersAutoplaySettingComponent.kt */
/* loaded from: classes2.dex */
public final class dyb0 extends j8i {
    public final DialogExt i;

    public dyb0(DialogExt dialogExt) {
        this.i = dialogExt;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        return layoutInflater.inflate(R.layout.im_popup_stickers_autoplay_in_chat_setting_component, viewGroup, false);
    }

    @Override // xsna.j8i
    public final void Q0() {
        DialogExt dialogExt = this.i;
        if (dialogExt == null) {
            return;
        }
        long j = dialogExt.f.b;
        ChatSettings Bb = dialogExt.Bb();
        boolean z = Bb != null ? Bb.L : false;
        t6g0 t6g0Var = t6g0.b;
        I0(t6g0.d().I0().e(j).m(asu0.a.d()).subscribe(new ox80(new yxb0(this, j, t6g0.d().K0(), z), 4), new o3y(new pf8(L.a, 10), 14)));
    }
}
