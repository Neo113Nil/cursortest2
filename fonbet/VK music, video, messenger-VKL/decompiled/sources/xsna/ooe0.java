package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusResponseDto;
import com.vk.api.generated.auth.dto.AuthGetAuthCodeStatusUserSessionDto;
import com.vk.api.generated.auth.dto.AuthSetAuthCodeStatusResponseDto;
import com.vk.api.sdk.auth.UtilityToken;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.qr.web2app.data.CheckSignInOpenArguments;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.u25;

/* compiled from: QrWebToAppRepositoryImpl.kt */
/* loaded from: classes6.dex */
public final class ooe0 implements noe0 {
    public final mui0 a;

    /* compiled from: QrWebToAppRepositoryImpl.kt */
    @b6l(c = "com.vk.superapp.qr.web2app.QrWebToAppRepositoryImpl", f = "QrWebToAppRepositoryImpl.kt", l = {60}, m = "getAuthCodeStatus")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ooe0.this.c(null, this);
        }
    }

    /* compiled from: QrWebToAppRepositoryImpl.kt */
    @b6l(c = "com.vk.superapp.qr.web2app.QrWebToAppRepositoryImpl", f = "QrWebToAppRepositoryImpl.kt", l = {56}, m = "setAuthCodeStatus")
    public static final class b extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ooe0.this.d(null, this);
        }
    }

    public ooe0(mui0 mui0Var) {
        this.a = mui0Var;
    }

    @Override // xsna.noe0
    public final Object a(String str, d1c d1cVar) {
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        Object f = sd9.f(vdx0Var.o().a(str), d1cVar);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : s3q0.a;
    }

    @Override // xsna.noe0
    public final Object b(Context context, r15 r15Var, c1c c1cVar) {
        Bundle bundle;
        Bundle bundle2;
        l55 l55Var = l55.a;
        String str = r15Var.b;
        UserId userId = r15Var.d;
        int i = r15Var.c;
        long currentTimeMillis = System.currentTimeMillis();
        List<AuthGetAuthCodeStatusUserSessionDto> list = r15Var.e;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (AuthGetAuthCodeStatusUserSessionDto authGetAuthCodeStatusUserSessionDto : list) {
            arrayList.add(new UtilityToken(authGetAuthCodeStatusUserSessionDto.d(), authGetAuthCodeStatusUserSessionDto.e()));
        }
        UtilityTokens utilityTokens = new UtilityTokens(arrayList);
        String str2 = r15Var.a;
        try {
            q55 q55Var = q55.a;
            bundle = q55.c().a.K;
        } catch (Throwable unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!sv1.r(bundle) && !this.a.e().isEmpty()) {
            bundle.putParcelable("multiaccount_entry_point_key", MultiAccountEntryPoint.QrWebToApp.d);
        }
        bundle.putString("qr_web_to_app_qr_code_id", str2);
        try {
            q55 q55Var2 = q55.a;
            q55.c().a.K = bundle;
            bundle2 = null;
        } catch (IllegalStateException unused2) {
            bundle2 = bundle;
        }
        io.reactivex.rxjava3.internal.operators.observable.m1 b2 = l55Var.b(context, new AuthResult(str, null, userId, false, i, null, null, null, null, 0, null, 0, null, null, null, currentTimeMillis, bundle2, utilityTokens, null, null, null, null, null, 8159208, null), new VkAuthMetaInfo(null, null, null, SilentAuthSource.QR_WEB_TO_APP, null, null, 55, null));
        j990 j990Var = new j990(new j0r(24), 5);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        Object collect = cdn.a(b2.E(j990Var, lVar, kVar, kVar)).collect(x670.b, c1cVar);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (collect != coroutineSingletons) {
            collect = s3q0.a;
        }
        return collect == coroutineSingletons ? collect : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.noe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, spj<? super u25> spjVar) {
        a aVar;
        int i;
        AuthGetAuthCodeStatusResponseDto authGetAuthCodeStatusResponseDto;
        Integer f;
        String d;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.internal.operators.observable.i2 c = vdx0Var.o().c(str);
                    aVar.label = 1;
                    obj = sd9.f(c, aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                authGetAuthCodeStatusResponseDto = (AuthGetAuthCodeStatusResponseDto) obj;
                f = authGetAuthCodeStatusResponseDto.f();
                if (f != null && f.intValue() == 0) {
                    return u25.b.a;
                }
                if (f != null && f.intValue() == 1) {
                    return u25.e.a;
                }
                if (f == null || f.intValue() != 2) {
                    if (f != null && f.intValue() == 3) {
                        return u25.c.a;
                    }
                    if (f == null && f.intValue() == 4) {
                        return u25.d.a;
                    }
                    throw new IllegalArgumentException("Wrong status received");
                }
                d = authGetAuthCodeStatusResponseDto.d();
                if (d != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                UserId userId = authGetAuthCodeStatusResponseDto.getUserId();
                if (userId == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Integer e = authGetAuthCodeStatusResponseDto.e();
                if (e == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue = e.intValue();
                List<AuthGetAuthCodeStatusUserSessionDto> g = authGetAuthCodeStatusResponseDto.g();
                if (g == null) {
                    g = EmptyList.b;
                }
                return new u25.a(intValue, d, g, userId);
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        authGetAuthCodeStatusResponseDto = (AuthGetAuthCodeStatusResponseDto) obj2;
        f = authGetAuthCodeStatusResponseDto.f();
        if (f != null) {
            return u25.b.a;
        }
        if (f != null) {
            return u25.e.a;
        }
        if (f == null) {
            d = authGetAuthCodeStatusResponseDto.d();
            if (d != null) {
            }
        }
        if (f != null) {
            return u25.c.a;
        }
        if (f == null) {
        }
        throw new IllegalArgumentException("Wrong status received");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.noe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, spj<? super CheckSignInOpenArguments> spjVar) {
        b bVar;
        int i;
        Integer g;
        if (spjVar instanceof b) {
            bVar = (b) spjVar;
            int i2 = bVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.label = i2 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.internal.operators.observable.i2 b2 = vdx0Var.o().b(str);
                    bVar.L$0 = str;
                    bVar.label = 1;
                    obj = sd9.f(b2, bVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) bVar.L$0;
                    kotlin.a.a(obj);
                }
                String str2 = str;
                AuthSetAuthCodeStatusResponseDto authSetAuthCodeStatusResponseDto = (AuthSetAuthCodeStatusResponseDto) obj;
                g = authSetAuthCodeStatusResponseDto.g();
                if (g != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue = g.intValue();
                Integer e = authSetAuthCodeStatusResponseDto.e();
                if (e == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                int intValue2 = e.intValue();
                String d = authSetAuthCodeStatusResponseDto.d();
                if (d == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String f = authSetAuthCodeStatusResponseDto.f();
                if (f != null) {
                    return new CheckSignInOpenArguments(str2, intValue, intValue2, d, f);
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        bVar = new b((ContinuationImpl) spjVar);
        Object obj2 = bVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bVar.label;
        if (i != 0) {
        }
        String str22 = str;
        AuthSetAuthCodeStatusResponseDto authSetAuthCodeStatusResponseDto2 = (AuthSetAuthCodeStatusResponseDto) obj2;
        g = authSetAuthCodeStatusResponseDto2.g();
        if (g != null) {
        }
    }
}
