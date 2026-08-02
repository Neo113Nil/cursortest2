package com.yandex.go.masstransit.design.snippet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.fh4;
import defpackage.h8;
import defpackage.jl40;
import defpackage.mrg0;
import defpackage.q2h0;
import defpackage.t3t0;
import defpackage.tje;
import defpackage.u3t0;
import defpackage.v3t0;
import defpackage.w3t0;
import defpackage.w511;
import defpackage.x3t0;
import defpackage.y3t0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001e\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/go/masstransit/design/snippet/MtSnippetView;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lu3t0;", IssuingDistributionPointExtension.POINT, "Landroid/view/View;", "createIntermediatePoint", "(Landroid/content/Context;Lu3t0;)Landroid/view/View;", "createDivider", "(Landroid/content/Context;)Landroid/view/View;", "", "selected", "Lzy11;", "setSelected", "(Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "Ly3t0;", "snippets", "render", "(Ljava/util/List;)V", "Ljava/util/List;", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtSnippetView extends GoLinearLayout {
    public static final int $stable = 8;
    private List<? extends y3t0> snippets;

    public /* synthetic */ MtSnippetView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    private final View createDivider(Context context) {
        GoImageView goImageView = new GoImageView(context, null, 0, 6, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(tje.u(8, goImageView.getContext()));
        marginLayoutParams.setMarginEnd(tje.u(8, goImageView.getContext()));
        goImageView.setLayoutParams(marginLayoutParams);
        goImageView.setImageResource(q2h0.ic_mt_separator);
        return goImageView;
    }

    private final View createIntermediatePoint(Context context, u3t0 point) {
        RobotoTextView robotoTextView = new RobotoTextView(context, null, 0, 6, null);
        robotoTextView.setMinWidth(tje.u(20, context));
        robotoTextView.setTextSize(0, tje.r(mrg0.component_text_size_caption, robotoTextView.getContext()));
        robotoTextView.setTextTypeface(3);
        fh4.g(robotoTextView);
        robotoTextView.setText(fh4.e(context, point.a));
        robotoTextView.setContentDescription(point.b);
        return robotoTextView;
    }

    @Override // com.yandex.go.design.view.GoLinearLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        List<? extends y3t0> list = this.snippets;
        if (list != null) {
            render(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.yandex.go.masstransit.design.snippet.MtPedestrianSnippetView] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.yandex.go.masstransit.design.snippet.MtUndergroundSnippetView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.yandex.go.masstransit.design.snippet.MtTransportSnippetView] */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.View, android.view.ViewGroup, com.yandex.go.masstransit.design.snippet.MtSnippetView] */
    public final void render(List<? extends y3t0> snippets) {
        ?? createDivider;
        removeAllViews();
        this.snippets = snippets;
        for (y3t0 y3t0Var : snippets) {
            if (y3t0Var instanceof v3t0) {
                createDivider = new MtPedestrianSnippetView(getContext());
                createDivider.render((v3t0) y3t0Var);
            } else if (y3t0Var instanceof w3t0) {
                createDivider = new MtTransportSnippetView(getContext());
                createDivider.render((w3t0) y3t0Var);
            } else if (y3t0Var instanceof x3t0) {
                createDivider = new MtUndergroundSnippetView(getContext());
                createDivider.render((x3t0) y3t0Var);
            } else if (y3t0Var instanceof u3t0) {
                createDivider = createIntermediatePoint(getContext(), (u3t0) y3t0Var);
            } else {
                if (!jl40.l(y3t0Var, t3t0.a)) {
                    w511.b();
                    return;
                }
                createDivider = createDivider(getContext());
            }
            addView(createDivider);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        h8 h8Var = new h8(3, this);
        while (h8Var.hasNext()) {
            ((View) h8Var.next()).setSelected(selected);
        }
    }

    public MtSnippetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public MtSnippetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public MtSnippetView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setGravity(16);
        setOrientation(0);
    }

    public MtSnippetView(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
