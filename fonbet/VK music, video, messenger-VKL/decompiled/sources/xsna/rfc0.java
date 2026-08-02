package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.HashSet;
import xsna.vz70;

/* compiled from: PostingFragmentBuilder.kt */
/* loaded from: classes4.dex */
public final class rfc0 {
    public static final int a = iah0.a(32);

    @ozl
    public static vz70 a() {
        vz70 vz70Var = new vz70();
        j0u0 j0u0Var = new j0u0(5);
        j0u0Var.b = Long.valueOf(System.currentTimeMillis());
        j0u0Var.c = Long.valueOf(SystemClock.elapsedRealtime());
        vz70.a aVar = vz70Var.b;
        Bundle bundle = aVar.j;
        Long l = (Long) j0u0Var.b;
        if (l != null) {
            bundle.putLong("startScreenTime", l.longValue());
        }
        Long l2 = (Long) j0u0Var.c;
        if (l2 != null) {
            bundle.putLong("startScreenElapsedTime", l2.longValue());
        }
        Activity o1 = hd60.a().o1();
        TabletDialogActivity.a d = d();
        d.b.putBoolean("repaintStatusBar", false);
        if (o1 != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(o1)) {
                aVar.i = d;
            }
        }
        return vz70Var;
    }

    public static final q860 b() {
        return new q860();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(TabletDialogActivity.a aVar, PostingAttachActivity postingAttachActivity) {
        boolean z;
        Bundle bundle = aVar.b;
        Context context = postingAttachActivity;
        if (postingAttachActivity == null) {
            context = hd60.a().o1();
        }
        if (context != null) {
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                z = true;
                bundle.putInt("window_background_color", dhr0.t.c(R.attr.vk_ui_background_content));
                aVar.b();
                bundle.putInt("input_mode", 16);
                bundle.putInt("max_width", iah0.a(600.0f));
                bundle.putInt("min_spacing", a);
                bundle.putBoolean("closeOnTouchOutside", true);
                bundle.putBoolean("withoutAdjustResize", true);
                bundle.putFloat("elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (z) {
                    return;
                }
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                if (iah0.s(context2)) {
                    bundle.putInt("preferred_height", (int) (iah0.f().heightPixels * 0.75d));
                    return;
                } else {
                    bundle.putInt("preferred_height", (int) (iah0.f().heightPixels * 0.9d));
                    return;
                }
            }
        }
        z = false;
        bundle.putInt("window_background_color", dhr0.t.c(R.attr.vk_ui_background_content));
        aVar.b();
        bundle.putInt("input_mode", 16);
        bundle.putInt("max_width", iah0.a(600.0f));
        bundle.putInt("min_spacing", a);
        bundle.putBoolean("closeOnTouchOutside", true);
        bundle.putBoolean("withoutAdjustResize", true);
        bundle.putFloat("elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (z) {
        }
    }

    public static final TabletDialogActivity.a d() {
        TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
        aVar.b.putInt("window_background_color", dhr0.t.c(R.attr.vk_ui_background_content));
        c(aVar, null);
        return aVar;
    }
}
