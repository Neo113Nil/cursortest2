package com.yandex.plus.core.debug.panel.internal.presentation.viewModel;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.StyleSpan;
import com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig;
import com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel;
import com.yandex.plus.home.common.utils.c;
import defpackage.bvf0;
import defpackage.cez;
import defpackage.dfz;
import defpackage.dlz;
import defpackage.efz;
import defpackage.eif;
import defpackage.elz;
import defpackage.evu0;
import defpackage.ewg;
import defpackage.ffz;
import defpackage.gci0;
import defpackage.gfz;
import defpackage.ha2;
import defpackage.hlz;
import defpackage.ike;
import defpackage.j73;
import defpackage.jez;
import defpackage.jzj;
import defpackage.kez;
import defpackage.ogf;
import defpackage.rvg;
import defpackage.scc;
import defpackage.sls;
import defpackage.spg0;
import defpackage.svg;
import defpackage.tcc;
import defpackage.tvg;
import defpackage.upg0;
import defpackage.uyh0;
import defpackage.w511;
import defpackage.wkz;
import defpackage.wsr0;
import defpackage.xsr0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class b {
    public final ewg a;
    public final ike b;
    public final kez c;
    public final wkz d;
    public final elz e;
    public final tvg f;
    public final sls g;
    public final ArrayList h = new ArrayList();
    public final r0 i;
    public final r0 j;
    public final eif k;
    public final r0 l;
    public int m;
    public final r0 n;
    public final r0 o;
    public final r0 p;
    public final gci0 q;

    public b(ewg ewgVar, ike ikeVar, kez kezVar, wkz wkzVar, elz elzVar, tvg tvgVar, sls slsVar) {
        this.a = ewgVar;
        this.b = ikeVar;
        this.c = kezVar;
        this.d = wkzVar;
        this.e = elzVar;
        this.f = tvgVar;
        this.g = slsVar;
        EmptyList emptyList = EmptyList.a;
        this.i = bvf0.c(emptyList);
        r0 c = bvf0.c(emptyList);
        this.j = c;
        this.k = new eif(c, 1);
        this.l = bvf0.c(null);
        this.m = -1;
        LogDisplayConfig.Companion.getClass();
        List g = scc.g(LogDisplayConfig.VERBOSE, LogDisplayConfig.DEBUG, LogDisplayConfig.INFO, LogDisplayConfig.WARN, LogDisplayConfig.ERROR, LogDisplayConfig.UNSPECIFIED);
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(new cez((LogDisplayConfig) it.next(), true));
        }
        this.n = bvf0.c(arrayList);
        LogDisplayConfig.Companion.getClass();
        List g2 = scc.g(LogDisplayConfig.TIMESTAMP, LogDisplayConfig.TAG, LogDisplayConfig.LEVEL, LogDisplayConfig.RAW_LEVEL, LogDisplayConfig.MESSAGE, LogDisplayConfig.LOCATION, LogDisplayConfig.FUNCTION, LogDisplayConfig.THREAD, LogDisplayConfig.THREAD_SEQUENCE);
        ArrayList arrayList2 = new ArrayList(tcc.n(g2, 10));
        Iterator it2 = g2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new cez((LogDisplayConfig) it2.next(), true));
        }
        this.o = bvf0.c(arrayList2);
        r0 c2 = bvf0.c(null);
        this.p = c2;
        ha2 n = e.n(this.i, this.k, c2, new DebugPanelLogsViewModel$uiState$1(this, null));
        ike ikeVar2 = this.b;
        xsr0.a.getClass();
        this.q = e.R(n, ikeVar2, wsr0.c, new hlz(emptyList, 0, false, null));
        c.b(this.a.a, this.b, new DebugPanelLogsViewModel$observeLogs$1(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ef, code lost:
    
        if (((java.util.ArrayList) defpackage.j73.A(new com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel[]{defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.VERBOSE, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.VERBOSE : null, defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.DEBUG, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.DEBUG : null, defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.INFO, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.INFO : null, defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.WARN, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.WARN : null, defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.ERROR, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.ERROR : null, defpackage.wkz.a(com.yandex.plus.core.debug.panel.internal.model.log.LogDisplayConfig.UNSPECIFIED, r6) ? com.yandex.plus.core.debug.panel.internal.model.log.LogModel$LogDetails$LogLevel.UNSPECIFIED : null})).contains(r7.b) == false) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        jzj jzjVar;
        int i;
        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel;
        Iterable iterable = (Iterable) this.a.a.getValue();
        ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
        for (Iterator it = iterable.iterator(); it.hasNext(); it = it) {
            rvg rvgVar = (rvg) it.next();
            this.e.getClass();
            int i2 = uyh0.plus_sdk_debug_panel_log_session_id;
            svg svgVar = rvgVar.b;
            efz efzVar = new efz(i2, svgVar.a);
            efz efzVar2 = new efz(uyh0.plus_sdk_debug_panel_timestamp, svgVar.b);
            efz efzVar3 = new efz(uyh0.plus_sdk_debug_panel_tag, svgVar.c);
            int i3 = uyh0.plus_sdk_debug_panel_level;
            switch (dlz.a[svgVar.d.ordinal()]) {
                case 1:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.VERBOSE;
                    break;
                case 2:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.DEBUG;
                    break;
                case 3:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.INFO;
                    break;
                case 4:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.WARN;
                    break;
                case 5:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.ERROR;
                    break;
                case 6:
                    logModel$LogDetails$LogLevel = LogModel$LogDetails$LogLevel.UNSPECIFIED;
                    break;
                default:
                    w511.b();
                    return;
            }
            ffz ffzVar = new ffz(efzVar, efzVar2, efzVar3, new efz(i3, logModel$LogDetails$LogLevel), new efz(uyh0.plus_sdk_debug_panel_raw_level, svgVar.e), new efz(uyh0.plus_sdk_debug_panel_message, svgVar.f), new efz(uyh0.plus_sdk_debug_panel_location, svgVar.g), new efz(uyh0.plus_sdk_debug_panel_function, svgVar.h), new efz(uyh0.plus_sdk_debug_panel_thread, svgVar.i), new efz(uyh0.plus_sdk_debug_panel_thread_sequence, svgVar.j));
            String str = rvgVar.a;
            arrayList.add(new gfz(str, str, ffzVar));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            gfz gfzVar = (gfz) it2.next();
            ffz ffzVar2 = gfzVar.c;
            ArrayList m0 = kotlin.collections.a.m0((Iterable) this.n.getValue(), (Collection) this.o.getValue());
            this.d.getClass();
            efz efzVar4 = ffzVar2.d;
            List A = j73.A(new efz[]{wkz.a(LogDisplayConfig.TIMESTAMP, m0) ? ffzVar2.b : null, wkz.a(LogDisplayConfig.TAG, m0) ? ffzVar2.c : null, wkz.a(LogDisplayConfig.LEVEL, m0) ? efzVar4 : null, wkz.a(LogDisplayConfig.RAW_LEVEL, m0) ? ffzVar2.e : null, wkz.a(LogDisplayConfig.MESSAGE, m0) ? ffzVar2.f : null, wkz.a(LogDisplayConfig.LOCATION, m0) ? ffzVar2.g : null, wkz.a(LogDisplayConfig.FUNCTION, m0) ? ffzVar2.h : null, wkz.a(LogDisplayConfig.THREAD, m0) ? ffzVar2.i : null, wkz.a(LogDisplayConfig.THREAD_SEQUENCE, m0) ? ffzVar2.j : null});
            boolean isEmpty = ((ArrayList) A).isEmpty();
            EmptyList emptyList = EmptyList.a;
            if (!isEmpty) {
            }
            A = emptyList;
            if (A.isEmpty()) {
                A = null;
            }
            if (A != null) {
                String str2 = gfzVar.a;
                Context context = this.c.a.a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i4 = 0;
                for (Object obj : A) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        scc.m();
                        throw null;
                    }
                    efz efzVar5 = (efz) obj;
                    int i6 = efzVar5.a;
                    Object obj2 = efzVar5.b;
                    String string = context.getString(i6);
                    StyleSpan styleSpan = new StyleSpan(1);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) string.concat(Extension.COLON_SPACE));
                    spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
                    if (obj2 instanceof LogModel$LogDetails$LogLevel) {
                        LogModel$LogDetails$LogLevel logModel$LogDetails$LogLevel2 = (LogModel$LogDetails$LogLevel) obj2;
                        switch (jez.a[logModel$LogDetails$LogLevel2.ordinal()]) {
                            case 1:
                                i = upg0.home_sdk_semantic_text_secondary;
                                break;
                            case 2:
                                i = upg0.home_sdk_semantic_text_status_neutral;
                                break;
                            case 3:
                                i = upg0.home_sdk_semantic_text_status_success;
                                break;
                            case 4:
                                i = upg0.home_sdk_semantic_text_status_warning;
                                break;
                            case 5:
                                i = upg0.home_sdk_semantic_text_status_alert;
                                break;
                            case 6:
                                i = upg0.home_sdk_semantic_text_secondary;
                                break;
                            default:
                                w511.b();
                                return;
                        }
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(context.getColor(i));
                        int length2 = spannableStringBuilder.length();
                        spannableStringBuilder.append((CharSequence) logModel$LogDetails$LogLevel2.name());
                        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
                    } else {
                        spannableStringBuilder.append((CharSequence) String.valueOf(obj2));
                    }
                    if (i4 < A.size() - 1) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    i4 = i5;
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(new SpannedString(spannableStringBuilder));
                int i7 = 0;
                while (i7 < spannableStringBuilder2.length()) {
                    int G = evu0.G(spannableStringBuilder2, '\n', i7, 4);
                    Integer valueOf = Integer.valueOf(G);
                    if (G == -1) {
                        valueOf = null;
                    }
                    int intValue = valueOf != null ? valueOf.intValue() : spannableStringBuilder2.length();
                    spannableStringBuilder2.setSpan(new LeadingMarginSpan.Standard(0, 200), i7, intValue, 33);
                    i7 = intValue + 1;
                }
                jzjVar = new jzj(str2, new SpannedString(spannableStringBuilder2));
            } else {
                jzjVar = null;
            }
            if (jzjVar != null) {
                arrayList2.add(jzjVar);
            }
        }
        ArrayList arrayList3 = this.h;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        r0 r0Var = this.i;
        r0Var.getClass();
        r0Var.m(null, arrayList2);
    }

    public final void b() {
        r0 r0Var;
        Object value;
        List list = (List) this.j.getValue();
        boolean isEmpty = list.isEmpty();
        kez kezVar = this.c;
        ArrayList arrayList = this.h;
        if (!isEmpty) {
            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                jzj jzjVar = (jzj) next;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list) {
                    if (((dfz) obj).a == i) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    kezVar.getClass();
                    SpannedString spannedString = jzjVar.b;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedString);
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        dfz dfzVar = (dfz) it2.next();
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(kezVar.a.a.getColor(spg0.plus_sdk_match_highlight)), dfzVar.b, dfzVar.c, 17);
                    }
                    jzjVar = new jzj(jzjVar.a, new SpannedString(spannableStringBuilder));
                }
                arrayList2.add(jzjVar);
                i = i2;
            }
            arrayList = arrayList2;
        }
        do {
            r0Var = this.i;
            value = r0Var.getValue();
        } while (!r0Var.k(value, arrayList.isEmpty() ? Collections.singletonList((jzj) kezVar.b.getValue()) : arrayList));
    }

    public final void c() {
        List J0 = kotlin.collections.a.J0(this.h);
        r0 r0Var = this.i;
        r0Var.getClass();
        r0Var.m(null, J0);
        r0 r0Var2 = this.j;
        r0Var2.getClass();
        r0Var2.m(null, EmptyList.a);
        this.l.l(null);
        this.m = -1;
    }

    public final void d(int i) {
        r0 r0Var;
        Object value;
        ogf ogfVar;
        dfz dfzVar;
        ogf ogfVar2;
        dfz dfzVar2;
        List list = (List) this.j.getValue();
        do {
            r0Var = this.l;
            value = r0Var.getValue();
            if (list.isEmpty()) {
                ogfVar = null;
            } else {
                int i2 = this.m;
                Object obj = (i2 < 0 || i2 >= list.size()) ? (dfz) kotlin.collections.a.P(list) : list.get(i2);
                this.m = i;
                ogfVar = new ogf((dfz) obj, (dfz) list.get(i));
            }
        } while (!r0Var.k(value, ogfVar));
        r0 r0Var2 = this.i;
        ArrayList arrayList = new ArrayList((Collection) r0Var2.getValue());
        ogf ogfVar3 = (ogf) r0Var.getValue();
        if (ogfVar3 == null || (dfzVar = ogfVar3.a) == null || (ogfVar2 = (ogf) r0Var.getValue()) == null || (dfzVar2 = ogfVar2.b) == null) {
            return;
        }
        int i3 = dfzVar.a;
        jzj jzjVar = (jzj) arrayList.get(i3);
        kez kezVar = this.c;
        jzj a = kezVar.a(jzjVar, dfzVar, false);
        int i4 = dfzVar2.a;
        jzj a2 = kezVar.a(i3 != i4 ? (jzj) arrayList.get(i4) : a, dfzVar2, true);
        if (i3 != i4) {
            arrayList.set(i3, a);
        }
        arrayList.set(i4, a2);
        r0Var2.m(null, arrayList);
    }
}
