package xsna;

import com.vk.dto.newsfeed.entries.Photos;
import com.vk.newsfeed.impl.views.a;
import com.vk.story.viewer.impl.presentation.stories.view.StoriesViewPager;
import java.util.ArrayList;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class flm0 implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ w8i c;

    public /* synthetic */ flm0(w8i w8iVar, int i) {
        this.b = i;
        this.c = w8iVar;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        ArrayList arrayList;
        int i3 = this.b;
        w8i w8iVar = this.c;
        switch (i3) {
            case 0:
                tu1 tu1Var = (tu1) obj;
                StoriesViewPager storiesViewPager = ((com.vk.story.viewer.impl.presentation.stories.b) w8iVar).O;
                for (int i4 = 0; i4 < storiesViewPager.getChildCount(); i4++) {
                    if (storiesViewPager.getChildAt(i4) instanceof qo6) {
                        ((qo6) storiesViewPager.getChildAt(i4)).G0(tu1Var);
                    }
                }
                break;
            default:
                com.vk.newsfeed.impl.views.a aVar = (com.vk.newsfeed.impl.views.a) w8iVar;
                if (i == 113) {
                    Photos photos = aVar.g1;
                    if (photos != null) {
                        tzp0.c.a aVar2 = com.vk.newsfeed.impl.views.a.l1;
                        arrayList = a.c.a(aVar.requireContext(), photos, aVar.h1, aVar.i1);
                    } else {
                        arrayList = null;
                    }
                    b2c0 b2c0Var = aVar.f1;
                    if (b2c0Var != null) {
                        b2c0Var.setItems(arrayList);
                        break;
                    }
                } else {
                    tzp0.c.a aVar3 = com.vk.newsfeed.impl.views.a.l1;
                    break;
                }
                break;
        }
    }
}
