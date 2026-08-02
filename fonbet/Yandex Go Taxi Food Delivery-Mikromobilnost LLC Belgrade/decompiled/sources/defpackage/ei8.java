package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardlimit.CardLimitFragment;
import com.ybsdk.screens.notice.presentation.TopupNoticeContentDeprecatedView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ei8 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8j0 b;

    public /* synthetic */ ei8(u8j0 u8j0Var, int i) {
        this.a = i;
        this.b = u8j0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        j5x0 render$lambda$8$lambda$7;
        YbButtonView.a render$lambda$2$lambda$1;
        int i = this.a;
        u8j0 u8j0Var = this.b;
        switch (i) {
            case 0:
                render$lambda$8$lambda$7 = CardLimitFragment.render$lambda$8$lambda$7(u8j0Var, (j5x0) obj);
                return render$lambda$8$lambda$7;
            default:
                render$lambda$2$lambda$1 = TopupNoticeContentDeprecatedView.render$lambda$2$lambda$1(u8j0Var, (YbButtonView.a) obj);
                return render$lambda$2$lambda$1;
        }
    }
}
