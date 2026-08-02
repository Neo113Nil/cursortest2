package defpackage;

import android.view.View;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes13.dex */
public final class jm10 extends wys {
    public static final /* synthetic */ int W = 0;
    public static final /* synthetic */ int Z = 0;
    public final /* synthetic */ int R;
    public final ListItemComponent S;
    public final Object T;
    public final Object U;
    public Object V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm10(ListItemComponent listItemComponent, Object obj, Object obj2, int i) {
        super(listItemComponent);
        this.R = i;
        this.S = listItemComponent;
        this.T = obj;
        this.U = obj2;
    }

    @Override // defpackage.wys
    public boolean X() {
        switch (this.R) {
            case 1:
                return false;
            default:
                return super.X();
        }
    }

    @Override // defpackage.xwy0, defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        switch (this.R) {
            case 0:
                super.applyTheme(themeType);
                hm10 hm10Var = (hm10) this.V;
                if (hm10Var != null) {
                    c0(hm10Var.n(), hm10Var.m());
                    break;
                }
                break;
            default:
                super.applyTheme(themeType);
                dz4 dz4Var = (dz4) this.V;
                if (dz4Var != null) {
                    d0(dz4Var.a, dz4Var.d);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        int i = this.R;
        ListItemComponent listItemComponent = this.S;
        switch (i) {
            case 0:
                hm10 hm10Var = (hm10) obj;
                listItemComponent.setTitle(hm10Var.c);
                listItemComponent.setSubtitle(hm10Var.d);
                listItemComponent.setOnClickListener(null);
                listItemComponent.setTitleTextColor(hm10Var.n());
                listItemComponent.setSubtitleTextColor(hm10Var.n());
                listItemComponent.setBackgroundColor(hm10Var.h);
                listItemComponent.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(c.d(utg0.payment_methods_banner_corner_radius, this.a)));
                listItemComponent.setClipToOutline(true);
                listItemComponent.setTrailVisibility(hm10Var.e ? 0 : 8);
                listItemComponent.setTrailContainerClickListener(new p500(19, this, hm10Var));
                kdc n = hm10Var.n();
                listItemComponent.setTrailImage(tje.y(y2h0.ic_payment_close_notification, listItemComponent.getContext()));
                if (n != null) {
                    listItemComponent.setTrailColor(n);
                }
                ((pav) this.T).c(listItemComponent.getLeadImageView());
                String m = hm10Var.m();
                if (m == null || evu0.J(m)) {
                    kdc n2 = hm10Var.n();
                    listItemComponent.setLeadImage(c.l(y2h0.ic_payment_banner_info, listItemComponent));
                    if (n2 != null) {
                        listItemComponent.setLeadColor(n2);
                    }
                } else {
                    c0(hm10Var.n(), m);
                }
                this.V = hm10Var;
                break;
            default:
                dz4 dz4Var = (dz4) obj;
                listItemComponent.setTitle(dz4Var.b);
                listItemComponent.setSubtitle(dz4Var.c);
                d0(dz4Var.a, dz4Var.d);
                this.V = dz4Var;
                break;
        }
    }

    public void c0(kdc kdcVar, String str) {
        ListItemComponent listItemComponent = this.S;
        if (str == null) {
            listItemComponent.setLeadImage(c.l(y2h0.ic_payment_banner_info, listItemComponent));
            if (kdcVar != null) {
                listItemComponent.setLeadColor(kdcVar);
                return;
            }
            return;
        }
        nac nacVar = (nac) ((pav) this.T).a(listItemComponent.getLeadImageView());
        nacVar.h = new k200(20, this);
        nacVar.i = new g700(16, this, kdcVar);
        nacVar.c(str);
    }

    public void d0(final String str, boolean z) {
        ListItemComponent listItemComponent = this.S;
        if (z) {
            listItemComponent.setClickableTrailImage(dzg0.ic_trash);
            listItemComponent.getTrailImageView().setContentDescription(listItemComponent.getContext().getString(kyh0.common_remove));
            final int i = 0;
            listItemComponent.getTrailImageView().setOnClickListener(new View.OnClickListener(this) { // from class: fg11
                public final /* synthetic */ jm10 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    String str2 = str;
                    jm10 jm10Var = this.b;
                    switch (i2) {
                        case 0:
                            ((tls) jm10Var.T).invoke(str2);
                            break;
                        default:
                            ((tls) jm10Var.U).invoke(str2);
                            break;
                    }
                }
            });
            return;
        }
        listItemComponent.setClickableTrailImage(f1h0.ic_edit_20);
        listItemComponent.getTrailImageView().setContentDescription(listItemComponent.getContext().getString(kyh0.common_edit));
        final int i2 = 1;
        listItemComponent.getTrailImageView().setOnClickListener(new View.OnClickListener(this) { // from class: fg11
            public final /* synthetic */ jm10 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                String str2 = str;
                jm10 jm10Var = this.b;
                switch (i22) {
                    case 0:
                        ((tls) jm10Var.T).invoke(str2);
                        break;
                    default:
                        ((tls) jm10Var.U).invoke(str2);
                        break;
                }
            }
        });
    }
}
