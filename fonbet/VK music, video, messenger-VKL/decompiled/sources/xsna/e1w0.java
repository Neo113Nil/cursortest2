package xsna;

import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.voip.ui.VoipHintsLauncher;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VkVoipHintsLauncher.kt */
/* loaded from: classes7.dex */
public final class e1w0 implements VoipHintsLauncher {

    /* compiled from: VkVoipHintsLauncher.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoipHintsLauncher.Hint.values().length];
            try {
                iArr[VoipHintsLauncher.Hint.ADD_FRIENDS_TO_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VoipHintsLauncher.Hint.INVITE_BY_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VoipHintsLauncher.Hint.MEMBERS_ACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VoipHintsLauncher.Hint.VOIP_CAROUSEL_ACTIONS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.voip.ui.VoipHintsLauncher
    public final void a(View view, VoipHintsLauncher.Hint hint, hh1 hh1Var) {
        String id;
        int i = a.$EnumSwitchMapping$0[hint.ordinal()];
        if (i == 1) {
            id = HintId.VOIP_ADD_FRIENDS_TO_CALL.getId();
        } else if (i == 2) {
            id = HintId.VOIP_INVITE_BY_LINK.getId();
        } else if (i == 3) {
            id = HintId.VOIP_MEMBERS_ACTIONS.getId();
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            id = HintId.VOIP_CAROUSEL_ACTIONS.getId();
        }
        pla.e().b().l(view, id, hh1Var);
    }
}
