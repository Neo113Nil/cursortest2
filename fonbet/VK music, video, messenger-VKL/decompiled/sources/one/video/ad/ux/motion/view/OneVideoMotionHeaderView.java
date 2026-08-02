package one.video.ad.ux.motion.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.vkontakte.android.R;
import xsna.bn1;
import xsna.bpn0;
import xsna.epx;
import xsna.ka30;
import xsna.mpz;
import xsna.naj;
import xsna.v9b;
import xsna.x5r0;
import xsna.xws0;
import xsna.zq3;

/* compiled from: OneVideoMotionHeaderView.kt */
/* loaded from: classes8.dex */
public final class OneVideoMotionHeaderView extends ConstraintLayout {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public final bpn0 B;
    public ka30 C;
    public final int t;
    public final AppCompatImageView u;
    public final TextView v;
    public final TextView w;
    public final AppCompatImageView x;
    public final AppCompatImageView y;
    public xws0 z;

    public OneVideoMotionHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.one_video_motion_header_view, (ViewGroup) this, true);
        setBackgroundColor(context.getColor(R.color.one_video_black));
        this.t = R.id.video_motion_header_image_view;
        this.u = (AppCompatImageView) findViewById(R.id.video_motion_header_image_view);
        this.v = (TextView) findViewById(R.id.video_motion_header_title_view);
        this.w = (TextView) findViewById(R.id.video_motion_header_subtitle_view);
        this.x = (AppCompatImageView) findViewById(R.id.video_motion_header_info_view);
        this.y = (AppCompatImageView) findViewById(R.id.video_motion_header_skip_view);
        P4();
        this.B = new bpn0(new zq3(25));
    }

    private final mpz getLoadImageController() {
        return (mpz) this.B.getValue();
    }

    public final void P4() {
        AppCompatImageView appCompatImageView = this.u;
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        Object obj = x5r0.a;
        int a = (int) x5r0.a(this.A ? 40 : 24, 1);
        layoutParams.width = a;
        layoutParams.height = a;
        appCompatImageView.setLayoutParams(layoutParams);
        b bVar = new b();
        bVar.i(this);
        int i = this.t;
        bVar.k(i, 3, 0, 3);
        bVar.k(i, 6, 0, 6);
        if (this.A) {
            bVar.k(i, 4, 0, 4);
        } else {
            bVar.h(i, 4);
        }
        bVar.h(i, 7);
        bVar.b(this);
        this.v.setVisibility(this.A ? 0 : 8);
        AppCompatImageView appCompatImageView2 = this.x;
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView2.getLayoutParams();
        layoutParams2.width = (int) x5r0.a(this.A ? 48 : 36, 1);
        layoutParams2.height = (int) x5r0.a(this.A ? 48 : 24, 1);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageResource(this.A ? R.drawable.one_video_icon_more_horizontal_24 : R.drawable.one_video_icon_info_outline_16);
        AppCompatImageView appCompatImageView3 = this.y;
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView3.getLayoutParams();
        layoutParams3.width = (int) x5r0.a(this.A ? 48 : 36, 1);
        layoutParams3.height = (int) x5r0.a(this.A ? 48 : 24, 1);
        appCompatImageView3.setLayoutParams(layoutParams3);
        appCompatImageView3.setImageResource(this.A ? R.drawable.one_video_icon_cancel_outline_28 : R.drawable.one_video_icon_cancel_20);
        appCompatImageView3.setOnClickListener(new bn1(this, 9));
        setOnClickListener(new naj(this, 5));
    }

    public final void Q4(ka30 ka30Var) {
        if (epx.f(this.C, ka30Var)) {
            return;
        }
        this.C = ka30Var;
        AppCompatImageView appCompatImageView = this.u;
        appCompatImageView.setClipToOutline(true);
        mpz loadImageController = getLoadImageController();
        xws0 xws0Var = this.z;
        loadImageController.a(appCompatImageView, xws0Var != null ? xws0Var.b() : null, ka30Var != null ? ka30Var.a : null);
        this.v.setText(ka30Var != null ? ka30Var.b : null);
        this.w.setText(ka30Var != null ? ka30Var.c : null);
        int i = ka30Var != null ? ka30Var.d : false ? 0 : 8;
        AppCompatImageView appCompatImageView2 = this.x;
        appCompatImageView2.setVisibility(i);
        if (ka30Var == null || !ka30Var.d) {
            appCompatImageView2.setOnClickListener(null);
        } else {
            appCompatImageView2.setOnClickListener(new v9b(this, 8));
        }
        this.y.setVisibility(ka30Var != null && ka30Var.g ? 0 : 8);
    }

    public final xws0 getProvider() {
        return this.z;
    }

    public final void setFullscreen(boolean z) {
        if (this.A == z) {
            return;
        }
        this.A = z;
        P4();
    }

    public final void setProvider(xws0 xws0Var) {
        this.z = xws0Var;
    }
}
