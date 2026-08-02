package com.ybsdk.core.navigation;

import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import com.ybsdk.feature.kyc.internal.screens.photov2.b;
import defpackage.akf;
import defpackage.bkf;
import defpackage.ctb;
import defpackage.hix;
import defpackage.i3y;
import defpackage.qa50;
import defpackage.tfl0;
import defpackage.tt4;
import defpackage.wnx;
import defpackage.yfl0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\u0005J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006,"}, d2 = {"Lcom/ybsdk/core/navigation/BaseNavigationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lyfl0;", "Lbkf;", "<init>", "()V", "Lzy11;", "onResumeFragments", "onPause", "", "keyCode", "Landroid/view/KeyEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "Lhix;", "listener", "addListener", "(Lhix;)V", "removeListener", "", "fragmentTag", "isNewFragmentInsetsHandlingEnabled", "(Ljava/lang/String;)Z", "Lctb;", "Ltfl0;", "navigation$delegate", "Li3y;", "getNavigation", "()Lctb;", "navigation", "", "keyEventsListeners", "Ljava/util/List;", "router", "Ltfl0;", "getRouter", "()Ltfl0;", "getDrawSdkUnderSafeArea", "()Z", "drawSdkUnderSafeArea", "isShownAsSlidableView", "isNewBottomSheetInsetsHandlingEnabled", "core-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseNavigationActivity extends AppCompatActivity implements yfl0, bkf {
    private final /* synthetic */ akf $$delegate_0 = akf.a;

    /* renamed from: navigation$delegate, reason: from kotlin metadata */
    private final i3y navigation = a.a(new tt4(7));
    private final List<hix> keyEventsListeners = new ArrayList();
    private final tfl0 router = getNavigation().a;

    private final ctb getNavigation() {
        return (ctb) this.navigation.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ctb navigation_delegate$lambda$0() {
        return new ctb(new tfl0());
    }

    public void addListener(hix listener) {
        this.keyEventsListeners.add(listener);
    }

    public abstract qa50 createNavigator();

    @Override // defpackage.bkf
    public boolean getDrawSdkUnderSafeArea() {
        this.$$delegate_0.getClass();
        return false;
    }

    @Override // defpackage.yfl0
    public tfl0 getRouter() {
        return this.router;
    }

    @Override // defpackage.bkf
    public boolean isNewBottomSheetInsetsHandlingEnabled() {
        this.$$delegate_0.getClass();
        return false;
    }

    @Override // defpackage.bkf
    public boolean isNewFragmentInsetsHandlingEnabled(String fragmentTag) {
        this.$$delegate_0.getClass();
        return false;
    }

    @Override // defpackage.bkf
    public boolean isShownAsSlidableView() {
        this.$$delegate_0.getClass();
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        b viewModel;
        List<hix> list = this.keyEventsListeners;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                wnx wnxVar = (wnx) ((hix) it.next());
                wnxVar.getClass();
                if (event.getKeyCode() == 24 || event.getKeyCode() == 25) {
                    viewModel = wnxVar.a.getViewModel();
                    viewModel.i0();
                    return true;
                }
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        getNavigation().a.a.a = null;
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        getNavigation().a.a.b(createNavigator());
        super.onResumeFragments();
    }

    public void removeListener(hix listener) {
        this.keyEventsListeners.remove(listener);
    }
}
