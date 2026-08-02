package defpackage;

import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;

/* loaded from: classes8.dex */
public final /* synthetic */ class lks implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ FullscreenSuperappSuggestModalView b;

    public /* synthetic */ lks(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, int i) {
        this.a = i;
        this.b = fullscreenSuperappSuggestModalView;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 zy11Var;
        int i = this.a;
        FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = this.b;
        switch (i) {
            case 0:
                insetsType$lambda$0 = FullscreenSuperappSuggestModalView.insetsType$lambda$0(fullscreenSuperappSuggestModalView, (t1w) obj);
                return insetsType$lambda$0;
            default:
                zy11Var = FullscreenSuperappSuggestModalView.setupFloatingFieldAnimatedInsets$lambda$0(fullscreenSuperappSuggestModalView, (n751) obj);
                return zy11Var;
        }
    }
}
