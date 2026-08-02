package xsna;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.common.links.LaunchContext;
import com.vk.libvideo.VideoWrapperActivity;

/* compiled from: SeriesLink.kt */
/* loaded from: classes17.dex */
public final class kni0 implements pje {
    public final zof a;

    public kni0(zof zofVar) {
        this.a = zofVar;
    }

    @Override // xsna.pje
    public final boolean a(peq0 peq0Var) {
        if (this.a.k()) {
            return jh.h("/clips/series/([\\d\\w.]{2,})", peq0Var, null, null, 14);
        }
        return false;
    }

    @Override // xsna.pje
    public final boolean b(peq0 peq0Var, ClipsRouter clipsRouter, Context context, LaunchContext launchContext, yp80 yp80Var) {
        Intent intent = new Intent(context, (Class<?>) VideoWrapperActivity.class);
        intent.putExtra("fragment_name", ClipsOwnerSwipeFragment.class.getName());
        intent.putExtra("fragment_use_slide_animation", false);
        Bundle bundle = new Bundle();
        ClipsWrapperInputArguments.r.getClass();
        bundle.putBoolean("ClipsWrapperFragment.in_wrapper_activity", true);
        s3q0 s3q0Var = s3q0.a;
        intent.putExtra("fragment_args", bundle);
        try {
            context.startActivity(intent);
            Activity h = e3m.h(context);
            if (h != null) {
                h.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
            if (yp80Var != null) {
                yp80Var.onSuccess();
            }
            return true;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            if (yp80Var != null) {
                yp80Var.onError(e);
            }
            return false;
        }
    }
}
