package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import defpackage.asy0;
import defpackage.cre;
import defpackage.dry0;
import defpackage.eiv;
import defpackage.ez2;
import defpackage.gwc0;
import defpackage.hoy0;
import defpackage.i3y;
import defpackage.iv60;
import defpackage.jl40;
import defpackage.m810;
import defpackage.oav0;
import defpackage.rlf;
import defpackage.sls;
import defpackage.tls;
import defpackage.w511;
import defpackage.wz40;
import defpackage.zii0;
import defpackage.zjy0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class f implements gwc0 {
    public final View a;
    public final b b;
    public final rlf c;
    public boolean d;
    public tls e;
    public tls f;
    public hoy0 g;
    public eiv h;
    public final ArrayList i;
    public final i3y j;
    public Rect k;
    public final a l;
    public final wz40 m;
    public d n;

    public f(View view, AndroidComposeView androidComposeView) {
        b bVar = new b(view);
        rlf rlfVar = new rlf(1, Choreographer.getInstance());
        this.a = view;
        this.b = bVar;
        this.c = rlfVar;
        this.e = TextInputServiceAndroid$onEditCommand$1.w;
        this.f = TextInputServiceAndroid$onImeActionPerformed$1.w;
        this.g = new hoy0("", asy0.b, 4);
        this.h = eiv.g;
        this.i = new ArrayList();
        this.j = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new BaseInputConnection(f.this.a, false);
            }
        });
        this.l = new a(androidComposeView, bVar);
        this.m = new wz40(new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // defpackage.gwc0
    public final void a() {
        this.d = false;
        this.e = TextInputServiceAndroid$stopInput$1.w;
        this.f = TextInputServiceAndroid$stopInput$2.w;
        this.k = null;
        i(TextInputServiceAndroid$TextInputCommand.StopInput);
    }

    @Override // defpackage.gwc0
    public final void b(hoy0 hoy0Var, hoy0 hoy0Var2) {
        boolean z = (asy0.b(this.g.b, hoy0Var2.b) && jl40.l(this.g.c, hoy0Var2.c)) ? false : true;
        this.g = hoy0Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            RecordingInputConnection recordingInputConnection = (RecordingInputConnection) ((WeakReference) this.i.get(i)).get();
            if (recordingInputConnection != null) {
                recordingInputConnection.setMTextFieldValue$ui(hoy0Var2);
            }
        }
        a aVar = this.l;
        synchronized (aVar.c) {
            aVar.j = null;
            aVar.l = null;
            aVar.k = null;
            aVar.m = CursorAnchorInfoController$invalidate$1$1.w;
            aVar.n = null;
            aVar.o = null;
        }
        if (jl40.l(hoy0Var, hoy0Var2)) {
            if (z) {
                b bVar = this.b;
                int f = asy0.f(hoy0Var2.b);
                int e = asy0.e(hoy0Var2.b);
                asy0 asy0Var = this.g.c;
                int f2 = asy0Var != null ? asy0.f(asy0Var.a) : -1;
                asy0 asy0Var2 = this.g.c;
                ((InputMethodManager) bVar.b.getValue()).updateSelection(bVar.a, f, e, f2, asy0Var2 != null ? asy0.e(asy0Var2.a) : -1);
                return;
            }
            return;
        }
        if (hoy0Var != null && (!jl40.l(hoy0Var.a.b, hoy0Var2.a.b) || (asy0.b(hoy0Var.b, hoy0Var2.b) && !jl40.l(hoy0Var.c, hoy0Var2.c)))) {
            b bVar2 = this.b;
            ((InputMethodManager) bVar2.b.getValue()).restartInput(bVar2.a);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            RecordingInputConnection recordingInputConnection2 = (RecordingInputConnection) ((WeakReference) this.i.get(i2)).get();
            if (recordingInputConnection2 != null) {
                recordingInputConnection2.updateInputState(this.g, this.b);
            }
        }
    }

    @Override // defpackage.gwc0
    public final void c(hoy0 hoy0Var, eiv eivVar, zjy0 zjy0Var, cre creVar) {
        this.d = true;
        this.g = hoy0Var;
        this.h = eivVar;
        this.e = zjy0Var;
        this.f = creVar;
        i(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // defpackage.gwc0
    public final void d() {
        i(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // defpackage.gwc0
    public final void e() {
        i(TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }

    @Override // defpackage.gwc0
    public final void f(zii0 zii0Var) {
        Rect rect;
        this.k = new Rect(m810.b(zii0Var.a), m810.b(zii0Var.b), m810.b(zii0Var.c), m810.b(zii0Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.gwc0
    public final void g() {
        i(TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }

    @Override // defpackage.gwc0
    public final void h(hoy0 hoy0Var, iv60 iv60Var, dry0 dry0Var, oav0 oav0Var, zii0 zii0Var, zii0 zii0Var2) {
        a aVar = this.l;
        synchronized (aVar.c) {
            try {
                aVar.j = hoy0Var;
                aVar.l = iv60Var;
                aVar.k = dry0Var;
                aVar.m = oav0Var;
                aVar.n = zii0Var;
                aVar.o = zii0Var2;
                if (!aVar.e) {
                    if (aVar.d) {
                    }
                }
                aVar.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.d, java.lang.Runnable] */
    public final void i(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.m.b(textInputServiceAndroid$TextInputCommand);
        if (this.n == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.d
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View findFocus;
                    f fVar = f.this;
                    b bVar = fVar.b;
                    fVar.n = null;
                    wz40 wz40Var = fVar.m;
                    View view = fVar.a;
                    if (!view.isFocused() && (findFocus = view.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                        wz40Var.g();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = wz40Var.a;
                    int i = wz40Var.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int i3 = e.a[textInputServiceAndroid$TextInputCommand2.ordinal()];
                        if (i3 == 1) {
                            ?? r8 = Boolean.TRUE;
                            ref$ObjectRef.element = r8;
                            ref$ObjectRef2.element = r8;
                        } else if (i3 == 2) {
                            ?? r82 = Boolean.FALSE;
                            ref$ObjectRef.element = r82;
                            ref$ObjectRef2.element = r82;
                        } else if (i3 != 3 && i3 != 4) {
                            w511.b();
                            return;
                        } else if (!jl40.l(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                        }
                    }
                    wz40Var.g();
                    if (jl40.l(ref$ObjectRef.element, Boolean.TRUE)) {
                        ((InputMethodManager) bVar.b.getValue()).restartInput(bVar.a);
                    }
                    Boolean bool = (Boolean) ref$ObjectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((ez2) bVar.c.a).d();
                        } else {
                            ((ez2) bVar.c.a).c();
                        }
                    }
                    if (jl40.l(ref$ObjectRef.element, Boolean.FALSE)) {
                        ((InputMethodManager) bVar.b.getValue()).restartInput(bVar.a);
                    }
                }
            };
            this.c.execute(r2);
            this.n = r2;
        }
    }
}
