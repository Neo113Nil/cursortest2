package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import ru.rustore.sdk.core.exception.RuStoreException;
import xsna.chz0;

/* loaded from: classes9.dex */
public final class nsy0 implements ServiceConnection {
    public final Context b;
    public final String c;
    public final ru.rustore.sdk.review.r d;
    public final ru.rustore.sdk.review.s e;

    public static final class a extends cpy0 {
        public a() {
            attachInterface(this, "ru.vk.store.provider.review.RequestReviewFlowCallback");
        }
    }

    public nsy0(Context context, String str, ru.rustore.sdk.review.r rVar, ru.rustore.sdk.review.s sVar) {
        this.b = context;
        this.c = str;
        this.d = rVar;
        this.e = sVar;
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
            c2665a.m0(this.c, new a());
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            this.e.invoke(new RuStoreException(message));
            inj.b(this.b, this);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.invoke(new RuStoreException("onServiceDisconnected"));
        inj.b(this.b, this);
    }
}
