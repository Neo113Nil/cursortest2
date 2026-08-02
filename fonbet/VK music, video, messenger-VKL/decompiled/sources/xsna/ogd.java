package xsna;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.widget.Button;
import com.coremedia.iso.boxes.MetaBox;
import com.vk.api.generated.account.dto.AccountModelDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog2.common.dto.api.music.CatalogConcertItem;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.feature.music.dto.ui.UIBlockConcert;
import com.vk.catalog2.feature.music.holders.concert.ConcertVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import xsna.dw20;
import xsna.ifu0;
import xsna.rgd;
import xsna.sn4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ogd implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ogd(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r13v42, types: [T, java.util.List] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float f;
        File file;
        String str;
        SQLiteDatabase h;
        switch (this.b) {
            case 0:
                ClipsEditorMusicInfo clipsEditorMusicInfo = (ClipsEditorMusicInfo) this.c;
                rgd rgdVar = (rgd) this.d;
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) this.e;
                sn4 sn4Var = (sn4) obj;
                if (sn4Var instanceof sn4.b) {
                    file = ((sn4.b) sn4Var).a;
                    f = 1.0f;
                } else {
                    if (!(sn4Var instanceof sn4.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = ((sn4.a) sn4Var).a;
                    file = null;
                }
                if (file != null) {
                    rgdVar.a(ClipsEditorMusicInfo.zb(clipsEditorMusicInfo, null, "file://" + file.getPath(), 0, 0, 0, file.getAbsolutePath(), 0, 2013));
                    rgd.a aVar = rgdVar.b;
                    aVar.b.W0();
                    aVar.a.n0(file, 0L);
                    fVar.onComplete();
                } else {
                    fVar.onNext(Integer.valueOf((int) (f * 100)));
                }
                return s3q0.a;
            case 1:
                ConcertVh concertVh = (ConcertVh) this.c;
                UIBlock uIBlock = (UIBlock) this.d;
                Context context = (Context) this.e;
                CommonAudioStat$TypeAudioArtistClickItem.EventType eventType = CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_CLICK;
                CatalogConcertItem catalogConcertItem = ((UIBlockConcert) uIBlock).z;
                concertVh.a(eventType, catalogConcertItem.d);
                concertVh.e.a(new cfp0(uIBlock, catalogConcertItem.b.i));
                maz e = concertVh.c.e();
                String str2 = catalogConcertItem.b.i;
                LaunchContext.a aVar2 = new LaunchContext.a();
                aVar2.d = uIBlock.f;
                maz.c(e, context, str2, aVar2.a(), null, null, 24);
                return s3q0.a;
            case 2:
                com.vk.ml.b bVar = (com.vk.ml.b) this.c;
                String str3 = (String) this.d;
                AccountModelDto accountModelDto = (AccountModelDto) this.e;
                String str4 = (String) obj;
                str = "";
                if (str4.length() != 0) {
                    File file2 = new File(str4);
                    String C = com.vk.core.files.a.C(file2);
                    str = C != null ? C : "";
                    vhk0.b(file2);
                }
                j330 j330Var = bVar.d;
                if (j330Var == null) {
                    return null;
                }
                Integer f2 = accountModelDto.f();
                int intValue = f2 != null ? f2.intValue() : 0;
                ContentValues contentValues = new ContentValues();
                contentValues.put(MetaBox.TYPE, str);
                contentValues.put("meta_version", Integer.valueOf(intValue));
                x330 x330Var = (x330) j330Var.a.getValue();
                return Boolean.valueOf(((x330Var == null || (h = x330Var.h(new m130(x330Var, 1))) == null) ? 0 : h.update("models", contentValues, "feature_name = ?", new String[]{str3})) > 0);
            case 3:
                ArrayList arrayList = (ArrayList) this.c;
                izs izsVar = (izs) this.d;
                izs izsVar2 = (izs) this.e;
                List list = (List) obj;
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.size() > list.size()) {
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((gza0) it.next()).a);
                    }
                    List list2 = list;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((xd50) it2.next()).a.Fb());
                    }
                    arrayList2.addAll(j5g.E0(arrayList3, arrayList4));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list) {
                    if (((xd50) obj2).a.B()) {
                        arrayList5.add(obj2);
                    }
                }
                ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((xd50) it3.next()).a.Fb());
                }
                arrayList2.addAll(arrayList6);
                izsVar.invoke(arrayList2);
                izsVar2.invoke(list);
                return s3q0.a;
            case 4:
                o2c0 o2c0Var = (o2c0) this.c;
                Photo photo = (Photo) this.d;
                PostingState postingState = (PostingState) this.e;
                List<PhotoTag> list3 = (List) obj;
                o2c0Var.a.a(new ajc0(photo, list3));
                o2c0Var.i(postingState, list3);
                o2c0Var.h(postingState, !list3.isEmpty());
                return s3q0.a;
            case 5:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                StickersDictionaryItem stickersDictionaryItem = (StickersDictionaryItem) this.d;
                ref$ObjectRef.element = j5g.D0(new q6e0((ArrayList) this.e), j5g.u0((List) obj, (Collection) ref$ObjectRef.element));
                L.d(new hk70(ref$ObjectRef, 13));
                StickersDictionaryItem stickersDictionaryItem2 = new StickersDictionaryItem(stickersDictionaryItem.b, stickersDictionaryItem.c, (List) ref$ObjectRef.element, stickersDictionaryItem.e, stickersDictionaryItem.f);
                stickersDictionaryItem2.g = stickersDictionaryItem.g;
                stickersDictionaryItem2.h = stickersDictionaryItem.h;
                return stickersDictionaryItem2;
            case 6:
                Ref$LongRef ref$LongRef = (Ref$LongRef) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                d0g0 d0g0Var = (d0g0) this.e;
                long longValue = ((Long) obj).longValue();
                long j = ref$LongRef.element;
                if (j == 0) {
                    ref$LongRef.element = longValue;
                } else {
                    ref$FloatRef.element = d0g0Var.a(d0g0Var.b, longValue - j);
                }
                return s3q0.a;
            case 7:
                ((huh0) this.c).e.W((Context) this.d, (MusicTrack) this.e, true, (List) obj);
                return s3q0.a;
            case 8:
                UserId userId = (UserId) this.c;
                zgm0 zgm0Var = (zgm0) this.d;
                UserId userId2 = (UserId) this.e;
                Set set = (Set) obj;
                if (!set.contains(userId)) {
                    set = j5g.R0(set);
                    set.add(userId);
                }
                return zgm0Var.a(userId2, set);
            case 9:
                return nnq0.C((nnq0) this.c, (uu50) this.d, (ExtendedUserProfile) this.e, (List) obj);
            case 10:
                ifu0 ifu0Var = (ifu0) this.c;
                VkButton vkButton = (VkButton) this.d;
                Button button = (Button) this.e;
                ifu0.a aVar3 = ifu0Var.f1;
                if (aVar3 != null) {
                    v2y v2yVar = aVar3.e;
                    w2y w2yVar = v2yVar.a;
                    Activity activity = v2yVar.b;
                    long j2 = v2yVar.c;
                    long j3 = v2yVar.d;
                    co0 co0Var = v2yVar.e;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type", "app_action");
                    jSONObject.put("app_id", j3);
                    jSONObject.put("title", co0Var.b);
                    jSONObject.put("hash", co0Var.e);
                    jSONObject.put("icon_id", co0Var.c);
                    jSONObject.put("description", co0Var.d);
                    String jSONObject2 = jSONObject.toString();
                    boolean z = v2yVar.f;
                    ifu0 ifu0Var2 = v2yVar.g;
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = vdx0Var.l().b(j2, jSONObject2).subscribe(new n3t(new kwb(w2yVar, ifu0Var2, z, activity), 6), new pf1(new u2y(w2yVar, ifu0Var2, activity, 0), 23));
                    fvv0 fvv0Var = w2yVar.b;
                    up2.j(subscribe, fvv0Var != null ? fvv0Var.getView() : null);
                }
                vkButton.setLoading(true);
                button.setEnabled(false);
                return s3q0.a;
            default:
                mov0 mov0Var = (mov0) this.c;
                mfu0 mfu0Var = mov0Var.c;
                JsApiMethodType jsApiMethodType = (JsApiMethodType) this.d;
                gzs gzsVar = (gzs) this.e;
                Throwable th = (Throwable) obj;
                boolean z2 = th instanceof VKApiExecutionException;
                if (z2 && ((VKApiExecutionException) th).s() == 504) {
                    new dw20.b(((ggu0) mov0Var.f.c).b, null).M(R.drawable.vk_icon_error_triangle_outline_56, Integer.valueOf(R.attr.vk_ui_text_accent)).v0(R.string.vk_subscription_not_enough_votes).r0(R.string.vk_subscriptions_try_again).T(R.string.vk_subscriptions_continue_playing, new jo60(25)).I0(null);
                }
                gzsVar.invoke();
                if (z2 && ((VKApiExecutionException) th).s() == 17) {
                    mfu0Var.m(jsApiMethodType, VkAppsErrors.Client.USER_DENIED, null, null);
                } else {
                    mfu0Var.j(jsApiMethodType, VkAppsErrors.b(th));
                }
                return s3q0.a;
        }
    }
}
