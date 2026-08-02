package com.yandex.go.accessibility;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.accessibility.a;
import defpackage.bg;
import defpackage.cug;
import defpackage.lz60;
import defpackage.tje;
import defpackage.tse;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class a implements lz60 {
    public final Context a;
    public final tse b;
    public final Lifecycle c;
    public final cug d;
    public final bg e = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: bg
        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z) {
            cug cugVar = a.this.d;
            Boolean valueOf = Boolean.valueOf(z);
            cugVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("is_active", valueOf);
            cugVar.a.a("VoiceOver.StatusChange", hashMap, 1, new HashMap());
        }
    };
    public final AtomicBoolean f = new AtomicBoolean(false);

    /* JADX WARN: Type inference failed for: r1v1, types: [bg] */
    public a(Context context, tse tseVar, Lifecycle lifecycle, cug cugVar) {
        this.a = context;
        this.b = tseVar;
        this.c = lifecycle;
        this.d = cugVar;
    }

    @Override // defpackage.lz60
    public final void g() {
        if (this.f.getAndSet(true)) {
            return;
        }
        tje.N(this.b, null, null, new AccessibilityAnalytics$onLargestContentfulPaint$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "AccessibilityAnalytics";
    }
}
