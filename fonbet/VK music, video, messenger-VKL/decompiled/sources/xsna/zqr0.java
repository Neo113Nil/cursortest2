package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: VhDialogBase.kt */
/* loaded from: classes2.dex */
public class zqr0<V extends View> extends RecyclerView.e0 implements jsx0 {
    public final V l;
    public Dialog m;
    public ProfilesSimpleInfo n;

    public zqr0(V v) {
        super(v);
        this.l = v;
    }

    public boolean H4() {
        return true;
    }

    public final DialogExt V5() {
        Dialog dialog = this.m;
        if (dialog == null) {
            dialog = null;
        }
        ProfilesSimpleInfo profilesSimpleInfo = this.n;
        return new DialogExt(dialog, new ProfilesInfo(profilesSimpleInfo != null ? profilesSimpleInfo : null));
    }
}
