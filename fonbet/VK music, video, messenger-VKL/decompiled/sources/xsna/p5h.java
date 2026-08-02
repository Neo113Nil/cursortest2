package xsna;

import android.content.Context;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.components.ComponentsFragment;
import com.vk.dialogssearch.api.di.ChannelSearchListComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.HighlightCover;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.im.ui.fragments.ImContactsListFragment;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import xsna.dw20;
import xsna.e3m;
import xsna.mgw.a;
import xsna.w1g0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class p5h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p5h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v53, types: [xsna.xti0] */
    /* JADX WARN: Type inference failed for: r1v70, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, T extends androidx.recyclerview.widget.RecyclerView$Adapter & xsna.vic] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter] */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerPaginatedView recyclerPaginatedView;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                s5h s5hVar = (s5h) obj;
                s5hVar.B6(false);
                s5hVar.A6(false);
                return s3q0.a;
            case 1:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) obj;
                int i3 = CommunityNotificationSettingsFragment.b0;
                HashMap hashMap = new HashMap();
                Iterator it = ((ArrayList) communityNotificationSettingsFragment.X.y0()).iterator();
                while (it.hasNext()) {
                    we6 we6Var = (we6) it.next();
                    if (we6Var.h() == 2) {
                        q3j0 q3j0Var = ((CommunityNotificationSettingsFragment.e) we6Var).g;
                        hashMap.put(String.valueOf(q3j0Var.a), Boolean.valueOf(q3j0Var.d));
                    }
                }
                String jSONObject = new JSONObject(hashMap).toString();
                UserId userId = new UserId(communityNotificationSettingsFragment.T);
                tfx tfxVar = new tfx("notifications.addGroupSource", new bz60(i2), new zn(24));
                tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                tfx.o(tfxVar, "params", jSONObject, 0, 0, 12);
                hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), communityNotificationSettingsFragment.mo2getContext(), 0L, false, 62).subscribe(new om1(new on(communityNotificationSettingsFragment, 29), 11), new pm1(new io3(10), 12));
                return s3q0.a;
            case 2:
                return ((MarketComponent) ((h7m) obj).a(fpf0.a(MarketComponent.class))).C3();
            case 3:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj;
                int i4 = CommunityRepliesFragment.d0;
                w1g0.h hVar = w1g0.h.b;
                communityRepliesFragment.getClass();
                xn50.a.c(communityRepliesFragment, hVar);
                return s3q0.a;
            case 4:
                int i5 = ComponentsFragment.T;
                ((ComponentsFragment) obj).finish();
                return s3q0.a;
            case 5:
                return (ImageView) ((k2j) obj).itemView.findViewById(R.id.edit_room_button);
            case 6:
                tij tijVar = (tij) obj;
                tijVar.d1();
                Context context = tijVar.e;
                dw20.b h0 = new dw20.b(context, null).M(R.drawable.vk_icon_lock_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent)).h0(R.string.privacy_closed_account_make_opened, new com.vk.movika.sdk.base.ui.f(tijVar, 27));
                l7s l7sVar = context instanceof l7s ? (l7s) context : null;
                ((dw20.b) dw20.a.Q(h0.u0(l7sVar != null ? l7sVar.getThemeResId() : -1).v0(tijVar.W0()), tijVar.V0())).I0("GoToAccountPrivacySettings");
                return s3q0.a;
            case 7:
                return ((ParticipantStore) obj).getActiveRoomId();
            case 8:
                final fhl fhlVar = (fhl) obj;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? adapter = fhlVar.a.getAdapter();
                ref$ObjectRef.element = adapter;
                if (adapter instanceof pd90) {
                    ref$ObjectRef.element = ((pd90) adapter).c;
                }
                final mf7 mf7Var = (mf7) ref$ObjectRef.element;
                oog0 oog0Var = new oog0(iah0.b(18.0f), iah0.a(8), new mf7() { // from class: xsna.chl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.mf7
                    public final int e0(int i6) {
                        int e0 = mf7Var.e0(i6);
                        fhl fhlVar2 = fhlVar;
                        if (fhlVar2.j()) {
                            return e0;
                        }
                        if (i6 == 0) {
                            e0 = (e0 & (-3)) | 1;
                        }
                        if (e0 == 0) {
                            e0 = 1;
                        }
                        return (i6 != ((RecyclerView.Adapter) ref$ObjectRef.element).getItemCount() - 1 || fhlVar2.j()) ? e0 : (e0 & (-5)) | 1;
                    }
                });
                oog0Var.n = true;
                oog0Var.o = fhlVar.j();
                if (fhlVar.j() && (recyclerPaginatedView = fhlVar.b) != null) {
                    recyclerPaginatedView.setDecoration(new cjf0());
                }
                return oog0Var;
            case 9:
                Context context2 = ((egm) obj).d;
                e3m.a aVar = e3m.a;
                return Integer.valueOf(context2.getColor(R.color.vkim_administration_title));
            case 10:
                ltm ltmVar = ((vtm) obj).k;
                if (ltmVar.isEnabled()) {
                    ltmVar.f();
                }
                return s3q0.a;
            case 11:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return new n2n(new mag((DiscoverMediaTabFragment2) obj, 13));
            case 12:
                ((lvo) obj).b.c();
                return s3q0.a;
            case 13:
                return ((w3p) obj).c;
            case 14:
                int i6 = FeedRecyclerPaginatedView.U;
                return (ClipsViewerComponent) ((k7m) m7m.c((FeedRecyclerPaginatedView) obj)).a(fpf0.a(ClipsViewerComponent.class));
            case 15:
                ?? r1 = ((iar) obj).g;
                return "fitFromFiles: session= " + (r1 != 0 ? r1 : null);
            case 16:
                ((apr) obj).b.invalidate();
                return s3q0.a;
            case 17:
                ((ahs) obj).getClass();
                return null;
            case 18:
                ijs ijsVar = ((FriendRequestsFragment) obj).a0;
                if (ijsVar != null) {
                    return ijsVar.k;
                }
                return null;
            case 19:
                return ((ChannelSearchListComponent) ((k7m) m7m.f((GlobalSearchChannelsCatalogRootVh) obj)).mo408a(fpf0.a(ChannelSearchListComponent.class))).Pe();
            case 20:
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                return new y4u(m7m.f((GoodFragment) obj));
            case 21:
                wh50 wh50Var = ((yju) obj).f;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                return s3q0.a;
            case 22:
                HighlightChooseCoverFragment highlightChooseCoverFragment = (HighlightChooseCoverFragment) obj;
                int i7 = HighlightChooseCoverFragment.R;
                HighlightCover y0 = ((HighlightChooseCoverFragment.c) highlightChooseCoverFragment.Q.getValue()).y0();
                if (y0 != null) {
                    ((sw50) highlightChooseCoverFragment.P.getValue()).h().g(y0.f()).g(1235, highlightChooseCoverFragment);
                }
                return s3q0.a;
            case 23:
                return (qct) ((qjv) obj).b.getValue();
            case 24:
                qcy<Object>[] qcyVarArr3 = ImContactsListFragment.k0;
                ((ImContactsListFragment) obj).finish();
                return s3q0.a;
            case 25:
                return "#restartEngine" + ((a1w) obj).r();
            case 26:
                Context d = ((l4w) obj).d();
                e3m.a aVar2 = e3m.a;
                return m33.a(R.drawable.vkim_bg_video_mosaic_duration, d);
            case 27:
                Context context3 = ((p7w) obj).e;
                return Boolean.FALSE;
            case 28:
                mgw mgwVar = (mgw) obj;
                return mgwVar.new a(new dhh(mgwVar, 25));
            default:
                return new z1n0(((v3y) obj).d);
        }
    }
}
