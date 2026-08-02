package defpackage;

import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class ez41 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ WhereYouAreModalView b;

    public /* synthetic */ ez41(WhereYouAreModalView whereYouAreModalView, int i) {
        this.a = i;
        this.b = whereYouAreModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 openSourcePicker$lambda$2;
        zy11 _init_$lambda$0;
        int i = this.a;
        WhereYouAreModalView whereYouAreModalView = this.b;
        switch (i) {
            case 0:
                openSourcePicker$lambda$2 = WhereYouAreModalView.openSourcePicker$lambda$2(whereYouAreModalView, (pv0) obj);
                return openSourcePicker$lambda$2;
            default:
                _init_$lambda$0 = WhereYouAreModalView._init_$lambda$0(whereYouAreModalView, (zzs) obj);
                return _init_$lambda$0;
        }
    }
}
