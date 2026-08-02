package xsna;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.view.ViewGroup;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.screendata.CreateVkEmailRequiredData;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog.mvi.section.ui.entity.CatalogSectionState;
import com.vk.clips.design.view.editor.CorrectionView;
import com.vk.core.serialize.Serializer;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.clips.filters.CorrectionsInfo;
import com.vk.dto.clips.filters.FilterInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.VKList;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.PlainAddress;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.e;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.design.view.pagination.DialogPinView;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.log.L;
import com.vk.metrics.logging.PerfLogger;
import com.vk.money.createtransfer.people.CreatePeopleTransferFragment;
import com.vk.money.createtransfer.people.CreatePeopleTransferPresenter;
import com.vk.newsfeed.api.data.NewsfeedGetResponse;
import com.vk.photo.editor.ivm.EditorState;
import com.vk.photo.editor.ivm.a;
import com.vk.profile.user.impl.domain.edit.models.ExternalEvent;
import com.vk.superapp.api.analytics.RegistrationStatFlowType;
import com.vk.superapp.api.analytics.RegistrationStatParamsFactory;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONObject;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.bex0;
import xsna.c2r0;
import xsna.c910;
import xsna.f3t.f;
import xsna.f6p;
import xsna.kjf0;
import xsna.l4m;
import xsna.lwj;
import xsna.qis0;
import xsna.r2j;
import xsna.tj50;
import xsna.wen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class srg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ srg(VkBlurView vkBlurView, DialogPinView dialogPinView) {
        this.b = 8;
        this.c = vkBlurView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        CorrectionsInfo a;
        int i = this.b;
        int i2 = 24;
        int i3 = 3;
        int i4 = 21;
        int i5 = 22;
        int i6 = 12;
        boolean z = false;
        z = false;
        z = false;
        int i7 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                trg trgVar = (trg) obj2;
                List list2 = (List) obj;
                boolean booleanValue = ((Boolean) trgVar.d.getValue()).booleanValue();
                HashMap<Integer, Address> hashMap = trgVar.f;
                ArrayList<PlainAddress> arrayList = trgVar.e;
                if (booleanValue) {
                    List<Address> list3 = list2;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list3, 10));
                    for (Address address : list3) {
                        PlainAddress plainAddress = new PlainAddress();
                        plainAddress.b = address.b;
                        plainAddress.c = address.c;
                        plainAddress.d = address.d;
                        arrayList2.add(plainAddress);
                    }
                    arrayList.addAll(arrayList2);
                    pro0.f(new u40(trgVar, 28));
                    list = list2;
                } else {
                    List list4 = list2;
                    HashMap hashMap2 = new HashMap(list4.size());
                    for (Object obj3 : list4) {
                        hashMap2.put(Integer.valueOf(((Address) obj3).b), obj3);
                    }
                    ArrayList arrayList3 = new ArrayList(30);
                    int min = Math.min(arrayList.size() - 1, trgVar.g + 29);
                    int i8 = trgVar.g;
                    if (i8 <= min) {
                        while (true) {
                            int i9 = arrayList.get(i8).b;
                            if (hashMap.containsKey(Integer.valueOf(i9))) {
                                arrayList3.add(hashMap.get(Integer.valueOf(i9)));
                            } else if (hashMap2.containsKey(Integer.valueOf(i9))) {
                                arrayList3.add(hashMap2.get(Integer.valueOf(i9)));
                            }
                            if (i8 != min) {
                                i8++;
                            }
                        }
                    }
                    trgVar.g = min + 1;
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        Address address2 = (Address) it.next();
                        PlainAddress plainAddress2 = new PlainAddress();
                        plainAddress2.b = address2.b;
                        plainAddress2.c = address2.c;
                        plainAddress2.d = address2.d;
                        arrayList4.add(plainAddress2);
                    }
                    arrayList.clear();
                    arrayList.addAll(arrayList4);
                    pro0.f(new com.vk.movika.sdk.base.ui.m(5, trgVar, arrayList4));
                    list = arrayList3;
                }
                return list;
            case 1:
                com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d dVar = (com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.d) obj2;
                dVar.b0(false);
                dVar.T(new e.g((Throwable) obj));
                mzp0 mzp0Var = dVar.i;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                return s3q0.a;
            case 2:
                tj50.a aVar = (tj50.a) obj;
                z90 z90Var = new z90(i2);
                ao8 ao8Var = ao8.d;
                return new r2j.b(aVar.a(z90Var, ao8Var), aVar.a(new lt0(26), ao8Var), aVar.a(new xx0(23), ao8Var), aVar.a(new md(i4), ao8Var), aVar.a(new oj(18), ao8Var), aVar.a(new pl2(i5), ao8Var), aVar.a(new f57((p2j) obj2, 16), ao8Var));
            case 3:
                CorrectionView correctionView = (CorrectionView) obj2;
                lwj lwjVar = (lwj) obj;
                FilterInfo filterInfo = correctionView.x;
                if (filterInfo != null) {
                    switch (lwj.a.$EnumSwitchMapping$0[lwjVar.a.ordinal()]) {
                        case 1:
                            a = CorrectionsInfo.a(filterInfo.d, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                            break;
                        case 2:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
                            break;
                        case 3:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1019);
                            break;
                        case 4:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1015);
                            break;
                        case 5:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1007);
                            break;
                        case 6:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 991);
                            break;
                        case 7:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 959);
                            break;
                        case 8:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 895);
                            break;
                        case 9:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 767);
                            break;
                        case 10:
                            a = CorrectionsInfo.a(filterInfo.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, lwjVar.b, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    FilterInfo a2 = FilterInfo.a(filterInfo, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, null, 11);
                    qis0.a aVar2 = correctionView.w;
                    if (aVar2 != null) {
                        aVar2.a(a2);
                    }
                    correctionView.x = a2;
                }
                return s3q0.a;
            case 4:
                L.G(ms9.b("error: ", (Throwable) obj));
                ((yzj) obj2).f.b(new ExternalEvent.ShowSnackbar(ExternalEvent.ShowSnackbar.ShowType.Window, R.drawable.vk_icon_error_circle_outline_24, R.string.user_profile_edit_incorrect_image_size, 16, 0));
                return s3q0.a;
            case 5:
                CreatePeopleTransferFragment createPeopleTransferFragment = ((CreatePeopleTransferPresenter) obj2).o;
                n730 n730Var = (n730) obj;
                if (n730Var instanceof jmf0) {
                    createPeopleTransferFragment.Bo(((jmf0) n730Var).a);
                } else {
                    createPeopleTransferFragment.getClass();
                    cvk.u(R.string.money_transfer_unknown_error_occured_try_again, false);
                }
                return s3q0.a;
            case 6:
                xak xakVar = (xak) obj2;
                xakVar.B = ((Boolean) obj).booleanValue() ? CreateVkEmailRequiredData.AdsAcceptance.ACCEPTED : CreateVkEmailRequiredData.AdsAcceptance.NOT_ACCEPTED;
                xakVar.C0();
                return s3q0.a;
            case 7:
                l4m.a aVar3 = ((l4m.c) obj2).p;
                ArrayList arrayList5 = aVar3.c;
                arrayList5.clear();
                arrayList5.addAll((VKList) obj);
                aVar3.notifyDataSetChanged();
                return s3q0.a;
            case 8:
                VkBlurView vkBlurView = (VkBlurView) obj2;
                int i10 = DialogPinView.l;
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
                createBitmap.eraseColor(352321535);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                vkBlurView.setColorOverlayShader(new BitmapShader(createBitmap, tileMode, tileMode));
                Bitmap createBitmap2 = Bitmap.createBitmap(1, 1, config);
                createBitmap2.eraseColor(352321535);
                vkBlurView.setFallbackColorOverlay(new BitmapShader(createBitmap2, tileMode, tileMode));
                return s3q0.a;
            case 9:
                tgl0 tgl0Var = ((hpm) obj2).b;
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                long j = bVar.b;
                vjm vjmVar = bVar.e;
                if (vjmVar == null) {
                    vjmVar = bVar.d;
                }
                vjm e = vjm.e(vjmVar, 0, 0, 3);
                tgl0Var.b().execSQL("UPDATE dialogs SET sort_id_local = ? WHERE id = ?", new String[]{String.valueOf(e.a()), String.valueOf(j)});
                tgl0Var.b().execSQL("UPDATE dialog_weight SET x_sort_id_local = ? WHERE x_dialog_id = ? AND x_folder_id = ?", new Object[]{Long.valueOf(e.a()), Long.valueOf(j), -1});
                return s3q0.a;
            case 10:
                afn afnVar = (afn) obj2;
                LinkedHashSet linkedHashSet = afnVar.a.a;
                if (afnVar.c.a(linkedHashSet)) {
                    L.e("DisplayLayoutSender", "updateDisplayLayouts providers sending. Size: " + linkedHashSet.size());
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it2 = linkedHashSet.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            wen.a displayLayouts = ((wen) it2.next()).getDisplayLayouts();
                            if (epx.f(displayLayouts, wen.a.C3930a.a)) {
                                L.e("DisplayLayoutSender", "updateDisplayLayouts providers aren't ready");
                            } else {
                                if (!(displayLayouts instanceof wen.a.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                arrayList6.addAll(((wen.a.b) displayLayouts).a);
                            }
                        } else {
                            afnVar.d.updateDisplayLayout(arrayList6);
                        }
                    }
                } else {
                    L.e("DisplayLayoutSender", "updateDisplayLayouts providers aren't correct");
                }
                return s3q0.a;
            case 11:
                a.k kVar = (a.k) obj2;
                EditorState editorState = (EditorState) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap(editorState.b);
                for (Map.Entry<f5p, g5p> entry : kVar.a.entrySet()) {
                    f5p key = entry.getKey();
                    g5p value = entry.getValue();
                    if (value == null) {
                        linkedHashMap.remove(key);
                    } else {
                        linkedHashMap.put(key, value);
                    }
                }
                return EditorState.a(editorState, null, linkedHashMap, null, null, kVar.b, null, null, 237);
            case 12:
                f6p f6pVar = (f6p) obj2;
                ValueAnimator valueAnimator = f6pVar.m;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    if (f6pVar.k == null) {
                        f6pVar.a();
                        f6p.d dVar2 = f6pVar.k;
                        if (dVar2 != null) {
                            dVar2.addOnLayoutChangeListener(new g6p(f6pVar));
                        }
                    } else {
                        f6pVar.b();
                    }
                }
                return s3q0.a;
            case 13:
                Object obj4 = ((b2q) obj2).o;
                Object obj5 = obj4;
                if (obj4 == null) {
                    obj5 = null;
                }
                d2q d2qVar = (d2q) obj5;
                d2qVar.e.c(AuthStatSender.Screen.EXCHANGE_LOGIN, AuthStatSender.Status.EXCHANGE_LOGIN, AuthStatSender.Element.SIGN_UP_BUTTON);
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.s();
                RegistrationStatParamsFactory.a = RegistrationStatFlowType.AUTH_WITHOUT_PASSWORD;
                SignUpDataHolder signUpDataHolder = d2qVar.p;
                if (signUpDataHolder == null) {
                    signUpDataHolder = null;
                }
                signUpDataHolder.f = true;
                com.vk.auth.main.e eVar = d2qVar.o;
                (eVar != null ? eVar : null).l();
                return s3q0.a;
            case 14:
                FolderType folderType = (FolderType) obj2;
                List list5 = (List) ((xpp) obj).a();
                if (list5 != null) {
                    List list6 = list5;
                    if (!(list6 instanceof Collection) || !list6.isEmpty()) {
                        Iterator it3 = list6.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((rpm) it3.next()).c == folderType) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                xbu0 xbu0Var = (xbu0) obj;
                c2r0.b bVar2 = new c2r0.b(((h7r0) obj2).e, xbu0Var.b, xbu0Var.c, xbu0Var.d, false, AccountProfileType.NORMAL);
                r55 r55Var = r55.a;
                c2r0 j2 = r55.j();
                Context context = e43.a;
                ((yui) j2).k(context != null ? context : null, bVar2);
                return s3q0.a;
            case 16:
                return ((f3t) obj2).new f((ViewGroup) obj);
            case 17:
                j3u j3uVar = (j3u) obj2;
                NewsfeedGetResponse newsfeedGetResponse = (NewsfeedGetResponse) obj;
                com.vk.newsfeed.common.util.j jVar = new com.vk.newsfeed.common.util.j();
                String str = newsfeedGetResponse.j() ? j3uVar.b : j3uVar.c;
                HashMap hashMap3 = new HashMap();
                Iterator<NewsEntry> it4 = newsfeedGetResponse.iterator();
                while (it4.hasNext()) {
                    NewsEntry next = it4.next();
                    ArrayList arrayList7 = new ArrayList();
                    com.vk.newsfeed.common.util.j.h(jVar, next, (s1c0) j3uVar.e.getValue(), "news", str, arrayList7, null, 96);
                    hashMap3.put(next, new k0d0(arrayList7));
                }
                new PerfLogger().a(PerfLogger.Event.NEWSFEED_CACHE_RENDERED);
                return new al60(newsfeedGetResponse, newsfeedGetResponse.i(), newsfeedGetResponse.isSmartNews, hashMap3, false);
            case 18:
                GoodFragment goodFragment = (GoodFragment) obj2;
                hy00 hy00Var = (hy00) obj;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                a5u a5uVar = goodFragment.Po().c;
                cxo Po = goodFragment.Po();
                a5u a5uVar2 = Po.c;
                y4u y4uVar = Po.a;
                com.vk.ecomm.market.good.a aVar4 = (com.vk.ecomm.market.good.a) y4uVar.s0.getValue();
                b090 b090Var = Po.R;
                aVar4.getClass();
                b090 a3 = com.vk.ecomm.market.good.a.a(b090Var, hy00Var);
                if (a3 != null) {
                    Po.R = a3;
                    a5uVar2.a(Po, new kjf0.a(24, a3, 0));
                }
                com.vk.ecomm.market.good.a aVar5 = (com.vk.ecomm.market.good.a) y4uVar.s0.getValue();
                b090 b090Var2 = Po.S;
                aVar5.getClass();
                b090 a4 = com.vk.ecomm.market.good.a.a(b090Var2, hy00Var);
                if (a4 != null) {
                    Po.S = a4;
                    a5uVar2.a(Po, new kjf0.a(15, a4, 0));
                }
                Good good = Po.r;
                if (good != null && hy00Var.a == good.b) {
                    boolean z2 = good.J;
                    boolean z3 = hy00Var.c;
                    if (z2 != z3) {
                        good.J = z3;
                    }
                }
                return s3q0.a;
            case 19:
                n7u n7uVar = (n7u) obj2;
                n7uVar.n.a((QuickMessageItem) obj, n7uVar.itemView.getContext());
                return s3q0.a;
            case 20:
                int i11 = GroupCallGridContainerView.i;
                ((GroupCallGridContainerView) obj2).a();
                return s3q0.a;
            case 21:
                return ((s2a) obj2).a((CatalogBlockState) obj);
            case 22:
                tuv tuvVar = (tuv) obj2;
                tuvVar.f.invoke(tuvVar.d, null, tuvVar.c);
                return s3q0.a;
            case 23:
                ((pjx) ((tjx) obj2).d.getValue()).getClass();
                return akx.a;
            case 24:
                bex0.a.b(((p7y) obj2).a, JsApiMethodType.CAN_ADD_VIRTUAL_CARD_EVENT_NAME, (JSONObject) obj, null, 12);
                return s3q0.a;
            case 25:
                return CatalogSectionState.a((CatalogSectionState) obj, null, false, false, (Throwable) obj2, null, false, null, null, null, null, 8127);
            case 26:
                mi00 mi00Var = (mi00) obj2;
                gi00 gi00Var = mi00Var.b;
                Integer num = (Integer) ((Optional) obj).orElse(null);
                if (num == null) {
                    gi00Var.a();
                    return io.reactivex.rxjava3.core.q.T(Optional.empty());
                }
                io.reactivex.rxjava3.core.q<ei00> H = gi00Var.H();
                udo udoVar = new udo(num, i5);
                int i12 = 2;
                return new io.reactivex.rxjava3.internal.operators.observable.c0(new io.reactivex.rxjava3.internal.operators.observable.c0(H.U(new i3u(udoVar, i12)), new b0y(new vfk(mi00Var, i4), i3), io.reactivex.rxjava3.internal.functions.a.c), io.reactivex.rxjava3.internal.functions.a.d, new re4(mi00Var, i12));
            case 27:
                u810 u810Var = (u810) obj2;
                tj50.a aVar6 = (tj50.a) obj;
                v4v v4vVar = new v4v(u810Var, 9);
                ao8 ao8Var2 = ao8.d;
                int i13 = 4;
                int i14 = 17;
                return new c910.a(aVar6.a(v4vVar, ao8Var2), aVar6.a(new d0k(u810Var, 14), ao8Var2), aVar6.a(new gvs(6), ao8Var2), aVar6.a(new nyq(11), ao8Var2), aVar6.a(new ebx(u810Var, i13), ao8Var2), aVar6.a(new x8m(i14), ao8Var2), aVar6.a(new t810(false ? 1 : 0), ao8Var2), aVar6.a(new rxz(u810Var, i7), ao8Var2), aVar6.a(new b4r(u810Var), ao8Var2), aVar6.a(new uuz(i13), ao8Var2), aVar6.a(new l8k(i14), ao8Var2), aVar6.a(new com(i6), ao8Var2));
            case 28:
                Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
                return Boolean.valueOf(((Attach) obj).xb() == ((Attach) obj2).xb());
            default:
                DialogTheme dialogTheme = (DialogTheme) obj;
                vm30 vm30Var = ((com.vk.im.ui.components.msg_list.a) obj2).o;
                if (vm30Var != null) {
                    vm30Var.S(dialogTheme);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ srg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
