package xsna;

import androidx.annotation.CheckResult;
import com.vk.dto.attaches.Attach;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;

/* compiled from: ChatListPartInterfaces.kt */
/* loaded from: classes2.dex */
public interface ir30 {
    Attach a();

    AdapterEntryType l();

    default boolean m() {
        return l().h() >= 48;
    }

    @CheckResult
    default ir30 n(oh30 oh30Var) {
        return this;
    }

    @CheckResult
    default ir30 u(boolean z) {
        return this;
    }

    @CheckResult
    default ir30 d0(Boolean bool, Boolean bool2) {
        return this;
    }

    @CheckResult
    default ir30 s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        return this;
    }

    @CheckResult
    default ir30 b(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }

    @CheckResult
    default ir30 d(uk30 uk30Var, nsr0 nsr0Var, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2) {
        return this;
    }
}
