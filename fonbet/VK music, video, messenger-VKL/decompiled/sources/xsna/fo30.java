package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.music.view.ThumbsImageView;

/* compiled from: MsgPartAudioRedesignVC.kt */
/* loaded from: classes2.dex */
public final class fo30 extends go30 {
    public ImageView d;
    public View e;
    public ThumbsImageView f;
    public View g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public ImageView k;
    public TimeAndStatusView l;
    public final bpn0 m = new bpn0(new cnh(this, 22));
    public final bpn0 n = new bpn0(new cr20(this, 3));
    public final bpn0 o = new bpn0(new l500(this, 8));
    public final bpn0 p = new bpn0(new jrh(this, 29));
    public final bpn0 q = new bpn0(new r010(this, 6));
    public io.reactivex.rxjava3.disposables.c r = new io.reactivex.rxjava3.disposables.f(io.reactivex.rxjava3.internal.functions.a.b);
    public final vvn s = new vvn();

    public final void b(boolean z) {
        ImageView imageView = this.d;
        if (imageView == null) {
            imageView = null;
        }
        if (z) {
            imageView.setImageDrawable((Drawable) this.n.getValue());
            ConstraintLayout constraintLayout = this.b;
            if (constraintLayout == null) {
                constraintLayout = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((String) this.p.getValue());
            sb.append(' ');
            TextView textView = this.i;
            if (textView == null) {
                textView = null;
            }
            sb.append((Object) textView.getText());
            sb.append(' ');
            TextView textView2 = this.j;
            sb.append((Object) (textView2 != null ? textView2 : null).getText());
            constraintLayout.setContentDescription(sb.toString());
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            bVar.E = 0.5f;
            imageView.setLayoutParams(bVar);
            return;
        }
        imageView.setImageDrawable((Drawable) this.o.getValue());
        ConstraintLayout constraintLayout2 = this.b;
        if (constraintLayout2 == null) {
            constraintLayout2 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.q.getValue());
        sb2.append(' ');
        TextView textView3 = this.i;
        if (textView3 == null) {
            textView3 = null;
        }
        sb2.append((Object) textView3.getText());
        sb2.append(' ');
        TextView textView4 = this.j;
        sb2.append((Object) (textView4 != null ? textView4 : null).getText());
        constraintLayout2.setContentDescription(sb2.toString());
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
        bVar2.E = 0.55f;
        imageView.setLayoutParams(bVar2);
    }

    @Override // xsna.hux0
    public final TimeAndStatusView getTimeAndStatusView() {
        TimeAndStatusView timeAndStatusView = this.l;
        if (timeAndStatusView != null) {
            return timeAndStatusView;
        }
        return null;
    }
}
