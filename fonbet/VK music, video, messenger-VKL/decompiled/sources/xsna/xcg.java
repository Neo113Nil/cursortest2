package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.wih0;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xcg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xcg(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                hd60.a().A0((Activity) this.c, (VideoFile) this.d, ((mdg) this.e).t, null, (r18 & 16) != 0 ? null : ((VideoAttachment) this.f).m, null, false, (r18 & 256) != 0 ? null : null);
                break;
            default:
                evk0 evk0Var = (evk0) this.c;
                String str = (String) this.d;
                wih0.d.a aVar = (wih0.d.a) this.e;
                Context context = (Context) this.f;
                evk0Var.d.invoke(new yt0.h.a(new zt0(str, aVar.i)));
                b1r b1rVar = evk0Var.a;
                String str2 = aVar.f;
                if (str2 != null) {
                    b1rVar.a(context, str2);
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }
}
