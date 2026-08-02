package com.yandex.go.shortcuts.impl.view.adapter;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.go.shortcuts.dto.response.CountersShowPolicy;
import com.yandex.go.shortcuts.dto.response.MediaStories;
import com.yandex.go.shortcuts.dto.response.f0;
import defpackage.aeu;
import defpackage.c1f;
import defpackage.da5;
import defpackage.ea5;
import defpackage.ebu;
import defpackage.j1s0;
import defpackage.kdc;
import defpackage.mrg0;
import defpackage.n170;
import defpackage.pcu;
import defpackage.pp8;
import defpackage.qpo;
import defpackage.rp31;
import defpackage.s5o;
import defpackage.sp8;
import defpackage.t4s0;
import defpackage.tls;
import defpackage.u7h0;
import defpackage.w511;
import defpackage.x3s0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.action.ActionComponent;

/* loaded from: classes13.dex */
public final class g extends d {
    public static final List f0 = Collections.singletonList(new s5o(HeaderViewHolder$Companion$PAYLOAD_TYPES$1.b));
    public final c1f Z;
    public final n170 a0;
    public final x3s0 b0;
    public final ru.yandex.taxi.widget.utils.e c0;
    public boolean d0;
    public final ActionComponent e0;

    public g(View view, ru.yandex.taxi.widget.c cVar, t4s0 t4s0Var, c1f c1fVar, n170 n170Var, x3s0 x3s0Var, ru.yandex.taxi.widget.utils.e eVar, j1s0 j1s0Var) {
        super(cVar, t4s0Var, view);
        this.Z = c1fVar;
        this.a0 = n170Var;
        this.b0 = x3s0Var;
        this.c0 = eVar;
        int i = u7h0.action_component;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ActionComponent actionComponent = (ActionComponent) ((View) rp31.d(view, i));
        this.e0 = actionComponent;
        int a = j1s0Var.a(16);
        actionComponent.setTitleSize(a).setSubtitleSize(j1s0Var.a(13));
        actionComponent.setOutlineProvider(new ViewOutlineProvider() { // from class: com.yandex.go.shortcuts.impl.view.adapter.HeaderViewHolder$1$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), ru.yandex.taxi.design.utils.c.d(mrg0.component_action_background_corner_radius, view2));
            }
        });
        actionComponent.setClipToOutline(true);
        actionComponent.setClipChildren(true);
    }

    @Override // com.yandex.go.shortcuts.impl.view.adapter.d
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void c(ebu ebuVar) {
        CountersShowPolicy countersShowPolicy;
        sp8 sp8Var = ebuVar.j;
        ea5 ea5Var = ebuVar.b;
        pcu pcuVar = ebuVar.f;
        boolean z = sp8Var instanceof pp8;
        e0(ebuVar, z);
        if (z) {
            return;
        }
        String str = ebuVar.h;
        if (str != null) {
            this.a.setTransitionName(str);
        }
        c0(ebuVar);
        g0(ebuVar);
        Iterator it = ea5Var.n.a.iterator();
        while (it.hasNext()) {
            this.Z.g((CountersShowPolicy) it.next());
        }
        f0 f0Var = ea5Var.m;
        if (f0Var != null && (f0Var instanceof MediaStories) && (countersShowPolicy = ((MediaStories) f0Var).b) != null) {
            this.a0.g(countersShowPolicy);
        }
        int i = 1;
        this.d0 = true;
        kdc kdcVar = ea5Var.i.d;
        kdc kdcVar2 = ea5Var.c.g;
        i0(ea5Var.g, new HeaderViewHolder$bind$4(1, this.e0, ActionComponent.class, "setTitleVariant", "setTitleVariant(Ljava/lang/CharSequence;)Lru/yandex/taxi/design/action/ActionComponent;", 0));
        i0(ea5Var.h, new HeaderViewHolder$bind$5(1, this.e0, ActionComponent.class, "setSubtitle", "setSubtitle(Ljava/lang/CharSequence;)Lru/yandex/taxi/design/action/ActionComponent;", 0));
        String str2 = pcuVar != null ? pcuVar.e : null;
        String str3 = ebuVar.c;
        Z(new HeaderViewHolder$bindIcons$1(this, str2, null), "loadTrailImage", true);
        Z(new HeaderViewHolder$bindIcons$2(this, str3, null), "loadLeadImage", true);
        ActionComponent trailOnClickAction = this.e0.setTitleColor(kdcVar).setSubtitleColor(kdcVar).setLeadImageSize(ActionComponent.ImageSize.BIG).setComponentBackgroundTint(kdcVar2).enableProgressAnimation(false).setMode(ea5Var.a == 1 ? ActionComponent.Mode.ICON : ActionComponent.Mode.NORMAL).setAutoHideIconToFitText(ebuVar.d).setTrailOnClickAction(new qpo(25, pcuVar, this));
        String str4 = pcuVar != null ? pcuVar.d : null;
        if (str4 == null) {
            str4 = "";
        }
        ActionComponent separatorHidden = trailOnClickAction.setTrailTextAccessibility(str4).setSeparatorHidden(pcuVar != null ? pcuVar.f : false);
        int i2 = aeu.a[ea5Var.i.b.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 != 2) {
            if (i2 != 3) {
                w511.b();
                return;
            }
            i = 2;
        }
        separatorHidden.setTextsAlignment(i).invalidateComponent();
        this.d0 = false;
    }

    public final void i0(da5 da5Var, tls tlsVar) {
        if (da5Var.b.a.isEmpty()) {
            tlsVar.invoke(da5Var.a);
        } else {
            Z(new HeaderViewHolder$setFormattedText$1(this, da5Var, tlsVar, null), Integer.valueOf(u7h0.shortcut_title), true);
        }
    }
}
