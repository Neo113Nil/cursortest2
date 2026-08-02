package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.c0;
import com.google.ar.core.d0;
import com.yandex.alicekit.core.slideup.SlidingBehavior;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.t;
import com.yandex.div.core.view2.divs.widgets.DivSliderView;
import com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.pending.OutgoingAttachment$ExistingAttachment;
import com.yandex.messaging.internal.view.chat.input.textsuggest.d;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import com.ybsdk.feature.kyc.internal.screens.photo.views.PunchHoleView;
import com.ybsdk.feature.savings.internal.views.diffrate.DiffRateCalendarView;
import com.ybsdk.widgets.common.rangedatepicker.RangeDatePickerCalendarView;
import defpackage.cw5;
import defpackage.sls;
import defpackage.tls;
import defpackage.zy11;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Region;
import org.altbeacon.beacon.service.Callback;
import org.altbeacon.beacon.service.ExtraDataBeaconTracker;
import org.altbeacon.beacon.service.RangeState;
import org.altbeacon.beacon.service.RegionMonitoringState;
import org.altbeacon.beacon.service.scanner.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.yandex.taxi.perf.screen.c;

/* loaded from: classes15.dex */
public final class lz implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object w;

    public lz(mlm0 mlm0Var, d2e0 d2e0Var) {
        this.a = 23;
        this.w = mlm0Var;
        this.b = s9j.b;
        this.c = d2e0Var;
    }

    private final void a() {
        synchronized (ywt0.y) {
            ywt0.a((ywt0) this.w, (hqg) this.b);
        }
        ((ba20) this.c).success(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145  */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Iterable iterable;
        String minVisibleDayShortServerIsoOrEmpty;
        l6o l6oVar;
        List J0;
        l6o l6oVar2;
        OverScroller overScroller;
        qa3 qa3Var;
        a561 a561Var;
        OutgoingAttachment$ExistingAttachment[] outgoingAttachment$ExistingAttachmentArr = null;
        Object obj = null;
        Beacon beacon = null;
        int i = 0;
        switch (this.a) {
            case 0:
                b00.a((b00) this.b).a(new pyq((ChatRequest) this.c, (String) this.w));
                return;
            case 1:
                b00.a((b00) this.b).a(new hb9((ChatRequest) this.c, (kv10) this.w));
                return;
            case 2:
                i00 a = b00.a((b00) this.b);
                int i2 = y721.A;
                a.a(new y721((ChatRequest) this.c, null, (g720) this.w, 2));
                return;
            case 3:
                ((i00) ((b00) this.b).j.getValue()).a(new ttb0((ChatRequest) this.c, (ServerMessageRef) this.w));
                return;
            case 4:
                ((i00) ((b00) this.b).j.getValue()).a(new hoq0((ChatRequest) this.c, (dh7) this.w));
                return;
            case 5:
                rsa0 rsa0Var = (rsa0) ((b00) this.b).k.getValue();
                ChatRequest chatRequest = (ChatRequest) this.c;
                yw80 yw80Var = (yw80) this.w;
                uw80[] uw80VarArr = yw80Var.d;
                kse.a(rsa0Var.a);
                if (rsa0Var.c.d.get()) {
                    return;
                }
                psa0 b = rsa0Var.b(chatRequest);
                i7b i7bVar = b != null ? b.b : null;
                ksa0 ksa0Var = rsa0Var.f;
                if (uw80VarArr != null) {
                    iterable = new ArrayList();
                    for (uw80 uw80Var : uw80VarArr) {
                        if (uw80Var instanceof tw80) {
                            iterable.add(uw80Var);
                        }
                    }
                } else {
                    iterable = EmptyList.a;
                }
                Iterable iterable2 = iterable;
                ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
                Iterator it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((tw80) it.next()).a);
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (((String[]) array).length == 0) {
                    array = null;
                }
                String[] strArr = (String[]) array;
                tw80 tw80Var = (tw80) a.R(iterable);
                boolean z = tw80Var != null ? tw80Var.b : false;
                if (uw80VarArr != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (uw80 uw80Var2 : uw80VarArr) {
                        if (uw80Var2 instanceof OutgoingAttachment$ExistingAttachment) {
                            arrayList2.add(uw80Var2);
                        }
                    }
                    outgoingAttachment$ExistingAttachmentArr = (OutgoingAttachment$ExistingAttachment[]) arrayList2.toArray(new OutgoingAttachment$ExistingAttachment[0]);
                }
                ksa0Var.g(chatRequest, new osa0(0L, chatRequest.uniqueRequestId(), yw80Var.a, 0L, System.currentTimeMillis() / 1000.0d, yw80Var.b, null, strArr, z, outgoingAttachment$ExistingAttachmentArr, yw80Var.e, yw80Var.c, yw80Var.f, false, yw80Var.h.c(), yw80Var.g, yw80Var.i, yw80Var.k, yw80Var.j, yw80Var.l));
                if (i7bVar != null) {
                    qsa0 qsa0Var = new qsa0(rsa0Var, chatRequest, i7bVar, yw80Var);
                    qsa0Var.c();
                    if (qsa0Var.f || qsa0Var.d == null) {
                        return;
                    }
                    rsa0Var.b.b.put(yw80Var.a, qsa0Var);
                    return;
                }
                return;
            case 6:
                b00.a((b00) this.b).a(new y621((ChatRequest) this.c, (z621) this.w));
                return;
            case 7:
                i00 i00Var = (i00) ((b00) this.b).j.getValue();
                int i3 = y721.A;
                i00Var.a(new y721((ChatRequest) this.c, (abz0) this.w, null, 4));
                return;
            case 8:
                ((i00) ((b00) this.b).j.getValue()).a(new a921((kg9) this.c, (sls) this.w));
                return;
            case 9:
                b00.a((b00) this.b).a(new vz31((ChatRequest) this.c, (nxd0) this.w));
                return;
            case 10:
                hsj0 hsj0Var = (hsj0) this.w;
                try {
                    ParcelFileDescriptor openFileDescriptor = ((ContentResolver) this.b).openFileDescriptor((Uri) this.c, "r");
                    if (openFileDescriptor == null) {
                        hsj0Var.l(new FileNotFoundException());
                    } else {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                        openFileDescriptor.close();
                        if (decodeFileDescriptor == null) {
                            hsj0Var.l(new IOException("File could not be decoded."));
                        } else {
                            hsj0Var.k(decodeFileDescriptor);
                        }
                    }
                    return;
                } catch (IOException e) {
                    hsj0Var.l(e);
                    return;
                }
            case 11:
                try {
                    ((b) this.w).F = false;
                    ((BluetoothLeScanner) this.b).stopScan((ScanCallback) this.c);
                    return;
                } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                    return;
                }
            case 12:
                View view = (View) this.b;
                if (view.isAttachedToWindow()) {
                    tls tlsVar = (tls) this.c;
                    if (tlsVar != null) {
                        minVisibleDayShortServerIsoOrEmpty = ((DiffRateCalendarView) this.w).minVisibleDayShortServerIsoOrEmpty();
                        tlsVar.invoke(minVisibleDayShortServerIsoOrEmpty);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                final com.yandex.div.core.util.binding.a aVar = (com.yandex.div.core.util.binding.a) this.b;
                final bw5 a2 = aVar.b.a();
                try {
                    try {
                        aVar.d = true;
                        ArrayList arrayList3 = aVar.e;
                        Boolean valueOf = Boolean.valueOf(((Div2View) this.c).loadReferences.add((hxy) this.w));
                        List J02 = a.J0(arrayList3);
                        arrayList3.clear();
                        Pair pair = new Pair(valueOf, J02);
                        aVar.d = false;
                        final Object first = pair.getFirst();
                        final List list = (List) pair.getSecond();
                        if (list.isEmpty()) {
                            cw5.b(a2);
                            return;
                        } else {
                            ngd0.G.t(new sls() { // from class: com.yandex.div.core.view2.Div2View$addLoadReference$$inlined$runWithinBindingContext$1$1
                                final /* synthetic */ tls $onComplete = null;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // defpackage.sls
                                public final Object invoke() {
                                    com.yandex.div.core.util.binding.a.this.b.d();
                                    try {
                                        Iterator it2 = list.iterator();
                                        while (it2.hasNext()) {
                                            ((sls) it2.next()).invoke();
                                        }
                                        tls tlsVar2 = this.$onComplete;
                                        if (tlsVar2 != null) {
                                            tlsVar2.invoke(first);
                                        }
                                        cw5 cw5Var = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a2);
                                        return zy11.a;
                                    } catch (Throwable th) {
                                        cw5 cw5Var2 = com.yandex.div.core.util.binding.a.this.b;
                                        cw5.b(a2);
                                        throw th;
                                    }
                                }
                            });
                            return;
                        }
                    } catch (Throwable th) {
                        cw5.b(a2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    aVar.d = false;
                    throw th2;
                }
            case 14:
                ((DivEducationsV2View) this.c).updatePopupPosition((won) this.w);
                return;
            case 15:
                if (((DivSliderView) this.c).getActiveTickMarkDrawable() == null && ((DivSliderView) this.c).getInactiveTickMarkDrawable() == null) {
                    return;
                }
                float maxValue = ((DivSliderView) this.c).getMaxValue() - ((DivSliderView) this.c).getMinValue();
                Drawable activeTickMarkDrawable = ((DivSliderView) this.c).getActiveTickMarkDrawable();
                int intrinsicWidth = activeTickMarkDrawable != null ? activeTickMarkDrawable.getIntrinsicWidth() : 0;
                if (Math.max(intrinsicWidth, ((DivSliderView) this.c).getInactiveTickMarkDrawable() != null ? r3.getIntrinsicWidth() : 0) * maxValue <= ((DivSliderView) this.c).getWidth() || (l6oVar = ((t) this.w).B) == null) {
                    return;
                }
                synchronized (l6oVar.d) {
                    J0 = a.J0(l6oVar.h);
                }
                Iterator it2 = J0.iterator();
                while (it2.hasNext()) {
                    if (jl40.l(((Throwable) it2.next()).getMessage(), "Slider ticks overlap each other.")) {
                        i = 1;
                    }
                }
                if (i != 0 || (l6oVar2 = ((t) this.w).B) == null) {
                    return;
                }
                l6oVar2.f(new Throwable("Slider ticks overlap each other."));
                return;
            case 16:
                ba20 ba20Var = (ba20) this.b;
                nrs nrsVar = (nrs) this.w;
                boolean booleanValue = ((Boolean) ((x920) this.c).a("toAlbum")).booleanValue();
                Uri uri = nrs.x;
                ba20Var.success(Boolean.valueOf(nrsVar.b(booleanValue)));
                return;
            case 17:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                e9u e9uVar = (e9u) this.w;
                View view2 = (View) this.c;
                if (view2 == null || (overScroller = e9uVar.w) == null) {
                    return;
                }
                if (!overScroller.computeScrollOffset()) {
                    e9uVar.A(coordinatorLayout, view2);
                    return;
                } else {
                    e9uVar.C(coordinatorLayout, view2, e9uVar.w.getCurrY());
                    view2.postOnAnimation(this);
                    return;
                }
            case 18:
                KycPhotoFragment kycPhotoFragment = (KycPhotoFragment) this.w;
                int[] iArr = new int[2];
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.c;
                appCompatImageView.getLocationOnScreen(iArr);
                Rect bounds = appCompatImageView.getDrawable().getBounds();
                if (bounds.height() <= appCompatImageView.getMeasuredHeight()) {
                    int measuredHeight = (appCompatImageView.getMeasuredHeight() - bounds.height()) / 2;
                    PunchHoleView punchHoleView = KycPhotoFragment.access$getBinding(kycPhotoFragment).c.k;
                    int i4 = iArr[0];
                    punchHoleView.setHoleBorders(new Rect(i4, iArr[1] + measuredHeight, appCompatImageView.getMeasuredWidth() + i4, (appCompatImageView.getMeasuredHeight() + iArr[1]) - measuredHeight));
                    return;
                }
                int width = (KycPhotoFragment.access$getBinding(kycPhotoFragment).a.getWidth() - appCompatImageView.getWidth()) / 2;
                PunchHoleView punchHoleView2 = KycPhotoFragment.access$getBinding(kycPhotoFragment).c.k;
                int i5 = iArr[0];
                punchHoleView2.setHoleBorders(new Rect(i5 + width, iArr[1], (appCompatImageView.getMeasuredWidth() + i5) - width, appCompatImageView.getMeasuredHeight() + iArr[1]));
                return;
            case 19:
                ((c) this.c).i((yjv0) this.w);
                return;
            case 20:
                Calendar calendar = (Calendar) this.c;
                RangeDatePickerCalendarView rangeDatePickerCalendarView = (RangeDatePickerCalendarView) this.w;
                View view3 = (View) this.b;
                if (view3.isAttachedToWindow()) {
                    kb61 kb61Var = new kb61(calendar.get(1), calendar.get(2));
                    qa3Var = rangeDatePickerCalendarView.calendarAdapter;
                    Iterator it3 = qa3Var.b.f.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            kf7 kf7Var = (kf7) it3.next();
                            jf7 jf7Var = kf7Var instanceof jf7 ? (jf7) kf7Var : null;
                            if (!jl40.l(jf7Var != null ? jf7Var.a.a : null, kb61Var)) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        a561Var = rangeDatePickerCalendarView.binding;
                        RecyclerView recyclerView = a561Var.b;
                        recyclerView.post(new xz(recyclerView, rangeDatePickerCalendarView, i, 6));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                h3j0 h3j0Var = (h3j0) this.w;
                h3j0Var.b((h3f) this.b, (atx0) this.c);
                h3j0Var.i.b.set(0);
                double min = Math.min(3600000.0d, Math.pow(h3j0Var.b, h3j0Var.a()) * (60000.0d / h3j0Var.a));
                String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
                Log.isLoggable("FirebaseCrashlytics", 3);
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            case 22:
                try {
                    obj = ((uyr) this.b).call();
                } catch (Exception unused3) {
                }
                ((Handler) this.w).post(new do91(11, (vyr) this.c, obj));
                return;
            case 23:
                if (((mlm0) this.w).h.size() > 0) {
                    ((BeaconParser) ((mlm0) this.w).h.iterator().next()).getClass();
                }
                for (BeaconParser beaconParser : ((mlm0) this.w).h) {
                    d2e0 d2e0Var = (d2e0) this.c;
                    beacon = beaconParser.c(d2e0Var.a, d2e0Var.b, (BluetoothDevice) d2e0Var.c, (byte[]) d2e0Var.d);
                    if (beacon != null) {
                        if (beacon == null) {
                            s9j s9jVar = (s9j) this.b;
                            s9jVar.getClass();
                            s9jVar.a = SystemClock.elapsedRealtime();
                            xof xofVar = ((mlm0) this.w).c;
                            if (xofVar != null && !xofVar.w) {
                                d2k d2kVar = ((mlm0) this.w).f;
                                String address = ((BluetoothDevice) ((d2e0) this.c).c).getAddress();
                                byte[] bArr = (byte[]) ((d2e0) this.c).d;
                                d2kVar.getClass();
                                byte[] bytes = address.getBytes();
                                ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bArr.length);
                                allocate.put(bytes);
                                allocate.put(bArr);
                                allocate.rewind();
                                HashSet hashSet = d2kVar.a;
                                if (!(hashSet.size() == 1000 ? hashSet.contains(allocate) : hashSet.add(allocate))) {
                                    ((mlm0) this.w).c.w = true;
                                }
                            }
                            mlm0 mlm0Var = (mlm0) this.w;
                            mlm0Var.getClass();
                            w7u0.c.getClass();
                            ExtraDataBeaconTracker extraDataBeaconTracker = mlm0Var.g;
                            synchronized (extraDataBeaconTracker) {
                                try {
                                    if (!beacon.isMultiFrameBeacon()) {
                                        if (beacon.getServiceUuid() != -1) {
                                        }
                                    }
                                    beacon = extraDataBeaconTracker.b(beacon);
                                } finally {
                                }
                            }
                            if (beacon == null) {
                                return;
                            }
                            i630 i630Var = mlm0Var.d;
                            synchronized (i630Var) {
                                try {
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Region region : i630Var.e()) {
                                        if (region.matchesBeacon(beacon)) {
                                            arrayList4.add(region);
                                        }
                                    }
                                    Iterator it4 = arrayList4.iterator();
                                    while (it4.hasNext()) {
                                        Region region2 = (Region) it4.next();
                                        RegionMonitoringState regionMonitoringState = (RegionMonitoringState) i630Var.c().get(region2);
                                        if (regionMonitoringState != null && regionMonitoringState.c()) {
                                            if (regionMonitoringState.a) {
                                                Callback a3 = regionMonitoringState.a();
                                                Context context = (Context) i630Var.e;
                                                boolean b2 = regionMonitoringState.b();
                                                Bundle bundle = new Bundle();
                                                bundle.putSerializable("region", region2);
                                                bundle.putBoolean("inside", b2);
                                                a3.getClass();
                                                Callback.a(context, bundle, "monitoringData");
                                            }
                                            i = 1;
                                        }
                                    }
                                    if (i != 0) {
                                        i630Var.g();
                                    } else {
                                        ((Context) i630Var.e).getFileStreamPath("org.altbeacon.beacon.service.monitoring_status_state").setLastModified(System.currentTimeMillis());
                                    }
                                } finally {
                                }
                            }
                            synchronized (mlm0Var.e) {
                                try {
                                    Set<Region> keySet = mlm0Var.e.keySet();
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Region region3 : keySet) {
                                        if (region3 != null && region3.matchesBeacon(beacon)) {
                                            arrayList5.add(region3);
                                        }
                                    }
                                    Iterator it5 = arrayList5.iterator();
                                    while (it5.hasNext()) {
                                        RangeState rangeState = (RangeState) mlm0Var.e.get((Region) it5.next());
                                        if (rangeState != null) {
                                            rangeState.a(beacon);
                                        }
                                    }
                                } finally {
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if (beacon == null) {
                }
                break;
            case 24:
                ((k4s0) ((j0s0) this.c)).a((ga5) this.b);
                ((ShortcutsOnItemClickInteractorImpl$openExpectedDestination$$inlined$suspendCallbackApi$2) this.w).invoke(zy11.a);
                return;
            case 25:
                OverScroller overScroller2 = (OverScroller) this.b;
                boolean computeScrollOffset = overScroller2.computeScrollOffset();
                SlidingBehavior slidingBehavior = (SlidingBehavior) this.w;
                if (!computeScrollOffset) {
                    slidingBehavior.A();
                    return;
                }
                slidingBehavior.v(overScroller2.getCurrY());
                View view4 = (View) this.c;
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                view4.postOnAnimation(this);
                return;
            case 26:
                a();
                return;
            case 27:
                com.yandex.messaging.internal.view.chat.input.textsuggest.a aVar2 = (com.yandex.messaging.internal.view.chat.input.textsuggest.a) this.c;
                RecyclerView recyclerView2 = aVar2.B;
                BottomSheetBehavior bottomSheetBehavior = aVar2.D;
                int height = recyclerView2.getHeight();
                int i6 = aVar2.y;
                boolean z2 = height <= i6;
                bottomSheetBehavior.V(Math.min(i6, height), false);
                bottomSheetBehavior.f0 = z2;
                if (bottomSheetBehavior.k0 == 5 || aVar2.C == null) {
                    bottomSheetBehavior.W(z2 ? 3 : 4);
                }
                aVar2.A.l1(0);
                d dVar = aVar2.x;
                mty0 mty0Var = (mty0) this.w;
                qty0 qty0Var = dVar.g;
                if (qty0Var == null) {
                    return;
                }
                int size = mty0Var.a.size();
                qty0Var.d = size;
                dVar.d.reportEvent("display suggests", kotlin.collections.b.i(new Pair("chat id", dVar.f), new Pair("action id", qty0Var.b), new Pair("count", Integer.valueOf(size)), new Pair(RemoteBioParameters.TIME, Long.valueOf(((Number) qty0Var.e.getValue()).longValue()))));
                return;
            case 28:
                boolean z3 = ((Ref$BooleanRef) this.b).element;
                return;
            default:
                if (((AtomicBoolean) this.b).getAndSet(true)) {
                    return;
                }
                d0.e((InstallActivity) this.c, (c0) this.w);
                return;
        }
    }

    public /* synthetic */ lz(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public /* synthetic */ lz(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
    }

    public /* synthetic */ lz(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.w = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public lz(Ref$BooleanRef ref$BooleanRef, View view, ax60 ax60Var, View view2) {
        this.a = 28;
        this.b = ref$BooleanRef;
        this.c = view;
        this.w = view2;
    }

    public /* synthetic */ lz() {
        this.a = 22;
    }
}
