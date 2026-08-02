package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface wp10 {
    Attach a();

    AdapterEntryType l();

    default boolean m() {
        return l().h() >= 48;
    }

    @CheckResult
    default wp10 R0(Boolean bool) {
        return this;
    }

    @CheckResult
    default wp10 d0(ProfilesInfo profilesInfo) {
        return this;
    }

    @CheckResult
    default wp10 n(oh30 oh30Var) {
        return this;
    }

    @CheckResult
    default wp10 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @CheckResult
    default wp10 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
