package defpackage;

import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes5.dex */
public final class g760 extends lys {
    public static final /* synthetic */ int U = 0;
    public static final /* synthetic */ int V = 0;
    public final /* synthetic */ int S;
    public final sls T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g760(zo31 zo31Var, sls slsVar, int i) {
        super(zo31Var);
        this.S = i;
        this.T = slsVar;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.S) {
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.S;
        Object obj2 = this.R;
        switch (i) {
            case 0:
                bp80 bp80Var = (bp80) ((zo31) obj2);
                ListItemComponent listItemComponent = bp80Var.b;
                listItemComponent.setTitle(kyh0.organization_card_reload_title);
                listItemComponent.setSubtitle(kyh0.organization_card_error_subtitle);
                c.z(new d240(27, this), bp80Var.c);
                break;
            default:
                er70 er70Var = (er70) obj;
                SliderButtonView sliderButtonView = ((ly20) ((zo31) obj2)).a;
                sliderButtonView.setTitleIdle(er70Var.a);
                sliderButtonView.setSubtitleIdle(er70Var.b);
                j37 j37Var = er70Var.c;
                sliderButtonView.setTrackBackgroundColor(s8o.m(j37Var.a, sliderButtonView.getContext()));
                sliderButtonView.setTextColor(j37Var.b);
                sliderButtonView.setSlideFinishedListener(new ykn0(16, this));
                break;
        }
    }
}
