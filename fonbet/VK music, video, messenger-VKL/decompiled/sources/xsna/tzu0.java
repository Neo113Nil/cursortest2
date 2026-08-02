package xsna;

import android.content.Intent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityAddress;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityEmail;
import com.vk.superapp.api.dto.identity.WebIdentityPhone;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dw20;
import xsna.ky6;

/* compiled from: VkIdentityController.kt */
/* loaded from: classes6.dex */
public abstract class tzu0 {
    public final Fragment a;
    public final ky6 b = Preference.j();

    /* compiled from: VkIdentityController.kt */
    public static final class a implements hz20 {
        public final /* synthetic */ tzu0 b;
        public final /* synthetic */ WebIdentityContext c;

        public a(WebIdentityContext webIdentityContext, tzu0 tzu0Var) {
            this.b = tzu0Var;
            this.c = webIdentityContext;
        }

        @Override // xsna.hz20
        public final void a(int i) {
            JSONObject jSONObject;
            tzu0 tzu0Var = this.b;
            Fragment fragment = tzu0Var.a;
            WebIdentityContext webIdentityContext = this.c;
            int i2 = webIdentityContext.e;
            Intent intent = new Intent();
            ky6 ky6Var = tzu0Var.b;
            WebIdentityCardData webIdentityCardData = webIdentityContext.c;
            if (webIdentityContext.isEmpty()) {
                jSONObject = null;
            } else {
                JSONObject jSONObject2 = new JSONObject();
                Iterator<T> it = webIdentityContext.b.iterator();
                while (it.hasNext()) {
                    WebIdentityCard a = pgx0.a(ky6Var, webIdentityCardData, (String) it.next());
                    if (a != null) {
                        if (a instanceof WebIdentityEmail) {
                            jSONObject2.put("email", ((WebIdentityEmail) a).c);
                        } else if (a instanceof WebIdentityPhone) {
                            jSONObject2.put("phone", ((WebIdentityPhone) a).c);
                        } else if (a instanceof WebIdentityAddress) {
                            JSONObject jSONObject3 = new JSONObject();
                            WebIdentityAddress webIdentityAddress = (WebIdentityAddress) a;
                            String str = webIdentityAddress.d;
                            WebCountry Cb = webIdentityCardData.Cb(webIdentityAddress.h);
                            Cb.getClass();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("id", Cb.b);
                            jSONObject4.put("name", Cb.c);
                            jSONObject3.put("country", jSONObject4);
                            WebCity Bb = webIdentityCardData.Bb(webIdentityAddress.g);
                            Bb.getClass();
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("id", Bb.b);
                            jSONObject5.put("name", Bb.c);
                            jSONObject3.put("city", jSONObject5);
                            jSONObject3.put("specified_address", webIdentityAddress.e);
                            if (str.length() > 0) {
                                jSONObject3.put("postal_code", str);
                            }
                            jSONObject2.put(RTCStatsConstants.KEY_ADDRESS, jSONObject3);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            fragment.onActivityResult(i2, -1, intent.putExtra("arg_identity_event", String.valueOf(jSONObject)));
            long j = webIdentityContext.d.b;
        }
    }

    /* compiled from: VkIdentityController.kt */
    public static final class b implements gz20 {
        public final /* synthetic */ tzu0 b;
        public final /* synthetic */ WebIdentityContext c;

        public b(WebIdentityContext webIdentityContext, tzu0 tzu0Var) {
            this.b = tzu0Var;
            this.c = webIdentityContext;
        }

        @Override // xsna.gz20
        public final void onCancel() {
            Fragment fragment = this.b.a;
            WebIdentityContext webIdentityContext = this.c;
            fragment.onActivityResult(webIdentityContext.e, 0, null);
            long j = webIdentityContext.d.b;
        }
    }

    /* compiled from: VkIdentityController.kt */
    public static final class c implements iz20 {
        public final /* synthetic */ WebIdentityContext b;

        public c(WebIdentityContext webIdentityContext) {
            this.b = webIdentityContext;
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            TextView Kn = dw20Var.Kn();
            if (this.b.isEmpty()) {
                if (Kn != null) {
                    Kn.setClickable(false);
                }
                if (Kn != null) {
                    Kn.setAlpha(0.6f);
                }
            }
        }
    }

    /* compiled from: VkIdentityController.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements wzs<WebIdentityContext, String, s3q0> {
        @Override // xsna.wzs
        public final s3q0 invoke(WebIdentityContext webIdentityContext, String str) {
            WebIdentityContext webIdentityContext2 = webIdentityContext;
            String str2 = str;
            tzu0 tzu0Var = (tzu0) this.receiver;
            tzu0Var.a();
            if (pgx0.a(tzu0Var.b, webIdentityContext2.c, str2) == null) {
                tzu0Var.b(webIdentityContext2, str2);
            } else {
                webIdentityContext2.f = str2;
                tzu0Var.e(webIdentityContext2, str2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkIdentityController.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements yzs<String, Integer, WebIdentityContext, s3q0> {
        @Override // xsna.yzs
        public final s3q0 invoke(String str, Integer num, WebIdentityContext webIdentityContext) {
            String str2 = str;
            Integer num2 = num;
            WebIdentityContext webIdentityContext2 = webIdentityContext;
            tzu0 tzu0Var = (tzu0) this.receiver;
            if (num2 != null) {
                ky6 ky6Var = tzu0Var.b;
                int intValue = num2.intValue();
                int hashCode = str2.hashCode();
                if (hashCode != -1147692044) {
                    if (hashCode != 96619420) {
                        if (hashCode == 106642798 && str2.equals("phone")) {
                            ky6.a aVar = (ky6.a) ky6Var.edit();
                            aVar.putInt("identity_selected_phone_id", intValue);
                            aVar.a();
                        }
                    } else if (str2.equals("email")) {
                        ky6.a aVar2 = (ky6.a) ky6Var.edit();
                        aVar2.putInt("identity_selected_email_id", intValue);
                        aVar2.a();
                    }
                } else if (str2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                    ky6.a aVar3 = (ky6.a) ky6Var.edit();
                    aVar3.putInt("identity_selected_address_id", intValue);
                    aVar3.a();
                }
                tzu0Var.d(webIdentityContext2, false);
            } else {
                tzu0Var.b(webIdentityContext2, str2);
                tzu0Var.a();
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkIdentityController.kt */
    public static final class f implements gz20 {
        public final /* synthetic */ WebIdentityContext b;
        public final /* synthetic */ tzu0 c;

        public f(WebIdentityContext webIdentityContext, tzu0 tzu0Var) {
            this.b = webIdentityContext;
            this.c = tzu0Var;
        }

        @Override // xsna.gz20
        public final void onCancel() {
            WebIdentityContext webIdentityContext = this.b;
            webIdentityContext.f = null;
            this.c.d(webIdentityContext, true);
        }
    }

    public tzu0(Fragment fragment) {
        this.a = fragment;
    }

    public final void a() {
        FragmentManager supportFragmentManager;
        FragmentActivity activity = this.a.getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        Fragment H = supportFragmentManager.H("IDENTITY_CARD_REQUEST_DIALOG");
        if (H instanceof androidx.fragment.app.d) {
            ((androidx.fragment.app.d) H).dismiss();
        }
        Fragment H2 = supportFragmentManager.H("IDENTITY_CARD_LIST_DIALOG");
        if (H2 instanceof androidx.fragment.app.d) {
            ((androidx.fragment.app.d) H2).dismiss();
        }
    }

    public abstract void b(WebIdentityContext webIdentityContext, String str);

    public abstract void c(WebIdentityContext webIdentityContext);

    public final void d(final WebIdentityContext webIdentityContext, final boolean z) {
        a();
        dvv dvvVar = new dvv(webIdentityContext, new d(2, this, tzu0.class, "clickIdentity", "clickIdentity(Lcom/vk/superapp/browser/internal/ui/identity/WebIdentityContext;Ljava/lang/String;)V", 0));
        final dw20.b bVar = new dw20.b(this.a.kn(), null);
        bVar.i(dvvVar, (r3 & 2) == 0, false);
        bVar.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
        bVar.I(true);
        bVar.i0(R.string.vk_apps_access_allow, new a(webIdentityContext, this));
        bVar.Y(new b(webIdentityContext, this));
        bVar.e0(new c(webIdentityContext));
        qro0.e(100L, new gzs() { // from class: xsna.szu0
            @Override // xsna.gzs
            public final Object invoke() {
                bVar.I0("IDENTITY_CARD_REQUEST_DIALOG");
                WebIdentityContext webIdentityContext2 = webIdentityContext;
                String str = webIdentityContext2.f;
                if (str != null && z) {
                    tzu0 tzu0Var = tzu0.this;
                    if (pgx0.a(tzu0Var.b, webIdentityContext2.c, str) != null) {
                        tzu0Var.e(webIdentityContext2, str);
                    }
                }
                return s3q0.a;
            }
        });
    }

    public final void e(WebIdentityContext webIdentityContext, String str) {
        a();
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            dw20.b bVar = new dw20.b(activity, null);
            bVar.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            bVar.w0(pgx0.b(activity, str));
            WebIdentityCard a2 = pgx0.a(this.b, webIdentityContext.c, str);
            bVar.i(new tuv(webIdentityContext, str, a2 == null ? 0 : a2.zb(), new e(3, this, tzu0.class, "selectIdentityCard", "selectIdentityCard(Ljava/lang/String;Ljava/lang/Integer;Lcom/vk/superapp/browser/internal/ui/identity/WebIdentityContext;)V", 0)), (r3 & 2) == 0, false);
            bVar.Y(new f(webIdentityContext, this));
            bVar.b0(new l1k0(8, this, webIdentityContext));
            bVar.F(krv0.f(R.drawable.vk_icon_write_24, R.attr.vk_ui_icon_medium, activity), null);
            bVar.I0("IDENTITY_CARD_LIST_DIALOG");
        }
    }
}
