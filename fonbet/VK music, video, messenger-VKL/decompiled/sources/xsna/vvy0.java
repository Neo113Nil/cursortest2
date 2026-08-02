package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.support.api.entity.common.CommonConstant;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class vvy0 extends RelativeLayout {
    public final RelativeLayout b;
    public final ImageView c;
    public final ImageView d;
    public final c1z0 e;
    public final boolean f;
    public final a g;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static class a implements View.OnClickListener {
        public final Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = this.b;
            try {
                Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://target.my.com/"));
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Throwable th) {
                eb3.a(null, new StringBuilder("FooterView$GoToMyTargetClickListener: Error - "), th);
            }
        }
    }

    public vvy0(Context context, c1z0 c1z0Var, boolean z) {
        super(context);
        this.b = new RelativeLayout(context);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        c1z0.n(imageView, "logo_image");
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        c1z0.n(imageView2, "store_image");
        this.e = c1z0Var;
        this.f = z;
        this.g = new a(context);
    }
}
