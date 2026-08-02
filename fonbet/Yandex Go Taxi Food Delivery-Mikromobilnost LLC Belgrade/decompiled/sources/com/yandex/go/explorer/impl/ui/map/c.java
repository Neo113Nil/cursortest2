package com.yandex.go.explorer.impl.ui.map;

import android.content.Context;
import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.auo;
import defpackage.dai0;
import defpackage.dvw;
import defpackage.et00;
import defpackage.g8e;
import defpackage.gh00;
import defpackage.ike;
import defpackage.j10;
import defpackage.j18;
import defpackage.juo;
import defpackage.kuo;
import defpackage.l0o;
import defpackage.lhc;
import defpackage.mdh;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pzt0;
import defpackage.r8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.xm00;
import defpackage.xth;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class c extends r8 {
    public final ArrayList A;
    public xm00 B;
    public final ArrayList C;
    public List D;
    public final ike E;
    public pzt0 F;
    public pzt0 G;
    public boolean H;
    public final xth I;
    public final b J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final auo Q;
    public final auo R;
    public final com.yandex.go.explorer.impl.ui.map.animation.a S;
    public final l c;
    public final et00 w;
    public xm00 x;
    public final ArrayList y;
    public xm00 z;

    public c(Context context, l lVar, et00 et00Var, ah00 ah00Var) {
        super(5, ah00Var);
        this.c = lVar;
        this.w = et00Var;
        this.y = new ArrayList();
        this.A = new ArrayList();
        this.C = new ArrayList();
        this.D = EmptyList.a;
        sjh sjhVar = uyj.a;
        this.E = g8e.f(o400.a);
        int i = 1;
        this.I = new xth(i, this);
        this.J = new b(this);
        this.K = lhc.f(context.getColor(mqg0.component_amber_normal), Math.abs(51) & 255);
        this.L = context.getColor(mqg0.component_amber_toxic);
        this.M = context.getColor(mqg0.component_amber_toxic);
        this.N = context.getColor(mqg0.transparent);
        this.O = lhc.f(context.getColor(mqg0.component_amber_normal), Math.abs(102) & 255);
        this.P = context.getColor(mqg0.component_amber_toxic);
        this.Q = new auo(new juo(this, 0));
        this.R = new auo(new juo(this, i));
        this.S = new com.yandex.go.explorer.impl.ui.map.animation.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Hg(c cVar, Point point, ContinuationImpl continuationImpl) {
        ExplorerOverlay$moveCameraTo$1 explorerOverlay$moveCameraTo$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof ExplorerOverlay$moveCameraTo$1) {
            explorerOverlay$moveCameraTo$1 = (ExplorerOverlay$moveCameraTo$1) continuationImpl;
            int i2 = explorerOverlay$moveCameraTo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                explorerOverlay$moveCameraTo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = explorerOverlay$moveCameraTo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = explorerOverlay$moveCameraTo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    explorerOverlay$moveCameraTo$1.L$0 = point;
                    explorerOverlay$moveCameraTo$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(explorerOverlay$moveCameraTo$1));
                    j18Var.u();
                    CameraPosition cameraPosition = ((gh00) ((ah00) cVar.b)).e.c;
                    ah00 ah00Var = (ah00) cVar.b;
                    ((gh00) ah00Var).g.k(new CameraPosition(point, cameraPosition.getZoom(), cameraPosition.getAzimuth(), cameraPosition.getTilt()), 350.0f, Animation.Type.SMOOTH, new kuo(j18Var));
                    if (j18Var.s() == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        explorerOverlay$moveCameraTo$1 = new ExplorerOverlay$moveCameraTo$1(cVar, continuationImpl);
        Object obj2 = explorerOverlay$moveCameraTo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = explorerOverlay$moveCameraTo$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void Ig() {
        pzt0 pzt0Var = this.G;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.G = null;
        this.C.clear();
        this.D = EmptyList.a;
        xm00 xm00Var = this.B;
        if (xm00Var != null) {
            xm00Var.m();
        }
        xm00 xm00Var2 = this.B;
        if (xm00Var2 != null) {
            xm00Var2.d();
        }
        this.B = null;
    }

    public final void attach() {
        if (this.x == null) {
            xm00 p = ((gh00) ((ah00) this.b)).i.p();
            p.k(1.0f);
            p.i(false);
            this.x = p;
        }
        a aVar = new a(this);
        l lVar = this.c;
        lVar.Bg(aVar);
        if (lVar.C == null) {
            com.yandex.go.explorer.impl.data.repositories.a aVar2 = lVar.x;
            j10 j = dai0.j(aVar2.a.a, new String[]{"explorer_discovered_hex"}, new l0o(19));
            aVar2.e.getClass();
            sjh sjhVar = uyj.a;
            lVar.C = tje.N(lVar.Jg(), null, null, new ExplorerPresenter$subscribeToDiscoveredCells$$inlined$collectIn$1(kotlinx.coroutines.flow.e.t(new g(kotlinx.coroutines.flow.e.F(j, mdh.b))), null, lVar), 3);
        }
        pzt0 pzt0Var = lVar.D;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        lVar.D = tje.N(lVar.Jg(), null, null, new ExplorerPresenter$subscribeToZoomUpdates$1(lVar, null), 3);
        pzt0 pzt0Var2 = lVar.E;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        lVar.E = tje.N(lVar.Jg(), null, null, new ExplorerPresenter$subscribeToUnviewedCellsPreload$1(lVar, null), 3);
    }
}
