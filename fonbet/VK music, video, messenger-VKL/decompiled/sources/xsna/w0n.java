package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.navigation.NavigationDelegateActivity;
import com.vkontakte.android.R;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0n implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Context d;

    public /* synthetic */ w0n(Context context, Object obj, int i) {
        this.b = i;
        this.c = obj;
        this.d = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                ((x0n) this.c).getClass();
                Context context = this.d;
                return new Drawable[]{m33.a(R.drawable.vk_icon_illustration_disclaimer_contraindications_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_bad_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_credits_feed_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_bankruptcy_360w, context), m33.a(R.drawable.vk_icon_illustration_disclaimer_energy_drinks_360w, context)};
            default:
                ((NewsfeedOptionalAdsComponent) this.c).sa((NavigationDelegateActivity) this.d);
                return s3q0.a;
        }
    }
}
