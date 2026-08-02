package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: KeyboardHintHolder.kt */
/* loaded from: classes6.dex */
public final class cgy extends vfz<hhy> {
    public final gzs<s3q0> l;
    public final orj0 m;

    public cgy(ViewGroup viewGroup, e27 e27Var, orj0 orj0Var) {
        super(R.layout.stickers_vmoji_hint_item, viewGroup);
        this.l = e27Var;
        this.m = orj0Var;
        bwt0.i0(this.itemView, new frg(this, 27));
        bwt0.i0(this.itemView.findViewById(R.id.close_button), new bgy(this, 0));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hhy hhyVar) {
        hhy hhyVar2 = hhyVar;
        ((VKImageView) this.itemView.findViewById(R.id.vmoji_avatar_image_view)).load(dhr0.M() ? hhyVar2.d : hhyVar2.e);
        String str = hhyVar2.b;
        if (str != null) {
            ((TextView) this.itemView.findViewById(R.id.title_view)).setText(str);
        }
        String str2 = hhyVar2.c;
        if (str2 != null) {
            ((TextView) this.itemView.findViewById(R.id.subtitle_view)).setText(str2);
        }
    }

    @Override // xsna.vfz
    public final void a6() {
        y8l0.a.a(a9w0.a);
    }
}
