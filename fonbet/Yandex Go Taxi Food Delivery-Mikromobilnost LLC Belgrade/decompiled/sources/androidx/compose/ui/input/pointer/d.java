package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.bts;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.g131;
import defpackage.tls;
import defpackage.v2w;
import defpackage.w5j0;
import defpackage.zls;
import defpackage.zy11;

/* loaded from: classes.dex */
public abstract class d {
    public static final f530 a(f530 f530Var, final AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.a = new tls() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean dispatchTouchEvent;
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = androidViewHolder2.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = androidViewHolder2.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            }
        };
        w5j0 w5j0Var = new w5j0();
        w5j0 w5j0Var2 = pointerInteropFilter.b;
        if (w5j0Var2 != null) {
            w5j0Var2.a = null;
        }
        pointerInteropFilter.b = w5j0Var;
        w5j0Var.a = pointerInteropFilter;
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(w5j0Var);
        return f530Var.k(pointerInteropFilter);
    }

    public static f530 b(f530 f530Var, final tls tlsVar) {
        return androidx.compose.ui.b.a(f530Var, m.b ? new tls() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1
            final /* synthetic */ w5j0 $requestDisallowInterceptTouchEvent$inlined = null;

            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                v2w v2wVar = (v2w) obj;
                v2wVar.getClass();
                g131 g131Var = v2wVar.a;
                g131Var.b("requestDisallowInterceptTouchEvent", this.$requestDisallowInterceptTouchEvent$inlined);
                g131Var.b("onTouchEvent", tls.this);
                return zy11.a;
            }
        } : m.a(), new zls() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2
            final /* synthetic */ w5j0 $requestDisallowInterceptTouchEvent = null;

            {
                super(3);
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ((Number) obj3).intValue();
                bts btsVar = (bts) ((fid) obj2);
                btsVar.e0(374375707);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new PointerInteropFilter();
                    btsVar.o0(Q);
                }
                PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) Q;
                pointerInteropFilter.a = tls.this;
                w5j0 w5j0Var = this.$requestDisallowInterceptTouchEvent;
                w5j0 w5j0Var2 = pointerInteropFilter.b;
                if (w5j0Var2 != null) {
                    w5j0Var2.a = null;
                }
                pointerInteropFilter.b = w5j0Var;
                if (w5j0Var != null) {
                    w5j0Var.a = pointerInteropFilter;
                }
                btsVar.t(false);
                return pointerInteropFilter;
            }
        });
    }
}
