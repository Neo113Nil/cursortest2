package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.util.Size;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.cast.zzff;
import com.google.android.gms.internal.p001authapiphone.zzab;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.vk.api.generated.messages.dto.MessagesFolderDto;
import com.vk.api.generated.messages.dto.MessagesSublistFilterDto;
import com.vk.api.generated.messages.dto.MessagesSublistInfoDto;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraft;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftCommonData;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftMusicInfo;
import com.vk.clips.sdk.drafts.dbmodels.ClipsDraftOrdDataInfo;
import com.vk.clips.sdk.drafts.models.ClipsDraftAudioEffectType;
import com.vk.dto.clips.model.ClipsEditorInputVideoItem;
import com.vk.dto.common.Image;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.Cash;
import com.vk.superapp.vkpay.checkout.data.model.GooglePay;
import com.vk.superapp.vkpay.checkout.data.model.NoVkPay;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import one.video.player.OneVideoPlayer;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.p4p;

/* compiled from: PlayAudioButtonTransformer.kt */
/* loaded from: classes16.dex */
public final class vua0 implements wq5, gn60, h5p, ouf0 {
    public static final vua0 b = new vua0();
    public static final sty c = new sty(0);
    public static final /* synthetic */ vua0 d = new vua0();

    public static ArrayList A(String str, List list, izs izsVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (drm0.D((CharSequence) izsVar.invoke(obj), str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List B(String str, List list) {
        if (drm0.N(str)) {
            return list;
        }
        String m = cqm0.m(drm0.p0(str).toString());
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (drm0.D(ob50.f((MusicTrack) obj), m, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList A = A(m, list, new x90(4));
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        hashSet.addAll(A);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (hashSet.contains((MusicTrack) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public static List C(String str, List list) {
        if (drm0.N(str)) {
            return list;
        }
        String m = cqm0.m(drm0.p0(str).toString());
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            String str2 = ((Playlist) obj).h;
            if (str2 == null) {
                str2 = "";
            }
            if (drm0.D(str2, m, true)) {
                arrayList.add(obj);
            }
        }
        ArrayList A = A(m, list, new y90(6));
        HashSet hashSet = new HashSet();
        hashSet.addAll(arrayList);
        hashSet.addAll(A);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (hashSet.contains((Playlist) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final otd D(ClipsDraft clipsDraft) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Long l;
        String str;
        float f;
        int i;
        String str2;
        String str3;
        ClipsDraftCommonData clipsDraftCommonData = clipsDraft.b;
        String str4 = clipsDraftCommonData.b;
        int i2 = clipsDraftCommonData.c;
        List<ClipsEditorInputVideoItem> list = clipsDraftCommonData.d;
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(bud.b((ClipsEditorInputVideoItem) it.next()));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        String str5 = clipsDraftCommonData.e;
        long j = clipsDraftCommonData.f;
        boolean z = clipsDraftCommonData.g;
        int i4 = clipsDraftCommonData.h;
        String str6 = clipsDraftCommonData.j;
        List<? extends List<ClipsDraftMusicInfo>> list2 = clipsDraftCommonData.l;
        if (list2 != null) {
            List<? extends List<ClipsDraftMusicInfo>> list3 = list2;
            arrayList = new ArrayList(c5g.u(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                List list4 = (List) it2.next();
                ArrayList arrayList5 = arrayList4;
                ArrayList arrayList6 = new ArrayList(c5g.u(list4, i3));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    ClipsDraftMusicInfo clipsDraftMusicInfo = (ClipsDraftMusicInfo) it3.next();
                    arrayList6.add(new vrd(p490.B(clipsDraftMusicInfo.b), clipsDraftMusicInfo.c, (ClipsDraftAudioEffectType) ClipsDraftAudioEffectType.h().get(clipsDraftMusicInfo.d.ordinal()), clipsDraftMusicInfo.e));
                    it3 = it3;
                    str4 = str4;
                    i2 = i2;
                    str5 = str5;
                }
                arrayList.add(arrayList6);
                arrayList4 = arrayList5;
                i3 = 10;
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList7 = arrayList4;
        String str7 = str4;
        int i5 = i2;
        String str8 = str5;
        float f2 = clipsDraftCommonData.m;
        ClipsDraftOrdDataInfo clipsDraftOrdDataInfo = clipsDraftCommonData.n;
        gtd gtdVar = clipsDraftOrdDataInfo != null ? new gtd(clipsDraftOrdDataInfo.b, clipsDraftOrdDataInfo.c, clipsDraftOrdDataInfo.d) : null;
        Long l2 = clipsDraftCommonData.o;
        boolean z2 = clipsDraftCommonData.i;
        String str9 = clipsDraftCommonData.k;
        if ((16384 & 16) != 0) {
            j = -1;
        }
        if ((16384 & 32) != 0) {
            z = true;
        }
        if ((16384 & 128) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((16384 & 1024) != 0) {
            arrayList = null;
        }
        float f3 = (16384 & 2048) != 0 ? 0.5625f : f2;
        gtd gtdVar2 = (16384 & 4096) != 0 ? null : gtdVar;
        if ((16384 & 8192) != 0) {
            arrayList2 = arrayList7;
            l = null;
            str = str9;
            str3 = str7;
            str2 = str8;
            f = f3;
            i = i5;
        } else {
            arrayList2 = arrayList7;
            l = l2;
            str = str9;
            f = f3;
            i = i5;
            str2 = str8;
            str3 = str7;
        }
        return new otd(new ptd(str3, i, arrayList2, str2, j, z, i4, z3, str6, str, arrayList, f, gtdVar2, l), clipsDraft.c);
    }

    public static final float E(androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1012642906, 0, -1, "com.vk.core.view.interop.ext.toDp (SizeExt.kt:30)");
        }
        throw alb0.c(1807745065, aVar);
    }

    public static final long F(Size size, androidx.compose.runtime.a aVar) {
        aVar.K(-1482894632);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1482894632, 0, -1, "com.vk.core.view.interop.ext.toDpSizeOrUnspecified (SizeExt.kt:17)");
        }
        if (size == null) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return 9205357640488583168L;
        }
        azl azlVar = (azl) aVar.r(uvi.h);
        int width = size.getWidth();
        Integer valueOf = Integer.valueOf(width);
        if (width < 0) {
            valueOf = null;
        }
        float j1 = valueOf != null ? azlVar.j1(valueOf.intValue()) : Float.NaN;
        int height = size.getHeight();
        Integer valueOf2 = height >= 0 ? Integer.valueOf(height) : null;
        long b2 = byc0.b(j1, valueOf2 != null ? azlVar.j1(valueOf2.intValue()) : Float.NaN);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return b2;
    }

    public static final List H(int i, int i2, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return EmptyList.b;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            rty rtyVar = (rty) arrayList.get(i3);
            int index = rtyVar.getIndex();
            if (i <= index && index <= i2) {
                arrayList2.add(rtyVar);
            }
        }
        g5g.L(arrayList2, c);
        return arrayList2;
    }

    public static final yd10 b() {
        return new yd10();
    }

    public static final void c(String str) {
        ImFeatures imFeatures = ImFeatures.IM_INTERRUPTIBLE_CMD;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures) && Thread.interrupted()) {
            throw new InterruptedException(str.concat(" was interrupted"));
        }
    }

    public static void d(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static String g(uy9 uy9Var, String str, String str2) {
        Long n;
        if (str == null || (n = arm0.n(str)) == null) {
            return null;
        }
        double longValue = n.longValue() / 100.0d;
        if (str2 == null) {
            str2 = "";
        }
        return uy9Var.b(longValue, str2, true).toString();
    }

    public static vua0 h(cxx[] cxxVarArr) {
        if (cxxVarArr.length > 31) {
            throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", cxxVarArr[0].getClass().getName(), Integer.valueOf(cxxVarArr.length)));
        }
        for (cxx cxxVar : cxxVarArr) {
            if (cxxVar.i()) {
                cxxVar.h();
            }
        }
        return new vua0();
    }

    @NonNull
    public static qg90 i(boolean z) {
        File u = z ? com.vk.core.files.a.u() : com.vk.core.files.a.s();
        int andIncrement = ll9.a.getAndIncrement();
        ll9.b.put(Integer.valueOf(andIncrement), u);
        ll9.c.put(Integer.valueOf(andIncrement), Boolean.valueOf(z));
        return new qg90(Integer.valueOf(andIncrement), u);
    }

    @NonNull
    public static zzab j(@NonNull Context context) {
        return new zzab(context);
    }

    public static Drawable k(int i, Context context) {
        Drawable e = krv0.e(i, context);
        if (e != null) {
            return e;
        }
        throw new NoSuchElementException(tgw.b(i, "Drawable ", " not found"));
    }

    public static File l(int i) {
        return (File) ll9.b.get(Integer.valueOf(i));
    }

    public static Drawable m(Context context, sr90 sr90Var) {
        T t = sr90Var.b;
        int a = sr90Var.a();
        if (t instanceof AddCardMethod) {
            return krv0.f(a, R.attr.vk_legacy_button_primary_background, context);
        }
        if (t instanceof Card) {
            return k(a, context);
        }
        if (t instanceof Cash) {
            return krv0.f(a, R.attr.vk_legacy_button_primary_background, context);
        }
        if (t instanceof GooglePay) {
            return k(a, context);
        }
        if (t instanceof NoVkPay) {
            return krv0.f(a, R.attr.vk_legacy_button_primary_background, context);
        }
        if (t instanceof VkPay) {
            return krv0.f(a, R.attr.vk_legacy_button_primary_background, context);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int n(y6b0 y6b0Var) {
        return y6b0Var.a.size() - 1;
    }

    public static final Object o(zo10 zo10Var) {
        Object c2 = zo10Var.c();
        doy doyVar = c2 instanceof doy ? (doy) c2 : null;
        if (doyVar != null) {
            return doyVar.p();
        }
        return null;
    }

    public static final com.vk.movika.sdk.player.base.model.a p(OneVideoPlayer oneVideoPlayer, int i, com.vk.movika.sdk.base.hooks.f fVar) {
        sht0 sht0Var;
        y6b0 U = oneVideoPlayer.U();
        com.vk.movika.sdk.player.base.model.a aVar = null;
        if (U != null) {
            try {
                sht0Var = U.a(i);
            } catch (Throwable unused) {
                sht0Var = null;
            }
            if (sht0Var != null) {
                HashMap hashMap = ((mj80) fVar.c).p;
                aVar = (com.vk.movika.sdk.player.base.model.a) hashMap.get(sht0Var);
                if (aVar == null) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.w, new Object[]{"OnePlayerComponents", "PlayerItemResolver: Can not resolve PlayerItem for source = " + sht0Var + ";\n\tsourceToItem = " + hashMap});
                    }
                }
            }
        }
        if (aVar != null) {
            L.E(new Exception(), tgw.b(i, "OneVideoPlayer.getPlayerItem: item for index ", " is null"));
        }
        return aVar;
    }

    public static final Integer q(OneVideoPlayer oneVideoPlayer) {
        int m0 = oneVideoPlayer.m0();
        Integer valueOf = Integer.valueOf(m0);
        if (m0 >= 0) {
            return valueOf;
        }
        return null;
    }

    public static boolean r() {
        PackageManager packageManager = e43.a.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.any");
    }

    public static boolean s(int i) {
        return ll9.b.containsKey(Integer.valueOf(i)) && ll9.c.containsKey(Integer.valueOf(i));
    }

    public static boolean t(int i) {
        Boolean bool = (Boolean) ll9.c.get(Integer.valueOf(i));
        return bool != null && bool.booleanValue();
    }

    public static final q630 u(q630 q630Var, Object obj) {
        return q630Var.g(new boy(obj));
    }

    public static ArrayList v(JSONArray jSONArray) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray optJSONArray = jSONObject.optJSONArray("included_peer_ids");
            ArrayList arrayList3 = null;
            if (optJSONArray != null) {
                ArrayList L = f370.L(optJSONArray);
                ArrayList arrayList4 = new ArrayList(c5g.u(L, 10));
                Iterator it = L.iterator();
                while (it.hasNext()) {
                    dq.h(((Number) it.next()).longValue(), arrayList4);
                }
                arrayList = arrayList4;
            } else {
                arrayList = null;
            }
            int i2 = jSONObject.getInt("id");
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            int i3 = jSONObject.getInt("flags");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("included_lists");
            if (optJSONArray2 != null) {
                arrayList3 = f370.O(optJSONArray2);
            }
            arrayList2.add(new MessagesFolderDto(i2, string, string2, i3, null, arrayList, arrayList3, 16, null));
        }
        return arrayList2;
    }

    public static ArrayList w(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("type");
            JSONObject jSONObject2 = jSONObject.getJSONObject("filter");
            arrayList.add(new MessagesSublistInfoDto(string2, new MessagesSublistFilterDto(jSONObject2.getInt("and"), jSONObject2.getInt("xor")), string, f370.D(jSONObject, "description")));
        }
        return arrayList;
    }

    public static final float y(int i, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1056157898, 0, -1, "com.vk.core.view.interop.ext.pxToDp (SizeExt.kt:27)");
        }
        float j1 = ((azl) aVar.r(uvi.h)).j1(i);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j1;
    }

    public static final void z(OneVideoPlayer oneVideoPlayer, final int i, com.vk.movika.sdk.base.logic.interactor.c cVar) {
        Object failure;
        b2p g0 = oneVideoPlayer.g0();
        if (g0 == null || g0.a.size() == 0) {
            cVar.invoke();
            return;
        }
        if (i < 0) {
            g0.b(cVar);
            return;
        }
        if (i > n(g0)) {
            cVar.invoke();
            return;
        }
        try {
            final b7q b7qVar = (b7q) g0;
            final com.vk.movika.sdk.base.ui.k kVar = new com.vk.movika.sdk.base.ui.k(7, new oj80(oneVideoPlayer, i, cVar), b7qVar);
            final fp0 fp0Var = new fp0(b7qVar, i, kVar, 1);
            b7qVar.e.addLast(new gzs() { // from class: xsna.z6q
                @Override // xsna.gzs
                public final Object invoke() {
                    return b7q.e(b7q.this, i, fp0Var, kVar);
                }
            });
            b7qVar.k();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            cVar.invoke();
        }
    }

    public List G(MyTargetNativeAdEntry myTargetNativeAdEntry) {
        ArrayList arrayList;
        gjx gjxVar = myTargetNativeAdEntry.B;
        if (gjxVar == null) {
            return EmptyList.b;
        }
        wjz0 content = gjxVar.getContent();
        if (content != null && (arrayList = content.h) != null) {
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                uy9 uy9Var = new uy9();
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                    wix wixVar = (wix) it.next();
                    String title = wixVar.getTitle();
                    kbz0 image = wixVar.getImage();
                    arrayList2.add(new lp50(wixVar, title, image != null ? up50.e(image) : Image.d, wixVar.b(), wixVar.c(), wixVar.getDescription(), wixVar.d(), g(uy9Var, wixVar.a(), wixVar.c()), g(uy9Var, wixVar.getPrice(), wixVar.c())));
                }
                return Collections.singletonList(new wq50(gjxVar, myTargetNativeAdEntry, arrayList2));
            }
        }
        return EmptyList.b;
    }

    @Override // xsna.wq5
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(String str, yzs yzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-234995847);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(yzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-234995847, i2, -1, "com.vk.clips.design.view.BroadcastFriendsView.setPrivacyInfoCellContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<no name provided>.Content (BroadcastFriendsView.kt:144)");
            }
            if (as.a((i2 & 112) | 8, yzsVar, tlw.a(new vlw(str, null), M, 0), M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hg8(i, 0, this, str, yzsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ouf0
    public void accept(Object obj, Object obj2) {
        ms01 ms01Var = (ms01) obj;
        o100 o100Var = a401.w;
        nwz0 nwz0Var = (nwz0) ms01Var.getService();
        ApiMetadata zza = zzff.zza(ms01Var.getContext());
        Parcel zza2 = nwz0Var.zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza2, zza);
        nwz0Var.zzd(19, zza2);
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }

    @Override // xsna.h5p
    public Object f(i4p i4pVar, ota0 ota0Var, Integer num, g5p g5pVar, p4p.b bVar) {
        fko0 fko0Var = (fko0) g5pVar;
        if (ota0Var == null) {
            return null;
        }
        if (fko0Var.I()) {
            return ota0Var;
        }
        lyk0 lyk0Var = alg.a;
        return alg.a(ota0Var, fko0Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return G((MyTargetNativeAdEntry) pair);
    }
}
