package xsna;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.state.OwnerRightState;
import com.vk.dto.group.Group;
import java.util.Collection;
import java.util.List;

/* compiled from: MviViewExternalStateHelper.kt */
/* loaded from: classes17.dex */
public final class zn50 implements sfq {
    public final b25 a;

    public zn50(b25 b25Var) {
        this.a = b25Var;
    }

    @Override // xsna.sfq
    public final void a(Throwable th) {
        j03.l(th);
    }

    @Override // xsna.sfq
    public final OwnerRightState b(SdkClipVideoFile sdkClipVideoFile) {
        Group group;
        if (fkq0.b(sdkClipVideoFile.I0())) {
            t6g0 t6g0Var = t6g0.b;
            group = t6g0.b().C0(fkq0.a(sdkClipVideoFile.I0()));
        } else {
            group = null;
        }
        if (epx.f(this.a.c(), sdkClipVideoFile.I0())) {
            return OwnerRightState.CLIP_OWNER;
        }
        if (group != null && group.e()) {
            return OwnerRightState.GROUP_ADMIN_LEVEL_EDITOR;
        }
        if (group != null && group.i) {
            return OwnerRightState.GROUP_ADMIN;
        }
        List<SdkCoOwnerItem> P1 = sdkClipVideoFile.P1();
        if (!(P1 instanceof Collection) || !P1.isEmpty()) {
            for (SdkCoOwnerItem sdkCoOwnerItem : P1) {
                if (sdkCoOwnerItem.d() && sdkCoOwnerItem.d) {
                    return OwnerRightState.CLIP_COOWNER;
                }
            }
        }
        return OwnerRightState.NONE;
    }

    @Override // xsna.sfq
    public final boolean c() {
        com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
        return com.vk.libvideo.autoplay.e.b();
    }
}
