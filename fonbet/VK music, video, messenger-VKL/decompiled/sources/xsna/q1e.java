package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.core.fragments.transition.TransitionOption$Type;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vkontakte.android.R;
import xsna.chd;

/* compiled from: ClipsEntryPointsLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class q1e implements p1e {
    public final bpn0 a;

    public q1e(bpn0 bpn0Var) {
        this.a = bpn0Var;
    }

    @Override // xsna.p1e
    public final void a(Context context, ClipsEntryPointsParams clipsEntryPointsParams) {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint = clipsEntryPointsParams.b;
        UserId userId = clipsEntryPointsParams.g;
        if (userId != null) {
            ((rhd) this.a.getValue()).h(chd.a.a(userId), false);
        }
        bpn0 bpn0Var = enj.a;
        Activity h = e3m.h(context);
        PermissionHelper.a.getClass();
        if (PermissionHelper.p(h, PermissionHelper.e) != PermissionHelper.PermissionResult.ALLOWED) {
            pkd f = g620.f();
            bc6 L = xa4.L(context);
            String b = wrp.b(creationEntryPoint);
            String b2 = wrp.b(creationEntryPoint);
            UserId userId2 = clipsEntryPointsParams.g;
            StoryMusicInfo storyMusicInfo = clipsEntryPointsParams.c;
            pkd.A(f, L, 0, b, b2, null, null, null, null, storyMusicInfo != null ? storyMusicInfo.b : null, 0, clipsEntryPointsParams.d, null, null, null, null, false, userId2, 129778);
            return;
        }
        ClipsEntryPointsFragment.a aVar = new ClipsEntryPointsFragment.a(ClipsEntryPointsFragment.class, null, null);
        int color = context.getColor(R.color.vk_black);
        Bundle bundle = aVar.j;
        bundle.putInt("background_color", color);
        bundle.putParcelable("arg_entry_points_params", clipsEntryPointsParams);
        aVar.u(TransitionOption$Type.TRANSITION_SLIDE_FROM_BOTTOM.h());
        dhr0.a.getClass();
        aVar.w(dhr0.u().c);
        aVar.s(true);
        aVar.k(context);
    }
}
