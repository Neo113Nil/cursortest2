package xsna;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.Window;
import com.vk.dto.music.Thumb;
import com.vk.story.api.domain.interactor.repost.PublishedKind;
import xsna.chs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9b0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ v9b0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
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
                chs chsVar = (chs) this.c;
                Thumb thumb = (Thumb) this.d;
                y6g y6gVar = (y6g) this.e;
                return ((chsVar instanceof chs.b) || (chsVar instanceof chs.a) || (chsVar instanceof chs.c) || epx.f(thumb, lso0.a)) ? y6gVar : (lg90) this.f;
            case 1:
                ram0 ram0Var = (ram0) this.c;
                Window window = (Window) this.d;
                String str = (String) this.e;
                PublishedKind publishedKind = (PublishedKind) this.f;
                TypedValue typedValue = krv0.a;
                Context s = krv0.b == null ? null : dhr0.s();
                if (s == null) {
                    return s3q0.a;
                }
                Activity h = e3m.h(window.getContext());
                if (h == null) {
                    c63 c63Var = c63.a;
                    h = c63.b();
                    if (h == null) {
                        return s3q0.a;
                    }
                }
                ram0Var.g(s, h, str, publishedKind).d(window);
                return s3q0.a;
            default:
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                d7o0 d7o0Var = (d7o0) this.e;
                String str4 = (String) this.f;
                StringBuilder a = xe9.a("onEvent id:", str2, " type:", str3, " data:");
                a.append(((p2i0) d7o0Var.f.getValue()).a(str4));
                return a.toString();
        }
    }
}
