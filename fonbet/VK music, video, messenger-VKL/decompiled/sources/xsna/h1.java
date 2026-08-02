package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.wall.dto.WallRestoreThreadResponseDto;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.debug.design.MockType;
import com.vk.dto.common.Source;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.lists.ListDataSet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.fragment.impl.MusicAddTrackToPlaylistLauncherImpl;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.newsfeed.posting.impl.domain.model.PostPrivacyData;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stickers.keyboard.navigation.KeyboardNavigationVmojiPackItem;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.presentation.about.AboutAppFragment;
import com.vk.voip.ui.auth.CallsBridgeTrampolineActivity;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.cwb0;
import xsna.gam;
import xsna.gfc0;
import xsna.i9d;
import xsna.ikv0;
import xsna.lze;
import xsna.o0r0;
import xsna.o2d0;
import xsna.xn50;
import xsna.z1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0266, code lost:
    
        if (com.vk.permission.PermissionHelper.o(r2.requireContext()) == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v34, types: [xsna.e5z, xsna.f9d] */
    /* JADX WARN: Type inference failed for: r3v38, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    /* JADX WARN: Type inference failed for: r3v92, types: [T, java.lang.Object, xsna.gzs] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        sd90 sd90Var;
        String str = "";
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.b) {
            case 0:
                AboutAppFragment aboutAppFragment = (AboutAppFragment) this.c;
                g1 g1Var = (g1) this.d;
                z1 z1Var = (z1) obj;
                qcy<Object>[] qcyVarArr = AboutAppFragment.X;
                if (z1Var instanceof z1.a) {
                    aboutAppFragment.finish();
                } else if (z1Var instanceof z1.f) {
                    rex0 rex0Var = e370.j;
                    (rex0Var != null ? rex0Var : null).c(aboutAppFragment.requireContext(), ((z1.f) z1Var).a);
                } else if (z1Var instanceof z1.d) {
                    rex0 rex0Var2 = e370.j;
                    rex0 rex0Var3 = rex0Var2 != null ? rex0Var2 : null;
                    rex0Var3.c(aboutAppFragment.requireContext(), "https://" + a0a.d + "/club" + ((z1.d) z1Var).a);
                } else if (z1Var instanceof z1.c) {
                    ApiApplication apiApplication = (ApiApplication) aboutAppFragment.S.getValue();
                    if (apiApplication != null) {
                        apiApplication.c0 = Boolean.FALSE;
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                        Context requireContext = aboutAppFragment.requireContext();
                        WebApiApplication c = chx0.c(apiApplication);
                        String str2 = (String) aboutAppFragment.T.getValue();
                        if (str2 == null) {
                            String str3 = apiApplication.G;
                            if (str3 != null) {
                                str = str3;
                            }
                        } else {
                            str = str2;
                        }
                        SuperappUiRouterBridge.b.b(superappUiRouterBridge2, requireContext, c, new nex0(str, (String) aboutAppFragment.U.getValue()), null, null, null, null, 248);
                        vbs Ln = aboutAppFragment.Ln();
                        if (Ln == null || Ln.p() != 1) {
                            aboutAppFragment.finish();
                        } else {
                            u1u0.f(150L, new o1(aboutAppFragment, z ? 1 : 0));
                        }
                    }
                } else if (z1Var instanceof z1.b) {
                    Context requireContext2 = aboutAppFragment.requireContext();
                    ikv0.a aVar = new ikv0.a(requireContext2);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
                    aVar.u = new ikv0.d(requireContext2.getString(R.string.apps_about_unverified_loading_error_message), (String) null, (ikv0.d.a) null, 6);
                    aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext2.getString(R.string.retry), new p1(g1Var, z ? 1 : 0));
                    aVar.o = Integer.valueOf(iah0.a(16));
                    pkv0.f(aVar);
                } else {
                    if (!(z1Var instanceof z1.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z1.e eVar = (z1.e) z1Var;
                    List<z3> list = eVar.b;
                    ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                    for (z3 z3Var : list) {
                        ((y1) aboutAppFragment.V.getValue()).getClass();
                        arrayList.add(new WebImage((List<WebImageSize>) Collections.singletonList(new WebImageSize(z3Var.a, z3Var.c, z3Var.b, (char) 0, false, null, 56, null))));
                    }
                    SuperappUiRouterBridge superappUiRouterBridge3 = e370.d;
                    (superappUiRouterBridge3 != null ? superappUiRouterBridge3 : null).n0(eVar.a, arrayList);
                }
                return s3q0.a;
            case 1:
                ((sg50) this.c).c((o2d0.a) this.d);
                return s3q0.a;
            case 2:
                fh5.k0((fh5) this.c, (Activity) this.d, null, null, (VideoFile) obj, false, false, 112);
                return s3q0.a;
            case 3:
                Context context = (Context) this.c;
                UserId userId = (UserId) this.d;
                if (((Boolean) obj).booleanValue()) {
                    int i2 = CallsBridgeTrampolineActivity.b;
                    bc6 L = xa4.L(context);
                    Intent intent = new Intent(context.getApplicationContext(), (Class<?>) CallsBridgeTrampolineActivity.class);
                    intent.setAction("open_profile");
                    intent.putExtra("user_id", userId);
                    L.E(intent);
                } else {
                    ((ImBridgeComponent) ((k7m) m7m.f(com.vk.voip.ui.c.b)).a(fpf0.a(ImBridgeComponent.class))).g5().d().m(context.getApplicationContext(), userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                }
                return s3q0.a;
            case 4:
                f5z f5zVar = (f5z) this.c;
                final izs izsVar = (izs) this.d;
                ?? r3 = new androidx.lifecycle.l() { // from class: xsna.f9d
                    @Override // androidx.lifecycle.l
                    public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                        int i3 = i9d.b.$EnumSwitchMapping$0[event.ordinal()];
                        if (i3 == 1 || i3 == 2) {
                            izs.this.invoke(lze.g.b);
                        }
                    }
                };
                f5zVar.getLifecycle().addObserver(r3);
                return new i9d.a(f5zVar, r3);
            case 5:
                mdg mdgVar = (mdg) this.c;
                iag iagVar = (iag) this.d;
                if (((WallRestoreThreadResponseDto) obj).d()) {
                    ?? r32 = mdgVar.e;
                    ListDataSet<cbg> listDataSet = mdgVar.K;
                    int size = listDataSet.d.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            cbg c2 = listDataSet.c(i3);
                            if (c2 != null) {
                                iag iagVar2 = c2.a;
                                if (iagVar2 instanceof NewsComment) {
                                    NewsComment newsComment = (NewsComment) iagVar2;
                                    if (newsComment.i == iagVar.getId()) {
                                        newsComment.v = false;
                                        ArrayList V2 = mdgVar.V2(newsComment);
                                        listDataSet.A(i3);
                                        listDataSet.y(i3, V2);
                                        r32.bm(iagVar.getId());
                                        r32.Rb(i3);
                                        if (!mdgVar.x7() && (sd90Var = mdgVar.Q) != null) {
                                            sd90Var.i();
                                        }
                                        mdgVar.d8(iagVar);
                                    }
                                } else {
                                    continue;
                                }
                            }
                            i3++;
                        }
                    }
                }
                return s3q0.a;
            case 6:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                ndr0 ndr0Var = (ndr0) this.d;
                Location location = (Location) obj;
                CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
                ver0.c(communityAddressesFragment.requireContext(), (gVar != null ? gVar : null).f().subscribe(new ir0(new sy4(communityAddressesFragment, ndr0Var, location, i), 8)));
                return s3q0.a;
            case 7:
                return ((qwg) this.c).a((UserId) this.d);
            case 8:
                Context context2 = (Context) this.c;
                vmh vmhVar = (vmh) this.d;
                ExtendedUserProfile.a aVar2 = ((ExtendedCommunityProfile) obj).S1;
                String str4 = aVar2 != null ? aVar2.a : null;
                if (str4 == null || drm0.N(str4)) {
                    return null;
                }
                return new s4m(context2.getString(R.string.profile_aplus_details_title), R.drawable.vk_icon_blogger_mark_10k_outline_20, VkMiniInfoCell.Mode.Link, new ozf(vmhVar, 4), null, null, null, null, 4068);
            case 9:
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.c;
                gzs gzsVar = (gzs) this.d;
                extendedCommunityProfile.d3 = ExtendedCommunityProfile.e.b.a;
                gzsVar.invoke();
                return s3q0.a;
            case 10:
                ((izs) this.c).invoke(uu20.a((uu20) this.d, null, MockType.TEXT, (String) obj, "", null, 17));
                return s3q0.a;
            case 11:
                gam gamVar = (gam) this.c;
                List<fam> list2 = (List) this.d;
                SQLiteStatement compileStatement = ((e0w) obj).compileStatement(gamVar.a.e());
                for (fam famVar : list2) {
                    compileStatement.clearBindings();
                    compileStatement.bindString(gam.a.NAME.h(), famVar.a);
                    compileStatement.bindString(gam.a.HASH.h(), famVar.b);
                    compileStatement.bindString(gam.a.LIGHT_URI.h(), famVar.c.toString());
                    compileStatement.bindString(gam.a.DARK_URI.h(), famVar.d.toString());
                    compileStatement.bindLong(gam.a.IS_HIDDEN.h(), famVar.i ? 1L : 0L);
                    compileStatement.bindLong(gam.a.UPDATE_TIME.h(), famVar.f);
                    compileStatement.bindString(gam.a.LIGHT_THEME_DATA.h(), famVar.g);
                    compileStatement.bindString(gam.a.DARK_THEME_DATA.h(), famVar.h);
                    compileStatement.bindLong(gam.a.SORT.h(), famVar.e);
                    compileStatement.executeInsert();
                }
                return s3q0.a;
            case 12:
                return jlr.F6((jlr) this.c, (View) this.d, (Throwable) obj);
            case 13:
                g22 g22Var = (g22) this.c;
                yls ylsVar = (yls) this.d;
                UserId userId2 = (UserId) obj;
                MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType eventType = MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_GIFTS_SHOP;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("friends_birthdays_modal", eventType, Long.valueOf(userId2.b)), 3);
                iid0Var.f = c3;
                iid0Var.g = b;
                iid0Var.q();
                g22Var.invoke(Collections.singletonList(userId2));
                dw20 dw20Var = ylsVar.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 14:
                FrameLayout frameLayout = (FrameLayout) this.c;
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.d;
                int i4 = GalleryFragmentImpl.R0;
                if (((Boolean) obj).booleanValue()) {
                    if (galleryFragmentImpl.y0) {
                        PermissionHelper permissionHelper = PermissionHelper.a;
                        Context requireContext3 = galleryFragmentImpl.requireContext();
                        permissionHelper.getClass();
                        if (!PermissionHelper.b(requireContext3, PermissionHelper.e)) {
                            break;
                        }
                    }
                    z = true;
                }
                bwt0.p0(frameLayout, z);
                return s3q0.a;
            case 15:
                bst bstVar = (bst) this.c;
                Context context3 = (Context) this.d;
                Throwable th = (Throwable) obj;
                r6y r6yVar = bstVar.b;
                if (r6yVar != null) {
                    JsApiMethodType jsApiMethodType = JsApiMethodType.GET_WORKOUTS;
                    JSONObject put = new JSONObject().put("extra_native_description", th.getMessage());
                    ((x1w0) bstVar.h.getValue()).getClass();
                    r6yVar.A(jsApiMethodType, put.put("health_connect_version", x1w0.a(context3, "com.google.android.apps.healthdata")));
                }
                return s3q0.a;
            case 16:
                return ((fhu) this.c).a(((DialogExt) this.d).e, Source.CACHE);
            case 17:
                ((GroupVh) this.c).q((View) obj, (Group) this.d);
                return s3q0.a;
            case 18:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.c;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.d;
                zk10 zk10Var = (zk10) obj;
                if (ref$IntRef.element == -1) {
                    ref$IntRef.element = zk10Var.c().b;
                }
                ref$IntRef2.element = zk10Var.c().c + 1;
                return "";
            case 19:
                p7w p7wVar = (p7w) this.c;
                q7w q7wVar = (q7w) this.d;
                ((Boolean) obj).getClass();
                m7w m7wVar = p7wVar.m;
                if (m7wVar != null) {
                    ArrayList<hfz> arrayList2 = q7wVar.b;
                    AtomicBoolean atomicBoolean = m7wVar.e;
                    if (!atomicBoolean.get()) {
                        if (!m7wVar.b()) {
                            m7wVar.a();
                        } else if (!arrayList2.isEmpty()) {
                            for (hfz hfzVar : arrayList2) {
                                if ((hfzVar instanceof zfm) || (hfzVar instanceof j0b)) {
                                    ((jtm) m7wVar.c.invoke()).a();
                                    atomicBoolean.set(true);
                                }
                            }
                        }
                    }
                }
                p7wVar.b();
                return s3q0.a;
            case 20:
                ((com.vk.stickers.keyboard.navigation.g) this.c).l.a(((KeyboardNavigationVmojiPackItem) this.d).b.b);
                return s3q0.a;
            case 21:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                izs izsVar2 = (izs) this.d;
                ?? r33 = (gzs) obj;
                gzs gzsVar2 = (gzs) ref$ObjectRef.element;
                if (gzsVar2 != null) {
                    gzsVar2.invoke();
                }
                izsVar2.invoke(r33);
                ref$ObjectRef.element = r33;
                return s3q0.a;
            case 22:
                ((yh00) this.c).l.a(((xh00) this.d).b);
                return s3q0.a;
            case 23:
                MusicAddTrackToPlaylistLauncherImpl musicAddTrackToPlaylistLauncherImpl = (MusicAddTrackToPlaylistLauncherImpl) this.c;
                Activity activity = (Activity) this.d;
                Throwable th2 = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{ms9.b("error: ", th2)});
                }
                musicAddTrackToPlaylistLauncherImpl.d(activity).a(th2);
                return s3q0.a;
            case 24:
                ((hs50) this.c).d7((View) obj, (cjx) this.d, "DEFAULT", 3);
                return s3q0.a;
            case 25:
                jw60 jw60Var = (jw60) this.c;
                iw60 iw60Var = (iw60) this.d;
                jw60Var.c.a(iw60Var.f, iw60Var.c, iw60Var.d, iw60Var.a, iw60Var.i);
                return s3q0.a;
            case 26:
                ((tgp0) obj).j((bgk0) this.c, (ur4) this.d);
                return s3q0.a;
            case 27:
                ((bzb0) this.c).c((cwb0.s0) this.d, new n7w((io.reactivex.rxjava3.disposables.c) obj, 21));
                return s3q0.a;
            case 28:
                Uri uri = (Uri) this.c;
                Uri uri2 = (Uri) this.d;
                gfc0.b bVar = (gfc0.b) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"Copying from " + uri + " to " + uri2 + " finished with result: " + bVar.b});
                }
                return s3q0.a;
            default:
                xn50.a.c(((rhc0) this.c).c, new PostingAction.Editing.PrivacySettingsChanged(PostPrivacyData.a((PostPrivacyData) this.d, null, null, (Date) obj, null, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE)));
                return s3q0.a;
        }
    }

    public /* synthetic */ h1(kw70 kw70Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 26;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
