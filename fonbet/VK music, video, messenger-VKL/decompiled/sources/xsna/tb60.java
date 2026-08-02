package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.vk.log.L;
import com.vk.newsfeed.impl.di.NewsFeedComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class tb60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tb60(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        ?? r1 = this.e;
        ?? r2 = this.d;
        ?? r3 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsFeedComponentImpl.D;
                return new com.vk.newsfeed.impl.fragments.a(r3, r2, r1);
            default:
                Context context = (Context) r3;
                String str = (String) r2;
                SharedPreferences b = ((hzg0) r1).b();
                if (epx.f(Looper.myLooper(), Looper.getMainLooper())) {
                    IllegalStateException illegalStateException = new IllegalStateException("Creation of EncryptedPreferencesHelper on main thread!");
                    if (sjp.a) {
                        throw illegalStateException;
                    }
                    L.i(illegalStateException);
                }
                if (b.getInt("____encryptedPrefsApi____", 0) == 21) {
                    b.edit().putInt("____encryptedPrefsApi____", 21).apply();
                    return new rjp(context, str);
                }
                try {
                    try {
                        return sjp.a(context, str, b);
                    } catch (Exception e) {
                        L.i(e);
                        b.edit().putInt("____encryptedPrefsApi____", 21).apply();
                        return new rjp(context, str);
                    }
                } catch (Exception unused) {
                    return sjp.a(context, str, b);
                }
        }
    }
}
