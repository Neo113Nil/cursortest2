package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import android.R;
import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.g;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import defpackage.cjw;
import defpackage.cma1;
import defpackage.ebw;
import defpackage.glw;
import defpackage.hjw;
import defpackage.j8h0;
import defpackage.jlw;
import defpackage.k4h0;
import defpackage.m950;
import defpackage.mfw;
import defpackage.mp60;
import defpackage.ny61;
import defpackage.pbw;
import defpackage.pj;
import defpackage.tje;
import defpackage.tkh0;
import defpackage.tug0;
import defpackage.tzt;
import defpackage.uk9;
import defpackage.vng;
import defpackage.z;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/component/IntercityDashboardCommentSelectorContainerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "dashboardPresenter", "<init>", "(Landroid/content/Context;Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;)V", "Lzy11;", "setBackgroundAndForeground", "()V", "Lcjw;", "section", "render", "(Lcjw;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lcom/yandex/go/taxi/intercity/dashboard/impl/presentation/modal/g;", "Lebw;", "binding", "Lebw;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IntercityDashboardCommentSelectorContainerView extends GoFrameLayout {
    private final ebw binding;
    private final g dashboardPresenter;

    public IntercityDashboardCommentSelectorContainerView(Context context, g gVar) {
        super(context, null, 0, 0, 14, null);
        this.dashboardPresenter = gVar;
        LayoutInflater.from(context).inflate(tkh0.intercity_dashboard_comment_selector_container, this);
        int i = j8h0.comment_banner_text;
        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, this);
        if (robotoTextView != null) {
            i = j8h0.comment_banner_title;
            RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i, this);
            if (robotoTextView2 != null) {
                i = j8h0.horizontal_center_guide;
                if (((Guideline) cma1.O(i, this)) != null) {
                    this.binding = new ebw(this, robotoTextView, robotoTextView2);
                    setBackground(vng.t(k4h0.bg_minor_rounded_24dp, getContext()));
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.setMarginStart(tje.r(tug0.section_margin_size, getContext()));
                    layoutParams.setMarginEnd(tje.r(tug0.section_margin_size, getContext()));
                    layoutParams.topMargin = tje.r(tug0.section_margin, getContext());
                    setLayoutParams(layoutParams);
                    setPadding(getPaddingLeft(), tje.r(tug0.section_vertical_padding, getContext()), getPaddingRight(), tje.r(tug0.section_vertical_padding, getContext()));
                    c.z(new tzt(22, this), this);
                    setBackgroundAndForeground();
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$1(IntercityDashboardCommentSelectorContainerView intercityDashboardCommentSelectorContainerView) {
        Object obj;
        g gVar = intercityDashboardCommentSelectorContainerView.dashboardPresenter;
        jlw a = gVar.A.a();
        glw glwVar = a instanceof glw ? (glw) a : null;
        if (glwVar != null) {
            mp60 mp60Var = glwVar.c;
            Object[] objArr = mp60Var.a;
            int i = mp60Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (((hjw) obj) instanceof cjw) {
                    break;
                }
                i2++;
            }
            cjw cjwVar = (cjw) (obj instanceof cjw ? obj : null);
            if (cjwVar != null) {
                pj pjVar = gVar.B.a;
                pjVar.getClass();
                pjVar.a.a("IntercityMain.CommentSelector.Tapped", new HashMap(), 1, new HashMap());
                e eVar = gVar.x.a;
                List list = cjwVar.b;
                List list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    eVar.A((m950) eVar.c0.get(), new z(CommentViewSource.INTERCITY_DASHBOARD), new mfw());
                } else {
                    String str = cjwVar.a;
                    String str2 = cjwVar.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    eVar.A((m950) eVar.d0.get(), new pbw(str, str2, list), new uk9(5));
                }
            }
        }
        return zy11.a;
    }

    private final void setBackgroundAndForeground() {
        setBackground(vng.t(k4h0.bg_minor_rounded_24dp, getContext()));
        setClipToOutline(true);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
        setForeground(vng.t(typedValue.resourceId, getContext()));
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        setBackgroundAndForeground();
    }

    public final void render(cjw section) {
        this.binding.c.setText(section.a);
        this.binding.b.setText(section.c);
    }
}
