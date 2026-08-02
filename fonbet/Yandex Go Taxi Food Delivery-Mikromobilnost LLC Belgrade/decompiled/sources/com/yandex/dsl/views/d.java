package com.yandex.dsl.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ms11;
import defpackage.ny61;

/* loaded from: classes11.dex */
public abstract class d implements ms11 {
    public final Context a;
    public final View b;
    public final b c;

    public d(Context context, int i) {
        this.a = context;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService == null) {
            ny61.t("null cannot be cast to non-null type android.view.LayoutInflater");
            throw null;
        }
        View inflate = ((LayoutInflater) systemService).inflate(i, (ViewGroup) null, false);
        if (inflate == null) {
            ny61.t("null cannot be cast to non-null type V of splitties.views.LayoutInflaterKt.inflate");
            throw null;
        }
        this.b = inflate;
        this.c = new b(new XmlUi$views$1(this));
    }

    @Override // defpackage.ms11
    public final View getRoot() {
        return this.b;
    }
}
