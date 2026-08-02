package defpackage;

import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes10.dex */
public final /* synthetic */ class gtg implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ gtg(int i, Runnable runnable) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 _init_$lambda$0;
        zy11 animateShow$lambda$0$0;
        zy11 animateShow$lambda$0$1;
        zy11 animateDismiss$lambda$0$0;
        zy11 animateDismiss$lambda$0$1;
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                _init_$lambda$0 = DebounceClickListener._init_$lambda$0(runnable);
                return _init_$lambda$0;
            case 1:
                animateShow$lambda$0$0 = ModalView.animateShow$lambda$0$0(runnable);
                return animateShow$lambda$0$0;
            case 2:
                animateShow$lambda$0$1 = ModalView.animateShow$lambda$0$1(runnable);
                return animateShow$lambda$0$1;
            case 3:
                animateDismiss$lambda$0$0 = ModalView.animateDismiss$lambda$0$0(runnable);
                return animateDismiss$lambda$0$0;
            case 4:
                animateDismiss$lambda$0$1 = ModalView.animateDismiss$lambda$0$1(runnable);
                return animateDismiss$lambda$0$1;
            default:
                runnable.run();
                return zy11.a;
        }
    }
}
