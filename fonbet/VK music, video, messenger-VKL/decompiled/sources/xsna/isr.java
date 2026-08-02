package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: FloorClipBlockDelegate.kt */
/* loaded from: classes7.dex */
public final class isr extends p1u0<AboutVideoItem.e> {
    public final wzs<VideoFile, String, s3q0> a;

    /* compiled from: FloorClipBlockDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.e> {
        public final wzs<VideoFile, String, s3q0> l;
        public final i0d m;
        public AboutVideoItem.e n;

        /* compiled from: FloorClipBlockDelegate.kt */
        /* renamed from: xsna.isr$a$a, reason: collision with other inner class name */
        public static final class C3079a extends RecyclerView.n {
            public C3079a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
                int a = iah0.a(a.this.h6() ? 8 : 6);
                rect.left = a;
                rect.right = a;
                rect.bottom = iah0.a(12);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, wzs<? super VideoFile, ? super String, s3q0> wzsVar) {
            super(bwt0.I(R.layout.video_discovery_clip_block, viewGroup, false));
            this.l = wzsVar;
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.clips_recycler_view);
            int i = 8;
            i0d i0dVar = new i0d(new qcl(this, i));
            this.m = i0dVar;
            this.itemView.getContext();
            b bVar = new b(h6() ? 4 : 2, 1);
            C3079a c3079a = new C3079a();
            recyclerView.setAdapter(i0dVar);
            recyclerView.setHasFixedSize(false);
            recyclerView.setLayoutManager(bVar);
            if (!h6()) {
                Context context = this.itemView.getContext();
                HashSet hashSet = iah0.a;
                i = fnj.d(context) ? 14 : 10;
            }
            int a = iah0.a(i);
            recyclerView.setPadding(a, 0, a, iah0.a(20));
            recyclerView.setClipToPadding(true);
            recyclerView.addItemDecoration(c3079a);
            i0dVar.d = false;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.e eVar) {
            AboutVideoItem.e eVar2 = eVar;
            this.n = eVar2;
            this.m.submitList(eVar2.b);
        }

        public final boolean h6() {
            Context context = this.itemView.getContext();
            HashSet hashSet = iah0.a;
            return fnj.d(context) && iah0.s(this.itemView.getContext());
        }
    }

    /* compiled from: FloorClipBlockDelegate.kt */
    public static final class b extends GridLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollHorizontally() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean canScrollVertically() {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isr(wzs<? super VideoFile, ? super String, s3q0> wzsVar) {
        this.a = wzsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.e> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.e) && epx.f(((AboutVideoItem.e) hfzVar).c, "floor_clips");
    }
}
