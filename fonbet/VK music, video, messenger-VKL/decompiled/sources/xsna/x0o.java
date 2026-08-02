package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.VKApiConfig;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.lists.ListDataSet;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutClick;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.awr0;
import xsna.fd70;
import xsna.l7v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class x0o implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x0o(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final Object invoke() {
        View findViewById;
        String str;
        String str2;
        HashMap hashMap;
        CharSequence charSequence;
        CharSequence charSequence2;
        switch (this.b) {
            case 0:
                iyn iynVar = (iyn) this.c;
                vwn vwnVar = (vwn) this.d;
                z0o z0oVar = (z0o) this.e;
                di60.w(iynVar.i, vwnVar.getContext(), null, null, null, null, 62);
                myn mynVar = z0oVar.i;
                mynVar.getClass();
                new bjc(MobileOfficialAppsCoreNavStat$EventScreen.GROUP, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, Long.valueOf(mynVar.a.b), null, null, null, 58, null), new CommonCommunitiesStat$TypeDonutClick(CommonCommunitiesStat$TypeDonutClick.EventType.CLICK_DONUT_BANNER_GOAL, null, null, 6, null), 2)).q();
                return s3q0.a;
            case 1:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.c;
                String str3 = (String) this.d;
                okhttp3.p pVar = (okhttp3.p) this.e;
                StringBuilder sb = new StringBuilder("ImageRetryInterceptor TRY request [");
                jax0.a(ref$IntRef.element, "] [", str3, "] - ", sb);
                sb.append(p2i0.c.a(pVar.a.i));
                return sb.toString();
            case 2:
                NewsfeedSettingsFragment newsfeedSettingsFragment = (NewsfeedSettingsFragment) this.c;
                String str4 = (String) this.d;
                FragmentActivity fragmentActivity = (FragmentActivity) this.e;
                int i = NewsfeedSettingsFragment.v0;
                RecyclerView recyclerView = newsfeedSettingsFragment.O;
                if (recyclerView == null || (findViewById = recyclerView.findViewById(R.id.settings_feed_type)) == null) {
                    return s3q0.a;
                }
                Rect d = w11.d(findViewById);
                if (!d.isEmpty() && d.height() == findViewById.getHeight()) {
                    l7v b = pla.e().b();
                    b.getClass();
                    new l7v.b(str4, b, d).j(fragmentActivity);
                }
                return s3q0.a;
            case 3:
                izs izsVar = (izs) this.c;
                ee70 ee70Var = (ee70) this.d;
                Context context = (Context) this.e;
                if (!jjc.d().a()) {
                    izsVar.invoke(new fd70.a(ee70Var.a, ee70Var.b.a(context).toString()));
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 4:
                arl0 arl0Var = (arl0) this.c;
                ListDataSet.ArrayListImpl arrayListImpl = (ListDataSet.ArrayListImpl) this.d;
                Set set = (Set) this.e;
                int size = arrayListImpl.size();
                for (int i2 = 0; i2 < size; i2++) {
                    StoriesContainer storiesContainer = (StoriesContainer) arrayListImpl.get(i2);
                    if (storiesContainer.Eb()) {
                        Iterator<StoryEntry> it = storiesContainer.g.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            StoryEntry next = it.next();
                            if (set.contains(next)) {
                                z = true;
                                next.h = true;
                            }
                        }
                        if (z) {
                            opl0 opl0Var = arl0Var.x;
                            opl0Var.notifyItemChanged(opl0Var.t ? i2 + 1 : i2);
                        }
                    }
                }
                return s3q0.a;
            case 5:
                ((izs) this.c).invoke(new awr0.h(((dqt0) this.d).b, p490.C((tny) ((bpf0) this.e).a())));
                return s3q0.a;
            default:
                zfx0 zfx0Var = (zfx0) this.c;
                l7r0 l7r0Var = (l7r0) this.d;
                String str5 = (String) this.e;
                wwu0 wwu0Var = zfx0Var.c;
                Object obj = wwu0Var.a;
                String str6 = wwu0Var.b;
                String a = i7r0.a(l7r0Var.i().e.getValue());
                String b2 = i7r0.b(l7r0Var.i().e.getValue());
                if (a.length() <= 0 || a.equals(str5) || a.equals(obj)) {
                    str = str6;
                    str2 = obj;
                } else {
                    str2 = a;
                    str = b2;
                }
                String value = l7r0Var.a.f.getValue();
                wwu0 wwu0Var2 = zfx0Var.c;
                wwu0Var2.getClass();
                HashMap hashMap2 = new HashMap(11);
                hashMap2.put("client_id", wwu0Var2.c.toString());
                String str7 = wwu0Var2.d;
                if (str7 != null) {
                    hashMap2.put(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, str7);
                }
                String str8 = wwu0Var2.e;
                if (str8 != null) {
                    hashMap2.put("redirect_uri", str8);
                }
                String str9 = wwu0Var2.f;
                if (str9 != null) {
                    hashMap2.put("source_url", str9);
                }
                hashMap2.put("display", "android");
                hashMap2.put(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "token");
                Long l = wwu0Var2.g;
                if (l != null) {
                    hashMap2.put("group_ids", l.toString());
                }
                if (wwu0Var2.h) {
                    hashMap2.put("skip_consent", "1");
                }
                ArrayList arrayList = new ArrayList(4);
                if (value != null && value.length() != 0 && ((charSequence2 = (CharSequence) hashMap2.get("device_id")) == null || charSequence2.length() == 0)) {
                    q2z.a("device_id", value, arrayList);
                }
                Iterator it2 = RegistrationStatParamsFactory.a().iterator();
                while (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    String str10 = (String) pair.d();
                    String str11 = (String) pair.g();
                    if (str11 != null && str11.length() != 0 && ((charSequence = (CharSequence) hashMap2.get(str10)) == null || charSequence.length() == 0)) {
                        q2z.a(str10, str11, arrayList);
                    }
                }
                if (arrayList.isEmpty()) {
                    hashMap = hashMap2;
                } else {
                    HashMap linkedHashMap = new LinkedHashMap(hashMap2);
                    pn00.p(linkedHashMap, arrayList);
                    hashMap = linkedHashMap;
                }
                kpe0 kpe0Var = kpe0.a;
                String str12 = zfx0Var.e;
                VKApiConfig vKApiConfig = l7r0Var.a;
                String c = kpe0.c(kpe0Var, str12, hashMap, vKApiConfig.g, str2, str, vKApiConfig.b, false, null, false, VideoRecord.DEFAULT_MAX_DIMENSION);
                t.a aVar = okhttp3.t.Companion;
                Pattern pattern = okhttp3.m.e;
                okhttp3.m a2 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
                aVar.getClass();
                return t.a.a(c, a2);
        }
    }

    public /* synthetic */ x0o(Ref$IntRef ref$IntRef, String str, nlw nlwVar, okhttp3.p pVar) {
        this.b = 1;
        this.c = ref$IntRef;
        this.d = str;
        this.e = pVar;
    }
}
