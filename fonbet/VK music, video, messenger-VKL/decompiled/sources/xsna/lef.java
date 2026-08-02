package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.vk.media.MediaUtils;
import java.util.HashMap;
import java.util.List;

/* compiled from: ClipsUploadEditDepsVK.kt */
/* loaded from: classes17.dex */
public final class lef implements mef {
    public final bpn0 a = new bpn0(new nm0(6));
    public final cmf b = new cmf();
    public final r5f c = new r5f();
    public final a d;

    /* compiled from: ClipsUploadEditDepsVK.kt */
    public static final class a implements tw50 {
        public HashMap<String, fcn> a;

        @Override // xsna.tw50
        public final void a(Context context) {
            ww50<?> Y;
            HashMap<String, fcn> hashMap = this.a;
            fcn fcnVar = hashMap.get("clip_description_edit");
            if (fcnVar != null) {
                ComponentCallbacks2 h = e3m.h(context);
                ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
                if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                    Y.H(fcnVar);
                }
            }
            hashMap.remove("clip_description_edit");
        }

        @Override // xsna.tw50
        public final void b(Context context, gy0 gy0Var) {
            ww50<?> Y;
            HashMap<String, fcn> hashMap = this.a;
            kef kefVar = new kef(gy0Var);
            ComponentCallbacks2 h = e3m.h(context);
            ey50 ey50Var = h instanceof ey50 ? (ey50) h : null;
            if (ey50Var != null && (Y = ey50Var.Y()) != null) {
                Y.S(kefVar);
            }
            hashMap.put("clip_description_edit", kefVar);
        }
    }

    public lef() {
        a aVar = new a();
        aVar.a = new HashMap<>();
        this.d = aVar;
    }

    @Override // xsna.mef
    public final cmf a() {
        return this.b;
    }

    @Override // xsna.mef
    public final a b() {
        return this.d;
    }

    @Override // xsna.mef
    public final dia0 c(lpj lpjVar, xcd xcdVar) {
        return new dia0(lpjVar, xcdVar);
    }

    @Override // xsna.mef
    public final c1f d(List list, MediaUtils.d dVar) {
        return ((z3l0) this.a.getValue()).c(list, dVar);
    }

    @Override // xsna.mef
    public final r5f e() {
        return this.c;
    }

    @Override // xsna.mef
    public final gcd0 f() {
        return new gcd0(14);
    }
}
