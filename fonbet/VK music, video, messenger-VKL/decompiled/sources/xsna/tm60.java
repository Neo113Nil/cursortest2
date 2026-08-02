package xsna;

import com.vk.api.generated.base.dto.BaseOwnerButtonActionDto;
import com.vk.dto.common.actions.Action;
import com.vk.dto.common.actions.ActionEmpty;
import xsna.qz2;

/* compiled from: NewsfeedItemDigestDtoToDigestMapper.kt */
/* loaded from: classes4.dex */
public final class tm60 {
    public final bpn0 a;

    public tm60(bpn0 bpn0Var, sv1 sv1Var, mn60 mn60Var) {
        this.a = bpn0Var;
    }

    public static Action a(BaseOwnerButtonActionDto baseOwnerButtonActionDto) {
        switch (qz2.a.$EnumSwitchMapping$0[baseOwnerButtonActionDto.e().ordinal()]) {
        }
        return new ActionEmpty();
    }
}
