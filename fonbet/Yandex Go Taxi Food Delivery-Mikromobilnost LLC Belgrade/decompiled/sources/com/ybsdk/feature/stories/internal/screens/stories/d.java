package com.ybsdk.feature.stories.internal.screens.stories;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.StoriesEvents$StoriesEndCloseReason;
import com.ybsdk.core.analytics.generated.delegates.StoriesEvents$StoriesShownOpenReason;
import com.ybsdk.core.analytics.generated.delegates.StoriesEvents$StoriesShownStatus;
import com.ybsdk.core.stories.ChangeStoryReason;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.stories.api.StoriesScreensParams;
import com.ybsdk.feature.stories.internal.screens.stories.c;
import defpackage.bmu0;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.hmu0;
import defpackage.imu0;
import defpackage.mv3;
import defpackage.nmu0;
import defpackage.oe1;
import defpackage.p9t0;
import defpackage.pz40;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tnu0;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.v4b1;
import defpackage.vou0;
import defpackage.vz6;
import defpackage.w511;
import defpackage.wou0;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.ykn0;
import defpackage.z2z;
import defpackage.zz6;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class d extends uc5 {
    public final StoriesScreensParams B;
    public final com.ybsdk.feature.stories.internal.domain.a C;
    public final Context D;
    public final tfl0 E;
    public final AppAnalyticsReporter F;
    public final nmu0 G;

    public d(StoriesScreensParams storiesScreensParams, b bVar, com.ybsdk.feature.stories.internal.domain.a aVar, Context context, tfl0 tfl0Var, AppAnalyticsReporter appAnalyticsReporter, nmu0 nmu0Var) {
        super(new bmu0(1), new ykn0(25, bVar));
        r0 r0Var;
        Object value;
        t8j0 t8j0Var;
        StoriesScreensParams storiesScreensParams2;
        this.B = storiesScreensParams;
        this.C = aVar;
        this.D = context;
        this.E = tfl0Var;
        this.F = appAnalyticsReporter;
        this.G = nmu0Var;
        ((imu0) nmu0Var).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new p9t0(14, this), 28));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            t8j0Var = new t8j0();
            storiesScreensParams2 = this.B;
        } while (!r0Var.k(value, c.a((c) value, t8j0Var, 0, storiesScreensParams2.getShowBackButton(), storiesScreensParams2.getShowCloseButton(), null, 18)));
        tje.N(ds31.a(this), null, null, new StoriesViewModel$loadData$2(this, null), 3);
        rt1 rt1Var = appAnalyticsReporter.l0;
        String target = storiesScreensParams.getTarget();
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (target != null) {
            linkedHashMap.put("target", target);
        }
        rt1Var.a.a("stories.start", linkedHashMap);
    }

    public final void b0(hmu0 hmu0Var, d6w d6wVar) {
        List list = hmu0Var.a;
        if (list == null) {
            return;
        }
        c6w it = d6wVar.iterator();
        while (it.c) {
            wou0 wou0Var = (wou0) kotlin.collections.a.S(it.nextInt(), list);
            if (wou0Var != null && (wou0Var instanceof vou0)) {
                v4b1.g(((vou0) wou0Var).h, this.D);
            }
        }
    }

    public final vou0 c0() {
        List list;
        hmu0 hmu0Var = (hmu0) ((c) X()).a.a();
        wou0 wou0Var = (hmu0Var == null || (list = hmu0Var.a) == null) ? null : (wou0) kotlin.collections.a.S(((c) X()).b, list);
        if (wou0Var instanceof vou0) {
            return (vou0) wou0Var;
        }
        return null;
    }

    public final String d0(int i) {
        List list;
        wou0 wou0Var;
        hmu0 hmu0Var = (hmu0) ((c) X()).a.a();
        if (hmu0Var == null || (list = hmu0Var.a) == null || (wou0Var = (wou0) kotlin.collections.a.S(i, list)) == null) {
            return null;
        }
        return wou0Var.a;
    }

    public final boolean e0(String str) {
        z2z c = ((imu0) this.G).a.c(str);
        boolean z = c.b || (c.a instanceof v0h);
        if (!z) {
            x4c.g("Can't handle action", null, "action=".concat(str), null, 10);
        }
        return z;
    }

    public final boolean f0(String str) {
        oe1 oe1Var;
        String str2;
        vou0 c0 = c0();
        if (c0 != null && (oe1Var = c0.n) != null && (str2 = oe1Var.a) != null) {
            this.F.x.a.a("erid_badge.click", x4e.t(2, "view_id", c0.c, "text", str2));
        }
        return e0(str);
    }

    public final void g0() {
        String str;
        List list;
        wou0 wou0Var;
        String str2;
        hmu0 hmu0Var = (hmu0) ((c) X()).a.a();
        if (hmu0Var != null && (list = hmu0Var.a) != null && (wou0Var = (wou0) kotlin.collections.a.S(((c) X()).b, list)) != null && (str2 = wou0Var.a) != null) {
            rt1 rt1Var = this.F.l0;
            String target = this.B.getTarget();
            int i = ((c) X()).b;
            LinkedHashMap w = g8e.w(3, "stories_id", str2);
            w.put("stories_number", Integer.valueOf(i));
            if (target != null) {
                w.put("target", target);
            }
            rt1Var.a.a("stories.close.click", w);
        }
        hmu0 hmu0Var2 = (hmu0) ((c) X()).a.a();
        if (hmu0Var2 == null || (str = hmu0Var2.e) == null || !e0(str)) {
            this.E.e();
        }
    }

    public final void h0() {
        g0();
    }

    public final void i0() {
        String str;
        hmu0 hmu0Var = (hmu0) ((c) X()).a.a();
        if (hmu0Var == null || (str = hmu0Var.d) == null) {
            return;
        }
        e0(str);
    }

    public final void j0() {
        zz6 zz6Var;
        String str;
        vou0 c0 = c0();
        if (c0 == null || (zz6Var = c0.j) == null || (str = zz6Var.a.c) == null) {
            return;
        }
        rt1 rt1Var = this.F.l0;
        String target = this.B.getTarget();
        String d0 = d0(((c) X()).b);
        if (d0 == null) {
            d0 = "";
        }
        int i = ((c) X()).b;
        LinkedHashMap w = g8e.w(4, "stories_id", d0);
        w.put("stories_number", Integer.valueOf(i));
        w.put("url", str);
        if (target != null) {
            w.put("target", target);
        }
        rt1Var.a.a("stories.primary_button.click", w);
        e0(str);
    }

    public final void k0() {
        r0 r0Var;
        Object value;
        t8j0 t8j0Var;
        StoriesScreensParams storiesScreensParams;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            t8j0Var = new t8j0();
            storiesScreensParams = this.B;
        } while (!r0Var.k(value, c.a((c) value, t8j0Var, 0, storiesScreensParams.getShowBackButton(), storiesScreensParams.getShowCloseButton(), null, 18)));
        tje.N(ds31.a(this), null, null, new StoriesViewModel$loadData$2(this, null), 3);
    }

    public final void l0() {
        zz6 zz6Var;
        vz6 vz6Var;
        String str;
        vou0 c0 = c0();
        if (c0 == null || (zz6Var = c0.j) == null || (vz6Var = zz6Var.b) == null || (str = vz6Var.c) == null) {
            return;
        }
        rt1 rt1Var = this.F.l0;
        String target = this.B.getTarget();
        String d0 = d0(((c) X()).b);
        if (d0 == null) {
            d0 = "";
        }
        int i = ((c) X()).b;
        LinkedHashMap w = g8e.w(4, "stories_id", d0);
        w.put("stories_number", Integer.valueOf(i));
        w.put("url", str);
        if (target != null) {
            w.put("target", target);
        }
        rt1Var.a.a("stories.secondary_button.click", w);
        e0(str);
    }

    public final void m0() {
        String supportUrl;
        u8j0 u8j0Var = ((c) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        e0(supportUrl);
    }

    public final void n0(int i, ChangeStoryReason changeStoryReason) {
        StoriesEvents$StoriesEndCloseReason storiesEvents$StoriesEndCloseReason;
        r0 r0Var;
        Object value;
        StoriesEvents$StoriesShownOpenReason storiesEvents$StoriesShownOpenReason;
        oe1 oe1Var;
        String str;
        AppAnalyticsReporter appAnalyticsReporter = this.F;
        rt1 rt1Var = appAnalyticsReporter.l0;
        StoriesScreensParams storiesScreensParams = this.B;
        String target = storiesScreensParams.getTarget();
        String d0 = d0(((c) X()).b);
        if (d0 == null) {
            d0 = "";
        }
        int i2 = ((c) X()).b;
        int[] iArr = tnu0.a;
        int i3 = iArr[changeStoryReason.ordinal()];
        if (i3 == 1) {
            storiesEvents$StoriesEndCloseReason = StoriesEvents$StoriesEndCloseReason.TAP_TO_NEXT;
        } else if (i3 == 2) {
            storiesEvents$StoriesEndCloseReason = StoriesEvents$StoriesEndCloseReason.TAP_TO_PREVIOUS;
        } else if (i3 == 3) {
            storiesEvents$StoriesEndCloseReason = StoriesEvents$StoriesEndCloseReason.TIME;
        } else {
            if (i3 != 4) {
                w511.b();
                return;
            }
            storiesEvents$StoriesEndCloseReason = StoriesEvents$StoriesEndCloseReason.DEEPLINK_NEXT;
        }
        LinkedHashMap w = g8e.w(4, "stories_id", d0);
        w.put("stories_number", Integer.valueOf(i2));
        w.put("close_reason", storiesEvents$StoriesEndCloseReason.getOriginalValue());
        if (target != null) {
            w.put("target", target);
        }
        rt1Var.a.a("stories.end", w);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c.a((c) value, null, i, false, false, null, 29)));
        rt1 rt1Var2 = appAnalyticsReporter.l0;
        String target2 = storiesScreensParams.getTarget();
        String d02 = d0(((c) X()).b);
        String str2 = d02 != null ? d02 : "";
        int i4 = ((c) X()).b;
        int i5 = iArr[changeStoryReason.ordinal()];
        if (i5 == 1) {
            storiesEvents$StoriesShownOpenReason = StoriesEvents$StoriesShownOpenReason.TAP_TO_NEXT;
        } else if (i5 == 2) {
            storiesEvents$StoriesShownOpenReason = StoriesEvents$StoriesShownOpenReason.TAP_TO_PREVIOUS;
        } else if (i5 == 3) {
            storiesEvents$StoriesShownOpenReason = StoriesEvents$StoriesShownOpenReason.TIME;
        } else {
            if (i5 != 4) {
                w511.b();
                return;
            }
            storiesEvents$StoriesShownOpenReason = StoriesEvents$StoriesShownOpenReason.DEEPLINK_NEXT;
        }
        StoriesEvents$StoriesShownStatus storiesEvents$StoriesShownStatus = StoriesEvents$StoriesShownStatus.OK;
        LinkedHashMap w2 = g8e.w(6, "stories_id", str2);
        w2.put("stories_number", Integer.valueOf(i4));
        w2.put(ACSPConstants.STATUS, storiesEvents$StoriesShownStatus.getOriginalValue());
        w2.put("open_reason", storiesEvents$StoriesShownOpenReason.getOriginalValue());
        if (target2 != null) {
            w2.put("target", target2);
        }
        rt1Var2.a.a("stories.shown", w2);
        vou0 c0 = c0();
        if (c0 != null && (oe1Var = c0.n) != null && (str = oe1Var.a) != null) {
            appAnalyticsReporter.x.a.a("erid_badge.shown", x4e.t(2, "view_id", c0.c, "text", str));
        }
        hmu0 hmu0Var = (hmu0) ((c) X()).a.a();
        if (hmu0Var != null) {
            b0(hmu0Var, new d6w(i - 1, i + 2, 1));
        }
    }

    public final void o0(String str) {
        rt1 rt1Var = this.F.l0;
        String target = this.B.getTarget();
        String d0 = d0(((c) X()).b);
        if (d0 == null) {
            d0 = "";
        }
        int i = ((c) X()).b;
        LinkedHashMap w = g8e.w(4, "stories_id", d0);
        w.put("stories_number", Integer.valueOf(i));
        w.put("url", str);
        if (target != null) {
            w.put("target", target);
        }
        rt1Var.a.a("stories.agreement.click", w);
        e0(str);
    }

    public final void p0(int i, int i2) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, c.a((c) value, null, 0, false, false, new c.a(i, i2), 15)));
    }
}
