package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.iqx;
import ru.yandex.taxi.design.BadgeView;

/* loaded from: classes6.dex */
public final class arx {
    public final pdc a;

    public arx(pdc pdcVar) {
        this.a = pdcVar;
    }

    public final void a(BadgeView badgeView, iqx iqxVar, zqx zqxVar) {
        if ((iqxVar != null ? iqxVar.a : null) == null) {
            badgeView.setVisibility(8);
            return;
        }
        badgeView.setVisibility(0);
        CharSequence charSequence = iqxVar.a;
        iqx.b bVar = iqxVar.c;
        String str = bVar != null ? bVar.a : null;
        Resources resources = badgeView.getResources();
        int i = dzg0.more_vertical;
        ThreadLocal threadLocal = wuj0.a;
        Drawable drawable = resources.getDrawable(i, null);
        if (drawable != null) {
            charSequence = qeb1.g(charSequence, drawable, 2);
        }
        badgeView.setText(charSequence);
        badgeView.setTextSize(tje.b0(badgeView.getContext(), 11.0f));
        badgeView.setTextColor(s8o.m(((ufu) this.a).h(new cdc(ModalContentViewContainer.BASE_SHADOW_COLOR), str), badgeView.getContext()));
        int f = lhc.f(-1, 77);
        badgeView.setBackground((Drawable) new vbb(f, tje.r(mrg0.go_design_m_space, badgeView.getContext())).b);
        badgeView.setTintColor(f);
        badgeView.setPadding(tje.u(6, badgeView.getContext()), tje.u(3, badgeView.getContext()), tje.u(4, badgeView.getContext()), tje.u(3, badgeView.getContext()));
        badgeView.setOnClickListener(new vsn(21, zqxVar, iqxVar));
    }
}
