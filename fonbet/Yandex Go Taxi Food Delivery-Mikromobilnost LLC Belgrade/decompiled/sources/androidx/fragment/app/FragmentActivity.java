package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.core.app.e1;
import androidx.lifecycle.Lifecycle;
import defpackage.ccs;
import defpackage.o0d;
import defpackage.p0d;
import defpackage.qbs;
import defpackage.uyy;
import defpackage.xcs;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements androidx.core.app.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.t mFragmentLifecycleRegistry;
    final ccs mFragments;
    boolean mResumed;
    boolean mStopped;

    public FragmentActivity() {
        this.mFragments = new ccs(new l(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.t(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new o0d(2, this));
        addOnConfigurationChangedListener(new qbs(0, this));
        int i = 1;
        addOnNewIntentListener(new qbs(i, this));
        addOnContextAvailableListener(new p0d(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        l lVar = this.mFragments.a;
        lVar.w.b(lVar, lVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                a0 a0Var = fragment.mViewLifecycleOwner;
                if (a0Var != null) {
                    a0Var.b();
                    if (a0Var.x.w.a(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.x.i(state);
                        z = true;
                    }
                }
                if (fragment.mLifecycleRegistry.w.a(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.i(state);
                    z = true;
                }
            }
        }
        return z;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.a.w.f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                uyy.a(this).c(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.a.w.v(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.a.w;
    }

    @Deprecated
    public uyy getSupportLoaderManager() {
        return uyy.a(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_CREATE);
        xcs xcsVar = this.mFragments.a.w;
        xcsVar.J = false;
        xcsVar.K = false;
        xcsVar.Q.z = false;
        xcsVar.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.w.l();
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.a.w.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.w.u(5);
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.w.z(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_RESUME);
        xcs xcsVar = this.mFragments.a.w;
        xcsVar.J = false;
        xcsVar.K = false;
        xcsVar.Q.z = false;
        xcsVar.u(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            xcs xcsVar = this.mFragments.a.w;
            xcsVar.J = false;
            xcsVar.K = false;
            xcsVar.Q.z = false;
            xcsVar.u(4);
        }
        this.mFragments.a.w.z(true);
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_START);
        xcs xcsVar2 = this.mFragments.a.w;
        xcsVar2.J = false;
        xcsVar2.K = false;
        xcsVar2.Q.z = false;
        xcsVar2.u(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        xcs xcsVar = this.mFragments.a.w;
        xcsVar.K = true;
        xcsVar.Q.z = true;
        xcsVar.u(4);
        this.mFragmentLifecycleRegistry.g(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(e1 e1Var) {
        androidx.core.app.b.K(this, e1Var);
    }

    public void setExitSharedElementCallback(e1 e1Var) {
        androidx.core.app.b.L(this, e1Var);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.e.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.e.e(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.e.n(this);
    }

    @Override // androidx.core.app.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = new ccs(new l(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.t(this, true);
        this.mStopped = true;
        init();
    }
}
