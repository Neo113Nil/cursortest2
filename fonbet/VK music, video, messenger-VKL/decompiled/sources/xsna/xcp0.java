package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoTopshelfVh;
import com.vk.toggle.b;
import com.vk.toggle.features.VideoFeatures;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.bcp0;

/* compiled from: TopshelfViewPagerAdapter.kt */
/* loaded from: classes16.dex */
public final class xcp0 extends scs {
    public final boolean l;
    public final sh50<ybp0> m;
    public final Map<Integer, xh5> n;
    public final VideoTopshelfVh.c o;
    public final boolean p;
    public bcp0.b q;
    public boolean r;

    public xcp0(FragmentActivity fragmentActivity, boolean z, caj0 caj0Var, LinkedHashMap linkedHashMap, VideoTopshelfVh.c cVar, boolean z2) {
        super(fragmentActivity);
        this.l = z;
        this.m = caj0Var;
        this.n = linkedHashMap;
        this.o = cVar;
        this.p = z2;
        VideoFeatures videoFeatures = VideoFeatures.VIDEO_TOPSHELF_SOUND;
        videoFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        boolean z3 = true;
        if (bVar.a(videoFeatures)) {
            b.d j = bVar.j(videoFeatures.getKey(), false);
            JSONObject g = j != null ? j.g() : null;
            if ((g != null ? g.getInt("isSoundAvailable") : 0) != 0) {
                z3 = false;
            }
        }
        this.r = z3;
        myc0.h(zvj.a(hqu0.b()), null, null, new wcp0(this, null), 3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<UIBlockTopshelf.TopshelfItem> list;
        bcp0.b bVar = this.q;
        if (bVar == null || (list = bVar.a) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // xsna.scs
    public final Fragment z0(int i) {
        bcp0.a aVar = bcp0.w;
        boolean z = this.r;
        aVar.getClass();
        bcp0 bcp0Var = new bcp0();
        Bundle bundle = new Bundle();
        bundle.putInt("extra_item_position", i);
        bundle.putBoolean("extra_is_tablet", this.l);
        bundle.putBoolean("extra_mute", z);
        bundle.putBoolean("extra_is_child_profile", this.p);
        bcp0Var.setArguments(bundle);
        bcp0Var.l = this.q;
        bcp0Var.m = this.m;
        bcp0Var.n = this.n;
        bcp0Var.h = this.o;
        return bcp0Var;
    }
}
