package xsna;

import android.content.Context;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PrivacyDelegate.kt */
/* loaded from: classes7.dex */
public final class ucd0 {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(gce0 gce0Var, ContinuationImpl continuationImpl) {
        tcd0 tcd0Var;
        int i;
        Object g;
        Throwable a;
        if (continuationImpl instanceof tcd0) {
            tcd0Var = (tcd0) continuationImpl;
            int i2 = tcd0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tcd0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = tcd0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tcd0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ice0 ice0Var = gce0Var.e;
                    UserId userId = ((PublishState) gce0Var.b.getCurrentState()).h;
                    tcd0Var.L$0 = gce0Var;
                    tcd0Var.label = 1;
                    g = ice0Var.g(userId, tcd0Var);
                    if (g == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gce0Var = (gce0) tcd0Var.L$0;
                    kotlin.a.a(obj);
                    g = ((Result) obj).d();
                }
                if (!(g instanceof Result.Failure)) {
                    rdi.y(gce0Var, new r8a0((l6t0) g, 8));
                }
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                a = Result.a(g);
                if (a != null) {
                    bVar.a(a);
                }
                return s3q0.a;
            }
        }
        tcd0Var = new tcd0(continuationImpl);
        Object obj2 = tcd0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tcd0Var.label;
        if (i != 0) {
        }
        if (!(g instanceof Result.Failure)) {
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        a = Result.a(g);
        if (a != null) {
        }
        return s3q0.a;
    }

    public static final String b(String str, Context context, DonutLevel donutLevel) {
        if (donutLevel == null) {
            return str;
        }
        String str2 = donutLevel.c;
        return !drm0.N(str2) ? donutLevel.e ? context.getString(R.string.video_donut_level_format, str2) : context.getString(R.string.video_donut_level_with_higher_format, str2) : str;
    }
}
