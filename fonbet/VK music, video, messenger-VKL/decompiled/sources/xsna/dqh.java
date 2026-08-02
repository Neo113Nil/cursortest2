package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.bridges.ImageViewer;
import com.vk.core.view.components.spinner.VkScreenSpinner;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.data.VKList;
import com.vk.dto.photo.Photo;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xsna.eqh;
import xsna.eqh.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dqh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dqh(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ImageViewer.c<Photo> g;
        ImageSize Fb;
        String str;
        switch (this.b) {
            case 0:
                Context context = (Context) this.d;
                eqh eqhVar = (eqh) this.e;
                VKList vKList = (VKList) obj;
                if (vKList.isEmpty()) {
                    cvk.w(context.getString(R.string.no_photos), false);
                    return s3q0.a;
                }
                Activity h = e3m.h(context);
                if (h == null) {
                    return s3q0.a;
                }
                int i = this.c;
                if (i < 0) {
                    i = 0;
                }
                int i2 = iah0.f().widthPixels;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<T> it = vKList.iterator();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i5 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        Photo photo = (Photo) next;
                        if (linkedHashSet.add(photo.Cb()) && (Fb = photo.Fb(i2, false)) != null && (str = Fb.d.d) != null && (!drm0.N(str))) {
                            if (i4 != i) {
                                i4++;
                            }
                        }
                        i3 = i5;
                    } else {
                        int h2 = e43.h(vKList);
                        if (h2 < 0) {
                            h2 = 0;
                        }
                        i3 = swe0.g(i, 0, h2);
                    }
                }
                eqh.a aVar = eqhVar.new a(vKList.size(), vKList.i());
                g = eqhVar.c.g(i3, vKList, h, aVar, o25.a().c());
                aVar.d = g;
                return s3q0.a;
            default:
                Context context2 = (Context) obj;
                VkScreenSpinner m = qkk0.m((qkk0) this.d, context2, VkSpinnerContent.SpinnerState.Loading, VkScreenSpinner.SpinnerMode.Shadow, (String) this.e, 40);
                m.setColor(context2.getColor(this.c));
                return m;
        }
    }
}
