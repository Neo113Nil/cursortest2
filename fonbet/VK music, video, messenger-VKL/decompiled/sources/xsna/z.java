package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.ironsource.Aa;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.photo.editor.ivm.EditorMessage;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.mail.libverify.api.VerificationApi;
import ru.ok.gleffects.impl.EffectNativeSink;
import ru.ok.gleffects.recognition.DynamicRequirements;
import ru.ok.tracer.crash.report.CrashDescription;
import ru.ok.tracer.crash.report.CrashLoggerInternal;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SuperappUiRouterBridge.c p0;
        switch (this.b) {
            case 0:
                Aa.a((LevelPlayAdInfo) this.c, (Aa) this.d);
                return;
            case 1:
                CrashLoggerInternal.reportNonFatal$lambda$2((CrashLoggerInternal) this.c, (CrashDescription) this.d);
                return;
            case 2:
                ((com.vk.photo.editor.ivm.d) this.c).a((EditorMessage.i) this.d);
                return;
            case 3:
                ((EffectNativeSink) this.c).lambda$onRequirementsChanged$14((DynamicRequirements) this.d);
                return;
            case 4:
                z4w z4wVar = (z4w) this.c;
                Context context = (Context) this.d;
                z4wVar.c.requestFocus();
                EditText editText = z4wVar.c;
                editText.setSelection(editText.getText().length());
                ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 0);
                return;
            case 5:
                ((androidx.media3.exoplayer.source.m) this.c).t((n3i0) this.d);
                return;
            case 6:
                k0i0 k0i0Var = (k0i0) this.c;
                Editable editable = (Editable) this.d;
                l0i0 l0i0Var = k0i0Var.b;
                l0i0Var.a.c(editable.toString());
                l0i0Var.b = null;
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                cti0 cti0Var = (cti0) this.d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof usi0.a) {
                        arrayList2.add(obj);
                    }
                }
                ujp ujpVar = cti0Var.g;
                synchronized (ujpVar) {
                    ujpVar.a.d(arrayList2);
                }
                if (cti0Var.b()) {
                    return;
                }
                cti0Var.f.b(arrayList2);
                return;
            case 8:
                tdr0 tdr0Var = (tdr0) this.c;
                yfu0 yfu0Var = (yfu0) this.d;
                ggu0 ggu0Var = tdr0Var.d;
                Activity b = gnj.b(ggu0Var.b);
                if (b != null) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    if (!yfu0Var.isLaidOut()) {
                        yfu0Var.addOnLayoutChangeListener(new sdr0(yfu0Var, tdr0Var, b));
                        return;
                    }
                    Rect rect = new Rect();
                    yfu0Var.b.getGlobalVisibleRect(rect);
                    rect.offset(0, iah0.a(4));
                    WebApiApplication v = tdr0Var.b.v();
                    if ((v != null ? v.R : null) == null) {
                        p0 = null;
                    } else {
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        if (superappUiRouterBridge == null) {
                            superappUiRouterBridge = null;
                        }
                        p0 = superappUiRouterBridge.p0(b, rect, new tsk0(tdr0Var, 16));
                    }
                    if (p0 == null) {
                        SuperappUiRouterBridge superappUiRouterBridge2 = e370.d;
                        (superappUiRouterBridge2 != null ? superappUiRouterBridge2 : null).S(b, rect, new wzb0(tdr0Var, 26));
                    }
                    ggu0Var.y = true;
                    return;
                }
                return;
            default:
                ((ru.mail.libverify.api.q) this.c).b((VerificationApi.VerificationStateChangedListener) this.d);
                return;
        }
    }
}
