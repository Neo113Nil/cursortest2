package xsna;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VkEncryptedKeyValueStorage.kt */
/* loaded from: classes.dex */
public final class wqu0 {
    public final Context a;
    public final hzg0 b;
    public final bpn0 c;

    /* compiled from: VkEncryptedKeyValueStorage.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, Boolean> {
        public a(List list) {
            super(1, list, List.class, "contains", "contains(Ljava/lang/Object;)Z", 0);
        }

        @Override // xsna.izs
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((List) this.receiver).contains(str));
        }
    }

    public wqu0(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new hzg0(applicationContext, "VkEncryptedStorage");
        this.c = new bpn0(new qx2(this, 8));
    }
}
