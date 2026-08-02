package xsna;

import android.app.Activity;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.Preference;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.im.engine.exceptions.CycleInvocationException;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.vkpay.checkout.api.dto.response.TransactionStatusResponse;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.sdk.api.login.LoginRequest;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.fit;
import xsna.q7n;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nu0 implements io.reactivex.rxjava3.functions.l, RatioFrameLayout.a, io.reactivex.rxjava3.functions.m, d0n0, io.reactivex.rxjava3.functions.g, Preference.c, Toolbar.h, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.core.a0, t4d0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.t4d0
    public void a(MediaStoreEntry mediaStoreEntry) {
        t4d0 t4d0Var = ((com.vk.preview.presentation.view.b) this.c).b;
        if (t4d0Var != null) {
            t4d0Var.a(mediaStoreEntry);
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (x960) ((mu0) this.c).invoke(obj);
            case 1:
            case 2:
            case 4:
            case 9:
            case 11:
            case 14:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            default:
                return (Integer) ((rvq) this.c).invoke(obj);
            case 3:
                return (Boolean) ((la2) this.c).invoke(obj);
            case 5:
                return (List) ((com.vk.libvideo.b) this.c).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((job) this.c).invoke(obj);
            case 7:
                return (TransactionStatusResponse.VkCheckoutTransactionStatus) ((izs) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((go1) this.c).invoke(obj);
            case 10:
                return (jkq0) ((la2) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.e) ((n99) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((la2) this.c).invoke(obj);
            case 15:
                return (SessionRoomId) ((la2) this.c).invoke(obj);
            case 16:
                return (a8k) ((go1) this.c).invoke(obj);
            case 19:
                return (ImBgSyncState) ((la2) this.c).invoke(obj);
            case 23:
                return (fhx0) ((fit.f) this.c).invoke(obj);
            case 24:
                return (Boolean) ((rvq) this.c).invoke(obj);
            case 25:
                return (it80) ((r9k) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.libvideo.b) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.t) ((r9k) this.c).invoke(obj);
        }
    }

    @Override // xsna.d0n0
    public void b(c0n0 c0n0Var) {
        ClipItemViewEvent clipItemViewEvent;
        j1d j1dVar = ((o1d) this.c).x0;
        if (c0n0Var instanceof b0n0) {
            clipItemViewEvent = z5d.b;
        } else {
            if (!(c0n0Var instanceof a0n0)) {
                throw new NoWhenBranchMatchedException();
            }
            clipItemViewEvent = y5d.b;
        }
        j1dVar.a(clipItemViewEvent);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (xkh.a) ((yi4) this.c).invoke(obj, obj2, obj3);
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        debugDevSettingsFragment.o0.x(new y580(rsr.x("Test", new CycleInvocationException()), LoginRequest.CLIENT_NAME, false));
        return true;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) this.c;
        qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
        ((v6n) discoverSimilarFeedFragment.W.getValue()).a(q7n.d.b.b);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) this.c).E(menuItem);
        return true;
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        Activity activity = (Activity) this.c;
        if (yVar.h()) {
            return;
        }
        if (activity.isFinishing() || activity.isDestroyed()) {
            yVar.onSuccess(Boolean.FALSE);
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(activity, PermissionHelper.l, R.string.vk_permissions_camera_flashlight, R.string.vk_permissions_camera_flashlight, new b1h(yVar, 14), new znr(yVar, 0));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 2:
                return ((Boolean) ((la2) this.c).invoke(obj)).booleanValue();
            case 4:
                return ((Boolean) ((com.vk.movika.sdk.base.observable.c) this.c).invoke(obj)).booleanValue();
            case 11:
                return ((Boolean) ((qf5) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((pf4) this.c).invoke(obj)).booleanValue();
        }
    }
}
