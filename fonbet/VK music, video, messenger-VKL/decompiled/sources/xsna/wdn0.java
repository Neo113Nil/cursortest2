package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.superapp.ui.widgets.SuperAppShowcaseSectionPosterWidget;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.f5h0;

/* compiled from: SuperAppWidgetShowcaseSectionPosterHolder.kt */
/* loaded from: classes6.dex */
public final class wdn0 extends ucn0<xdn0> {
    public static final int v = iah0.a(24);
    public static final float w = cn70.a() * 12.0f;
    public final u7n0 p;
    public final AppCompatTextView q;
    public final VKImageView r;
    public final AppCompatImageView s;
    public final FrameLayout t;
    public final int u;

    public wdn0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        this.q = (AppCompatTextView) this.itemView.findViewById(R.id.title);
        this.r = (VKImageView) this.itemView.findViewById(R.id.poster_image);
        this.s = (AppCompatImageView) this.itemView.findViewById(R.id.step_ahead_image);
        this.t = (FrameLayout) this.itemView.findViewById(R.id.bottom_content_container);
        this.u = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.vk_section_widget_edge_margin) * 2;
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        WebImageSize f;
        xdn0 xdn0Var = (xdn0) zif0Var;
        SuperAppShowcaseSectionPosterWidget superAppShowcaseSectionPosterWidget = xdn0Var.e;
        this.q.setText(superAppShowcaseSectionPosterWidget.o.b);
        SuperAppShowcaseSectionPosterWidget.Payload payload = superAppShowcaseSectionPosterWidget.o;
        WebImage webImage = payload.d;
        VKImageView vKImageView = this.r;
        int i = vKImageView.getContext().getResources().getDisplayMetrics().widthPixels - this.u;
        WebImageSize f2 = webImage.f(i);
        if (f2 != null) {
            f4m.n(an10.b(i * (f2.c / f2.d)), vKImageView);
            vKImageView.setClipToOutline(true);
            vKImageView.setOutlineProvider(new t0w0(6, w, false, false));
            vKImageView.setActualScaleType(f5h0.l.a);
            vKImageView.load(f2.b);
        }
        vKImageView.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_highlight_radius_12));
        jjc.g(vKImageView, new ll1(27, this, xdn0Var));
        awt0.o(vKImageView, new k7l0(this, 6));
        vKImageView.setContentDescription(this.itemView.getContext().getString(R.string.accessibility_super_app_open, payload.b));
        AppCompatImageView appCompatImageView = this.s;
        appCompatImageView.setImageResource(R.drawable.vk_icon_chevron_right_circle_28);
        omw.b(appCompatImageView, R.attr.vk_ui_icon_medium);
        appCompatImageView.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_highlight_radius_12));
        jjc.g(appCompatImageView, new y5m0(3, this, xdn0Var));
        SuperAppShowcaseSectionPosterWidget.Payload.BottomContent bottomContent = payload.e;
        FrameLayout frameLayout = this.t;
        if (bottomContent == null) {
            f4m.j(frameLayout);
            return;
        }
        View inflate = e3m.b(this.itemView.getContext()).inflate(R.layout.vk_super_app_poster_section_content_user_stack, frameLayout);
        TextView textView = (TextView) inflate.findViewById(R.id.user_stack_text);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.avatars_container);
        vbn0 vbn0Var = new vbn0(inflate.getContext());
        int i2 = v;
        vbn0Var.setIconSize(i2);
        frameLayout2.addView(vbn0Var);
        textView.setText(bottomContent.b);
        List<ImageWithAction> list = bottomContent.c;
        ArrayList arrayList = new ArrayList();
        for (ImageWithAction imageWithAction : list) {
            WebImage webImage2 = imageWithAction.b;
            Pair pair = (webImage2 == null || (f = webImage2.f(i2)) == null) ? null : new Pair(f.b, imageWithAction.c);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            f4m.j(vbn0Var);
        } else {
            vbn0Var.setReverseDrawingOrder(true);
            vbn0Var.setStrokeColor(qpo0.c(R.attr.vk_ui_background_tertiary, this.itemView.getContext()));
            vbn0Var.c(j5g.H0(arrayList, 3), 0, new com.vk.movika.tools.controls.seekbar.r(this, 12));
        }
        frameLayout.setVisibility(0);
    }
}
