package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipGlobalSearchFeatureRootVh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class o89 implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o89(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) this.c;
                if (mnh0.m(motionEvent) && f4m.h(cVar.j)) {
                    cVar.j.d0();
                    break;
                }
                break;
            default:
                ClipGlobalSearchFeatureRootVh clipGlobalSearchFeatureRootVh = (ClipGlobalSearchFeatureRootVh) this.c;
                String str = ((e6a) clipGlobalSearchFeatureRootVh.w.getValue()).e;
                if (str != null) {
                    ((kca) clipGlobalSearchFeatureRootVh.u.getValue()).a(str);
                    break;
                }
                break;
        }
        return false;
    }
}
