package xsna;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.stories.model.template.MemoriesIsNewMemoriesAvailableData;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.mediapicker.impl.presentation.MediaPickerActivity;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.superapp.api.dto.group.WebGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.webrtc.RTCStatsCollectorCallback;
import org.webrtc.RTCStatsReport;
import ru.ok.android.externcalls.sdk.audio.AdaptersKt;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.webrtc.topology.StatsCallback;
import xsna.i340;
import xsna.l3s;
import xsna.lbf;
import xsna.mjm0;
import xsna.p810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class zj0 implements io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.l, zm, io.reactivex.rxjava3.functions.b, pcs, RTCStatsCollectorCallback, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zm
    public boolean a(View view) {
        return ((qh7) this.c).W6(view);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((x7c) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List loadAlbums$lambda$8;
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.e) ((s53) this.c).invoke(obj);
            case 2:
            case 5:
            case 7:
            case 17:
            case 21:
            case 22:
            case 24:
            default:
                return (MemoriesIsNewMemoriesAvailableData) ((mjm0.b) this.c).invoke(obj);
            case 3:
                return (ChannelMsgSendConfig) ((d40) this.c).invoke(obj);
            case 4:
                return (q14) ((vr0) this.c).invoke(obj);
            case 6:
                return (qih0) ((vr0) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((vr0) this.c).invoke(obj);
            case 9:
                return (Photo) ((vr0) this.c).invoke(obj);
            case 10:
                return (String) ((izs) this.c).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.t) ((dam) this.c).invoke(obj);
            case 12:
                return (ipq) ((fpq) this.c).invoke(obj);
            case 13:
                return (l3s.e.b) ((dam) this.c).invoke(obj);
            case 14:
                return (WebGroup) ((ve0) this.c).invoke(obj);
            case 15:
                loadAlbums$lambda$8 = LocalGalleryProvider.loadAlbums$lambda$8((quz) this.c, obj);
                return loadAlbums$lambda$8;
            case 16:
                return (p810.c) ((defpackage.y) this.c).invoke(obj);
            case 18:
                return (i340.e) ((defpackage.y) this.c).invoke(obj);
            case 19:
                return (NewsEntry) ((dm60) this.c).invoke(obj);
            case 20:
                return (io.reactivex.rxjava3.core.b0) ((qa90) this.c).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((defpackage.y) this.c).invoke(obj);
            case 25:
                return (Boolean) ((dam) this.c).invoke(obj);
            case 26:
                return (String) ((rj60) this.c).invoke(obj);
            case 27:
                return (List) ((rj60) this.c).invoke(obj);
            case 28:
                return (List) ((rj60) this.c).invoke(obj);
        }
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (com.vk.newsfeed.api.posting.author.a) ((adc0) this.c).invoke(obj, obj2, obj3);
    }

    @Override // org.webrtc.RTCStatsCollectorCallback
    public void onStatsDelivered(RTCStatsReport rTCStatsReport) {
        ((StatsCallback) this.c).onStatsReady(new StatsCallback.Stats(rTCStatsReport));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        ?? r2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 7:
                hjf hjfVar = (hjf) obj;
                ArrayList<ClipsCoauthorSelectorUserItem> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("co_result", ClipsCoauthorSelectorUserItem.class) : bundle.getParcelableArrayList("co_result");
                if (parcelableArrayList != null) {
                    r2 = new ArrayList(c5g.u(parcelableArrayList, 10));
                    for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : parcelableArrayList) {
                        UserId userId = clipsCoauthorSelectorUserItem.b;
                        CoOwnerItem.StatusDto statusDto = CoOwnerItem.StatusDto.APPROVED;
                        UserId userId2 = clipsCoauthorSelectorUserItem.b;
                        String d = clipsCoauthorSelectorUserItem.d();
                        String str2 = clipsCoauthorSelectorUserItem.e;
                        Serializer.c<Image> cVar = Image.CREATOR;
                        r2.add(new CoOwnerItem(userId, statusDto, new Owner(userId2, d, str2, null, null, Image.b.c(str2, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194264, null), false, null));
                    }
                } else {
                    r2 = 0;
                }
                if (r2 == 0) {
                    r2 = EmptyList.b;
                }
                hjfVar.b(new lbf.c.e.C3252c(r2));
                break;
            default:
                MediaPickerActivity mediaPickerActivity = (MediaPickerActivity) obj;
                int i2 = MediaPickerActivity.h;
                if (bundle.containsKey("media_picker_selected")) {
                    ArrayList<? extends Parcelable> parcelableArrayList2 = bundle.getParcelableArrayList("media_picker_selected");
                    Intent intent = new Intent();
                    intent.putParcelableArrayListExtra("media_picker_selected", parcelableArrayList2);
                    mediaPickerActivity.setResult(-1, intent);
                    mediaPickerActivity.finish();
                    break;
                } else if (bundle.containsKey("media_picker_cancelled")) {
                    mediaPickerActivity.setResult(0);
                    mediaPickerActivity.finish();
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        AdaptersKt.observeAvailableAudioDevices$lambda$9((CallsAudioManager) this.c, rVar);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (List) ((bt3) this.c).invoke(obj, obj2);
    }
}
