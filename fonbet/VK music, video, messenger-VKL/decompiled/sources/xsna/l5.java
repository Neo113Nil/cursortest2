package xsna;

import android.graphics.Bitmap;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoStaticSectionItemsDto;
import com.vk.catalog.mvi.block.CatalogBlockState;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.clips.favorites.impl.ui.folders.picker.f;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.newsfeed.Owner;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.instantjobs.InstantJob;
import com.vk.log.L;
import com.vk.music.player.error.VkPlayerException;
import com.vk.video.ui.albums.fragments.AbsVideoListFragment;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.ai8;
import xsna.bo0;
import xsna.ixe;
import xsna.pec;
import xsna.pw3;
import xsna.r5;
import xsna.tj50;
import xsna.uu;
import xsna.wk50;
import xsna.xf8;
import xsna.zh8;
import xsna.zn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l5 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r1.k1() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r1.k1() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        if (r1 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b3, code lost:
    
        if ((r1 instanceof xsna.uxr0) != false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        int i;
        Owner s;
        int i2 = this.b;
        r3 = null;
        UserId userId = null;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                L.i((Throwable) obj);
                ((r5.a) obj2).h.b(false);
                return s3q0.a;
            case 1:
                AbsVideoListFragment.e eVar = (AbsVideoListFragment.e) obj2;
                io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar2 = eVar.u;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                eVar.u = cVar;
                return s3q0.a;
            case 2:
                hx2<T> hx2Var = ((jx2) obj2).f;
                if (hx2Var != 0) {
                    hx2Var.b(obj);
                }
                return s3q0.a;
            case 3:
                ow3 ow3Var = (ow3) obj2;
                if (ow3Var.j) {
                    ow3Var.g.onNext(pw3.a.a);
                }
                ow3Var.b.invoke();
                return s3q0.a;
            case 4:
                return new UIBlockAudioBookPerson(((bi20) obj2).b(), (AudioBookPerson) obj, null, 4, null);
            case 5:
                jr4 jr4Var = (jr4) obj2;
                Float f = (Float) obj;
                rr4 rr4Var = jr4Var.s;
                if (rr4Var != null) {
                    float floatValue = f.floatValue();
                    ur4 ur4Var = jr4Var.n.b.P0().a;
                    rr4Var.f(floatValue, ur4Var != null ? Integer.valueOf(ur4Var.g) : null);
                }
                return s3q0.a;
            case 6:
                ((com.vk.music.player.a) obj2).e = ((Throwable) obj) instanceof VkPlayerException.NoVkMixException;
                return s3q0.a;
            case 7:
                ((ta6) obj2).K.a((String) obj, true);
                return s3q0.a;
            case 8:
                di10 di10Var = ((com.vk.content.design.view.camera.a) obj2).e;
                if (di10Var != null) {
                    di10Var.w(Boolean.FALSE);
                }
                return s3q0.a;
            case 9:
                ((wk50.a) obj2).b(new ClipItemPatch.ActionButton.b(new uu.a((Bitmap) obj)));
                return s3q0.a;
            case 10:
                n47 n47Var = (n47) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof KeyPermanentlyInvalidatedException)) {
                    while (gz80.a(33) && th != null) {
                        if (!lr0.d(th)) {
                            th = th.getCause();
                        }
                    }
                    n47Var.pm();
                    return s3q0.a;
                }
                n47Var.zg();
                return s3q0.a;
            case 11:
                ((wf8) obj2).d(xf8.d.a);
                return s3q0.a;
            case 12:
                yh8 yh8Var = (yh8) obj2;
                ai8 ai8Var = yh8Var.q;
                ai8.a aVar = ai8Var instanceof ai8.a ? (ai8.a) ai8Var : null;
                zh8.b bVar = new zh8.b(aVar != null && aVar.d);
                if (yh8Var.s) {
                    yh8Var.p.onNext(bVar);
                }
                return s3q0.a;
            case 13:
                ((aq8) obj2).n.invoke();
                return s3q0.a;
            case 14:
                m99 m99Var = (m99) obj2;
                m99Var.f(s99.a(m99Var.j(), null, null, null, null, null, null, new bo0.c(Collections.singleton(new zn0.b((whr0) obj)), EmptySet.b), false, 191));
                return s3q0.a;
            case 15:
                ((fg9) obj2).m.P0();
                return s3q0.a;
            case 16:
                return (CatalogBlockState) obj2;
            case 17:
                int i3 = rec.j1;
                ((rec) obj2).getFeature().C(new pec.c((String) obj));
                return s3q0.a;
            case 18:
                ((ClassifiedsCatalogSimpleRootVh) obj2).z.d();
                return s3q0.a;
            case 19:
                ((w6d) obj2).e.a(w5d.b);
                return s3q0.a;
            case 20:
                Integer num = (Integer) obj;
                num.getClass();
                w35 w35Var = ((bbd) obj2).d;
                if (w35Var != null) {
                    w35Var.invoke(num);
                }
                return s3q0.a;
            case 21:
                L.e("TemplateFlow", "clipsDelegate success");
                ((jpd) obj2).c.O(-1, null, false);
                return s3q0.a;
            case 22:
                InstantJob instantJob = (InstantJob) obj;
                return Boolean.valueOf((instantJob instanceof brc) && ((brc) instantJob).b() == ((brc) obj2).b());
            case 23:
                rxd rxdVar = (rxd) obj2;
                rxdVar.d.onNext(Boolean.FALSE);
                rxdVar.d.onComplete();
                L.g("ClipsEditorDraftLoadingInteractor", (Throwable) obj);
                return s3q0.a;
            case 24:
                return new f.c(((tj50.a) obj).a(new com.vk.clips.favorites.impl.ui.folders.picker.d(1, ((com.vk.clips.favorites.impl.ui.folders.picker.e) obj2).e, n4e.class, "toViewState", "toViewState(Lcom/vk/clips/favorites/impl/ui/folders/picker/ClipsFavoritesFoldersPickerState;)Lcom/vk/clips/favorites/impl/ui/folders/picker/ClipsFavoritesFoldersPickerViewState$BottomSheet;", 0), ao8.d));
            case 25:
                cye cyeVar = (cye) obj2;
                List<BaseImageDto> e = ((ShortVideoStaticSectionItemsDto) obj).e();
                if (e == null) {
                    e = EmptyList.b;
                }
                cyeVar.C(new ixe.q(e));
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((cbg) obj).a.getId() == ((lfg) obj2).b6());
            case 27:
                kjh kjhVar = (kjh) obj2;
                UserId userId2 = kjhVar.a;
                bwr0 bwr0Var = (bwr0) obj;
                if (!(bwr0Var instanceof wxr0)) {
                    if (!(bwr0Var instanceof fyr0)) {
                        if (!(bwr0Var instanceof cwr0)) {
                            break;
                        } else {
                            VideoFile videoFile = ((cwr0) bwr0Var).a;
                            if (kjhVar.r(videoFile)) {
                                if (videoFile != null && (s = videoFile.s()) != null) {
                                    userId = s.b;
                                }
                                if (epx.f(userId, userId2)) {
                                    if (videoFile == null) {
                                        i = 0;
                                        break;
                                    } else {
                                        i = videoFile.k1();
                                        break;
                                    }
                                }
                            }
                            r4 = false;
                        }
                    } else {
                        VideoFile videoFile2 = ((fyr0) bwr0Var).a;
                        if (kjhVar.r(videoFile2)) {
                            Owner s2 = videoFile2.s();
                            if (epx.f(s2 != null ? s2.b : null, userId2)) {
                                if (!videoFile2.v()) {
                                    break;
                                }
                            }
                        }
                        r4 = false;
                    }
                } else {
                    VideoFile videoFile3 = ((wxr0) bwr0Var).a;
                    if (kjhVar.r(videoFile3)) {
                        Owner s3 = videoFile3.s();
                        if (epx.f(s3 != null ? s3.b : null, userId2)) {
                            break;
                        }
                    }
                    r4 = false;
                }
                return Boolean.valueOf(r4);
            case 28:
                o4g0 o4g0Var = (o4g0) obj;
                e2g0 e2g0Var = ((CommunityRepliesFragment) obj2).Z;
                if (e2g0Var != null) {
                    e2g0Var.p(o4g0Var.c(), o4g0Var.d(), o4g0Var.a(), o4g0Var.b());
                }
                return s3q0.a;
            default:
                return new n2j((ViewGroup) obj, (nvg) obj2);
        }
    }

    public /* synthetic */ l5(y97 y97Var, n47 n47Var) {
        this.b = 10;
        this.c = n47Var;
    }
}
