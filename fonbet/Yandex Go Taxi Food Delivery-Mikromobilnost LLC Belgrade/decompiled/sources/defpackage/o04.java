package defpackage;

import android.net.Uri;
import android.widget.EditText;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class o04 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AutoTopupSetupV2Fragment b;

    public /* synthetic */ o04(AutoTopupSetupV2Fragment autoTopupSetupV2Fragment, int i) {
        this.a = i;
        this.b = autoTopupSetupV2Fragment;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$16;
        zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$17;
        zy11 openAutoTopupEdit$lambda$20$lambda$19$lambda$18;
        boolean onViewCreated$lambda$4$lambda$0;
        boolean onViewCreated$lambda$4$lambda$1;
        boolean onViewCreated$lambda$4$lambda$2;
        zy11 renderBottomSheet$lambda$13$lambda$10;
        zy11 openAutoFundEdit$lambda$24$lambda$23$lambda$21;
        zy11 openAutoFundEdit$lambda$24$lambda$23$lambda$22;
        int i = this.a;
        AutoTopupSetupV2Fragment autoTopupSetupV2Fragment = this.b;
        switch (i) {
            case 0:
                openAutoTopupEdit$lambda$20$lambda$19$lambda$16 = AutoTopupSetupV2Fragment.openAutoTopupEdit$lambda$20$lambda$19$lambda$16(autoTopupSetupV2Fragment, (EditText) obj);
                return openAutoTopupEdit$lambda$20$lambda$19$lambda$16;
            case 1:
                openAutoTopupEdit$lambda$20$lambda$19$lambda$17 = AutoTopupSetupV2Fragment.openAutoTopupEdit$lambda$20$lambda$19$lambda$17(autoTopupSetupV2Fragment, (String) obj);
                return openAutoTopupEdit$lambda$20$lambda$19$lambda$17;
            case 2:
                openAutoTopupEdit$lambda$20$lambda$19$lambda$18 = AutoTopupSetupV2Fragment.openAutoTopupEdit$lambda$20$lambda$19$lambda$18(autoTopupSetupV2Fragment, (String) obj);
                return openAutoTopupEdit$lambda$20$lambda$19$lambda$18;
            case 3:
                onViewCreated$lambda$4$lambda$0 = AutoTopupSetupV2Fragment.onViewCreated$lambda$4$lambda$0(autoTopupSetupV2Fragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$4$lambda$0);
            case 4:
                onViewCreated$lambda$4$lambda$1 = AutoTopupSetupV2Fragment.onViewCreated$lambda$4$lambda$1(autoTopupSetupV2Fragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$4$lambda$1);
            case 5:
                onViewCreated$lambda$4$lambda$2 = AutoTopupSetupV2Fragment.onViewCreated$lambda$4$lambda$2(autoTopupSetupV2Fragment, (Uri) obj);
                return Boolean.valueOf(onViewCreated$lambda$4$lambda$2);
            case 6:
                renderBottomSheet$lambda$13$lambda$10 = AutoTopupSetupV2Fragment.renderBottomSheet$lambda$13$lambda$10(autoTopupSetupV2Fragment, ((Boolean) obj).booleanValue());
                return renderBottomSheet$lambda$13$lambda$10;
            case 7:
                openAutoFundEdit$lambda$24$lambda$23$lambda$21 = AutoTopupSetupV2Fragment.openAutoFundEdit$lambda$24$lambda$23$lambda$21(autoTopupSetupV2Fragment, (EditText) obj);
                return openAutoFundEdit$lambda$24$lambda$23$lambda$21;
            default:
                openAutoFundEdit$lambda$24$lambda$23$lambda$22 = AutoTopupSetupV2Fragment.openAutoFundEdit$lambda$24$lambda$23$lambda$22(autoTopupSetupV2Fragment, (String) obj);
                return openAutoFundEdit$lambda$24$lambda$23$lambda$22;
        }
    }
}
