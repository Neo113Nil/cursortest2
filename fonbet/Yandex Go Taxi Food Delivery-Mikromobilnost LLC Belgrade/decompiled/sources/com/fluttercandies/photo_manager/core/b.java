package com.fluttercandies.photo_manager.core;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.resource.bitmap.j;
import com.fluttercandies.photo_manager.core.b;
import com.yandex.div.state.db.StateEntry;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.avu0;
import defpackage.b5r;
import defpackage.b64;
import defpackage.ba20;
import defpackage.ca20;
import defpackage.chb0;
import defpackage.d93;
import defpackage.da20;
import defpackage.ehb0;
import defpackage.ela1;
import defpackage.evu0;
import defpackage.fhb0;
import defpackage.goc;
import defpackage.gvu0;
import defpackage.h93;
import defpackage.ijs;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kkf;
import defpackage.lhb0;
import defpackage.mrs;
import defpackage.nub1;
import defpackage.ny61;
import defpackage.o3;
import defpackage.o6j0;
import defpackage.op70;
import defpackage.oyr;
import defpackage.ozj0;
import defpackage.p5j0;
import defpackage.ph91;
import defpackage.r7j0;
import defpackage.sls;
import defpackage.t0b0;
import defpackage.tcc;
import defpackage.tt5;
import defpackage.v2v;
import defpackage.vuz;
import defpackage.wfz;
import defpackage.wob1;
import defpackage.x920;
import defpackage.xme;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final class b implements ca20 {
    public static final ThreadPoolExecutor C = new ThreadPoolExecutor(8, Integer.MAX_VALUE, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
    public final chb0 A;
    public boolean B;
    public final Context a;
    public Activity b = null;
    public final t0b0 c;
    public final ehb0 w;
    public final lhb0 x;
    public final fhb0 y;
    public final a z;

    public b(Context context, tt5 tt5Var, t0b0 t0b0Var) {
        this.a = context;
        this.c = t0b0Var;
        t0b0Var.g = new vuz();
        this.w = new ehb0(context);
        this.x = new lhb0(context, this.b);
        this.y = new fhb0(context);
        this.z = new a(context, tt5Var, new Handler(Looper.getMainLooper()));
        this.A = new chb0(context);
    }

    public static b5r b(x920 x920Var) {
        Map map = (Map) x920Var.a(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX);
        if (map == null) {
            return null;
        }
        int intValue = ((Integer) map.get("type")).intValue();
        Map map2 = (Map) map.get("child");
        if (intValue == 0) {
            return new goc(map2);
        }
        if (intValue == 1) {
            return new kkf(map2);
        }
        ny61.r(oyr.j(intValue, "Unknown type ", " for filter option."));
        return null;
    }

    public final void a(Activity activity) {
        this.b = activity;
        t0b0 t0b0Var = this.c;
        t0b0Var.a = activity;
        t0b0Var.b = activity != null ? activity.getApplication() : null;
        this.w.b = activity;
        this.x.b = activity;
        this.y.b = activity;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0afc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(ozj0 ozj0Var, boolean z) {
        double[] dArr;
        int i;
        int i2;
        PendingIntent createFavoriteRequest;
        h93 q;
        int i3;
        String f;
        Cursor u;
        ArrayList m0;
        int i4;
        String f2;
        x920 x920Var = ozj0Var.b;
        String str = x920Var.a;
        if (str != null) {
            int hashCode = str.hashCode();
            ehb0 ehb0Var = this.w;
            chb0 chb0Var = this.A;
            switch (hashCode) {
                case -2060338679:
                    if (str.equals("saveImageWithPath")) {
                        try {
                            String str2 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                            String str3 = (String) x920Var.a("title");
                            String str4 = (String) x920Var.a("desc");
                            String str5 = str4 == null ? "" : str4;
                            String str6 = (String) x920Var.a("relativePath");
                            ozj0Var.a(xme.a(chb0Var.a().i(chb0Var.a, str2, str3, str5, str6 == null ? "" : str6, (Integer) x920Var.a("orientation"), (Double) x920Var.a("latitude"), (Double) x920Var.a("longitude"), (Long) x920Var.a("creationDate"))));
                            return;
                        } catch (Exception e) {
                            wfz.f(e, "save image error");
                            ozj0Var.b(str, null, e);
                            return;
                        }
                    }
                    break;
                case -1793329916:
                    if (str.equals("removeNoExistsAssets")) {
                        ozj0Var.a(Boolean.valueOf(chb0Var.a().a(chb0Var.a)));
                        return;
                    }
                    break;
                case -1701237244:
                    if (str.equals("getAssetCountFromPath")) {
                        ozj0Var.a(Integer.valueOf(chb0Var.a().k(((Number) x920Var.a("type")).intValue(), b(x920Var), chb0Var.a, (String) x920Var.a("id"))));
                        return;
                    }
                    break;
                case -1491493556:
                    if (str.equals("getPathRelativePath")) {
                        ozj0Var.a(chb0Var.a().n(chb0Var.a, (String) x920Var.a("id")));
                        return;
                    }
                    break;
                case -1491271588:
                    if (str.equals("getColumnNames")) {
                        ozj0Var.a(chb0Var.a().w(chb0Var.a));
                        return;
                    }
                    break;
                case -1283288098:
                    if (str.equals("getLatLngAndroidQ")) {
                        String str7 = (String) x920Var.a("id");
                        Double valueOf = Double.valueOf(0.0d);
                        com.fluttercandies.photo_manager.core.utils.b a = chb0Var.a();
                        Context context = chb0Var.a;
                        d93 A = a.A(context, str7);
                        if (A != null && (i = A.g) != 3) {
                            if (i == 2) {
                                try {
                                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                    mediaMetadataRetriever.setDataSource(A.b);
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                                    mediaMetadataRetriever.release();
                                    if (extractMetadata != null) {
                                        try {
                                            String n0 = evu0.n0(extractMetadata, '/');
                                            int length = n0.length();
                                            int i5 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                    i2 = (n0.charAt(i2) == '+' || n0.charAt(i2) == '-') ? 0 : i2 + 1;
                                                    i5++;
                                                    if (i5 == 2) {
                                                    }
                                                } else {
                                                    i2 = -1;
                                                }
                                            }
                                            if (i2 > 0) {
                                                String A0 = gvu0.A0(i2, n0);
                                                String substring = n0.substring(i2);
                                                Double i6 = avu0.i(A0);
                                                if (i6 != null) {
                                                    double doubleValue = i6.doubleValue();
                                                    Double i7 = avu0.i(substring);
                                                    if (i7 != null) {
                                                        dArr = new double[]{doubleValue, i7.doubleValue()};
                                                    }
                                                }
                                            }
                                        } catch (Exception e2) {
                                            wfz.h(e2);
                                        }
                                    }
                                } catch (Exception e3) {
                                    wfz.h(e3);
                                }
                            } else if (i == 1) {
                                try {
                                    androidx.exifinterface.media.a B = a.B(context, str7);
                                    if (B != null) {
                                        dArr = B.h();
                                    }
                                } catch (Exception e4) {
                                    wfz.h(e4);
                                }
                            }
                            ozj0Var.a(dArr != null ? kotlin.collections.b.i(new Pair("lat", valueOf), new Pair("lng", valueOf)) : kotlin.collections.b.i(new Pair("lat", Double.valueOf(dArr[0])), new Pair("lng", Double.valueOf(dArr[1]))));
                            return;
                        }
                        dArr = null;
                        ozj0Var.a(dArr != null ? kotlin.collections.b.i(new Pair("lat", valueOf), new Pair("lng", valueOf)) : kotlin.collections.b.i(new Pair("lat", Double.valueOf(dArr[0])), new Pair("lng", Double.valueOf(dArr[1]))));
                        return;
                    }
                    break;
                case -1257373420:
                    if (str.equals("moveAssetsToPath")) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 < 30) {
                            wfz.h("moveAssetsToPath requires Android 11+ (API 30+)");
                            ozj0.c(ozj0Var, "moveAssetsToPath requires Android 11+ (API 30+)", "Current API level: " + i8, 4);
                            return;
                        }
                        try {
                            List list = (List) x920Var.a("assetIds");
                            String str8 = (String) x920Var.a("targetPath");
                            List list2 = list;
                            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(chb0Var.b((String) it.next()));
                            }
                            if (arrayList.isEmpty()) {
                                ozj0.c(ozj0Var, "No valid URIs found for the given asset IDs", null, 6);
                                return;
                            } else {
                                this.x.a(arrayList, str8, ozj0Var);
                                return;
                            }
                        } catch (Exception e5) {
                            wfz.f(e5, "moveAssetsToPath failed");
                            ozj0.c(ozj0Var, "moveAssetsToPath failed", e5.getMessage(), 4);
                            return;
                        }
                    }
                    break;
                case -1167306339:
                    if (str.equals("getAssetListPaged")) {
                        String str9 = (String) x920Var.a("id");
                        int intValue = ((Number) x920Var.a("type")).intValue();
                        int intValue2 = ((Number) x920Var.a(Constants.KEY_PAGE)).intValue();
                        int intValue3 = ((Number) x920Var.a("size")).intValue();
                        b5r b = b(x920Var);
                        chb0Var.getClass();
                        ozj0Var.a(xme.b(chb0Var.a().b(chb0Var.a, str9.equals("isAll") ? "" : str9, intValue2, intValue3, intValue, b)));
                        return;
                    }
                    break;
                case -1165452507:
                    if (str.equals("getAssetListRange")) {
                        String str10 = (String) x920Var.a("id");
                        int intValue4 = ((Number) x920Var.a("type")).intValue();
                        int intValue5 = ((Number) x920Var.a("start")).intValue();
                        int intValue6 = ((Number) x920Var.a("end")).intValue();
                        b5r b2 = b(x920Var);
                        chb0Var.getClass();
                        ozj0Var.a(xme.b(chb0Var.a().F(chb0Var.a, str10.equals("isAll") ? "" : str10, intValue5, intValue6, intValue4, b2)));
                        return;
                    }
                    break;
                case -1039689911:
                    if (str.equals("notify")) {
                        boolean l = jl40.l((Boolean) x920Var.a("notify"), Boolean.TRUE);
                        a aVar = this.z;
                        if (l) {
                            boolean z2 = aVar.b;
                            Context context2 = aVar.a;
                            if (!z2) {
                                PhotoManagerNotifyChannel$MediaObserver photoManagerNotifyChannel$MediaObserver = aVar.d;
                                Uri uri = aVar.g;
                                context2.getContentResolver().registerContentObserver(uri, true, photoManagerNotifyChannel$MediaObserver);
                                photoManagerNotifyChannel$MediaObserver.setUri(uri);
                                PhotoManagerNotifyChannel$MediaObserver photoManagerNotifyChannel$MediaObserver2 = aVar.c;
                                Uri uri2 = aVar.h;
                                context2.getContentResolver().registerContentObserver(uri2, true, photoManagerNotifyChannel$MediaObserver2);
                                photoManagerNotifyChannel$MediaObserver2.setUri(uri2);
                                PhotoManagerNotifyChannel$MediaObserver photoManagerNotifyChannel$MediaObserver3 = aVar.e;
                                Uri uri3 = aVar.i;
                                context2.getContentResolver().registerContentObserver(uri3, true, photoManagerNotifyChannel$MediaObserver3);
                                photoManagerNotifyChannel$MediaObserver3.setUri(uri3);
                                aVar.b = true;
                            }
                        } else {
                            Context context3 = aVar.a;
                            if (aVar.b) {
                                aVar.b = false;
                                context3.getContentResolver().unregisterContentObserver(aVar.d);
                                context3.getContentResolver().unregisterContentObserver(aVar.c);
                                context3.getContentResolver().unregisterContentObserver(aVar.e);
                            }
                        }
                        ozj0Var.a(null);
                        return;
                    }
                    break;
                case -1033607060:
                    if (str.equals("moveToTrash")) {
                        try {
                            List list3 = (List) x920Var.a("ids");
                            if (Build.VERSION.SDK_INT < 30) {
                                wfz.h("The API 29 or lower have not the IS_TRASHED row in MediaStore.");
                                ozj0Var.b("The api not support 29 or lower.", "", new UnsupportedOperationException("The api cannot be used in 29 or lower."));
                                return;
                            }
                            List list4 = list3;
                            ArrayList arrayList2 = new ArrayList(tcc.n(list4, 10));
                            Iterator it2 = list4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(chb0Var.b((String) it2.next()));
                            }
                            ehb0Var.d(kotlin.collections.a.J0(arrayList2), ozj0Var);
                            return;
                        } catch (Exception e6) {
                            wfz.f(e6, "deleteWithIds failed");
                            ozj0.c(ozj0Var, "deleteWithIds failed", null, 6);
                            return;
                        }
                    }
                    break;
                case -948382752:
                    if (str.equals("requestCacheAssetsThumb")) {
                        List list5 = (List) x920Var.a("ids");
                        Map map = (Map) x920Var.a(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX);
                        int intValue7 = ((Integer) map.get("width")).intValue();
                        int intValue8 = ((Integer) map.get("height")).intValue();
                        int intValue9 = ((Integer) map.get("format")).intValue();
                        long intValue10 = ((Integer) map.get("frame")).intValue();
                        if (intValue9 == 0) {
                            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        } else {
                            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                        }
                        ArrayList arrayList3 = chb0Var.c;
                        com.fluttercandies.photo_manager.core.utils.b a2 = chb0Var.a();
                        Context context4 = chb0Var.a;
                        Iterator it3 = a2.e(context4, list5).iterator();
                        while (it3.hasNext()) {
                            p5j0 K = Glide.with(context4).asBitmap().a(((r7j0) new r7j0().t(j.d, Long.valueOf(intValue10))).q(Priority.LOW)).K((String) it3.next());
                            K.getClass();
                            o6j0 o6j0Var = new o6j0(intValue7, intValue8);
                            K.F(o6j0Var, o6j0Var, K, ph91.b);
                            arrayList3.add(o6j0Var);
                        }
                        ozj0Var.a(1);
                        Iterator it4 = kotlin.collections.a.J0(arrayList3).iterator();
                        while (it4.hasNext()) {
                            chb0.d.execute(new op70(29, (o6j0) it4.next()));
                        }
                        return;
                    }
                    break;
                case -904801612:
                    if (str.equals("favoriteAsset")) {
                        String str11 = (String) x920Var.a("id");
                        boolean booleanValue = ((Boolean) x920Var.a("favorite")).booleanValue();
                        if (Build.VERSION.SDK_INT < 30) {
                            wfz.h("The API 30 or lower have no IS_FAVORITE row in MediaStore.");
                            ozj0Var.a(Boolean.FALSE);
                            return;
                        }
                        Uri b3 = chb0Var.b(str11);
                        fhb0 fhb0Var = this.y;
                        fhb0Var.c = ozj0Var;
                        createFavoriteRequest = MediaStore.createFavoriteRequest(fhb0Var.a.getContentResolver(), Collections.singleton(b3), booleanValue);
                        Activity activity = fhb0Var.b;
                        if (activity != null) {
                            activity.startIntentSenderForResult(createFavoriteRequest.getIntentSender(), 40071, null, 0, 0, 0);
                            return;
                        }
                        return;
                    }
                    break;
                case -886445535:
                    if (str.equals("getFullFile")) {
                        ozj0Var.a(chb0Var.a().z(chb0Var.a, (String) x920Var.a("id"), !z ? false : ((Boolean) x920Var.a("isOrigin")).booleanValue()));
                        return;
                    }
                    break;
                case -626940993:
                    if (str.equals("moveAssetToPath")) {
                        String str12 = (String) x920Var.a("assetId");
                        String str13 = (String) x920Var.a("albumId");
                        chb0Var.getClass();
                        try {
                            ozj0Var.a(xme.a(chb0Var.a().D(chb0Var.a, str12, str13)));
                            return;
                        } catch (Exception e7) {
                            wfz.h(e7);
                            ozj0Var.b("moveAsset", "Failed to move asset " + str12 + " to album " + str13, e7);
                            return;
                        }
                    }
                    break;
                case -151967598:
                    if (str.equals("fetchPathProperties")) {
                        String str14 = (String) x920Var.a("id");
                        int intValue11 = ((Number) x920Var.a("type")).intValue();
                        b5r b4 = b(x920Var);
                        Context context5 = chb0Var.a;
                        if (str14.equals("isAll")) {
                            ArrayList m = chb0Var.a().m(context5, intValue11, b4);
                            if (!m.isEmpty()) {
                                Iterator it5 = m.iterator();
                                int i9 = 0;
                                while (it5.hasNext()) {
                                    i9 += ((h93) it5.next()).c;
                                }
                                q = new h93("isAll", true, "Recent", i9, intValue11, 32);
                                if (b4 != null && b4.a()) {
                                    chb0Var.a().c(context5, q);
                                }
                                if (q == null) {
                                    ozj0Var.a(xme.c(Collections.singletonList(q)));
                                    return;
                                } else {
                                    ozj0Var.a(null);
                                    return;
                                }
                            }
                            q = null;
                            if (q == null) {
                            }
                        } else {
                            q = chb0Var.a().q(intValue11, b4, context5, str14);
                            if (q != null) {
                                if (b4 != null && b4.a()) {
                                    chb0Var.a().c(context5, q);
                                }
                                if (q == null) {
                                }
                            }
                            q = null;
                            if (q == null) {
                            }
                        }
                    }
                    break;
                case 163601886:
                    if (str.equals("saveImage")) {
                        try {
                            byte[] bArr = (byte[]) x920Var.a("image");
                            String str15 = (String) x920Var.a("filename");
                            String str16 = (String) x920Var.a("title");
                            String str17 = str16 == null ? "" : str16;
                            String str18 = (String) x920Var.a("desc");
                            String str19 = str18 == null ? "" : str18;
                            String str20 = (String) x920Var.a("relativePath");
                            ozj0Var.a(xme.a(chb0Var.a().p(chb0Var.a, bArr, str15, str17, str19, str20 == null ? "" : str20, (Integer) x920Var.a("orientation"), (Double) x920Var.a("latitude"), (Double) x920Var.a("longitude"), (Long) x920Var.a("creationDate"))));
                            return;
                        } catch (Exception e8) {
                            wfz.f(e8, "save image error");
                            ozj0Var.b(str, null, e8);
                            return;
                        }
                    }
                    break;
                case 175491326:
                    if (str.equals("saveVideo")) {
                        try {
                            String str21 = (String) x920Var.a(StateEntry.COLUMN_PATH);
                            String str22 = (String) x920Var.a("title");
                            String str23 = (String) x920Var.a("desc");
                            String str24 = str23 == null ? "" : str23;
                            String str25 = (String) x920Var.a("relativePath");
                            ozj0Var.a(xme.a(chb0Var.a().C(chb0Var.a, str21, str22, str24, str25 == null ? "" : str25, (Integer) x920Var.a("orientation"), (Double) x920Var.a("latitude"), (Double) x920Var.a("longitude"), (Long) x920Var.a("creationDate"))));
                            return;
                        } catch (Exception e9) {
                            wfz.f(e9, "save video error");
                            ozj0Var.b(str, null, e9);
                            return;
                        }
                    }
                    break;
                case 326673488:
                    if (str.equals("fetchEntityProperties")) {
                        String str26 = (String) x920Var.a("id");
                        com.fluttercandies.photo_manager.core.utils.b a3 = chb0Var.a();
                        Context context6 = chb0Var.a;
                        v2v v2vVar = com.fluttercandies.photo_manager.core.utils.b.a;
                        d93 A2 = a3.A(context6, str26);
                        ozj0Var.a(A2 != null ? xme.a(A2) : null);
                        return;
                    }
                    break;
                case 624480877:
                    if (str.equals("getAssetsByRange")) {
                        b5r b5 = b(x920Var);
                        int intValue12 = ((Number) x920Var.a("start")).intValue();
                        int intValue13 = ((Number) x920Var.a("end")).intValue();
                        int intValue14 = ((Number) x920Var.a("type")).intValue();
                        com.fluttercandies.photo_manager.core.utils.b a4 = chb0Var.a();
                        Context context7 = chb0Var.a;
                        ContentResolver contentResolver = context7.getContentResolver();
                        ArrayList arrayList4 = new ArrayList();
                        if (b5 != null) {
                            i3 = 0;
                            f = b5.b(intValue14, arrayList4, false);
                        } else {
                            i3 = 0;
                            f = ela1.f(intValue14);
                        }
                        u = a4.u(contentResolver, a4.g(), a4.s(), f, (String[]) arrayList4.toArray(new String[i3]), b5 != null ? b5.c() : null);
                        try {
                            Cursor cursor = u;
                            ArrayList arrayList5 = new ArrayList();
                            cursor.moveToPosition(intValue12 - 1);
                            while (cursor.moveToNext()) {
                                d93 d = nub1.d(context7, 12, cursor, false);
                                if (d != null) {
                                    arrayList5.add(d);
                                    if (arrayList5.size() == intValue13 - intValue12) {
                                        u.close();
                                        ozj0Var.a(xme.b(arrayList5));
                                        return;
                                    }
                                }
                            }
                            u.close();
                            ozj0Var.a(xme.b(arrayList5));
                            return;
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    break;
                case 857200492:
                    if (str.equals("assetExists")) {
                        String str27 = (String) x920Var.a("id");
                        com.fluttercandies.photo_manager.core.utils.b a5 = chb0Var.a();
                        u = a5.u(chb0Var.a.getContentResolver(), a5.g(), new String[]{ClidProvider._ID}, "_id = ?", new String[]{str27}, null);
                        try {
                            boolean z3 = u.getCount() >= 1;
                            u.close();
                            ozj0Var.a(Boolean.valueOf(z3));
                            return;
                        } finally {
                        }
                    }
                    break;
                case 972925196:
                    if (str.equals("cancelCacheRequests")) {
                        ArrayList arrayList6 = chb0Var.c;
                        List J0 = kotlin.collections.a.J0(arrayList6);
                        arrayList6.clear();
                        Iterator it6 = J0.iterator();
                        while (it6.hasNext()) {
                            Glide.with(chb0Var.a).clear((o6j0) it6.next());
                        }
                        ozj0Var.a(null);
                        return;
                    }
                    break;
                case 1063055279:
                    if (str.equals("getOriginBytes")) {
                        String str28 = (String) x920Var.a("id");
                        Context context8 = chb0Var.a;
                        com.fluttercandies.photo_manager.core.utils.b a6 = chb0Var.a();
                        Context context9 = chb0Var.a;
                        v2v v2vVar2 = com.fluttercandies.photo_manager.core.utils.b.a;
                        d93 A3 = a6.A(context9, str28);
                        if (A3 == null) {
                            ozj0.c(ozj0Var, "202", "Failed to find the asset ".concat(str28), 4);
                            return;
                        }
                        try {
                            ozj0Var.a(chb0Var.a().y(context8, A3, z));
                            return;
                        } catch (Exception e10) {
                            chb0Var.a().j(context8, str28);
                            ozj0Var.b("202", "get originBytes error", e10);
                            return;
                        }
                    }
                    break;
                case 1150344167:
                    if (str.equals("deleteWithIds")) {
                        try {
                            List<String> list6 = (List) x920Var.a("ids");
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                List list7 = list6;
                                ArrayList arrayList7 = new ArrayList(tcc.n(list7, 10));
                                Iterator it7 = list7.iterator();
                                while (it7.hasNext()) {
                                    arrayList7.add(chb0Var.b((String) it7.next()));
                                }
                                ehb0Var.b(kotlin.collections.a.J0(arrayList7), ozj0Var);
                                return;
                            }
                            if (i10 != 29) {
                                ehb0Var.a(list6);
                                ozj0Var.a(list6);
                                return;
                            }
                            HashMap hashMap = new HashMap();
                            for (String str29 : list6) {
                                hashMap.put(str29, chb0Var.b(str29));
                            }
                            ehb0Var.c(hashMap, ozj0Var);
                            return;
                        } catch (Exception e11) {
                            wfz.f(e11, "deleteWithIds failed");
                            ozj0.c(ozj0Var, "deleteWithIds failed", null, 6);
                            return;
                        }
                    }
                    break;
                case 1177116769:
                    if (str.equals("getMediaUrl")) {
                        ozj0Var.a(chb0Var.a().r(((Number) x920Var.a("type")).intValue(), Long.parseLong((String) x920Var.a("id")), chb0Var.a));
                        return;
                    }
                    break;
                case 1375013309:
                    if (str.equals("getAssetPathList")) {
                        int intValue15 = ((Number) x920Var.a("type")).intValue();
                        boolean booleanValue2 = ((Boolean) x920Var.a("hasAll")).booleanValue();
                        b5r b6 = b(x920Var);
                        boolean booleanValue3 = ((Boolean) x920Var.a("onlyAll")).booleanValue();
                        Context context10 = chb0Var.a;
                        if (booleanValue3) {
                            m0 = chb0Var.a().x(context10, intValue15, b6);
                        } else {
                            ArrayList m2 = chb0Var.a().m(context10, intValue15, b6);
                            if (booleanValue2) {
                                Iterator it8 = m2.iterator();
                                int i11 = 0;
                                while (it8.hasNext()) {
                                    i11 += ((h93) it8.next()).c;
                                }
                                m0 = kotlin.collections.a.m0(m2, Collections.singletonList(new h93("isAll", true, "Recent", i11, intValue15, 32)));
                            } else {
                                m0 = m2;
                            }
                        }
                        ozj0Var.a(xme.c(m0));
                        return;
                    }
                    break;
                case 1477946491:
                    if (str.equals("copyAsset")) {
                        String str30 = (String) x920Var.a("assetId");
                        String str31 = (String) x920Var.a("galleryId");
                        chb0Var.getClass();
                        try {
                            ozj0Var.a(xme.a(chb0Var.a().f(chb0Var.a, str30, str31)));
                            return;
                        } catch (Exception e12) {
                            wfz.h(e12);
                            ozj0Var.b("copyAsset", "Failed to copy asset " + str30 + " to gallery " + str31, e12);
                            return;
                        }
                    }
                    break;
                case 1806009333:
                    if (str.equals("getAssetCount")) {
                        b5r b7 = b(x920Var);
                        int intValue16 = ((Number) x920Var.a("type")).intValue();
                        com.fluttercandies.photo_manager.core.utils.b a7 = chb0Var.a();
                        ContentResolver contentResolver2 = chb0Var.a.getContentResolver();
                        ArrayList arrayList8 = new ArrayList();
                        if (b7 != null) {
                            i4 = 0;
                            f2 = b7.b(intValue16, arrayList8, false);
                        } else {
                            i4 = 0;
                            f2 = ela1.f(intValue16);
                        }
                        u = a7.u(contentResolver2, a7.g(), new String[]{ClidProvider._ID}, f2, (String[]) arrayList8.toArray(new String[i4]), b7 != null ? b7.c() : null);
                        try {
                            int count = u.getCount();
                            u.close();
                            ozj0Var.a(Integer.valueOf(count));
                            return;
                        } finally {
                        }
                    }
                    break;
                case 1966168096:
                    if (str.equals("getThumb")) {
                        String str32 = (String) x920Var.a("id");
                        Map map2 = (Map) x920Var.a(PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX);
                        int intValue17 = ((Integer) map2.get("width")).intValue();
                        int intValue18 = ((Integer) map2.get("height")).intValue();
                        int intValue19 = ((Integer) map2.get("format")).intValue();
                        int intValue20 = ((Integer) map2.get("quality")).intValue();
                        long intValue21 = ((Integer) map2.get("frame")).intValue();
                        Bitmap.CompressFormat compressFormat3 = intValue19 == 0 ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG;
                        chb0Var.getClass();
                        Context context11 = chb0Var.a;
                        try {
                            com.fluttercandies.photo_manager.core.utils.b a8 = chb0Var.a();
                            v2v v2vVar3 = com.fluttercandies.photo_manager.core.utils.b.a;
                            d93 A4 = a8.A(context11, str32);
                            if (A4 == null) {
                                ozj0.c(ozj0Var, "201", "Failed to find the asset ".concat(str32), 4);
                            } else {
                                wob1.d(chb0Var.a, A4, intValue17, intValue18, compressFormat3, intValue20, intValue21, ozj0Var);
                            }
                            return;
                        } catch (Exception e13) {
                            StringBuilder u2 = b64.u(intValue17, "get ", str32, " thumbnail error, width : ", ", height: ");
                            u2.append(intValue18);
                            Log.e("PhotoManager", u2.toString(), e13);
                            chb0Var.a().j(context11, str32);
                            ozj0Var.b("201", "get thumb error", e13);
                            return;
                        }
                    }
                    break;
            }
        }
        if (ozj0Var.c) {
            return;
        }
        ozj0Var.c = true;
        ozj0.d.post(new mrs(ozj0Var.a, 3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        final ozj0 ozj0Var = new ozj0(x920Var, (ba20) da20Var);
        String str = x920Var.a;
        boolean y = j73.y(new String[]{"log", "openSetting", "forceOldApi", "systemVersion", "clearFileCache", "releaseMemoryCache", "ignorePermissionCheck", "getPermissionState"}, str);
        final int i = 1;
        ThreadPoolExecutor threadPoolExecutor = C;
        Context context = this.a;
        t0b0 t0b0Var = this.c;
        if (!y) {
            if (!j73.y(new String[]{"requestPermissionExtend", "presentLimited"}, str)) {
                if (this.B) {
                    threadPoolExecutor.execute(new ijs(23, new sls(this) { // from class: ghb0
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i2 = i;
                            zy11 zy11Var = zy11.a;
                            ozj0 ozj0Var2 = ozj0Var;
                            b bVar = this.b;
                            switch (i2) {
                                case 0:
                                    chb0 chb0Var = bVar.A;
                                    Context context2 = chb0Var.a;
                                    Glide.get(context2).clearDiskCache();
                                    chb0Var.a().h(context2);
                                    ozj0Var2.a(1);
                                    break;
                                default:
                                    try {
                                        t0b0 t0b0Var2 = bVar.c;
                                        bVar.c(ozj0Var2, t0b0Var2.c.c(bVar.a));
                                        break;
                                    } catch (Exception e) {
                                        x920 x920Var2 = ozj0Var2.b;
                                        String str2 = x920Var2.a;
                                        ozj0Var2.b(b64.l("The ", str2, " method has an error: ", e.getMessage()), ljo.b(e), x920Var2.b);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }));
                    return;
                } else {
                    threadPoolExecutor.execute(new ijs(23, new sls(this) { // from class: ghb0
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i2 = i;
                            zy11 zy11Var = zy11.a;
                            ozj0 ozj0Var2 = ozj0Var;
                            b bVar = this.b;
                            switch (i2) {
                                case 0:
                                    chb0 chb0Var = bVar.A;
                                    Context context2 = chb0Var.a;
                                    Glide.get(context2).clearDiskCache();
                                    chb0Var.a().h(context2);
                                    ozj0Var2.a(1);
                                    break;
                                default:
                                    try {
                                        t0b0 t0b0Var2 = bVar.c;
                                        bVar.c(ozj0Var2, t0b0Var2.c.c(bVar.a));
                                        break;
                                    } catch (Exception e) {
                                        x920 x920Var2 = ozj0Var2.b;
                                        String str2 = x920Var2.a;
                                        ozj0Var2.b(b64.l("The ", str2, " method has an error: ", e.getMessage()), ljo.b(e), x920Var2.b);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }));
                    return;
                }
            }
            if (!str.equals("requestPermissionExtend")) {
                if (str.equals("presentLimited")) {
                    t0b0Var.c.f(t0b0Var, ((Number) x920Var.a("type")).intValue(), ozj0Var);
                    return;
                }
                return;
            }
            Map map = (Map) x920Var.a("androidPermission");
            int intValue = ((Integer) map.get("type")).intValue();
            boolean booleanValue = ((Boolean) map.get("mediaLocation")).booleanValue();
            Activity activity = this.b;
            t0b0Var.a = activity;
            t0b0Var.b = activity != null ? activity.getApplication() : null;
            t0b0Var.g = new o3(ozj0Var, this, intValue, booleanValue);
            t0b0Var.c.g(t0b0Var, context, intValue, booleanValue);
            return;
        }
        switch (str.hashCode()) {
            case -2095961652:
                if (str.equals("getPermissionState")) {
                    Map map2 = (Map) x920Var.a("androidPermission");
                    int intValue2 = ((Integer) map2.get("type")).intValue();
                    ozj0Var.a(Integer.valueOf(t0b0Var.c.a(t0b0Var.b, intValue2).getValue()));
                    break;
                }
                break;
            case -1914421335:
                if (str.equals("systemVersion")) {
                    ozj0Var.a(String.valueOf(Build.VERSION.SDK_INT));
                    break;
                }
                break;
            case -582375106:
                if (str.equals("forceOldApi")) {
                    this.A.b = true;
                    ozj0Var.a(1);
                    break;
                }
                break;
            case 107332:
                if (str.equals("log")) {
                    Boolean bool = (Boolean) x920Var.b;
                    wfz.c = bool != null ? bool.booleanValue() : false;
                    ozj0Var.a(1);
                    break;
                }
                break;
            case 1138660423:
                if (str.equals("ignorePermissionCheck")) {
                    Boolean bool2 = (Boolean) x920Var.a("ignore");
                    this.B = bool2.booleanValue();
                    ozj0Var.a(bool2);
                    break;
                }
                break;
            case 1541932953:
                if (str.equals("clearFileCache")) {
                    Glide.get(context).clearMemory();
                    final Object[] objArr = null == true ? 1 : 0;
                    threadPoolExecutor.execute(new ijs(23, new sls(this) { // from class: ghb0
                        public final /* synthetic */ b b;

                        {
                            this.b = this;
                        }

                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i2 = objArr;
                            zy11 zy11Var = zy11.a;
                            ozj0 ozj0Var2 = ozj0Var;
                            b bVar = this.b;
                            switch (i2) {
                                case 0:
                                    chb0 chb0Var = bVar.A;
                                    Context context2 = chb0Var.a;
                                    Glide.get(context2).clearDiskCache();
                                    chb0Var.a().h(context2);
                                    ozj0Var2.a(1);
                                    break;
                                default:
                                    try {
                                        t0b0 t0b0Var2 = bVar.c;
                                        bVar.c(ozj0Var2, t0b0Var2.c.c(bVar.a));
                                        break;
                                    } catch (Exception e) {
                                        x920 x920Var2 = ozj0Var2.b;
                                        String str2 = x920Var2.a;
                                        ozj0Var2.b(b64.l("The ", str2, " method has an error: ", e.getMessage()), ljo.b(e), x920Var2.b);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }));
                    break;
                }
                break;
            case 1789114534:
                if (str.equals("openSetting")) {
                    Activity activity2 = this.b;
                    t0b0Var.getClass();
                    Intent intent = new Intent();
                    intent.addFlags(SelfTester_JCP.IMITA);
                    intent.addFlags(1073741824);
                    intent.addFlags(SelfTester_JCP.ENCRYPT_CNT);
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.fromParts("package", activity2.getPackageName(), null));
                    activity2.startActivity(intent);
                    ozj0Var.a(1);
                    break;
                }
                break;
            case 1920532602:
                if (str.equals("releaseMemoryCache")) {
                    ozj0Var.a(1);
                    break;
                }
                break;
        }
    }
}
