package defpackage;

import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.SlideableModalView;

/* loaded from: classes8.dex */
public abstract class m230 extends h55 {
    public u45 D;

    public m230() {
        super(null);
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        u45 S = S(obj);
        R(S);
        final csz cszVar = new csz(7, this);
        final int i = 0;
        S.setOnTouchOutsideListener(new Runnable() { // from class: k230
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                csz cszVar2 = cszVar;
                switch (i2) {
                    case 0:
                        cszVar2.invoke();
                        break;
                    case 1:
                        cszVar2.invoke();
                        break;
                    case 2:
                        cszVar2.invoke();
                        break;
                    case 3:
                        cszVar2.invoke();
                        break;
                    default:
                        cszVar2.invoke();
                        break;
                }
            }
        });
        if (S instanceof SlideableModalView) {
            SlideableModalView slideableModalView = (SlideableModalView) S;
            final int i2 = 1;
            slideableModalView.setOnArrowClickListener(new Runnable() { // from class: k230
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    csz cszVar2 = cszVar;
                    switch (i22) {
                        case 0:
                            cszVar2.invoke();
                            break;
                        case 1:
                            cszVar2.invoke();
                            break;
                        case 2:
                            cszVar2.invoke();
                            break;
                        case 3:
                            cszVar2.invoke();
                            break;
                        default:
                            cszVar2.invoke();
                            break;
                    }
                }
            });
            final int i3 = 2;
            slideableModalView.setOnSlideOutListener(new Runnable() { // from class: k230
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i3;
                    csz cszVar2 = cszVar;
                    switch (i22) {
                        case 0:
                            cszVar2.invoke();
                            break;
                        case 1:
                            cszVar2.invoke();
                            break;
                        case 2:
                            cszVar2.invoke();
                            break;
                        case 3:
                            cszVar2.invoke();
                            break;
                        default:
                            cszVar2.invoke();
                            break;
                    }
                }
            });
            final int i4 = 3;
            slideableModalView.setOnBackPressedListener(new Runnable() { // from class: k230
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i4;
                    csz cszVar2 = cszVar;
                    switch (i22) {
                        case 0:
                            cszVar2.invoke();
                            break;
                        case 1:
                            cszVar2.invoke();
                            break;
                        case 2:
                            cszVar2.invoke();
                            break;
                        case 3:
                            cszVar2.invoke();
                            break;
                        default:
                            cszVar2.invoke();
                            break;
                    }
                }
            });
        } else if (S instanceof ModalView) {
            final int i5 = 4;
            ((ModalView) S).setOnBackPressedListener(new Runnable() { // from class: k230
                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i5;
                    csz cszVar2 = cszVar;
                    switch (i22) {
                        case 0:
                            cszVar2.invoke();
                            break;
                        case 1:
                            cszVar2.invoke();
                            break;
                        case 2:
                            cszVar2.invoke();
                            break;
                        case 3:
                            cszVar2.invoke();
                            break;
                        default:
                            cszVar2.invoke();
                            break;
                    }
                }
            });
        }
        this.D = S;
        P().s(S, Q());
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        u45 u45Var = this.D;
        if (u45Var != null) {
            this.D = null;
            P().l(u45Var);
        }
    }

    public abstract w030 P();

    public abstract boolean Q();

    public void R(u45 u45Var) {
    }

    public abstract u45 S(Object obj);
}
