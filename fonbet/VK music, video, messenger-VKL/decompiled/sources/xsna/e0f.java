package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.common.recycler.holders.videos.clips.ClipsHolderViewImpl;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.LazyThreadSafetyMode;
import xsna.tps0;
import xsna.xjd;

/* compiled from: ClipsRecomBlockItemsHolderAdapter.kt */
/* loaded from: classes4.dex */
public final class e0f extends pfe {
    public String e;
    public String f;
    public final ClipsHolderViewImpl g;
    public final tps0.a h;

    /* compiled from: ClipsRecomBlockItemsHolderAdapter.kt */
    public static final class a extends yjd {
        public final Object s0;
        public final Object t0;

        public a(ViewGroup viewGroup, tps0.a aVar, ClipsHolderViewImpl clipsHolderViewImpl) {
            super(viewGroup, aVar, new sps0(null, null, false, 255), clipsHolderViewImpl, false, false, false);
            defpackage.f fVar = new defpackage.f(this, 19);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            this.s0 = msy.a(lazyThreadSafetyMode, fVar);
            this.t0 = msy.a(lazyThreadSafetyMode, new defpackage.g(this, 29));
        }

        public static void J7(ImageView imageView, VideoFile videoFile) {
            if (videoFile.O9()) {
                omw.a(imageView, R.color.vk_red_nice);
                imageView.setImageResource(R.drawable.vk_icon_like_24);
            } else {
                omw.a(imageView, R.color.vk_white);
                imageView.setImageResource(R.drawable.vk_icon_like_outline_24);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.eq6
        public final void b7(Attachment attachment) {
            VideoAttachment videoAttachment = (VideoAttachment) attachment;
            super.b7(videoAttachment);
            ?? r0 = this.s0;
            ((ImageView) r0.getValue()).setVisibility(0);
            J7((ImageView) r0.getValue(), videoAttachment.k);
            bwt0.i0((ImageView) r0.getValue(), new cq3(6, this, videoAttachment));
            String P = videoAttachment.k.P();
            if (P != null) {
                ((View) this.t0.getValue()).setContentDescription(x6(R.string.accessibility_clip_author, P));
            }
        }

        @Override // xsna.yjd, com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
        public final com.vk.libvideo.autoplay.a k7() {
            return com.vk.libvideo.autoplay.a.a(super.k7(), null, null, null, null, null, null, 523263);
        }
    }

    public e0f(ListDataSet listDataSet, ClipsHolderViewImpl clipsHolderViewImpl, int i) {
        super(listDataSet);
        this.e = null;
        this.f = null;
        this.g = clipsHolderViewImpl;
        this.h = new tps0.a(-2, -1, Float.valueOf(0.5625f), 1, i, null, 480);
        setHasStableIds(true);
    }

    @Override // xsna.pfe
    public final String K0() {
        return this.e;
    }

    @Override // xsna.pfe
    public final String L0() {
        return this.f;
    }

    @Override // xsna.pfe
    public final void N0(String str) {
        this.e = str;
    }

    @Override // xsna.pfe
    public final void O0(String str) {
        this.f = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        if (((xjd) this.c.c(i)) == null) {
            return 0L;
        }
        return r3.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        xjd xjdVar = (xjd) this.c.c(i);
        if ((e0Var instanceof yjd) && (xjdVar instanceof xjd.a)) {
            yjd yjdVar = (yjd) e0Var;
            String str = this.e;
            yjdVar.getClass();
            VideoAttachment videoAttachment = new VideoAttachment(((xjd.a) xjdVar).a);
            videoAttachment.Lb(str, null, null);
            yjdVar.b7(videoAttachment);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.h, this.g);
    }
}
