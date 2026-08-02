package com.yandex.go.taxi.summary.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.zone.dto.objects.Notification;
import defpackage.agh0;
import defpackage.blx0;
import defpackage.evu0;
import defpackage.kyh0;
import defpackage.lnv0;
import defpackage.mrg0;
import defpackage.rp31;
import defpackage.tje;
import defpackage.vng;
import defpackage.wfh0;
import defpackage.wrh0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yandex/go/taxi/summary/ui/TariffPopupModalView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "", "", "translations", "", "iconRes", "<init>", "(Landroid/content/Context;Ljava/util/Map;I)V", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Landroid/view/ViewGroup;", "content", "Landroid/view/ViewGroup;", "Companion", "blx0", "solid"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TariffPopupModalView extends ModalView {
    private static final String BUTTON_KEY = "button";
    public static final blx0 Companion = new blx0();
    private static final String DESCRIPTION_KEY = "text";
    private static final String TITLE_KEY = "title";
    private final ViewGroup content;

    private TariffPopupModalView(Context context, Map<String, String> map, int i) {
        super(context);
        ru.yandex.taxi.design.utils.c.q(this, wrh0.tariff_popup, true);
        this.content = (ViewGroup) findViewById(agh0.content);
        int i2 = wfh0.title;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        RobotoTextView robotoTextView = (RobotoTextView) ((View) rp31.d(this, i2));
        String str = map.get(TITLE_KEY);
        if (str == null || evu0.J(str)) {
            robotoTextView.setVisibility(8);
        } else {
            robotoTextView.setVisibility(0);
            robotoTextView.setText(str);
            if (i != 0) {
                robotoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(vng.t(i, getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
                robotoTextView.setCompoundDrawablePadding(tje.r(mrg0.go_design_m_space, getContext()));
            } else {
                robotoTextView.setCompoundDrawables(null, null, null, null);
                robotoTextView.setCompoundDrawablePadding(0);
            }
        }
        RobotoTextView robotoTextView2 = (RobotoTextView) ((View) rp31.d(this, wfh0.description));
        String str2 = map.get(DESCRIPTION_KEY);
        if (str2 == null || evu0.J(str2)) {
            robotoTextView2.setVisibility(8);
        } else {
            robotoTextView2.setVisibility(0);
            robotoTextView2.setText(str2);
        }
        ButtonComponent buttonComponent = (ButtonComponent) ((View) rp31.d(this, wfh0.button));
        buttonComponent.setText(map.getOrDefault(BUTTON_KEY, getContext().getString(kyh0.common_got_it)));
        buttonComponent.setOnClickListener(new lnv0(27, this));
    }

    public static final TariffPopupModalView create(Context context, Notification notification, String str) {
        Companion.getClass();
        return blx0.a(context, notification, str);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.content;
    }

    public /* synthetic */ TariffPopupModalView(Context context, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, map, i);
    }
}
