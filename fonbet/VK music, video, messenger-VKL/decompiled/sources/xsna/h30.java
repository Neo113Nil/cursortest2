package xsna;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.bridges.di.BridgeComponent;
import com.vk.common.links.LaunchContext;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinkSnippet;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.Good;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$ReferrerItemType;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: ActionLinksSnippetPresenter.kt */
/* loaded from: classes3.dex */
public final class h30 implements b30, w8i {
    public final Context b;
    public final VideoFile c;
    public final boolean d;
    public final Group e;
    public final UserProfile f;
    public final LiveStatNew g;
    public final String h;
    public ActionLinks i;
    public io.reactivex.rxjava3.observers.a m;
    public io.reactivex.rxjava3.disposables.c n;
    public dw20 p;
    public ActionLink q;
    public final sz00 j = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Ob();
    public final maz k = ((BridgeComponent) ((k7m) m7m.f(this)).a(fpf0.a(BridgeComponent.class))).p().e();
    public final d30 l = new d30();
    public boolean o = true;
    public final pxo0 r = new pxo0(1000);
    public final LinkedHashMap s = new LinkedHashMap();
    public final ArrayList t = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionLinksSnippetPresenter.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CHANGE;
        public static final a DELETE;
        public static final a GOTO;
        private final int iconResId;
        private final int id;
        private final boolean isNegative;
        private final int nameResId;

        static {
            a aVar = new a(0, false, "GOTO", R.id.live_action_link_goto, R.drawable.vk_icon_link_24, R.string.live_broadcast_goto_link);
            GOTO = aVar;
            a aVar2 = new a(1, false, "CHANGE", R.id.live_action_link_change, R.drawable.vk_icon_attach_24, R.string.live_broadcast_attach_action_replace);
            CHANGE = aVar2;
            a aVar3 = new a(2, true, "DELETE", R.id.live_action_link_delete, R.drawable.vk_icon_delete_24, R.string.live_broadcast_attach_action_hide);
            DELETE = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(int i, boolean z, String str, int i2, int i3, int i4) {
            this.id = i2;
            this.iconResId = i3;
            this.nameResId = i4;
            this.isNegative = z;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.id;
        }

        public final int i() {
            return this.nameResId;
        }

        public final boolean j() {
            return this.isNegative;
        }
    }

    public h30(Context context, VideoFile videoFile, boolean z, Group group, UserProfile userProfile, LiveStatNew liveStatNew, String str, ActionLinks actionLinks) {
        this.b = context;
        this.c = videoFile;
        this.d = z;
        this.e = group;
        this.f = userProfile;
        this.g = liveStatNew;
        this.h = str;
        this.i = actionLinks;
    }

    public final void a() {
        ActionLinkSnippet actionLinkSnippet;
        String str;
        ActionLink actionLink = this.q;
        if (actionLink != null) {
            String str2 = actionLink.c;
            anz T = fxc0.B().T();
            VideoFile videoFile = this.c;
            T.k(videoFile.o0(), videoFile.I0()).subscribe();
            boolean f = epx.f(str2, "poll");
            Context context = this.b;
            Good good = null;
            r6 = null;
            List list = null;
            good = null;
            if (f) {
                ActionLink actionLink2 = this.q;
                if (actionLink2 != null && (str = actionLink2.d) != null) {
                    list = drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                }
                if (list != null) {
                    qhp0.a().h(Integer.parseInt((String) list.get(1)), context, new UserId(Long.parseLong((String) list.get(0))));
                    return;
                }
                return;
            }
            if (!epx.f(str2, "product")) {
                maz.c(xwk.d().e(), this.b, actionLink.e, new LaunchContext(false, false, false, null, null, null, null, null, actionLink.e, "stream", null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108095), null, null, 24);
                return;
            }
            ActionLink actionLink3 = this.q;
            if (actionLink3 != null && (actionLinkSnippet = actionLink3.f) != null) {
                good = actionLinkSnippet.j;
            }
            Good good2 = good;
            if (good2 == null) {
                String str3 = actionLink.e;
                maz.c(this.k, this.b, str3, new LaunchContext(false, false, false, null, null, null, null, null, str3, "stream", null, false, false, false, null, null, null, null, CommonMarketStat$TypeRefSource.LIVES_SNIPPET, false, false, null, null, null, 66059519), null, null, 24);
                return;
            }
            String str4 = null;
            Integer num = null;
            SearchStatsLoggingInfo searchStatsLoggingInfo = null;
            Integer num2 = null;
            Long l = null;
            MobileOfficialAppsMarketStat$ReferrerItemType mobileOfficialAppsMarketStat$ReferrerItemType = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            this.j.e(context, new rz00(good2, CommonMarketStat$TypeRefSource.LIVES_SNIPPET, str4, num, searchStatsLoggingInfo, num2, l, mobileOfficialAppsMarketStat$ReferrerItemType, str5, str6, str7, str8, CommonMarketStat$TypeMarketContextContent.Type.LIVE, Integer.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, 36860));
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(ActionLink actionLink) {
        Good good;
        ActionLink actionLink2 = this.q;
        boolean z = (actionLink2 == null || actionLink == null || !epx.f(actionLink2.d, actionLink.d)) ? false : true;
        this.q = actionLink;
        if (z) {
            return;
        }
        ArrayList arrayList = this.t;
        if (actionLink == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((c30) it.next()).s();
            }
            return;
        }
        if (this.o) {
            String str = actionLink.c;
            String str2 = actionLink.e;
            LiveStatNew liveStatNew = this.g;
            liveStatNew.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("action_type", "show_link");
            bundle.putString(CampaignEx.JSON_KEY_LINK_TYPE, str);
            bundle.putString("link", str2);
            liveStatNew.b(bundle);
            qyk0.a().e("live_action", bundle);
            VideoFile videoFile = this.c;
            int o0 = videoFile.o0();
            UserId I0 = videoFile.I0();
            d30 d30Var = this.l;
            d30Var.getClass();
            ActionLinkSnippet actionLinkSnippet = actionLink.f;
            if (actionLinkSnippet != null && (good = actionLinkSnippet.j) != null) {
                lt00.h((lt00) d30Var.b.getValue(), Long.valueOf(good.b), Long.valueOf(good.c.b), null, CommonMarketStat$TypeRefSource.LIVES_SNIPPET, null, Integer.valueOf(o0), Long.valueOf(I0.b), CommonMarketStat$TypeMarketContextContent.Type.LIVE, 4);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c30) it2.next()).P();
        }
    }

    public final void c() {
        UserId userId = UserId.d;
        Group group = this.e;
        if (group != null) {
            userId = fkq0.e(group.c);
        } else {
            UserProfile userProfile = this.f;
            if (userProfile != null) {
                userId = userProfile.c;
            }
        }
        UserId userId2 = userId;
        qhp0.a().f(this.b, this.q, userId2, this.h, this.i, new lb(this, 2), new com.vk.movika.sdk.base.observable.k(this, 3));
    }
}
