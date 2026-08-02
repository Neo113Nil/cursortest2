package xsna;

import com.vk.api.generated.auth.dto.AuthBirthdayDto;
import com.vk.api.generated.auth.dto.AuthRefreshAccessTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshSilentTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokenErrorDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokensResponseDto;
import com.vk.api.generated.auth.dto.AuthRefreshUserSessionDto;
import com.vk.api.generated.phone.dto.PhoneValidationInfoDto;
import com.vk.api.generated.profile.dto.ProfileExtendFieldsValuesDto;
import com.vk.api.generated.profile.dto.ProfileExtensionInfoDto;
import com.vk.api.sdk.auth.UtilityToken;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteBirthday;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.VkGender;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AuthByRefreshTokensSingle.kt */
/* loaded from: classes6.dex */
public final class q25 extends nx2<AuthResult> {
    public final String b;
    public final UserId c;
    public final int d;
    public final String e;
    public final AuthByExchangeTokenInitiator f;
    public final String g;
    public final boolean h;

    public q25(String str, UserId userId, int i, String str2, AuthByExchangeTokenInitiator authByExchangeTokenInitiator, String str3, boolean z) {
        this.b = str;
        this.c = userId;
        this.d = i;
        this.e = str2;
        this.f = authByExchangeTokenInitiator;
        this.g = str3;
        this.h = z;
    }

    public static UtilityTokens g(List list) {
        List<AuthRefreshUserSessionDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (AuthRefreshUserSessionDto authRefreshUserSessionDto : list2) {
            arrayList.add(new UtilityToken(authRefreshUserSessionDto.d(), authRefreshUserSessionDto.e()));
        }
        return new UtilityTokens(arrayList);
    }

    public static AuthException.UnknownException j(String str) {
        return new AuthException.UnknownException(null, new IllegalStateException(str));
    }

    @Override // xsna.nx2
    public final AuthResult f(l7r0 l7r0Var) {
        bx2 e = e370.e(wwf0.j(new znk0(), this.d, this.e, Collections.singletonList(this.b), this.f.h(), this.g, Boolean.valueOf(this.h), 24));
        e370.b(e);
        e.c = true;
        e.d = true;
        e.g = true;
        try {
            return i((AuthRefreshTokensResponseDto) e.f(l7r0Var));
        } catch (AuthException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new AuthException.UnknownException(null, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19 */
    public final AuthResult i(AuthRefreshTokensResponseDto authRefreshTokensResponseDto) {
        ?? r0;
        SignUpIncompleteFieldsModel signUpIncompleteFieldsModel;
        Throwable needSignUpException;
        Integer m;
        UtilityTokens utilityTokens;
        UtilityTokens utilityTokens2;
        List<AuthRefreshTokenDto> e = authRefreshTokensResponseDto.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : e) {
            if (((AuthRefreshTokenDto) obj).g() == 0) {
                arrayList.add(obj);
            }
        }
        List<AuthRefreshTokenErrorDto> d = authRefreshTokensResponseDto.d();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : d) {
            if (((AuthRefreshTokenErrorDto) obj2).e() == 0) {
                arrayList2.add(obj2);
            }
        }
        List<AuthRefreshTokenDto> e2 = authRefreshTokensResponseDto.e();
        if (!(e2 instanceof Collection) || !e2.isEmpty()) {
            Iterator it = e2.iterator();
            while (it.hasNext()) {
                if (((AuthRefreshTokenDto) it.next()).g() != 0) {
                    break;
                }
            }
        }
        List<AuthRefreshTokenErrorDto> d2 = authRefreshTokensResponseDto.d();
        if (!(d2 instanceof Collection) || !d2.isEmpty()) {
            Iterator it2 = d2.iterator();
            while (it2.hasNext()) {
                if (((AuthRefreshTokenErrorDto) it2.next()).e() != 0) {
                    r0 = true;
                }
            }
        }
        r0 = false;
        ?? r3 = arrayList.size() > 1 || arrayList2.size() > 1;
        ?? r6 = (arrayList.isEmpty() || arrayList2.isEmpty()) ? false : true;
        if (r0 == true || r3 == true || r6 == true) {
            throw j("auth.refreshTokens returned ambiguous response");
        }
        AuthRefreshTokenDto authRefreshTokenDto = (AuthRefreshTokenDto) j5g.A0(arrayList);
        if (authRefreshTokenDto != null) {
            boolean f = epx.f(authRefreshTokenDto.f(), Boolean.TRUE);
            AuthRefreshSilentTokenDto j = authRefreshTokenDto.j();
            AuthRefreshAccessTokenDto d3 = authRefreshTokenDto.d();
            String e3 = j != null ? j.e() : null;
            ?? r8 = e3 == null || drm0.N(e3);
            boolean z = d3 != null;
            if (authRefreshTokenDto.e() && f) {
                throw j("auth.refreshTokens returned banned and deactivated result");
            }
            if (authRefreshTokenDto.e()) {
                AuthRefreshAccessTokenDto d4 = authRefreshTokenDto.d();
                throw new AuthException.BannedUserException(new BanInfo(null, d4 != null ? d4.e() : null, null, 5, null));
            }
            if (f) {
                AuthRefreshAccessTokenDto d5 = authRefreshTokenDto.d();
                String e4 = d5 != null ? d5.e() : null;
                String str = e4 != null ? e4 : "";
                List<AuthRefreshUserSessionDto> k = authRefreshTokenDto.k();
                if (k != null) {
                    utilityTokens2 = g(k);
                } else {
                    UtilityTokens.CREATOR.getClass();
                    utilityTokens2 = UtilityTokens.c;
                }
                throw new AuthException.DeactivatedUserException(str, null, utilityTokens2);
            }
            if (z && r8 != true) {
                throw j("auth.refreshTokens returned both access and silent tokens");
            }
            if (r8 != true) {
                if (j == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new AuthException.NeedSilentAuthException(j.e(), j.f(), j.d(), (VkAuthCredentials) null, (String) null, 56);
            }
            if (!z) {
                throw j("auth.refreshTokens returned success without access token");
            }
            if (d3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            UserId userId = authRefreshTokenDto.getUserId();
            String e5 = d3.e();
            int d6 = d3.d();
            List<AuthRefreshUserSessionDto> k2 = authRefreshTokenDto.k();
            if (k2 != null) {
                utilityTokens = g(k2);
            } else {
                UtilityTokens.CREATOR.getClass();
                utilityTokens = UtilityTokens.c;
            }
            return new AuthResult(e5, null, userId, false, d6, null, null, null, null, 0, null, 0, null, null, null, 0L, null, utilityTokens, authRefreshTokenDto.i(), null, null, null, null, 7995368, null);
        }
        AuthRefreshTokenErrorDto authRefreshTokenErrorDto = (AuthRefreshTokenErrorDto) j5g.A0(arrayList2);
        if (authRefreshTokenErrorDto == null) {
            throw j("auth.refreshTokens returned unsupported response");
        }
        PhoneValidationInfoDto f2 = authRefreshTokenErrorDto.f();
        if (f2 != null) {
            String e6 = f2.e();
            if (e6 != null) {
                String str2 = !drm0.N(e6) ? e6 : null;
                if (str2 != null) {
                    String f3 = f2.f();
                    if (f3 == null || (m = arm0.m(10, f3)) == null) {
                        throw j("auth.refreshTokens returned phone validation with invalid status");
                    }
                    int intValue = m.intValue();
                    Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
                    EmptyList emptyList = EmptyList.b;
                    VkAuthState vkAuthState = new VkAuthState(null);
                    vkAuthState.e.addAll(emptyList);
                    String d7 = f2.d();
                    needSignUpException = new AuthException.PhoneValidationRequiredException(vkAuthState, str2, d7 == null ? "" : d7, intValue == 1, null, intValue, null);
                }
            }
            throw j("auth.refreshTokens returned phone validation without sid");
        }
        ProfileExtensionInfoDto g = authRefreshTokenErrorDto.g();
        if (g == null) {
            if (authRefreshTokenErrorDto.d() == 5) {
                throw new AuthException.ExchangeTokenException(new com.vk.superapp.core.api.models.a(null, null, this.c, 0, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0L, null, null, null, null, null, 0L, null, false, null, null, 0, 0, null, null, null, false, null, null, null, null, null, null, -5, 131071));
            }
            throw j("auth.refreshTokens returned unsupported error");
        }
        String i = g.i();
        if (i != null) {
            String str3 = !drm0.N(i) ? i : null;
            if (str3 != null) {
                List<String> d8 = g.d();
                if (d8 == null) {
                    d8 = EmptyList.b;
                }
                List<String> list = d8;
                SignUpField.a aVar = SignUpField.Companion;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (String str4 : list) {
                    aVar.getClass();
                    arrayList3.add(SignUpField.a.a(str4));
                }
                List<String> f4 = g.f();
                if (f4 == null) {
                    f4 = EmptyList.b;
                }
                List<String> list2 = f4;
                SignUpField.a aVar2 = SignUpField.Companion;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                for (String str5 : list2) {
                    aVar2.getClass();
                    arrayList4.add(SignUpField.a.a(str5));
                }
                ProfileExtendFieldsValuesDto e7 = g.e();
                if (e7 == null) {
                    signUpIncompleteFieldsModel = null;
                } else {
                    AuthBirthdayDto e8 = e7.e();
                    SignUpIncompleteBirthday signUpIncompleteBirthday = e8 != null ? new SignUpIncompleteBirthday(e8.d(), e8.e(), e8.f()) : null;
                    String d9 = e7.d();
                    String str6 = d9 == null ? "" : d9;
                    String g2 = e7.g();
                    if (g2 == null) {
                        g2 = e7.k();
                    }
                    String str7 = g2 == null ? "" : g2;
                    String j2 = e7.j();
                    String str8 = j2 == null ? "" : j2;
                    VkGender.a aVar3 = VkGender.Companion;
                    Integer i2 = e7.i();
                    aVar3.getClass();
                    signUpIncompleteFieldsModel = new SignUpIncompleteFieldsModel(signUpIncompleteBirthday, str6, str7, str8, VkGender.a.a(i2), e7.f());
                }
                Integer g3 = g.g();
                needSignUpException = new AuthException.NeedSignUpException(arrayList3, arrayList4, str3, signUpIncompleteFieldsModel, false, g3 != null && g3.intValue() == 1, false);
            }
        }
        throw j("auth.refreshTokens returned profile extension without sid");
        throw needSignUpException;
    }
}
