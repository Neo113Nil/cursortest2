package xsna;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;

/* compiled from: CarouselClipBlockDelegate.kt */
/* loaded from: classes7.dex */
public final class ku9 extends p1u0<AboutVideoItem.e> {
    public final wzs<VideoFile, String, s3q0> a;

    /* compiled from: CarouselClipBlockDelegate.kt */
    public static final class a extends vfz<AboutVideoItem.e> {
        public final wzs<VideoFile, String, s3q0> l;
        public final i0d m;
        public AboutVideoItem.e n;

        /* compiled from: CarouselClipBlockDelegate.kt */
        /* renamed from: xsna.ku9$a$a, reason: collision with other inner class name */
        public static final class C3206a extends RecyclerView.n {
            @Override // androidx.recyclerview.widget.RecyclerView.n
            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
                if (recyclerView.getChildAdapterPosition(view) < (recyclerView.getAdapter() != null ? r3.getItemCount() : 0) - 1) {
                    rect.right = iah0.a(8);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, wzs<? super VideoFile, ? super String, s3q0> wzsVar) {
            super(bwt0.I(R.layout.video_discovery_clip_block, viewGroup, false));
            this.l = wzsVar;
            RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.clips_recycler_view);
            i0d i0dVar = new i0d(new pz(this, 11));
            this.m = i0dVar;
            this.itemView.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            C3206a c3206a = new C3206a();
            recyclerView.setAdapter(i0dVar);
            recyclerView.setHasFixedSize(false);
            recyclerView.setLayoutManager(linearLayoutManager);
            int a = iah0.a(16);
            recyclerView.setPadding(a, 0, a, iah0.a(20));
            recyclerView.setClipToPadding(false);
            recyclerView.addItemDecoration(c3206a);
            i0dVar.d = true;
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.e eVar) {
            AboutVideoItem.e eVar2 = eVar;
            this.n = eVar2;
            this.m.submitList(eVar2.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ku9(wzs<? super VideoFile, ? super String, s3q0> wzsVar) {
        this.a = wzsVar;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.e> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.e) && epx.f(((AboutVideoItem.e) hfzVar).c, "carousel_clips");
    }
}
