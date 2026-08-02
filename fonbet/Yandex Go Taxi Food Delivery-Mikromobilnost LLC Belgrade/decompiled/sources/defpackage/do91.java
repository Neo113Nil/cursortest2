package defpackage;

import android.graphics.Rect;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.concurrent.futures.b;
import androidx.core.view.OneShotPreDrawListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.l0;
import androidx.media.i;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.e;
import com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient;
import com.google.android.gms.internal.play_billing.f;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.zzw;
import com.google.mlkit.common.MlKitException;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;
import yads.aq;
import yads.r41;

/* loaded from: classes11.dex */
public final class do91 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ do91(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [euy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r5v1, types: [lg] */
    @Override // java.lang.Runnable
    public final void run() {
        BubbleComponent bubbleComponent;
        RobotoTextView robotoTextView;
        BubbleComponent bubbleComponent2;
        BubbleComponent bubbleComponent3;
        BubbleComponent bubbleComponent4;
        crm0 binding;
        int i;
        ?? r2 = 0;
        r2 = 0;
        boolean z = false;
        try {
            switch (this.a) {
                case 0:
                    ?? r5 = (lg) this.c;
                    wp91 wp91Var = (wp91) this.b;
                    if (wp91Var instanceof ql91) {
                        ql91 ql91Var = (ql91) wp91Var;
                        if (ql91Var instanceof il91) {
                            Object obj = ql91Var.a;
                            if (obj instanceof f) {
                                r2 = ((f) obj).a;
                            }
                        }
                        if (r2 != 0) {
                            r5.i(r2);
                            return;
                        }
                    }
                    try {
                        if (!wp91Var.isDone()) {
                            throw new IllegalStateException(xqa1.e("Future was expected to be done: %s", wp91Var));
                        }
                        while (true) {
                            try {
                                Object obj2 = wp91Var.get();
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                Integer num = (Integer) obj2;
                                int intValue = num.intValue();
                                e eVar = (e) r5.d;
                                if (intValue <= 0) {
                                    ((Runnable) r5.c).run();
                                    return;
                                }
                                int i2 = r5.a;
                                ns5 a = fe91.a(num.intValue(), "Billing override value was set by a license tester.");
                                eVar.J(105, i2, a);
                                ((Consumer) r5.b).accept(a);
                                return;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                    } catch (ExecutionException e) {
                        r5.i(e.getCause());
                        return;
                    } catch (Throwable th2) {
                        r5.i(th2);
                        return;
                    }
                case 1:
                    b00.a((b00) this.b).a(new tj0((String) this.c));
                    return;
                case 2:
                    try {
                        o89 o89Var = (o89) this.c;
                        Object e2 = ni91.e((euy) this.b);
                        b bVar = o89Var.b;
                        if (bVar != null) {
                            bVar.b(e2);
                        }
                    } catch (CancellationException unused2) {
                        ((o89) this.c).cancel(false);
                    } catch (ExecutionException e3) {
                        o89 o89Var2 = (o89) this.c;
                        Throwable cause = e3.getCause();
                        b bVar2 = o89Var2.b;
                        if (bVar2 != null) {
                            bVar2.d(cause);
                        }
                    }
                    return;
                case 3:
                    ChargersOfferModalView chargersOfferModalView = (ChargersOfferModalView) this.b;
                    bubbleComponent = chargersOfferModalView.bubbleComponent;
                    Rect rect = (Rect) this.c;
                    float centerX = rect.centerX();
                    robotoTextView = chargersOfferModalView.hintTextView;
                    bubbleComponent.setTranslationX(centerX - (robotoTextView.getWidth() / 2.0f));
                    bubbleComponent2 = chargersOfferModalView.bubbleComponent;
                    float f = rect.top;
                    bubbleComponent3 = chargersOfferModalView.bubbleComponent;
                    bubbleComponent2.setTranslationY(f - bubbleComponent3.getHeight());
                    bubbleComponent4 = chargersOfferModalView.bubbleComponent;
                    BubbleComponent.show$default(bubbleComponent4, false, 1, null);
                    return;
                case 4:
                    hgz g = hgz.g();
                    int i3 = bqh.e;
                    fa51 fa51Var = (fa51) this.b;
                    g.getClass();
                    ((bqh) this.c).a.a(fa51Var);
                    return;
                case 5:
                    ((obl) this.c).b.clear();
                    return;
                case 6:
                    a aVar = (a) this.b;
                    String[] strArr = (String[]) this.c;
                    a.b(aVar, (String[]) Arrays.copyOf(strArr, strArr.length));
                    return;
                case 7:
                    GasStationsOverviewView gasStationsOverviewView = (GasStationsOverviewView) this.c;
                    ovs ovsVar = (ovs) this.b;
                    if (ovsVar.b > 0) {
                        gasStationsOverviewView.scrollToPositionNoAnimation(GasStationsOverviewView.access$getBinding(gasStationsOverviewView).e, ovsVar.b);
                    }
                    OneShotPreDrawListener.add(gasStationsOverviewView, new i8m(17, gasStationsOverviewView));
                    return;
                case 8:
                    ((tsu) this.b).a.logError((Throwable) this.c);
                    return;
                case 9:
                    i iVar = (i) this.c;
                    MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.b;
                    ArrayList arrayList = iVar.a;
                    if (!arrayList.isEmpty()) {
                        IMediaSession extraBinder = mediaSessionCompat$Token.getExtraBinder();
                        if (extraBinder != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((Bundle) it.next()).putBinder("extra_session_binder", extraBinder.asBinder());
                            }
                        }
                        arrayList.clear();
                    }
                    iVar.b.setSessionToken((MediaSession.Token) mediaSessionCompat$Token.getToken());
                    return;
                case 10:
                    pxu pxuVar = (pxu) this.b;
                    GoLinearLayout goLinearLayout = pxuVar.e;
                    GoConstraintLayout goConstraintLayout = pxuVar.a;
                    RobotoTextView robotoTextView2 = pxuVar.b;
                    boolean n = xw31.n(goLinearLayout.getContext());
                    GoLinearLayout goLinearLayout2 = pxuVar.e;
                    pxuVar.c.setVisibility(goLinearLayout2.getMeasuredWidth() < Math.abs(((!n || robotoTextView2.getVisibility() != 0) ? n ? goConstraintLayout.getLeft() : robotoTextView2.getVisibility() == 0 ? robotoTextView2.getLeft() : goConstraintLayout.getRight() : robotoTextView2.getRight()) - (n ? goLinearLayout2.getRight() : goLinearLayout2.getLeft())) - ((yt60) this.c).U ? 8 : 0);
                    return;
                case 11:
                    ((vyr) this.b).accept(this.c);
                    return;
                case 12:
                    GoConstraintLayout goConstraintLayout2 = (GoConstraintLayout) this.b;
                    ScootersActivePassesModalView scootersActivePassesModalView = (ScootersActivePassesModalView) this.c;
                    binding = scootersActivePassesModalView.getBinding();
                    RecyclerView recyclerView = binding.d;
                    int height = goConstraintLayout2.getHeight();
                    i = scootersActivePassesModalView.additionRecyclerViewBottomPadding;
                    recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), i + height);
                    return;
                case 13:
                    View view = (View) this.b;
                    View view2 = (View) this.c;
                    view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), view.getHeight());
                    return;
                case 14:
                    ((c3s0) ((k4s0) ((j0s0) this.b)).a.Dg()).Od((ga5) this.c);
                    return;
                case 15:
                    ((yfw0) this.c).k = ((GoLinearLayout) r0.m().d).getTop() / ((GoFrameLayout) r0.m().b).getHeight();
                    return;
                case 16:
                    ((tls) this.b).invoke((c231) this.c);
                    return;
                case 17:
                    ((Lifecycle) this.b).d((l0) this.c);
                    return;
                case 18:
                    cr71 cr71Var = (cr71) this.c;
                    o081 o081Var = (o081) this.b;
                    View a2 = o081Var.c.a();
                    if (a2 instanceof FrameLayout) {
                        we6 we6Var = (we6) cr71Var.x;
                        FrameLayout frameLayout = (FrameLayout) a2;
                        te81 e4 = ((vi71) we6Var.c).e(frameLayout.getContext(), we6Var.b, false);
                        tx71 tx71Var = (tx71) cr71Var.b;
                        tx71Var.getClass();
                        boolean z2 = e4 instanceof a581;
                        d181 d181Var = tx71Var.a;
                        WeakHashMap weakHashMap = d181Var.d;
                        WeakHashMap weakHashMap2 = d181Var.e;
                        WeakReference weakReference = (WeakReference) weakHashMap.get(frameLayout);
                        aq aqVar = weakReference != null ? (aq) weakReference.get() : null;
                        if (aqVar == null) {
                            aqVar = new aq(frameLayout.getContext(), d181Var.c);
                            d181Var.d.put(frameLayout, new WeakReference(aqVar));
                            frameLayout.addView(aqVar);
                        }
                        d181Var.b.getClass();
                        aqVar.setColor(z2 ? -65536 : DebugGraphView.DEFAULT_GRAPH_COLOR);
                        if (z2) {
                            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(frameLayout);
                            r41 r41Var = weakReference2 != null ? (r41) weakReference2.get() : null;
                            if (r41Var == null) {
                                r41Var = new r41(frameLayout.getContext(), new b281());
                                weakHashMap2.put(frameLayout, new WeakReference(r41Var));
                                frameLayout.addView(r41Var);
                            }
                            a581 a581Var = (a581) e4;
                            d181Var.a.getClass();
                            String str = a581Var.b;
                            String str2 = (String) kc81.a.get(a581Var.a);
                            r41Var.setDescription(str2 != null ? String.format(str2, Arrays.copyOf(new Object[]{str}, 1)) : "Visibility error");
                        } else {
                            WeakReference weakReference3 = (WeakReference) weakHashMap2.get(frameLayout);
                            r41 r41Var2 = weakReference3 != null ? (r41) weakReference3.get() : null;
                            if (r41Var2 != null) {
                                weakHashMap2.remove(frameLayout);
                                frameLayout.removeView(r41Var2);
                            }
                        }
                        ((Handler) cr71Var.c).postDelayed(new do91(cr71Var, o081Var, z, 18), 300L);
                        return;
                    }
                    return;
                case 19:
                    vj61.a((WebView) this.b, (String) this.c);
                    return;
                case 20:
                    ((NonGmsServiceBrokerClient) this.b).zaa((IBinder) this.c);
                    return;
                case 21:
                    Future future = (Future) this.b;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable = (Runnable) this.c;
                    future.cancel(true);
                    int i4 = g.a;
                    Log.isLoggable("BillingClient", 5);
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                case 22:
                    com.android.billingclient.api.a aVar2 = (com.android.billingclient.api.a) this.b;
                    u7f0 u7f0Var = (u7f0) this.c;
                    ns5 ns5Var = fe91.l;
                    aVar2.B(24, 7, ns5Var);
                    u7f0Var.onProductDetailsResponse(ns5Var, new ArrayList());
                    return;
                case 23:
                    Callable callable = (Callable) this.b;
                    atx0 atx0Var = (atx0) this.c;
                    zzw zzwVar = atx0Var.a;
                    try {
                        atx0Var.a(callable.call());
                        return;
                    } catch (MlKitException e5) {
                        zzwVar.r(e5);
                        return;
                    } catch (Exception e6) {
                        zzwVar.r(new MlKitException(13, e6, "Internal error has occurred when executing ML Kit tasks"));
                        return;
                    }
                case 24:
                    zzjd zzjdVar = (zzjd) this.c;
                    zzjdVar.zzL().w();
                    zzah zzahVar = (zzah) this.b;
                    if (zzahVar.zzc.zza() == null) {
                        n zzL = zzjdVar.zzL();
                        zzL.getClass();
                        String str3 = zzahVar.zza;
                        cvw.l(str3);
                        zzr L = zzL.L(str3);
                        if (L != null) {
                            zzL.U(zzahVar, L);
                            return;
                        }
                        return;
                    }
                    n zzL2 = zzjdVar.zzL();
                    zzL2.getClass();
                    String str4 = zzahVar.zza;
                    cvw.l(str4);
                    zzr L2 = zzL2.L(str4);
                    if (L2 != null) {
                        zzL2.T(zzahVar, L2);
                        return;
                    }
                    return;
                case 25:
                    j jVar = (j) this.c;
                    jVar.Gg();
                    jVar.Hg();
                    Bundle bundle = (Bundle) this.b;
                    String string = bundle.getString("name");
                    cvw.i(string);
                    com.google.android.gms.measurement.internal.g gVar = (com.google.android.gms.measurement.internal.g) jVar.b;
                    if (!gVar.a()) {
                        y1a1 y1a1Var = gVar.y;
                        com.google.android.gms.measurement.internal.g.g(y1a1Var);
                        y1a1Var.H.a("Conditional property not cleared since app measurement is disabled");
                        return;
                    } else {
                        zzpl zzplVar = new zzpl(string, 0L, null, "");
                        try {
                            ieb1 ieb1Var = gVar.B;
                            com.google.android.gms.measurement.internal.g.e(ieb1Var);
                            bundle.getString(CommonUrlParts.APP_ID);
                            gVar.j().Zg(new zzah(bundle.getString(CommonUrlParts.APP_ID), "", zzplVar, bundle.getLong("creation_timestamp"), bundle.getBoolean(ClidProvider.APP_ACTIVE), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), ieb1Var.hh(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
                            return;
                        } catch (IllegalArgumentException unused3) {
                            return;
                        }
                    }
                case 26:
                    ((j) this.c).Xg((Boolean) this.b, true);
                    return;
                case 27:
                    com.google.android.gms.measurement.internal.g gVar2 = (com.google.android.gms.measurement.internal.g) ((j) this.b).b;
                    fz91 l = gVar2.l();
                    String str5 = (String) this.c;
                    String str6 = l.K;
                    boolean z3 = (str6 == null || str6.equals(str5)) ? false : true;
                    l.K = str5;
                    if (z3) {
                        gVar2.l().Lg();
                        return;
                    }
                    return;
                case 28:
                    j5b1 j5b1Var = (j5b1) this.c;
                    zzgb zzgbVar = j5b1Var.x;
                    com.google.android.gms.measurement.internal.g gVar3 = (com.google.android.gms.measurement.internal.g) j5b1Var.b;
                    if (zzgbVar == null) {
                        y1a1 y1a1Var2 = gVar3.y;
                        com.google.android.gms.measurement.internal.g.g(y1a1Var2);
                        y1a1Var2.C.a("Failed to send app backgrounded");
                        return;
                    }
                    try {
                        zzgbVar.zzA((zzr) this.b);
                        j5b1Var.Tg();
                        return;
                    } catch (RemoteException e7) {
                        y1a1 y1a1Var3 = gVar3.y;
                        com.google.android.gms.measurement.internal.g.g(y1a1Var3);
                        y1a1Var3.z.b(e7, "Failed to send app backgrounded to the service");
                        return;
                    }
                default:
                    n nVar = (n) this.b;
                    nVar.w();
                    Runnable runnable2 = (Runnable) this.c;
                    nVar.M1().Gg();
                    if (nVar.I == null) {
                        nVar.I = new ArrayList();
                    }
                    nVar.I.add(runnable2);
                    nVar.l();
                    return;
            }
        } finally {
            ((o89) this.c).z = null;
        }
        ((o89) this.c).z = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                p891 p891Var = new p891(do91.class.getSimpleName(), 0);
                lg lgVar = (lg) this.c;
                gr81 gr81Var = new gr81(6);
                ((gr81) p891Var.w).c = gr81Var;
                p891Var.w = gr81Var;
                gr81Var.b = lgVar;
                return p891Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ do91(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ do91(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
