package xsna;

import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.auth.api.models.AuthResult;
import com.vk.superapp.api.dto.auth.PersonalData;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.superapp.core.api.models.ValidateInfo;
import com.vk.superapp.core.api.models.a;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: AuthCommandHelper.kt */
/* loaded from: classes6.dex */
public final class v25 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x00d4. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v10, types: [com.vk.superapp.api.exceptions.AuthException$StatedAuthException] */
    /* JADX WARN: Type inference failed for: r7v11, types: [com.vk.superapp.api.exceptions.AuthException$DetailedAuthException] */
    /* JADX WARN: Type inference failed for: r7v12, types: [com.vk.superapp.api.exceptions.AuthException$StatedAuthException] */
    /* JADX WARN: Type inference failed for: r7v13, types: [com.vk.superapp.api.exceptions.AuthException$OAuthSpecificException] */
    /* JADX WARN: Type inference failed for: r7v14, types: [com.vk.superapp.api.exceptions.AuthException$StatedAuthException] */
    /* JADX WARN: Type inference failed for: r7v15, types: [com.vk.superapp.api.exceptions.AuthException$ExpiredAnonymousTokenException] */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.vk.superapp.api.exceptions.AuthException$PartialTokenException] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v8, types: [com.vk.superapp.api.exceptions.AuthException$InvalidSidException] */
    /* JADX WARN: Type inference failed for: r7v9, types: [com.vk.superapp.api.exceptions.AuthException$InvalidAnonymousTokenException] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Integer] */
    public static AuthResult a(com.vk.superapp.core.api.models.a aVar, VkAuthState vkAuthState, int i) {
        boolean z;
        String str;
        AuthResult authResult;
        Throwable deactivatedUserException;
        String str2;
        UtilityTokens utilityTokens;
        Object obj;
        ?? invalidSidException;
        Throwable needSignUpException;
        List list;
        List list2;
        ?? r8;
        UtilityTokens utilityTokens2;
        boolean z2 = (i & 4) != 0;
        String str3 = aVar.A;
        VkAuthCredentials Ab = vkAuthState.Ab();
        if (!fkq0.c(aVar.c) || drm0.N(aVar.a)) {
            z = z2;
            str = null;
            authResult = null;
        } else {
            z = z2;
            str = null;
            authResult = new AuthResult(aVar.a, aVar.b, aVar.c, aVar.e, aVar.d, aVar.f, Ab, aVar.I, aVar.J, aVar.K, aVar.R, aVar.L, null, null, new PersonalData(aVar.w, aVar.v), 0L, null, aVar.g, null, aVar.h, aVar.v, aVar.i, aVar.j, 372736, null);
        }
        if (authResult != null) {
            return authResult;
        }
        if (epx.f(aVar.U, "need_validate")) {
            ValidateInfo validateInfo = aVar.V;
            if (validateInfo == null) {
                throw new AuthException.UnknownException(str, new IllegalStateException("validate_info missing"));
            }
            throw new AuthException.SuspiciousAuthException(vkAuthState, aVar.W, validateInfo);
        }
        BanInfo banInfo = aVar.E;
        List list3 = aVar.N;
        List list4 = aVar.M;
        if (banInfo != null) {
            throw new AuthException.BannedUserException(banInfo);
        }
        if (list4 != null || list3 != null) {
            if (list4 == null) {
                list4 = EmptyList.b;
            }
            List list5 = list4;
            if (list3 == null) {
                list3 = EmptyList.b;
            }
            throw new AuthException.NeedSignUpException(list5, list3, aVar.Q, aVar.O, epx.f(str3, "need_signup"), aVar.P, false);
        }
        if (!drm0.N(aVar.i)) {
            if (z) {
                throw new AuthException.NeedSilentAuthException(aVar.i, aVar.j, aVar.k, vkAuthState.Ab(), aVar.T, 32);
            }
            throw new AuthException.NeedCheckSilentTokenException(aVar, vkAuthState);
        }
        a.C1876a c1876a = aVar.C;
        String str4 = aVar.u;
        switch (str3.hashCode()) {
            case -1770111376:
                String str5 = str;
                obj = str5;
                if (str3.equals("deactivated")) {
                    String str6 = c1876a != null ? c1876a.a : str5;
                    str2 = str6 != null ? str6 : "";
                    VkAuthCredentials Ab2 = vkAuthState.Ab();
                    if (c1876a != null) {
                        utilityTokens = c1876a.x;
                    } else {
                        UtilityTokens.CREATOR.getClass();
                        utilityTokens = UtilityTokens.c;
                    }
                    deactivatedUserException = new AuthException.DeactivatedUserException(str2, Ab2, utilityTokens);
                    invalidSidException = deactivatedUserException;
                    break;
                }
                invalidSidException = obj;
                break;
            case -918862589:
                obj = str;
                if (str3.equals("8210;Invalid sid")) {
                    invalidSidException = new AuthException.InvalidSidException(new AuthException.DetailedAuthException(aVar));
                    break;
                }
                invalidSidException = obj;
                break;
            case -813939361:
                obj = str;
                if (str3.equals("invalid_anonymous_token")) {
                    invalidSidException = new AuthException.InvalidAnonymousTokenException();
                    break;
                }
                invalidSidException = obj;
                break;
            case -632018157:
                obj = str;
                if (str3.equals("invalid_client")) {
                    invalidSidException = new AuthException.IncorrectLoginDataException(aVar, vkAuthState);
                    break;
                }
                invalidSidException = obj;
                break;
            case -105777671:
                obj = str;
                if (str3.equals("too_many_requests")) {
                    invalidSidException = new AuthException.TooManyRequestsException(aVar);
                    break;
                }
                invalidSidException = obj;
                break;
            case 304348098:
                obj = str;
                if (str3.equals("need_validation")) {
                    invalidSidException = new AuthException.NeedValidationException(aVar, vkAuthState);
                    break;
                }
                invalidSidException = obj;
                break;
            case 657682275:
                obj = str;
                if (str3.equals("oauth_specific_error")) {
                    invalidSidException = new AuthException.OAuthSpecificException(str4, vkAuthState, aVar.t);
                    break;
                }
                invalidSidException = obj;
                break;
            case 1475448823:
                obj = str;
                if (str3.equals("need_authcheck")) {
                    invalidSidException = new AuthException.IncorrectLoginDataException(aVar, vkAuthState);
                    break;
                }
                invalidSidException = obj;
                break;
            case 1639288296:
                obj = str;
                if (str3.equals("anonymous_token_has_expired")) {
                    invalidSidException = new AuthException.ExpiredAnonymousTokenException();
                    break;
                }
                invalidSidException = obj;
                break;
            case 1761149371:
                obj = str;
                if (str3.equals("partial_token")) {
                    invalidSidException = new AuthException.PartialTokenException();
                    break;
                }
                invalidSidException = obj;
                break;
            case 2117379143:
                obj = str;
                if (str3.equals("invalid_request")) {
                    int hashCode = str4.hashCode();
                    if (hashCode == -1023865384) {
                        if (str4.equals("age_is_too_young")) {
                            deactivatedUserException = new AuthException.AgeIsTooYoung(aVar);
                            invalidSidException = deactivatedUserException;
                        }
                        deactivatedUserException = new AuthException.InvalidRequestException(aVar, vkAuthState);
                        invalidSidException = deactivatedUserException;
                    } else if (hashCode != 1930493106) {
                        if (hashCode == 2029233636 && str4.equals("cancel_by_owner_needed")) {
                            deactivatedUserException = new AuthException.CancelByOwnerNeeded(aVar);
                            invalidSidException = deactivatedUserException;
                            break;
                        }
                        deactivatedUserException = new AuthException.InvalidRequestException(aVar, vkAuthState);
                        invalidSidException = deactivatedUserException;
                    } else {
                        if (str4.equals("too_much_tries")) {
                            deactivatedUserException = new AuthException.TooManyAttemptsException(aVar);
                            invalidSidException = deactivatedUserException;
                        }
                        deactivatedUserException = new AuthException.InvalidRequestException(aVar, vkAuthState);
                        invalidSidException = deactivatedUserException;
                    }
                }
                invalidSidException = obj;
                break;
            case 2144407827:
                if (str3.equals("user_service_state")) {
                    switch (str4.hashCode()) {
                        case -1996015115:
                            String str7 = str;
                            r8 = str7;
                            if (str4.equals("profile_extension_required")) {
                                if (c1876a == null || (list = c1876a.f) == null) {
                                    list = EmptyList.b;
                                }
                                List list6 = list;
                                if (c1876a == null || (list2 = c1876a.g) == null) {
                                    list2 = EmptyList.b;
                                }
                                needSignUpException = new AuthException.NeedSignUpException(list6, list2, c1876a != null ? c1876a.b : str7, c1876a != null ? c1876a.h : str7, false, c1876a != null && c1876a.i, false);
                                invalidSidException = needSignUpException;
                                break;
                            }
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                            break;
                        case -654391790:
                            String str8 = str;
                            r8 = str8;
                            if (str4.equals("user_banned")) {
                                deactivatedUserException = new AuthException.BannedUserException(new BanInfo(c1876a != null ? c1876a.j : str8, c1876a != null ? c1876a.a : str8, str8));
                                invalidSidException = deactivatedUserException;
                                break;
                            }
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                        case 189445214:
                            r8 = str;
                            if (str4.equals("mail_signup_required")) {
                                needSignUpException = new AuthException.VkEmailSignUpRequiredException(c1876a.a, c1876a.t, c1876a.u, c1876a.s, c1876a.v, c1876a.w);
                                invalidSidException = needSignUpException;
                                break;
                            }
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                            break;
                        case 964636668:
                            String str9 = str;
                            r8 = str9;
                            if (str4.equals("user_deactivated")) {
                                String str10 = c1876a != null ? c1876a.a : str9;
                                str2 = str10 != null ? str10 : "";
                                VkAuthCredentials Ab3 = vkAuthState.Ab();
                                if (c1876a != null) {
                                    utilityTokens2 = c1876a.x;
                                } else {
                                    UtilityTokens.CREATOR.getClass();
                                    utilityTokens2 = UtilityTokens.c;
                                }
                                deactivatedUserException = new AuthException.DeactivatedUserException(str2, Ab3, utilityTokens2);
                                invalidSidException = deactivatedUserException;
                                break;
                            }
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                        case 1327060052:
                            if (str4.equals("phone_validation_required")) {
                                String str11 = str;
                                String str12 = c1876a != null ? c1876a.b : str11;
                                String str13 = c1876a != null ? c1876a.c : str11;
                                boolean booleanValue = (c1876a != null ? c1876a.d : str11).booleanValue();
                                String str14 = str11;
                                a.b bVar = aVar.D;
                                int intValue = (c1876a != null ? Integer.valueOf(c1876a.e) : str14).intValue();
                                if (c1876a != null) {
                                    str14 = c1876a.a;
                                }
                                deactivatedUserException = new AuthException.PhoneValidationRequiredException(vkAuthState, str12, str13, booleanValue, bVar, intValue, str14);
                                invalidSidException = deactivatedUserException;
                                break;
                            }
                            r8 = str;
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                        case 1703497356:
                            if (str4.equals("sign_in_agreement_required")) {
                                String str15 = c1876a != null ? c1876a.b : str;
                                EmptyList emptyList = EmptyList.b;
                                obj = new AuthException.NeedSignUpException(emptyList, emptyList, str15, null, false, true, true);
                                invalidSidException = obj;
                                break;
                            }
                            r8 = str;
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                            break;
                        default:
                            r8 = str;
                            deactivatedUserException = new AuthException.UnknownException(r8, r8);
                            invalidSidException = deactivatedUserException;
                            break;
                    }
                }
                break;
            default:
                obj = str;
                invalidSidException = obj;
                break;
        }
        if (invalidSidException != null) {
            throw invalidSidException;
        }
        throw new AuthException.DetailedAuthException(aVar);
    }
}
