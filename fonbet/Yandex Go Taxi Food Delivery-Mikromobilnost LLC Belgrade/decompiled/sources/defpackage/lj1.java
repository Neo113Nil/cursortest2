package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.passes.v2.list.ScootersPackageView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListGroupHeaderComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.ShimmeringBar;

/* loaded from: classes13.dex */
public final /* synthetic */ class lj1 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ lj1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new ListItemSwitchComponent(this.b, null, 0, 6, null);
            case 1:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 2:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 3:
                ButtonComponent buttonComponent = new ButtonComponent(this.b, null, 0, 6, null);
                buttonComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                return buttonComponent;
            case 4:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 5:
                return new ButtonComponent(this.b, null, 0, 6, null);
            case 6:
                return new ButtonComponent(this.b, null, 0, 6, null);
            case 7:
                return new ButtonComponent(this.b, null, 0, 6, null);
            case 8:
                return new w50(7, context);
            case 9:
                return new ButtonComponent(this.b, null, 0, 6, null);
            case 10:
                return new RobotoTextView(this.b, null, 0, 6, null);
            case 11:
                CardDivider cardDivider = new CardDivider(this.b, null, 0, 6, null);
                cardDivider.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return cardDivider;
            case 12:
                return new ButtonComponent(this.b, null, 0, 6, null);
            case 13:
                return new FrameLayout(context);
            case 14:
                return new ListGroupHeaderComponent(this.b, null, 0, 6, null);
            case 15:
                return new ListTitleComponent(this.b, null, 0, 6, null);
            case 16:
                return new GoImageView(this.b, null, 0, 6, null);
            case 17:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 18:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 19:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 20:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 21:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 22:
                ShimmeringBar shimmeringBar = new ShimmeringBar(this.b, null, 0, a2i0.StandartShimmeringBarStyle, 6, null);
                shimmeringBar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                return shimmeringBar;
            case 23:
                return LayoutInflater.from(context).inflate(qth0.diagnostic_journal_item, (ViewGroup) obj, false);
            case 24:
                return new ListItemComponent(this.b, null, 0, 6, null);
            case 25:
                int i2 = uj70.V;
                ListItemComponent listItemComponent = new ListItemComponent(this.b, null, 0, 6, null);
                listItemComponent.setBackground(vng.t(dzg0.bg_transparent_ripple, listItemComponent.getContext()));
                listItemComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                listItemComponent.setDividers(DividerPosition.START, DividerType.ICON_MARGIN);
                listItemComponent.setLeadImagePadding(tje.u(16, listItemComponent.getContext()));
                listItemComponent.setLeadImage(vng.t(dzg0.bg_action_component, listItemComponent.getContext()));
                listItemComponent.getLeadImageView().setAlpha(0.0f);
                listItemComponent.setTitleMaxLines(2);
                listItemComponent.setTitleEllipsizeMode(1);
                listItemComponent.setTrailMode(2);
                return listItemComponent;
            case 26:
                return new ScootersPackageView(context);
            case 27:
                ListItemComponent listItemComponent2 = new ListItemComponent(this.b, null, 0, 6, null);
                listItemComponent2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                listItemComponent2.setLeadImagePadding(tje.r(mrg0.go_design_s_space, listItemComponent2.getContext()));
                xw31.F(listItemComponent2, Integer.valueOf(tje.r(mrg0.go_design_s_space, listItemComponent2.getContext())), null, null, null);
                xw31.F(listItemComponent2, null, null, Integer.valueOf(tje.r(mrg0.go_design_s_space, listItemComponent2.getContext())), null);
                listItemComponent2.setLeadImage(new ColorDrawable(0));
                listItemComponent2.setMinHeight(tje.r(mrg0.list_item_component_size_L, listItemComponent2.getContext()));
                return listItemComponent2;
            case 28:
                return new ListGroupHeaderComponent(this.b, null, 0, 6, null);
            default:
                return new ListItemComponent(this.b, null, 0, 6, null);
        }
    }
}
