package xsna;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;

/* compiled from: ClipItemAdapter.kt */
/* loaded from: classes7.dex */
public final class i0d extends androidx.recyclerview.widget.x<VideoFile, a> {
    public static final b e = new b();
    public final izs<VideoFile, s3q0> c;
    public boolean d;

    /* compiled from: ClipItemAdapter.kt */
    public static final class a extends RecyclerView.e0 implements qan {
        public final izs<VideoFile, s3q0> l;
        public final VKImageView m;
        public final VkAvatar n;
        public final TextView o;
        public final TextView p;
        public final TextView q;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ViewGroup viewGroup, izs<? super VideoFile, s3q0> izsVar) {
            super(bwt0.I(R.layout.video_discovery_clip_item, viewGroup, false));
            this.l = izsVar;
            this.m = (VKImageView) this.itemView.findViewById(R.id.clip_preview);
            this.n = (VkAvatar) this.itemView.findViewById(R.id.clip_owner_avatar);
            this.o = (TextView) this.itemView.findViewById(R.id.clip_owner_title);
            this.p = (TextView) this.itemView.findViewById(R.id.clip_description);
            this.q = (TextView) this.itemView.findViewById(R.id.clip_views);
            this.itemView.setClipToOutline(true);
            this.itemView.setOnClickListener(new z01(this, 3));
        }

        @Override // xsna.qan
        public final VideoFile f5() {
            Object tag = this.itemView.getTag();
            if (tag instanceof VideoFile) {
                return (VideoFile) tag;
            }
            return null;
        }
    }

    /* compiled from: ClipItemAdapter.kt */
    public static final class b extends m.e<VideoFile> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(VideoFile videoFile, VideoFile videoFile2) {
            VideoFile videoFile3 = videoFile;
            VideoFile videoFile4 = videoFile2;
            return epx.f(videoFile3.r1(), videoFile4.r1()) && epx.f(videoFile3.getTitle(), videoFile4.getTitle());
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(VideoFile videoFile, VideoFile videoFile2) {
            return epx.f(videoFile.r1(), videoFile2.r1());
        }
    }

    public i0d(izs izsVar) {
        super(e);
        this.c = izsVar;
        this.d = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x006d  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        int a2;
        String str;
        TextView textView;
        VkAvatar vkAvatar;
        String P;
        boolean z;
        boolean z2;
        a aVar = (a) e0Var;
        if (this.d) {
            int a3 = iah0.a(158);
            ViewGroup.LayoutParams layoutParams = aVar.itemView.getLayoutParams();
            if (layoutParams == null || layoutParams.width != a3) {
                View view = aVar.itemView;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = a3;
                } else {
                    layoutParams2 = null;
                }
                view.setLayoutParams(layoutParams2);
            }
        }
        VideoFile item = getItem(i);
        aVar.itemView.setTag(item);
        VKImageView vKImageView = aVar.m;
        ViewGroup.LayoutParams layoutParams3 = aVar.itemView.getLayoutParams();
        if (layoutParams3 != null) {
            int i2 = layoutParams3.width;
            Integer valueOf = Integer.valueOf(i2);
            if (i2 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                a2 = valueOf.intValue();
                ImageSize Cb = item.getImage().Cb(a2, true, false);
                str = Cb == null ? Cb.d.d : null;
                if (str == null) {
                    vKImageView.s0(str);
                } else {
                    vKImageView.clear();
                }
                textView = aVar.o;
                vkAvatar = aVar.n;
                P = item.P();
                if (P != null || drm0.N(P)) {
                    vkAvatar.setVisibility(8);
                    textView.setVisibility(8);
                } else {
                    String M0 = item.M0();
                    if (M0 != null) {
                        vkAvatar.setContent(new c.d(M0, null));
                        vkAvatar.setVisibility(0);
                    } else {
                        vkAvatar.setVisibility(8);
                    }
                    textView.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) P);
                    if (item.Y().b) {
                        spannableStringBuilder.append((CharSequence) " ");
                        Drawable a4 = m33.a(R.drawable.vk_icon_verified_16, e43.a);
                        a4.setBounds(0, 0, a4.getIntrinsicWidth(), a4.getIntrinsicHeight());
                        a4.setTint(e43.a.getColor(R.color.vk_white));
                        aVar.itemView.getContext();
                        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                        a4.setBounds(0, 0, a4.getIntrinsicWidth(), a4.getIntrinsicHeight());
                        newSpannable.setSpan(new tzx0(a4, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) newSpannable);
                    }
                    textView.setText(spannableStringBuilder);
                }
                TextView textView2 = aVar.p;
                String j1 = item.j1();
                z = j1 != null || drm0.N(j1);
                textView2.setVisibility(z ? 0 : 8);
                if (!z) {
                    textView2.setText(j1);
                }
                TextView textView3 = aVar.q;
                z2 = item.L8() > 0;
                textView3.setVisibility(z2 ? 0 : 8);
                if (z2) {
                    return;
                }
                DecimalFormat decimalFormat = z8s.a;
                textView3.setText(z8s.e(item.L8(), aVar.itemView.getContext()));
                return;
            }
        }
        a2 = iah0.a(158);
        ImageSize Cb2 = item.getImage().Cb(a2, true, false);
        if (Cb2 == null) {
        }
        if (str == null) {
        }
        textView = aVar.o;
        vkAvatar = aVar.n;
        P = item.P();
        if (P != null) {
        }
        vkAvatar.setVisibility(8);
        textView.setVisibility(8);
        TextView textView22 = aVar.p;
        String j12 = item.j1();
        if (j12 != null) {
        }
        textView22.setVisibility(z ? 0 : 8);
        if (!z) {
        }
        TextView textView32 = aVar.q;
        if (item.L8() > 0) {
        }
        textView32.setVisibility(z2 ? 0 : 8);
        if (z2) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, this.c);
    }
}
