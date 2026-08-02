package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.yandex.payment.sdk.ui.payment.sbp.BankAppsAdapter;

/* loaded from: classes2.dex */
public final class np4 extends op4 {
    public final wls O;
    public final ImageView P;
    public final TextView Q;
    public final ImageView R;
    public final View S;
    public final View T;
    public final /* synthetic */ BankAppsAdapter U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np4(BankAppsAdapter bankAppsAdapter, View view, wls wlsVar) {
        super(view);
        this.U = bankAppsAdapter;
        this.O = wlsVar;
        this.P = (ImageView) this.N.findViewById(o9h0.paymentsdk_bank_icon);
        this.Q = (TextView) this.N.findViewById(o9h0.paymentsdk_bank_title);
        this.R = (ImageView) this.N.findViewById(o9h0.paymentsdk_bank_radio_button);
        this.S = this.N.findViewById(o9h0.paymentsdk_bank_container);
        this.T = this.N.findViewById(o9h0.paymentsdk_bank_divider);
    }

    @Override // defpackage.op4
    public final void W(int i) {
        int i2;
        BankAppsAdapter bankAppsAdapter = this.U;
        mp4 mp4Var = (mp4) bankAppsAdapter.filtered.get(i);
        this.S.setOnClickListener(new nl(2, this, bankAppsAdapter, mp4Var));
        this.T.setVisibility(bankAppsAdapter.getItemCount() + (-1) != i ? 0 : 8);
        i2 = bankAppsAdapter.selectedIndex;
        boolean z = i2 == i;
        boolean z2 = mp4Var instanceof kp4;
        TextView textView = this.Q;
        ImageView imageView = this.P;
        if (z2) {
            Glide.with(imageView.getContext()).clear(imageView);
            PackageManager packageManager = this.a.getContext().getPackageManager();
            ResolveInfo resolveInfo = ((kp4) mp4Var).g;
            imageView.setImageDrawable(resolveInfo.activityInfo.loadIcon(packageManager));
            textView.setText(resolveInfo.activityInfo.loadLabel(packageManager));
        } else if (!(mp4Var instanceof lp4)) {
            w511.b();
            return;
        } else {
            textView.setText(mp4Var.a);
            ((p5j0) Glide.with(imageView.getContext()).load(((lp4) mp4Var).g).f(dxg0.paymentsdk_ic_unknown_bank_light)).G(imageView);
        }
        ImageView imageView2 = this.R;
        imageView2.setVisibility(0);
        imageView2.setSelected(z);
    }
}
