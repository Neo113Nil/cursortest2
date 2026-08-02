package xsna;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.BundleUtil;
import com.unity3d.ads.BuildConfig;
import com.vk.auth.restore.RestoreReason;
import com.vk.auth.verification.base.stats.VerificationStatFlow;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoVerticalAlbumVh;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UserDiscoverState;
import com.vk.friends.discover.UsersDiscoverFragment;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import com.vk.friends.discover.UsersDiscoverListView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.oauth.vtb.verification.VkVtbVerificationActivity;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vk.voip.ui.media_request.VoipEnableOwnMicAndVideoRequestedDialog;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.eo70;
import xsna.j9d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class fem0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fem0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r0 == false) goto L63;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object obj;
        Object parcelable;
        boolean z;
        String str;
        int i = this.b;
        String str2 = "";
        boolean z2 = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = hem0.y1;
                return ((StoryViewerComponent) m7m.d((hem0) obj2).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 1:
                Bundle requireArguments = ((zkn0) obj2).requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("arg_validate_info", ValidateInfo.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("arg_validate_info");
                    obj = (ValidateInfo) (parcelable2 instanceof ValidateInfo ? parcelable2 : null);
                }
                ValidateInfo validateInfo = (ValidateInfo) obj;
                return validateInfo == null ? new ValidateInfo(false, "", new ValidateInfo.NextStep("", false), "") : validateInfo;
            case 2:
                qxn0 qxn0Var = (qxn0) obj2;
                String str3 = qxn0Var.a;
                String c = z23.c("[^a-zA-Z0-9_]", str3, BundleUtil.UNDERLINE_TAG);
                String str4 = c.length() > 0 ? c : null;
                if (str4 == null) {
                    str4 = BuildConfig.FLAVOR;
                }
                String D0 = erm0.D0(50, str4);
                if (!Character.isLetter(erm0.x0(D0)) && erm0.x0(D0) != '_') {
                    D0 = "table_".concat(D0);
                }
                String b = go9.b("drafts_", D0);
                qxn0Var.b.e(y57.a("Created table name ", b, " from provided table name ", str3));
                return b;
            case 3:
                com.vk.photo.editor.features.markup.text.a aVar = (com.vk.photo.editor.features.markup.text.a) obj2;
                aVar.J();
                vlo d = aVar.r.d();
                c5p c5pVar = aVar.p;
                List<uap> list = d.a;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Object meta = ((uap) it.next()).getMeta();
                    TextStatEvent.e eVar = meta instanceof TextStatEvent.e ? (TextStatEvent.e) meta : null;
                    if (eVar != null) {
                        arrayList.add(eVar);
                    }
                }
                c5pVar.b(new TextStatEvent.d(arrayList));
                aVar.d.c(true);
                return s3q0.a;
            case 4:
                return m7m.d(((vxq0) obj2).b);
            case 5:
                UsersDiscoverListView usersDiscoverListView = ((UsersDiscoverFragment) obj2).U;
                if (usersDiscoverListView != null) {
                    RecyclerView.o layoutManager = usersDiscoverListView.getLayoutManager();
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
                    if (usersDiscoverLayoutManager != null) {
                        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
                        UserDiscoverState.Status status = userDiscoverState.a;
                        UserDiscoverSmoothScroller.ScrollType scrollType = (status == UserDiscoverState.Status.PauseButtonSwipeAnimating || status == UserDiscoverState.Status.ButtonSwipeAnimating) ? UserDiscoverSmoothScroller.ScrollType.ButtonAccept : UserDiscoverSmoothScroller.ScrollType.ManualSwipe;
                        userDiscoverState.g = userDiscoverState.f + 1;
                        UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(scrollType, usersDiscoverLayoutManager);
                        userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
                        usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                    }
                }
                return s3q0.a;
            case 6:
                int i3 = VideoCatalogRootVh.M0;
                return new nht0((Activity) obj2);
            case 7:
                return Boolean.valueOf(((g7s0) obj2).J().n0());
            case 8:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj2;
                com.vk.video.ui.discovery.minimizable.m mVar = videoMinimizableDiscoveryFragment.J0;
                if (mVar == null || !mVar.j()) {
                    MiniPlayerControllersWrapper miniPlayerControllersWrapper = videoMinimizableDiscoveryFragment.X;
                    if (miniPlayerControllersWrapper == null) {
                        z = false;
                        break;
                    } else {
                        z = epx.f(miniPlayerControllersWrapper.b(), Boolean.TRUE);
                        break;
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 9:
                return Boolean.valueOf(((VideoVerticalAlbumVh) obj2).f.J().u1());
            case 10:
                ggu0 ggu0Var = (ggu0) obj2;
                return new v6r0(ggu0Var.s(), ggu0Var.d, ggu0Var, ggu0Var.m(), new cqr0(ggu0Var, 12));
            case 11:
                ((com.vk.core.compose.component.datetime.g) obj2).e(false);
                return s3q0.a;
            case 12:
                List<Class<? extends View>> list2 = VkFormField.C;
                return (TextView) ((VkFormField) obj2).findViewById(R.id.vk_form_item_layout_after_text);
            case 13:
                g0v0 g0v0Var = (g0v0) obj2;
                g0v0Var.c.N3();
                RecyclerPaginatedView recyclerPaginatedView = g0v0Var.g;
                if (recyclerPaginatedView != null) {
                    recyclerPaginatedView.e0();
                }
                return s3q0.a;
            case 14:
                w6v0 w6v0Var = ((c7v0) obj2).g;
                if (w6v0Var == null) {
                    w6v0Var = null;
                }
                com.vk.auth.main.b bVar = w6v0Var.d;
                com.vk.auth.main.b bVar2 = bVar != null ? bVar : null;
                eo70.c.a.b bVar3 = w6v0Var.E;
                if (bVar3 != null && (str = bVar3.a) != null) {
                    str2 = str;
                }
                bVar2.S0(new RestoreReason.PrimaryFactorChoice(str2, VerificationStatFlow.AUTH));
                return s3q0.a;
            case 15:
                int i4 = VkVtbVerificationActivity.p;
                Bundle extras = ((VkVtbVerificationActivity) obj2).getIntent().getExtras();
                return Boolean.valueOf(extras != null ? extras.getBoolean("arg_vtb_test_config", false) : false);
            case 16:
                return (RecyclerView) ((bgw0) obj2).b().findViewById(R.id.call_by_link_recycler);
            case 17:
                VoipEnableOwnMicAndVideoRequestedDialog voipEnableOwnMicAndVideoRequestedDialog = (VoipEnableOwnMicAndVideoRequestedDialog) obj2;
                voipEnableOwnMicAndVideoRequestedDialog.b.invoke(VoipEnableOwnMicAndVideoRequestedDialog.RequestMedia.MICROPHONE);
                dw20 dw20Var = voipEnableOwnMicAndVideoRequestedDialog.c;
                if (dw20Var != null) {
                    dw20Var.hide();
                }
                return s3q0.a;
            case 18:
                return new iln0(((f6x0) obj2).a.getContext());
            case 19:
                kix0 kix0Var = (kix0) obj2;
                return new ejx0(kix0Var.a, kix0Var.b, kix0Var.c, kix0Var.d);
            case 20:
                ((glx0) obj2).e(j9d0.h.a);
                return s3q0.a;
            default:
                return (ImageView) ((c1y0) obj2).a.findViewById(R.id.writebar_fullscreen_button);
        }
    }
}
