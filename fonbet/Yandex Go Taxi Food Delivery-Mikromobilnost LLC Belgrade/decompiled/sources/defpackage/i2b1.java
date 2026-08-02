package defpackage;

import android.view.View;
import androidx.compose.ui.viewinterop.b;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.ybsdk.core.stories.dto.FullScreenDto;
import com.ybsdk.feature.autotopup.internal.domain.entities.ConfirmInstructionEntity;
import com.ybsdk.feature.autotopup.internal.network.dto.BindingPaymentConfirmInstructionDto;
import com.ybsdk.feature.autotopup.internal.network.dto.BindingPaymentInstructionsDto;
import ru.yandex.taxi.widget.SlideableBindingModalView;

/* loaded from: classes14.dex */
public abstract class i2b1 {
    public static final void a(f530 f530Var, int i, kxu kxuVar, fid fidVar, int i2) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1915876829);
        int i3 = i2 | 6 | (btsVar2.c(i) ? 32 : 16) | (btsVar2.k(kxuVar) ? 256 : 128);
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            int d = y6i0.d(i, 0, 100);
            long n = tje.n(AppColor$Palette.Text, btsVar2);
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.q(c530Var, 42.0f), 20.0f);
            int i4 = i3 & 896;
            boolean c = (i4 == 256) | btsVar2.c(d);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (c || Q == o430Var) {
                Q = new lxu(kxuVar, d, 0);
                btsVar2.o0(Q);
            }
            tls tlsVar = (tls) Q;
            boolean c2 = btsVar2.c(d) | (i4 == 256) | btsVar2.d(n);
            Object Q2 = btsVar2.Q();
            if (c2 || Q2 == o430Var) {
                mxu mxuVar = new mxu(kxuVar, d, n, 0);
                btsVar2.o0(mxuVar);
                Q2 = mxuVar;
            }
            tls tlsVar2 = (tls) Q2;
            btsVar = btsVar2;
            b.a(tlsVar, e, tlsVar2, btsVar, 0, 0);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(i, i2, 0, f530Var2, kxuVar);
        }
    }

    public static w130 b(SlideableBindingModalView slideableBindingModalView, View view, View view2) {
        return new w130(1, new zdk0(slideableBindingModalView, view, view2, new vkn0(15)));
    }

    public static final oz3 c(BindingPaymentInstructionsDto bindingPaymentInstructionsDto) {
        vou0 vou0Var;
        FullScreenDto introductionScreen = bindingPaymentInstructionsDto.getIntroductionScreen();
        if (introductionScreen != null) {
            String id = introductionScreen.getId();
            if (id == null) {
                id = "unknown_story_id";
            }
            vou0Var = com.ybsdk.core.stories.b.d(introductionScreen, id, 0);
        } else {
            vou0Var = null;
        }
        BindingPaymentConfirmInstructionDto confirmInstruction = bindingPaymentInstructionsDto.getConfirmInstruction();
        return new oz3(vou0Var, new ConfirmInstructionEntity(confirmInstruction.getTitle(), confirmInstruction.getDescription()));
    }
}
