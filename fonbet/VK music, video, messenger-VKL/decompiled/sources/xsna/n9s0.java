package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoUploadClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.NoWhenBranchMatchedException;
import xsna.av20;
import xsna.l9s0;
import xsna.mot0;

/* compiled from: VideoCatalogNewContentBottomSheet.kt */
/* loaded from: classes16.dex */
public final class n9s0 implements av20.b<l9s0.b> {
    public final /* synthetic */ l9s0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Owner c;

    public n9s0(l9s0 l9s0Var, Context context, Owner owner) {
        this.a = l9s0Var;
        this.b = context;
        this.c = owner;
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        UserId userId;
        UserId userId2;
        UserId c;
        l9s0.b bVar = (l9s0.b) obj;
        l9s0 l9s0Var = this.a;
        Owner owner = this.c;
        if (owner == null) {
            ((zvr0) l9s0Var.b.getValue()).getClass();
            owner = null;
        }
        int i2 = l9s0.c.$EnumSwitchMapping$0[bVar.ordinal()];
        Context context = this.b;
        if (i2 == 1) {
            Activity h = e3m.h(context);
            if (h != null) {
                g7s0 B = fxc0.B();
                if (owner == null || (userId = owner.b) == null) {
                    userId = UserId.d;
                }
                B.a0(h, userId, owner != null ? owner.c : null, owner != null ? owner.d : null, "catalog_add", com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CATALOG));
            }
        } else if (i2 == 2) {
            if (owner == null || (userId2 = owner.b) == null) {
                userId2 = UserId.d;
            }
            g7s0 B2 = fxc0.B();
            fkq0.b(userId2);
            int i3 = g7s0.G7;
            B2.n(context, userId2);
        } else if (i2 == 3) {
            bpn0 bpn0Var = null;
            Activity h2 = e3m.h(context);
            if (h2 != null) {
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.TRY_UPLOAD_VIDEO, MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventSubtype.FROM_COMMUNITY), 2)).q();
                if (owner == null || (c = owner.b) == null) {
                    bpn0 bpn0Var2 = o25.a;
                    if (bpn0Var2 != null) {
                        bpn0Var = bpn0Var2;
                    }
                    c = ((b25) bpn0Var.getValue()).c();
                }
                mot0.b(mot0.a.a, h2, c, 0, null, 28);
            }
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, null, null, null, null, null, 62, null), new MobileOfficialAppsVideoStat$TypeVideoUploadClick(MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventType.TRY_UPLOAD_CLIP, MobileOfficialAppsVideoStat$TypeVideoUploadClick.EventSubtype.FROM_COMMUNITY), 2)).q();
            ((ClipsEntryPointsComponent) l9s0Var.c.getValue()).e().a(context, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.COMMUNITY, null, null, BuildInfo.q(), BuildInfo.q(), owner != null ? owner.b : null, BuildInfo.q(), null, 134, null));
        }
        dw20 dw20Var = l9s0Var.d;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }
}
