package defpackage;

import android.view.View;
import ru.yandex.taxi.sdc.presentation.AcceptEulaDialogV2;

/* loaded from: classes6.dex */
public final /* synthetic */ class jc implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ AcceptEulaDialogV2 b;

    public /* synthetic */ jc(AcceptEulaDialogV2 acceptEulaDialogV2, int i) {
        this.a = i;
        this.b = acceptEulaDialogV2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$3;
        View content;
        int i = this.a;
        AcceptEulaDialogV2 acceptEulaDialogV2 = this.b;
        switch (i) {
            case 0:
                _init_$lambda$3 = AcceptEulaDialogV2._init_$lambda$3(acceptEulaDialogV2);
                return _init_$lambda$3;
            default:
                content = acceptEulaDialogV2.getContent();
                return content;
        }
    }
}
