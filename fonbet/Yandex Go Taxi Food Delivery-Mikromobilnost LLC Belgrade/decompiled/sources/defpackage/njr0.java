package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.go.address.models.FavoriteAddress;
import com.yandex.go.address.models.PlaceType;
import java.util.ArrayList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.favorites.list.ViewType;

/* loaded from: classes6.dex */
public final class njr0 extends RecyclerView.Adapter {
    public final ArrayList a = new ArrayList();
    public n1c b = (n1c) ((zxf0) pwf0.c(n1c.class));

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((w2x) this.a.get(i)).a.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        dgp dgpVar = (dgp) x0Var;
        ArrayList arrayList = this.a;
        w2x w2xVar = (w2x) arrayList.get(i);
        boolean z = i == arrayList.size() - 1;
        n1c n1cVar = this.b;
        switch (dgpVar.N) {
            case 0:
                o2x o2xVar = (o2x) w2xVar;
                ListItemComponent listItemComponent = (ListItemComponent) dgpVar.O;
                listItemComponent.setTitle(o2xVar.d.getName());
                listItemComponent.setLeadImage(hzg0.ic_share_favorite_other);
                listItemComponent.setTrailImage(0);
                listItemComponent.setDividers(DividerPosition.BOTTOM, z ? DividerType.NONE : DividerType.MARGIN);
                listItemComponent.setLeadTint((ColorStateList) null);
                listItemComponent.setDebounceClickListener(new qpo(2, n1cVar, o2xVar));
                break;
            case 1:
                FavoriteAddress favoriteAddress = ((u2x) w2xVar).b;
                ListItemComponent listItemComponent2 = (ListItemComponent) dgpVar.O;
                listItemComponent2.setTitle(favoriteAddress.q());
                listItemComponent2.setLeadImage(PlaceType.WORK == favoriteAddress.getPlaceType() ? hzg0.ic_share_favorite_work : hzg0.ic_share_favorite_home);
                listItemComponent2.setTrailImage(0);
                listItemComponent2.setDividers(DividerPosition.BOTTOM, z ? DividerType.NONE : DividerType.MARGIN);
                listItemComponent2.setLeadTint((ColorStateList) null);
                listItemComponent2.setDebounceClickListener(new tpt0(14, n1cVar, favoriteAddress));
                break;
            default:
                dgpVar.O.setVisibility(z ? 8 : 0);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewType viewType = (ViewType) ViewType.a().get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = mjr0.a[viewType.ordinal()];
        return i2 != 1 ? i2 != 2 ? new dgp(from.inflate(trh0.share_loading_favorite_item, viewGroup, false), 2) : new dgp(from.inflate(trh0.share_favorite_item, viewGroup, false), 1) : new dgp(from.inflate(trh0.share_favorite_item, viewGroup, false), 0);
    }
}
