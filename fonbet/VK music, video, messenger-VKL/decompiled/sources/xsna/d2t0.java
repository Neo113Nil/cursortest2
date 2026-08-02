package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;

/* compiled from: VideoPickerAdapter.kt */
/* loaded from: classes5.dex */
public final class d2t0 extends zoj0<Object, RecyclerView.e0> {
    public final f2t0 e;

    /* compiled from: VideoPickerAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final VKImageView l;
        public final TextView m;
        public final TextView n;
        public VideoAlbum o;
        public final int p;

        public a(f2t0 f2t0Var, View view) {
            super(view);
            this.l = (VKImageView) view.findViewById(R.id.preview);
            this.m = (TextView) view.findViewById(R.id.title);
            this.n = (TextView) view.findViewById(R.id.subtitle_count);
            this.p = e3m.a(R.dimen.video_catalog_small_content_item_width, view.getContext());
            bwt0.i0(view, new o0p0(1, this, f2t0Var));
        }
    }

    /* compiled from: VideoPickerAdapter.kt */
    public static final class b extends RecyclerView.e0 {
        public final VKImageView l;
        public final VideoOverlayView m;
        public final DurationView n;
        public final InteractiveDurationView o;
        public final TextView p;
        public final TextView q;
        public final TextView r;
        public final int s;
        public VideoFile t;

        public b(f2t0 f2t0Var, View view) {
            super(view);
            this.l = (VKImageView) view.findViewById(R.id.preview);
            this.m = (VideoOverlayView) view.findViewById(R.id.overlay_view);
            this.n = (DurationView) view.findViewById(R.id.duration);
            this.o = (InteractiveDurationView) view.findViewById(R.id.interactive_duration);
            this.p = (TextView) view.findViewById(R.id.title);
            this.q = (TextView) view.findViewById(R.id.subtitle_views);
            this.r = (TextView) view.findViewById(R.id.subtitle_date);
            this.s = e3m.a(R.dimen.video_catalog_small_content_item_width, view.getContext());
            bwt0.i0(view, new evh0(8, this, f2t0Var));
        }
    }

    public d2t0(f2t0 f2t0Var) {
        this.e = f2t0Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return !(this.c.c(i) instanceof o2t0) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        boolean z = e0Var instanceof b;
        uuk uukVar = this.c;
        if (!z) {
            if (e0Var instanceof a) {
                a aVar = (a) e0Var;
                VideoAlbum videoAlbum = ((c1s0) uukVar.c(i)).a;
                int i2 = videoAlbum.f;
                aVar.o = videoAlbum;
                VKImageView vKImageView = aVar.l;
                ImageSize Cb = videoAlbum.h.Cb(aVar.p, true, false);
                vKImageView.load(Cb != null ? Cb.d.d : null);
                aVar.m.setText(videoAlbum.d);
                aVar.n.setText(i2 > 0 ? aVar.itemView.getContext().getResources().getQuantityString(R.plurals.video_total_title, i2, Integer.valueOf(i2)) : aVar.itemView.getContext().getResources().getString(R.string.album_no_videos));
                return;
            }
            return;
        }
        b bVar = (b) e0Var;
        VideoFile videoFile = ((o2t0) uukVar.c(i)).a;
        DurationView durationView = bVar.n;
        InteractiveDurationView interactiveDurationView = bVar.o;
        bVar.t = videoFile;
        VKImageView vKImageView2 = bVar.l;
        ImageSize Cb2 = videoFile.getImage().Cb(bVar.s, true, false);
        vKImageView2.load(Cb2 != null ? Cb2.d.d : null);
        bwt0.p0(bVar.m, true ^ videoFile.k0());
        if (videoFile.W9()) {
            interactiveDurationView.setVisibility(0);
            durationView.setVisibility(4);
            interactiveDurationView.setTextDescriptionVisible(false);
            interactiveDurationView.setDurationText(gpt0.m(bVar.itemView.getContext(), videoFile, false, false));
        } else {
            interactiveDurationView.setVisibility(4);
            durationView.setVisibility(0);
            durationView.setText(gpt0.m(bVar.itemView.getContext(), videoFile, false, false));
        }
        bVar.p.setText(videoFile.getTitle());
        TextView textView = bVar.q;
        Context context = bVar.itemView.getContext();
        textView.setText(uqm0.g(videoFile.L8()) ? context.getResources().getString(R.string.views_count_raw, uqm0.f(videoFile.L8())) : context.getResources().getQuantityString(R.plurals.views_count, videoFile.L8(), Integer.valueOf(videoFile.L8())));
        TextView textView2 = bVar.r;
        gpt0 gpt0Var = gpt0.a;
        textView2.setText(gpt0.k(bVar.itemView.getContext(), videoFile));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        f2t0 f2t0Var = this.e;
        if (i == 0) {
            return new b(f2t0Var, tf3.b(viewGroup, R.layout.holder_video_picker, viewGroup, false));
        }
        if (i == 1) {
            return new a(f2t0Var, tf3.b(viewGroup, R.layout.holder_video_album_picker, viewGroup, false));
        }
        throw new IllegalStateException(lhg.a(i, "Unsupported view type: "));
    }
}
