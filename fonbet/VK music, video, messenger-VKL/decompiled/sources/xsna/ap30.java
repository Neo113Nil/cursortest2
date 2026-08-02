package xsna;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.hardware.SensorEvent;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.InterfaceC4413l1;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.attaches.AttachPlaylist;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.contact.vc.UserProfileView;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.c;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.log.L;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkPollSearchParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelItem;
import com.vk.stat.scheme.SchemeStat$TypeChannelSource;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.superapp.api.dto.story.WebRenderableSticker;
import com.vk.superapp.api.dto.story.WebSticker;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.browser.internal.ui.menu.action.HorizontalAction;
import com.vk.superapp.browser.internal.ui.menu.action.l;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.by40;
import xsna.cwb0;
import xsna.err0;
import xsna.ghw0;
import xsna.qr60;
import xsna.sbo0;
import xsna.v4s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ap30 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ap30(WebRenderableSticker webRenderableSticker, b0m0 b0m0Var) {
        this.b = 17;
        this.c = webRenderableSticker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127  */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Msg msg;
        pk30 pk30Var;
        Pair pair;
        Integer num;
        Integer num2;
        Integer num3;
        azl azlVar;
        ljo0 ljo0Var;
        dw20 dw20Var;
        int i = this.b;
        int i2 = 1;
        boolean z = true;
        ljo0 ljo0Var2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                bp30 bp30Var = (bp30) obj2;
                cp30 cp30Var = bp30Var.i;
                if (cp30Var != null && (msg = cp30Var.b) != null && (pk30Var = bp30Var.h) != null) {
                    pk30Var.Y(msg);
                }
                return s3q0.a;
            case 1:
                bzb0 bzb0Var = ((MsgViewHeaderComponent) obj2).k;
                bzb0Var.getClass();
                bzb0Var.c(cwb0.j0.e, null);
                return s3q0.a;
            case 2:
                ((rw40) obj2).T(new by40.f0(z ? 1 : 0));
                return s3q0.a;
            case 3:
                sg60.this.e(new uf60(new qr60.a.d(true)));
                return s3q0.a;
            case 4:
                return ((mo60) obj2).b().y0(((Integer) obj).intValue());
            case 5:
                ((pl70) obj2).getRecycler().smoothScrollToPosition(0);
                return s3q0.a;
            case 6:
                ((lh80) obj2).b.a(ghw0.o.a);
                return s3q0.a;
            case 7:
                ((z6b0) obj2).e.Ig(R.id.playlist_menu, (Playlist) obj);
                return s3q0.a;
            case 8:
                VkPollSearchParams vkPollSearchParams = (VkPollSearchParams) obj2;
                xwz xwzVar = (xwz) obj;
                City city = vkPollSearchParams.b;
                if (city != null) {
                    xwzVar.b(new exz(city.c), true);
                }
                int i3 = vkPollSearchParams.c;
                if (i3 != 0) {
                    int i4 = i3 == 2 ? R.string.poll_filter_gender_man_full : R.string.poll_filter_gender_female_full;
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(i4), true);
                }
                int i5 = vkPollSearchParams.d;
                if (i5 == 2) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.poll_result_filter_age_18_plus), true);
                } else if (i5 == 3) {
                    xwzVar.getClass();
                    xwzVar.b(xwz.e(R.string.poll_result_filter_age_36_plus), true);
                }
                return s3q0.a;
            case 9:
                l6c0 l6c0Var = (l6c0) obj2;
                l6c0Var.g.getClass();
                l6c0Var.c(z4c0.a);
                return s3q0.a;
            case 10:
                ikc0 ikc0Var = (ikc0) obj2;
                Throwable th = (Throwable) obj;
                ikc0Var.g.d(th);
                if (!((o2i) ikc0Var.q.getValue()).d(th, true)) {
                    ikc0Var.t.a(th);
                }
                wxu wxuVar = ikc0Var.y;
                (wxuVar != null ? wxuVar : null).e0(true);
                return s3q0.a;
            case 11:
                abd0 abd0Var = (abd0) obj2;
                abd0Var.l.a(abd0Var.getBindingAdapterPosition());
                return s3q0.a;
            case 12:
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a aVar = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a) obj2;
                com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.c cVar = (com.vk.libvideo.offline.dialogs.qualitychooser.presentation.feature.c) obj;
                int i6 = com.vk.libvideo.offline.dialogs.qualitychooser.presentation.ui.a.p1;
                if (cVar instanceof c.a) {
                    aVar.dismiss();
                    vb5 vb5Var = aVar.k1;
                    c.a aVar2 = (c.a) cVar;
                    (vb5Var != null ? vb5Var : null).invoke(aVar2.a, aVar2.b);
                } else {
                    if (!(cVar instanceof c.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.dismiss();
                    i0t0 i0t0Var = (i0t0) aVar.o1.getValue();
                    aVar.kn();
                    i0t0Var.getClass();
                }
                return s3q0.a;
            case 13:
                ocf0 ocf0Var = (ocf0) obj2;
                lgb lgbVar = ocf0Var.m;
                mcf0 mcf0Var = ocf0Var.o;
                if (mcf0Var == null) {
                    mcf0Var = null;
                }
                lgbVar.B(mcf0Var.b);
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CHANNEL;
                mcf0 mcf0Var2 = ocf0Var.o;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, null, (mcf0Var2 != null ? mcf0Var2 : null).f, null, 46, null), new SchemeStat$TypeChannelItem(SchemeStat$TypeChannelSource.FOLDER_RECOMM), 2);
                MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.IM_CHANNELS_LIST;
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(mobileOfficialAppsCoreNavStat$EventScreen, b, uzp0Var.a).q();
                return s3q0.a;
            case 14:
                yzs yzsVar = (yzs) obj2;
                float[] fArr = ((SensorEvent) obj).values;
                if (fArr == null || fArr.length < 3) {
                    return null;
                }
                return (vkr0) yzsVar.invoke(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]), Float.valueOf(fArr[2]));
            case 15:
                return new hk50((bei0) obj2, i2);
            case 16:
                ((io.reactivex.rxjava3.core.b) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 17:
                File file = (File) obj;
                WebRenderableSticker webRenderableSticker = (WebRenderableSticker) ((WebSticker) obj2);
                Integer num4 = webRenderableSticker.i;
                Integer num5 = webRenderableSticker.j;
                if (num4 == null || num5 == null) {
                    try {
                        String absolutePath = file.getAbsolutePath();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(absolutePath, options);
                        pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                        num = (Integer) pair.i();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        num2 = (Integer) pair.j();
                        num3 = num;
                    } catch (Throwable th3) {
                        th = th3;
                        num4 = num;
                        L.g("Can't parse original width/height from file", th);
                        num3 = num4;
                        num2 = num5;
                        return WebRenderableSticker.Ab(webRenderableSticker, file.getAbsolutePath(), null, num3, num2, InterfaceC4413l1.a.b.i);
                    }
                    return WebRenderableSticker.Ab(webRenderableSticker, file.getAbsolutePath(), null, num3, num2, InterfaceC4413l1.a.b.i);
                }
                num3 = num4;
                num2 = num5;
                return WebRenderableSticker.Ab(webRenderableSticker, file.getAbsolutePath(), null, num3, num2, InterfaceC4413l1.a.b.i);
            case 18:
                ((hpb0) obj2).e(null);
                return s3q0.a;
            case 19:
                ((tdu) obj).b(1.0f - ((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 20:
                fcn0 fcn0Var = (fcn0) obj2;
                Object obj3 = fcn0Var.l;
                Object obj4 = obj3;
                if (obj3 == null) {
                    obj4 = null;
                }
                WebAction webAction = ((men0) obj4).c().o.e;
                if (webAction != null) {
                    u7n0 u7n0Var = fcn0Var.p;
                    Context context = fcn0Var.itemView.getContext();
                    Object obj5 = fcn0Var.l;
                    Object obj6 = obj5;
                    if (obj5 == null) {
                        obj6 = null;
                    }
                    u7n0Var.b(context, webAction, (f9n0) obj6, null);
                }
                return s3q0.a;
            case 21:
                sbo0 sbo0Var = (sbo0) obj2;
                us2 us2Var = (us2) obj;
                sbo0.a aVar3 = sbo0Var.F;
                if (aVar3 == null) {
                    sbo0.a aVar4 = new sbo0.a(sbo0Var.p, us2Var);
                    o540 o540Var = new o540(us2Var, sbo0Var.q, sbo0Var.r, sbo0Var.t, sbo0Var.u, sbo0Var.v, sbo0Var.w, EmptyList.b);
                    o540Var.d(sbo0Var.j2().j);
                    aVar4.d = o540Var;
                    sbo0Var.F = aVar4;
                } else if (!epx.f(us2Var, aVar3.b)) {
                    aVar3.b = us2Var;
                    o540 o540Var2 = aVar3.d;
                    if (o540Var2 != null) {
                        nmo0 nmo0Var = sbo0Var.q;
                        v4s.a aVar5 = sbo0Var.r;
                        int i7 = sbo0Var.t;
                        boolean z2 = sbo0Var.u;
                        int i8 = sbo0Var.v;
                        int i9 = sbo0Var.w;
                        EmptyList emptyList = EmptyList.b;
                        o540Var2.a = us2Var;
                        boolean c = nmo0Var.c(o540Var2.k);
                        o540Var2.k = nmo0Var;
                        if (!c) {
                            o540Var2.q <<= 2;
                            o540Var2.l = null;
                            o540Var2.n = null;
                            o540Var2.p = -1;
                            o540Var2.o = -1;
                        }
                        o540Var2.b = aVar5;
                        o540Var2.c = i7;
                        o540Var2.d = z2;
                        o540Var2.e = i8;
                        o540Var2.f = i9;
                        o540Var2.g = emptyList;
                        o540Var2.q = (o540Var2.q << 2) | 2;
                        o540Var2.l = null;
                        o540Var2.n = null;
                        o540Var2.p = -1;
                        o540Var2.o = -1;
                    }
                }
                itl.f(sbo0Var).R();
                itl.f(sbo0Var).Q();
                mio.a(sbo0Var);
                return Boolean.TRUE;
            case 22:
                mmo0 mmo0Var = (mmo0) obj2;
                List list = (List) obj;
                eh90 i22 = mmo0Var.i2();
                nmo0 nmo0Var2 = mmo0Var.q;
                o7g o7gVar = mmo0Var.w;
                nmo0 e = nmo0.e(nmo0Var2, o7gVar != null ? o7gVar.a() : l5g.k, 0L, null, null, 0L, null, 0, 0L, 16777214);
                LayoutDirection layoutDirection = i22.o;
                if (layoutDirection != null && (azlVar = i22.i) != null) {
                    us2 us2Var2 = new us2(i22.a);
                    if (i22.j != null && i22.n != null) {
                        long j = i22.p & (-8589934589L);
                        EmptyList emptyList2 = EmptyList.b;
                        int i10 = i22.f;
                        boolean z3 = i22.e;
                        int i11 = i22.d;
                        v4s.a aVar6 = i22.c;
                        ljo0Var = new ljo0(new kjo0(us2Var2, e, emptyList2, i10, z3, i11, azlVar, layoutDirection, aVar6, j), new m540(new n540(us2Var2, e, emptyList2, azlVar, aVar6), j, i22.f, i22.d), i22.l);
                        if (ljo0Var != null) {
                            list.add(ljo0Var);
                            ljo0Var2 = ljo0Var;
                        }
                        return Boolean.valueOf(ljo0Var2 != null);
                    }
                }
                ljo0Var = null;
                if (ljo0Var != null) {
                }
                return Boolean.valueOf(ljo0Var2 != null);
            case 23:
                l.a aVar7 = (l.a) obj2;
                HorizontalAction horizontalAction = aVar7.m;
                if (horizontalAction != null) {
                    aVar7.l.c(horizontalAction);
                }
                return s3q0.a;
            case 24:
                ((AttachPlaylist) obj).b = ((z8q0) obj2).b;
                return s3q0.a;
            case 25:
                ((niq0) obj2).B.b(new ExternalEvent.ShowSnackbar(null, R.drawable.vk_icon_error_circle_outline_24, R.string.user_profile_changes_not_saved, 17, 0));
                return s3q0.a;
            case 26:
                int i12 = UserProfileView.N;
                ((UserProfileView) obj2).getClass();
                return s3q0.a;
            case 27:
                err0.a aVar8 = (err0.a) obj2;
                if (aVar8 != null) {
                    aVar8.c();
                }
                return s3q0.a;
            case 28:
                ((VideoAuthorView) obj2).e.invoke(VideoAuthorView.Action.Analytics);
                return s3q0.a;
            default:
                e6s0 e6s0Var = (e6s0) obj2;
                View view = (View) obj;
                if (e6s0Var.d.f && (dw20Var = e6s0Var.b) != null) {
                    dw20Var.Sn(view.getContext());
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ ap30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
