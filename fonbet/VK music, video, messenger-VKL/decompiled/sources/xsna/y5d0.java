package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.pfm0;

/* compiled from: PreviewViewHolder.kt */
/* loaded from: classes6.dex */
public final class y5d0 extends vif0<m4d0> {
    public final pfm0.a n;
    public final l7s o;
    public final VKImageView p;
    public final View q;
    public final TextView r;

    public y5d0(View view, pfm0.a aVar, String str) {
        super(view);
        this.n = aVar;
        Context context = view.getContext();
        dhr0.a.getClass();
        l7s l7sVar = new l7s(context, dhr0.u().c);
        this.o = l7sVar;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.iv_preview);
        this.p = vKImageView;
        View findViewById = view.findViewById(R.id.gradient_bg);
        this.q = findViewById;
        this.r = (TextView) view.findViewById(R.id.views_count);
        a aVar2 = new a();
        vKImageView.setPlaceholderColor(dhr0.Y(R.attr.vk_ui_skeleton_from, l7sVar));
        vKImageView.setOnLoadCallback(aVar2);
        ViewGroup.LayoutParams layoutParams = vKImageView.getLayoutParams();
        ConstraintLayout.b bVar = layoutParams instanceof ConstraintLayout.b ? (ConstraintLayout.b) layoutParams : null;
        if (bVar != null) {
            bVar.G = str;
        }
        bwt0.d(this.itemView, b6().getDimension(R.dimen.story_statistics_preview_item_corner_radius), (r4 & 2) != 0, (r4 & 4) != 0);
        bwt0.i0(this.itemView, new qz40(this, 14));
        int Y = dhr0.Y(R.attr.vk_ui_background_tertiary, l7sVar);
        x5d0 x5d0Var = new x5d0(new int[]{n8g.l(Y, 0), n8g.l(Y, 3), n8g.l(Y, 15), n8g.l(Y, 80), n8g.l(Y, 96), n8g.l(Y, 102)}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.13f, 0.3f, 0.7f, 0.84f, 1.0f});
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(x5d0Var);
        findViewById.setBackground(paintDrawable);
    }

    @Override // xsna.vif0
    public final void i6(m4d0 m4d0Var) {
        m4d0 m4d0Var2 = m4d0Var;
        Bitmap bitmap = m4d0Var2.e;
        StoryEntry storyEntry = m4d0Var2.c;
        VKImageView vKImageView = this.p;
        if (bitmap != null) {
            vKImageView.setImageBitmap(bitmap);
            pfm0.a aVar = this.n;
            if (aVar != null) {
                aVar.d(storyEntry.c);
            }
        } else {
            vKImageView.load(storyEntry.Jb(iah0.w(this.o), ImageQuality.FIT, false));
        }
        String d = uqm0.d(m4d0Var2.d);
        TextView textView = this.r;
        textView.setText(d);
        bwt0.p0(textView, vKImageView.isImageLoaded() || m4d0Var2.e != null);
        this.itemView.setAlpha(m4d0Var2.a ? 1.0f : 0.64f);
        q6(m4d0Var2);
    }

    @Override // xsna.vif0
    public final void j6(m4d0 m4d0Var, Object obj) {
        m4d0 m4d0Var2 = m4d0Var;
        boolean z = obj instanceof d4u0;
        TextView textView = this.r;
        if (z) {
            textView.setText(uqm0.d(m4d0Var2.d));
            q6(m4d0Var2);
            return;
        }
        boolean z2 = obj instanceof cyj;
        boolean z3 = true;
        VKImageView vKImageView = this.p;
        if (z2) {
            if (!vKImageView.isImageLoaded() && m4d0Var2.e == null) {
                z3 = false;
            }
            bwt0.p0(textView, z3);
            return;
        }
        if (obj instanceof eei0) {
            q6(m4d0Var2);
            return;
        }
        textView.setText(uqm0.d(m4d0Var2.d));
        if (!vKImageView.isImageLoaded() && m4d0Var2.e == null) {
            z3 = false;
        }
        bwt0.p0(textView, z3);
        this.itemView.setAlpha(m4d0Var2.a ? 1.0f : 0.64f);
        q6(m4d0Var2);
    }

    public final void q6(m4d0 m4d0Var) {
        int i = m4d0Var.d;
        boolean z = m4d0Var.a;
        this.itemView.setContentDescription(z ? a6(R.plurals.story_statistics_selected_story, i, Integer.valueOf(i)) : a6(R.plurals.story_statistics_not_selected_story, i, Integer.valueOf(i)));
        awt0.o(this.itemView, new det(z ? g6(R.string.story_statistics_action_close_story) : g6(R.string.story_statistics_action_select_story), 3));
    }

    /* compiled from: PreviewViewHolder.kt */
    public static final class a implements b780 {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
            y5d0 y5d0Var = y5d0.this;
            pfm0.a aVar = y5d0Var.n;
            if (aVar != null) {
                aVar.d(((m4d0) y5d0Var.m).c.c);
            }
            bwt0.p0(y5d0Var.r, true);
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
        }
    }
}
