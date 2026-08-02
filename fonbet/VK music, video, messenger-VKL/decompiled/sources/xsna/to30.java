package xsna;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.dto.attaches.AttachAudio;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vkontakte.android.R;

/* compiled from: MsgPartChannelAttachStubCompactAudioHolder.kt */
/* loaded from: classes2.dex */
public final class to30 extends hr30<AttachAudio, so30> {
    public static final float h = iah0.a(10);
    public VKEnhancedImageView d;
    public TextView e;
    public TextView f;
    public TimeAndStatusView g;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.j;
        TimeAndStatusView timeAndStatusView = this.g;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(bubbleColors.h);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        TextView textView2 = this.f;
        (textView2 != null ? textView2 : null).setTextColor(i);
    }

    @Override // xsna.hr30
    public final void p(so30 so30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        so30 so30Var2 = so30Var;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(so30Var2.b);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(so30Var2.c);
        jr30 jr30Var = so30Var2.g;
        TimeAndStatusView timeAndStatusView = this.g;
        hr30.l(timeAndStatusView != null ? timeAndStatusView : null, jr30Var, false);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View I = bwt0.I(R.layout.vkim_msg_part_stub_compact_audio, viewGroup, false);
        this.e = (TextView) I.findViewById(R.id.track_name);
        this.f = (TextView) I.findViewById(R.id.track_artist);
        this.g = (TimeAndStatusView) I.findViewById(R.id.time_and_status);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) I.findViewById(R.id.audio_image);
        this.d = vKEnhancedImageView;
        vKEnhancedImageView.setClipToOutline(true);
        VKEnhancedImageView vKEnhancedImageView2 = this.d;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        VKEnhancedImageView vKEnhancedImageView3 = this.d;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = h;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(-1);
        vKEnhancedImageView3.setBackground(shapeDrawable);
        com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        aVar.b(((Shimmer.c) ((Shimmer.c) cVar.j()).d()).a());
        VKEnhancedImageView vKEnhancedImageView4 = this.d;
        (vKEnhancedImageView4 != null ? vKEnhancedImageView4 : null).setImageDrawable(aVar);
        aVar.c();
        return I;
    }
}
