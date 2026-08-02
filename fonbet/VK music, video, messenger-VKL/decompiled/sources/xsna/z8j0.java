package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.m8j0;

/* compiled from: ShareStorySendMessageDelegate.kt */
/* loaded from: classes16.dex */
public final class z8j0 extends p1u0<m8j0.e> {
    public final n8 a;

    /* compiled from: ShareStorySendMessageDelegate.kt */
    public static final class a extends vfz<m8j0.e> {
        @Override // xsna.vfz
        public final /* bridge */ /* synthetic */ void W5(m8j0.e eVar) {
        }
    }

    public z8j0(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.e> b(ViewGroup viewGroup) {
        a aVar = new a(R.layout.item_story_send_message_holder, viewGroup);
        TextView textView = (TextView) aVar.itemView.findViewById(R.id.title);
        bwt0.i0(aVar.itemView, new p3b0(this.a, 1));
        LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.story_send_message, aVar.itemView.getContext());
        layerDrawable.findDrawableByLayerId(R.id.message_arrow_right_outline_28).setTint(aVar.itemView.getContext().getColor(R.color.vk_white));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(layerDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        return aVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.e;
    }
}
