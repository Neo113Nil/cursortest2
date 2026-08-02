package xsna;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.vk.core.view.components.card.VkCard;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ui.widgets.half_tile.HalfTileContent;
import com.vk.superapp.ui.widgets.half_tile.SuperAppWidgetHalfTile;
import com.vk.superapp.ui.widgets.tile.ImageWithAction;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* compiled from: SuperAppWidgetShowcaseUserStackHalfTileHolder.kt */
/* loaded from: classes6.dex */
public final class fen0 extends ucn0<gen0> {
    public static final int s = cn70.b(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
    public static final int t = cn70.b(40);
    public static final float u = cn70.c(1);
    public static final int v = cn70.b(-14);
    public static final int w = cn70.b(32);
    public static final int x = cn70.b(24);
    public final u7n0 p;
    public final TextView q;
    public final vbn0 r;

    public fen0(View view, u7n0 u7n0Var) {
        super(view, null);
        this.p = u7n0Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.subtitle_text_view);
        this.q = textView;
        vbn0 vbn0Var = new vbn0(textView.getContext());
        this.r = vbn0Var;
        vbn0Var.setImageLimit(4);
        vbn0Var.setIconSize(t);
        ((FrameLayout) this.itemView.findViewById(R.id.avatars_container)).addView(vbn0Var);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        WebImageSize f;
        gen0 gen0Var = (gen0) zif0Var;
        SuperAppWidgetHalfTile superAppWidgetHalfTile = gen0Var.h;
        HalfTileContent halfTileContent = superAppWidgetHalfTile.o.c;
        HalfTileContent.UserStack userStack = halfTileContent instanceof HalfTileContent.UserStack ? (HalfTileContent.UserStack) halfTileContent : null;
        if (userStack != null) {
            VkCard vkCard = (VkCard) this.itemView.findViewById(R.id.half_tile_root_view);
            vkCard.setForeground(this.itemView.getContext().getDrawable(R.drawable.vk_tile_ripple_foreground));
            vkCard.setBackgroundColorAttr(R.attr.vk_ui_background_modal);
            vkCard.setBorderColorAttr(R.attr.vk_ui_separator_secondary);
            vkCard.setDrawBorder(true);
            vkCard.setCardRadius(cn70.a() * 12.0f);
            vkCard.setElevation(cn70.a() * 0.7f);
            jjc.g(this.itemView, new een0(0, gen0Var, this));
            this.q.setText(userStack.d);
            List<ImageWithAction> list = userStack.b;
            Integer num = userStack.c;
            ArrayList arrayList = new ArrayList();
            for (ImageWithAction imageWithAction : list) {
                WebImage webImage = imageWithAction.b;
                Pair pair = (webImage == null || (f = webImage.f(t)) == null) ? null : new Pair(f.b, imageWithAction.c);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            boolean isEmpty = arrayList.isEmpty();
            vbn0 vbn0Var = this.r;
            if (isEmpty) {
                f4m.j(vbn0Var);
            } else {
                vbn0Var.setReverseDrawingOrder(true);
                vbn0Var.setOffset(v);
                vbn0Var.setAvatarElevation(u);
                int i = ((cn70.b(this.itemView.getContext().getResources().getConfiguration().screenWidthDp) - w) / 2) - x >= s ? 4 : 3;
                vbn0Var.setStrokeColor(qpo0.c(R.attr.vk_ui_background_tertiary, this.itemView.getContext()));
                vbn0Var.c(j5g.H0(arrayList, i), num != null ? num.intValue() : 0, null);
            }
            String f2 = superAppWidgetHalfTile.o.b.f();
            if (f2 != null) {
                this.itemView.setContentDescription(f2);
            }
        }
    }
}
