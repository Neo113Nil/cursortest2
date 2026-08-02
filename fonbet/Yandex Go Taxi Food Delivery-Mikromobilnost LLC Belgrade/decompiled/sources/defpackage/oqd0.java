package defpackage;

import java.util.function.Consumer;
import ru.yandex.taxi.cashback.g;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes5.dex */
public final class oqd0 {
    public final g a;
    public final lg21 b;
    public final yvf0 c;

    public oqd0(g gVar, lg21 lg21Var, yvf0 yvf0Var) {
        this.a = gVar;
        this.b = lg21Var;
        this.c = yvf0Var;
    }

    public final void a() {
        pzt0 pzt0Var = this.a.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    public final void b(final String str, boolean z, boolean z2) {
        g gVar = this.a;
        if (z2) {
            if (!z) {
                c(str);
                return;
            }
            final int i = 0;
            final int i2 = 0;
            gVar.b(str, new Consumer(this) { // from class: mqd0
                public final /* synthetic */ oqd0 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i) {
                        case 0:
                            this.b.c((String) obj);
                            break;
                        default:
                            ((mg21) this.b.b).c((String) obj);
                            break;
                    }
                }
            }, new Consumer(this) { // from class: nqd0
                public final /* synthetic */ oqd0 b;

                {
                    this.b = this;
                }

                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i2) {
                        case 0:
                            this.b.c(str);
                            break;
                        default:
                            ((mg21) this.b.b).c(str);
                            break;
                    }
                }
            });
            return;
        }
        if (!z) {
            ((mg21) this.b).c(str);
            return;
        }
        final int i3 = 1;
        final int i4 = 1;
        gVar.b(str, new Consumer(this) { // from class: mqd0
            public final /* synthetic */ oqd0 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        this.b.c((String) obj);
                        break;
                    default:
                        ((mg21) this.b.b).c((String) obj);
                        break;
                }
            }
        }, new Consumer(this) { // from class: nqd0
            public final /* synthetic */ oqd0 b;

            {
                this.b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        this.b.c(str);
                        break;
                    default:
                        ((mg21) this.b.b).c(str);
                        break;
                }
            }
        });
    }

    public final void c(String str) {
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = str;
        aVar.h = true;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setShouldShowCloseButton(true);
        ((ft41) ((dt41) this.c.get())).Q(uiWebViewConfig);
    }
}
