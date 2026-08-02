package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.vkontakte.android.R;
import xsna.m8j0;
import xsna.p8j0;
import xsna.x7j0;

/* compiled from: ShareStoryOnlineBookingSwitchDelegate.kt */
/* loaded from: classes16.dex */
public final class p8j0 extends p1u0<m8j0.g> {
    public final n8 a;

    /* compiled from: ShareStoryOnlineBookingSwitchDelegate.kt */
    public static final class a extends vfz<m8j0.g> {
        public final izs<x7j0, s3q0> l;
        public final TextView m;
        public final SwitchCompat n;

        public a(ViewGroup viewGroup, n8 n8Var) {
            super(R.layout.layout_story_share_switch, viewGroup);
            this.l = n8Var;
            this.m = (TextView) this.itemView.findViewById(R.id.share_switch_title);
            SwitchCompat switchCompat = (SwitchCompat) this.itemView.findViewById(R.id.share_switch_enabled);
            this.n = switchCompat;
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.o8j0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    p8j0.a.this.l.invoke(new x7j0.h(z));
                }
            });
        }

        @Override // xsna.vfz
        public final void W5(m8j0.g gVar) {
            m8j0.g gVar2 = gVar;
            CharSequence text = b6().getText(gVar2.b);
            TextView textView = this.m;
            textView.setText(text);
            LayerDrawable layerDrawable = (LayerDrawable) m33.a(R.drawable.story_online_booking, this.itemView.getContext());
            layerDrawable.findDrawableByLayerId(R.id.message_arrow_right_outline_28).setTint(e3m.f(R.attr.vk_ui_icon_accent_themed, this.itemView.getContext()));
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(layerDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            boolean z = gVar2.d;
            SwitchCompat switchCompat = this.n;
            if (z != switchCompat.isChecked()) {
                switchCompat.setChecked(z);
            }
        }
    }

    public p8j0(n8 n8Var) {
        this.a = n8Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends m8j0.g> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof m8j0.g;
    }
}
