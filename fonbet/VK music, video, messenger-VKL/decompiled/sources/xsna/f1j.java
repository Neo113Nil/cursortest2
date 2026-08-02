package xsna;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.bridges.CompanionApp;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.Source;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.GroupCallInProgress;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.libdelayedjobs.WorkPolicy;
import com.vk.log.L;
import com.vk.video.bugreport.api.dto.VideoTechBugreportData;
import com.vk.voip.ui.notifications.incoming.b;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Ref$LongRef;
import xsna.chu;
import xsna.p1s;
import xsna.p810;
import xsna.tj50;
import xsna.w3s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class f1j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f1j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        io.reactivex.rxjava3.internal.operators.mixed.c e;
        d3b0 f;
        int i = this.b;
        int i2 = 3;
        int i3 = 2;
        r3 = null;
        VideoTechBugreportData videoTechBugreportData = null;
        com.vk.im.engine.models.dialogs.c cVar = null;
        boolean z = false;
        r4 = false;
        boolean z2 = false;
        z = false;
        int i4 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((Toolbar) ((i1j) obj2).k.getValue()).setTitle((String) obj);
                return s3q0.a;
            case 1:
                tzj tzjVar = (tzj) obj;
                ((nzj) obj2).e.getClass();
                tj00 tj00Var = tzjVar.b;
                return new qm00(tj00Var.a, tj00Var.b, tj00Var.c, tzjVar.g, tzjVar.h);
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj2;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
                if (rawQuery == null) {
                    arrayList = new ArrayList();
                } else {
                    ArrayList arrayList2 = new ArrayList(rawQuery.getCount());
                    try {
                        if (rawQuery.moveToFirst()) {
                            while (!rawQuery.isAfterLast()) {
                                arrayList2.add(rawQuery.getString(0));
                                rawQuery.moveToNext();
                            }
                        }
                        s3q0 s3q0Var = s3q0.a;
                        rawQuery.close();
                        arrayList = arrayList2;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ro.e(rawQuery, th);
                            throw th2;
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList) {
                    String str = (String) obj3;
                    if (!epx.f(str, "android_metadata") && !epx.f(str, "sqlite_sequence")) {
                        arrayList3.add(obj3);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
                }
                return s3q0.a;
            case 3:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj2;
                iyu0 iyu0Var = (iyu0) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                if (jyu0.e(iyu0Var) || jyu0.f(iyu0Var)) {
                    wsl b = uh.b.b();
                    fyx fyxVar = new fyx();
                    fyxVar.a.put("KEY_SCHEDULE", "10:00; 10:30; 11:00; 11:30; 12:00; 12:30; 13:00; 13:30; 14:00; 14:30; 15:00; 15:30; 16:00; 16:30; 17:00; 17:30; 18:00");
                    ((xsl) b).a("xji0", new xji0(fyxVar), new usl(WorkPolicy.REPLACE, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, PsExtractor.VIDEO_STREAM_MASK));
                } else {
                    enj.r(debugDevSettingsFragment.requireContext(), "Отсутствуют разрешения для получения активности", 0);
                }
                return null;
            case 4:
                DialogActionsListView dialogActionsListView = (DialogActionsListView) obj2;
                u8m u8mVar = (u8m) obj;
                DialogActionsListView.b bVar = (DialogActionsListView.b) DialogActionsListView.j.get(u8mVar);
                if (bVar == null) {
                    L.l("Mapping for " + u8mVar + " is not provided");
                    return null;
                }
                Context context = dialogActionsListView.getContext();
                u8m u8mVar2 = bVar.b;
                if (u8mVar2 == null) {
                    u8mVar2 = null;
                }
                int i5 = bVar.a;
                izs<? super Context, ? extends Drawable> izsVar = bVar.c;
                if (izsVar == null) {
                    izsVar = null;
                }
                Drawable invoke = izsVar.invoke(context);
                izs<? super Context, ? extends CharSequence> izsVar2 = bVar.d;
                return new zt(u8mVar2, i5, invoke, (izsVar2 != null ? izsVar2 : null).invoke(context));
            case 5:
                Throwable th3 = (Throwable) obj;
                afm.F.a(th3);
                dfm dfmVar = ((afm) obj2).z;
                if (dfmVar != null) {
                    dfmVar.d(th3);
                }
                return s3q0.a;
            case 6:
                wkm wkmVar = (wkm) obj2;
                a1w a1wVar = wkmVar.a;
                com.vk.im.engine.models.dialogs.c cVar2 = (com.vk.im.engine.models.dialogs.c) obj;
                int i6 = 6;
                int i7 = 20;
                if (cVar2.a() || cVar2.equals(c.C1124c.c)) {
                    DialogTheme dialogTheme = mkm.a.get(cVar2);
                    io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(a1wVar.C(wkmVar, new rkm(cVar2, Source.CACHE)), new q9(new cj1(i7), i6));
                    io.reactivex.rxjava3.internal.operators.single.o oVar = new io.reactivex.rxjava3.internal.operators.single.o(new io.reactivex.rxjava3.internal.operators.single.r(a1wVar.C(wkmVar, new rkm(cVar2, Source.ACTUAL)), new q9(new cj1(i7), i6)), new wn(new fj1(22), i7));
                    e = dialogTheme != null ? io.reactivex.rxjava3.core.x.e(io.reactivex.rxjava3.core.x.k(dialogTheme), oVar) : io.reactivex.rxjava3.core.x.e(rVar, oVar);
                } else {
                    wkmVar.b.getClass();
                    String string = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
                    if (string != null) {
                        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
                        cVar = c.a.a(string);
                    }
                    if (cVar == null) {
                        cVar = wkmVar.c;
                    }
                    e = io.reactivex.rxjava3.core.x.e(new io.reactivex.rxjava3.internal.operators.single.r(a1wVar.C(wkmVar, new skm(cVar2, cVar, Source.CACHE)), new q9(new cj1(i7), i6)), new io.reactivex.rxjava3.internal.operators.single.r(a1wVar.C(wkmVar, new skm(cVar2, cVar, Source.ACTUAL)), new q9(new cj1(i7), i6)));
                }
                return new io.reactivex.rxjava3.internal.operators.observable.v0(e);
            case 7:
                j170 j170Var = (j170) obj;
                ((awq) obj2).i();
                return j170Var;
            case 8:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkAuthPasswordView vkAuthPasswordView = ((zop) obj2).v;
                (vkAuthPasswordView != null ? vkAuthPasswordView : null).setPasswordTransformationEnabled(booleanValue);
                return s3q0.a;
            case 9:
                final v0r v0rVar = (v0r) obj2;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, new jai(1308177257, new wwq(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-2058228640, new ywq(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-585950047, new m0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(886328546, new t67(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1936360157, new lo1(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-464081564, new w9a(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(1008197029, new n0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1814491674, new o0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-342213081, new p0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1130065512, new xs2(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-292236766, new x9a(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(1180041827, new vvq(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1642646876, new t26(v0rVar, i3), true), 3);
                nvy.g(nvyVar, null, null, new jai(-170368283, new hx9(v0rVar, i3), true), 3);
                nvy.g(nvyVar, null, null, new jai(1301910310, new yzs() { // from class: xsna.r0r
                    @Override // xsna.yzs
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1301910310, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:127)");
                            }
                            v0r.this.k(0, aVar);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                nvy.g(nvyVar, null, null, new jai(-1520778393, new s0r(v0rVar, 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-48499800, new t0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(1423778793, new u0r(v0rVar, z ? 1 : 0), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1398909910, new vog(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, new jai(73368683, new xwq(v0rVar, 1), true), 3);
                nvy.g(nvyVar, null, null, new jai(-1896240639, new com.vk.libvideo.design.compose.base.datacontent.presets.a(v0rVar, i2), true), 3);
                nvy.g(nvyVar, null, null, new jai(-423962046, new ini(v0rVar, i3), true), 3);
                nvy.g(nvyVar, null, null, new jai(1048316547, new zwq(v0rVar, i4), true), 3);
                nvy.g(nvyVar, null, null, rfi.a, 3);
                return s3q0.a;
            case 10:
                ViewGroup viewGroup = (ViewGroup) obj;
                return new s0s(tf3.b(viewGroup, R.layout.vkim_folders_create_promo_vh, viewGroup, false), ((a0s) obj2).h);
            case 11:
                ((p1s.g) ((p1s) obj2)).getClass();
                throw null;
            case 12:
                return new w3s.a(((tj50.a) obj).a(new n3s(1, ((o3s) obj2).d, i3s.class, "toViewState", "toViewState(Lcom/vk/friends/impl/followers/domain/FollowersListState$Content;)Lcom/vk/friends/impl/followers/presentation/FollowersListViewState$FollowersList;", 0), ao8.d));
            case 13:
                evs evsVar = (evs) obj2;
                lcx lcxVar = evsVar.q;
                if (lcxVar != null && (f = lcxVar.f()) != null) {
                    videoTechBugreportData = w7o0.b(f, VideoTechBugreportData.VideoType.INTERACTIVE);
                }
                if (videoTechBugreportData != null) {
                    evsVar.y().bk(new qjj0(videoTechBugreportData));
                }
                return s3q0.a;
            case 14:
                fws fwsVar = (fws) obj2;
                if (((String) obj).length() > 0 && ((Boolean) fwsVar.j.invoke()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 15:
                ((wot) obj2).a.o(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 16:
                ((cvh) obj2).invoke((Throwable) obj);
                return s3q0.a;
            case 17:
                int i8 = com.vk.attachpicker.impl.graffiti.presentation.a.f1;
                ((com.vk.attachpicker.impl.graffiti.presentation.a) obj2).hide();
                return s3q0.a;
            case 18:
                DialogExt dialogExt = (DialogExt) obj;
                ((fhu) obj2).getClass();
                Dialog Cb = dialogExt.Cb();
                ProfilesInfo profilesInfo = dialogExt.b;
                GroupCallInProgress Ob = Cb != null ? Cb.Ob() : null;
                if ((Ob != null ? Ob.c : null) == null || Cb.Nb()) {
                    return chu.a.a;
                }
                ProfilesSimpleInfo Ob2 = profilesInfo.Ob();
                List<Long> list = Ob.b;
                return new chu.b(Cb, rli0.A(rli0.y(new ulp0(new i5g(list), new fm0(Ob2, 10)), 3)), list.size(), Ob.c, Ob.d);
            case 19:
                return new ovw((ViewGroup) obj, (xmm) obj2);
            case 20:
                com.vk.voip.ui.notifications.incoming.b bVar2 = (com.vk.voip.ui.notifications.incoming.b) obj2;
                CompanionApp.State state = (CompanionApp.State) obj;
                int i9 = state == null ? -1 : b.d.$EnumSwitchMapping$0[state.ordinal()];
                if (i9 == 1) {
                    bVar2.m = true;
                } else if (i9 == 2) {
                    bVar2.m = false;
                }
                return s3q0.a;
            case 21:
                wzx wzxVar = (wzx) obj2;
                ((gvw0) wzxVar.i.getValue()).g(new xsw(wzxVar, i3), null);
                return s3q0.a;
            case 22:
                ((Bundle) obj).putParcelable("screenData", (LibverifyScreenData) obj2);
                return s3q0.a;
            case 23:
                L.i((Throwable) obj);
                ((File) obj2).delete();
                return s3q0.a;
            case 24:
                ((uv00) obj2).c.onNext((MarketBridgeCategory) obj);
                return s3q0.a;
            case 25:
                int i10 = MarketItemCommentsFragment.j0;
                ((MarketItemCommentsFragment) obj2).fo(MarketItemCommentsFragment.b.ERROR);
                return s3q0.a;
            case 26:
                return new q410((ViewGroup) obj, ((l610) obj2).i);
            case 27:
                ((f810) obj2).T((p810.c) obj);
                return s3q0.a;
            case 28:
                ProgressDialog progressDialog = (ProgressDialog) obj2;
                int i11 = MasksWrap.e0;
                if (progressDialog != null && progressDialog.isShowing()) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj2;
                long currentTimeMillis = System.currentTimeMillis();
                L.e("MlEnhanceDebug", "Upload and ml time: " + (currentTimeMillis - ref$LongRef.element) + ". Result image: " + ((String) obj));
                ref$LongRef.element = currentTimeMillis;
                return s3q0.a;
        }
    }

    public /* synthetic */ f1j(m1s m1sVar, p1s p1sVar) {
        this.b = 11;
        this.c = p1sVar;
    }
}
