package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.voip.ui.asr.ui.list.PastAsrListFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PastAsrItemContentViewHolder.kt */
/* loaded from: classes7.dex */
public final class rm90 extends vfz<jn90> {
    public final in90<hn90> l;
    public final Object m;
    public final Object n;
    public final Object o;

    public rm90(ViewGroup viewGroup, PastAsrListFragment.c cVar) {
        super(R.layout.voip_past_asr_content_item, viewGroup);
        this.l = cVar;
        nly nlyVar = new nly(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, nlyVar);
        this.n = msy.a(lazyThreadSafetyMode, new da50(this, 7));
        this.o = msy.a(lazyThreadSafetyMode, new io60(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(jn90 jn90Var) {
        jn90 jn90Var2 = jn90Var;
        ev3 ev3Var = jn90Var2.b;
        String str = ev3Var.c;
        ?? r2 = this.m;
        if (str == null) {
            ((TextView) r2.getValue()).setText(this.itemView.getContext().getString(R.string.voip_asr_list_item_removed_title));
            ((TextView) r2.getValue()).setTextColor(krv0.m(R.attr.vk_ui_text_secondary, this.itemView.getContext()));
        } else {
            TextView textView = (TextView) r2.getValue();
            String str2 = ev3Var.b;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(drm0.W(str2, ".txt"));
            ((TextView) r2.getValue()).setTextColor(krv0.m(R.attr.vk_ui_text_primary, this.itemView.getContext()));
        }
        ?? r22 = this.n;
        if (str == null) {
            ((TextView) r22.getValue()).setText("");
        } else {
            String k = pvo0.k(ev3Var.d, this.itemView.getContext().getResources(), false);
            lar larVar = lar.a;
            long intValue = ev3Var.e != null ? r0.intValue() : 0L;
            larVar.getClass();
            ((TextView) r22.getValue()).setText(this.itemView.getContext().getString(R.string.voip_asr_list_item_date_size, k, lar.a(intValue)));
        }
        ?? r0 = this.o;
        if (str == null) {
            this.itemView.setOnClickListener(null);
            ((ImageView) r0.getValue()).setOnClickListener(null);
        } else {
            bwt0.i0(this.itemView, new pm90(0, this, jn90Var2));
            bwt0.i0((ImageView) r0.getValue(), new qm90(0, this, jn90Var2));
        }
    }
}
