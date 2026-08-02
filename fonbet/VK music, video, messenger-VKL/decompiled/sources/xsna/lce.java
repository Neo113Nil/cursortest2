package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import kotlin.LazyThreadSafetyMode;

/* compiled from: ClipsGridCommonClipPreviewHolder.kt */
/* loaded from: classes17.dex */
public final class lce extends RecyclerView.e0 implements View.OnClickListener {
    public static final int r = iah0.a(48);
    public static final int s = iah0.a(6);
    public final String l;
    public final wzs<Integer, io2, s3q0> m;
    public final h270 n;
    public final Object o;
    public final Object p;
    public final Object q;

    /* JADX WARN: Multi-variable type inference failed */
    public lce(ViewGroup viewGroup, String str, wzs<? super Integer, ? super io2, s3q0> wzsVar) {
        super(new dee(viewGroup.getContext()));
        this.l = str;
        this.m = wzsVar;
        this.n = new h270(((dee) this.itemView).getImageViewController().d, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, 252);
        zq3 zq3Var = new zq3(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = msy.a(lazyThreadSafetyMode, zq3Var);
        this.p = msy.a(lazyThreadSafetyMode, new f84(6));
        this.q = msy.a(lazyThreadSafetyMode, new e20(8));
        this.itemView.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (jjc.b()) {
            return;
        }
        this.m.invoke(Integer.valueOf(getAdapterPosition()), this.n);
    }
}
