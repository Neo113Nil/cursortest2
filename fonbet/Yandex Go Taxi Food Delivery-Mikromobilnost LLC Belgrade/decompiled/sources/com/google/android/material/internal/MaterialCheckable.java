package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.MaterialCheckable;
import defpackage.q710;

/* loaded from: classes11.dex */
public interface MaterialCheckable<T extends MaterialCheckable<T>> extends Checkable {
    int getId();

    void setInternalOnCheckedChangeListener(q710 q710Var);
}
