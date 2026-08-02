package xsna;

import android.graphics.Rect;
import com.google.android.material.tabs.TabLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.core.view.VKTabLayout;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: FirstPinnedTabLayoutTracker.kt */
/* loaded from: classes16.dex */
public final class tlr {
    public final FirstPinnedTabLayout a;
    public final wzs<Integer, String, s3q0> b;
    public final float c = 0.5f;
    public final LinkedHashSet d = new LinkedHashSet();
    public List<? extends UIBlock> e = EmptyList.b;
    public final Rect f = new Rect();

    public tlr(FirstPinnedTabLayout firstPinnedTabLayout, wzs wzsVar) {
        this.a = firstPinnedTabLayout;
        this.b = wzsVar;
        VKTabLayout.c cVar = new VKTabLayout.c() { // from class: xsna.rlr
            @Override // com.vk.core.view.VKTabLayout.c
            public final void a(int i) {
                tlr.this.a();
            }
        };
        VKTabLayout vKTabLayout = firstPinnedTabLayout.b;
        if (vKTabLayout != null) {
            vKTabLayout.e0.add(cVar);
        }
    }

    public final void a() {
        TabLayout.i iVar;
        if (this.e.isEmpty()) {
            return;
        }
        FirstPinnedTabLayout firstPinnedTabLayout = this.a;
        int tabCount = firstPinnedTabLayout.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            UIBlock uIBlock = (UIBlock) j5g.b0(i, this.e);
            if (uIBlock != null) {
                String str = uIBlock.b;
                TabLayout.g b = firstPinnedTabLayout.b(i);
                if (b != null && (iVar = b.h) != null) {
                    float E = bwt0.E(this.f, iVar);
                    float f = this.c;
                    LinkedHashSet linkedHashSet = this.d;
                    if (E <= f) {
                        linkedHashSet.remove(str);
                    } else if (!linkedHashSet.contains(str)) {
                        linkedHashSet.add(str);
                        this.b.invoke(Integer.valueOf(i), str);
                    }
                }
            }
        }
    }
}
