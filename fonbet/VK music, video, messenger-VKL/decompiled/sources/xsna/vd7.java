package xsna;

import android.content.Context;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.vk.articles.api.preload.QueryParameters;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vk.mvi.MviLazyViewContainer;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import ru.ok.android.annotation.CallInternalApi;

/* compiled from: BitrateDumpGatheringConfigStorageImpl.kt */
@CallInternalApi
/* loaded from: classes8.dex */
public class vd7 implements ud7, ub80, vix, z980 {
    public Object b;

    public /* synthetic */ vd7(Object obj) {
        this.b = obj;
    }

    public static String g(String str, boolean z, QueryParameters queryParameters) {
        HashMap<String, String> hashMap = xp3.a;
        if (str.length() == 0) {
            return "";
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        if (z) {
            buildUpon.appendQueryParameter("web_view", "1");
            buildUpon.appendQueryParameter("v", "2");
            buildUpon.appendQueryParameter("dark", dhr0.C().b ? "0" : "1");
            if (queryParameters != null) {
                for (Map.Entry entry : queryParameters.b.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str2.length() > 0 && str3.length() > 0) {
                        buildUpon.appendQueryParameter(str2, str3);
                    }
                }
            }
        }
        return buildUpon.build().toString();
    }

    @Override // xsna.z980
    public void R5(Photo photo, PhotoTag photoTag) {
        m6n0 m6n0Var = (m6n0) this.b;
        m6n0Var.g--;
        photoTag.l = false;
    }

    @Override // xsna.vix
    public ViewGroup a() {
        return (MviLazyViewContainer) this.b;
    }

    @Override // xsna.vix
    public zgx b() {
        return null;
    }

    @Override // xsna.ub80
    public void c(ClickableSpan clickableSpan, View view) {
        sxv sxvVar = ((j140) this.b).T;
        if (sxvVar != null) {
            sxvVar.c(clickableSpan, view);
        }
    }

    public com.vk.articles.a d(Context context, String str, boolean z, QueryParameters queryParameters) {
        com.vk.articles.a aVar;
        lpj lpjVar = new lpj(context, dhr0.M() ? R.style.VkWebViewDarkTheme : R.style.VkWebViewLightTheme);
        try {
            aVar = new com.vk.articles.a(lpjVar);
        } catch (AndroidRuntimeException e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            throw e;
        } catch (OutOfMemoryError unused) {
            mcr0.b();
            aVar = new com.vk.articles.a(lpjVar);
        }
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) this.b;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        p11 p11Var = new p11(24);
        fVar.getClass();
        int i = 3;
        this.b = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, p11Var).U(new rf3(25)).U(new wq(i, new qb(3))).subscribe(new lz(new tb(aVar, 8), i));
        aVar.b(g(str, z, queryParameters), z, !z ? xp3.a : null);
        return aVar;
    }

    public void e() {
        ((TimelineView) this.b).performHapticFeedback(4);
    }

    public xsg0 f(String str, List list, UIBlock uIBlock) {
        yca ycaVar = new yca("catalog.reorderBlockItems");
        ycaVar.K("block_id", str);
        ycaVar.K("replacement_ids", new JSONArray((Collection) rli0.A(new ulp0(new i5g(list), new k60(8)))).toString());
        ahn.D(ycaVar);
        return ycaVar;
    }

    public void h() {
        ((TimelineView) this.b).performHapticFeedback(0);
    }

    @Override // xsna.z980
    public void w4(Photo photo, PhotoTag photoTag) {
        m6n0 m6n0Var = (m6n0) this.b;
        m6n0Var.g++;
        m6n0Var.c.w4(photo, photoTag);
    }
}
