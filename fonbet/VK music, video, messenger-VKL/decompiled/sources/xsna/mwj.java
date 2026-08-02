package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CorrectionItemHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes16.dex */
public final class mwj extends RecyclerView.e0 {
    public final izs<Integer, s3q0> l;
    public final kwj m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mwj(ViewGroup viewGroup, com.vk.movika.sdk.base.logic.interactor.e eVar) {
        super(r1);
        Context context = viewGroup.getContext();
        int b = dn70.b(6);
        kwj kwjVar = new kwj(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        kwjVar.setPadding(b, 0, b, 0);
        kwjVar.setLayoutParams(layoutParams);
        this.l = eVar;
        kwj kwjVar2 = (kwj) this.itemView;
        this.m = kwjVar2;
        jjc.g(kwjVar2, new t6(this, 27));
    }
}
