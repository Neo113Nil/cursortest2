package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.catalog.mvi.block.impl.filters.HorizontalFiltersWithScrollView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemSliderVh;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.log.L;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.domain.PostingContentType;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.pushes.PushOpenActivity;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.superapp.browser.internal.commands.controller.VkUiCommand;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.chromium.base.version_info.VersionConstants;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.b4;
import xsna.d8a0;
import xsna.dg70;
import xsna.hi5;
import xsna.i3x0;
import xsna.ise;
import xsna.jte;
import xsna.rir0;
import xsna.wc30;
import xsna.xa60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ew3 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ew3(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:287:0x06b9, code lost:
    
        if (r11.equals("video_fullscreen_landscape") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06c3, code lost:
    
        if (r4 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06c5, code lost:
    
        r7 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06c7, code lost:
    
        if (r7 != null) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x06c9, code lost:
    
        r7 = "button";
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06c0, code lost:
    
        if (r11.equals("video_fullscreen_portrait") == false) goto L274;
     */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06f1  */
    /* JADX WARN: Type inference failed for: r1v157, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v22, types: [com.vk.core.fragments.FragmentImpl, xsna.bfg] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        String str2;
        io.reactivex.rxjava3.subjects.d<VideoMinimizableState> b3;
        ovv0 J;
        dvv0 a;
        int i = this.b;
        int i2 = 0;
        r3 = null;
        r3 = null;
        xa60.a aVar = null;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                gw3 gw3Var = (gw3) obj2;
                L.e("AsrRecordListenerProxyImpl", fw3.d(gw3Var.a, new StringBuilder("asrRecordListeners: ")));
                gw3Var.a.remove((l19) obj);
                return s3q0.a;
            case 1:
                q75 q75Var = (q75) obj2;
                b4.c.h hVar = (b4.c.h) ((b4.c) obj);
                lzh0 lzh0Var = q75Var.d;
                yks0 yks0Var = q75Var.b;
                o25.a().getClass();
                ows0 ows0Var = q75Var.e;
                VideoMinimizableState P0 = (ows0Var == null || (b3 = ows0Var.b3()) == null) ? null : b3.P0();
                if (hVar == null || (str = hVar.a) == null) {
                    str = P0 instanceof VideoMinimizableState.Expanded ? "video_discovery" : P0 instanceof VideoMinimizableState.FullscreenHorizontal ? "video_fullscreen_landscape" : P0 instanceof VideoMinimizableState.FullscreenVertical ? "video_fullscreen_portrait" : null;
                }
                if (str != null) {
                    int hashCode = str.hashCode();
                    if (hashCode == -1701312037) {
                        break;
                    } else if (hashCode == -902861701) {
                        break;
                    } else if (hashCode == 1922070252 && str.equals("video_discovery") && hVar != null) {
                        String str3 = hVar.c;
                        str2 = str3;
                        if (yks0Var.e.U()) {
                            String str4 = str;
                            Context context = q75Var.a;
                            UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                            String a2 = uiTrackingScreen != null ? com.vk.stat.scheme.t0.a(uiTrackingScreen.a) : null;
                            if (a2 == null) {
                                a2 = "";
                            }
                            String M4 = yks0Var.e.M4();
                            fjs0 fjs0Var = q75Var.g;
                            yks0.k(yks0Var, context, false, str4, str2, null, null, null, zm00.f(fjs0Var != null ? fjs0Var.a : null, a2, M4), new hn0(1, hVar, q75Var), 112);
                            if (lzh0Var != null) {
                                lzh0Var.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SUBSCRIBE_OUT, yks0Var.e.r());
                            }
                        } else {
                            yks0.l(yks0Var, q75Var.a, str, str2, null, null, new k75(i2, hVar, q75Var), 48);
                            if (lzh0Var != null) {
                                lzh0Var.b(MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.UNSUBSCRIBE_OUT, yks0Var.e.r());
                            }
                        }
                        return s3q0.a;
                    }
                }
                str2 = null;
                if (yks0Var.e.U()) {
                }
                return s3q0.a;
            case 2:
                ((yg5) obj2).T((hi5.a) obj);
                return s3q0.a;
            case 3:
                bzd bzdVar = (bzd) obj2;
                cxd cxdVar = bzdVar.e.k;
                ((fo50) obj).I();
                if (bzdVar.j() != null) {
                    boolean z = bzdVar.b.b.f;
                }
                bzdVar.d.b(0, null);
                return s3q0.a;
            case 4:
                mdg mdgVar = (mdg) obj2;
                iag iagVar = (iag) obj;
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(yfb.x(((bs) mdgVar.a0.getValue()).j(iagVar.getUid(), null)), null, null, 3);
                ?? r1 = mdgVar.e;
                io.reactivex.rxjava3.core.q m = hg1.m(y0, r1.getContext(), 0L, false, 62);
                vcg vcgVar = new vcg(mdgVar, iagVar, i2);
                int i3 = 11;
                r1.a(m.subscribe(new qz(vcgVar, i3), new sv(new sm(i3), 18)));
                return s3q0.a;
            case 5:
                znh znhVar = (znh) obj2;
                f8h f8hVar = (f8h) obj;
                ww50 v = s200.v(znhVar.a);
                if (v != null) {
                    v.H(f8hVar);
                }
                znhVar.b = null;
                return s3q0.a;
            case 6:
                ((izs) obj2).invoke(new jte.e(((ise.b) obj).a));
                return s3q0.a;
            case 7:
                return ((sal) obj2).a + "-jobs-pool[" + ((AtomicInteger) obj).getAndIncrement() + ']';
            case 8:
                return new h9x(n34.A(((wco0) obj2).U((tny) ((gzs) obj).invoke())));
            case 9:
                ((f6s) obj2).o7(((q6s) obj).g0);
                return s3q0.a;
            case 10:
                ((izs) obj2).invoke(new HorizontalFiltersWithScrollView.a.c(((HorizontalFiltersWithScrollView.f) obj).b));
                return s3q0.a;
            case 11:
                String str5 = (String) obj;
                fvv0 M = ((q5y) obj2).a.M();
                if (M != null && (J = M.J()) != null && (a = J.a(VkUiCommand.OPEN_VMOJI_CAPTURE)) != null) {
                    a.a(str5);
                }
                return s3q0.a;
            case 12:
                ((z520) obj2).c((Photo) obj, false);
                return s3q0.a;
            case 13:
                ModalAuthHostActivity modalAuthHostActivity = (ModalAuthHostActivity) obj;
                List<String> list = ModalAuthHostActivity.h;
                if (((Ref$BooleanRef) obj2).element) {
                    modalAuthHostActivity.finish();
                }
                return s3q0.a;
            case 14:
                ((izs) obj2).invoke(new wc30.c(((fd30) obj).b));
                return s3q0.a;
            case 15:
                ((h7f0) obj2).u((lm50) ((Ref$ObjectRef) obj).element);
                return s3q0.a;
            case 16:
                NewsfeedExternalAction newsfeedExternalAction = (NewsfeedExternalAction) obj2;
                ii60 ii60Var = (ii60) obj;
                if (newsfeedExternalAction instanceof NewsfeedExternalAction.c) {
                    NewsfeedExternalAction.c cVar = (NewsfeedExternalAction.c) newsfeedExternalAction;
                    if (!(cVar instanceof NewsfeedExternalAction.c.a)) {
                        if (cVar instanceof NewsfeedExternalAction.c.r) {
                            ii60Var.a().e(100, ((NewsfeedExternalAction.c.r) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.w) {
                            ii60Var.a().e(152, cVar);
                        } else if (cVar instanceof NewsfeedExternalAction.c.x) {
                            NewsfeedExternalAction.c.x xVar = (NewsfeedExternalAction.c.x) cVar;
                            ii60Var.a().e(135, new Pair(xVar.a, xVar.b));
                        } else if (cVar instanceof NewsfeedExternalAction.c.f0) {
                            ii60Var.a().e(101, ((NewsfeedExternalAction.c.f0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.u) {
                            ii60Var.a().e(103, ((NewsfeedExternalAction.c.u) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.m) {
                            ii60Var.a().e(105, ((NewsfeedExternalAction.c.m) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.b0) {
                            ii60Var.a().e(141, ((NewsfeedExternalAction.c.b0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.b) {
                            p870 a3 = ii60Var.a();
                            Post post = ((NewsfeedExternalAction.c.b) cVar).a;
                            a3.e(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, post);
                            if (post.gc()) {
                                ArrayList<EntryAttachment> arrayList = post.z;
                                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                                Iterator<T> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(((EntryAttachment) it.next()).b);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                Iterator it2 = arrayList2.iterator();
                                while (it2.hasNext()) {
                                    Object next = it2.next();
                                    if (next instanceof VideoAttachment) {
                                        arrayList3.add(next);
                                    }
                                }
                                Iterator it3 = arrayList3.iterator();
                                while (it3.hasNext()) {
                                    wjs0.a(new fyr0(((VideoAttachment) it3.next()).k));
                                }
                            }
                        } else if (cVar instanceof NewsfeedExternalAction.c.e0) {
                            p870 a4 = ii60Var.a();
                            Post post2 = ((NewsfeedExternalAction.c.e0) cVar).a;
                            a4.e(125, post2);
                            if (post2.gc()) {
                                ArrayList<EntryAttachment> arrayList4 = post2.z;
                                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                                Iterator<T> it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    arrayList5.add(((EntryAttachment) it4.next()).b);
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it5 = arrayList5.iterator();
                                while (it5.hasNext()) {
                                    Object next2 = it5.next();
                                    if (next2 instanceof VideoAttachment) {
                                        arrayList6.add(next2);
                                    }
                                }
                                Iterator it6 = arrayList6.iterator();
                                while (it6.hasNext()) {
                                    wjs0.a(new fyr0(((VideoAttachment) it6.next()).k));
                                }
                            }
                        } else if (cVar instanceof NewsfeedExternalAction.c.d0) {
                            ii60Var.a().e(134, ((NewsfeedExternalAction.c.d0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.e) {
                            NewsfeedExternalAction.c.e eVar = (NewsfeedExternalAction.c.e) cVar;
                            UserId userId = eVar.b;
                            Integer num = eVar.c;
                            Integer num2 = eVar.d;
                            if (userId != null && num != null && num2 != null) {
                                aVar = new xa60.a(userId, num.intValue(), num2.intValue());
                            }
                            ii60Var.a().e(147, new xa60(eVar.a, aVar, eVar.e));
                        } else if (cVar instanceof NewsfeedExternalAction.c.f) {
                            ii60Var.a().e(VersionConstants.PRODUCT_MAJOR_VERSION, Boolean.valueOf(((NewsfeedExternalAction.c.f) cVar).a));
                        } else if (cVar instanceof NewsfeedExternalAction.c.g) {
                            ii60Var.a().e(128, ((NewsfeedExternalAction.c.g) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.h) {
                            ii60Var.a().e(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, ((NewsfeedExternalAction.c.h) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.i) {
                            ii60Var.a().e(130, ((NewsfeedExternalAction.c.i) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.j) {
                            ii60Var.a().e(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, ((NewsfeedExternalAction.c.j) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.k) {
                            ii60Var.a().e(144, ((NewsfeedExternalAction.c.k) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.l) {
                            NewsfeedExternalAction.c.l lVar = (NewsfeedExternalAction.c.l) cVar;
                            ii60Var.a().e(Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, new zeg(lVar.c, lVar.b, lVar.a));
                        } else if (cVar instanceof NewsfeedExternalAction.c.q) {
                            ii60Var.a().e(143, ((NewsfeedExternalAction.c.q) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.s) {
                            ii60Var.a().e(129, ((NewsfeedExternalAction.c.s) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.t) {
                            ii60Var.a().e(Sdk.SDKError.Reason.TPAT_ERROR_VALUE, ((NewsfeedExternalAction.c.t) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.v) {
                            ii60Var.a().e(145, ((NewsfeedExternalAction.c.v) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.a0) {
                            ii60Var.a().e(139, ((NewsfeedExternalAction.c.a0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.g0) {
                            ii60Var.a().e(ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED, ((NewsfeedExternalAction.c.g0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.h0) {
                            ii60Var.a().e(120, ((NewsfeedExternalAction.c.h0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.i0) {
                            ii60Var.a().e(111, ((NewsfeedExternalAction.c.i0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.j0) {
                            ii60Var.a().e(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, ((NewsfeedExternalAction.c.j0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.l0) {
                            ii60Var.a().d(113, 100, ((NewsfeedExternalAction.c.l0) cVar).a);
                        } else if (cVar instanceof NewsfeedExternalAction.c.k0) {
                            ii60Var.a().e(113, ((NewsfeedExternalAction.c.k0) cVar).a);
                        } else if (!(cVar instanceof NewsfeedExternalAction.c.z) && !(cVar instanceof NewsfeedExternalAction.c.n) && !(cVar instanceof NewsfeedExternalAction.c.o) && !(cVar instanceof com.vk.newsfeed.presentation.model.actions.a) && !(cVar instanceof NewsfeedExternalAction.c.p) && !(cVar instanceof NewsfeedExternalAction.c.y) && !(cVar instanceof NewsfeedExternalAction.c.d) && !(cVar instanceof NewsfeedExternalAction.c.InterfaceC1439c) && !(cVar instanceof NewsfeedExternalAction.c.c0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else if (newsfeedExternalAction instanceof NewsfeedExternalAction.d) {
                    NewsfeedExternalAction.d dVar = (NewsfeedExternalAction.d) newsfeedExternalAction;
                    if (dVar instanceof NewsfeedExternalAction.d.c) {
                        ii60Var.a().e(104, ((NewsfeedExternalAction.d.c) dVar).a);
                    }
                }
                return s3q0.a;
            case 17:
                ((izs) obj2).invoke(new sf70(((dg70.l) obj).a));
                return s3q0.a;
            case 18:
                ((c8a0) obj2).f.invoke(new a.s.f(d8a0.b.g.d, (Photo) obj));
                return s3q0.a;
            case 19:
                ((izs) obj2).invoke((PostingContentType) obj);
                return s3q0.a;
            case 20:
                jjc.a(new ag1(14, (RadioStationCellVh) obj2, (UIBlock) obj));
                return s3q0.a;
            case 21:
                ((cjx) obj2).b((ajx) obj);
                return s3q0.a;
            case 22:
                ((izs) obj2).invoke(((hze) obj).a);
                return s3q0.a;
            case 23:
                rkq0 rkq0Var = (rkq0) obj2;
                Context context2 = ((View) obj).getContext();
                UserId userId2 = rkq0Var.i;
                gzs<s3q0> gzsVar = rkq0Var.g;
                izs<? super rfd0, s3q0> izsVar = rkq0Var.h;
                rkq0Var.i = userId2;
                rkq0Var.g = gzsVar;
                rkq0Var.h = izsVar;
                WeakReference<View> weakReference = rkq0Var.k;
                View view = weakReference != null ? weakReference.get() : null;
                if (view == null) {
                    view = rkq0Var.e(context2);
                    rkq0Var.k = new WeakReference<>(view);
                }
                rkq0Var.a(view, new kn0(rkq0Var, 5), new qhg0(rkq0Var, 16));
                return s3q0.a;
            case 24:
                Context context3 = (Context) obj2;
                rir0 rir0Var = (rir0) obj;
                int i4 = PushOpenActivity.f;
                String str6 = rir0Var.l;
                rir0.a aVar2 = rir0Var.x;
                Intent a5 = PushOpenActivity.a.a(str6, context3, "validate_device", aVar2.a("type"), aVar2.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar2.a("need_track_interaction"));
                i35 i35Var = i35.c;
                a5.setAction(String.valueOf(i35Var.e()));
                a5.putExtra("url", aVar2.m);
                a5.putExtra("device_token", aVar2.n);
                a5.putExtra("target_user_id", aVar2.k);
                return t2i0.a(context3, i35Var.e(), a5, 167772160);
            case 25:
                return ((s290) ((VideoItemSliderVh) obj2).U.getValue()).a(((VideoFile) obj).w2());
            case 26:
                return Integer.valueOf(((ecr) ((nuz) obj2).b.a.get(((set0) ((zak0) ((tet0) obj).m).getValue()).e())).a());
            case 27:
                ((mov0) obj2).h(VkAppsErrors.Client.USER_DENIED);
                ((io.reactivex.rxjava3.subjects.d) obj).onComplete();
                return s3q0.a;
            case 28:
                h5x0 h5x0Var = (h5x0) obj2;
                lqw0 lqw0Var = h5x0Var.t;
                ((i3x0.e) ((i5x0) obj).e.getValue()).a();
                lqw0Var.getClass();
                g2v.c().getClass();
                cpk cpkVar = (cpk) h5x0Var.w.getValue();
                tnw0 tnw0Var = h5x0Var.d;
                n4u0 n4u0Var = h5x0Var.u;
                UserId a6 = tnw0Var.d().a();
                n4u0Var.getClass();
                return new sg10(cpkVar, new d80(a6));
            default:
                mrq mrqVar = new mrq();
                mrqVar.F(fkq0.e((UserId) obj2), "group_id");
                mrqVar.C(((hbx0) obj).a, "notification_id");
                rsg0.T(mrqVar).subscribe();
                return s3q0.a;
        }
    }

    public /* synthetic */ ew3(kbx0 kbx0Var, UserId userId, hbx0 hbx0Var) {
        this.b = 29;
        this.c = userId;
        this.d = hbx0Var;
    }
}
