package xsna;

import android.net.Uri;
import com.vk.attachpicker.screen.h;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class y4p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y4p(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                Uri uri = (Uri) this.c;
                String str = (String) this.d;
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) this.e;
                if (uri != null && com.vk.core.files.a.x(str)) {
                    if (str != null) {
                        g4p g4pVar = new g4p(str);
                        if (!h.a.a(g4pVar)) {
                            cvk.u(R.string.picker_image_format_invalid, false);
                            m3g m3gVar = hVar.D;
                            if (m3gVar != null) {
                                m3gVar.invoke();
                                break;
                            }
                        } else {
                            g84 g84Var = hVar.C;
                            if (g84Var != null) {
                                g84Var.invoke(g4pVar);
                                break;
                            }
                        }
                    }
                } else {
                    m3g m3gVar2 = hVar.D;
                    if (m3gVar2 != null) {
                        m3gVar2.invoke();
                        break;
                    }
                }
                break;
            default:
                ul50 ul50Var = (ul50) this.c;
                lm50 lm50Var = (lm50) this.e;
                wzs<? super Content, ? super State, s3q0> wzsVar = ul50Var.e;
                if (wzsVar != 0) {
                    wzsVar.invoke(this.d, lm50Var);
                    break;
                }
                break;
        }
    }
}
