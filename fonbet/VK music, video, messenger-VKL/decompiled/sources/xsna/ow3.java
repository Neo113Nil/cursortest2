package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.i330;
import xsna.rw3;

/* compiled from: AsrRecordStartView.kt */
/* loaded from: classes7.dex */
public final class ow3 {
    public final Context a;
    public final jw3 b;
    public final ViewGroup c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final io.reactivex.rxjava3.subjects.f<pw3> g;
    public final i330<rw3> h;
    public final io.reactivex.rxjava3.disposables.b i;
    public boolean j;

    public ow3(Context context, ViewGroup viewGroup, jw3 jw3Var) {
        this.a = context;
        this.b = jw3Var;
        this.c = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.voip_asr_start_dialog, viewGroup, false);
        i70 i70Var = new i70(this, 5);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, i70Var);
        this.d = a;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new j70(this, 3));
        this.e = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new defpackage.r(this, 8));
        this.f = a3;
        this.g = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        arrayList2.add(new i330.b(kw3.b, new lw3(1, this, ow3.class, "onErrorContentChanged", "onErrorContentChanged(Ljava/lang/Throwable;)V", 0, 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(rw3.a.class), new i330(arrayList2, hashMap2));
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        arrayList3.add(new i330.b(mw3.b, new ix2(this, 2), new pv7((byte) 0, 3)));
        arrayList3.add(new i330.b(nw3.b, new j9(this, 4), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(rw3.b.class), new i330(arrayList3, hashMap3));
        this.h = new i330<>(arrayList, hashMap);
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.i = bVar;
        this.j = true;
        bVar.b(bwt0.f((EditText) a2.getValue()).subscribe(new k5(new j5(this, 4), 1)));
        bwt0.i0((Button) a3.getValue(), new l5(this, 3));
        bwt0.i0((View) a.getValue(), new po1(this, 2));
    }

    public final void a() {
        if (this.j) {
            return;
        }
        L.A("AsrRecordStartView", "View is destroyed", new IllegalStateException("View is destroyed"));
        tv4.b("AsrRecordStartView: View is destroyed", com.vk.metrics.eventtracking.b.a);
    }
}
