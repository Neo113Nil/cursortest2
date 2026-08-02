package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.api.sdk.auth.UtilityTokens;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.sessionmanagment.api.domain.utils.exceptions.InvalidProfileTypeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Session.kt */
/* loaded from: classes11.dex */
public abstract class usi0 {
    public final vj a;

    public usi0(vj vjVar) {
        this.a = vjVar;
    }

    public vj a() {
        return this.a;
    }

    /* compiled from: Session.kt */
    public static class a extends usi0 {
        public final vj b;
        public final fhq0 c;
        public final UtilityTokens d;

        /* compiled from: Session.kt */
        /* renamed from: xsna.usi0$a$a, reason: collision with other inner class name */
        public static final class C3827a {
            public static List a(JSONArray jSONArray) {
                usi0 aVar;
                int length = jSONArray.length();
                if (length < 1) {
                    return EmptyList.b;
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject.optLong("masterAccountId") > 0) {
                        AccountProfileType.a aVar2 = AccountProfileType.Companion;
                        JSONObject jSONObject2 = jSONObject.getJSONObject("userData").getJSONObject("profileType");
                        aVar2.getClass();
                        AccountProfileType a = AccountProfileType.a.a(jSONObject2 != null ? Integer.valueOf(jSONObject2.optInt("code")) : null);
                        if (a == null) {
                            a = AccountProfileType.NORMAL;
                        }
                        if (a != AccountProfileType.NORMAL) {
                            aVar = new b(jSONArray.getJSONObject(i));
                            arrayList.add(aVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                    vj vjVar = new vj(jSONObject3.getJSONObject("token"));
                    fhq0 fhq0Var = new fhq0(jSONObject3.getJSONObject("userData"));
                    UtilityTokens.a aVar3 = UtilityTokens.CREATOR;
                    JSONObject optJSONObject = jSONObject3.optJSONObject("utilityTokens");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    aVar3.getClass();
                    aVar = new a(vjVar, fhq0Var, UtilityTokens.a.a(optJSONObject));
                    arrayList.add(aVar);
                }
                return arrayList;
            }
        }

        public a(vj vjVar, fhq0 fhq0Var, UtilityTokens utilityTokens) {
            super(vjVar);
            this.b = vjVar;
            this.c = fhq0Var;
            this.d = utilityTokens;
        }

        @Override // xsna.usi0
        public vj a() {
            return this.b;
        }

        public a b(vj vjVar, UtilityTokens utilityTokens) {
            fhq0 c = c();
            if (utilityTokens == null) {
                utilityTokens = this.d;
            }
            return new a(vjVar, c, utilityTokens);
        }

        public fhq0 c() {
            return this.c;
        }

        public JSONObject d() {
            return new JSONObject().put("token", a().f()).put("userData", c().c()).put("utilityTokens", this.d.d());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(a(), aVar.a()) && epx.f(c(), aVar.c());
        }

        public int hashCode() {
            return Objects.hash(a(), c());
        }

        public String toString() {
            return "userId = " + c().b().b + ", profileType = " + c().a();
        }

        /* compiled from: Session.kt */
        /* loaded from: classes6.dex */
        public static final class b extends a {
            public final vj e;
            public final fhq0 f;
            public final UserId g;

            public b(vj vjVar, fhq0 fhq0Var, UserId userId) {
                super(vjVar, fhq0Var, new UtilityTokens(EmptyList.b));
                this.e = vjVar;
                this.f = fhq0Var;
                this.g = userId;
                AccountProfileType accountProfileType = fhq0Var.b;
                if (accountProfileType != AccountProfileType.NORMAL) {
                    return;
                }
                throw new InvalidProfileTypeException("Don't use " + accountProfileType + " for Related session");
            }

            @Override // xsna.usi0.a, xsna.usi0
            public final vj a() {
                return this.e;
            }

            @Override // xsna.usi0.a
            public final a b(vj vjVar, UtilityTokens utilityTokens) {
                return new b(vjVar, this.f, this.g);
            }

            @Override // xsna.usi0.a
            public final fhq0 c() {
                return this.f;
            }

            @Override // xsna.usi0.a
            public final JSONObject d() {
                return super.d().put("masterAccountId", this.g.b);
            }

            public final UserId e() {
                return this.g;
            }

            @Override // xsna.usi0.a
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && this.g.b == bVar.g.b;
            }

            @Override // xsna.usi0.a
            public final int hashCode() {
                return Objects.hash(this.e, this.f, this.g);
            }

            @Override // xsna.usi0.a
            public final String toString() {
                StringBuilder sb = new StringBuilder("userId = ");
                fhq0 fhq0Var = this.f;
                sb.append(fhq0Var.a.b);
                sb.append(", profileType = ");
                sb.append(fhq0Var.b);
                sb.append(", masterAccountId = ");
                sb.append(this.g.b);
                return sb.toString();
            }

            public b(JSONObject jSONObject) {
                this(new vj(jSONObject.getJSONObject("token")), new fhq0(jSONObject.getJSONObject("userData")), new UserId(jSONObject.getLong("masterAccountId")));
            }
        }
    }
}
