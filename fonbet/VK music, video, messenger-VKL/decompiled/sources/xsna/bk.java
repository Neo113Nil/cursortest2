package xsna;

import com.vk.api.generated.auth.dto.AuthRefreshTokenDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokenErrorDto;
import com.vk.api.generated.auth.dto.AuthRefreshTokensResponseDto;
import com.vk.api.sdk.VKApiConfig;
import com.vk.api.sdk.exceptions.RefreshFailCause;
import com.vk.api.sdk.exceptions.UnableToRefreshAccessTokenException;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.internal.oauthrequests.AuthByExchangeTokenInitiator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import xsna.k2q;
import xsna.yj;

/* compiled from: AccessTokenRefresherByExchangeTokenMulti.kt */
/* loaded from: classes15.dex */
public final class bk implements yj {
    public final mxi0 a;
    public final s4 b;
    public final bv0 c;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Integer.valueOf(((AuthRefreshTokenDto) t).g()), Integer.valueOf(((AuthRefreshTokenDto) t2).g()));
        }
    }

    public bk(mxi0 mxi0Var, s4 s4Var, bv0 bv0Var) {
        this.a = mxi0Var;
        this.b = s4Var;
        this.c = bv0Var;
    }

    public static ArrayList a(k2q.b bVar, List list) throws UnableToRefreshAccessTokenException {
        List<h2q> list2;
        if (bVar != null && (list2 = bVar.a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                String str = ((h2q) obj).b;
                if (str != null && !drm0.N(str)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (list.contains(((h2q) next).a)) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null) {
                return arrayList2;
            }
        }
        UserId userId = (UserId) j5g.a0(list);
        if (userId == null) {
            userId = UserId.d;
        }
        throw new UnableToRefreshAccessTokenException(true, userId, "Unable to refresh access token: exchange token is null or empty", (bVar == null || !bVar.b) ? new RefreshFailCause.EmptyTokenUnloggedUser() : new RefreshFailCause.EmptyTokenLoggedUser());
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0239, code lost:
    
        if (r4.g() == true) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024a  */
    @Override // xsna.yj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yj.a refresh() throws UnableToRefreshAccessTokenException, IOException, InterruptedException {
        boolean z;
        String str;
        boolean z2 = false;
        try {
            r55 r55Var = r55.a;
            k2q.b d = ((l2q) r55.d()).d();
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("[AccessTokenRefresherByExchangeTokenMulti] tokens count: ");
            List<h2q> list = d.a;
            sb.append(list != null ? Integer.valueOf(list.size()) : null);
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.e(sb2);
            ArrayList d2 = ((mui0) this.b.c).d();
            ArrayList a2 = a(d, d2);
            if (a2.size() > 7 && this.d.compareAndSet(false, true)) {
                mxi0 mxi0Var = this.a;
                Pair pair = new Pair("users_sm", j5g.g0(d2, null, null, null, 0, null, 63));
                List<h2q> list2 = d.a;
                if (list2 == null || (str = j5g.g0(list2, null, null, null, 0, new zj(0), 31)) == null) {
                    str = "";
                }
                mxi0Var.b("invalid_refresh_request", pn00.k(pair, new Pair("users_etr", str)));
            }
            par0.e("[AccessTokenRefresherByExchangeTokenMulti] exchange tokens: " + j5g.g0(a2, null, null, null, 0, new ak(0), 31));
            ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(((h2q) it.next()).a);
            }
            List t0 = j5g.t0(d2, j5g.S0(arrayList));
            par0.a.getClass();
            par0.e("[AccessTokenRefresherByExchangeTokenMulti] sessionsWithoutExchangeToken: " + t0);
            l7r0 l7r0Var = (l7r0) this.c.invoke();
            znk0 znk0Var = new znk0();
            VKApiConfig vKApiConfig = l7r0Var.a;
            int i = vKApiConfig.b;
            String str2 = vKApiConfig.l;
            String h = AuthByExchangeTokenInitiator.EXPIRED_TOKEN.h();
            ArrayList arrayList2 = new ArrayList(c5g.u(a2, 10));
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                String str3 = ((h2q) it2.next()).b;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(str3);
            }
            bx2 e = e370.e(wwf0.j(znk0Var, i, str2, arrayList2, h, null, null, 792));
            e.d = true;
            e.c = true;
            e.g = true;
            AuthRefreshTokensResponseDto authRefreshTokensResponseDto = (AuthRefreshTokensResponseDto) l7r0Var.e(e);
            List<AuthRefreshTokenErrorDto> d3 = authRefreshTokensResponseDto.d();
            ArrayList arrayList3 = new ArrayList(c5g.u(d3, 10));
            Iterator<T> it3 = d3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((h2q) a2.get(((AuthRefreshTokenErrorDto) it3.next()).e())).a);
            }
            par0 par0Var2 = par0.a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("[AccessTokenRefresherByExchangeTokenMulti] completedRefreshList: ");
            List<AuthRefreshTokenDto> e2 = authRefreshTokensResponseDto.e();
            ArrayList arrayList4 = new ArrayList(c5g.u(e2, 10));
            Iterator<T> it4 = e2.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((AuthRefreshTokenDto) it4.next()).getUserId());
            }
            sb3.append(arrayList4);
            sb3.append(" incompleteRefreshList: ");
            sb3.append(arrayList3);
            sb3.append(" noRefreshTokenList: ");
            sb3.append(t0);
            String sb4 = sb3.toString();
            par0Var2.getClass();
            par0.e(sb4);
            return new yj.a(an00.d(j5g.D0(new a(), authRefreshTokensResponseDto.e())), arrayList3, t0);
        } catch (IOException e3) {
            throw e3;
        } catch (InterruptedException e4) {
            throw e4;
        } catch (Exception e5) {
            UserId userId = (UserId) j5g.a0(((mui0) this.b.c).d());
            if (userId == null) {
                userId = UserId.d;
            }
            UnableToRefreshAccessTokenException unableToRefreshAccessTokenException = e5 instanceof UnableToRefreshAccessTokenException ? (UnableToRefreshAccessTokenException) e5 : null;
            boolean z3 = (e5 instanceof AuthException.ExchangeTokenException) || (e5 instanceof AuthException.InvalidRequestException);
            if (!z3) {
                z = unableToRefreshAccessTokenException != null ? true : true;
                throw new UnableToRefreshAccessTokenException(z2, userId, e5.getMessage(), unableToRefreshAccessTokenException != null ? z3 ? new RefreshFailCause.InvalidToken() : e5 : unableToRefreshAccessTokenException.getCause());
            }
            z2 = z;
            throw new UnableToRefreshAccessTokenException(z2, userId, e5.getMessage(), unableToRefreshAccessTokenException != null ? z3 ? new RefreshFailCause.InvalidToken() : e5 : unableToRefreshAccessTokenException.getCause());
        }
    }
}
