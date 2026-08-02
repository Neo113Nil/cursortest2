package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ImageSize;
import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: FullScreenBannerDelegate.kt */
/* loaded from: classes16.dex */
public final class mvs {
    public final pvs a;
    public final View b;

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ VKImageView b;
        public final /* synthetic */ mvs c;

        public a(VKImageView vKImageView, mvs mvsVar) {
            this.b = vKImageView;
            this.c = mvsVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            VKImageView vKImageView = this.b;
            vKImageView.getHierarchy().o(bt1.a);
            ImageSize Cb = this.c.a.a.f.Cb(vKImageView.getWidth(), true, false);
            vKImageView.s0(Cb != null ? Cb.d.d : null);
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ RecyclerView b;

        public b(RecyclerView recyclerView) {
            this.b = recyclerView;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            ovs ovsVar = new ovs();
            RecyclerView recyclerView = this.b;
            recyclerView.addItemDecoration(ovsVar);
            recyclerView.invalidateItemDecorations();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mvs(ViewGroup viewGroup, lvs lvsVar, pvs pvsVar, View.OnClickListener onClickListener) {
        boolean z;
        VKImageView vKImageView;
        RecyclerView recyclerView;
        this.a = pvsVar;
        View p = bwt0.p(viewGroup, R.id.fsb_close_view, onClickListener, null, 4);
        FullScreenBanner fullScreenBanner = pvsVar.a;
        if (fullScreenBanner.d) {
            Context context = viewGroup.getContext();
            HashSet hashSet = iah0.a;
            if (!fnj.d(context)) {
                z = true;
                bwt0.p0(p, z);
                this.b = p;
                vKImageView = (VKImageView) bwt0.p(viewGroup, R.id.fsb_background_image, null, null, 6);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vKImageView.isLaidOut()) {
                    vKImageView.addOnLayoutChangeListener(new a(vKImageView, this));
                } else {
                    vKImageView.getHierarchy().o(bt1.a);
                    ImageSize Cb = fullScreenBanner.f.Cb(vKImageView.getWidth(), true, false);
                    vKImageView.s0(Cb != null ? Cb.d.d : null);
                }
                recyclerView = (RecyclerView) bwt0.p(viewGroup, R.id.fsb_recycler_view, null, null, 6);
                recyclerView.setClipChildren(true);
                recyclerView.setClipToPadding(true);
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
                recyclerView.setAdapter(lvsVar);
                if (recyclerView.isLaidOut()) {
                    recyclerView.addOnLayoutChangeListener(new b(recyclerView));
                } else {
                    recyclerView.addItemDecoration(new ovs());
                    recyclerView.invalidateItemDecorations();
                }
                awt0.g(recyclerView);
                ArrayList arrayList = new ArrayList(fullScreenBanner.g);
                arrayList.addAll(fullScreenBanner.e);
                lvsVar.setItems(j5g.y0(arrayList));
            }
        }
        z = false;
        bwt0.p0(p, z);
        this.b = p;
        vKImageView = (VKImageView) bwt0.p(viewGroup, R.id.fsb_background_image, null, null, 6);
        WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
        if (vKImageView.isLaidOut()) {
        }
        recyclerView = (RecyclerView) bwt0.p(viewGroup, R.id.fsb_recycler_view, null, null, 6);
        recyclerView.setClipChildren(true);
        recyclerView.setClipToPadding(true);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
        recyclerView.setAdapter(lvsVar);
        if (recyclerView.isLaidOut()) {
        }
        awt0.g(recyclerView);
        ArrayList arrayList2 = new ArrayList(fullScreenBanner.g);
        arrayList2.addAll(fullScreenBanner.e);
        lvsVar.setItems(j5g.y0(arrayList2));
    }
}
