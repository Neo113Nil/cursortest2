package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.widget.MediaStoreItemSmallView;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;

/* compiled from: PhotoEditorLargePreviewHolder.kt */
/* loaded from: classes5.dex */
public final class s6a0 extends vif0<a> {
    public final u6a0 n;
    public final sly o;
    public final MediaStoreItemSmallView p;
    public final View q;
    public final TextView r;
    public final View s;
    public final View t;
    public final hxl u;

    /* compiled from: PhotoEditorLargePreviewHolder.kt */
    public static final class a {
        public final MediaStoreEntry a;
        public final Integer b;

        public a(MediaStoreEntry mediaStoreEntry, Integer num) {
            this.a = mediaStoreEntry;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewInfo(mediaEntry=");
            sb.append(this.a);
            sb.append(", selectionPosition=");
            return uqi.b(sb, this.b, ')');
        }
    }

    public s6a0(View view, q6a0 q6a0Var, sly slyVar) {
        super(view);
        this.n = q6a0Var;
        this.o = slyVar;
        view.setClipToOutline(true);
        bwt0.i0(view, new aj50(this, 6));
        MediaStoreItemSmallView mediaStoreItemSmallView = (MediaStoreItemSmallView) view.findViewById(R.id.picker_photo);
        this.p = mediaStoreItemSmallView;
        View findViewById = view.findViewById(R.id.picker_counter_container);
        this.q = findViewById;
        this.r = (TextView) view.findViewById(R.id.picker_counter_text);
        this.s = view.findViewById(R.id.edit_icon);
        this.t = view.findViewById(R.id.ic_remove_photo);
        this.u = new hxl(this, 24);
        mediaStoreItemSmallView.setRatio(1.0f);
        mediaStoreItemSmallView.setCornerRadius(cn70.c(10));
        bwt0.i0(findViewById, new af50(this, 7));
        this.itemView.addOnAttachStateChangeListener(new r6a0(this));
    }

    public static float s6(float f, float f2, float f3) {
        if (f < f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (f > f3) {
            return 1.0f;
        }
        return (f - f2) / (f3 - f2);
    }

    @Override // xsna.vif0
    public final void i6(a aVar) {
        a aVar2 = aVar;
        MediaStoreEntry mediaStoreEntry = aVar2.a;
        MediaStoreItemSmallView mediaStoreItemSmallView = this.p;
        mediaStoreItemSmallView.W0(mediaStoreEntry);
        mediaStoreItemSmallView.x = null;
        mediaStoreItemSmallView.w = null;
        Integer num = aVar2.b;
        boolean z = num != null;
        TextView textView = this.r;
        bwt0.p0(textView, z);
        if (num != null) {
            textView.setText(String.valueOf(num.intValue() + 1));
        }
    }

    public final void q6(float f) {
        float s6 = s6(f, 0.8f, 1.0f);
        this.s.setAlpha(s6);
        this.q.setAlpha(s6);
        this.t.setAlpha(1.0f - s6(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f));
        int b = an10.b(cn70.a() * ((92 * s6(f, 0.2f, 0.8f)) + 48));
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = b;
        layoutParams.height = b;
        view.setLayoutParams(layoutParams);
    }
}
