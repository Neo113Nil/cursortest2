package xsna;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vk.imageloader.ImageScreenSize;
import java.util.List;

/* compiled from: PhotoGalleryPageVH.kt */
/* loaded from: classes4.dex */
public final class j9a0 {
    public final f5t a;
    public final ImageScreenSize b;
    public final q010 c;
    public final ej0 d;
    public final GridLayoutManager e;
    public final uut0 f;
    public k5t g = new k5t(0);
    public RecyclerView h;
    public ProgressWheel i;
    public TextView j;
    public i9a0 k;
    public uut0 l;

    public j9a0(Context context, f5t f5tVar, int i, ImageScreenSize imageScreenSize, rei0 rei0Var, q010 q010Var, int i2, boolean z, izs izsVar) {
        this.a = f5tVar;
        this.b = imageScreenSize;
        this.c = q010Var;
        ej0 ej0Var = new ej0(context, rei0Var, imageScreenSize, izsVar);
        this.d = ej0Var;
        ej0Var.f = z;
        ej0Var.notifyDataSetChanged();
        this.e = new GridLayoutManager(1);
        this.f = new uut0(this, rei0Var, imageScreenSize.h(), i2, f5tVar);
    }

    public final void a(k5t k5tVar) {
        if (k5tVar.c().c == 0) {
            TextView textView = this.j;
            if (textView == null) {
                textView = null;
            }
            textView.setVisibility(0);
        } else {
            TextView textView2 = this.j;
            if (textView2 == null) {
                textView2 = null;
            }
            f4m.j(textView2);
        }
        this.g = k5tVar;
        List<q4t> list = k5tVar.c().a;
        ej0 ej0Var = this.d;
        ej0Var.g = list;
        ej0Var.notifyDataSetChanged();
        md90 c = k5tVar.c();
        ej0Var.h = !(c.b >= c.c);
        ej0Var.notifyDataSetChanged();
        RecyclerView recyclerView = this.h;
        if (recyclerView == null) {
            recyclerView = null;
        }
        boolean z = recyclerView.getVisibility() != 0;
        ProgressWheel progressWheel = this.i;
        if (progressWheel == null) {
            progressWheel = null;
        }
        progressWheel.setVisibility(4);
        RecyclerView recyclerView2 = this.h;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        if (z) {
            RecyclerView recyclerView3 = this.h;
            if (recyclerView3 == null) {
                recyclerView3 = null;
            }
            recyclerView3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            RecyclerView recyclerView4 = this.h;
            (recyclerView4 != null ? recyclerView4 : null).animate().alpha(1.0f).setDuration(200L).start();
        }
    }
}
