package defpackage;

import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.b;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.flex.common.descriptors.action.a;
import com.yandex.go.flex.common.descriptors.action.c;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.plus.metrica.utils.BaseMetricaFacade$Status;
import flex.health.ErrorTypes;
import flex.logger.FlexLogLevel;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.descriptors.SerialDescriptor;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.ErrorCode;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.plaque.animation.transitions.BackgroundTransition;
import ru.yandex.taxi.plaque.api.models.display.MicroWidgetDrawable;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes.dex */
public final /* synthetic */ class ou implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ou(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, l6r0] */
    @Override // defpackage.sls
    public final Object invoke() {
        StackTraceElement stackTraceElement;
        String str;
        v66 blurDelegate_delegate$lambda$0;
        long a;
        String[] names;
        int i = 0;
        r2 = null;
        luu[] luuVarArr = null;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                return new zgr(aVar.a, (z0w0) this.c, aVar.c, aVar.d, aVar.e, aVar.f);
            case 1:
                i iVar = (i) this.b;
                j jVar = (j) this.c;
                LinkedHashMap linkedHashMap = iVar.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                }
                return ((xnt) jVar.h).e(linkedHashMap3, cm2.a);
            case 2:
                on2 on2Var = (on2) this.b;
                h3y h3yVar = (h3y) this.c;
                OkHttpClient okHttpClient = (OkHttpClient) on2Var.j.getValue();
                gxf0 gxf0Var = (gxf0) h3yVar.get();
                p8w[] p8wVarArr = {on2Var.h, on2Var.f};
                OkHttpClient.a b = okHttpClient.b();
                ((qot) gxf0Var).a(b, null);
                while (i < 2) {
                    b.a(p8wVarArr[i]);
                    i++;
                }
                return new OkHttpClient(b);
            case 3:
                px2 px2Var = (px2) this.b;
                ((pep0) px2Var.b).f((m950) px2Var.c.get(), tka1.d((PlaceType) this.c), hxx.a);
                return zy11.a;
            case 4:
                MicroWidgetDrawable microWidgetDrawable = (MicroWidgetDrawable) this.b;
                View view = (View) this.c;
                String[] strArr = BackgroundTransition.h0;
                microWidgetDrawable.setAlpha(255);
                microWidgetDrawable.setCornerRadii(microWidgetDrawable.getInitialCornerRadii());
                view.setBackground(microWidgetDrawable);
                return zy11.a;
            case 5:
                androidx.work.impl.constraints.controllers.a aVar2 = (androidx.work.impl.constraints.controllers.a) this.b;
                zy4 zy4Var = (zy4) this.c;
                e8e e8eVar = aVar2.a;
                synchronized (e8eVar.c) {
                    if (e8eVar.d.remove(zy4Var) && e8eVar.d.isEmpty()) {
                        e8eVar.d();
                    }
                }
                return zy11.a;
            case 6:
                sls slsVar = (sls) this.b;
                sls slsVar2 = (sls) this.c;
                if (((BaseMetricaFacade$Status) slsVar.invoke()).getAvailable()) {
                    return slsVar2.invoke();
                }
                return null;
            case 7:
                String str2 = (String) this.b;
                h55 h55Var = (h55) this.c;
                if (str2 == null) {
                    str2 = b64.f(h55Var);
                }
                return h55Var.q() ? new hbp0(new czo0(15), str2 != null ? str2 : "", null) : new hbp0(new czo0(14), str2 != null ? str2 : "", null);
            case 8:
                return new x75((oa20) this.b, (y75) this.c);
            case 9:
                b bVar = (b) this.b;
                String str3 = (String) this.c;
                WorkDatabase workDatabase = bVar.c;
                workDatabase.P0(new gtg(5, new v08(workDatabase, str3, bVar, r3)));
                pom0.b(bVar.b, workDatabase, bVar.e);
                return zy11.a;
            case 10:
                nac nacVar = (nac) this.b;
                obv obvVar = (obv) this.c;
                nacVar.a();
                nacVar.d(obvVar);
                return zy11.a;
            case 11:
                return Collections.singletonList(new Pair((nwq) this.b, (g0c) this.c));
            case 12:
                File file = (File) this.b;
                zjr zjrVar = (zjr) this.c;
                tjr tjrVar = tjr.d;
                try {
                    kotlin.io.b.l(file);
                } catch (SecurityException e) {
                    String type = ErrorTypes.CACHE_DISK_CLEAR_FAILED.getType();
                    i3y a2 = xfz.a(xfz.d(e.getMessage(), DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION), new Pair("cause", e), new Pair("directory", file.getPath()));
                    EmptyList emptyList = EmptyList.a;
                    s7s0 s7s0Var = zjrVar.c.a;
                    if (Boolean.FALSE.booleanValue() && (stackTraceElement = (StackTraceElement) unr0.j(0)) != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (fileName == null) {
                            fileName = "No file info";
                        }
                        String methodName = stackTraceElement.getMethodName();
                        int lineNumber = stackTraceElement.getLineNumber();
                        Integer valueOf = lineNumber > 0 ? Integer.valueOf(lineNumber) : null;
                        if (valueOf == null || (str = valueOf.toString()) == null) {
                            str = "No line info";
                        }
                        tjrVar = new tjr(fileName, methodName, str);
                    }
                    zjrVar.d(FlexLogLevel.ERROR, "Failed to clear all cache files", xfz.c(a2, xfz.a(new Pair("errorType", type))), emptyList, tjrVar.a, tjrVar.b, tjrVar.c);
                }
                return zy11.a;
            case 13:
                Choreographer.getInstance().postFrameCallback(new uxl((flex.engine.a) this.b, (d3m) this.c, r3));
                return zy11.a;
            case 14:
                o4o o4oVar = (o4o) this.b;
                String str4 = (String) this.c;
                j4o j4oVar = (j4o) o4oVar.d;
                if (j4oVar == null) {
                    Enum[] enumArr = (Enum[]) o4oVar.c;
                    j4oVar = new j4o(str4, enumArr.length);
                    for (Enum r0 : enumArr) {
                        j4oVar.j(r0.name(), false);
                    }
                }
                return j4oVar;
            case 15:
                return new v4c((m40) this.b, (hjr0) this.c);
            case 16:
                return ((oir) ((yvf0) this.b).get()).a((vlr) this.c);
            case 17:
                blurDelegate_delegate$lambda$0 = FullscreenSuperappSuggestModalView.blurDelegate_delegate$lambda$0((FullscreenSuperappSuggestModalView) this.b, (w66) this.c);
                return blurDelegate_delegate$lambda$0;
            case 18:
                wys wysVar = (wys) this.b;
                bys bysVar = (bys) this.c;
                if (wysVar.F() != -1) {
                    bysVar.c.a(bysVar.getItem(wysVar.F()));
                }
                return zy11.a;
            case 19:
                Throwable th = (Throwable) this.b;
                String str5 = (String) this.c;
                return new Pair(th, str5 != null ? "requestId=".concat(str5) : null);
            case 20:
                return new c((Lifecycle) this.b, (tls) this.c);
            case 21:
                return new l6y0((zuj0) this.b, (d6u0) this.c);
            case 22:
                ((rau) ((sau) this.b).Dg()).setDefaultLogo(((tau) this.c).b);
                return zy11.a;
            case 23:
                euu euuVar = (euu) this.b;
                luu luuVar = (luu) this.c;
                try {
                    euuVar.a.c(luuVar);
                } catch (IOException e2) {
                    d72 d72Var = dvc0.a;
                    dvc0.a.e(4, "Http2Connection.Listener failure for " + euuVar.c, e2);
                    try {
                        luuVar.c(ErrorCode.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
                return zy11.a;
            case 24:
                duu duuVar = (duu) this.b;
                l6r0 l6r0Var = (l6r0) this.c;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                euu euuVar2 = (euu) duuVar.c;
                synchronized (euuVar2.P) {
                    synchronized (euuVar2) {
                        try {
                            l6r0 l6r0Var2 = euuVar2.K;
                            ?? l6r0Var3 = new l6r0();
                            for (int i2 = 0; i2 < 10; i2++) {
                                if (((1 << i2) & l6r0Var2.a) != 0) {
                                    l6r0Var3.b(i2, l6r0Var2.b[i2]);
                                }
                            }
                            for (int i3 = 0; i3 < 10; i3++) {
                                if (((1 << i3) & l6r0Var.a) != 0) {
                                    l6r0Var3.b(i3, l6r0Var.b[i3]);
                                }
                            }
                            ref$ObjectRef.element = l6r0Var3;
                            a = l6r0Var3.a() - l6r0Var2.a();
                            if (a != 0 && !euuVar2.b.isEmpty()) {
                                luuVarArr = (luu[]) euuVar2.b.values().toArray(new luu[0]);
                            }
                            euuVar2.K = (l6r0) ref$ObjectRef.element;
                            htx0.c(euuVar2.C, euuVar2.c + " onSettings", 0L, new ou(25, euuVar2, ref$ObjectRef), 6);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        euuVar2.P.a((l6r0) ref$ObjectRef.element);
                    } catch (IOException e3) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        euuVar2.a(errorCode, errorCode, e3);
                    }
                }
                if (luuVarArr != null) {
                    int length = luuVarArr.length;
                    while (i < length) {
                        luu luuVar2 = luuVarArr[i];
                        synchronized (luuVar2) {
                            luuVar2.x += a;
                            if (a > 0) {
                                luuVar2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return zy11.a;
            case 25:
                ((euu) this.b).a.a((l6r0) ((Ref$ObjectRef) this.c).element);
                return zy11.a;
            case 26:
                ew2 ew2Var = (ew2) this.b;
                String str6 = (String) this.c;
                if (ew2Var.a) {
                    Log.i("InternalAnalytics", str6);
                }
                ((t720) ew2Var.b).a(str6, (Map) ew2Var.c);
                return zy11.a;
            case 27:
                SerialDescriptor serialDescriptor = (SerialDescriptor) this.b;
                sbx sbxVar = (sbx) this.c;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                r3 = (sbxVar.a.k && jl40.l(serialDescriptor.getKind(), fsq0.g)) ? 1 : 0;
                ddx.e(sbxVar, serialDescriptor);
                int e4 = serialDescriptor.e();
                for (int i4 = 0; i4 < e4; i4++) {
                    List g = serialDescriptor.g(i4);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : g) {
                        if (obj instanceof cdx) {
                            arrayList.add(obj);
                        }
                    }
                    cdx cdxVar = (cdx) kotlin.collections.a.u0(arrayList);
                    if (cdxVar != null && (names = cdxVar.names()) != null) {
                        for (String str7 : names) {
                            if (r3 != 0) {
                                str7 = str7.toLowerCase(Locale.ROOT);
                            }
                            ddx.a(linkedHashMap4, serialDescriptor, str7, i4);
                        }
                    }
                    String lowerCase = r3 != 0 ? serialDescriptor.f(i4).toLowerCase(Locale.ROOT) : null;
                    if (lowerCase != null) {
                        ddx.a(linkedHashMap4, serialDescriptor, lowerCase, i4);
                    }
                }
                return linkedHashMap4.isEmpty() ? kotlin.collections.b.f() : linkedHashMap4;
            case 28:
                return ((xf7) this.b).newCall(((k3y) this.c).a);
            default:
                ((Lifecycle) this.b).d((fdy) this.c);
                return zy11.a;
        }
    }
}
