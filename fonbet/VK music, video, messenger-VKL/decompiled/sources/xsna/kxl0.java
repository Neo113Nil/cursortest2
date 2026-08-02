package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StoryArchiveHolder.kt */
/* loaded from: classes6.dex */
public final class kxl0 extends hf6<lxl0> {
    public final exl0 m;
    public final wzs<StoryEntry, Boolean, s3q0> n;
    public final xsq o;
    public final VKImageView p;
    public final View q;
    public final TextView r;
    public final TextView s;
    public final MaterialCheckBox t;
    public boolean u;

    public kxl0() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kxl0(View view, exl0 exl0Var, com.vk.movika.tools.controls.seekbar.p pVar) {
        super(view);
        xsq xsqVar = new xsq(28);
        this.m = exl0Var;
        this.n = pVar;
        this.o = xsqVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.p = vKImageView;
        this.q = this.itemView.findViewById(R.id.date_background);
        this.r = (TextView) this.itemView.findViewById(R.id.day_of_month);
        this.s = (TextView) this.itemView.findViewById(R.id.month);
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.itemView.findViewById(R.id.check);
        this.t = materialCheckBox;
        ConstraintLayout.b bVar = (ConstraintLayout.b) vKImageView.getLayoutParams();
        StringBuilder sb = new StringBuilder();
        sb.append(iah0.v());
        sb.append(':');
        sb.append(iah0.u());
        bVar.G = sb.toString();
        vKImageView.setLayoutParams(bVar);
        vKImageView.getHierarchy().q(0);
        vKImageView.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        view.setOnClickListener(new x16(this, 16));
        bwt0.k0(view, new mga0(this, 17));
        materialCheckBox.setUseMaterialThemeColors(false);
        materialCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: xsna.ixl0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                kxl0 kxl0Var = kxl0.this;
                wzs<StoryEntry, Boolean, s3q0> wzsVar = kxl0Var.n;
                Object obj = kxl0Var.l;
                if (obj == null) {
                    obj = null;
                }
                wzsVar.invoke(((lxl0) obj).a, Boolean.valueOf(z));
            }
        });
    }

    @Override // xsna.hf6
    public final void W5(lxl0 lxl0Var) {
        lxl0 lxl0Var2 = lxl0Var;
        String str = lxl0Var2.c;
        StoryEntry storyEntry = lxl0Var2.a;
        VKImageView vKImageView = this.p;
        if (vKImageView.getWidth() != 0) {
            vKImageView.load(storyEntry.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
        } else {
            vKImageView.post(new f0(7, this, storyEntry));
        }
        boolean z = lxl0Var2.e;
        View view = this.q;
        TextView textView = this.s;
        TextView textView2 = this.r;
        if (z) {
            view.setVisibility(0);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView2.setText(str);
            textView.setText(lxl0Var2.d);
        } else {
            f4m.j(view);
            f4m.j(textView2);
            f4m.j(textView);
        }
        View view2 = this.itemView;
        view2.setContentDescription(view2.getContext().getString(R.string.story_accessibility_archive_item, str, lxl0Var2.b));
    }
}
