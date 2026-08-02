package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.passport.R;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.base.FragmentBackStack;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.w53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class BaseBackStackActivity extends BaseActivity {
    private final FragmentBackStack fragmentBackStack = new FragmentBackStack();

    private void showFragment() {
        FragmentBackStack.BackStackEntry backStackEntry;
        j a;
        String str;
        Bundle bundle;
        int[] iArr;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a h = g8e.h(supportFragmentManager, supportFragmentManager);
        boolean z = supportFragmentManager.E(R.id.container) != null;
        FragmentBackStack fragmentBackStack = this.fragmentBackStack;
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        Stack stack = fragmentBackStack.a;
        if (stack.empty() || (backStackEntry = (FragmentBackStack.BackStackEntry) stack.peek()) == null) {
            a = null;
        } else {
            if (backStackEntry.fragment == null) {
                backStackEntry.fragment = supportFragmentManager2.F(backStackEntry.tag);
                if (backStackEntry.fragment == null) {
                    str = backStackEntry.className;
                    bundle = backStackEntry.arguments;
                    backStackEntry.fragment = Fragment.instantiate(this, str, bundle);
                }
            }
            backStackEntry.fragment.getLifecycle().a(backStackEntry);
            a = FragmentBackStack.a(backStackEntry);
        }
        if (a == null) {
            c0 c0Var = this.eventReporter;
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("error", Log.getStackTraceString(new Exception()));
            c0Var.a.a(com.yandex.passport.internal.analytics.k.d, w53Var);
            return;
        }
        if (z) {
            boolean z2 = a.d;
            int i = i.a[a.c.ordinal()];
            if (i == 1) {
                iArr = z2 ? j.e : j.f;
            } else if (i == 2) {
                iArr = z2 ? j.g : j.h;
            } else {
                if (i != 3) {
                    ny61.g("Unknown animation type");
                    return;
                }
                iArr = new int[]{0, 0};
            }
            h.i(iArr[0], iArr[1], 0, 0);
            h.c(null);
        }
        h.h(R.id.container, a.b, a.a);
        h.l(true, true);
    }

    public void closeDomik(Object obj) {
        finish();
    }

    public FragmentBackStack getFragmentBackStack() {
        return this.fragmentBackStack;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Stack stack = getFragmentBackStack().a;
        j a = stack.isEmpty() ? null : FragmentBackStack.a((FragmentBackStack.BackStackEntry) stack.peek());
        if (a != null) {
            Fragment fragment = a.b;
            if ((fragment instanceof BaseNextFragment) && ((BaseNextFragment) fragment).onBackPressed()) {
                return;
            }
        }
        getFragmentBackStack().c();
        if (getFragmentBackStack().a.isEmpty()) {
            finish();
        } else {
            showFragment();
        }
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            FragmentBackStack fragmentBackStack = getFragmentBackStack();
            fragmentBackStack.getClass();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("back-stack-entries");
            Stack stack = fragmentBackStack.a;
            stack.clear();
            stack.addAll(parcelableArrayList);
        }
        super.onCreate(bundle);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = getFragmentBackStack().a;
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            FragmentBackStack.BackStackEntry backStackEntry = (FragmentBackStack.BackStackEntry) it.next();
            if (backStackEntry.fragment != null) {
                backStackEntry.arguments = backStackEntry.fragment.getArguments();
            }
        }
        bundle.putParcelableArrayList("back-stack-entries", new ArrayList<>(stack));
    }

    public void showFragment(m mVar) {
        FragmentBackStack fragmentBackStack = getFragmentBackStack();
        Stack stack = fragmentBackStack.a;
        mVar.getClass();
        Callable callable = mVar.a;
        if (callable == null) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        } else {
            if (!mVar.c) {
                fragmentBackStack.c();
            }
            if (!stack.isEmpty()) {
                ((FragmentBackStack.BackStackEntry) stack.peek()).animationTypeBackward = mVar.d;
            }
            try {
                Fragment fragment = (Fragment) callable.call();
                stack.push(new FragmentBackStack.BackStackEntry(mVar.b, fragment.getClass().getName(), fragment.getArguments(), fragment, mVar.d, null));
                fragmentBackStack.b();
            } catch (Exception e) {
                ny61.o(e);
                return;
            }
        }
        if (getFragmentBackStack().a.isEmpty()) {
            finish();
        } else {
            showFragment();
        }
    }
}
