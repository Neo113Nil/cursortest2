package xsna;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthImplementationNotFound;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;

/* compiled from: VerificationOAuthManagerImpl.kt */
/* loaded from: classes4.dex */
public final class fnr0 implements com.vk.auth.oauth.di.b {
    public final bpn0 a = new bpn0(new chr0(1));

    /* compiled from: VerificationOAuthManagerImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkOAuthService.values().length];
            try {
                iArr[VkOAuthService.ALFA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOAuthService.ESIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOAuthService.SBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOAuthService.TINKOFF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkOAuthService.VTB.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.auth.oauth.di.b, xsna.si6
    public final gnr0 a(Context context, VkOAuthService vkOAuthService) {
        Object obj;
        Object obj2;
        int i;
        try {
            i = a.$EnumSwitchMapping$0[vkOAuthService.ordinal()];
        } catch (Throwable th) {
            obj = new Result.Failure(th);
        }
        if (i == 1) {
            obj2 = new z7u0();
        } else if (i == 2) {
            obj2 = new zqu0();
        } else if (i != 3) {
            obj2 = i != 4 ? i != 5 ? null : new j1w0() : new ksv0();
        } else {
            mhv0 mhv0Var = new mhv0();
            mhv0Var.a = chg.a(context);
            obj = mhv0Var;
            obj2 = obj;
        }
        gnr0 gnr0Var = (gnr0) (obj2 instanceof Result.Failure ? null : obj2);
        if (gnr0Var != null) {
            return gnr0Var;
        }
        throw new OAuthImplementationNotFound(vkOAuthService);
    }

    @Override // xsna.si6
    public final boolean c(VkOAuthService vkOAuthService) {
        Object obj;
        Iterator it = ((List) this.a.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((go70) obj).a == vkOAuthService) {
                break;
            }
        }
        return obj != null;
    }

    @Override // com.vk.auth.oauth.di.b
    public final List<go70> d() {
        return (List) this.a.getValue();
    }
}
