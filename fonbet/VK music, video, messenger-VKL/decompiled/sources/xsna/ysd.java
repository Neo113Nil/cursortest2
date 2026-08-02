package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.runtime.a;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTemplateExtendedResponseDto;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.screen.i;
import com.vk.billing.InAppPurchaseManagerException;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.core.apps.BuildInfo;
import com.vk.core.files.ExternalDirType;
import com.vk.core.files.b;
import com.vk.core.preference.Preference;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.medianative.MediaImageEncoder;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.pushes.receivers.c;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipDraft;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;
import com.vkontakte.android.R;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.jvm.internal.Ref$LongRef;
import org.json.JSONObject;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.g7g0;
import xsna.h7u0;
import xsna.hil;
import xsna.ikv0;
import xsna.t5e;
import xsna.x89;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ysd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ysd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.vk.superapp.bridges.SuperappUiRouterBridge] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.vk.mediastore.system.MediaStoreEntry] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        Uri uri;
        MediaStoreImageEntry mediaStoreImageEntry;
        boolean z2;
        Object failure;
        MediaStoreImageEntry mediaStoreImageEntry2;
        g1h0 g1h0Var;
        s3q0 s3q0Var;
        int i = this.b;
        int i2 = 4;
        boolean z3 = false;
        int i3 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                final atd atdVar = (atd) obj4;
                final jdo jdoVar = (jdo) obj3;
                final ShortVideoGetTemplateExtendedResponseDto shortVideoGetTemplateExtendedResponseDto = (ShortVideoGetTemplateExtendedResponseDto) obj2;
                ClipsDraftPersistentStore clipsDraftPersistentStore = (ClipsDraftPersistentStore) obj;
                if (!atdVar.d.e().isEmpty()) {
                    clipsDraftPersistentStore.getClass();
                    ClipsDraftVk j = ClipsDraftPersistentStore.j();
                    if (!epx.f(j != null ? j.b.b : null, jdoVar.a)) {
                        int i4 = h7u0.p;
                        h7u0.a c = h7u0.b.c(atdVar.b.getContext());
                        c.g0(R.string.camera_draft_switch_save_draft_dialog_title);
                        c.U(R.string.camera_draft_switch_save_question);
                        c.c0(R.string.camera_draft_switch_save_positive, new DialogInterface.OnClickListener() { // from class: xsna.usd
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                atd atdVar2 = atd.this;
                                lsd lsdVar = atdVar2.e;
                                xsd xsdVar = new xsd(atdVar2, jdoVar, shortVideoGetTemplateExtendedResponseDto, 0);
                                lsdVar.e.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.SAVE_DRAFT));
                                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                                jp5 jp5Var = new jp5(5, lsdVar, xsdVar);
                                clipsDraftPersistentStore2.getClass();
                                ClipsDraftPersistentStore.o(jp5Var);
                                androidx.appcompat.app.d dVar = atdVar2.i;
                                if (dVar != null) {
                                    dVar.hide();
                                }
                                androidx.appcompat.app.d dVar2 = atdVar2.i;
                                if (dVar2 != null) {
                                    dVar2.dismiss();
                                }
                            }
                        });
                        c.W(R.string.camera_draft_switch_save_negative, new DialogInterface.OnClickListener() { // from class: xsna.vsd
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i5) {
                                atd atdVar2 = atd.this;
                                lsd lsdVar = atdVar2.e;
                                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                                pd pdVar = new pd(lsdVar, 27);
                                clipsDraftPersistentStore2.getClass();
                                ClipsDraftPersistentStore.o(pdVar);
                                jpd jpdVar = lsdVar.d;
                                jpdVar.q(false);
                                zd9 camera1View = jpdVar.c.getCamera1View();
                                if (camera1View != null) {
                                    camera1View.C();
                                }
                                atdVar2.c(jdoVar, shortVideoGetTemplateExtendedResponseDto);
                                dw20 dw20Var = atdVar2.j;
                                if (dw20Var != null) {
                                    dw20Var.dismiss();
                                }
                                androidx.appcompat.app.d dVar = atdVar2.i;
                                if (dVar != null) {
                                    dVar.hide();
                                }
                                androidx.appcompat.app.d dVar2 = atdVar2.i;
                                if (dVar2 != null) {
                                    dVar2.dismiss();
                                }
                            }
                        });
                        c.a0(new wsd(atdVar, 0));
                        atdVar.i = c.m();
                        return s3q0.a;
                    }
                }
                lsd lsdVar = atdVar.e;
                xsd xsdVar = new xsd(atdVar, jdoVar, shortVideoGetTemplateExtendedResponseDto, 0);
                lsdVar.e.invoke(new MobileOfficialAppsClipsStat$TypeClipDraft(MobileOfficialAppsClipsStat$TypeClipDraft.EventType.SAVE_DRAFT));
                ClipsDraftPersistentStore clipsDraftPersistentStore2 = ClipsDraftPersistentStore.b;
                jp5 jp5Var = new jp5(5, lsdVar, xsdVar);
                clipsDraftPersistentStore2.getClass();
                ClipsDraftPersistentStore.o(jp5Var);
                return s3q0.a;
            case 1:
                t5e.l lVar = (t5e.l) obj2;
                dhr0 dhr0Var = dhr0.a;
                Context context = ((ikv0.a) obj4).a;
                ((u5e) obj3).b.b(lVar.a, lVar.b, lVar.c, dhr0Var.c(context)).k(context);
                lVar.d.invoke();
                ((ikv0) obj).a();
                return s3q0.a;
            case 2:
                ((hv10) obj).d((ur4) obj4, (Uri) obj3, (Throwable) obj2);
                return s3q0.a;
            case 3:
                Ref$LongRef ref$LongRef = (Ref$LongRef) obj4;
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj3;
                r4p r4pVar = (r4p) obj2;
                Bitmap bitmap = (Bitmap) obj;
                long currentTimeMillis = System.currentTimeMillis();
                L.e("VkPhotoEditorLog", efz.b(currentTimeMillis - ref$LongRef.element, UcumUtils.UCUM_MILLISECODS, new StringBuilder("renderAndFinish: got bitmap ")));
                ref$LongRef.element = currentTimeMillis;
                long currentTimeMillis2 = System.currentTimeMillis();
                zlw zlwVar = hVar.g;
                long currentTimeMillis3 = System.currentTimeMillis();
                L.e("VkPhotoEditorLog", "saveBitmapIntoFileAndGallery: start");
                com.vk.attachpicker.screen.i iVar = hVar.y;
                if (iVar instanceof i.c) {
                    i.c cVar = (i.c) iVar;
                    if (!cVar.a || cVar.b || epx.f(hVar.h, r4pVar)) {
                        File file = zlwVar.b;
                        if (file == null) {
                            Context context2 = e43.a;
                            if (context2 == null) {
                                context2 = null;
                            }
                            MediaStoreEntry mediaStoreEntry = zlwVar.a;
                            file = com.vk.core.files.a.i(context2, mediaStoreEntry != null ? mediaStoreEntry.f() : null);
                        }
                        if (file != null) {
                            g1h0Var = new g1h0(file, null, null);
                            L.e("VkPhotoEditorLog", efz.b(currentTimeMillis2 - ref$LongRef.element, UcumUtils.UCUM_MILLISECODS, new StringBuilder("renderAndFinish: bitmap saved ")));
                            ref$LongRef.element = currentTimeMillis2;
                            return g1h0Var;
                        }
                    }
                }
                File s = com.vk.core.files.a.s();
                if (!MediaImageEncoder.INSTANCE.encodeJpegWithoutCompression(bitmap, s)) {
                    throw new IllegalStateException("Can't render bitmap to jpeg");
                }
                long currentTimeMillis4 = System.currentTimeMillis();
                L.e("VkPhotoEditorLog", efz.b(currentTimeMillis4 - currentTimeMillis3, UcumUtils.UCUM_MILLISECODS, new StringBuilder("saveBitmapIntoFileAndGallery: encoded in ")));
                try {
                    Context context3 = e43.a;
                    if (context3 == null) {
                        context3 = null;
                    }
                    kjw.a(context3, Uri.fromFile(new File(zlwVar.a())), Uri.fromFile(s), e43.l("GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef"));
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                long currentTimeMillis5 = System.currentTimeMillis();
                L.e("VkPhotoEditorLog", efz.b(currentTimeMillis5 - currentTimeMillis4, UcumUtils.UCUM_MILLISECODS, new StringBuilder("saveBitmapIntoFileAndGallery: copy exif in ")));
                if (BuildInfo.t() || BuildInfo.s()) {
                    Context context4 = e43.a;
                    if (context4 == null) {
                        context4 = null;
                    }
                    z = Preference.g(context4).getBoolean("saveProcessedImage", true);
                } else {
                    z = true;
                }
                if (z) {
                    Context context5 = e43.a;
                    if (context5 == null) {
                        context5 = null;
                    }
                    b.a aVar = (b.a) com.vk.core.files.b.c(new com.vk.core.files.b(context5), s, ExternalDirType.IMAGES, 4).c();
                    Uri uri2 = aVar != null ? aVar.a : null;
                    bpn0 bpn0Var = iz10.a;
                    Context context6 = e43.a;
                    io.reactivex.rxjava3.internal.operators.maybe.p pVar = new io.reactivex.rxjava3.internal.operators.maybe.p(new sz10(iz10.a(context6 != null ? context6 : null), Uri.fromFile(s)));
                    asu0 asu0Var = asu0.a;
                    ?? r5 = (MediaStoreEntry) pVar.n(asu0Var.c()).k(asu0Var.d()).c();
                    long currentTimeMillis6 = System.currentTimeMillis();
                    L.e("VkPhotoEditorLog", efz.b(currentTimeMillis6 - currentTimeMillis5, UcumUtils.UCUM_MILLISECODS, new StringBuilder("saveBitmapIntoFileAndGallery: save to gallery in ")));
                    mediaStoreImageEntry = r5;
                    currentTimeMillis5 = currentTimeMillis6;
                    uri = uri2;
                } else {
                    uri = null;
                    mediaStoreImageEntry = null;
                }
                if (mediaStoreImageEntry == null) {
                    try {
                        z2 = s.exists();
                    } catch (SecurityException unused) {
                        z2 = false;
                    }
                    if (z2) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(s.getAbsolutePath(), options);
                        int attributeInt = new ExifInterface(s.getAbsolutePath()).getAttributeInt("Orientation", 0);
                        Uri fromFile = Uri.fromFile(s);
                        int i5 = options.outWidth;
                        int i6 = options.outHeight;
                        try {
                            failure = Long.valueOf(s.lastModified());
                        } catch (Throwable th2) {
                            failure = new Result.Failure(th2);
                        }
                        Throwable a = Result.a(failure);
                        Object obj5 = failure;
                        if (a != null) {
                            obj5 = -1L;
                        }
                        mediaStoreImageEntry2 = new MediaStoreImageEntry(-1, fromFile, -1L, i5, i6, ((Number) obj5).longValue(), z4g.f(s), attributeInt);
                        L.e("VkPhotoEditorLog", efz.b(System.currentTimeMillis() - currentTimeMillis5, UcumUtils.UCUM_MILLISECODS, new StringBuilder("saveBitmapIntoFileAndGallery: save entry in ")));
                        g1h0Var = new g1h0(s, mediaStoreImageEntry2, uri);
                        L.e("VkPhotoEditorLog", efz.b(currentTimeMillis2 - ref$LongRef.element, UcumUtils.UCUM_MILLISECODS, new StringBuilder("renderAndFinish: bitmap saved ")));
                        ref$LongRef.element = currentTimeMillis2;
                        return g1h0Var;
                    }
                }
                mediaStoreImageEntry2 = mediaStoreImageEntry;
                g1h0Var = new g1h0(s, mediaStoreImageEntry2, uri);
                L.e("VkPhotoEditorLog", efz.b(currentTimeMillis2 - ref$LongRef.element, UcumUtils.UCUM_MILLISECODS, new StringBuilder("renderAndFinish: bitmap saved ")));
                ref$LongRef.element = currentTimeMillis2;
                return g1h0Var;
            case 4:
                PhotoSmallAdapter photoSmallAdapter = (PhotoSmallAdapter) obj4;
                com.vk.attachpicker.fragment.gallery.c cVar2 = (com.vk.attachpicker.fragment.gallery.c) obj3;
                com.vk.attachpicker.b bVar = (com.vk.attachpicker.b) obj2;
                photoSmallAdapter.notifyItemChanged(photoSmallAdapter.K0() + ((Integer) obj).intValue(), Boolean.TRUE);
                izs<List<? extends MediaStoreEntry>, s3q0> izsVar = cVar2.i;
                z4f z4fVar = cVar2.c;
                if (izsVar != null) {
                    izsVar.invoke(bVar.b());
                }
                if (bVar.k() > 0 && !((Boolean) z4fVar.invoke()).booleanValue()) {
                    return s3q0.a;
                }
                if (bVar.k() == 0 && ((Boolean) z4fVar.invoke()).booleanValue()) {
                    return s3q0.a;
                }
                u3p0 u3p0Var = cVar2.f;
                if (u3p0Var != null) {
                    z4fVar.invoke();
                    u3p0Var.a.getClass();
                }
                return s3q0.a;
            case 5:
                uhu uhuVar = (uhu) obj4;
                x89.a a2 = x89.a.a((x89.a) obj3, new x89.c.a(((VoipChangeNameResult.JoinAs.Anonym) obj2).b, (wt2) obj));
                uhuVar.t = a2;
                uhuVar.X0(a2);
                return s3q0.a;
            case 6:
                x7y x7yVar = (x7y) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                WebGroup webGroup = (WebGroup) obj;
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                (superappUiRouterBridge != null ? superappUiRouterBridge : 0).g0(new SuperappUiRouterBridge.a.c(webGroup), new z7y(x7yVar, webGroup, str, str2));
                s13 s13Var = x7yVar.f;
                if (s13Var != null) {
                    s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_JOIN_GROUP, MiniAppSettingsBoxAction.SHOW);
                }
                return s3q0.a;
            case 7:
                v110 v110Var = (v110) obj3;
                a210 a210Var = (a210) obj2;
                gmq gmqVar = (gmq) obj;
                if (gmqVar.equals((MarketFavable) obj4)) {
                    boolean X = gmqVar.X();
                    v110Var.q.T4(new MarketProductTileConfig.b(X, true));
                    a210Var.k = X;
                }
                return s3q0.a;
            case 8:
                ((gzs) obj4).invoke();
                c.a aVar2 = com.vk.pushes.receivers.c.b;
                c.a.f((Context) obj3, (Intent) obj2, true);
                return s3q0.a;
            case 9:
                ((Integer) obj).intValue();
                ((wh50) obj2).setValue("");
                ((izs) obj4).invoke((qv2) obj3);
                return s3q0.a;
            case 10:
                final izs izsVar2 = (izs) obj3;
                nvy nvyVar = (nvy) obj;
                nvy.g(nvyVar, null, null, ne7.d, 3);
                List list = (List) ((mtk0) obj4).getValue();
                nvyVar.e(list.size(), new y7d0(new z410(13), list, i3), new idd0(list, 0), new jai(802480018, new jdd0(list, izsVar2, (mtk0) obj2), true));
                nvy.g(nvyVar, null, null, new jai(-1289153258, new yzs() { // from class: xsna.hdd0
                    @Override // xsna.yzs
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                        int intValue = ((Integer) obj8).intValue();
                        if (aVar3.t(intValue & 1, (intValue & 17) != 16)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-1289153258, intValue, -1, "com.vk.donut.privacy.levels.levelsbottomsheet.Content.<anonymous>.<anonymous>.<anonymous> (PrivacyEditDonutLevelsBottomSheetView.kt:163)");
                            }
                            izs izsVar3 = izs.this;
                            boolean J = aVar3.J(izsVar3);
                            Object x = aVar3.x();
                            if (J || x == a.C0011a.a) {
                                x = new ddn(izsVar3, 6);
                                aVar3.R(x);
                            }
                            kdd0.e((gzs) x, aVar3, 0);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar3.h();
                        }
                        return s3q0.a;
                    }
                }, true), 3);
                return s3q0.a;
            case 11:
                final JSONObject jSONObject = (JSONObject) obj4;
                final String str3 = (String) obj3;
                AtomicInteger atomicInteger = (AtomicInteger) obj2;
                k27 k27Var = (k27) obj;
                BillingResult billingResult = k27Var.a;
                List<ProductDetails> list2 = k27Var.b;
                try {
                    try {
                    } catch (Exception e) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error during tracking in-app purchase"});
                        }
                        com.vk.metrics.eventtracking.b.a.a(new InAppPurchaseManagerException(e));
                    }
                    if (billingResult.getResponseCode() != 0) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error during tracking in-app purchase: getProductDetails result=" + billingResult.getResponseCode()});
                        }
                        s3q0Var = s3q0.a;
                    } else {
                        List<ProductDetails> list3 = list2;
                        if (list3 != null && !list3.isEmpty()) {
                            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = list2.get(0).getOneTimePurchaseOfferDetails();
                            if (oneTimePurchaseOfferDetails != null) {
                                final JSONObject a3 = nmi0.a(oneTimePurchaseOfferDetails, null);
                                L l3 = L.a;
                                l3.getClass();
                                if (!L.m(LoggerOutputTarget.NONE)) {
                                    L.u(l3, L.LogType.i, new Object[]{"Billing : PurchasesManager", "Tracking in-app purchase success"});
                                }
                                uc00 uc00Var = uc00.a;
                                final MyTrackerConfig trackerConfig = MyTracker.getTrackerConfig();
                                final boolean isAutotrackingPurchaseEnabled = trackerConfig.isAutotrackingPurchaseEnabled();
                                uc00.n(new gzs() { // from class: xsna.rc00
                                    @Override // xsna.gzs
                                    public final Object invoke() {
                                        MyTrackerConfig myTrackerConfig = MyTrackerConfig.this;
                                        JSONObject jSONObject2 = a3;
                                        JSONObject jSONObject3 = jSONObject;
                                        String str4 = str3;
                                        boolean z4 = isAutotrackingPurchaseEnabled;
                                        try {
                                            myTrackerConfig.setAutotrackingPurchaseEnabled(false);
                                            MyTracker.trackPurchaseEvent(jSONObject2, jSONObject3, str4);
                                            myTrackerConfig.setAutotrackingPurchaseEnabled(z4);
                                            return s3q0.a;
                                        } catch (Throwable th3) {
                                            myTrackerConfig.setAutotrackingPurchaseEnabled(z4);
                                            throw th3;
                                        }
                                    }
                                });
                                return s3q0.a;
                            }
                            L l4 = L.a;
                            l4.getClass();
                            if (!L.m(LoggerOutputTarget.NONE)) {
                                L.u(l4, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error during tracking in-app purchase: oneTimePurchaseOfferDetails is null"});
                            }
                            s3q0Var = s3q0.a;
                        }
                        L l5 = L.a;
                        l5.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l5, L.LogType.e, new Object[]{"Billing : PurchasesManager", "Error during tracking in-app purchase: productDetails is empty"});
                        }
                        s3q0Var = s3q0.a;
                    }
                    return s3q0Var;
                } finally {
                    com.vk.billing.h.r(atomicInteger, null);
                }
            case 12:
                g7g0.a aVar3 = (g7g0.a) obj4;
                jl4 jl4Var = (jl4) obj3;
                ma maVar = (ma) obj2;
                Throwable th3 = (Throwable) obj;
                Throwable cause = th3.getCause();
                if (cause == null) {
                    cause = th3;
                }
                if (!aVar3.e) {
                    VKWebAuthException vKWebAuthException = cause instanceof VKWebAuthException ? (VKWebAuthException) cause : null;
                    if (vKWebAuthException != null && vKWebAuthException.l()) {
                        jl4Var.invoke();
                        return s3q0.a;
                    }
                }
                maVar.invoke(th3);
                return s3q0.a;
            default:
                gho0 gho0Var = (gho0) obj4;
                yvj yvjVar = (yvj) obj3;
                Context context7 = (Context) obj2;
                tco0 tco0Var = (tco0) obj;
                tco0Var.a();
                fh50<uco0> fh50Var = tco0Var.a;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean z4 = (qko0.c(gho0Var.p().b) || !gho0Var.l() || gho0Var.h == null) ? false : true;
                sk skVar = new sk(yvjVar, new lho0(gho0Var, null));
                Resources resources = context7.getResources();
                vnb0 vnb0Var = new vnb0(i2, skVar, r3);
                if (z4) {
                    fh50Var.j(new edo0(textContextMenuItems.i(), resources.getString(textContextMenuItems.j()), textContextMenuItems.h(), vnb0Var));
                }
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z5 = (qko0.c(gho0Var.p().b) || gho0Var.h == null) ? false : true;
                sk skVar2 = new sk(yvjVar, new mho0(gho0Var, null));
                Resources resources2 = context7.getResources();
                vnb0 vnb0Var2 = new vnb0(i2, skVar2, r3);
                if (z5) {
                    fh50Var.j(new edo0(textContextMenuItems2.i(), resources2.getString(textContextMenuItems2.j()), textContextMenuItems2.h(), vnb0Var2));
                }
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean z6 = gho0Var.l() && ((Boolean) ((zak0) gho0Var.y).getValue()).booleanValue() && gho0Var.h != null;
                sk skVar3 = new sk(yvjVar, new nho0(gho0Var, null));
                Resources resources3 = context7.getResources();
                vnb0 vnb0Var3 = new vnb0(i2, skVar3, r3);
                if (z6) {
                    fh50Var.j(new edo0(textContextMenuItems3.i(), resources3.getString(textContextMenuItems3.j()), textContextMenuItems3.h(), vnb0Var3));
                }
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean z7 = qko0.d(gho0Var.p().b) != gho0Var.p().a.c.length();
                iri0 iri0Var = new iri0(gho0Var, 10);
                jaa0 jaa0Var = new jaa0(gho0Var, 21);
                Resources resources4 = context7.getResources();
                vnb0 vnb0Var4 = new vnb0(i2, jaa0Var, iri0Var);
                if (z7) {
                    fh50Var.j(new edo0(textContextMenuItems4.i(), resources4.getString(textContextMenuItems4.j()), textContextMenuItems4.h(), vnb0Var4));
                }
                TextContextMenuItems textContextMenuItems5 = TextContextMenuItems.Autofill;
                if (gho0Var.l() && qko0.c(gho0Var.p().b)) {
                    z3 = true;
                }
                b990 b990Var = new b990(gho0Var, 19);
                Resources resources5 = context7.getResources();
                vnb0 vnb0Var5 = new vnb0(i2, b990Var, r3);
                if (z3) {
                    fh50Var.j(new edo0(textContextMenuItems5.i(), resources5.getString(textContextMenuItems5.j()), textContextMenuItems5.h(), vnb0Var5));
                }
                tco0Var.a();
                return s3q0.a;
        }
    }

    public /* synthetic */ ysd(JSONObject jSONObject, String str, com.vk.billing.h hVar, AtomicInteger atomicInteger) {
        this.b = 11;
        this.c = jSONObject;
        this.d = str;
        this.e = atomicInteger;
    }

    public /* synthetic */ ysd(hil.b bVar, ur4 ur4Var, Uri uri, Throwable th) {
        this.b = 2;
        this.c = ur4Var;
        this.d = uri;
        this.e = th;
    }
}
