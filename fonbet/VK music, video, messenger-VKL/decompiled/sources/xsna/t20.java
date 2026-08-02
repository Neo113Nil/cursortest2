package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.cameraui.impl.a;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.actionlinks.ActionLinks;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.libvideo.live.impl.views.stat.StatAdapter;
import com.vkontakte.android.actionlinks.SourceType;
import xsna.gr6;
import xsna.nzb;

/* compiled from: ActionLinksBridge.kt */
/* loaded from: classes15.dex */
public interface t20 {
    void a(Context context, gr6.b bVar, UserId userId, SourceType sourceType, dz20 dz20Var);

    vmz b(ViewGroup viewGroup);

    void c(Context context, UserId userId, String str, boolean z, boolean z2, ActionLinks actionLinks, hb hbVar, a.j jVar);

    izs d(Context context, ViewGroup viewGroup, boolean z, ActionLink actionLink, int i, nzb.d dVar, nzb.e eVar, int i2, UserId userId);

    void e(RecyclerView.e0 e0Var, UserProfile userProfile, boolean z, StatAdapter.c cVar);

    void f(Context context, ActionLink actionLink, UserId userId, String str, ActionLinks actionLinks, lb lbVar, com.vk.movika.sdk.base.observable.k kVar);

    io.reactivex.rxjava3.internal.operators.observable.m1 g(UserId userId);

    void h(int i, Context context, UserId userId);

    rtx i(Context context);

    void j(View view, ActionLink actionLink, int i, int i2, dp0 dp0Var);
}
