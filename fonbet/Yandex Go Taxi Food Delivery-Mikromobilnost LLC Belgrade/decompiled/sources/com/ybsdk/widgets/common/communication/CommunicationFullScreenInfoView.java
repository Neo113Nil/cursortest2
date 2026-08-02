package com.ybsdk.widgets.common.communication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.ybsdk.core.design.design.DesignTextStyle;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import defpackage.a10;
import defpackage.cma1;
import defpackage.dzh0;
import defpackage.fch0;
import defpackage.foc;
import defpackage.hc5;
import defpackage.irc;
import defpackage.jrc;
import defpackage.kp50;
import defpackage.l1i0;
import defpackage.l7a;
import defpackage.lb7;
import defpackage.lrc;
import defpackage.lum;
import defpackage.ny61;
import defpackage.oe91;
import defpackage.poh0;
import defpackage.qa3;
import defpackage.qha;
import defpackage.rje;
import defpackage.ung0;
import defpackage.vvg0;
import defpackage.w061;
import defpackage.xty0;
import defpackage.y5e;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\f*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenInfoView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "gravity", "Lzy11;", "updateLayoutGravity", "(Landroid/view/View;I)V", "Llrc;", ClidProvider.STATE, "", "render", "(Llrc;)Z", "Lw061;", "binding", "Lw061;", "Lqa3;", "Lgc5;", "adapter", "Lqa3;", "isScrollable", "Z", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenInfoView extends LinearLayout {
    private final qa3 adapter;
    private final w061 binding;
    private boolean isScrollable;

    public CommunicationFullScreenInfoView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(poh0.ybsdk_communication_full_screen_info_view, this);
        int i2 = fch0.infoList;
        ClickTransparentRecyclerView clickTransparentRecyclerView = (ClickTransparentRecyclerView) cma1.O(i2, this);
        if (clickTransparentRecyclerView != null) {
            i2 = fch0.subtitle;
            TextView textView = (TextView) cma1.O(i2, this);
            if (textView != null) {
                i2 = fch0.title;
                TextView textView2 = (TextView) cma1.O(i2, this);
                if (textView2 != null) {
                    this.binding = new w061(this, clickTransparentRecyclerView, textView, textView2);
                    a10 a10Var = hc5.a;
                    synchronized (y5e.a) {
                        try {
                            if (y5e.b == null) {
                                y5e.b = Executors.newFixedThreadPool(2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    qa3 qa3Var = new qa3(new lb7(9, y5e.b, a10Var), new lum(new qha(23), irc.a, new foc(4), jrc.a));
                    this.adapter = qa3Var;
                    this.isScrollable = true;
                    int d = rje.d(vvg0.ybsdk_screen_horizontal_space, context);
                    setPadding(d, 0, d, 0);
                    setOrientation(1);
                    clickTransparentRecyclerView.setAdapter(qa3Var);
                    clickTransparentRecyclerView.setItemAnimator(null);
                    clickTransparentRecyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ybsdk.widgets.common.communication.CommunicationFullScreenInfoView$1$1
                        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
                        public final boolean J() {
                            boolean z;
                            z = this.isScrollable;
                            if (z) {
                                return super.J();
                            }
                            return false;
                        }
                    });
                    return;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$4$lambda$3(lrc lrcVar, w061 w061Var) {
        if (lrcVar.l) {
            b.m(w061Var.d);
        }
    }

    private final void updateLayoutGravity(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i;
        view.setLayoutParams(layoutParams2);
    }

    public final boolean render(lrc state) {
        CharSequence a;
        int i = state.i;
        int i2 = state.h;
        Text text = state.a;
        Text text2 = state.d;
        w061 w061Var = this.binding;
        ClickTransparentRecyclerView clickTransparentRecyclerView = w061Var.b;
        TextView textView = w061Var.c;
        TextView textView2 = w061Var.d;
        List list = state.g;
        List list2 = list;
        clickTransparentRecyclerView.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
        textView2.setVisibility(text != null ? 0 : 8);
        if (text != null) {
            xty0.d(textView2, text);
            textView2.setAccessibilityHeading(true);
            textView2.setContentDescription(textView2.getContext().getString(dzh0.ybsdk_stories_accessibility_title_double_tap, textView2.getText()));
        }
        DesignTextStyle designTextStyle = state.c;
        xty0.g(textView2, designTextStyle != null ? oe91.f(designTextStyle) : l1i0.Widget_YB_Text_Headline1);
        ColorModel colorModel = state.b;
        if (colorModel == null) {
            colorModel = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        }
        xty0.e(textView2, colorModel);
        textView2.setPadding(0, kp50.r(state.j), 0, 0);
        updateLayoutGravity(textView2, i2);
        textView2.setGravity(i2);
        textView.setVisibility(text2 != null ? 0 : 8);
        textView.setText((text2 == null || (a = d.a(getContext(), text2)) == null) ? null : a.toString());
        textView.setMovementMethod(null);
        DesignTextStyle designTextStyle2 = state.f;
        xty0.g(textView, designTextStyle2 != null ? oe91.f(designTextStyle2) : l1i0.Widget_YB_Text_Body2);
        ColorModel colorModel2 = state.e;
        if (colorModel2 == null) {
            colorModel2 = new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        }
        xty0.e(textView, colorModel2);
        updateLayoutGravity(textView, i);
        textView.setGravity(i);
        this.adapter.g(list);
        this.isScrollable = state.k;
        return post(new l7a(17, state, w061Var));
    }

    public CommunicationFullScreenInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CommunicationFullScreenInfoView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CommunicationFullScreenInfoView(Context context) {
        this(context, null, 0, 6, null);
    }
}
