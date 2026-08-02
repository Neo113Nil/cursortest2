package com.yandex.dsl.views;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ny61;
import defpackage.sls;

/* loaded from: classes11.dex */
public final class b {
    public final sls a;

    public b(sls slsVar) {
        this.a = slsVar;
    }

    public final View a(int i) {
        View view = ((XmlUi$views$1) this.a).this$0.b;
        if (!(view instanceof ViewGroup)) {
            if (view.getId() == i) {
                return view;
            }
            ny61.g("Not a viewgroup");
            return null;
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        ny61.g("View is not found");
        return null;
    }
}
