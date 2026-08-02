package xsna;

import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vkontakte.android.R;
import java.util.List;
import xsna.c0v0;

/* compiled from: IdentityLabelAdapter.kt */
/* loaded from: classes6.dex */
public final class jvv extends RecyclerView.Adapter<RecyclerView.e0> {
    public final List<WebIdentityLabel> c;
    public final c0v0.b d;
    public boolean e;
    public WebIdentityLabel f;

    /* compiled from: IdentityLabelAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public a(j2c j2cVar) {
            super(j2cVar);
            jjc.g(j2cVar, new ma(15, this, jvv.this));
        }

        public final void V5(WebIdentityLabel webIdentityLabel) {
            j2c j2cVar = (j2c) this.itemView;
            String str = webIdentityLabel.c;
            Boolean valueOf = Boolean.valueOf(webIdentityLabel.equals(jvv.this.f));
            j2cVar.setText(str);
            j2cVar.setChecked(valueOf);
            TypedValue typedValue = krv0.a;
            krv0.q(j2cVar, R.attr.vk_ui_text_primary);
            j2cVar.setBackgroundResource(R.drawable.vk_bottom_divider_bg);
        }
    }

    public jvv(List list, c0v0.b bVar) {
        this.c = list;
        this.d = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        WebIdentityLabel webIdentityLabel;
        int size = this.c.size();
        return (!this.e || (webIdentityLabel = this.f) == null || drm0.N(webIdentityLabel.c)) ? size + 1 : size + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        WebIdentityLabel webIdentityLabel;
        if (e0Var instanceof a) {
            boolean z = this.e;
            List<WebIdentityLabel> list = this.c;
            if (z && (webIdentityLabel = this.f) != null && !drm0.N(webIdentityLabel.c) && i == list.size()) {
                ((a) e0Var).V5(this.f);
                return;
            }
            if (i < list.size()) {
                if (list.size() > i) {
                    ((a) e0Var).V5(list.get(i));
                }
            } else {
                j2c j2cVar = (j2c) ((a) e0Var).itemView;
                j2cVar.setText(R.string.vk_identity_other);
                j2cVar.setBackgroundColor(0);
                j2cVar.setTextColor(j2cVar.getContext().getColor(R.color.vk_header_blue));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(new j2c(viewGroup.getContext()));
    }
}
