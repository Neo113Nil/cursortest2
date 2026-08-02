package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.dto.stickers.StickerPackPrice;
import com.vkontakte.android.R;

/* compiled from: KeyboardHeaderRecommendationHolder.kt */
/* loaded from: classes6.dex */
public final class vfy extends qf6 {
    public final y4l0 l;
    public final TextView m;
    public final FrameLayout n;
    public final TextView o;
    public final ProgressBar p;

    public vfy(ViewGroup viewGroup, y4l0 y4l0Var) {
        super(viewGroup, R.layout.sticker_keyboard_recommendation_header, 0);
        this.l = y4l0Var;
        this.m = (TextView) this.itemView.findViewById(R.id.pack_name);
        this.n = (FrameLayout) this.itemView.findViewById(R.id.action_button);
        this.o = (TextView) this.itemView.findViewById(R.id.action_button_text);
        this.p = (ProgressBar) this.itemView.findViewById(R.id.action_button_progress);
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        wfy wfyVar = (wfy) hfzVar;
        this.m.setText(wfyVar.c);
        boolean z = wfyVar.e;
        String str = "";
        ProgressBar progressBar = this.p;
        TextView textView = this.o;
        FrameLayout frameLayout = this.n;
        if (z) {
            progressBar.setVisibility(0);
            textView.setVisibility(4);
            frameLayout.setEnabled(false);
            frameLayout.setContentDescription("");
            return;
        }
        f4m.j(progressBar);
        textView.setVisibility(0);
        StickerPackPrice f = wfyVar.b.f();
        if (f != null) {
            int a = f.a();
            String string = a == 0 ? this.itemView.getContext().getString(R.string.stickers_buy_for_free) : enj.f(R.plurals.pack_price, a, this.itemView.getContext());
            if (string != null) {
                str = string;
            }
        }
        textView.setText(str);
        frameLayout.setEnabled(true);
        frameLayout.setContentDescription(this.itemView.getContext().getString(R.string.vk_accessibility_role_button) + ' ' + ((Object) textView.getText()));
        frameLayout.setOnClickListener(new cm1(3, this, wfyVar));
        this.itemView.setOnClickListener(new bym(3, this, wfyVar));
    }
}
