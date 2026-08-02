package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.yandex.div.core.view2.Div2View;
import com.yandex.messaging.telemost.domain.entities.PersonalMeetingResolution;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import defpackage.nka1;
import defpackage.pj91;
import defpackage.tje;

/* loaded from: classes11.dex */
public abstract class hi91 {
    public static final void a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }

    public static final Double b(xll xllVar, rvo rvoVar) {
        if (xllVar instanceof tll) {
            return Double.valueOf(((Number) ((tll) xllVar).b.a.a(rvoVar)).longValue());
        }
        if (xllVar instanceof ull) {
            return (Double) ((ull) xllVar).b.a.a(rvoVar);
        }
        return null;
    }

    public static final f530 c(f530 f530Var, boolean z, zx40 zx40Var) {
        return f530Var.k(z ? new svr(zx40Var) : c530.a);
    }

    public static /* synthetic */ f530 d(f530 f530Var, boolean z, zx40 zx40Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            zx40Var = null;
        }
        return c(f530Var, z, zx40Var);
    }

    public static final PersonalMeetingResolution e(TechPersonalMeetingEndedMessage techPersonalMeetingEndedMessage) {
        int i = techPersonalMeetingEndedMessage.reason;
        if (i == 0) {
            return PersonalMeetingResolution.Declined;
        }
        if (i == 1) {
            return PersonalMeetingResolution.CanceledByCaller;
        }
        if (i != 2) {
            if (i == 3) {
                return PersonalMeetingResolution.Missed;
            }
            if (i != 4 && i != 5) {
                return PersonalMeetingResolution.Unknown;
            }
        }
        return PersonalMeetingResolution.Success;
    }

    public static final void f(Div2View div2View, Throwable th) {
        div2View.getViewComponent().a().a(div2View.get_divData(), div2View.getDataTag()).f(th);
    }

    public static final void g(final tls tlsVar, final View view) {
        view.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.dsl.views.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                tje.N(nka1.c(pj91.f(view)), null, null, new ViewHelpersKt$onClick$1$1(tlsVar, null), 3);
            }
        });
    }

    public static final void h(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void i(int i, int i2, int i3, int i4, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) == i) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if ((marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) == i2) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if ((marginLayoutParams3 != null ? marginLayoutParams3.bottomMargin : 0) == i4) {
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if ((marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0) == i3) {
                        return;
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? layoutParams5 : null);
        if (marginLayoutParams5 != null) {
            marginLayoutParams5.topMargin = i2;
            marginLayoutParams5.bottomMargin = i4;
            marginLayoutParams5.leftMargin = i;
            marginLayoutParams5.rightMargin = i3;
            view.setLayoutParams(marginLayoutParams5);
        }
    }
}
