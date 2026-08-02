package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;
import ru.rustore.sdk.review.model.ReviewInfo;
import xsna.chz0;

/* loaded from: classes9.dex */
public final class v8y0 implements ServiceConnection {
    public final Context b;
    public final ReviewInfo c;
    public final String d;
    public final ru.rustore.sdk.review.n e;
    public final ru.rustore.sdk.review.o f;

    public static final class a extends nfy0 {
        public a() {
            attachInterface(this, "ru.vk.store.provider.review.LaunchReviewFlowCallback");
        }
    }

    public v8y0(Context context, ReviewInfo reviewInfo, String str, ru.rustore.sdk.review.n nVar, ru.rustore.sdk.review.o oVar) {
        this.b = context;
        this.c = reviewInfo;
        this.d = str;
        this.e = nVar;
        this.f = oVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        chz0 c2665a;
        try {
            int i = chz0.a.a;
            if (iBinder == null) {
                c2665a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("ru.vk.store.provider.review.ReviewProvider");
                c2665a = (queryLocalInterface == null || !(queryLocalInterface instanceof chz0)) ? new chz0.a.C2665a(iBinder) : (chz0) queryLocalInterface;
            }
            c2665a.h1(this.c.toBundle$sdk_public_review_release(), this.d, new a());
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            this.f.invoke(new RuStoreException(message));
            inj.b(this.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.invoke(new RuStoreException("onServiceDisconnected"));
        inj.b(this.b, this);
    }
}
