package xsna;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthImplementationNotFound;
import com.vk.oauth.alfa.oauth.VkAlfaOAuthProvider;
import com.vk.oauth.google.VkGoogleOAuthProvider;
import com.vk.oauth.mail.VkMailOAuthProvider;
import com.vk.oauth.ok.VkOkOAuthProvider;
import com.vk.oauth.sber.oauth.SberViewProvider;
import com.vk.oauth.sber.oauth.VkSberOAuthProvider;
import com.vk.oauth.tinkoff.oauth.TinkoffViewProvider;
import com.vk.oauth.tinkoff.oauth.VkTinkoffOAuthProvider;
import com.vk.oauth.yandex.VkYandexOAuthProvider;
import java.util.List;
import kotlin.Result;

/* compiled from: OAuthManagerImpl.kt */
/* loaded from: classes.dex */
public final class co70 implements com.vk.auth.oauth.di.a {
    public final bpn0 a = new bpn0(new jnf(5));

    /* compiled from: OAuthManagerImpl.kt */
    /* loaded from: classes4.dex */
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
                iArr[VkOAuthService.GOOGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOAuthService.MAILRU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkOAuthService.OK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkOAuthService.PASSKEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VkOAuthService.SBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VkOAuthService.TINKOFF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VkOAuthService.YANDEX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.si6
    public final do70 a(Context context, VkOAuthService vkOAuthService) {
        Object failure;
        try {
            switch (a.$EnumSwitchMapping$0[vkOAuthService.ordinal()]) {
                case 1:
                    failure = (do70) new VkAlfaOAuthProvider();
                    break;
                case 2:
                    failure = new zqu0();
                    break;
                case 3:
                    failure = (do70) new VkGoogleOAuthProvider();
                    break;
                case 4:
                    failure = (do70) new VkMailOAuthProvider();
                    break;
                case 5:
                    failure = (do70) new VkOkOAuthProvider(context);
                    break;
                case 6:
                    failure = new vav0(context);
                    break;
                case 7:
                    failure = (do70) new VkSberOAuthProvider(context);
                    break;
                case 8:
                    failure = (do70) new VkTinkoffOAuthProvider();
                    break;
                case 9:
                    failure = (do70) new VkYandexOAuthProvider(context);
                    break;
                default:
                    failure = null;
                    break;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        do70 do70Var = (do70) (failure instanceof Result.Failure ? null : failure);
        if (do70Var != null) {
            return do70Var;
        }
        throw new OAuthImplementationNotFound(vkOAuthService);
    }

    @Override // com.vk.auth.oauth.di.a
    public final pnk b(VkOAuthService vkOAuthService) {
        TinkoffViewProvider failure;
        TinkoffViewProvider failure2;
        int i = a.$EnumSwitchMapping$0[vkOAuthService.ordinal()];
        if (i == 7) {
            try {
                failure = new SberViewProvider();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            return (pnk) (failure instanceof Result.Failure ? null : failure);
        }
        if (i != 8) {
            return null;
        }
        try {
            failure2 = new TinkoffViewProvider();
        } catch (Throwable th2) {
            failure2 = new Result.Failure(th2);
        }
        return (pnk) (failure2 instanceof Result.Failure ? null : failure2);
    }

    @Override // xsna.si6
    public final boolean c(VkOAuthService vkOAuthService) {
        return ((List) this.a.getValue()).contains(vkOAuthService);
    }

    @Override // com.vk.auth.oauth.di.a
    public final List<VkOAuthService> e() {
        return (List) this.a.getValue();
    }
}
