package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.im.ui.views.ProgressLineView;
import com.vk.im.ui.views.buttons.VkButtonWithSmallScreenSupport;
import com.vkontakte.android.R;

/* compiled from: AttachDownloadProgressView.kt */
/* loaded from: classes2.dex */
public final class x14 extends LinearLayout {
    public gzs<s3q0> b;
    public final TextView c;
    public final TextView d;
    public final ProgressLineView e;
    public final LottieAnimationView f;
    public int g;

    public x14(Context context) {
        super(context, null, 0);
        this.b = new i21(1);
        this.g = -1;
        LayoutInflater.from(context).inflate(R.layout.vkim_attach_download_progress_view, (ViewGroup) this, true);
        VkButtonWithSmallScreenSupport vkButtonWithSmallScreenSupport = (VkButtonWithSmallScreenSupport) findViewById(R.id.cancel_button);
        this.c = (TextView) findViewById(R.id.message);
        this.e = (ProgressLineView) findViewById(R.id.download_progress);
        this.d = (TextView) findViewById(R.id.progress_value);
        this.f = (LottieAnimationView) findViewById(R.id.files_anim);
        q700.h(context, R.raw.card_220, q700.o(R.raw.card_220, context)).b(new r800() { // from class: xsna.w14
            @Override // xsna.r800
            public final void onResult(Object obj) {
                x14 x14Var = x14.this;
                x14Var.f.setComposition((i700) obj);
                x14Var.f.m0();
            }
        });
        bwt0.i0(vkButtonWithSmallScreenSupport, new sf1(this, 5));
    }

    public final void setCancelAction(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public final void setMsgRes(int i) {
        this.c.setText(i);
    }

    public final void setProgress(int i) {
        if (this.g != i) {
            this.g = i;
            this.d.setText(l6g.a(i, " %"));
            this.e.setProgress(i);
        }
    }
}
