package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.security.impl.internal.devicechallenge.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class haj implements sls {
    public final /* synthetic */ a a;
    public final /* synthetic */ FragmentActivity b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int w;
    public final /* synthetic */ wls x;

    public /* synthetic */ haj(a aVar, FragmentActivity fragmentActivity, String str, int i, wls wlsVar) {
        this.a = aVar;
        this.b = fragmentActivity;
        this.c = str;
        this.w = i;
        this.x = wlsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        this.a.a(this.b, this.c, this.w, null, this.x);
        return zy11.a;
    }
}
