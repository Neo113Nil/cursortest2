package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import java.util.List;

/* compiled from: VideoDiscoveryTabletRecommendationsItemDecoration.kt */
/* loaded from: classes3.dex */
public final class ahs0 extends RecyclerView.n {
    public final jus0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoDiscoveryTabletRecommendationsItemDecoration.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a SimilarVideo;
        private final int bottomSpacingDp;
        private final int leftSpacingDp;
        private final int rightSpacingDp;
        private final int topSpacingDp;

        /* compiled from: VideoDiscoveryTabletRecommendationsItemDecoration.kt */
        /* renamed from: xsna.ahs0$a$a, reason: collision with other inner class name */
        public static final class C2543a extends a {
            @Override // xsna.ahs0.a
            public final boolean i(hfz hfzVar) {
                return (hfzVar instanceof AboutVideoItem.SimilarVideoRedesign) || hfzVar.equals(AboutVideoItem.x.b);
            }
        }

        static {
            C2543a c2543a = new C2543a(0);
            SimilarVideo = c2543a;
            a[] aVarArr = {c2543a};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public a(int i) {
            this.leftSpacingDp = 20;
            this.topSpacingDp = -1;
            this.rightSpacingDp = 20;
            this.bottomSpacingDp = 7;
        }

        public static zrp<a> h() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final void a(Rect rect) {
            int i = this.leftSpacingDp;
            if (i > -1) {
                rect.left = iah0.a(i);
            }
            int i2 = this.topSpacingDp;
            if (i2 > -1) {
                rect.top = iah0.a(i2);
            }
            int i3 = this.rightSpacingDp;
            if (i3 > -1) {
                rect.right = iah0.a(i3);
            }
            int i4 = this.bottomSpacingDp;
            if (i4 > -1) {
                rect.bottom = iah0.a(i4);
            }
        }

        public abstract boolean i(hfz hfzVar);
    }

    public ahs0(jus0 jus0Var) {
        this.b = jus0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        List list = (List) this.b.invoke();
        if (childAdapterPosition == -1 || childAdapterPosition >= list.size()) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            return;
        }
        for (a aVar : a.h()) {
            if (aVar.i((hfz) list.get(childAdapterPosition))) {
                aVar.a(rect);
            }
        }
    }
}
