package one.video.controls.views.seek.extend;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import one.video.controls.views.preview.VideoPreview;
import one.video.controls.views.preview.VideoSeekPreviewImage;
import xsna.akw;
import xsna.epx;
import xsna.odj;
import xsna.ozl;
import xsna.shy;
import xsna.zwo0;

/* compiled from: FramesAdapter.kt */
@ozl
/* loaded from: classes8.dex */
public final class a extends RecyclerView.Adapter<b> {
    public Object c;
    public zwo0 d;
    public Integer e;
    public akw f;

    /* compiled from: FramesAdapter.kt */
    /* renamed from: one.video.controls.views.seek.extend.a$a, reason: collision with other inner class name */
    public static final class C2178a {
        public final int a;
        public final int b;
        public final zwo0 c;

        public C2178a(int i, int i2, zwo0 zwo0Var) {
            this.a = i;
            this.b = i2;
            this.c = zwo0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2178a)) {
                return false;
            }
            C2178a c2178a = (C2178a) obj;
            return this.a == c2178a.a && this.b == c2178a.b && epx.f(this.c, c2178a.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder a = odj.a(this.a, this.b, "Item(positionS=", ", durationS=", ", timelineThumbs=");
            a.append(this.c);
            a.append(")");
            return a.toString();
        }
    }

    /* compiled from: FramesAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final PreviewFrameLayout l;

        public b(PreviewFrameLayout previewFrameLayout) {
            super(previewFrameLayout);
            this.l = previewFrameLayout;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(b bVar, int i) {
        C2178a c2178a = (C2178a) this.c.get(i);
        VideoPreview videoPreview = bVar.l.b;
        zwo0 timelineThumbs = videoPreview.getTimelineThumbs();
        zwo0 zwo0Var = c2178a.c;
        if (!epx.f(timelineThumbs, zwo0Var)) {
            videoPreview.setTimelineThumbs(zwo0Var);
        }
        long j = c2178a.a;
        long j2 = c2178a.b;
        VideoSeekPreviewImage videoSeekPreviewImage = videoPreview.t;
        videoSeekPreviewImage.g = j;
        videoSeekPreviewImage.h = j2;
        videoSeekPreviewImage.U();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
        PreviewFrameLayout previewFrameLayout = new PreviewFrameLayout(viewGroup.getContext(), null, 0, 14, 0);
        akw akwVar = this.f;
        if (akwVar != null) {
            previewFrameLayout.setImageLoader(akwVar);
        }
        return new b(previewFrameLayout);
    }
}
