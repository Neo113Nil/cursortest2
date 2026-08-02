package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.yj20;

/* compiled from: MethodSelectorAdapter.kt */
/* loaded from: classes3.dex */
public final class lj20 extends androidx.recyclerview.widget.x<yj20, RecyclerView.e0> {
    public dge c;
    public gzs<s3q0> d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        yj20 item = getItem(i);
        if (item instanceof yj20.b) {
            return 0;
        }
        if (item instanceof yj20.c) {
            return 1;
        }
        if (item instanceof yj20.a) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        yj20 item = getItem(i);
        if (!(e0Var instanceof tnr0)) {
            if (e0Var instanceof wbg0) {
                dge dgeVar = this.c;
                TextView textView = ((wbg0) e0Var).l;
                textView.setText(((yj20.b) item).c);
                textView.setOnClickListener(new og(dgeVar, 6));
                return;
            }
            if (e0Var instanceof y1v) {
                gzs<s3q0> gzsVar = this.d;
                TextView textView2 = ((y1v) e0Var).l;
                textView2.setText(((yj20.a) item).c);
                textView2.setOnClickListener(new gi8(gzsVar, 6));
                return;
            }
            return;
        }
        tnr0 tnr0Var = (tnr0) e0Var;
        yj20.c cVar = (yj20.c) item;
        dge dgeVar2 = this.c;
        View view = tnr0Var.o;
        view.setEnabled(false);
        ImageView imageView = tnr0Var.l;
        imageView.setAlpha(view.isEnabled() ? 1.0f : 0.64f);
        Integer f = cVar.f();
        if (f != null) {
            imageView.setImageTintList(ColorStateList.valueOf(krv0.m(f.intValue(), imageView.getContext())));
        } else {
            imageView.setImageTintList(null);
        }
        imageView.setImageResource(cVar.e());
        tnr0Var.m.setText(cVar.b());
        view.setOnClickListener(new wnb(5, dgeVar2, cVar));
        TextView textView3 = tnr0Var.n;
        long h = cVar.h();
        if (cVar.h() != 0) {
            textView3.setText(tnr0Var.itemView.getContext().getString(R.string.vk_otp_method_selection_verification_methods_timer, Long.valueOf(TimeUnit.SECONDS.toMinutes(h)), Long.valueOf(h % 60)));
            textView3.setContentDescription(tnr0Var.itemView.getContext().getString(R.string.vk_otp_method_selection_verification_methods_timer_description_for_talkback, ((coo) tnr0Var.p.getValue()).c((int) h)));
        } else {
            view.setEnabled(true);
            imageView.setAlpha(view.isEnabled() ? 1.0f : 0.64f);
            textView3.setText(cVar.g());
            textView3.setContentDescription(cVar.d());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new wbg0(viewGroup);
        }
        if (i == 1) {
            return new tnr0(viewGroup);
        }
        if (i == 2) {
            return new y1v(viewGroup);
        }
        throw new IllegalStateException(lhg.a(i, "Unknown viewType = "));
    }
}
