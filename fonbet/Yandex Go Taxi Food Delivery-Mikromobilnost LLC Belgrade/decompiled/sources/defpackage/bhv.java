package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.yandex.images.utils.ScaleMode;
import com.yandex.messaging.internal.view.custom.ProgressIndicator;
import com.yandex.messaging.ui.imageviewer.ImageViewerInfo;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class bhv extends lt31 implements of61 {
    public final b890 c;
    public ArrayList d;
    public reu e;
    public final Activity f;
    public final xav g;
    public final x22 h;
    public jhv i;

    public bhv(b890 b890Var, Activity activity, xav xavVar, x22 x22Var) {
        this.c = b890Var;
        y790 y790Var = new y790(this);
        b890Var.b();
        b890Var.g(y790Var);
        this.f = activity;
        this.g = xavVar;
        this.h = x22Var;
    }

    @Override // defpackage.e890
    public final int b() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // defpackage.e890
    public final int c(Object obj) {
        mhv mhvVar = (mhv) ((View) obj).getTag();
        ArrayList arrayList = this.d;
        int indexOf = arrayList != null ? arrayList.indexOf(mhvVar) : -1;
        if (indexOf >= 0) {
            return indexOf;
        }
        return -2;
    }

    @Override // defpackage.lt31
    public final void l(q4g q4gVar, int i) {
        mhv mhvVar = (mhv) n(i);
        ((View) q4gVar.b).setTag(mhvVar);
        mgu mguVar = new mgu(4, q4gVar, mhvVar);
        bhv bhvVar = (bhv) q4gVar.y;
        ImageViewerInfo imageViewerInfo = mhvVar.a;
        if (imageViewerInfo.getThumbWidth() == null || imageViewerInfo.getThumbHeight() == null) {
            mguVar.invoke(null);
        } else {
            yn50 yn50Var = (yn50) bhvVar.g.load(imageViewerInfo.getUrl());
            yn50Var.b.i = imageViewerInfo.getThumbWidth().intValue();
            int intValue = imageViewerInfo.getThumbHeight().intValue();
            xn50 xn50Var = yn50Var.b;
            xn50Var.j = intValue;
            xn50Var.k = ScaleMode.FIT_CENTER;
            yn50Var.b(null, new ahv(mguVar, bhvVar));
        }
        ((ProgressIndicator) q4gVar.w).setOnStateChangeListener(new gau(13, q4gVar));
    }

    @Override // defpackage.lt31
    public final q4g m(ViewPager viewPager) {
        return new q4g(this, LayoutInflater.from(viewPager.getContext()).inflate(olh0.msg_vh_image_viewer_page_layout, (ViewGroup) viewPager, false));
    }

    public final Object n(int i) {
        Object obj;
        this.c.c(i);
        ArrayList arrayList = this.d;
        if (arrayList != null && (obj = arrayList.get(i)) != null) {
            return obj;
        }
        ny61.s();
        return null;
    }
}
