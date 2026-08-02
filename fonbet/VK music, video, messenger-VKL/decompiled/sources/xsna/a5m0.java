package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.attachpicker.widget.AspectRatioLinearLayout;
import com.vkontakte.android.R;
import xsna.u0x;

/* compiled from: StoryInnerActionItemHolder.kt */
/* loaded from: classes15.dex */
public final class a5m0 extends u0x {
    public final jba0 m;
    public final ImageView n;
    public final TextView o;

    public a5m0(ViewGroup viewGroup, jba0 jba0Var, u0x.a aVar) {
        super(tf3.b(viewGroup, R.layout.story_picker_inner_action_item, viewGroup, false), aVar);
        this.m = jba0Var;
        this.n = (ImageView) this.itemView.findViewById(R.id.iv_action_image);
        this.o = (TextView) this.itemView.findViewById(R.id.tv_action_text);
        View view = this.itemView;
        AspectRatioLinearLayout aspectRatioLinearLayout = view instanceof AspectRatioLinearLayout ? (AspectRatioLinearLayout) view : null;
        if (aspectRatioLinearLayout != null) {
            aspectRatioLinearLayout.setMaxWidth(iah0.z(view.getContext()));
            aspectRatioLinearLayout.setAspectRatio(1.3186814f);
        }
        bwt0.h(this.itemView, new com.vk.movika.sdk.base.logic.processor.actions.e(19, this, aVar));
    }

    @Override // xsna.u0x
    public final void V5(com.vk.attachpicker.adapter.a aVar) {
        aVar.getClass();
        ImageView imageView = this.n;
        imageView.setImageResource(R.drawable.vk_icon_camera_outline_48);
        TextView textView = this.o;
        textView.setText(R.string.picker_inner_action_story_camera);
        u0x.a aVar2 = this.l;
        if (((Boolean) aVar2.a.invoke()).booleanValue() || ((Number) aVar2.c.invoke()).intValue() < 1) {
            imageView.setImageResource(R.drawable.vk_icon_camera_outline_48);
            textView.setText(R.string.picker_inner_action_story_camera);
            imageView.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            bwt0.i0(this.itemView, new qt5(29, this, aVar));
            return;
        }
        imageView.setImageResource(R.drawable.vk_icon_camera_outline_48);
        textView.setText(R.string.picker_inner_action_story_camera);
        imageView.setAlpha(0.4f);
        textView.setAlpha(0.4f);
        this.itemView.setOnClickListener(null);
    }
}
