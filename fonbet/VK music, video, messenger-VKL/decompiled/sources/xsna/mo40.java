package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.UIBlockMusicMixTopshelf;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: MusicMixTopshelfViewPagerAdapter.kt */
/* loaded from: classes16.dex */
public final class mo40 extends scs {
    public final boolean l;
    public final Map<Integer, xh5> m;
    public UIBlockMusicMixTopshelf n;

    public mo40(FragmentActivity fragmentActivity, boolean z, LinkedHashMap linkedHashMap) {
        super(fragmentActivity);
        this.l = z;
        this.m = linkedHashMap;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        UIBlockMusicMixTopshelf uIBlockMusicMixTopshelf = this.n;
        List<UIBlockMusicMixTopshelf.Item> list = uIBlockMusicMixTopshelf != null ? uIBlockMusicMixTopshelf.y : null;
        if (list == null) {
            list = EmptyList.b;
        }
        return list.size();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        ko40 ko40Var = new ko40();
        ko40Var.l = this.n;
        Bundle b = ar.b(i, "extra_item_position");
        b.putBoolean("extra_is_tablet", this.l);
        ko40Var.setArguments(b);
        ko40Var.q = this.m;
        return ko40Var;
    }
}
