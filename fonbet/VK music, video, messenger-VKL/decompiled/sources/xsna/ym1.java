package xsna;

import android.graphics.Rect;
import android.net.Uri;
import android.util.SparseArray;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.audio.dto.AudioPreviewSnippetDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.auth.main.AuthModel;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.Thumb;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ObtainVerificationFragment;
import com.vk.log.L;
import com.vk.music.snippet.api.domain.model.SnippetSectionTypeEntity;
import com.vk.photos.root.albums.presentation.AlbumsSkeletonView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import ru.ok.gleffects.EffectRegistry;
import xsna.bi10;
import xsna.xn50;
import xsna.zcr0;

/* compiled from: AlbumsFragment.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class ym1 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ym1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        String c;
        int i = 10;
        Object obj3 = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                ((AlbumsSkeletonView) this.receiver).setIsShowHeader(((Boolean) obj).booleanValue());
                return s3q0.a;
            case 1:
                ((kx4) this.receiver).getClass();
                List<AudioPreviewSnippetDto> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AudioPreviewSnippetDto audioPreviewSnippetDto : list) {
                    Iterator<E> it = SnippetSectionTypeEntity.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((SnippetSectionTypeEntity) obj2).i(), audioPreviewSnippetDto.j().i())) {
                            }
                        } else {
                            obj2 = obj3;
                        }
                    }
                    SnippetSectionTypeEntity snippetSectionTypeEntity = (SnippetSectionTypeEntity) obj2;
                    if (snippetSectionTypeEntity == null) {
                        snippetSectionTypeEntity = SnippetSectionTypeEntity.DEFAULT;
                    }
                    SnippetSectionTypeEntity snippetSectionTypeEntity2 = snippetSectionTypeEntity;
                    String title = audioPreviewSnippetDto.getTitle();
                    String i3 = audioPreviewSnippetDto.i();
                    SparseArray sparseArray = new SparseArray(i2);
                    sparseArray.put(300, Uri.parse(audioPreviewSnippetDto.f()));
                    s3q0 s3q0Var = s3q0.a;
                    Thumb thumb = new Thumb((SparseArray<Uri>) sparseArray);
                    String g = audioPreviewSnippetDto.g();
                    List<AudioAudioDto> e = audioPreviewSnippetDto.e();
                    ArrayList arrayList2 = new ArrayList(c5g.u(e, i));
                    Iterator<T> it2 = e.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new wbk0(r9.c0, oc4.d((AudioAudioDto) it2.next())));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        if (!((wbk0) next).c.B()) {
                            arrayList3.add(next);
                        }
                    }
                    arrayList.add(new ock0(snippetSectionTypeEntity2, title, i3, thumb, g, arrayList3, audioPreviewSnippetDto.d(), audioPreviewSnippetDto.r()));
                    i = 10;
                    obj3 = null;
                    i2 = 1;
                }
                return arrayList;
            case 2:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                ((c4e) this.receiver).getClass();
                return c4e.a((ShortVideoPlaylistFullDto) obj);
            case 5:
                L.i((Throwable) obj);
                return s3q0.a;
            case 6:
                ((pa9) this.receiver).a(((Number) obj).floatValue());
                return s3q0.a;
            case 7:
                ((sg10) this.receiver).getClass();
                List<Mask> list2 = (List) obj;
                ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                for (Mask mask : list2) {
                    List<k9x> list3 = pw70.a;
                    EffectRegistry.EffectId b = pw70.b(mask.d);
                    arrayList4.add(new bi10.d(mask, null, b == EffectRegistry.EffectId.SPHERE_IMAGE0 || b == EffectRegistry.EffectId.SPHERE_VIDEO0));
                }
                return new ArrayList(arrayList4);
            case 8:
                ((io.reactivex.rxjava3.core.r) this.receiver).onNext((List) obj);
                return s3q0.a;
            case 9:
                ((com.vk.im.ui.components.msg_list.c) this.receiver).i((Throwable) obj);
                return s3q0.a;
            case 10:
                ObtainVerificationFragment obtainVerificationFragment = (ObtainVerificationFragment) this.receiver;
                obtainVerificationFragment.getClass();
                xn50.a.c(obtainVerificationFragment, (mr70) obj);
                return s3q0.a;
            case 11:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 12:
                hem0 hem0Var = (hem0) this.receiver;
                hem0Var.getClass();
                xn50.a.c(hem0Var, (aem0) obj);
                return s3q0.a;
            case 13:
                ((zcr0) this.receiver).getClass();
                e8f0 e8f0Var = new e8f0(mq9.d(((okhttp3.v) obj).byteStream()));
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    while (true) {
                        vl8 vl8Var = e8f0Var.c;
                        long b2 = e8f0Var.b((byte) 10, 0L, Long.MAX_VALUE);
                        if (b2 == -1) {
                            long j = vl8Var.c;
                            c = j != 0 ? e8f0Var.Q2(j) : null;
                        } else {
                            c = b.c(vl8Var, b2);
                        }
                        if (c == null) {
                            vni0 vni0Var = new vni0(zcr0.a("version", linkedHashMap), Integer.parseInt(zcr0.a("number", linkedHashMap)), zcr0.a("path", linkedHashMap), zcr0.a("sha512", linkedHashMap));
                            e8f0Var.close();
                            return vni0Var;
                        }
                        List c0 = drm0.c0(c, new String[]{": "}, 0, 6);
                        if (c0.size() == 2 && ((CharSequence) c0.get(0)).length() != 0 && ((CharSequence) c0.get(1)).length() != 0) {
                            linkedHashMap.put(c0.get(0), c0.get(1));
                        }
                    }
                    throw new zcr0.a("Unable to parse the response: " + c);
                } finally {
                }
            case 14:
                ((io.reactivex.rxjava3.subjects.d) this.receiver).onNext((Rect) obj);
                return s3q0.a;
            default:
                return ((AuthModel) this.receiver).l((String) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym1(Object obj, int i) {
        super(1, obj, AlbumsSkeletonView.class, "setIsShowHeader", "setIsShowHeader(Z)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, kx4.class, "mapSections", "mapSections(Ljava/util/List;)Ljava/util/List;", 0);
                break;
            case 2:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 4:
                super(1, obj, c4e.class, "mapPlaylist", "mapPlaylist(Lcom/vk/api/generated/shortVideo/dto/ShortVideoPlaylistFullDto;)Lcom/vk/clips/favorites/api/model/ClipsFavoriteFolder;", 0);
                break;
            case 5:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 6:
                super(1, obj, pa9.class, "onAnimatePrimaryButtons", "onAnimatePrimaryButtons(F)V", 0);
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            default:
                break;
            case 11:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 13:
                super(1, obj, zcr0.class, "parseLatestResponse", "parseLatestResponse(Lokhttp3/ResponseBody;)Lcom/vk/update/internal/ServerUpdateInfo;", 0);
                break;
            case 14:
                super(1, obj, io.reactivex.rxjava3.subjects.d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
                break;
        }
    }
}
