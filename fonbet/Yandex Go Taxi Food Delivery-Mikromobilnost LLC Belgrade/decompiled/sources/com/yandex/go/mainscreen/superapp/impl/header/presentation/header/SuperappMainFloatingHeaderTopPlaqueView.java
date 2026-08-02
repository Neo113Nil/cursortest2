package com.yandex.go.mainscreen.superapp.impl.header.presentation.header;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.presentation.a;
import defpackage.e37;
import defpackage.e4w0;
import defpackage.f1h0;
import defpackage.f4w0;
import defpackage.g4w0;
import defpackage.gyt0;
import defpackage.h4w0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.ljc0;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.pjc0;
import defpackage.pwz0;
import defpackage.tje;
import defpackage.ubw0;
import defpackage.vbw0;
import defpackage.w511;
import defpackage.wbw0;
import defpackage.x27;
import defpackage.xby;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\f\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/impl/header/presentation/header/SuperappMainFloatingHeaderTopPlaqueView;", "Landroid/widget/LinearLayout;", "Le4w0;", "Landroid/content/Context;", "context", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;", "presenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;)V", "Lwbw0;", "uiState", "Lzy11;", "render", "(Lwbw0;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lh4w0;", "(Lh4w0;)V", "Lcom/yandex/go/mainscreen/superapp/impl/clarifyaddress/presentation/a;", "", "isPresenterAttached", "Z", "Lru/yandex/taxi/widget/RobotoTextView;", "textView", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/widget/ImageView;", "iconView", "Landroid/widget/ImageView;", "chevronView", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappMainFloatingHeaderTopPlaqueView extends LinearLayout implements e4w0 {
    private final ImageView chevronView;
    private final ImageView iconView;
    private boolean isPresenterAttached;
    private final a presenter;
    private final RobotoTextView textView;

    public SuperappMainFloatingHeaderTopPlaqueView(Context context, a aVar) {
        super(context);
        this.presenter = aVar;
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setTextSize(0, robotoTextView.getResources().getDimension(mrg0.component_text_size_caption));
        robotoTextView.setGravity(17);
        robotoTextView.setSingleLine(true);
        robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
        int u = tje.u(16, robotoTextView.getContext());
        robotoTextView.setPadding(u, robotoTextView.getPaddingTop(), u, robotoTextView.getPaddingBottom());
        this.textView = robotoTextView;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(f1h0.ic_warning_pin_24);
        this.iconView = imageView;
        ImageView imageView2 = new ImageView(context);
        Drawable mutate = tje.y(f1h0.ic_chevron_right_fill_m, imageView2.getContext()).mutate();
        mutate.setAutoMirrored(true);
        imageView2.setImageDrawable(mutate);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.chevronView = imageView2;
        setOrientation(0);
        setMinimumHeight(tje.u(48, getContext()));
        setGravity(16);
        int u2 = tje.u(24, getContext());
        int u3 = tje.u(16, getContext());
        setPadding(u3, getPaddingTop(), u3, getPaddingBottom());
        addView(imageView, u2, u2);
        addView(robotoTextView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        addView(imageView2, u2, u2);
        int color = getContext().getColor(mqg0.component_orange_toxic);
        imageView.setImageTintList(ColorStateList.valueOf(color));
        robotoTextView.setTextColor(color);
        imageView2.setImageTintList(ColorStateList.valueOf(color));
        render(ubw0.a);
    }

    private final void render(wbw0 uiState) {
        if (!(uiState instanceof vbw0)) {
            if (!(uiState instanceof ubw0)) {
                w511.b();
                return;
            }
            setVisibility(8);
            this.textView.setText((CharSequence) null);
            setOnClickListener(null);
            return;
        }
        setVisibility(0);
        vbw0 vbw0Var = (vbw0) uiState;
        this.textView.setText(vbw0Var.a);
        boolean l = jl40.l(vbw0Var.b, ljc0.a);
        ImageView imageView = this.chevronView;
        if (l) {
            imageView.setVisibility(4);
            setOnClickListener(null);
        } else {
            imageView.setVisibility(0);
            c.z(new gyt0(14, this, vbw0Var), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$0(SuperappMainFloatingHeaderTopPlaqueView superappMainFloatingHeaderTopPlaqueView, wbw0 wbw0Var) {
        a aVar = superappMainFloatingHeaderTopPlaqueView.presenter;
        vbw0 vbw0Var = (vbw0) wbw0Var;
        pjc0 pjc0Var = vbw0Var.b;
        pwz0 pwz0Var = vbw0Var.c;
        if (aVar.c && aVar.Eg()) {
            aVar.C.a(pjc0Var, pwz0Var);
        } else {
            xby.t(jst.e, "CLARIFY_ERROR:PERFORM_ACTION", new IllegalStateException(), "View not attached", 2);
        }
        return zy11.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.isPresenterAttached) {
            return;
        }
        this.isPresenterAttached = true;
        this.presenter.Mg(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.isPresenterAttached) {
            this.isPresenterAttached = false;
            this.presenter.Cg();
        }
    }

    @Override // defpackage.eyi0
    public void render(h4w0 uiState) {
        wbw0 wbw0Var;
        pjc0 pjc0Var;
        if (uiState instanceof g4w0) {
            g4w0 g4w0Var = (g4w0) uiState;
            CharSequence charSequence = g4w0Var.a.a;
            e37 e37Var = g4w0Var.b.b;
            if (e37Var instanceof x27) {
                pjc0Var = ((x27) e37Var).b;
            } else {
                pjc0Var = ljc0.a;
            }
            wbw0Var = new vbw0(charSequence, pjc0Var, g4w0Var.c);
        } else if (uiState instanceof f4w0) {
            wbw0Var = ubw0.a;
        } else {
            w511.b();
            return;
        }
        render(wbw0Var);
    }
}
