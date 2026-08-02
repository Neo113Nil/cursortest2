package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.a;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class nzh implements oic {
    public final Context a;
    public final exu0 b;
    public final i3y c;
    public final i3y d;
    public final i3y e;
    public final i3y f;

    public nzh(Context context, exu0 exu0Var) {
        this.a = context;
        this.b = exu0Var;
        final int i = 0;
        this.c = a.a(new sls(this) { // from class: mzh
            public final /* synthetic */ nzh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                nzh nzhVar = this.b;
                switch (i2) {
                    case 0:
                        return nzhVar.e(ThemeType.LIGHT, "");
                    case 1:
                        return nzhVar.e(ThemeType.DARK, "");
                    case 2:
                        return nzhVar.e(ThemeType.LIGHT, "ultima");
                    default:
                        return nzhVar.e(ThemeType.DARK, "ultima");
                }
            }
        });
        final int i2 = 1;
        this.d = a.a(new sls(this) { // from class: mzh
            public final /* synthetic */ nzh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                nzh nzhVar = this.b;
                switch (i22) {
                    case 0:
                        return nzhVar.e(ThemeType.LIGHT, "");
                    case 1:
                        return nzhVar.e(ThemeType.DARK, "");
                    case 2:
                        return nzhVar.e(ThemeType.LIGHT, "ultima");
                    default:
                        return nzhVar.e(ThemeType.DARK, "ultima");
                }
            }
        });
        final int i3 = 2;
        this.e = a.a(new sls(this) { // from class: mzh
            public final /* synthetic */ nzh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                nzh nzhVar = this.b;
                switch (i22) {
                    case 0:
                        return nzhVar.e(ThemeType.LIGHT, "");
                    case 1:
                        return nzhVar.e(ThemeType.DARK, "");
                    case 2:
                        return nzhVar.e(ThemeType.LIGHT, "ultima");
                    default:
                        return nzhVar.e(ThemeType.DARK, "ultima");
                }
            }
        });
        final int i4 = 3;
        this.f = a.a(new sls(this) { // from class: mzh
            public final /* synthetic */ nzh b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                nzh nzhVar = this.b;
                switch (i22) {
                    case 0:
                        return nzhVar.e(ThemeType.LIGHT, "");
                    case 1:
                        return nzhVar.e(ThemeType.DARK, "");
                    case 2:
                        return nzhVar.e(ThemeType.LIGHT, "ultima");
                    default:
                        return nzhVar.e(ThemeType.DARK, "ultima");
                }
            }
        });
    }

    @Override // defpackage.oic
    public final fl51 a() {
        return (fl51) this.f.getValue();
    }

    @Override // defpackage.oic
    public final fl51 b() {
        return (fl51) this.c.getValue();
    }

    @Override // defpackage.oic
    public final fl51 c() {
        return (fl51) this.d.getValue();
    }

    @Override // defpackage.oic
    public final fl51 d() {
        return (fl51) this.e.getValue();
    }

    public final fl51 e(ThemeType themeType, String str) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, ((nrt) this.b).b(themeType, str).b);
        return new fl51(qje.u(contextThemeWrapper.getTheme(), xng0.bgMain), qje.u(contextThemeWrapper.getTheme(), xng0.bgMinor), qje.u(contextThemeWrapper.getTheme(), xng0.bgInvert), qje.u(contextThemeWrapper.getTheme(), xng0.bgFloating), qje.u(contextThemeWrapper.getTheme(), xng0.controlMain), qje.u(contextThemeWrapper.getTheme(), xng0.controlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.textMain), qje.u(contextThemeWrapper.getTheme(), xng0.textMinor), qje.u(contextThemeWrapper.getTheme(), xng0.textInvert), qje.u(contextThemeWrapper.getTheme(), xng0.textOnControl), qje.u(contextThemeWrapper.getTheme(), xng0.textOnControlMinor), qje.u(contextThemeWrapper.getTheme(), xng0.textMain), qje.u(contextThemeWrapper.getTheme(), xng0.iconMinor), qje.u(contextThemeWrapper.getTheme(), xng0.line), qje.u(contextThemeWrapper.getTheme(), xng0.pin), qje.u(contextThemeWrapper.getTheme(), xng0.controlPressed), qje.u(contextThemeWrapper.getTheme(), xng0.fogDark), qje.u(contextThemeWrapper.getTheme(), xng0.everBack), qje.u(contextThemeWrapper.getTheme(), xng0.everFront), qje.u(contextThemeWrapper.getTheme(), xng0.cardDivider), qje.u(contextThemeWrapper.getTheme(), xng0.error));
    }
}
