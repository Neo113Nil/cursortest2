package xsna;

import android.content.Context;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.wkh0;

/* compiled from: SubscriptionDelegate.kt */
/* loaded from: classes17.dex */
public final class dym0 implements wkh0 {
    public final o0r0 a;
    public final String b;

    public dym0(o0r0 o0r0Var, String str) {
        this.a = o0r0Var;
        this.b = str;
    }

    public static VideoFile e(boolean z, UserId userId, VideoFile videoFile) {
        ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
        if (clipVideoFile == null) {
            return videoFile;
        }
        List<CoOwnerItem> list = clipVideoFile.N1;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (CoOwnerItem coOwnerItem : list) {
            if (epx.f(coOwnerItem.b, userId)) {
                Owner owner = coOwnerItem.d;
                owner.g(4, z);
                coOwnerItem = CoOwnerItem.zb(coOwnerItem, null, owner, null, 27);
            }
            arrayList.add(coOwnerItem);
        }
        return ClipVideoFile.Kb(clipVideoFile, false, null, null, arrayList, null, null, null, 8355839);
    }

    @Override // xsna.wkh0
    public final void a(Context context, nlh0 nlh0Var, wkh0.b bVar, String str, izs<? super SdkVideoFile, s3q0> izsVar) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        UserId b = dgd.b(nlh0Var.k());
        if (b == null) {
            return;
        }
        rq0 rq0Var = new rq0(izsVar, 2);
        UiTracker uiTracker = UiTracker.a;
        String name = UiTracker.c().name();
        UiTrackingScreen b2 = UiTracker.j.b();
        String name2 = (b2 == null || (mobileOfficialAppsCoreNavStat$EventScreen = b2.a) == null) ? null : mobileOfficialAppsCoreNavStat$EventScreen.name();
        FullSourceJoinApi.SourceType sourceType = FullSourceJoinApi.SourceType.CLIP;
        String h = sourceType.h();
        String h2 = sourceType.h();
        String m = cqm0.m(name);
        String m2 = name2 != null ? cqm0.m(name2) : null;
        String m3 = h != null ? cqm0.m(h) : null;
        String m4 = h2 != null ? cqm0.m(h2) : null;
        String str2 = this.b;
        int i = 5;
        yks0.k(tci.w(nlh0Var), context, false, null, null, new wyg(bVar, context, b, i), b, str, new FullSourceJoinApi(m, m2, m3, m4, str2 != null ? cqm0.m(str2) : null, null), new qhf(rq0Var, i), 12);
    }

    @Override // xsna.wkh0
    public final void b(Context context, UserId userId, SdkVideoFile sdkVideoFile, wkh0.b bVar, rzl0 rzl0Var) {
        if (epx.f(sdkVideoFile.I0(), userId)) {
            com.vk.metrics.eventtracking.b.a.q(new RuntimeException("Sub/unsubs to/from main author should be done with videoFileController"));
        }
        e4h.l(this.a.h0(), context, userId, new f1b0(this, userId, sdkVideoFile, bVar, context, rzl0Var, 1), null, 24);
    }

    @Override // xsna.wkh0
    public final void c(Context context, UserId userId, SdkVideoFile sdkVideoFile, wkh0.b bVar, wug0 wug0Var) {
        if (epx.f(sdkVideoFile.I0(), userId)) {
            com.vk.metrics.eventtracking.b.a.q(new RuntimeException("Sub/unsubs to/from main author should be done with videoFileController"));
        }
        io.reactivex.rxjava3.core.q a0 = o0r0.i(this.a, userId, false, sdkVideoFile.r(), false, null, 120).U(new j630(new y5m0(this, sdkVideoFile, userId), 18)).a0(io.reactivex.rxjava3.android.schedulers.a.b());
        if (!(bVar instanceof wkh0.b.a)) {
            if (!(bVar instanceof wkh0.b.C3939b)) {
                throw new NoWhenBranchMatchedException();
            }
            a0 = t7i.a(a0, context, context.getString(fkq0.b(userId) ? R.string.clip_author_subscribe_done_group : R.string.clip_author_subscribe_done_profile), context.getString(R.string.clip_action_progress));
        }
        a0.subscribe(new bym0(context, wug0Var));
    }

    @Override // xsna.wkh0
    public final void d(Context context, nlh0 nlh0Var, wkh0.b bVar, twb twbVar) {
        UserId b = dgd.b(nlh0Var.k());
        if (b == null) {
            return;
        }
        yks0.l(tci.w(nlh0Var), context, null, null, new rr3(bVar, context, b, 5), b, new g4(22, twbVar, nlh0Var), 12);
    }
}
