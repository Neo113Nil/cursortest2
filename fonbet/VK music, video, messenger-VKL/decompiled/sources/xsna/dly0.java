package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.util.List;
import xsna.ugy0;
import xsna.xoy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class dly0 extends LinearLayout implements ugy0, View.OnClickListener {
    public final cry0 b;
    public final aez0 c;
    public final xoy0 d;
    public final pbz0 e;
    public z9z0 f;
    public final s8z0 g;
    public boolean h;

    public dly0(Context context, pbz0 pbz0Var, ugy0.a aVar, xoy0.b bVar) {
        super(context);
        this.f = new y9z0();
        this.g = new s8z0(new k6c0(this, 14));
        this.h = false;
        this.e = pbz0Var;
        rvy0 rvy0Var = new rvy0(context);
        setOrientation(1);
        setBackgroundColor(rvy0Var.a.get(rvy0.r));
        cry0 cry0Var = new cry0(context);
        cry0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        cry0Var.getButtonsView().getCloseButton().setOnClickListener(this);
        cry0Var.getButtonsView().getAdChoicesButton().setOnClickListener(this);
        this.b = cry0Var;
        addView(cry0Var);
        aez0 aez0Var = new aez0(context, aVar, bVar);
        aez0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.c = aez0Var;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        xoy0 xoy0Var = new xoy0(context, bVar);
        xoy0Var.setLayoutParams(layoutParams);
        this.d = xoy0Var;
        if (context.getResources().getConfiguration().orientation == 2) {
            addView(xoy0Var);
        } else {
            addView(aez0Var);
        }
        e();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setClickArea(@NonNull k6z0 k6z0Var) {
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
        xoy0 xoy0Var = this.d;
        xoy0Var.setOnTouchListener(s8z0Var);
        xoy0Var.getMoreButton().setOnTouchListener(s8z0Var);
        aez0 aez0Var = this.c;
        aez0Var.setOnTouchListener(s8z0Var);
        aez0Var.getAdCardView().getDescriptionTextView().setOnTouchListener(s8z0Var);
        aez0Var.getAdCardView().getAdImage().setOnTouchListener(s8z0Var);
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.l;
        if (z) {
            setOnClickListener(this);
            cry0Var.getAgeRestrictionTextView().setOnClickListener(this);
            cry0Var.getTitleTextView().setOnClickListener(this);
            cry0Var.getLogoIcon().setOnClickListener(this);
            aez0Var.setOnClickListener(this);
            aez0Var.getAdCardView().getAdImage().setOnClickListener(this);
            return;
        }
        setOnClickListener(z2 ? this : null);
        aez0Var.setOnClickListener(z2 ? this : null);
        aez0Var.getAdCardView().getAdImage().setOnClickListener(k6z0Var.d ? this : null);
        cry0Var.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
        cry0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
        cry0Var.getLogoIcon().setOnClickListener(k6z0Var.c ? this : null);
        cry0Var.getAgeRestrictionTextView().setOnClickListener(k6z0Var.h ? this : null);
    }

    private void setClickAreaLegacy(@NonNull k6z0 k6z0Var) {
        boolean z = k6z0Var.m;
        boolean z2 = k6z0Var.l;
        aez0 aez0Var = this.c;
        if (z) {
            setOnClickListener(this);
            aez0Var.setOnClickListener(this);
            aez0Var.getAdCardView().getAdImage().setOnClickListener(this);
            return;
        }
        setOnClickListener(z2 ? this : null);
        aez0Var.setOnClickListener(z2 ? this : null);
        aez0Var.getAdCardView().getAdImage().setOnClickListener(k6z0Var.d ? this : null);
        cry0 cry0Var = this.b;
        cry0Var.getTitleTextView().setOnClickListener(k6z0Var.a ? this : null);
        cry0Var.getDomainTextView().setOnClickListener(k6z0Var.j ? this : null);
        cry0Var.getLogoIcon().setOnClickListener(k6z0Var.c ? this : null);
        cry0Var.getAgeRestrictionTextView().setOnClickListener(k6z0Var.h ? this : null);
    }

    @Override // xsna.t5z0
    public final View a() {
        return this;
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
        int i = rvy0.r;
        SparseIntArray sparseIntArray = rvy0Var.a;
        setBackgroundColor(sparseIntArray.get(i));
        cry0 cry0Var = this.b;
        TextView ageRestrictionTextView = cry0Var.getAgeRestrictionTextView();
        int i2 = rvy0.q;
        ageRestrictionTextView.setTextColor(sparseIntArray.get(i2));
        cry0Var.getDomainTextView().setTextColor(sparseIntArray.get(i2));
        cry0Var.getTitleTextView().setTextColor(sparseIntArray.get(rvy0.s));
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
        boolean z = this.h;
        aez0 aez0Var = this.c;
        cry0 cry0Var = this.b;
        pbz0 pbz0Var = this.e;
        if (z) {
            if (view == cry0Var.getButtonsView().getCloseButton()) {
                pbz0Var.e();
                return;
            }
            if (view == cry0Var.getLogoIcon()) {
                pbz0Var.d();
                return;
            }
            if (view == cry0Var.getButtonsView().getAdChoicesButton()) {
                pbz0Var.a();
                return;
            } else if (view == aez0Var.getAdCardView()) {
                pbz0Var.c(2, new viy0(64, this.f));
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
            return;
        }
        if (view == cry0Var.getButtonsView().getAdChoicesButton()) {
            pbz0Var.a();
        } else if (view == aez0Var.getAdCardView()) {
            pbz0Var.c(2, new akz0());
        } else {
            pbz0Var.c(1, new akz0());
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aez0 aez0Var = this.c;
        removeView(aez0Var);
        xoy0 xoy0Var = this.d;
        removeView(xoy0Var);
        if (configuration.orientation == 2) {
            addView(xoy0Var);
        } else {
            addView(aez0Var);
        }
        e();
    }

    @Override // xsna.t5z0
    public void setBanner(@NonNull tez0 tez0Var) {
        kiw kiwVar = tez0Var.u;
        cry0 cry0Var = this.b;
        if (kiwVar != null) {
            cry0Var.getLogoIcon().setImageBitmap(j6z0.a(kiwVar.a()));
        }
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
        this.d.setData(tez0Var.b0);
        boolean z = tez0Var.T.c;
        k6z0 k6z0Var = tez0Var.v;
        this.h = z;
        if (z) {
            setClickArea(k6z0Var);
        } else {
            setClickAreaLegacy(k6z0Var);
        }
    }

    @Override // xsna.t5z0
    public void setRemainingAllowCloseDelay(int i) {
        this.b.getButtonsView().getProgress().setText(String.valueOf(i));
    }

    @Override // xsna.ugy0
    public final void a(List list, puy0 puy0Var) {
        aez0 aez0Var = this.c;
        ajz0 ajz0Var = aez0Var.b;
        wfy0 wfy0Var = puy0Var.a;
        if (wfy0Var.t == null) {
            return;
        }
        ajz0Var.setCard(wfy0Var);
        ajz0Var.setOnClickListeners(aez0Var.d);
        wcz0 wcz0Var = aez0Var.c;
        wcz0Var.c = list;
        for (int i = 0; i < wcz0Var.c.size(); i++) {
            wcz0Var.notifyItemChanged(i, wcz0Var.c.get(i));
        }
    }

    @Override // xsna.t5z0
    public final void d() {
    }

    @Override // xsna.t5z0
    public void setDoubleBanners(@NonNull List<m6z0> list) {
    }
}
