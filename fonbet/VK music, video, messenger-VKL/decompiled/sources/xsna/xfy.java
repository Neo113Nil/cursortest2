package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderUgcHolder.kt */
/* loaded from: classes6.dex */
public final class xfy extends qf6 implements View.OnClickListener {
    public final y4l0 l;
    public final ImageButton m;
    public final ImageButton n;
    public yfy o;

    public xfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_ugc_header, 0);
        this.l = y4l0Var;
        ImageButton imageButton = (ImageButton) this.itemView.findViewById(R.id.left_button);
        this.m = imageButton;
        ImageButton imageButton2 = (ImageButton) this.itemView.findViewById(R.id.dots_button);
        this.n = imageButton2;
        bwt0.h0(this, imageButton);
        bwt0.h0(this, imageButton2);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        yfy yfyVar = (yfy) hfzVar;
        this.o = yfyVar;
        boolean z = yfyVar.c;
        ImageButton imageButton = this.n;
        if (!z) {
            omw.d(imageButton, R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_secondary);
            imageButton.setContentDescription(this.itemView.getContext().getText(R.string.stickers_ugc_content_description_report_stickers));
        } else {
            omw.d(imageButton, R.drawable.vk_icon_gear_outline_24, R.attr.vk_ui_icon_secondary);
            imageButton.setContentDescription(this.itemView.getContext().getText(R.string.stickers_ugc_content_description_settings));
            imageButton.setVisibility(0);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean f = epx.f(view, this.m);
        y4l0 y4l0Var = this.l;
        if (f) {
            if (y4l0Var != null) {
                yfy yfyVar = this.o;
                ewp0 ewp0Var = (yfyVar == null ? null : yfyVar).b;
                (yfyVar != null ? yfyVar : null).getClass();
                y4l0Var.c();
                return;
            }
            return;
        }
        yfy yfyVar2 = this.o;
        if ((yfyVar2 == null ? null : yfyVar2).c) {
            if (y4l0Var != null) {
                y4l0Var.d();
            }
        } else if (y4l0Var != null) {
            y4l0Var.q((yfyVar2 != null ? yfyVar2 : null).b.b, (yfyVar2 == null ? null : yfyVar2).b.a);
        }
    }
}
