package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.X3;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.catalog2.common.dto.api.replacement.CatalogReplacementResponse;
import com.vk.common.links.LinksParserData;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.tabs.SkeletonTabLayout;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.core.view.AppBarShadowView;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.user.UserProfile;
import com.vk.home.HomeFragment2;
import com.vk.pending.PendingGraffitiAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.ui.widget.MenuListView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandOnErrorListener;
import ru.ok.android.webrtc.protocol.commands.UpdateDisplayLayoutV2Command;
import ru.ok.android.webrtc.topology.server.layout.DiffDisplayLayouts;
import xsna.bzp0;
import xsna.m99;
import xsna.ngl;
import xsna.vp1;
import xsna.wfu;
import xsna.zd9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l8 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, PhotoFlowToolbarView.c, zd9.d, io.reactivex.rxjava3.functions.d, Preference.c, RtcCommandOnErrorListener, ngl.a, pcs, AppBarShadowView.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public void a(int i) {
        HomeFragment2 homeFragment2 = (HomeFragment2) this.c;
        int i2 = HomeFragment2.x0;
        boolean z = i != 2;
        SkeletonTabLayout skeletonTabLayout = homeFragment2.T;
        if (skeletonTabLayout != null) {
            skeletonTabLayout.setBottomLineVisible(z);
        }
        VkBlurView vkBlurView = homeFragment2.u0;
        if (vkBlurView != null) {
            bwt0.p0(vkBlurView, i == 2);
        }
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.c
    public void a0() {
        ((com.vk.movika.sdk.base.logic.interactor.p) this.c).invoke(vp1.a.b);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        CharSequence charSequence;
        switch (this.b) {
            case 0:
                return (io.reactivex.rxjava3.core.t) ((k8) this.c).invoke(obj);
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((lb) this.c).invoke(obj);
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 12:
            case 19:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                return (uhi0) ((u620) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((lb) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((wi6) this.c).invoke(obj);
            case 8:
                return (m99.a) ((lb) this.c).invoke(obj);
            case 11:
                return (CatalogReplacementResponse) ((k8) this.c).invoke(obj);
            case 13:
                return (fob) ((lob) this.c).invoke(obj);
            case 14:
                return (Long) ((lb) this.c).invoke(obj);
            case 15:
                return (List) ((j60) this.c).invoke(obj);
            case 16:
                return (wfu.a) ((j60) this.c).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((k8) this.c).invoke(obj);
            case 18:
                return (n7k) ((j60) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((k8) this.c).invoke(obj);
            case 24:
                return (dmt) ((fgh) this.c).invoke(obj);
            case 27:
                MenuListView menuListView = (MenuListView) this.c;
                List<UserProfile> list = (List) obj;
                CopyOnWriteArrayList copyOnWriteArrayList = menuListView.r;
                copyOnWriteArrayList.clear();
                if (list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    Date date = new Date(System.currentTimeMillis());
                    String str = date.getDate() + "." + (date.getMonth() + 1) + ".";
                    boolean z = false;
                    for (UserProfile userProfile : list) {
                        if (userProfile.p.startsWith(str)) {
                            z = true;
                        }
                        if (!z || userProfile.p.startsWith(str)) {
                            arrayList.add("[id" + userProfile.c + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + (userProfile.n() != null ? userProfile.n() : userProfile.d) + X3.j.e);
                            copyOnWriteArrayList.add(userProfile);
                        }
                    }
                    charSequence = xwk.d().a().d(menuListView.getContext().getResources().getString(z ? R.string.birthday_today : R.string.birthday_tomorrow, TextUtils.join(", ", arrayList)), new LinksParserData(2));
                    if (!z) {
                        copyOnWriteArrayList.clear();
                    }
                } else {
                    charSequence = "";
                }
                return charSequence.toString();
            case 28:
                return (io.reactivex.rxjava3.core.b0) ((u620) this.c).invoke(obj);
        }
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        cop copVar = (cop) ((vop) this.c).a;
        if (copVar != null) {
            copVar.v4();
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.kn();
        io.reactivex.rxjava3.internal.operators.observable.g0.b.subscribe(new f9b());
        return true;
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandOnErrorListener
    public void onRtcCommandError(RtcCommand rtcCommand, Throwable th) {
        ((DiffDisplayLayouts) this.c).b((UpdateDisplayLayoutV2Command) rtcCommand, th);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) this.c;
        int i = GraffitiDrawingFragment.Q;
        PendingGraffitiAttachment pendingGraffitiAttachment = (PendingGraffitiAttachment) bundle.getParcelable("GRAFFITI_PREVIEW_ATTACH");
        Intent intent = new Intent();
        intent.putExtra("result_new_graffiti", pendingGraffitiAttachment);
        graffitiDrawingFragment.Mf(-1, intent);
    }

    @Override // io.reactivex.rxjava3.functions.d
    public boolean test(Object obj, Object obj2) {
        return ((Boolean) ((a9b) this.c).invoke(obj, obj2)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((j60) this.c).invoke(obj)).booleanValue();
            case 5:
                return ((Boolean) ((z43) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((j60) this.c).invoke(obj)).booleanValue();
            case 9:
                return ((Boolean) ((lb) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((fgh) this.c).invoke(obj)).booleanValue();
        }
    }
}
