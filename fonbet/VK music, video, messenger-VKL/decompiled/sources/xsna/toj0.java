package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.toggle.features.VideoFeatures;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: SimilarVideosItemDecorationTablet.kt */
/* loaded from: classes3.dex */
public abstract class toj0 extends RecyclerView.n {

    /* compiled from: SimilarVideosItemDecorationTablet.kt */
    public static final class a extends toj0 {
        public final wrl0 b;

        public a(wrl0 wrl0Var) {
            this.b = wrl0Var;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            List list = (List) this.b.invoke();
            if (childAdapterPosition == -1 || childAdapterPosition >= list.size()) {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                return;
            }
            hfz hfzVar = (hfz) list.get(childAdapterPosition);
            boolean z = hfzVar instanceof AboutVideoItem.SimilarVideoRedesign;
            int a = z ? iah0.a(20) : hfzVar instanceof AboutVideoItem.n ? 0 : iah0.a(4);
            rect.right = a;
            rect.left = a;
            if (z) {
                int a2 = iah0.a(7);
                rect.top = a2;
                rect.bottom = a2;
            }
        }
    }

    /* compiled from: SimilarVideosItemDecorationTablet.kt */
    public static final class b extends toj0 {
        public final gzs<List<hfz>> b;
        public final boolean c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(gzs<? extends List<? extends hfz>> gzsVar) {
            this.b = gzsVar;
            VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures.getClass();
            this.c = com.vk.toggle.b.A.a(videoFeatures);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
        @Override // androidx.recyclerview.widget.RecyclerView.n
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int a;
            int a2;
            int i;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            List<hfz> invoke = this.b.invoke();
            int i2 = -1;
            if (childAdapterPosition == -1 || childAdapterPosition >= invoke.size()) {
                super.getItemOffsets(rect, view, recyclerView, a0Var);
                return;
            }
            hfz hfzVar = invoke.get(childAdapterPosition);
            boolean z = hfzVar instanceof AboutVideoItem.SimilarVideoRedesign;
            boolean z2 = this.c;
            int i3 = 0;
            if (!z) {
                if (hfzVar instanceof AboutVideoItem.n) {
                    rect.left = 0;
                    rect.right = 0;
                    return;
                }
                if (z2) {
                    Context context = recyclerView.getContext();
                    HashSet hashSet = iah0.a;
                    if (fnj.d(context)) {
                        a = iah0.a(4);
                        rect.set(a, 0, a, 0);
                        return;
                    }
                }
                a = iah0.a(16);
                rect.set(a, 0, a, 0);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : invoke) {
                if (obj instanceof AboutVideoItem.SimilarVideoRedesign) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (epx.f((AboutVideoItem.SimilarVideoRedesign) it.next(), hfzVar)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            if (z2) {
                Context context2 = recyclerView.getContext();
                HashSet hashSet2 = iah0.a;
                if (fnj.d(context2)) {
                    a2 = iah0.a(20);
                    i = i2 % 2;
                    int a3 = i != 0 ? a2 : iah0.a(9);
                    if (i == 0) {
                        a2 = iah0.a(9);
                    }
                    int a4 = iah0.a(7);
                    rect.set(a3, a4, a2, a4);
                }
            }
            a2 = iah0.a(32);
            i = i2 % 2;
            if (i != 0) {
            }
            if (i == 0) {
            }
            int a42 = iah0.a(7);
            rect.set(a3, a42, a2, a42);
        }
    }
}
