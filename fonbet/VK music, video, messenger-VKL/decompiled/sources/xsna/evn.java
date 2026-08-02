package xsna;

import android.content.Context;
import android.net.Uri;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class evn implements gzs {
    public final /* synthetic */ Context b;
    public final /* synthetic */ gzs c;
    public final /* synthetic */ Uri d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ evn(Context context, Uri uri, com.vk.movika.sdk.android.defaultplayer.interactive.a aVar, String str, String str2) {
        this.b = context;
        this.c = aVar;
        this.d = uri;
        this.e = str;
        this.f = str2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Context context = this.b;
        enj.q(R.string.vkim_download_started, 0, context);
        asu0.a.getClass();
        asu0.n().execute(new fvn(this.d, context, this.e, this.f, 0));
        gzs gzsVar = this.c;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
        return s3q0.a;
    }
}
