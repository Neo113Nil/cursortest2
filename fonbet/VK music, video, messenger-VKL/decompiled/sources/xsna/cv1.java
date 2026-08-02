package xsna;

import android.app.Activity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.view.search.RoundedSearchView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.lists.DefaultErrorView;
import com.vk.log.L;
import com.vk.story.viewer.stat.domain.LoadStrategy;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.oem0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cv1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cv1(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 1;
        int i3 = 0;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                dv1 dv1Var = (dv1) obj4;
                ngx0 ngx0Var = (ngx0) obj3;
                String str = (String) obj2;
                WebGroup webGroup = (WebGroup) obj;
                ev1 ev1Var = dv1Var.e;
                if (ev1Var != null) {
                    List t0 = j5g.t0(ev1Var.b, ngx0Var.b);
                    int e = on00.e(c5g.u(t0, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    for (Object obj5 : t0) {
                        linkedHashMap.put(obj5, Boolean.FALSE);
                    }
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.J(webGroup, linkedHashMap, new zu1(dv1Var, webGroup, str, i3), new com.vk.newsfeed.common.recycler.holders.attachments.a(i2, dv1Var, str));
                    s13 s13Var = dv1Var.b;
                    if (s13Var != null) {
                        s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GROUP_MESSAGES, MiniAppSettingsBoxAction.SHOW);
                    }
                }
                break;
            case 1:
                break;
            case 2:
                ((ebd) obj4).p((ClipsAuthor) obj3, (String) obj2);
                break;
            case 3:
                int i4 = ClipsFavoriteFoldersListFragment.U;
                ((SwipeRefreshLayout) obj4).setVisibility(8);
                ((ProgressBar) obj3).setVisibility(0);
                ((DefaultErrorView) obj2).setVisibility(8);
                break;
            case 4:
                x9q0 x9q0Var = (x9q0) obj2;
                v9q0 v9q0Var = (v9q0) obj;
                int i5 = ClipsWrapperFragment.Q0;
                int i6 = v9q0Var.c;
                ((ClipsWrapperFragment) obj4).getClass();
                ((Ref$ObjectRef) obj3).element = v9q0Var.a;
                boolean z = v9q0Var.f && v9q0Var.b > 0;
                if (!v9q0Var.g && !v9q0Var.h && !v9q0Var.i) {
                    i2 = 0;
                }
                if (z && i2 == 0) {
                    x9q0Var.a();
                }
                break;
            case 5:
                RoundedSearchView roundedSearchView = (RoundedSearchView) obj4;
                ImageView imageView = (ImageView) obj3;
                bcw0 bcw0Var = (bcw0) obj2;
                if (his0.s(roundedSearchView.d)) {
                    Activity h = e3m.h(imageView.getContext());
                    if (h instanceof aeg0) {
                        roundedSearchView.e.dispose();
                        roundedSearchView.e = vtk0.d().e(h, bcw0Var, 10);
                    }
                } else {
                    EditText editText = roundedSearchView.d;
                    if (editText != null) {
                        editText.setText("");
                    }
                }
                break;
            case 6:
                LoadStrategy loadStrategy = (LoadStrategy) obj4;
                zgm0 zgm0Var = (zgm0) obj3;
                v3u0 v3u0Var = (v3u0) obj2;
                com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get cached viewers", (Throwable) obj));
                if (loadStrategy == LoadStrategy.ONLY_CACHE) {
                    zgm0Var.d.a(new oem0.c.b(v3u0Var.b));
                }
                break;
            default:
                ((zhw0) obj4).c0((UserId) obj3, (yiw0) obj2, new weq0(5));
                L.i((Throwable) obj);
                break;
        }
        return s3q0.a;
    }
}
