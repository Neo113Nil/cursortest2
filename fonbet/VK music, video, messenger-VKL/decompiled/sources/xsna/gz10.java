package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vkontakte.android.R;

/* compiled from: MediaStoreItemSmallHolder.kt */
/* loaded from: classes15.dex */
public class gz10 extends RecyclerView.e0 implements otx0 {
    public final Context l;
    public final dba0 m;
    public final a n;
    public final MediaStoreItemSmallView o;
    public final View p;
    public final View q;
    public final TextView r;
    public final gk s;
    public MediaStoreEntry t;
    public final StringBuilder u;

    /* compiled from: MediaStoreItemSmallHolder.kt */
    public static final class a {
        public final gzs<Boolean> a;
        public final gzs<ImageScreenSize> b;
        public final gzs<Integer> c;

        public a(gzs gzsVar, yce yceVar, gzs gzsVar2) {
            this.a = gzsVar;
            this.b = yceVar;
            this.c = gzsVar2;
        }
    }

    public gz10(Context context, float f, dba0 dba0Var, a aVar, int i) {
        this(R.layout.story_picker_layout_image_item, context, 0, (i & 8) != 0 ? 1.0f : f, (i & 16) != 0 ? new fco0() : dba0Var, aVar);
    }

    @Override // xsna.jsx0
    public final boolean H4() {
        return true;
    }

    public void V5(boolean z) {
        bwt0.p0(this.p, z);
    }

    public final void W5(MediaStoreEntry mediaStoreEntry) {
        ImageScreenSize imageScreenSize;
        this.t = mediaStoreEntry;
        StringBuilder sb = this.u;
        sb.setLength(0);
        int i = mediaStoreEntry instanceof MediaStoreVideoEntry ? R.string.accessibility_video : R.string.accessibility_photo;
        Context context = this.l;
        sb.append(context.getString(i));
        sb.append(", ");
        sb.append(context.getString(R.string.accessibility_file));
        sb.append(" ");
        MediaStoreEntry mediaStoreEntry2 = this.t;
        if (mediaStoreEntry2 == null) {
            mediaStoreEntry2 = null;
        }
        sb.append(brm0.y(mediaStoreEntry2.f().toString(), "file:///storage/emulated/0/", ""));
        MediaStoreEntry mediaStoreEntry3 = this.t;
        if (mediaStoreEntry3 == null) {
            mediaStoreEntry3 = null;
        }
        long e = mediaStoreEntry3.e();
        gk gkVar = this.s;
        if (e != 0) {
            sb.append(", ");
            MediaStoreEntry mediaStoreEntry4 = this.t;
            sb.append(context.getString(R.string.accessibility_file_created, gkVar.a((mediaStoreEntry4 != null ? mediaStoreEntry4 : null).e())));
        } else {
            MediaStoreEntry mediaStoreEntry5 = this.t;
            if (mediaStoreEntry5 == null) {
                mediaStoreEntry5 = null;
            }
            if (mediaStoreEntry5.d() != 0) {
                MediaStoreEntry mediaStoreEntry6 = this.t;
                if (mediaStoreEntry6 == null) {
                    mediaStoreEntry6 = null;
                }
                if (mediaStoreEntry6.d() > 31556926000L) {
                    sb.append(", ");
                    MediaStoreEntry mediaStoreEntry7 = this.t;
                    sb.append(context.getString(R.string.accessibility_file_modified, gkVar.a((mediaStoreEntry7 != null ? mediaStoreEntry7 : null).d())));
                }
            }
        }
        String sb2 = sb.toString();
        MediaStoreItemSmallView mediaStoreItemSmallView = this.o;
        mediaStoreItemSmallView.setContentDescription(sb2);
        gzs<ImageScreenSize> gzsVar = this.n.b;
        if (gzsVar == null || (imageScreenSize = gzsVar.invoke()) == null) {
            imageScreenSize = ImageScreenSize.MID;
        }
        mediaStoreItemSmallView.U0(mediaStoreEntry, imageScreenSize);
        mediaStoreItemSmallView.setTag(R.id.selector_tag, mediaStoreEntry instanceof MediaStoreVideoEntry ? "video" : "photo");
    }

    public Rect X1(Rect rect) {
        this.q.getGlobalVisibleRect(rect);
        return rect;
    }

    public final void a6(MediaStoreEntry mediaStoreEntry, int i, boolean z) {
        this.t = mediaStoreEntry;
        boolean z2 = i >= 0;
        ViewPropertyAnimator a2 = this.m.a(this.o, z2, z);
        if (a2 != null) {
            a2.start();
        }
        V5(z2);
        long j = z ? 100L : 0L;
        View view = this.q;
        xo2.d(28, j, view);
        bwt0.p0(view, !this.n.a.invoke().booleanValue());
        view.setTag(R.id.selector_tag, mediaStoreEntry instanceof MediaStoreVideoEntry ? "video" : "photo");
        boolean z3 = i >= 0;
        TextView textView = this.r;
        bwt0.p0(textView, z3);
        textView.setText(String.valueOf(i + 1));
    }

    public gz10(int i, Context context, int i2, float f, dba0 dba0Var, a aVar) {
        super(LayoutInflater.from(context).inflate(i, (ViewGroup) null, false));
        this.l = context;
        this.m = dba0Var;
        this.n = aVar;
        MediaStoreItemSmallView mediaStoreItemSmallView = (MediaStoreItemSmallView) this.itemView.findViewById(R.id.picker_photo);
        this.o = mediaStoreItemSmallView;
        this.p = this.itemView.findViewById(R.id.picker_background_container);
        this.q = this.itemView.findViewById(R.id.picker_counter_container);
        TextView textView = (TextView) this.itemView.findViewById(R.id.picker_counter_text);
        this.r = textView;
        this.s = new gk(context);
        this.u = new StringBuilder();
        mediaStoreItemSmallView.setRatio(f);
        mediaStoreItemSmallView.setCornerRadius(i2);
        textView.setBackground(krv0.e(R.drawable.picker_bg_accent_circle, context));
    }
}
