package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.ads.BuildConfig;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.id.UserId;
import com.vk.feed.core.models.MyTargetBrandLiftSurvey;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ksg;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class hsg implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hsg(ksg ksgVar, View view, boolean z, UserId userId) {
        this.d = ksgVar;
        this.e = view;
        this.c = z;
        this.f = userId;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r10v10, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.yzs] */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                ksg ksgVar = (ksg) obj4;
                View view = (View) obj3;
                UserId userId = (UserId) obj2;
                ksg.a aVar = (ksg.a) obj;
                if (aVar.equals(ksg.a.b.c)) {
                    ksgVar.d.invoke();
                } else if (aVar.equals(ksg.a.c.c) || aVar.equals(ksg.a.f.c) || aVar.equals(ksg.a.e.c)) {
                    ksgVar.e.invoke(view, ksgVar.a, Boolean.valueOf(true ^ z));
                } else if (aVar.equals(ksg.a.d.c)) {
                    ksgVar.f.invoke(Boolean.valueOf(!z));
                    g2h g2hVar = new g2h(userId);
                    g2hVar.b = "avatar";
                    g2hVar.d = BuildConfig.FLAVOR;
                    g2hVar.a();
                } else {
                    if (!aVar.equals(ksg.a.C3202a.c) && !aVar.equals(ksg.a.g.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ksgVar.g.invoke();
                }
                return s3q0.a;
            default:
                et50 et50Var = (et50) obj4;
                MyTargetBrandLiftSurvey.Question question = (MyTargetBrandLiftSurvey.Question) obj3;
                List<MyTargetBrandLiftSurvey.Question> list = (List) obj2;
                if (z) {
                    int i2 = et50.q1;
                    Intent intent = new Intent("com.vkontakte.android.AD_HANDLE_BLS_RESULT");
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : et50Var.p1.entrySet()) {
                        bundle.putStringArrayList((String) entry.getKey(), new ArrayList<>((List) entry.getValue()));
                    }
                    intent.putExtra("ad_bls_result", bundle);
                    Bundle bundle2 = et50Var.f1;
                    Integer d = bundle2 != null ? bo8.d(bundle2, "ADS_ENTRY_HASH") : null;
                    Bundle bundle3 = et50Var.f1;
                    NewsEntry newsEntry = bundle3 != null ? (NewsEntry) bundle3.getParcelable("ADS_NEWS_ITEM") : null;
                    if (d != null) {
                        intent.putExtra("ad_entry_hash", d.intValue());
                    } else if (newsEntry != null) {
                        intent.putExtra("ad_entry", newsEntry);
                    }
                    Context context = e43.a;
                    n2i0.a(context != null ? context : null, hf8.a, intent);
                    et50Var.o1 = true;
                    VkText vkText = et50Var.i1;
                    if (vkText != null) {
                        vkText.setVisibility(8);
                    }
                    VkText vkText2 = et50Var.j1;
                    if (vkText2 != null) {
                        vkText2.setVisibility(8);
                    }
                    LinearLayout linearLayout = et50Var.l1;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    VkImage vkImage = et50Var.k1;
                    if (vkImage != null) {
                        vkImage.setVisibility(8);
                    }
                    VkPlaceholder vkPlaceholder = et50Var.g1;
                    if (vkPlaceholder != null) {
                        awt0.v(vkPlaceholder, true);
                    }
                    et50Var.co(question, list);
                } else if (et50Var.n1 < e43.h(list)) {
                    int i3 = et50Var.n1 + 1;
                    et50Var.n1 = i3;
                    MyTargetBrandLiftSurvey.Question question2 = list.get(i3);
                    et50Var.fo(question2, list);
                    et50Var.eo(question2);
                    et50Var.bo(question2);
                    et50Var.co(question2, list);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ hsg(boolean z, et50 et50Var, MyTargetBrandLiftSurvey.Question question, List list) {
        this.c = z;
        this.d = et50Var;
        this.e = question;
        this.f = list;
    }
}
