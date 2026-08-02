package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.tags.Tag;
import com.vkontakte.android.R;
import xsna.dw20;
import xsna.n0o0;

/* compiled from: GoodsActionsModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class q8u extends dw20 {
    public final Tag f1;
    public gzs<s3q0> g1;
    public gzs<s3q0> h1;

    /* compiled from: GoodsActionsModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final Tag e;
        public gzs<s3q0> f;
        public gzs<s3q0> g;

        public a(Context context, Tag tag) {
            super(context, null);
            this.e = tag;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            D0(LayoutInflater.from(this.c).inflate(R.layout.goods_actions_modal_bottom_sheet, (ViewGroup) null, false), false);
            q8u q8uVar = new q8u(this.e);
            q8uVar.g1 = this.f;
            q8uVar.h1 = this.g;
            return q8uVar;
        }
    }

    public q8u(Tag tag) {
        this.f1 = tag;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        rnd0 rnd0Var;
        rnd0 rnd0Var2;
        Dialog yn = super.yn(bundle);
        TextView textView = (TextView) yn.findViewById(R.id.open_button);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, textView.getContext()));
        Context context = textView.getContext();
        Tag tag = this.f1;
        n0o0.a aVar = tag.f.e;
        textView.setText(context.getString((aVar == null || (rnd0Var2 = aVar.b) == null || !rnd0Var2.c) ? R.string.photo_tagged_goods_open : R.string.photo_tagged_services_open));
        textView.setOnClickListener(new bd0(this, 5));
        TextView textView2 = (TextView) yn.findViewById(R.id.delete_button);
        textView2.setTextColor(e3m.f(R.attr.vk_ui_text_negative, textView2.getContext()));
        Context context2 = textView2.getContext();
        n0o0.a aVar2 = tag.f.e;
        textView2.setText(context2.getString((aVar2 == null || (rnd0Var = aVar2.b) == null || !rnd0Var.c) ? R.string.photo_tagged_goods_delete : R.string.photo_tagged_services_delete));
        textView2.setOnClickListener(new e9i(this, 1));
        return yn;
    }
}
