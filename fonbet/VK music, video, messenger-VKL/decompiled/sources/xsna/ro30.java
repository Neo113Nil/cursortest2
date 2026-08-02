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

/* compiled from: MsgPartChannelAttachStubAudioHolder.kt */
/* loaded from: classes2.dex */
public final class ro30 extends hr30<AttachAudio, so30> {
    public static final float j = iah0.a(8);
    public View d;
    public VKEnhancedImageView e;
    public TextView f;
    public TextView g;
    public TimeAndStatusView h;
    public gc4 i;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        int i = bubbleColors.j;
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        timeAndStatusView.setTimeTextColor(n8g.l(krv0.l(R.attr.vk_ui_text_primary), 102));
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        TextView textView2 = this.g;
        (textView2 != null ? textView2 : null).setTextColor(i);
    }

    @Override // xsna.hr30
    public final void p(so30 so30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        so30 so30Var2 = so30Var;
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(so30Var2.b);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(so30Var2.c);
        jr30 jr30Var = so30Var2.g;
        TimeAndStatusView timeAndStatusView = this.h;
        if (timeAndStatusView == null) {
            timeAndStatusView = null;
        }
        hr30.l(timeAndStatusView, jr30Var, false);
        gc4 gc4Var = this.i;
        if (gc4Var == null) {
            gc4Var = null;
        }
        View view = this.d;
        gc4Var.a(so30Var2, view != null ? view : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View I = bwt0.I(R.layout.vkim_msg_part_stub_audio, viewGroup, false);
        this.d = I;
        this.i = new gc4(I.getContext());
        View view = this.d;
        if (view == null) {
            view = null;
        }
        this.f = (TextView) view.findViewById(R.id.audio_title);
        this.g = (TextView) view.findViewById(R.id.audio_artist);
        this.h = (TimeAndStatusView) view.findViewById(R.id.time_and_status);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view.findViewById(R.id.audio_image);
        this.e = vKEnhancedImageView;
        vKEnhancedImageView.setClipToOutline(true);
        VKEnhancedImageView vKEnhancedImageView2 = this.e;
        if (vKEnhancedImageView2 == null) {
            vKEnhancedImageView2 = null;
        }
        vKEnhancedImageView2.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        VKEnhancedImageView vKEnhancedImageView3 = this.e;
        if (vKEnhancedImageView3 == null) {
            vKEnhancedImageView3 = null;
        }
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = j;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(-1);
        vKEnhancedImageView3.setBackground(shapeDrawable);
        com.vk.core.view.shimmer.a aVar = new com.vk.core.view.shimmer.a();
        Shimmer.c cVar = (Shimmer.c) ((Shimmer.c) zn.a(true)).i();
        abg0 abg0Var = dhr0.t;
        cVar.k(abg0Var.c(R.attr.vk_ui_skeleton_from));
        cVar.a.d = abg0Var.c(R.attr.vk_ui_skeleton_to);
        aVar.b(((Shimmer.c) cVar.d()).a());
        VKEnhancedImageView vKEnhancedImageView4 = this.e;
        if (vKEnhancedImageView4 == null) {
            vKEnhancedImageView4 = null;
        }
        vKEnhancedImageView4.setImageDrawable(aVar);
        aVar.c();
        View view2 = this.d;
        if (view2 == null) {
            return null;
        }
        return view2;
    }
}
