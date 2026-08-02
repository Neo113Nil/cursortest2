package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: BottomActionSingleCommunityAdapter.kt */
/* loaded from: classes6.dex */
public final class t38 extends RecyclerView.Adapter<c50> {
    public ArrayList c;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(c50 c50Var, int i) {
        p38 p38Var;
        c50 c50Var2 = c50Var;
        ArrayList arrayList = this.c;
        if (arrayList == null || (p38Var = (p38) j5g.b0(i, arrayList)) == null) {
            return;
        }
        ImageView imageView = c50Var2.m;
        imageView.setImageDrawable(null);
        c50Var2.l.setText(p38Var.b);
        c50Var2.itemView.setOnClickListener(new a50(p38Var, 0));
        String str = p38Var.a.b;
        int i2 = c50.p;
        io.reactivex.rxjava3.internal.operators.observable.b0 F = mcr0.f(5000L, str).U(new nm3(new gyg(i2, i2), 9)).F(new ia(new com.vk.movika.sdk.base.logic.interactor.f(12), 18));
        Context context = e43.a;
        Resources resources = (context != null ? context : null).getResources();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(dhr0.t.c(R.attr.vk_ui_background_secondary));
        s3q0 s3q0Var = s3q0.a;
        mog0 mog0Var = new mog0(resources, createBitmap);
        mog0Var.a();
        io.reactivex.rxjava3.internal.operators.observable.p1 d0 = F.d0(mog0Var.getCurrent());
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.disposables.c subscribe = d0.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new zl0(new ka(imageView, 28), 15));
        pgn pgnVar = c50Var2.n;
        qcy<Object> qcyVar = c50.o[0];
        pgnVar.b(subscribe);
        c50Var2.itemView.addOnAttachStateChangeListener(new b50(c50Var2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final c50 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c50(viewGroup);
    }
}
