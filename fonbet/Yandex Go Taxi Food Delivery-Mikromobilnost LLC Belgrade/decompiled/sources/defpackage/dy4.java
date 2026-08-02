package defpackage;

import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public abstract class dy4 extends lys {
    public final /* synthetic */ int S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dy4(zo31 zo31Var, int i) {
        super(zo31Var);
        this.S = i;
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        switch (this.S) {
            case 1:
                xvy0.b(((zo31) this.R).getRoot(), themeType, true, new qa0(2, this));
                break;
            default:
                super.applyTheme(themeType);
                break;
        }
    }

    @Override // defpackage.wys
    public void c(Object obj) {
        dru druVar = (dru) obj;
        gru gruVar = (gru) ((zo31) this.R);
        gruVar.c.setText(druVar.b);
        gruVar.b.setImageDrawable(druVar.d);
    }
}
