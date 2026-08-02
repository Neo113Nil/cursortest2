package xsna;

import com.google.gson.Gson;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.attaches.Attach;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.im.engine.models.attaches.AttachCall;
import com.vk.im.engine.models.attaches.AttachGroupCall;
import com.vk.log.L;
import com.vk.mediapicker.impl.presentation.mvi.MediaPickerMviState;
import com.vk.newsfeed.impl.posting.settings.mvi.PostingSettingsState;
import com.vk.newsfeed.impl.posting.settings.mvi.f;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.profile.design.view.fab.ProfileFabView;
import com.vk.translate.impl.views.TranslateFailedView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import ru.ok.android.webrtc.utils.retry.RetryKt;
import xsna.h3v;
import xsna.plc0;
import xsna.tj50;
import xsna.yqc0;
import xsna.ywi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class c3v implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ c3v(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0108  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        plc0.d.a aVar;
        int i;
        plc0.a aVar2;
        switch (this.b) {
            case 0:
                tj50.a aVar3 = (tj50.a) obj;
                d3v d3vVar = d3v.b;
                ao8 ao8Var = ao8.d;
                return new h3v.a(aVar3.a(d3vVar, ao8Var), aVar3.a(e3v.b, ao8Var), aVar3.a(f3v.b, ao8Var));
            case 1:
                return MediaPickerMviState.a((MediaPickerMviState) obj, 0, null, false, null, MediaPickerMviState.Medias.Loading.b, 31);
            case 2:
                return Boolean.valueOf(((BaseBoolIntDto) obj) == BaseBoolIntDto.YES);
            case 3:
                Attach attach = (Attach) obj;
                return Boolean.valueOf((attach instanceof AttachCall) || (attach instanceof AttachGroupCall));
            case 4:
                List<AudioAudioDto> d = ((AudioGetResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList.add(oc4.d((AudioAudioDto) it.next()));
                }
                return arrayList;
            case 5:
                List<AudioAudioDto> d2 = ((AudioGetResponseDto) obj).d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d2, 10));
                Iterator<T> it2 = d2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(oc4.d((AudioAudioDto) it2.next()));
                }
                return arrayList2;
            case 6:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 7:
                return ((id50) obj).e;
            case 8:
                return s3q0.a;
            case 9:
                return new Photo(new JSONObject(new Gson().toJson((PhotosPhotoDto) j5g.Y((List) obj))));
            case 10:
                bn40.g("audio.getRecommendations", new Object[0]);
                return s3q0.a;
            case 11:
                com.vk.metrics.eventtracking.b.a.a(new IllegalArgumentException("Can not load posting draft", (Throwable) obj));
                return s3q0.a;
            case 12:
                return ((PostingState.Editing) obj).c.b.b;
            case 13:
                PostingSettingsState postingSettingsState = (PostingSettingsState) obj;
                ListBuilder e = e43.e();
                boolean z = postingSettingsState.c;
                boolean z2 = postingSettingsState.e;
                boolean z3 = postingSettingsState.m;
                PostingSettingsState.b bVar = postingSettingsState.i;
                plc0.d.c cVar = null;
                plc0.d.b bVar2 = (!z || postingSettingsState.d) ? null : new plc0.d.b(postingSettingsState.n.b);
                if (bVar2 != null) {
                    e.add(bVar2);
                }
                PostingSettingsState.CommentsGlobalState commentsGlobalState = bVar.b;
                int[] iArr = f.a.$EnumSwitchMapping$0;
                int i2 = iArr[commentsGlobalState.ordinal()];
                if (i2 != 1 && i2 != 2) {
                    if (i2 == 3) {
                        aVar = null;
                        if (aVar != null) {
                            e.add(aVar);
                        }
                        i = iArr[bVar.b.ordinal()];
                        if (i != 1) {
                            aVar2 = new plc0.a(false);
                        } else if (i == 2) {
                            aVar2 = new plc0.a(true);
                        } else {
                            if (i != 3 && i != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = null;
                        }
                        if (aVar2 != null) {
                            e.add(aVar2);
                        }
                        if (!z3 && (!postingSettingsState.b || !z2)) {
                            cVar = new plc0.d.c(postingSettingsState.j.b);
                        }
                        if (cVar != null) {
                            e.add(cVar);
                        }
                        ListBuilder e2 = e43.e();
                        if (!z2) {
                            PostingSettingsState.f fVar = postingSettingsState.k;
                            if (fVar.b && (fVar.c || !z3)) {
                                e2.add(new plc0.b.c(fVar.d));
                            }
                        }
                        e.addAll(e2.g());
                        ListBuilder e3 = e43.e();
                        if (postingSettingsState.f) {
                            e3.add(new plc0.b.C3517b(postingSettingsState.l.b));
                            e3.add(plc0.c.b);
                        }
                        if (!BuildInfo.t()) {
                            Boolean bool = postingSettingsState.o.c;
                            e3.add(new plc0.b.a(bool != null ? bool.booleanValue() : false));
                        }
                        e.addAll(e3.g());
                        return e.g();
                    }
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                aVar = new plc0.d.a(bVar.c, bVar.d);
                if (aVar != null) {
                }
                i = iArr[bVar.b.ordinal()];
                if (i != 1) {
                }
                if (aVar2 != null) {
                }
                if (!z3) {
                    cVar = new plc0.d.c(postingSettingsState.j.b);
                }
                if (cVar != null) {
                }
                ListBuilder e22 = e43.e();
                if (!z2) {
                }
                e.addAll(e22.g());
                ListBuilder e32 = e43.e();
                if (postingSettingsState.f) {
                }
                if (!BuildInfo.t()) {
                }
                e.addAll(e32.g());
                return e.g();
            case 14:
                return new yqc0.b(((tj50.a) obj).e(new k990(9)));
            case 15:
                return ((rdd0) obj).b;
            case 16:
                qgi0.r((tgi0) obj, "product_card_top_bar_cart");
                return s3q0.a;
            case 17:
                return Integer.valueOf(((kd10) obj).a);
            case 18:
                int i3 = ProfileFabView.r;
                return s3q0.a;
            case 19:
                return Float.valueOf(((hfk) obj).getX1());
            case 20:
                return RetryKt.d((Throwable) obj);
            case 21:
                return s3q0.a;
            case 22:
                int i4 = gbi0.o1;
                return s3q0.a;
            case 23:
                return ywi0.h.a;
            case 24:
                return Boolean.valueOf(!((StickerStockItem) obj).h);
            case 25:
                qgi0.r((tgi0) obj, "storefront_top_bar_bookmarks_icon");
                return s3q0.a;
            case 26:
                L.i((Throwable) obj);
                return s3q0.a;
            case 27:
                Throwable th = (Throwable) obj;
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                return s3q0.a;
            case 28:
                com.vk.superapp.ui.a.S1().d((List) obj);
                return s3q0.a;
            default:
                int i5 = TranslateFailedView.f;
                return s3q0.a;
        }
    }

    public /* synthetic */ c3v(Object obj, int i) {
        this.b = i;
    }
}
