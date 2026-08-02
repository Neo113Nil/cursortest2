package com.yandex.go.beginners.presentation.services_info.views;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import defpackage.al5;
import defpackage.bdc;
import defpackage.eja1;
import defpackage.ftg0;
import defpackage.h8;
import defpackage.j6r;
import defpackage.kdc;
import defpackage.l1h0;
import defpackage.s8o;
import defpackage.tje;
import defpackage.up11;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0016H\u0014¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006("}, d2 = {"Lcom/yandex/go/beginners/presentation/services_info/views/FinalServiceView;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Lal5;", "info", "Landroid/graphics/Typeface;", "mainInfoTypeface", "<init>", "(Landroid/content/Context;Lal5;Landroid/graphics/Typeface;)V", "", "textDefault", "textHighlighted", "", "getMainInfoText", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "Landroid/text/style/ReplacementSpan;", "getIconSpan", "()Landroid/text/style/ReplacementSpan;", "text", "Lkdc;", "color", "", "size", "Landroid/text/SpannableString;", "getTextSpan", "(Ljava/lang/String;Lkdc;I)Landroid/text/SpannableString;", "getSeparator", "()Ljava/lang/CharSequence;", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "onMeasure", "(II)V", "Lbdc;", "mainTextColor", "Lbdc;", "highlightedTextColor", "Companion", "j6r", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FinalServiceView extends LinearLayoutCompat {
    public static final int $stable = 8;
    public static final j6r Companion = new j6r();
    private static final float MULTIPLIER_FOR_DISTANCE_BETWEEN_LINES = 0.8f;
    private final bdc highlightedTextColor;
    private final bdc mainTextColor;

    public FinalServiceView(Context context, al5 al5Var, Typeface typeface) {
        super(context);
        this.mainTextColor = new bdc(xng0.textMain);
        bdc bdcVar = new bdc(xng0.controlMain);
        this.highlightedTextColor = bdcVar;
        setOrientation(1);
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
        robotoTextView.setLineSpacing(0.0f, 0.8f);
        robotoTextView.setTypeface(typeface, 1);
        robotoTextView.setText(getMainInfoText(al5Var.c, al5Var.d));
        RobotoTextView robotoTextView2 = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-1, -2));
        int[] iArr = up11.a;
        robotoTextView2.setTypeface(eja1.w(5, 0));
        robotoTextView2.setText(getTextSpan(al5Var.b, bdcVar, 31));
        addView(robotoTextView);
        addView(robotoTextView2);
        int r = tje.r(ftg0.text_padding, getContext());
        setPadding(r, 0, r, 0);
    }

    private final ReplacementSpan getIconSpan() {
        Drawable t = vng.t(l1h0.ic_pin, getContext());
        if (t == null) {
            return null;
        }
        return new CustomImageSpan(t, 2, false, false, null, 28, null);
    }

    private final CharSequence getMainInfoText(String textDefault, String textHighlighted) {
        ReplacementSpan iconSpan = getIconSpan();
        SpannableString textSpan$default = getTextSpan$default(this, textDefault, this.mainTextColor, 0, 4, null);
        return new SpannableStringBuilder().append((CharSequence) textSpan$default).append(getSeparator()).append((CharSequence) getTextSpan$default(this, textHighlighted, this.highlightedTextColor, 0, 4, null)).append(getSeparator()).append(" ", iconSpan, 33);
    }

    private final CharSequence getSeparator() {
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new AbsoluteSizeSpan(56, true), 0, 1, 33);
        return spannableString;
    }

    private final SpannableString getTextSpan(String text, kdc color, int size) {
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new AbsoluteSizeSpan(size, true), 0, text.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(s8o.m(color, getContext())), 0, text.length(), 33);
        return spannableString;
    }

    public static /* synthetic */ SpannableString getTextSpan$default(FinalServiceView finalServiceView, String str, kdc kdcVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 56;
        }
        return finalServiceView.getTextSpan(str, kdcVar, i);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        h8 h8Var = new h8(3, this);
        int i = 0;
        while (h8Var.hasNext()) {
            i += ((View) h8Var.next()).getMeasuredHeight();
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i);
    }
}
