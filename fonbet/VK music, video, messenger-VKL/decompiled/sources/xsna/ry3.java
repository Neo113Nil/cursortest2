package xsna;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.feature.music.holders.artist.MusicPageToolbarVh;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.reporters.syncstate.ImSyncStateStatReporter;
import com.vk.im.engine.reporters.syncstate.c;
import com.vk.newsfeed.api.posting.viewpresenter.PreviewRatio;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.u4a;
import xsna.xx30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class ry3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ry3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.d;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.e;
                j0d0 j0d0Var = (j0d0) ref$ObjectRef.element;
                if (j0d0Var.b.a(j0d0Var)) {
                    ((j0d0) ref$ObjectRef.element).b.i(e0Var);
                    j0d0 j0d0Var2 = (j0d0) ref$ObjectRef.element;
                    j0d0Var2.b.e(j0d0Var2, "create");
                    ref$BooleanRef.element = true;
                }
                return s3q0.a;
            case 1:
                h6p0 h6p0Var = (h6p0) this.c;
                yvj yvjVar = (yvj) this.d;
                wh50 wh50Var = (wh50) this.e;
                if (h6p0Var.isVisible()) {
                    myc0.h(yvjVar, null, null, new ku6(h6p0Var, null), 3);
                    wh50Var.setValue(Boolean.FALSE);
                }
                return s3q0.a;
            case 2:
                wgb wgbVar = (wgb) this.c;
                return wgbVar.s + ": loadNextFromNetwork: loaded fetched from cache since=" + ((aeb) this.d) + ", size = " + ((sfb) this.e).a.size();
            case 3:
                ovw ovwVar = (ovw) this.c;
                InfoBar infoBar = (InfoBar) this.d;
                InfoBar.Button button = (InfoBar.Button) this.e;
                pvw pvwVar = ovwVar.l;
                String str = infoBar.b;
                if (epx.f(str, "gifts_birthdays")) {
                    pvwVar.f(infoBar);
                } else {
                    pvwVar.d(infoBar, button);
                }
                if (epx.f(str, "gifts_holidays")) {
                    iid0 iid0Var = new iid0();
                    UiTracker uiTracker = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_GIFTS_ACTION_BUTTON, null), 3);
                    iid0Var.f = c;
                    iid0Var.g = b;
                    iid0Var.q();
                } else if (epx.f(str, "gifts_birthdays")) {
                    InfoBar.Payload.GiftsBirthdays.User user = ovwVar.p;
                    UserId userId = user != null ? user.b : null;
                    iid0 iid0Var2 = new iid0();
                    UiTracker uiTracker2 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                    SchemeStat$TypeAction b2 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("gifts_birthdays_single", MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_GIFTS_ACTION_BUTTON, userId != null ? Long.valueOf(userId.b) : null), 3);
                    iid0Var2.f = c2;
                    iid0Var2.g = b2;
                    iid0Var2.q();
                } else {
                    String str2 = infoBar.b;
                    iid0 iid0Var3 = new iid0();
                    UiTracker uiTracker3 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                    SchemeStat$TypeAction b3 = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem(str2, MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK, null, 4, null), 3);
                    iid0Var3.f = c3;
                    iid0Var3.g = b3;
                    iid0Var3.q();
                }
                return s3q0.a;
            case 4:
                f1m f1mVar = (f1m) this.c;
                xvy xvyVar = (xvy) this.d;
                lsy lsyVar = (lsy) this.e;
                wuy wuyVar = (wuy) f1mVar.getValue();
                return new zuy(xvyVar, wuyVar, lsyVar, new androidx.compose.foundation.lazy.layout.d((k9x) xvyVar.e.e.getValue(), wuyVar));
            case 5:
                a1w a1wVar = (a1w) this.c;
                b25 b25Var = (b25) this.d;
                jx30 jx30Var = (jx30) this.e;
                return new xx30(a1wVar, b25Var, new xx30.b((sqw) jx30Var.f.getValue(), (r9f0) jx30Var.g.getValue(), (sqw) jx30Var.h.getValue(), (r9f0) jx30Var.i.getValue(), (my8) jx30Var.a.getValue(), (xcj) jx30Var.b.getValue(), (rmm) jx30Var.c.getValue(), (tw30) jx30Var.d.getValue(), (q2u) jx30Var.e.getValue()), (fy30) jx30Var.j.getValue(), (dy30) jx30Var.k.getValue(), (ey30) jx30Var.l.getValue());
            case 6:
                MusicArtistCatalogRootVh musicArtistCatalogRootVh = (MusicArtistCatalogRootVh) this.c;
                kbj0 kbj0Var = (kbj0) this.d;
                Bundle bundle = (Bundle) this.e;
                u4a u4aVar = musicArtistCatalogRootVh.m;
                mba mbaVar = u4aVar.c.a;
                u4a.a aVar = u4aVar.b;
                return new MusicPageToolbarVh(mbaVar, aVar.f, kbj0Var, aVar.c, bundle != null ? bundle.getBoolean("music_kids_mode_enabled") : false);
            case 7:
                qcc0 qcc0Var = (qcc0) this.c;
                Context context = (Context) this.d;
                PreviewRatio previewRatio = (PreviewRatio) this.e;
                qcc0Var.getClass();
                TextView textView = new TextView(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                float f = 12;
                layoutParams.setMargins(iah0.a(f), iah0.a(9), iah0.a(f), iah0.a(10));
                textView.setLayoutParams(layoutParams);
                textView.setText(context.getString(R.string.crop_zoom_onboarding_tooltip, Integer.valueOf(previewRatio.b()), Integer.valueOf(previewRatio.a())));
                textView.setTextSize(14.0f);
                textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
                return textView;
            default:
                com.vk.im.engine.reporters.syncstate.c cVar = (com.vk.im.engine.reporters.syncstate.c) this.c;
                ImSyncStateStatReporter.Target target = (ImSyncStateStatReporter.Target) this.d;
                wzf wzfVar = (wzf) this.e;
                c.a aVar2 = (c.a) cVar.b.remove(target);
                if (aVar2 != null) {
                    synchronized (aVar2) {
                        wzfVar.invoke(p4g.d(aVar2.b));
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
                return s3q0.a;
        }
    }
}
