package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.preference.Preference;
import com.vk.dto.narratives.Narrative;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.onlinebooking.impl.common.presentation.model.BookingMaster;
import com.vk.ecomm.onlinebooking.impl.masters.presentation.mvi2.a;
import com.vk.profile.user.impl.ui.f;
import com.vk.profile.user.impl.ui.g;
import com.vk.profile.user.impl.ui.view.header.UserProfileHeaderView;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick;
import com.vk.video.ui.discovery.minimizable.doc2doc.recycler.HorizontalRecyclerPaginationView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.analytics.internal.upload.DbUploader;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import xsna.aa70;
import xsna.b3q0;
import xsna.dz40;
import xsna.h75;
import xsna.khw0;
import xsna.pox0;
import xsna.r2c;
import xsna.s2i;
import xsna.sdo;
import xsna.yc1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class yq1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yq1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v93, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        List<qtd0> list;
        MultiUploadHelper multiUploadHelper_delegate$lambda$0;
        int i = 0;
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new yc1.c(((wq1) this.d).b));
                break;
            case 1:
                ((izs) this.c).invoke(new a.e((BookingMaster) this.d));
                break;
            case 2:
                ((izs) this.c).invoke(new r2c.n(((g3c) this.d).c));
                break;
            case 3:
                png pngVar = (png) this.c;
                pngVar.e(false, new d5(4, (khw0.a) this.d, pngVar));
                break;
            case 4:
                yah yahVar = (yah) this.c;
                yahVar.b.b(((Narrative) this.d).c, MobileOfficialAppsCoreNavStat$EventScreen.GROUP, true).g(3238, yahVar.a);
                break;
            case 5:
                s2i s2iVar = (s2i) this.c;
                maz.c(s2iVar.h.f(), ((s2i.a) this.d).n.getContext(), s2iVar.g.b.f, LaunchContext.A, null, null, 24);
                break;
            case 6:
                CharSequence charSequence = (CharSequence) this.c;
                com.vk.im.ui.components.contacts.b bVar = (com.vk.im.ui.components.contacts.b) this.d;
                io.reactivex.rxjava3.subjects.d<gdj> dVar = bVar.o;
                if (drm0.N(charSequence)) {
                    dVar.onNext(gdj.a(bVar.d(), null, null, null, EmptyList.b, null, false, null, 1951));
                } else {
                    gdj d = bVar.d();
                    String obj = drm0.p0(charSequence).toString();
                    List<qtd0> list2 = bVar.d().a;
                    String obj2 = charSequence.toString();
                    if (obj2.length() == 0) {
                        list = list2;
                    } else {
                        Locale locale = Locale.ROOT;
                        String M = blk.M(obj2.toLowerCase(locale));
                        String N = blk.N(obj2.toLowerCase(locale));
                        int i2 = 0;
                        while (true) {
                            if (i2 < obj2.length()) {
                                if (Character.isLetter(obj2.charAt(i2))) {
                                    i = 1;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        qu20 qu20Var = new qu20(obj2, bVar.a.c());
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list2) {
                            qtd0 qtd0Var = (qtd0) obj3;
                            String name = qtd0Var.name();
                            if (!drm0.D(name, M, true) && !drm0.D(name, N, true)) {
                                if (i == 0) {
                                    String c5 = qtd0Var.c5();
                                    if (c5.length() > 0 && qu20Var.a(c5)) {
                                    }
                                }
                            }
                            arrayList.add(obj3);
                        }
                        list = arrayList;
                    }
                    dVar.onNext(gdj.a(d, null, null, obj, list, null, false, null, 1951));
                }
                break;
            case 7:
                multiUploadHelper_delegate$lambda$0 = DbUploader.multiUploadHelper_delegate$lambda$0((e9e0) this.c, (DbUploader) this.d);
                break;
            case 8:
                ((izs) this.c).invoke(new sdo.e(((qdo) this.d).a));
                break;
            case 9:
                Context context = (Context) this.c;
                tjq tjqVar = (tjq) this.d;
                g2v.c().k().b(context, "https://" + a0a.d + "/safety/10/32");
                dw20 dw20Var = tjqVar.a;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                break;
            case 10:
                ((izs) this.c).invoke(new h75.a(((ovx) this.d).c));
                break;
            case 11:
                izs izsVar = (izs) this.c;
                MarketProductTileConfig marketProductTileConfig = (MarketProductTileConfig) this.d;
                if (izsVar != null) {
                    izsVar.invoke(new MarketProductTileConfig.f(marketProductTileConfig.a));
                }
                break;
            case 12:
                FragmentImpl fragmentImpl = (FragmentImpl) this.c;
                ar60 ar60Var = (ar60) this.d;
                break;
            case 13:
                aa70 aa70Var = (aa70) this.c;
                io.reactivex.rxjava3.core.b bVar2 = (io.reactivex.rxjava3.core.b) this.d;
                aa70.a aVar = aa70Var.a;
                if (aVar != null) {
                    c63.c(aVar);
                }
                SharedPreferences.Editor edit = Preference.f("notification_gdpr_dialog").edit();
                edit.putBoolean("dialog_already_shown", true);
                edit.apply();
                bVar2.onComplete();
                break;
            case 14:
                ((yd90) this.c).l.invoke(Boolean.valueOf(((FeedItem.Pagination.a) this.d).b));
                break;
            case 15:
                ((wh50) this.c).setValue(((dz40.o) this.d).m());
                break;
            case 16:
                View view = (View) this.c;
                Rect rect = (Rect) this.d;
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view.getContext();
                break;
            case 17:
                g8e0 g8e0Var = (g8e0) this.c;
                f8e0 f8e0Var = (f8e0) this.d;
                AppCompatActivity appCompatActivity = g8e0Var.b.get();
                if (appCompatActivity != null) {
                    ewt ewtVar = f8e0Var.c;
                    if (ewtVar != null) {
                        ewtVar.a(appCompatActivity, pn00.k(new Pair("flow_service", "unblock_protect_account_modal"), new Pair(NotificationCompat.CATEGORY_RECOMMENDATION, "1")));
                        s3q0 s3q0Var = s3q0.a;
                    }
                    f8e0Var.dismiss();
                }
                break;
            case 18:
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = (SchemeStatSak$EventScreen) this.c;
                SchemeStatSak$TypeRegistrationItem.EventType eventType = (SchemeStatSak$TypeRegistrationItem.EventType) this.d;
                frf0.m(null, false);
                if (frf0.a.zb() != null || schemeStatSak$EventScreen != null) {
                    frf0.j(eventType, schemeStatSak$EventScreen, null, null, null, 248);
                    frf0.a.b.m();
                    frf0.m(schemeStatSak$EventScreen, false);
                    break;
                } else {
                    break;
                }
            case 19:
                znj0 znj0Var = (znj0) this.c;
                gzs<s3q0> gzsVar = (gzs) this.d;
                HorizontalRecyclerPaginationView a = znj0Var.h().a();
                if (a != null) {
                    a.setOnRefreshListener(gzsVar);
                }
                break;
            case 20:
                URLSpan uRLSpan = (URLSpan) this.c;
                oao0 oao0Var = (oao0) this.d;
                if (uRLSpan.getURL() != null) {
                    oao0Var.d.invoke(uRLSpan.getURL());
                }
                break;
            case 21:
                b3q0 b3q0Var = (b3q0) this.c;
                b3q0.a aVar2 = (b3q0.a) this.d;
                b3q0Var.d = b3q0.b.HIDE_ENABLED;
                b3q0Var.b(aVar2);
                b3q0Var.b.invoke(MobileOfficialAppsVideoStat$TypeCreatorHideUndoHideClick.EventType.UNDO_HIDE_CREATOR_FROM_SUBSCRIPTIONS);
                break;
            case 22:
                zuq0 zuq0Var = (zuq0) this.c;
                g.a aVar3 = (g.a) this.d;
                int i3 = UserProfileHeaderView.G;
                zuq0Var.B(new f.e.c(aVar3.j));
                break;
            case 23:
                bbp bbpVar = (bbp) this.c;
                View[] viewArr = (View[]) this.d;
                View[] viewArr2 = (View[]) Arrays.copyOf(viewArr, viewArr.length);
                int length = viewArr2.length;
                while (i < length) {
                    View view2 = viewArr2[i];
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    layoutParams.height = bbpVar.getMeasuredHeight();
                    layoutParams.width = bbpVar.getMeasuredWidth();
                    view2.requestLayout();
                    i++;
                }
                break;
            case 24:
                ((izs) this.c).invoke((buv0) this.d);
                break;
            default:
                izs izsVar2 = (izs) this.c;
                String str = ((pox0.b.a) this.d).e;
                if (str == null) {
                    str = "";
                }
                izsVar2.invoke(str);
                break;
        }
        return s3q0.a;
    }
}
