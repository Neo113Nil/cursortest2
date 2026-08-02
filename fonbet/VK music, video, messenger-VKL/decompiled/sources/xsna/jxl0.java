package xsna;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.vk.dto.common.filter.ImageQuality;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: StoryArchiveHolder2.kt */
/* loaded from: classes3.dex */
public final class jxl0 extends vif0<z2m0> implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public final wzs<StoryEntry, Boolean, s3q0> n;
    public final VKImageView o;
    public final MaterialCheckBox p;

    /* JADX WARN: Multi-variable type inference failed */
    public jxl0(ViewGroup viewGroup, wzs<? super StoryEntry, ? super Boolean, s3q0> wzsVar) {
        super(viewGroup, R.layout.item_story_archive, 0);
        this.n = wzsVar;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.o = vKImageView;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) this.itemView.findViewById(R.id.check);
        this.p = materialCheckBox;
        ConstraintLayout.b bVar = (ConstraintLayout.b) vKImageView.getLayoutParams();
        StringBuilder sb = new StringBuilder();
        sb.append(iah0.v());
        sb.append(':');
        sb.append(iah0.u());
        bVar.G = sb.toString();
        vKImageView.setLayoutParams(bVar);
        vKImageView.getHierarchy().q(0);
        vKImageView.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        this.itemView.setOnClickListener(this);
        materialCheckBox.setUseMaterialThemeColors(false);
        bwt0.p0(materialCheckBox, true);
        materialCheckBox.setOnCheckedChangeListener(this);
    }

    @Override // xsna.vif0
    public final void i6(z2m0 z2m0Var) {
        z2m0 z2m0Var2 = z2m0Var;
        VKImageView vKImageView = this.o;
        if (vKImageView.getWidth() != 0) {
            vKImageView.load(z2m0Var2.a.Jb(vKImageView.getWidth(), ImageQuality.FIT, false));
        } else {
            vKImageView.post(new k0(11, this, z2m0Var2));
        }
        this.p.setChecked(z2m0Var2.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.itemView.isPressed() || this.p.isPressed()) {
            this.n.invoke(((z2m0) this.m).a, Boolean.valueOf(z));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.p.toggle();
    }
}
