package xsna;

import android.content.Context;
import android.location.Location;
import com.facebook.soloader.MinElf;
import com.vk.api.generated.shortVideo.dto.ShortVideoTemplateAudioFragmentDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoTemplateFragmentDto;
import com.vk.clips.editor.templates.impl.domain.ClipsVideoTemplateEditorInputModel;
import com.vk.clips.editor.templates.impl.domain.ShortVideoTemplateFragment;
import com.vk.core.network.metrics.traffic.TrafficItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.android.commons.http.Http;
import xsna.hm3;
import xsna.o0r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yl3 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yl3(ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel, ShortVideoTemplateAudioFragmentDto shortVideoTemplateAudioFragmentDto, List list) {
        this.b = 1;
        this.d = clipsVideoTemplateEditorInputModel;
        this.e = shortVideoTemplateAudioFragmentDto;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        TrafficItem.ContentType contentType;
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                ((nvy) obj).e(list.size(), new em3(new pe1(2), list), new fm3(list, 0), new jai(802480018, new gm3(list, (hm3.a) this.d, (hm3) this.e, 0), true));
                return s3q0.a;
            case 1:
                ClipsVideoTemplateEditorInputModel clipsVideoTemplateEditorInputModel = (ClipsVideoTemplateEditorInputModel) this.d;
                ShortVideoTemplateAudioFragmentDto shortVideoTemplateAudioFragmentDto = (ShortVideoTemplateAudioFragmentDto) this.e;
                List list2 = (List) this.c;
                String str = clipsVideoTemplateEditorInputModel.b;
                ClipVideoFile clipVideoFile = clipsVideoTemplateEditorInputModel.c;
                dc50 dc50Var = new dc50((MusicTrack) obj, shortVideoTemplateAudioFragmentDto.d(), (shortVideoTemplateAudioFragmentDto.e() + shortVideoTemplateAudioFragmentDto.d()) - shortVideoTemplateAudioFragmentDto.f(), shortVideoTemplateAudioFragmentDto.f());
                List list3 = list2;
                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                int i = 0;
                for (Object obj2 : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    ShortVideoTemplateFragmentDto shortVideoTemplateFragmentDto = (ShortVideoTemplateFragmentDto) obj2;
                    arrayList.add(new n7f(i, new ShortVideoTemplateFragment(shortVideoTemplateFragmentDto.e(), shortVideoTemplateFragmentDto.d()), null, null, null));
                    i = i2;
                }
                return new z7f(str, clipVideoFile, dc50Var, arrayList, null, null, jgp.b, clipsVideoTemplateEditorInputModel.f, clipsVideoTemplateEditorInputModel.g);
            case 2:
                ((o0r0) ((ynh) this.c).M0.getValue()).m((Context) this.d, ((ExtendedUserProfile.Contact) this.e).b.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                return s3q0.a;
            case 3:
                r9e0 r9e0Var = (r9e0) this.c;
                okhttp3.d dVar = (okhttp3.d) this.d;
                okhttp3.u uVar = (okhttp3.u) this.e;
                Iterator<f360> it = r9e0Var.d.iterator();
                while (it.hasNext()) {
                    it.next().o(dVar, uVar);
                }
                y560 y560Var = r9e0Var.c;
                okhttp3.p request = dVar.request();
                y560Var.getClass();
                okhttp3.k kVar = uVar.g;
                String a = kVar.a(Http.Header.CONTENT_LENGTH);
                String a2 = kVar.a("Content-Type");
                TrafficItem.ContentType contentType2 = a2 == null ? drm0.D(request.a.d, "mail.ru", false) ? TrafficItem.ContentType.THIRD_PARTY_MAIL : TrafficItem.ContentType.EMPTY : drm0.D(a2, "application/", true) ? TrafficItem.ContentType.CONTENT_JSON : drm0.D(a2, "image/", true) ? TrafficItem.ContentType.CONTENT_IMAGE : drm0.D(a2, "video/", true) ? TrafficItem.ContentType.CONTENT_VIDEO : drm0.D(a2, "audio/", true) ? TrafficItem.ContentType.CONTENT_AUDIO : TrafficItem.ContentType.CONTENT_UNKNOWN;
                TrafficItem trafficItem = y560Var.b.get(request);
                if (trafficItem != null) {
                    long parseLong = a != null ? Long.parseLong(a) : 0L;
                    trafficItem.a = contentType2;
                    trafficItem.b = parseLong;
                }
                if (trafficItem != null && ((contentType = trafficItem.a) == TrafficItem.ContentType.CONTENT_AUDIO || contentType == TrafficItem.ContentType.CONTENT_VIDEO)) {
                    y560Var.a().h(trafficItem.d);
                }
                return s3q0.a;
            case 4:
                UserId userId = (UserId) this.c;
                zgm0 zgm0Var = (zgm0) this.d;
                UserId userId2 = (UserId) this.e;
                Set set = (Set) obj;
                if (set.contains(userId)) {
                    set = j5g.R0(set);
                    set.remove(userId);
                }
                return zgm0Var.a(userId2, set);
            case 5:
                wh50 wh50Var = (wh50) this.c;
                wh50 wh50Var2 = (wh50) this.d;
                wh50 wh50Var3 = (wh50) this.e;
                tny tnyVar = (tny) obj;
                tny b0 = tnyVar.b0();
                wh50Var.setValue(new h9x(b0 != null ? pli.n(b0.a()) : 0L));
                wh50Var2.setValue(jgz.i(tnyVar));
                wh50Var3.setValue(new ov70(((zhf0) wh50Var2.getValue()).c()));
                return s3q0.a;
            default:
                Integer num = (Integer) this.c;
                d9r0 d9r0Var = (d9r0) this.d;
                Integer num2 = (Integer) this.e;
                it80 it80Var = (it80) obj;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                Location location = (Location) it80Var.a;
                s7n0 b = bbq.b();
                return d.s(location, b != null ? b.d() : null, num != null ? num.intValue() : 25, num2, (List) d9r0Var.d.getValue(), d9r0Var.b);
        }
    }

    public /* synthetic */ yl3(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
