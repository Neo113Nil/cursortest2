package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class knj0 implements zo31 {
    public final RecyclerView a;

    public knj0(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public static knj0 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(mrh0.requirements_carousel_list_view, viewGroup, false);
        if (inflate != null) {
            return new knj0((RecyclerView) inflate);
        }
        ny61.t("rootView");
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
