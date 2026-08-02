package xsna;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vkontakte.android.R;
import java.util.LinkedHashSet;

/* compiled from: MsgPartQuestionHolder.kt */
/* loaded from: classes2.dex */
public final class dt30 extends hr30<AttachQuestion, et30> {
    public View d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    @Override // xsna.hr30
    public final void o(BubbleColors bubbleColors) {
        this.i = bubbleColors.g;
        this.j = bubbleColors.r;
        int[] iArr = bubbleColors.D;
        LinkedHashSet linkedHashSet = new LinkedHashSet(on00.e(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        this.k = j5g.O0(linkedHashSet).size() > 1;
        s();
    }

    @Override // xsna.hr30
    public final void p(et30 et30Var, pk30 pk30Var, ub80 ub80Var, vb80 vb80Var) {
        et30 et30Var2 = et30Var;
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(et30Var2.c);
        this.h = et30Var2.e;
        s();
        View view = this.d;
        jjc.f(new ekc(1, pk30Var, et30Var2), view != null ? view : null);
    }

    @Override // xsna.hr30
    public final View q(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.vkim_msg_part_question, viewGroup, false);
        this.d = inflate;
        this.e = (TextView) inflate.findViewById(R.id.vkim_question_text);
        this.g = (ImageView) inflate.findViewById(R.id.vkim_question_icon);
        this.f = (TextView) inflate.findViewById(R.id.vkim_question_title);
        return inflate;
    }

    public final void s() {
        boolean M = dhr0.M();
        int i = (M || this.k) ? this.h ? this.j : this.i : this.j;
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageTintList(ColorStateList.valueOf(i));
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setTextColor(i);
        int i2 = this.h ? R.drawable.bg_msg_part_question_in : M ? R.drawable.bg_msg_part_question_out_dark : R.drawable.bg_msg_part_question_out_light;
        View view = this.d;
        if (view == null) {
            view = null;
        }
        view.setBackgroundResource(i2);
        TextView textView2 = this.e;
        (textView2 != null ? textView2 : null).setTextColor(this.i);
    }
}
