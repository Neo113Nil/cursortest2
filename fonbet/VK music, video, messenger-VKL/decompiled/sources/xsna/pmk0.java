package xsna;

import androidx.fragment.app.Fragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockSportMatch;
import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SportsMatchesCurrentAdapter.kt */
/* loaded from: classes16.dex */
public final class pmk0 extends scs {
    public b5a l;
    public UIBlockList m;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        UIBlockList uIBlockList = this.m;
        List list = uIBlockList != null ? uIBlockList.y : null;
        if (list == null) {
            list = EmptyList.b;
        }
        return list.size();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        ArrayList<UIBlock> arrayList;
        cha chaVar = new cha();
        UIBlockList uIBlockList = this.m;
        Serializer.StreamParcelableAdapter streamParcelableAdapter = (uIBlockList == null || (arrayList = uIBlockList.y) == null) ? null : (UIBlock) arrayList.get(i);
        chaVar.h = streamParcelableAdapter instanceof UIBlockSportMatch ? (UIBlockSportMatch) streamParcelableAdapter : null;
        chaVar.i = this.l;
        return chaVar;
    }
}
