package com.twilio.audioswitch;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import com.twilio.audioswitch.scanners.AudioDeviceScanner;
import defpackage.amm0;
import defpackage.ef3;
import defpackage.g191;
import defpackage.gf3;
import defpackage.h3u;
import defpackage.hf3;
import defpackage.i3y;
import defpackage.if3;
import defpackage.jf3;
import defpackage.jl40;
import defpackage.n9f0;
import defpackage.ny61;
import defpackage.ogz;
import defpackage.scc;
import defpackage.tcc;
import defpackage.v6;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zf3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: classes11.dex */
public abstract class a implements amm0 {
    public static final i3y E = kotlin.a.a(AbstractAudioSwitch$Companion$defaultPreferredDeviceList$2.w);
    public boolean B;
    public final ogz C;
    public final if3 D;
    public wls a;
    public final AudioDeviceScanner c;
    public List w;
    public hf3 x;
    public hf3 y;
    public ConcurrentSkipListSet z;
    public AbstractAudioSwitch$State b = AbstractAudioSwitch$State.STOPPED;
    public boolean A = true;

    public a(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, AudioDeviceScanner audioDeviceScanner, n9f0 n9f0Var, List list, if3 if3Var) {
        this.C = n9f0Var;
        this.D = if3Var;
        this.c = audioDeviceScanner;
        this.w = d(list);
        this.z = new ConcurrentSkipListSet(new jf3(this.w, 0));
        List list2 = this.w;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Class) it.next()).getSimpleName());
        }
        arrayList.toString();
    }

    public static List d(List list) {
        Map a = h3u.a(new g191(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (((Number) entry.getValue()).intValue() > 1) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!linkedHashMap.isEmpty()) {
            ny61.g("Failed requirement.");
            return null;
        }
        boolean isEmpty = list.isEmpty();
        i3y i3yVar = E;
        if (isEmpty || list.equals((List) i3yVar.getValue())) {
            return (List) i3yVar.getValue();
        }
        ArrayList arrayList = new ArrayList((List) i3yVar.getValue());
        arrayList.removeAll(list);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            arrayList.add(i, (Class) obj);
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public static void g(a aVar, boolean z) {
        hf3 hf3Var;
        AudioDeviceScanner audioDeviceScanner = aVar.c;
        hf3 hf3Var2 = aVar.x;
        if (hf3Var2 == null || !audioDeviceScanner.isDeviceActive(hf3Var2)) {
            Iterator it = aVar.z.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hf3Var = 0;
                    break;
                } else {
                    hf3Var = it.next();
                    if (audioDeviceScanner.isDeviceActive((hf3) hf3Var)) {
                        break;
                    }
                }
            }
            hf3Var2 = hf3Var;
        }
        aVar.f(z, hf3Var2);
    }

    @Override // defpackage.amm0
    public final void b(hf3 hf3Var) {
        hf3Var.toString();
        ((n9f0) this.C).getClass();
        if ((hf3Var instanceof ef3) && kotlin.collections.a.J0(this.z).contains(new gf3(0))) {
            return;
        }
        boolean add = this.z.add(hf3Var);
        if (hf3Var instanceof gf3) {
            ycc.v(this.z, AbstractAudioSwitch$onDeviceConnected$1.w, true);
        }
        g(this, add);
    }

    public final void c() {
        hf3 hf3Var;
        int i = v6.b[this.b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ny61.k();
                return;
            }
            hf3 hf3Var2 = this.y;
            if (hf3Var2 != null) {
                hf3Var = i() ? hf3Var2 : null;
                if (hf3Var != null) {
                    e(hf3Var);
                    return;
                }
                return;
            }
            return;
        }
        if3 if3Var = this.D;
        AudioManager audioManager = if3Var.k;
        AudioManager audioManager2 = if3Var.k;
        if3Var.a = audioManager.getMode();
        if3Var.b = audioManager.isMicrophoneMute();
        if3Var.c = audioManager.isSpeakerphoneOn();
        audioManager2.setMicrophoneMute(false);
        if (this.A) {
            if3Var.l.getClass();
            zf3 zf3Var = if3Var.m;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = if3Var.n;
            int i2 = if3Var.f;
            int i3 = if3Var.g;
            int i4 = if3Var.h;
            zf3Var.getClass();
            AudioFocusRequest build = new AudioFocusRequest.Builder(i2).setAudioAttributes(new AudioAttributes.Builder().setUsage(i3).setContentType(i4).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(onAudioFocusChangeListener).build();
            if3Var.d = build;
            audioManager2.requestAudioFocus(build);
            audioManager2.setMode(if3Var.e);
        }
        hf3 hf3Var3 = this.y;
        if (hf3Var3 != null) {
            hf3Var = i() ? hf3Var3 : null;
            if (hf3Var != null) {
                e(hf3Var);
            }
        }
        this.b = AbstractAudioSwitch$State.ACTIVATED;
    }

    public abstract void e(hf3 hf3Var);

    public final void f(boolean z, hf3 hf3Var) {
        wls wlsVar;
        if (jl40.l(this.y, hf3Var)) {
            if (!z || (wlsVar = this.a) == null) {
                return;
            }
            return;
        }
        if (i()) {
            Objects.toString(this.x);
            ((n9f0) this.C).getClass();
            this.y = hf3Var;
            if (this.b == AbstractAudioSwitch$State.ACTIVATED) {
                c();
            }
        }
        wls wlsVar2 = this.a;
        if (wlsVar2 != null) {
        }
    }

    public final void h(hf3 hf3Var) {
        Objects.toString(hf3Var);
        ((n9f0) this.C).getClass();
        this.x = hf3Var;
        f(false, hf3Var);
    }

    public final boolean i() {
        int i = this.D.e;
        return this.B || i == 3 || i == 2;
    }
}
