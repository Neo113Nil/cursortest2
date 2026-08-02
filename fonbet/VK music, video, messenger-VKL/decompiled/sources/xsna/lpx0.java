package xsna;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: WikiPageLoader.kt */
/* loaded from: classes7.dex */
public abstract class lpx0 implements w8i {
    public final Bundle b;
    public final WeakReference<Context> c;
    public final bpn0 d;

    /* compiled from: WikiPageLoader.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<String, String, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(String str, String str2) {
            ((lpx0) this.receiver).a(str, str2);
            return s3q0.a;
        }
    }

    public lpx0(Context context, Bundle bundle) {
        this.b = bundle;
        this.c = new WeakReference<>(context);
        this.d = new bpn0(new com.vk.movika.sdk.base.ui.z(17, this, context));
    }

    public void a(String str, String str2) {
    }
}
