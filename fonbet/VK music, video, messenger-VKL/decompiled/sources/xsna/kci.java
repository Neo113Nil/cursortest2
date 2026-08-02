package xsna;

import android.os.LocaleList;
import android.text.Spanned;
import androidx.compose.runtime.a;
import androidx.emoji2.text.e;
import com.google.android.gms.internal.measurement.zzoc;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.ActionButton;
import com.vk.dto.common.ActionableRecommendedProfile;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.sync.impl.DeferredSyncWorker$awaitSync$$inlined$map$2;
import java.text.BreakIterator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: CellScreenContent.kt */
/* loaded from: classes18.dex */
public final class kci implements kbf0, axp, q701, ea60, zy1 {
    public static final jai b = new jai(-1609387627, new jci(0), false);
    public static final kci c = new kci();
    public static final kci d = new kci();
    public static final kci e = new kci();
    public static final /* synthetic */ kci f = new kci();

    public kci() {
        new bpn0(new sv0(16));
    }

    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar) {
        androidx.compose.runtime.a M = aVar.M(606934447);
        int i3 = (M.o(i) ? 4 : 2) | i2 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(606934447, i3, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.placeholders.PlaceholderStateView (PlaceholderStateView.kt:9)");
            }
            if (i == 0) {
                M.K(-851543108);
                boolean z = (i3 & 112) == 32;
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new rsa0(0, gzsVar);
                    M.R(x);
                }
                vha0.a(0, M, (gzs) x, null);
                M.j();
            } else if (i != 1) {
                M.K(-851538509);
                M.j();
            } else {
                M.K(-851539739);
                uha0.a(null, M, 0);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ms3(i, i2, gzsVar);
        }
    }

    public static cw5 b() {
        return new cw5(f870.d(4278848010L), f870.d(4283604724L), f870.d(4283604724L), f870.d(4294967295L), f870.c(872415231), f870.d(4284129023L), f870.d(4279834906L), f870.d(3424196890L), f870.d(4294967295L), f870.d(4294967295L), f870.d(4293651952L), f870.d(4281085230L), f870.c(872415231), f870.d(4281085230L), f870.d(4282203711L), f870.d(4280039764L), f870.d(4293651952L), f870.d(4280032542L), f870.d(4294967295L), f870.d(4294925404L), f870.d(4283575854L), f870.d(4283151179L), f870.d(4281220651L), f870.d(4280492836L), f870.d(4281677110L), f870.c(436207615), f870.c(771751935), f870.d(4280295457L), f870.c(134217727), f870.d(4282856213L));
    }

    public static mwz c(mwz mwzVar, mwz mwzVar2) {
        if (mwzVar != null) {
            LocaleList localeList = mwzVar.a.a;
            if (!localeList.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i = 0; i < mwzVar2.a.a.size() + localeList.size(); i++) {
                    Locale locale = i < localeList.size() ? localeList.get(i) : mwzVar2.a.a.get(i - localeList.size());
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                return mwz.b(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
            }
        }
        return mwz.b;
    }

    public static final RecommendedProfile d(String str, JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (!str.equals("holiday_friends")) {
            return new RecommendedProfile(new UserProfile(jSONObject));
        }
        Serializer.c<ActionableRecommendedProfile> cVar = ActionableRecommendedProfile.CREATOR;
        UserProfile userProfile = new UserProfile(jSONObject.getJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE));
        JSONArray optJSONArray = jSONObject.optJSONArray("actions");
        int length = optJSONArray != null ? optJSONArray.length() : 0;
        ActionButton[] actionButtonArr = new ActionButton[length];
        for (int i = 0; i < length; i++) {
            actionButtonArr[i] = (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(i)) == null) ? null : new ActionButton(new LinkButton(optJSONObject), optJSONObject.optString("icon"));
        }
        return new ActionableRecommendedProfile(userProfile, actionButtonArr);
    }

    public static final ksr e(ksr ksrVar, long j) {
        if (j >= 0) {
            return j == 0 ? ksrVar : new psr(new wsr(new vsr(j, 0), ksrVar, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int f(int i, String str) {
        String str2;
        int i2;
        androidx.emoji2.text.c h = h();
        Integer num = null;
        if (h != null) {
            obr.f("Not initialized yet", h.c() == 1);
            obr.e(str, "charSequence cannot be null");
            androidx.emoji2.text.e eVar = h.e.b;
            eVar.getClass();
            if (i < 0 || i >= str.length()) {
                str2 = str;
                i2 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    xdp[] xdpVarArr = (xdp[]) spanned.getSpans(i, i + 1, xdp.class);
                    if (xdpVarArr.length > 0) {
                        i2 = spanned.getSpanEnd(xdpVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i2 = ((e.c) eVar.e(str2, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new e.c(i))).c;
            }
            Integer valueOf = Integer.valueOf(i2);
            if (i2 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i);
    }

    public static final int g(int i, String str) {
        androidx.emoji2.text.c h = h();
        Integer num = null;
        if (h != null) {
            Integer valueOf = Integer.valueOf(h.b(Math.max(0, i - 1), str));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final androidx.emoji2.text.c h() {
        if (!androidx.emoji2.text.c.d()) {
            return null;
        }
        androidx.emoji2.text.c a = androidx.emoji2.text.c.a();
        if (a.c() == 1) {
            return a;
        }
        return null;
    }

    public static final xuy i(xvy xvyVar) {
        return (xuy) j5g.k0(xvyVar.j().f());
    }

    public static final v4j0 j(v4j0 v4j0Var, v4j0 v4j0Var2, float f2) {
        return new v4j0(f870.D(v4j0Var.a, v4j0Var2.a, f2), xus.q(v4j0Var.b, v4j0Var2.b, f2), q6x.z(v4j0Var.c, v4j0Var2.c, f2));
    }

    public static final q630 k(q630 q630Var, izs izsVar) {
        return q630Var.g(new xv70(izsVar, new uzo(izsVar, 2)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [xsna.tv70] */
    public static final q630 l(q630 q630Var, final float f2, final float f3) {
        return q630Var.g(new sv70(f2, f3, new izs() { // from class: xsna.tv70
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                z5x z5xVar = (z5x) obj;
                z5xVar.getClass();
                sjr0 sjr0Var = z5xVar.a;
                sjr0Var.c("x", new pco(f2));
                sjr0Var.c("y", new pco(f3));
                return s3q0.a;
            }
        }));
    }

    public static q630 m(float f2, float f3, int i, q630 q630Var) {
        if ((i & 1) != 0) {
            f2 = 0;
        }
        if ((i & 2) != 0) {
            f3 = 0;
        }
        return l(q630Var, f2, f3);
    }

    public static final void o(zjt zjtVar, mk6 mk6Var) {
        zjtVar.setVkPostprocessor(mk6Var != null ? new nhs(mk6Var) : null);
    }

    public static final psr p(DeferredSyncWorker$awaitSync$$inlined$map$2 deferredSyncWorker$awaitSync$$inlined$map$2, long j) {
        return new psr(new zsr(j, deferredSyncWorker$awaitSync$$inlined$map$2, null));
    }

    @Override // xsna.zy1
    public boolean D(Object obj) {
        return ((gkx0) obj).equals(gkx0.e);
    }

    @Override // xsna.zy1
    public Object n(frz frzVar) {
        Object obj;
        Dialog dialog;
        gkx0 nc;
        gkx0 gkx0Var;
        xrm xrmVar = (xrm) frzVar;
        DialogsHistory dialogsHistory = xrmVar.b;
        Iterator<Dialog> it = dialogsHistory.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                dialog = null;
                break;
            }
            dialog = it.next();
            if (dialogsHistory.d().contains(Long.valueOf(dialog.Zb().b))) {
                break;
            }
        }
        Dialog dialog2 = dialog;
        Iterator it2 = j5g.y0(xrmVar).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Dialog dialog3 = (Dialog) next;
            Msg msg = dialogsHistory.s().get(dialog3.Sb());
            if (msg != null && msg.Mb() && !dialogsHistory.d().contains(Long.valueOf(dialog3.Zb().b))) {
                gkx0 nc2 = dialog3.nc();
                if (dialog2 == null || (gkx0Var = dialog2.nc()) == null) {
                    gkx0Var = gkx0.d;
                }
                if (nc2.compareTo(gkx0Var) > 0) {
                    obj = next;
                    break;
                }
            }
        }
        Dialog dialog4 = (Dialog) obj;
        return (dialog4 == null || (nc = dialog4.nc()) == null) ? gkx0.e : nc;
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Boolean.valueOf(zzoc.zzd());
    }
}
