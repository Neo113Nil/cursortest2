package xsna;

import android.content.Context;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.Collections;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkIpcClientFactory.kt */
/* loaded from: classes5.dex */
public final class wvx0 {
    public final Context a;
    public final Logger b;
    public final bpn0 c = new bpn0(new b());
    public final bpn0 d = new bpn0(new a());

    /* compiled from: WorkIpcClientFactory.kt */
    public static final class a extends Lambda implements gzs<ovx0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ovx0 invoke() {
            Context context = wvx0.this.a;
            String packageName = context.getPackageName();
            Context context2 = wvx0.this.a;
            String applicationSignature = PackageExtenstionsKt.getApplicationSignature(context2, context2.getPackageName());
            if (applicationSignature == null) {
                applicationSignature = "";
            }
            return new ovx0(context, Collections.singletonList(new AppInfo(packageName, applicationSignature)), 0L, null, null, wvx0.this.b, 12, null);
        }
    }

    /* compiled from: WorkIpcClientFactory.kt */
    public static final class b extends Lambda implements gzs<cxx0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final cxx0 invoke() {
            Context context = wvx0.this.a;
            String packageName = context.getPackageName();
            Context context2 = wvx0.this.a;
            String applicationSignature = PackageExtenstionsKt.getApplicationSignature(context2, context2.getPackageName());
            if (applicationSignature == null) {
                applicationSignature = "";
            }
            return new cxx0(context, Collections.singletonList(new AppInfo(packageName, applicationSignature)), 0L, null, null, wvx0.this.b, 12, null);
        }
    }

    public wvx0(Context context, Logger logger) {
        this.a = context;
        this.b = logger;
    }
}
