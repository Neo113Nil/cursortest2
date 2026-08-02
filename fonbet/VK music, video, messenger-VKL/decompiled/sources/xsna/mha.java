package xsna;

import android.view.View;
import com.vk.core.view.components.subnavigation.SubnavigationButton;
import com.vk.core.view.components.subnavigation.VkSubnavigationBar;
import com.vk.core.view.components.subnavigation.VkSubnavigationButton;
import com.vk.video.ui.discovery.minimizable.q;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CatalogTabsDelegate.kt */
/* loaded from: classes7.dex */
public final class mha {
    public final VkSubnavigationBar a;
    public final izs<String, s3q0> b;
    public final izs<String, s3q0> c;
    public final boolean d;
    public boolean e;
    public final b0o0 f;

    public mha(VkSubnavigationBar vkSubnavigationBar, izs izsVar, izs izsVar2, mha mhaVar, int i) {
        boolean z = (i & 8) == 0;
        mhaVar = (i & 16) != 0 ? null : mhaVar;
        this.a = vkSubnavigationBar;
        this.b = izsVar;
        this.c = izsVar2;
        this.d = z;
        this.f = new b0o0(vkSubnavigationBar, new op1(this, 14), mhaVar != null ? mhaVar.f : null);
        vkSubnavigationBar.setMultiSelect(true);
    }

    public final void a(q.a aVar, List<q.a> list) {
        Integer j;
        int i;
        if (aVar == null || list == null || (j = p4g.j(aVar, list)) == null) {
            return;
        }
        int intValue = j.intValue();
        VkSubnavigationBar vkSubnavigationBar = this.a;
        Iterator<T> it = vkSubnavigationBar.getActiveButtons().iterator();
        boolean z = true;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            VkSubnavigationBar.a<?> aVar2 = (VkSubnavigationBar.a) it.next();
            if (aVar2.b == intValue) {
                z = false;
            } else {
                vkSubnavigationBar.a(aVar2);
            }
        }
        if (z) {
            vkSubnavigationBar.a((VkSubnavigationBar.a) vkSubnavigationBar.h.get(intValue));
        }
        if (this.d) {
            for (Object obj : vkSubnavigationBar.getButtons()) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                VkSubnavigationBar.a aVar3 = (VkSubnavigationBar.a) obj;
                if (i != intValue) {
                    aVar3.a.setBackground(vkSubnavigationBar.getContext().getDrawable(R.drawable.inactive_tab_background));
                }
                i = i2;
            }
        }
    }

    public final void b(q.a aVar, List<q.a> list) {
        VkSubnavigationBar vkSubnavigationBar = this.a;
        int size = vkSubnavigationBar.h.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                vkSubnavigationBar.e(size);
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        boolean isEmpty = list.isEmpty();
        final b0o0 b0o0Var = this.f;
        if (isEmpty) {
            b0o0Var.c.clear();
            b0o0Var.d = EmptyList.b;
            this.e = false;
            return;
        }
        for (q.a aVar2 : list) {
            VkSubnavigationButton vkSubnavigationButton = new VkSubnavigationButton(bwt0.u(vkSubnavigationBar.getContext()), null, 0, 14, 0);
            VkSubnavigationBar.a<?> aVar3 = new VkSubnavigationBar.a<>(vkSubnavigationButton);
            vkSubnavigationButton.setLabelMaxWidth(iah0.a(250));
            vkSubnavigationButton.setMode(SubnavigationButton.Mode.Secondary);
            aVar3.b(aVar2.b);
            vkSubnavigationButton.setClickListener(new lha(0, this.b, aVar2));
            vkSubnavigationBar.c(aVar3);
        }
        b0o0Var.d = list;
        b0o0Var.a.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: xsna.a0o0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i2, int i3, int i4, int i5) {
                b0o0.this.a();
            }
        });
        a(aVar, list);
    }
}
