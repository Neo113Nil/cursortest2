package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.video.ad.ux.motion.view.OneVideoMotionView;

/* compiled from: OneVideoMotionItemView.kt */
/* loaded from: classes8.dex */
public final class jm80 extends ConstraintLayout {
    public final AppCompatImageView t;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final TextView y;
    public final bpn0 z;

    /* compiled from: OneVideoMotionItemView.kt */
    public static final class a {
        public final na30 a;
        public final boolean b;

        public a(na30 na30Var, boolean z) {
            this.a = na30Var;
            this.b = z;
        }
    }

    public jm80(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.one_video_motion_item_view, (ViewGroup) this, true);
        setBackgroundColor(context.getColor(R.color.one_video_black));
        this.t = (AppCompatImageView) findViewById(R.id.video_motion_image_view);
        this.u = (TextView) findViewById(R.id.video_motion_discount_view);
        this.v = (TextView) findViewById(R.id.video_motion_price_view);
        this.w = (TextView) findViewById(R.id.video_motion_old_price_view);
        this.x = (TextView) findViewById(R.id.video_motion_title_view);
        this.y = (TextView) findViewById(R.id.video_motion_button_view);
        this.z = new bpn0(new im80(0));
    }

    private final mpz getLoadImageController() {
        return (mpz) this.z.getValue();
    }

    public final void P4(xws0 xws0Var, a aVar) {
        bsz0 bsz0Var;
        rvu rvuVar;
        ljz0 ljz0Var;
        boolean z = aVar.b;
        na30 na30Var = aVar.a;
        sws0 controller = OneVideoMotionView.this.getController();
        if (controller != null) {
            String str = na30Var.a;
            rws0 rws0Var = controller.a;
            LinkedHashSet linkedHashSet = rws0Var.c;
            if (!linkedHashSet.contains(str)) {
                linkedHashSet.add(str);
                n0z0 n0z0Var = (n0z0) rws0Var.b;
                HashSet hashSet = n0z0Var.e;
                if (hashSet != null && !hashSet.contains(str) && (bsz0Var = n0z0Var.d) != null && (rvuVar = bsz0Var.y0) != null) {
                    Iterator it = ((ArrayList) rvuVar.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ljz0Var = null;
                            break;
                        } else {
                            ljz0Var = (ljz0) it.next();
                            if (ljz0Var.a.equals(str)) {
                                break;
                            }
                        }
                    }
                    if (ljz0Var != null) {
                        e5z0 e5z0Var = ljz0Var.f;
                        n0z0Var.e.add(str);
                        h8z0.e(e5z0Var, "show", 1, null);
                        h8z0.e(e5z0Var, "render", 1, null);
                    }
                }
            }
        }
        ImageView imageView = this.t;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        Object obj = x5r0.a;
        int a2 = (int) x5r0.a(z ? 8 : 6, 1);
        marginLayoutParams.setMarginStart(a2);
        marginLayoutParams.setMarginEnd(a2);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setClipToOutline(true);
        imageView.setBackgroundResource(z ? R.drawable.one_video_background_rounded_20 : R.drawable.one_video_background_rounded_16);
        imageView.setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(R.color.one_video_gray)));
        mpz loadImageController = getLoadImageController();
        zjw imageLoader = OneVideoMotionView.this.getImageLoader();
        String str2 = na30Var.f;
        String str3 = na30Var.d;
        String str4 = na30Var.c;
        String str5 = na30Var.b;
        loadImageController.a(imageView, imageLoader, str2);
        int a3 = (int) x5r0.a(z ? 12 : 6, 1);
        TextView textView = this.x;
        int i = 0;
        x5r0.h(textView, 0, a3, 0, 0);
        textView.setTextSize(1, z ? 14.0f : 11.0f);
        textView.setText(na30Var.g);
        textView.setVisibility((str5 == null || z) ? 0 : 8);
        int a4 = (int) x5r0.a(z ? 4 : 6, 1);
        TextView textView2 = this.v;
        x5r0.h(textView2, 0, a4, 0, 0);
        textView2.setTextSize(1, z ? 17.0f : 11.0f);
        textView2.setText(str5);
        textView2.setVisibility(str5 != null ? 0 : (str5 == null && z) ? 4 : 8);
        textView2.setGravity(str4 == null ? 17 : 8388613);
        float f = z ? 17.0f : 11.0f;
        TextView textView3 = this.w;
        textView3.setTextSize(1, f);
        textView3.setText(str4);
        textView3.setVisibility(str4 != null ? 0 : 8);
        textView3.setPaintFlags(textView3.getPaintFlags() | 16);
        TextView textView4 = this.u;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView4.getLayoutParams();
        marginLayoutParams2.setMarginStart(-((int) x5r0.a(z ? 8 : 4, 1)));
        marginLayoutParams2.topMargin = (int) x5r0.a(z ? 12 : 6, 1);
        textView4.setLayoutParams(marginLayoutParams2);
        int a5 = (int) x5r0.a(z ? 6 : 3, 1);
        int a6 = (int) x5r0.a(z ? 4.0f : 1.5f, 1);
        textView4.setPadding(a5, a6, a5, a6);
        Drawable a7 = m33.a(z ? R.drawable.one_video_background_rounded_10 : R.drawable.one_video_background_rounded_6, getContext());
        if (a7 != null) {
            a7.setTint(getContext().getColor(R.color.one_video_red));
        }
        textView4.setBackground(a7);
        textView4.setTextSize(1, z ? 14.0f : 10.0f);
        textView4.setText(str3);
        textView4.setVisibility(str3 != null ? 0 : 8);
        String str6 = na30Var.h;
        TextView textView5 = this.y;
        textView5.setText(str6);
        textView5.setVisibility(z ? 0 : 8);
        setOnClickListener(new hm80(i, xws0Var, aVar));
    }
}
