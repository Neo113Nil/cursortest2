package xsna;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.fyc0.a;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: PreferenceIconItemHolder.kt */
/* loaded from: classes7.dex */
public final class fyc0<T extends a> extends vif0<T> implements UsableRecyclerView.e {
    public final FunctionReferenceImpl n;
    public final VkCell o;

    /* compiled from: PreferenceIconItemHolder.kt */
    public static class a {
        public final int a;
        public final int b;
        public final tlo0 c;

        public a() {
            throw null;
        }

        public a(int i, tlo0 tlo0Var) {
            this.a = i;
            this.b = R.attr.vk_ui_icon_accent;
            this.c = tlo0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fyc0(ViewGroup viewGroup, izs<? super T, s3q0> izsVar) {
        super(viewGroup, R.layout.icon_pref, 0);
        this.n = (FunctionReferenceImpl) izsVar;
        this.o = (VkCell) this.itemView.findViewById(R.id.preference_item_cell);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(Object obj) {
        a aVar = (a) obj;
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.c(aVar.a, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(aVar.b)), (tlo0.h) null, 8));
        VkCell vkCell = this.o;
        vkCell.setLeft(a2);
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(aVar.c, 0, (TextUtils.TruncateAt) objArr, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
        ?? r0 = this.n;
        if (r0 != 0) {
            r0.invoke(this.m);
        }
    }
}
