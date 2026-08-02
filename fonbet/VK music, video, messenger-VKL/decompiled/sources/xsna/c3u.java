package xsna;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class c3u implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c3u(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((mh4) this.b).invoke(obj);
                break;
            default:
                com.vungle.ads.internal.platform.c.a((com.vungle.ads.internal.platform.c) this.b, (AppSetIdInfo) obj);
                break;
        }
    }
}
