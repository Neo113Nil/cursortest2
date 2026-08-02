package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.List;
import xsna.xoy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class bly0 extends LinearLayout implements t5z0, View.OnClickListener {
    public final cry0 b;
    public final xoy0 c;
    public final pbz0 d;
    public boolean e;
    public z9z0 f;
    public final s8z0 g;
    public rvy0 h;

    public bly0(pbz0 pbz0Var, xoy0.b bVar, Context context) {
        super(context);
        this.e = false;
        this.f = new y9z0();
        this.g = new s8z0(new ugm0(this, 9));
        this.d = pbz0Var;
        this.h = new rvy0(context);
        setOrientation(1);
        cry0 cry0Var = new cry0(context);
        this.b = cry0Var;
        cry0Var.getButtonsView().getAdChoicesButton().setOnClickListener(this);
        cry0Var.getButtonsView().getCloseButton().setOnClickListener(this);
        addView(cry0Var);
        xoy0 xoy0Var = new xoy0(context, bVar);
        this.c = xoy0Var;
        rvy0 rvy0Var = this.h;
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        e();
        addView(xoy0Var);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickAreaActual(@NonNull k6z0 k6z0Var) {
        s8z0 s8z0Var = this.g;
        setOnTouchListener(s8z0Var);
        cry0 cry0Var = this.b;
        cry0Var.setOnTouchListener(s8z0Var);
        cry0Var.getLogoIcon().setOnTouchListener(s8z0Var);
        cry0Var.getTitleTextView().setOnTouchListener(s8z0Var);
        cry0Var.getDomainTextView().setOnTouchListener(s8z0Var);
        cry0Var.getAdsIcon().setOnTouchListener(s8z0Var);
        cry0Var.getButtonsView().getCloseButton().setOnTouchListener(s8z0Var);
        cry0Var.getButtonsView().getAdChoicesButton().setOnTouchListener(s8z0Var);
        cry0Var.getAgeRestrictionTextView().setOnTouchListener(s8z0Var);
        xoy0 xoy0Var = this.c;
        xoy0Var.setOnTouchListener(s8z0Var);
        xoy0Var.getMoreButton().setOnTouchListener(s8z0Var);
        if (k6z0Var.m) {
            setOnClickListener(this);
            cry0Var.getAgeRestrictionTextView().setOnClickListener(this);
            cry0Var.getTitleTextView().setOnClickListener(this);
            cry0Var.getLogoIcon().setOnClickListener(this);
            return;
        }
        setOnClickListener(k6z0Var.l ? this : null);
        cry0Var.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
        cry0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
        cry0Var.getLogoIcon().setOnClickListener(k6z0Var.c ? this : null);
        cry0Var.getAgeRestrictionTextView().setOnClickListener(k6z0Var.h ? this : null);
    }

    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        if (k6z0Var.m) {
            setOnClickListener(this);
            return;
        }
        setOnClickListener(k6z0Var.l ? this : null);
        cry0 cry0Var = this.b;
        cry0Var.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
        cry0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
        cry0Var.getLogoIcon().setOnClickListener(k6z0Var.c ? this : null);
        cry0Var.getAgeRestrictionTextView().setOnClickListener(k6z0Var.h ? this : null);
    }

    @Override // xsna.t5z0
    public final void b() {
        cry0 cry0Var = this.b;
        cry0Var.getButtonsView().getCloseButton().setVisibility(0);
        cry0Var.getButtonsView().getProgressFrame().setVisibility(8);
    }

    @Override // xsna.t5z0
    public final void c() {
        this.b.getButtonsView().getProgressFrame().setVisibility(8);
    }

    public final void e() {
        rvy0 rvy0Var = new rvy0(getContext());
        this.h = rvy0Var;
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        cry0 cry0Var = this.b;
        TextView ageRestrictionTextView = cry0Var.getAgeRestrictionTextView();
        rvy0 rvy0Var2 = this.h;
        int i = rvy0.q;
        ageRestrictionTextView.setTextColor(rvy0Var2.a.get(i));
        cry0Var.getDomainTextView().setTextColor(this.h.a.get(i));
        TextView titleTextView = cry0Var.getTitleTextView();
        rvy0 rvy0Var3 = this.h;
        titleTextView.setTextColor(rvy0Var3.a.get(rvy0.s));
    }

    @Override // xsna.t5z0
    @NonNull
    public View getCloseButton() {
        return this.b.getButtonsView().getCloseButton();
    }

    @Override // xsna.t5z0
    @Nullable
    public LinearLayout getTopBar() {
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = this.e;
        cry0 cry0Var = this.b;
        pbz0 pbz0Var = this.d;
        if (z) {
            if (view == cry0Var.getButtonsView().getCloseButton()) {
                pbz0Var.e();
                return;
            }
            if (view == cry0Var.getLogoIcon()) {
                pbz0Var.d();
                return;
            } else if (view == cry0Var.getButtonsView().getAdChoicesButton()) {
                pbz0Var.a();
                return;
            } else {
                pbz0Var.c(1, new viy0(view == cry0Var.getTitleTextView() ? 1 : view == cry0Var.getAgeRestrictionTextView() ? 128 : view == cry0Var.getLogoIcon() ? 4 : view == cry0Var.getDomainTextView() ? 512 : 2048, this.f));
                return;
            }
        }
        if (view == cry0Var.getButtonsView().getCloseButton()) {
            pbz0Var.e();
            return;
        }
        if (view == cry0Var.getLogoIcon()) {
            pbz0Var.d();
        } else if (view == cry0Var.getButtonsView().getAdChoicesButton()) {
            pbz0Var.a();
        } else {
            pbz0Var.c(1, new akz0());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        e();
    }

    @Override // xsna.t5z0
    public void setBanner(@NonNull tez0 tez0Var) {
        if (tez0Var.u == null) {
            return;
        }
        cry0 cry0Var = this.b;
        cry0Var.getLogoIcon().setImageBitmap(j6z0.a(tez0Var.u.a()));
        cry0Var.getTitleTextView().setText(tez0Var.f);
        cry0Var.getDomainTextView().setText(tez0Var.p.equals(X3.i.U) ? tez0Var.l : tez0Var.o);
        TextView ageRestrictionTextView = cry0Var.getAgeRestrictionTextView();
        String str = tez0Var.h;
        String str2 = tez0Var.r;
        String b = TextUtils.isEmpty(str2) ? "" : go9.b("", str2);
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str)) {
                b = fo8.a(b, " ");
            }
            b = fo8.a(b, str);
        }
        ageRestrictionTextView.setText(b);
        if (tez0Var.e0 != null) {
            cry0Var.getAdsIcon().setImageBitmap(tez0Var.e0.a());
        }
        this.c.setData(tez0Var.b0);
        boolean z = tez0Var.T.c;
        k6z0 k6z0Var = tez0Var.v;
        this.e = z;
        if (z) {
            setClickAreaActual(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @Override // xsna.t5z0
    public void setRemainingAllowCloseDelay(int i) {
        this.b.getButtonsView().getProgress().setText(String.valueOf(i));
    }

    @Override // xsna.t5z0
    public final View a() {
        return this;
    }

    @Override // xsna.t5z0
    public final void d() {
    }

    @Override // xsna.t5z0
    public void setDoubleBanners(@NonNull List<m6z0> list) {
    }
}
