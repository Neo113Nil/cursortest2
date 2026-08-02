package defpackage;

import com.yandex.go.taxi.order.custom_tips_input.mvp.CustomTipsInputModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class bmf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CustomTipsInputModalView b;
    public final /* synthetic */ tzx c;

    public /* synthetic */ bmf(CustomTipsInputModalView customTipsInputModalView, tzx tzxVar, int i) {
        this.a = i;
        this.b = customTipsInputModalView;
        this.c = tzxVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 clearInputField$lambda$0$2;
        zy11 zy11Var;
        int i = this.a;
        tzx tzxVar = this.c;
        CustomTipsInputModalView customTipsInputModalView = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                clearInputField$lambda$0$2 = CustomTipsInputModalView.clearInputField$lambda$0$2(customTipsInputModalView, tzxVar, str);
                return clearInputField$lambda$0$2;
            default:
                zy11Var = CustomTipsInputModalView.setupInputField$lambda$0$1(customTipsInputModalView, tzxVar, str);
                return zy11Var;
        }
    }
}
