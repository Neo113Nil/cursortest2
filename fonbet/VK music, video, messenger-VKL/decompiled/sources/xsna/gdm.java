package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.sharing.api.dto.Target;

/* compiled from: DialogEntriesImEngineMapper.kt */
/* loaded from: classes5.dex */
public final class gdm implements hdm {
    @Override // xsna.hdm
    public final Target a(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        return new Target(dialog, profilesSimpleInfo, c4g0.t(dialog.hc()));
    }
}
