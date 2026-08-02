package com.ybsdk.navigation;

import android.os.Bundle;
import com.ybsdk.navigation.NavigationFragment;
import defpackage.dxj0;
import defpackage.pg51;
import defpackage.y750;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class b {
    public static NavigationFragment a(pg51 pg51Var, InternalScreenIntent internalScreenIntent, LinkedHashMap linkedHashMap, y750 y750Var) {
        NavigationFragment navigationFragment = new NavigationFragment(new dxj0(pg51Var.a), y750Var, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("fragment_arguments", new NavigationFragment.NavigationFragmentArguments(pg51Var.b, internalScreenIntent, linkedHashMap));
        navigationFragment.setArguments(bundle);
        return navigationFragment;
    }
}
