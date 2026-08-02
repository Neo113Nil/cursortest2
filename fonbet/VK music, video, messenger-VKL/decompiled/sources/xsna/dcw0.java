package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vk.core.widget.LifecycleHandler;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import xsna.ikv0;

/* compiled from: VoiceRecognitionControllerImpl.kt */
/* loaded from: classes7.dex */
public final class dcw0 implements ccw0 {
    public static final dcw0 a = new dcw0();
    public static final LinkedHashMap b = new LinkedHashMap();
    public static final LinkedHashMap c = new LinkedHashMap();

    /* compiled from: VoiceRecognitionControllerImpl.kt */
    public static final class a implements io.reactivex.rxjava3.disposables.c {
        public bcw0 b;
        public tb0 c;
        public final WeakReference<aeg0> d;

        public a(aeg0 aeg0Var, tb0 tb0Var, bcw0 bcw0Var) {
            this.b = bcw0Var;
            this.c = tb0Var;
            this.d = new WeakReference<>(aeg0Var);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            tb0 tb0Var;
            aeg0 aeg0Var;
            bcw0 bcw0Var = this.b;
            if (bcw0Var == null || (tb0Var = this.c) == null) {
                return;
            }
            if (dcw0.b.remove(bcw0Var) != null && (aeg0Var = this.d.get()) != null) {
                aeg0Var.yk(tb0Var);
            }
            this.c = null;
            this.b = null;
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return this.b == null;
        }
    }

    /* compiled from: VoiceRecognitionControllerImpl.kt */
    public static final class b {
        public final String a;
        public final float b;

        public b(String str, float f) {
            this.a = str;
            this.b = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VoiceRecognitionResult(text=");
            sb.append(this.a);
            sb.append(", confidence=");
            return xq.c(')', this.b, sb);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static b f(int i, int i2, Intent intent) {
        ?? r7;
        if (i != 34) {
            r7 = 0;
        } else if (i2 != -1 || intent == null) {
            r7 = EmptyList.b;
        } else {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            float[] floatArrayExtra = intent.getFloatArrayExtra("android.speech.extra.CONFIDENCE_SCORES");
            if (stringArrayListExtra == null || floatArrayExtra == null) {
                r7 = EmptyList.b;
            } else {
                r7 = new ArrayList(c5g.u(stringArrayListExtra, 10));
                int i3 = 0;
                for (Object obj : stringArrayListExtra) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    r7.add(new b((String) obj, floatArrayExtra[i3]));
                    i3 = i4;
                }
            }
        }
        if (r7 != 0) {
            return (b) j5g.a0(r7);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void g(Activity activity, bcw0 bcw0Var) {
        ikv0.a aVar = new ikv0.a(activity);
        aVar.u = new ikv0.d(activity.getString(R.string.voice_search_unavailable), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
        aVar.b().c();
        bcw0Var.getClass();
    }

    @Override // xsna.ccw0
    public final void a(aeg0 aeg0Var, acw0 acw0Var) {
        LinkedHashMap linkedHashMap = b;
        WeakReference weakReference = (WeakReference) linkedHashMap.get(acw0Var);
        if (weakReference != null) {
            tb0 tb0Var = (tb0) weakReference.get();
            if (tb0Var != null) {
                aeg0Var.yk(tb0Var);
            }
        }
    }

    @Override // xsna.ccw0
    public final boolean b(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0).size() > 0;
    }

    @Override // xsna.ccw0
    public final void c(LifecycleHandler lifecycleHandler, bcw0 bcw0Var) {
        LinkedHashMap linkedHashMap = c;
        b5z b5zVar = (b5z) linkedHashMap.get(bcw0Var);
        if (b5zVar != null) {
            lifecycleHandler.e(b5zVar);
        }
    }

    @Override // xsna.ccw0
    public final void d(LifecycleHandler lifecycleHandler, bcw0 bcw0Var) {
        Activity activity = lifecycleHandler.b;
        if (activity != null) {
            if (activity.getFragmentManager().findFragmentByTag("LifecycleHandler") != lifecycleHandler || !a.b(activity)) {
                g(activity, bcw0Var);
                return;
            }
            bcw0Var.b();
            LinkedHashMap linkedHashMap = c;
            if (linkedHashMap.containsKey(bcw0Var)) {
                return;
            }
            ecw0 ecw0Var = new ecw0(lifecycleHandler, bcw0Var);
            linkedHashMap.put(bcw0Var, ecw0Var);
            lifecycleHandler.a(ecw0Var);
            lifecycleHandler.g(34, String.valueOf(ecw0Var.b), new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.MAX_RESULTS", 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ccw0
    public final io.reactivex.rxjava3.disposables.c e(Activity activity, bcw0 bcw0Var, int i) {
        if (!b(activity)) {
            g(activity, bcw0Var);
            return EmptyDisposable.INSTANCE;
        }
        bcw0Var.b();
        LinkedHashMap linkedHashMap = b;
        WeakReference weakReference = (WeakReference) linkedHashMap.get(bcw0Var);
        tb0 tb0Var = weakReference != null ? (tb0) weakReference.get() : null;
        if (weakReference != null && tb0Var == null) {
            linkedHashMap.remove(bcw0Var);
        }
        if (tb0Var == null) {
            tb0Var = new fcw0(activity, bcw0Var);
            linkedHashMap.put(bcw0Var, new WeakReference(tb0Var));
            ((aeg0) activity).Li(tb0Var);
        }
        activity.startActivityForResult(new Intent("android.speech.action.RECOGNIZE_SPEECH").putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form").putExtra("android.speech.extra.MAX_RESULTS", i), 34);
        return new a((aeg0) activity, tb0Var, bcw0Var);
    }
}
