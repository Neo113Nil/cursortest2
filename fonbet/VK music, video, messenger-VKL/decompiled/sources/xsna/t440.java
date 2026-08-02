package xsna;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Parcelable;
import android.util.LruCache;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.view.SimpleLikeView;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.models.users.User;
import com.vk.libvideo.bottomsheet.about.delegate.d;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.music.player.service.MusicPlayerAction;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.search.model.VideoSearchFiltersImpl;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersViewState;
import com.vk.story.api.domain.interactor.upload.IPersistingStoryUpload;
import com.vk.voip.dto.AudioDevice;
import com.vkontakte.android.R;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Result;
import xsna.am;
import xsna.b4;
import xsna.df50;
import xsna.dn90;
import xsna.gm50;
import xsna.qn60;
import xsna.qr60;
import xsna.tsb0;
import xsna.x8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class t440 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t440(Context context, SimpleLikeView simpleLikeView) {
        this.b = 24;
        this.c = simpleLikeView;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 2;
        int i3 = 16;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return (StoryUploadParams) obj2;
            case 1:
                lb40 lb40Var = (lb40) obj2;
                ((wh50) ((zak0) lb40Var.h).getValue()).setValue(Boolean.FALSE);
                lb40Var.a.invoke((sx40) obj);
                return s3q0.a;
            case 2:
                g250 g250Var = (g250) obj2;
                Throwable th = (Throwable) obj;
                g250Var.h = null;
                if (th instanceof VKApiExecutionException) {
                    bn40.c(th, new Object[0]);
                    g250Var.g = ((VKApiExecutionException) th).getMessage();
                    if (g250Var.d.i == null) {
                        g250Var.y(new sj7(i2, g250Var, th));
                    } else {
                        g250Var.y(new x34(g250Var, th));
                    }
                }
                return s3q0.a;
            case 3:
                o550 o550Var = (o550) obj2;
                tc50 tc50Var = o550Var.m;
                if (tc50Var != null) {
                    o550Var.l.invoke(tc50Var.b);
                }
                return s3q0.a;
            case 4:
                df50.a.c cVar = (df50.a.c) obj;
                bf50 bf50Var = ((ve50) obj2).i1;
                (bf50Var != null ? bf50Var : null).a(cVar);
                return s3q0.a;
            case 5:
                uj60 uj60Var = (uj60) obj2;
                Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(uj60Var.m.f(new txf0(), new kjj0(uj60Var.n)));
                if (!(b instanceof Result.Failure)) {
                    qn60.c cVar2 = (qn60.c) b;
                    uj60Var.b.e(new kv60(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                }
                Throwable a = Result.a(b);
                if (a != null) {
                    com.vk.metrics.eventtracking.b.a.a(a);
                }
                return s3q0.a;
            case 6:
                ((bn90) obj2).T((dn90.b.C2743b) obj);
                return s3q0.a;
            case 7:
                L.i((Throwable) obj);
                ((o8a0) obj2).i.b(new x8a0.f(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_settings_error), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), null, null, null, 32)));
                return s3q0.a;
            case 8:
                ((vja0) obj2).a.getClass();
                return com.vk.voip.ui.c.d0();
            case 9:
                mxa0 mxa0Var = (mxa0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    PlayerUIComponent playerUIComponent = mxa0Var.c;
                    if (playerUIComponent.w4().b) {
                        LruCache<UUID, mzp0> lruCache = rzp0.a;
                        Pair c = rzp0.c(UiMeasuringScreen.MUSIC_PLAYER_CONTROLS, null, false, 62);
                        mzp0 mzp0Var = (mzp0) c.j();
                        mzp0Var.init();
                        mzp0Var.start();
                        e5b0 w4 = playerUIComponent.w4();
                        w4.a = (UUID) c.i();
                        w4.b = false;
                    }
                    tib tibVar = ox40.a;
                    tibVar.getClass();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Intent a2 = tibVar.a(context, MusicPlayerAction.ACTION_RESTORE_PLAYBACK_QUEUE, null);
                    a2.putExtra("EXTRA_NEED_RESET_STATE_ON_RESTORE", false);
                    ox40.c(a2, true);
                }
                return s3q0.a;
            case 10:
                ib50 ib50Var = (ib50) obj;
                ListDataSet<zif0> listDataSet = ((sib0) obj2).n;
                final e810 e810Var = new e810(ib50Var, i3);
                int w = listDataSet.w(new Predicate() { // from class: xsna.pib0
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj3) {
                        return ((Boolean) e810.this.invoke(obj3)).booleanValue();
                    }
                });
                if (w != -1) {
                    listDataSet.r(w, new eib0(ib50Var.a, 5), "payload_download_state");
                }
                return s3q0.a;
            case 11:
                ((lsb0) obj2).U(tsb0.e.a);
                return s3q0.a;
            case 12:
                Parcelable parcelable = (NewsEntry) obj2;
                ((wee0) parcelable).P4((Owner) obj);
                return parcelable;
            case 13:
                ((bdc0) obj2).a((FragmentActivity) obj);
                return s3q0.a;
            case 14:
                ((j1d0) obj2).i.add((d1d0) obj);
                return s3q0.a;
            case 15:
                e5d0 e5d0Var = (e5d0) obj2;
                Boolean bool = (Boolean) obj;
                f5d0 f5d0Var = e5d0Var.o;
                if (f5d0Var == null) {
                    return s3q0.a;
                }
                e5d0Var.o = f5d0.a(f5d0Var, User.zb(f5d0Var.a, null, null, null, !bool.booleanValue(), null, false, 0, null, false, null, -129), false, 14);
                return s3q0.a;
            case 16:
                Uri uri = (Uri) obj;
                Context applicationContext = ((Context) obj2).getApplicationContext();
                if (X3.i.b.equals(uri.getScheme())) {
                    try {
                        MediaScannerConnection.scanFile(applicationContext, new String[]{uri.getPath()}, null, null);
                    } catch (Exception unused) {
                    }
                }
                return s3q0.a;
            case 17:
                return new je90((ViewGroup) obj, 0, new fm20((m2g0) obj2, 21));
            case 18:
                gzs gzsVar = (gzs) obj2;
                if (gzsVar != null) {
                }
                return s3q0.a;
            case 19:
                ListDataSet listDataSet2 = (ListDataSet) obj2;
                SparseArray sparseArray = (SparseArray) obj;
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    listDataSet2.F(sparseArray.keyAt(i4), (u1c0) sparseArray.valueAt(i4));
                }
                return s3q0.a;
            case 20:
                SDKInviteDialog sDKInviteDialog = (SDKInviteDialog) obj2;
                Bitmap bitmap = (Bitmap) obj;
                sDKInviteDialog.V = bitmap;
                ImageView imageView = sDKInviteDialog.S;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                View view = sDKInviteDialog.U;
                if (view != null) {
                    bwt0.p0(view, false);
                }
                return s3q0.a;
            case 21:
                pch0 pch0Var = (pch0) obj2;
                pch0Var.f = (AudioDevice) obj;
                pch0Var.a();
                return s3q0.a;
            case 22:
                bth0 bth0Var = (bth0) obj2;
                int intValue = ((Integer) obj).intValue();
                VideoSearchFiltersImpl videoSearchFiltersImpl = bth0Var.v;
                videoSearchFiltersImpl.h = intValue;
                videoSearchFiltersImpl.l = ((ecr) bth0Var.u.a.a.get(intValue)).getType();
                VideoSearchFiltersImpl videoSearchFiltersImpl2 = bth0Var.v;
                videoSearchFiltersImpl2.e = epx.f(videoSearchFiltersImpl2.l, "live");
                bth0Var.Q4();
                return s3q0.a;
            case 23:
                ((am) obj).b(new am.a(16, ((VkToolButton) obj2).getContext().getString(R.string.accessibility_recent_query_tap_action)));
                return s3q0.a;
            case 24:
                SimpleLikeView simpleLikeView = (SimpleLikeView) obj2;
                int i5 = SimpleLikeView.f;
                o25.a().getClass();
                SimpleLikeView.b bVar = simpleLikeView.e;
                int i6 = bVar.a;
                boolean z = bVar.b;
                int i7 = z ? -1 : 1;
                boolean z2 = !z;
                simpleLikeView.e = new SimpleLikeView.b(i6 + i7, z2);
                Set<View> set = g6z.a;
                g6z.c(simpleLikeView, simpleLikeView.c, z2, true, 48);
                simpleLikeView.a(simpleLikeView.e.a);
                SimpleLikeView.a aVar = simpleLikeView.d;
                if (aVar != null) {
                    ((d.a) ((u5) aVar).c).l.d(new b4.h(simpleLikeView.e.b));
                }
                return s3q0.a;
            case 25:
                UserId userId = (UserId) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj) {
                    if (epx.f(((IPersistingStoryUpload) obj3).V7().j.b, userId)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 26:
                com.vk.stories.design.view.stats.tabs.viewers.mvi.d dVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.d) obj2;
                StoryStatisticsViewersViewState.a aVar2 = (StoryStatisticsViewersViewState.a) obj;
                gm50.a.a(dVar, aVar2.a, new fuc0(dVar, 12));
                gm50.a.a(dVar, aVar2.b, new j6l0(dVar, 7));
                gm50.a.a(dVar, aVar2.c, new bnc0(dVar, 13));
                gm50.a.a(dVar, aVar2.d, new xvl0(dVar, 3));
                return s3q0.a;
            case 27:
                ((com.vk.superapp.ui.a) obj2).t2(com.vk.superapp.ui.a.S1().z(), ((Boolean) obj).booleanValue(), false);
                return s3q0.a;
            case 28:
                ((x5q0) obj2).q.d();
                return s3q0.a;
            default:
                return new Pair((bwq0) obj, Boolean.valueOf(!((WallWithCounters) obj2).isEmpty()));
        }
    }

    public /* synthetic */ t440(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
