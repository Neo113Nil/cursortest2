package xsna;

import android.os.Build;
import com.vk.core.native_loader.NativeLib;
import com.vk.core.native_loader.NativeLibLoadException;
import com.vk.core.native_loader.NativeLibLoader;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kir implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kir(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                ((mir) this.c).e((zjr) this.d);
                break;
            default:
                NativeLib nativeLib = (NativeLib) this.c;
                UnsatisfiedLinkError unsatisfiedLinkError = (UnsatisfiedLinkError) this.d;
                Map map = (Map) obj;
                StringBuilder sb = new StringBuilder("Couldn't load native library: CPU - ");
                sb.append(NativeLibLoader.f);
                sb.append(" | ABI - ");
                String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
                if (strArr == null || (str = rl3.Z(strArr, StringUtils.COMMA, null, null, null, 62)) == null) {
                    str = "empty";
                }
                sb.append(str);
                sb.append(" | ");
                sb.append(nativeLib.l());
                sb.append(' ');
                sb.append(map);
                NativeLibLoadException nativeLibLoadException = new NativeLibLoadException(sb.toString(), unsatisfiedLinkError);
                NativeLibLoader.b bVar = NativeLibLoader.i;
                if (bVar == null) {
                    bVar = null;
                }
                bVar.b(nativeLibLoadException, NativeLibLoader.f, nativeLib.l(), "system");
                break;
        }
        return s3q0.a;
    }
}
